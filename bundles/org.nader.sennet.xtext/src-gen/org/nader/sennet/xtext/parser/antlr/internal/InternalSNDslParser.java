package org.nader.sennet.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.nader.sennet.xtext.services.SNDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSNDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'WSNapp'", "'{'", "'id'", "'network'", "'jobs'", "','", "'}'", "'-'", "'SinkNode'", "'position'", "'ports'", "'('", "')'", "'sensors'", "'FlatNetwork'", "'nbOfNodes'", "'interNodeComm'", "'routingProtocol'", "'sink'", "'nodes'", "'ClusteredNetwork'", "'clusters'", "'AccelerometerSensor'", "'LightSensor'", "'LocationSensor'", "'MicrophoneSensor'", "'TemperatureSensor'", "'PressureSensor'", "'HumiditySensor'", "'ChemicalSensor'", "'UsbPort'", "'SerialPort'", "'OutPort'", "'InPort'", "'Transmitter'", "'Reciever'", "'SensorNode'", "'ComputationNode'", "'Cluster'", "'resources'", "'head'", "'ClusterHeadNode'", "'ContinuousJob'", "'action'", "'EventDrivenJob'", "'eventCondition'", "'PeriodicJob'", "'timer'", "'RequestReplayJob'", "'SenseForwardAction'", "'sinkNode'", "'targetNode'", "'AggregationAction'", "'aggregation'", "'FusionAction'", "'fusion'", "'compuNode'", "'clusterHead'", "'ReadNodeMemoryAction'", "'WriteNodeMemoryAction'", "'SendMessageAction'", "'text'", "'outPort'", "'ReceiveMessageAction'", "'inPort'", "'LogicalCondition'", "'jobSchedule'", "'sensorTerm'", "'logicalSymbol'", "'value'", "'unit'", "'BT'", "'Zigbee'", "'WLan'", "'RF'", "'leach'", "'lqrp'", "'spin'", "'aodv'", "'dodv'", "'dsr'", "'dsdv'", "'gsr'", "'heed'", "'gaf'", "'gear'", "'tbf'", "'ead'", "'pegasis'", "'teen'", "'speed'", "'mobile'", "'static'", "'filtering'", "'compression'", "'max'", "'min'", "'avg'", "'count'", "'classification'", "'event_detection'", "'tracking'", "'decision_making'", "'start'", "'stop'", "'equal'", "'greaterThan'", "'greaterOrEqualThan'", "'lessThan'", "'lessOrEqualThan'", "'not'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=4;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSNDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSNDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSNDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g"; }



     	private SNDslGrammarAccess grammarAccess;
     	
        public InternalSNDslParser(TokenStream input, SNDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "WSNapp";	
       	}
       	
       	@Override
       	protected SNDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleWSNapp"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:68:1: entryRuleWSNapp returns [EObject current=null] : iv_ruleWSNapp= ruleWSNapp EOF ;
    public final EObject entryRuleWSNapp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWSNapp = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:69:2: (iv_ruleWSNapp= ruleWSNapp EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:70:2: iv_ruleWSNapp= ruleWSNapp EOF
            {
             newCompositeNode(grammarAccess.getWSNappRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWSNapp_in_entryRuleWSNapp75);
            iv_ruleWSNapp=ruleWSNapp();

            state._fsp--;

             current =iv_ruleWSNapp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWSNapp85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWSNapp"


    // $ANTLR start "ruleWSNapp"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:77:1: ruleWSNapp returns [EObject current=null] : ( () otherlv_1= 'WSNapp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'network' ( (lv_network_7_0= ruleAbstractNetwork ) ) )? (otherlv_8= 'jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleAbstractJob ) ) (otherlv_11= ',' ( (lv_jobs_12_0= ruleAbstractJob ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleWSNapp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        EObject lv_network_7_0 = null;

        EObject lv_jobs_10_0 = null;

        EObject lv_jobs_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:80:28: ( ( () otherlv_1= 'WSNapp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'network' ( (lv_network_7_0= ruleAbstractNetwork ) ) )? (otherlv_8= 'jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleAbstractJob ) ) (otherlv_11= ',' ( (lv_jobs_12_0= ruleAbstractJob ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:81:1: ( () otherlv_1= 'WSNapp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'network' ( (lv_network_7_0= ruleAbstractNetwork ) ) )? (otherlv_8= 'jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleAbstractJob ) ) (otherlv_11= ',' ( (lv_jobs_12_0= ruleAbstractJob ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:81:1: ( () otherlv_1= 'WSNapp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'network' ( (lv_network_7_0= ruleAbstractNetwork ) ) )? (otherlv_8= 'jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleAbstractJob ) ) (otherlv_11= ',' ( (lv_jobs_12_0= ruleAbstractJob ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:81:2: () otherlv_1= 'WSNapp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'network' ( (lv_network_7_0= ruleAbstractNetwork ) ) )? (otherlv_8= 'jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleAbstractJob ) ) (otherlv_11= ',' ( (lv_jobs_12_0= ruleAbstractJob ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:81:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWSNappAccess().getWSNappAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleWSNapp131); 

                	newLeafNode(otherlv_1, grammarAccess.getWSNappAccess().getWSNappKeyword_1());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:92:1: (lv_name_2_0= ruleEString )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWSNappAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWSNapp152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWSNappRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWSNapp164); 

                	newLeafNode(otherlv_3, grammarAccess.getWSNappAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:113:1: (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:113:3: otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWSNapp177); 

                        	newLeafNode(otherlv_4, grammarAccess.getWSNappAccess().getIdKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:117:1: ( (lv_id_5_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:118:1: (lv_id_5_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:118:1: (lv_id_5_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:119:3: lv_id_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getWSNappAccess().getIdEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleWSNapp198);
                    lv_id_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWSNappRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:135:4: (otherlv_6= 'network' ( (lv_network_7_0= ruleAbstractNetwork ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:135:6: otherlv_6= 'network' ( (lv_network_7_0= ruleAbstractNetwork ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleWSNapp213); 

                        	newLeafNode(otherlv_6, grammarAccess.getWSNappAccess().getNetworkKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:139:1: ( (lv_network_7_0= ruleAbstractNetwork ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:140:1: (lv_network_7_0= ruleAbstractNetwork )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:140:1: (lv_network_7_0= ruleAbstractNetwork )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:141:3: lv_network_7_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getWSNappAccess().getNetworkAbstractNetworkParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleWSNapp234);
                    lv_network_7_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWSNappRule());
                    	        }
                           		set(
                           			current, 
                           			"network",
                            		lv_network_7_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:157:4: (otherlv_8= 'jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleAbstractJob ) ) (otherlv_11= ',' ( (lv_jobs_12_0= ruleAbstractJob ) ) )* otherlv_13= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:157:6: otherlv_8= 'jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleAbstractJob ) ) (otherlv_11= ',' ( (lv_jobs_12_0= ruleAbstractJob ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWSNapp249); 

                        	newLeafNode(otherlv_8, grammarAccess.getWSNappAccess().getJobsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWSNapp261); 

                        	newLeafNode(otherlv_9, grammarAccess.getWSNappAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:165:1: ( (lv_jobs_10_0= ruleAbstractJob ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:166:1: (lv_jobs_10_0= ruleAbstractJob )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:166:1: (lv_jobs_10_0= ruleAbstractJob )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:167:3: lv_jobs_10_0= ruleAbstractJob
                    {
                     
                    	        newCompositeNode(grammarAccess.getWSNappAccess().getJobsAbstractJobParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractJob_in_ruleWSNapp282);
                    lv_jobs_10_0=ruleAbstractJob();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWSNappRule());
                    	        }
                           		add(
                           			current, 
                           			"jobs",
                            		lv_jobs_10_0, 
                            		"AbstractJob");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:183:2: (otherlv_11= ',' ( (lv_jobs_12_0= ruleAbstractJob ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:183:4: otherlv_11= ',' ( (lv_jobs_12_0= ruleAbstractJob ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleWSNapp295); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getWSNappAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:187:1: ( (lv_jobs_12_0= ruleAbstractJob ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:188:1: (lv_jobs_12_0= ruleAbstractJob )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:188:1: (lv_jobs_12_0= ruleAbstractJob )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:189:3: lv_jobs_12_0= ruleAbstractJob
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWSNappAccess().getJobsAbstractJobParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractJob_in_ruleWSNapp316);
                    	    lv_jobs_12_0=ruleAbstractJob();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWSNappRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobs",
                    	            		lv_jobs_12_0, 
                    	            		"AbstractJob");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWSNapp330); 

                        	newLeafNode(otherlv_13, grammarAccess.getWSNappAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWSNapp344); 

                	newLeafNode(otherlv_14, grammarAccess.getWSNappAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWSNapp"


    // $ANTLR start "entryRuleAbstractNetwork"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:221:1: entryRuleAbstractNetwork returns [EObject current=null] : iv_ruleAbstractNetwork= ruleAbstractNetwork EOF ;
    public final EObject entryRuleAbstractNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNetwork = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:222:2: (iv_ruleAbstractNetwork= ruleAbstractNetwork EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:223:2: iv_ruleAbstractNetwork= ruleAbstractNetwork EOF
            {
             newCompositeNode(grammarAccess.getAbstractNetworkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_entryRuleAbstractNetwork380);
            iv_ruleAbstractNetwork=ruleAbstractNetwork();

            state._fsp--;

             current =iv_ruleAbstractNetwork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNetwork390); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractNetwork"


    // $ANTLR start "ruleAbstractNetwork"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:230:1: ruleAbstractNetwork returns [EObject current=null] : (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork ) ;
    public final EObject ruleAbstractNetwork() throws RecognitionException {
        EObject current = null;

        EObject this_FlatNetwork_0 = null;

        EObject this_ClusteredNetwork_1 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:233:28: ( (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:234:1: (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:234:1: (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:235:5: this_FlatNetwork_0= ruleFlatNetwork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNetworkAccess().getFlatNetworkParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFlatNetwork_in_ruleAbstractNetwork437);
                    this_FlatNetwork_0=ruleFlatNetwork();

                    state._fsp--;

                     
                            current = this_FlatNetwork_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:245:5: this_ClusteredNetwork_1= ruleClusteredNetwork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNetworkAccess().getClusteredNetworkParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClusteredNetwork_in_ruleAbstractNetwork464);
                    this_ClusteredNetwork_1=ruleClusteredNetwork();

                    state._fsp--;

                     
                            current = this_ClusteredNetwork_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractNetwork"


    // $ANTLR start "entryRuleAbstractJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:261:1: entryRuleAbstractJob returns [EObject current=null] : iv_ruleAbstractJob= ruleAbstractJob EOF ;
    public final EObject entryRuleAbstractJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:262:2: (iv_ruleAbstractJob= ruleAbstractJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:263:2: iv_ruleAbstractJob= ruleAbstractJob EOF
            {
             newCompositeNode(grammarAccess.getAbstractJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractJob_in_entryRuleAbstractJob499);
            iv_ruleAbstractJob=ruleAbstractJob();

            state._fsp--;

             current =iv_ruleAbstractJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractJob509); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractJob"


    // $ANTLR start "ruleAbstractJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:270:1: ruleAbstractJob returns [EObject current=null] : (this_ContinuousJob_0= ruleContinuousJob | this_EventDrivenJob_1= ruleEventDrivenJob | this_PeriodicJob_2= rulePeriodicJob | this_RequestReplayJob_3= ruleRequestReplayJob ) ;
    public final EObject ruleAbstractJob() throws RecognitionException {
        EObject current = null;

        EObject this_ContinuousJob_0 = null;

        EObject this_EventDrivenJob_1 = null;

        EObject this_PeriodicJob_2 = null;

        EObject this_RequestReplayJob_3 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:273:28: ( (this_ContinuousJob_0= ruleContinuousJob | this_EventDrivenJob_1= ruleEventDrivenJob | this_PeriodicJob_2= rulePeriodicJob | this_RequestReplayJob_3= ruleRequestReplayJob ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:274:1: (this_ContinuousJob_0= ruleContinuousJob | this_EventDrivenJob_1= ruleEventDrivenJob | this_PeriodicJob_2= rulePeriodicJob | this_RequestReplayJob_3= ruleRequestReplayJob )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:274:1: (this_ContinuousJob_0= ruleContinuousJob | this_EventDrivenJob_1= ruleEventDrivenJob | this_PeriodicJob_2= rulePeriodicJob | this_RequestReplayJob_3= ruleRequestReplayJob )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt6=1;
                }
                break;
            case 55:
                {
                alt6=2;
                }
                break;
            case 57:
                {
                alt6=3;
                }
                break;
            case 59:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:275:5: this_ContinuousJob_0= ruleContinuousJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getContinuousJobParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleContinuousJob_in_ruleAbstractJob556);
                    this_ContinuousJob_0=ruleContinuousJob();

                    state._fsp--;

                     
                            current = this_ContinuousJob_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:285:5: this_EventDrivenJob_1= ruleEventDrivenJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getEventDrivenJobParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEventDrivenJob_in_ruleAbstractJob583);
                    this_EventDrivenJob_1=ruleEventDrivenJob();

                    state._fsp--;

                     
                            current = this_EventDrivenJob_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:295:5: this_PeriodicJob_2= rulePeriodicJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getPeriodicJobParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePeriodicJob_in_ruleAbstractJob610);
                    this_PeriodicJob_2=rulePeriodicJob();

                    state._fsp--;

                     
                            current = this_PeriodicJob_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:305:5: this_RequestReplayJob_3= ruleRequestReplayJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getRequestReplayJobParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRequestReplayJob_in_ruleAbstractJob637);
                    this_RequestReplayJob_3=ruleRequestReplayJob();

                    state._fsp--;

                     
                            current = this_RequestReplayJob_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractJob"


    // $ANTLR start "entryRuleAbstractPort"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:321:1: entryRuleAbstractPort returns [EObject current=null] : iv_ruleAbstractPort= ruleAbstractPort EOF ;
    public final EObject entryRuleAbstractPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractPort = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:322:2: (iv_ruleAbstractPort= ruleAbstractPort EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:323:2: iv_ruleAbstractPort= ruleAbstractPort EOF
            {
             newCompositeNode(grammarAccess.getAbstractPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractPort_in_entryRuleAbstractPort672);
            iv_ruleAbstractPort=ruleAbstractPort();

            state._fsp--;

             current =iv_ruleAbstractPort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractPort682); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractPort"


    // $ANTLR start "ruleAbstractPort"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:330:1: ruleAbstractPort returns [EObject current=null] : (this_UsbPort_0= ruleUsbPort | this_SerialPort_1= ruleSerialPort | this_OutPort_Impl_2= ruleOutPort_Impl | this_InPort_Impl_3= ruleInPort_Impl | this_Transmitter_4= ruleTransmitter | this_Reciever_5= ruleReciever ) ;
    public final EObject ruleAbstractPort() throws RecognitionException {
        EObject current = null;

        EObject this_UsbPort_0 = null;

        EObject this_SerialPort_1 = null;

        EObject this_OutPort_Impl_2 = null;

        EObject this_InPort_Impl_3 = null;

        EObject this_Transmitter_4 = null;

        EObject this_Reciever_5 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:333:28: ( (this_UsbPort_0= ruleUsbPort | this_SerialPort_1= ruleSerialPort | this_OutPort_Impl_2= ruleOutPort_Impl | this_InPort_Impl_3= ruleInPort_Impl | this_Transmitter_4= ruleTransmitter | this_Reciever_5= ruleReciever ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:334:1: (this_UsbPort_0= ruleUsbPort | this_SerialPort_1= ruleSerialPort | this_OutPort_Impl_2= ruleOutPort_Impl | this_InPort_Impl_3= ruleInPort_Impl | this_Transmitter_4= ruleTransmitter | this_Reciever_5= ruleReciever )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:334:1: (this_UsbPort_0= ruleUsbPort | this_SerialPort_1= ruleSerialPort | this_OutPort_Impl_2= ruleOutPort_Impl | this_InPort_Impl_3= ruleInPort_Impl | this_Transmitter_4= ruleTransmitter | this_Reciever_5= ruleReciever )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt7=1;
                }
                break;
            case 42:
                {
                alt7=2;
                }
                break;
            case 43:
                {
                alt7=3;
                }
                break;
            case 44:
                {
                alt7=4;
                }
                break;
            case 45:
                {
                alt7=5;
                }
                break;
            case 46:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:335:5: this_UsbPort_0= ruleUsbPort
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPortAccess().getUsbPortParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUsbPort_in_ruleAbstractPort729);
                    this_UsbPort_0=ruleUsbPort();

                    state._fsp--;

                     
                            current = this_UsbPort_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:345:5: this_SerialPort_1= ruleSerialPort
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPortAccess().getSerialPortParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSerialPort_in_ruleAbstractPort756);
                    this_SerialPort_1=ruleSerialPort();

                    state._fsp--;

                     
                            current = this_SerialPort_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:355:5: this_OutPort_Impl_2= ruleOutPort_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPortAccess().getOutPort_ImplParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOutPort_Impl_in_ruleAbstractPort783);
                    this_OutPort_Impl_2=ruleOutPort_Impl();

                    state._fsp--;

                     
                            current = this_OutPort_Impl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:365:5: this_InPort_Impl_3= ruleInPort_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPortAccess().getInPort_ImplParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInPort_Impl_in_ruleAbstractPort810);
                    this_InPort_Impl_3=ruleInPort_Impl();

                    state._fsp--;

                     
                            current = this_InPort_Impl_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:375:5: this_Transmitter_4= ruleTransmitter
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPortAccess().getTransmitterParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTransmitter_in_ruleAbstractPort837);
                    this_Transmitter_4=ruleTransmitter();

                    state._fsp--;

                     
                            current = this_Transmitter_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:385:5: this_Reciever_5= ruleReciever
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPortAccess().getRecieverParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReciever_in_ruleAbstractPort864);
                    this_Reciever_5=ruleReciever();

                    state._fsp--;

                     
                            current = this_Reciever_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractPort"


    // $ANTLR start "entryRuleAbstractSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:401:1: entryRuleAbstractSensor returns [EObject current=null] : iv_ruleAbstractSensor= ruleAbstractSensor EOF ;
    public final EObject entryRuleAbstractSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:402:2: (iv_ruleAbstractSensor= ruleAbstractSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:403:2: iv_ruleAbstractSensor= ruleAbstractSensor EOF
            {
             newCompositeNode(grammarAccess.getAbstractSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_entryRuleAbstractSensor899);
            iv_ruleAbstractSensor=ruleAbstractSensor();

            state._fsp--;

             current =iv_ruleAbstractSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractSensor909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractSensor"


    // $ANTLR start "ruleAbstractSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:410:1: ruleAbstractSensor returns [EObject current=null] : (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_ChemicalSensor_7= ruleChemicalSensor ) ;
    public final EObject ruleAbstractSensor() throws RecognitionException {
        EObject current = null;

        EObject this_AccelerometerSensor_0 = null;

        EObject this_LightSensor_1 = null;

        EObject this_LocationSensor_2 = null;

        EObject this_MicrophoneSensor_3 = null;

        EObject this_TemperatureSensor_4 = null;

        EObject this_PressureSensor_5 = null;

        EObject this_HumiditySensor_6 = null;

        EObject this_ChemicalSensor_7 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:413:28: ( (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_ChemicalSensor_7= ruleChemicalSensor ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:414:1: (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_ChemicalSensor_7= ruleChemicalSensor )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:414:1: (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_ChemicalSensor_7= ruleChemicalSensor )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            case 36:
                {
                alt8=4;
                }
                break;
            case 37:
                {
                alt8=5;
                }
                break;
            case 38:
                {
                alt8=6;
                }
                break;
            case 39:
                {
                alt8=7;
                }
                break;
            case 40:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:415:5: this_AccelerometerSensor_0= ruleAccelerometerSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getAccelerometerSensorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAccelerometerSensor_in_ruleAbstractSensor956);
                    this_AccelerometerSensor_0=ruleAccelerometerSensor();

                    state._fsp--;

                     
                            current = this_AccelerometerSensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:425:5: this_LightSensor_1= ruleLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getLightSensorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_ruleAbstractSensor983);
                    this_LightSensor_1=ruleLightSensor();

                    state._fsp--;

                     
                            current = this_LightSensor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:435:5: this_LocationSensor_2= ruleLocationSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getLocationSensorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLocationSensor_in_ruleAbstractSensor1010);
                    this_LocationSensor_2=ruleLocationSensor();

                    state._fsp--;

                     
                            current = this_LocationSensor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:445:5: this_MicrophoneSensor_3= ruleMicrophoneSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getMicrophoneSensorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMicrophoneSensor_in_ruleAbstractSensor1037);
                    this_MicrophoneSensor_3=ruleMicrophoneSensor();

                    state._fsp--;

                     
                            current = this_MicrophoneSensor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:455:5: this_TemperatureSensor_4= ruleTemperatureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getTemperatureSensorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_ruleAbstractSensor1064);
                    this_TemperatureSensor_4=ruleTemperatureSensor();

                    state._fsp--;

                     
                            current = this_TemperatureSensor_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:465:5: this_PressureSensor_5= rulePressureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getPressureSensorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_ruleAbstractSensor1091);
                    this_PressureSensor_5=rulePressureSensor();

                    state._fsp--;

                     
                            current = this_PressureSensor_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:475:5: this_HumiditySensor_6= ruleHumiditySensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getHumiditySensorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_ruleAbstractSensor1118);
                    this_HumiditySensor_6=ruleHumiditySensor();

                    state._fsp--;

                     
                            current = this_HumiditySensor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:485:5: this_ChemicalSensor_7= ruleChemicalSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getChemicalSensorParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChemicalSensor_in_ruleAbstractSensor1145);
                    this_ChemicalSensor_7=ruleChemicalSensor();

                    state._fsp--;

                     
                            current = this_ChemicalSensor_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractSensor"


    // $ANTLR start "entryRuleAbstractFlatNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:501:1: entryRuleAbstractFlatNode returns [EObject current=null] : iv_ruleAbstractFlatNode= ruleAbstractFlatNode EOF ;
    public final EObject entryRuleAbstractFlatNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFlatNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:502:2: (iv_ruleAbstractFlatNode= ruleAbstractFlatNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:503:2: iv_ruleAbstractFlatNode= ruleAbstractFlatNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractFlatNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractFlatNode_in_entryRuleAbstractFlatNode1180);
            iv_ruleAbstractFlatNode=ruleAbstractFlatNode();

            state._fsp--;

             current =iv_ruleAbstractFlatNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractFlatNode1190); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractFlatNode"


    // $ANTLR start "ruleAbstractFlatNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:510:1: ruleAbstractFlatNode returns [EObject current=null] : (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode ) ;
    public final EObject ruleAbstractFlatNode() throws RecognitionException {
        EObject current = null;

        EObject this_SensorNode_0 = null;

        EObject this_ComputationNode_1 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:513:28: ( (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:514:1: (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:514:1: (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
                alt9=1;
            }
            else if ( (LA9_0==48) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:515:5: this_SensorNode_0= ruleSensorNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFlatNodeAccess().getSensorNodeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSensorNode_in_ruleAbstractFlatNode1237);
                    this_SensorNode_0=ruleSensorNode();

                    state._fsp--;

                     
                            current = this_SensorNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:525:5: this_ComputationNode_1= ruleComputationNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFlatNodeAccess().getComputationNodeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComputationNode_in_ruleAbstractFlatNode1264);
                    this_ComputationNode_1=ruleComputationNode();

                    state._fsp--;

                     
                            current = this_ComputationNode_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractFlatNode"


    // $ANTLR start "entryRuleAbstractClusterNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:541:1: entryRuleAbstractClusterNode returns [EObject current=null] : iv_ruleAbstractClusterNode= ruleAbstractClusterNode EOF ;
    public final EObject entryRuleAbstractClusterNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractClusterNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:542:2: (iv_ruleAbstractClusterNode= ruleAbstractClusterNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:543:2: iv_ruleAbstractClusterNode= ruleAbstractClusterNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractClusterNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractClusterNode_in_entryRuleAbstractClusterNode1299);
            iv_ruleAbstractClusterNode=ruleAbstractClusterNode();

            state._fsp--;

             current =iv_ruleAbstractClusterNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractClusterNode1309); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractClusterNode"


    // $ANTLR start "ruleAbstractClusterNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:550:1: ruleAbstractClusterNode returns [EObject current=null] : (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode ) ;
    public final EObject ruleAbstractClusterNode() throws RecognitionException {
        EObject current = null;

        EObject this_SensorNode_0 = null;

        EObject this_ClusterHeadNode_1 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:553:28: ( (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:554:1: (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:554:1: (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==47) ) {
                alt10=1;
            }
            else if ( (LA10_0==52) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:555:5: this_SensorNode_0= ruleSensorNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractClusterNodeAccess().getSensorNodeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSensorNode_in_ruleAbstractClusterNode1356);
                    this_SensorNode_0=ruleSensorNode();

                    state._fsp--;

                     
                            current = this_SensorNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:565:5: this_ClusterHeadNode_1= ruleClusterHeadNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractClusterNodeAccess().getClusterHeadNodeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClusterHeadNode_in_ruleAbstractClusterNode1383);
                    this_ClusterHeadNode_1=ruleClusterHeadNode();

                    state._fsp--;

                     
                            current = this_ClusterHeadNode_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractClusterNode"


    // $ANTLR start "entryRuleAbstractJobAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:581:1: entryRuleAbstractJobAction returns [EObject current=null] : iv_ruleAbstractJobAction= ruleAbstractJobAction EOF ;
    public final EObject entryRuleAbstractJobAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractJobAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:582:2: (iv_ruleAbstractJobAction= ruleAbstractJobAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:583:2: iv_ruleAbstractJobAction= ruleAbstractJobAction EOF
            {
             newCompositeNode(grammarAccess.getAbstractJobActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractJobAction_in_entryRuleAbstractJobAction1418);
            iv_ruleAbstractJobAction=ruleAbstractJobAction();

            state._fsp--;

             current =iv_ruleAbstractJobAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractJobAction1428); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractJobAction"


    // $ANTLR start "ruleAbstractJobAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:590:1: ruleAbstractJobAction returns [EObject current=null] : (this_SenseForwardAction_0= ruleSenseForwardAction | this_AggregationAction_1= ruleAggregationAction | this_FusionAction_2= ruleFusionAction | this_ReadNodeMemoryAction_3= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_4= ruleWriteNodeMemoryAction | this_SendMessageAction_5= ruleSendMessageAction | this_ReceiveMessageAction_6= ruleReceiveMessageAction ) ;
    public final EObject ruleAbstractJobAction() throws RecognitionException {
        EObject current = null;

        EObject this_SenseForwardAction_0 = null;

        EObject this_AggregationAction_1 = null;

        EObject this_FusionAction_2 = null;

        EObject this_ReadNodeMemoryAction_3 = null;

        EObject this_WriteNodeMemoryAction_4 = null;

        EObject this_SendMessageAction_5 = null;

        EObject this_ReceiveMessageAction_6 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:593:28: ( (this_SenseForwardAction_0= ruleSenseForwardAction | this_AggregationAction_1= ruleAggregationAction | this_FusionAction_2= ruleFusionAction | this_ReadNodeMemoryAction_3= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_4= ruleWriteNodeMemoryAction | this_SendMessageAction_5= ruleSendMessageAction | this_ReceiveMessageAction_6= ruleReceiveMessageAction ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:594:1: (this_SenseForwardAction_0= ruleSenseForwardAction | this_AggregationAction_1= ruleAggregationAction | this_FusionAction_2= ruleFusionAction | this_ReadNodeMemoryAction_3= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_4= ruleWriteNodeMemoryAction | this_SendMessageAction_5= ruleSendMessageAction | this_ReceiveMessageAction_6= ruleReceiveMessageAction )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:594:1: (this_SenseForwardAction_0= ruleSenseForwardAction | this_AggregationAction_1= ruleAggregationAction | this_FusionAction_2= ruleFusionAction | this_ReadNodeMemoryAction_3= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_4= ruleWriteNodeMemoryAction | this_SendMessageAction_5= ruleSendMessageAction | this_ReceiveMessageAction_6= ruleReceiveMessageAction )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt11=1;
                }
                break;
            case 63:
                {
                alt11=2;
                }
                break;
            case 65:
                {
                alt11=3;
                }
                break;
            case 69:
                {
                alt11=4;
                }
                break;
            case 70:
                {
                alt11=5;
                }
                break;
            case 71:
                {
                alt11=6;
                }
                break;
            case 74:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:595:5: this_SenseForwardAction_0= ruleSenseForwardAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobActionAccess().getSenseForwardActionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSenseForwardAction_in_ruleAbstractJobAction1475);
                    this_SenseForwardAction_0=ruleSenseForwardAction();

                    state._fsp--;

                     
                            current = this_SenseForwardAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:605:5: this_AggregationAction_1= ruleAggregationAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobActionAccess().getAggregationActionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAggregationAction_in_ruleAbstractJobAction1502);
                    this_AggregationAction_1=ruleAggregationAction();

                    state._fsp--;

                     
                            current = this_AggregationAction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:615:5: this_FusionAction_2= ruleFusionAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobActionAccess().getFusionActionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFusionAction_in_ruleAbstractJobAction1529);
                    this_FusionAction_2=ruleFusionAction();

                    state._fsp--;

                     
                            current = this_FusionAction_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:625:5: this_ReadNodeMemoryAction_3= ruleReadNodeMemoryAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobActionAccess().getReadNodeMemoryActionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReadNodeMemoryAction_in_ruleAbstractJobAction1556);
                    this_ReadNodeMemoryAction_3=ruleReadNodeMemoryAction();

                    state._fsp--;

                     
                            current = this_ReadNodeMemoryAction_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:635:5: this_WriteNodeMemoryAction_4= ruleWriteNodeMemoryAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobActionAccess().getWriteNodeMemoryActionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWriteNodeMemoryAction_in_ruleAbstractJobAction1583);
                    this_WriteNodeMemoryAction_4=ruleWriteNodeMemoryAction();

                    state._fsp--;

                     
                            current = this_WriteNodeMemoryAction_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:645:5: this_SendMessageAction_5= ruleSendMessageAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobActionAccess().getSendMessageActionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSendMessageAction_in_ruleAbstractJobAction1610);
                    this_SendMessageAction_5=ruleSendMessageAction();

                    state._fsp--;

                     
                            current = this_SendMessageAction_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:655:5: this_ReceiveMessageAction_6= ruleReceiveMessageAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobActionAccess().getReceiveMessageActionParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReceiveMessageAction_in_ruleAbstractJobAction1637);
                    this_ReceiveMessageAction_6=ruleReceiveMessageAction();

                    state._fsp--;

                     
                            current = this_ReceiveMessageAction_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractJobAction"


    // $ANTLR start "entryRuleEInt"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:677:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:678:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:679:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1679);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:686:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:689:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:690:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:690:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:690:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:690:2: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:691:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEInt1729); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1746); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:711:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:712:2: (iv_ruleEString= ruleEString EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:713:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1792);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1803); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:720:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:723:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:724:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:724:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:724:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1843); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:732:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1869); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSinkNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:747:1: entryRuleSinkNode returns [EObject current=null] : iv_ruleSinkNode= ruleSinkNode EOF ;
    public final EObject entryRuleSinkNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinkNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:748:2: (iv_ruleSinkNode= ruleSinkNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:749:2: iv_ruleSinkNode= ruleSinkNode EOF
            {
             newCompositeNode(grammarAccess.getSinkNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSinkNode_in_entryRuleSinkNode1914);
            iv_ruleSinkNode=ruleSinkNode();

            state._fsp--;

             current =iv_ruleSinkNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSinkNode1924); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSinkNode"


    // $ANTLR start "ruleSinkNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:756:1: ruleSinkNode returns [EObject current=null] : ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) ;
    public final EObject ruleSinkNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:759:28: ( ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:760:1: ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:760:1: ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:760:2: () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:760:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:761:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinkNodeAccess().getSinkNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSinkNode1970); 

                	newLeafNode(otherlv_1, grammarAccess.getSinkNodeAccess().getSinkNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSinkNode1982); 

                	newLeafNode(otherlv_2, grammarAccess.getSinkNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:774:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:774:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSinkNode1995); 

                        	newLeafNode(otherlv_3, grammarAccess.getSinkNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:778:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:779:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:779:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:780:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSinkNode2016);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:796:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:796:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSinkNode2031); 

                        	newLeafNode(otherlv_5, grammarAccess.getSinkNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:800:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:801:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:801:1: (lv_position_6_0= rulePosition )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:802:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleSinkNode2052);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_6_0, 
                            		"Position");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:818:4: (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:818:6: otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSinkNode2067); 

                        	newLeafNode(otherlv_7, grammarAccess.getSinkNodeAccess().getPortsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSinkNode2079); 

                        	newLeafNode(otherlv_8, grammarAccess.getSinkNodeAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:826:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:827:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:827:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:828:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSinkNodeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getPortsAbstractPortCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSinkNode2102);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:841:2: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:841:4: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkNode2115); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSinkNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:845:1: ( ( ruleEString ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:846:1: ( ruleEString )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:846:1: ( ruleEString )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:847:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSinkNodeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getPortsAbstractPortCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSinkNode2138);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSinkNode2152); 

                        	newLeafNode(otherlv_12, grammarAccess.getSinkNodeAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:864:3: (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:864:5: otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSinkNode2167); 

                        	newLeafNode(otherlv_13, grammarAccess.getSinkNodeAccess().getSensorsKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSinkNode2179); 

                        	newLeafNode(otherlv_14, grammarAccess.getSinkNodeAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:872:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:873:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:873:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:874:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSinkNodeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getSensorsAbstractSensorCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSinkNode2202);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:887:2: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:887:4: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkNode2215); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getSinkNodeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:891:1: ( ( ruleEString ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:892:1: ( ruleEString )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:892:1: ( ruleEString )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:893:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSinkNodeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getSensorsAbstractSensorCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSinkNode2238);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSinkNode2252); 

                        	newLeafNode(otherlv_18, grammarAccess.getSinkNodeAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSinkNode2266); 

                	newLeafNode(otherlv_19, grammarAccess.getSinkNodeAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSinkNode"


    // $ANTLR start "entryRuleFlatNetwork"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:922:1: entryRuleFlatNetwork returns [EObject current=null] : iv_ruleFlatNetwork= ruleFlatNetwork EOF ;
    public final EObject entryRuleFlatNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlatNetwork = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:923:2: (iv_ruleFlatNetwork= ruleFlatNetwork EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:924:2: iv_ruleFlatNetwork= ruleFlatNetwork EOF
            {
             newCompositeNode(grammarAccess.getFlatNetworkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlatNetwork_in_entryRuleFlatNetwork2302);
            iv_ruleFlatNetwork=ruleFlatNetwork();

            state._fsp--;

             current =iv_ruleFlatNetwork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFlatNetwork2312); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlatNetwork"


    // $ANTLR start "ruleFlatNetwork"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:931:1: ruleFlatNetwork returns [EObject current=null] : ( () otherlv_1= 'FlatNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'sink' ( ( ruleEString ) ) )? (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )? (otherlv_25= 'nodes' otherlv_26= '{' ( (lv_nodes_27_0= ruleAbstractFlatNode ) ) (otherlv_28= ',' ( (lv_nodes_29_0= ruleAbstractFlatNode ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) ;
    public final EObject ruleFlatNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_nbOfNodes_6_0 = null;

        Enumerator lv_interNodeComm_8_0 = null;

        Enumerator lv_routingProtocol_10_0 = null;

        EObject lv_sensors_15_0 = null;

        EObject lv_sensors_17_0 = null;

        EObject lv_ports_21_0 = null;

        EObject lv_ports_23_0 = null;

        EObject lv_nodes_27_0 = null;

        EObject lv_nodes_29_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:934:28: ( ( () otherlv_1= 'FlatNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'sink' ( ( ruleEString ) ) )? (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )? (otherlv_25= 'nodes' otherlv_26= '{' ( (lv_nodes_27_0= ruleAbstractFlatNode ) ) (otherlv_28= ',' ( (lv_nodes_29_0= ruleAbstractFlatNode ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:935:1: ( () otherlv_1= 'FlatNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'sink' ( ( ruleEString ) ) )? (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )? (otherlv_25= 'nodes' otherlv_26= '{' ( (lv_nodes_27_0= ruleAbstractFlatNode ) ) (otherlv_28= ',' ( (lv_nodes_29_0= ruleAbstractFlatNode ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:935:1: ( () otherlv_1= 'FlatNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'sink' ( ( ruleEString ) ) )? (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )? (otherlv_25= 'nodes' otherlv_26= '{' ( (lv_nodes_27_0= ruleAbstractFlatNode ) ) (otherlv_28= ',' ( (lv_nodes_29_0= ruleAbstractFlatNode ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:935:2: () otherlv_1= 'FlatNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'sink' ( ( ruleEString ) ) )? (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )? (otherlv_25= 'nodes' otherlv_26= '{' ( (lv_nodes_27_0= ruleAbstractFlatNode ) ) (otherlv_28= ',' ( (lv_nodes_29_0= ruleAbstractFlatNode ) ) )* otherlv_30= '}' )? otherlv_31= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:935:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:936:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFlatNetworkAccess().getFlatNetworkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFlatNetwork2358); 

                	newLeafNode(otherlv_1, grammarAccess.getFlatNetworkAccess().getFlatNetworkKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlatNetwork2370); 

                	newLeafNode(otherlv_2, grammarAccess.getFlatNetworkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:949:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:949:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFlatNetwork2383); 

                        	newLeafNode(otherlv_3, grammarAccess.getFlatNetworkAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:953:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:954:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:954:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:955:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleFlatNetwork2404);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:971:4: (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:971:6: otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFlatNetwork2419); 

                        	newLeafNode(otherlv_5, grammarAccess.getFlatNetworkAccess().getNbOfNodesKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:975:1: ( (lv_nbOfNodes_6_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:976:1: (lv_nbOfNodes_6_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:976:1: (lv_nbOfNodes_6_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:977:3: lv_nbOfNodes_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getNbOfNodesEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleFlatNetwork2440);
                    lv_nbOfNodes_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"nbOfNodes",
                            		lv_nbOfNodes_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:993:4: (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:993:6: otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) )
                    {
                    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFlatNetwork2455); 

                        	newLeafNode(otherlv_7, grammarAccess.getFlatNetworkAccess().getInterNodeCommKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:997:1: ( (lv_interNodeComm_8_0= ruleInterNodeComm ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:998:1: (lv_interNodeComm_8_0= ruleInterNodeComm )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:998:1: (lv_interNodeComm_8_0= ruleInterNodeComm )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:999:3: lv_interNodeComm_8_0= ruleInterNodeComm
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getInterNodeCommInterNodeCommEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInterNodeComm_in_ruleFlatNetwork2476);
                    lv_interNodeComm_8_0=ruleInterNodeComm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"interNodeComm",
                            		lv_interNodeComm_8_0, 
                            		"InterNodeComm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1015:4: (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1015:6: otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) )
                    {
                    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFlatNetwork2491); 

                        	newLeafNode(otherlv_9, grammarAccess.getFlatNetworkAccess().getRoutingProtocolKeyword_6_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1019:1: ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1020:1: (lv_routingProtocol_10_0= ruleRoutingProtocol )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1020:1: (lv_routingProtocol_10_0= ruleRoutingProtocol )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1021:3: lv_routingProtocol_10_0= ruleRoutingProtocol
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getRoutingProtocolRoutingProtocolEnumRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoutingProtocol_in_ruleFlatNetwork2512);
                    lv_routingProtocol_10_0=ruleRoutingProtocol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"routingProtocol",
                            		lv_routingProtocol_10_0, 
                            		"RoutingProtocol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1037:4: (otherlv_11= 'sink' ( ( ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1037:6: otherlv_11= 'sink' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFlatNetwork2527); 

                        	newLeafNode(otherlv_11, grammarAccess.getFlatNetworkAccess().getSinkKeyword_7_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1041:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1042:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1042:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1043:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFlatNetworkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getSinkSinkNodeCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlatNetwork2550);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1056:4: (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1056:6: otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFlatNetwork2565); 

                        	newLeafNode(otherlv_13, grammarAccess.getFlatNetworkAccess().getSensorsKeyword_8_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlatNetwork2577); 

                        	newLeafNode(otherlv_14, grammarAccess.getFlatNetworkAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1064:1: ( (lv_sensors_15_0= ruleAbstractSensor ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1065:1: (lv_sensors_15_0= ruleAbstractSensor )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1065:1: (lv_sensors_15_0= ruleAbstractSensor )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1066:3: lv_sensors_15_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getSensorsAbstractSensorParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork2598);
                    lv_sensors_15_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"sensors",
                            		lv_sensors_15_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1082:2: (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==16) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1082:4: otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFlatNetwork2611); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getFlatNetworkAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1086:1: ( (lv_sensors_17_0= ruleAbstractSensor ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1087:1: (lv_sensors_17_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1087:1: (lv_sensors_17_0= ruleAbstractSensor )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1088:3: lv_sensors_17_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getSensorsAbstractSensorParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork2632);
                    	    lv_sensors_17_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sensors",
                    	            		lv_sensors_17_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFlatNetwork2646); 

                        	newLeafNode(otherlv_18, grammarAccess.getFlatNetworkAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1108:3: (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1108:5: otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFlatNetwork2661); 

                        	newLeafNode(otherlv_19, grammarAccess.getFlatNetworkAccess().getPortsKeyword_9_0());
                        
                    otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlatNetwork2673); 

                        	newLeafNode(otherlv_20, grammarAccess.getFlatNetworkAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1116:1: ( (lv_ports_21_0= ruleAbstractPort ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1117:1: (lv_ports_21_0= ruleAbstractPort )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1117:1: (lv_ports_21_0= ruleAbstractPort )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1118:3: lv_ports_21_0= ruleAbstractPort
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getPortsAbstractPortParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractPort_in_ruleFlatNetwork2694);
                    lv_ports_21_0=ruleAbstractPort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"ports",
                            		lv_ports_21_0, 
                            		"AbstractPort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1134:2: (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==16) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1134:4: otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) )
                    	    {
                    	    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFlatNetwork2707); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getFlatNetworkAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1138:1: ( (lv_ports_23_0= ruleAbstractPort ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1139:1: (lv_ports_23_0= ruleAbstractPort )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1139:1: (lv_ports_23_0= ruleAbstractPort )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1140:3: lv_ports_23_0= ruleAbstractPort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getPortsAbstractPortParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractPort_in_ruleFlatNetwork2728);
                    	    lv_ports_23_0=ruleAbstractPort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ports",
                    	            		lv_ports_23_0, 
                    	            		"AbstractPort");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFlatNetwork2742); 

                        	newLeafNode(otherlv_24, grammarAccess.getFlatNetworkAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1160:3: (otherlv_25= 'nodes' otherlv_26= '{' ( (lv_nodes_27_0= ruleAbstractFlatNode ) ) (otherlv_28= ',' ( (lv_nodes_29_0= ruleAbstractFlatNode ) ) )* otherlv_30= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1160:5: otherlv_25= 'nodes' otherlv_26= '{' ( (lv_nodes_27_0= ruleAbstractFlatNode ) ) (otherlv_28= ',' ( (lv_nodes_29_0= ruleAbstractFlatNode ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFlatNetwork2757); 

                        	newLeafNode(otherlv_25, grammarAccess.getFlatNetworkAccess().getNodesKeyword_10_0());
                        
                    otherlv_26=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlatNetwork2769); 

                        	newLeafNode(otherlv_26, grammarAccess.getFlatNetworkAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1168:1: ( (lv_nodes_27_0= ruleAbstractFlatNode ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1169:1: (lv_nodes_27_0= ruleAbstractFlatNode )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1169:1: (lv_nodes_27_0= ruleAbstractFlatNode )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1170:3: lv_nodes_27_0= ruleAbstractFlatNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getNodesAbstractFlatNodeParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork2790);
                    lv_nodes_27_0=ruleAbstractFlatNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_27_0, 
                            		"AbstractFlatNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1186:2: (otherlv_28= ',' ( (lv_nodes_29_0= ruleAbstractFlatNode ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==16) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1186:4: otherlv_28= ',' ( (lv_nodes_29_0= ruleAbstractFlatNode ) )
                    	    {
                    	    otherlv_28=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFlatNetwork2803); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getFlatNetworkAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1190:1: ( (lv_nodes_29_0= ruleAbstractFlatNode ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1191:1: (lv_nodes_29_0= ruleAbstractFlatNode )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1191:1: (lv_nodes_29_0= ruleAbstractFlatNode )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1192:3: lv_nodes_29_0= ruleAbstractFlatNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getNodesAbstractFlatNodeParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork2824);
                    	    lv_nodes_29_0=ruleAbstractFlatNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_29_0, 
                    	            		"AbstractFlatNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFlatNetwork2838); 

                        	newLeafNode(otherlv_30, grammarAccess.getFlatNetworkAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFlatNetwork2852); 

                	newLeafNode(otherlv_31, grammarAccess.getFlatNetworkAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlatNetwork"


    // $ANTLR start "entryRuleClusteredNetwork"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1224:1: entryRuleClusteredNetwork returns [EObject current=null] : iv_ruleClusteredNetwork= ruleClusteredNetwork EOF ;
    public final EObject entryRuleClusteredNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClusteredNetwork = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1225:2: (iv_ruleClusteredNetwork= ruleClusteredNetwork EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1226:2: iv_ruleClusteredNetwork= ruleClusteredNetwork EOF
            {
             newCompositeNode(grammarAccess.getClusteredNetworkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClusteredNetwork_in_entryRuleClusteredNetwork2888);
            iv_ruleClusteredNetwork=ruleClusteredNetwork();

            state._fsp--;

             current =iv_ruleClusteredNetwork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClusteredNetwork2898); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClusteredNetwork"


    // $ANTLR start "ruleClusteredNetwork"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1233:1: ruleClusteredNetwork returns [EObject current=null] : ( () otherlv_1= 'ClusteredNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'sink' ( ( ruleEString ) ) )? (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )? (otherlv_25= 'clusters' otherlv_26= '{' ( (lv_clusters_27_0= ruleCluster ) ) (otherlv_28= ',' ( (lv_clusters_29_0= ruleCluster ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) ;
    public final EObject ruleClusteredNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_nbOfNodes_6_0 = null;

        Enumerator lv_interNodeComm_8_0 = null;

        Enumerator lv_routingProtocol_10_0 = null;

        EObject lv_sensors_15_0 = null;

        EObject lv_sensors_17_0 = null;

        EObject lv_ports_21_0 = null;

        EObject lv_ports_23_0 = null;

        EObject lv_clusters_27_0 = null;

        EObject lv_clusters_29_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1236:28: ( ( () otherlv_1= 'ClusteredNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'sink' ( ( ruleEString ) ) )? (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )? (otherlv_25= 'clusters' otherlv_26= '{' ( (lv_clusters_27_0= ruleCluster ) ) (otherlv_28= ',' ( (lv_clusters_29_0= ruleCluster ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1237:1: ( () otherlv_1= 'ClusteredNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'sink' ( ( ruleEString ) ) )? (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )? (otherlv_25= 'clusters' otherlv_26= '{' ( (lv_clusters_27_0= ruleCluster ) ) (otherlv_28= ',' ( (lv_clusters_29_0= ruleCluster ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1237:1: ( () otherlv_1= 'ClusteredNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'sink' ( ( ruleEString ) ) )? (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )? (otherlv_25= 'clusters' otherlv_26= '{' ( (lv_clusters_27_0= ruleCluster ) ) (otherlv_28= ',' ( (lv_clusters_29_0= ruleCluster ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1237:2: () otherlv_1= 'ClusteredNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'sink' ( ( ruleEString ) ) )? (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )? (otherlv_25= 'clusters' otherlv_26= '{' ( (lv_clusters_27_0= ruleCluster ) ) (otherlv_28= ',' ( (lv_clusters_29_0= ruleCluster ) ) )* otherlv_30= '}' )? otherlv_31= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1237:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1238:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClusteredNetworkAccess().getClusteredNetworkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleClusteredNetwork2944); 

                	newLeafNode(otherlv_1, grammarAccess.getClusteredNetworkAccess().getClusteredNetworkKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusteredNetwork2956); 

                	newLeafNode(otherlv_2, grammarAccess.getClusteredNetworkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1251:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1251:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClusteredNetwork2969); 

                        	newLeafNode(otherlv_3, grammarAccess.getClusteredNetworkAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1255:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1256:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1256:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1257:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleClusteredNetwork2990);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1273:4: (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1273:6: otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleClusteredNetwork3005); 

                        	newLeafNode(otherlv_5, grammarAccess.getClusteredNetworkAccess().getNbOfNodesKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1277:1: ( (lv_nbOfNodes_6_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1278:1: (lv_nbOfNodes_6_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1278:1: (lv_nbOfNodes_6_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1279:3: lv_nbOfNodes_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getNbOfNodesEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleClusteredNetwork3026);
                    lv_nbOfNodes_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"nbOfNodes",
                            		lv_nbOfNodes_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1295:4: (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1295:6: otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) )
                    {
                    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleClusteredNetwork3041); 

                        	newLeafNode(otherlv_7, grammarAccess.getClusteredNetworkAccess().getInterNodeCommKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1299:1: ( (lv_interNodeComm_8_0= ruleInterNodeComm ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1300:1: (lv_interNodeComm_8_0= ruleInterNodeComm )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1300:1: (lv_interNodeComm_8_0= ruleInterNodeComm )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1301:3: lv_interNodeComm_8_0= ruleInterNodeComm
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getInterNodeCommInterNodeCommEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInterNodeComm_in_ruleClusteredNetwork3062);
                    lv_interNodeComm_8_0=ruleInterNodeComm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"interNodeComm",
                            		lv_interNodeComm_8_0, 
                            		"InterNodeComm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1317:4: (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1317:6: otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) )
                    {
                    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleClusteredNetwork3077); 

                        	newLeafNode(otherlv_9, grammarAccess.getClusteredNetworkAccess().getRoutingProtocolKeyword_6_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1321:1: ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1322:1: (lv_routingProtocol_10_0= ruleRoutingProtocol )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1322:1: (lv_routingProtocol_10_0= ruleRoutingProtocol )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1323:3: lv_routingProtocol_10_0= ruleRoutingProtocol
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getRoutingProtocolRoutingProtocolEnumRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoutingProtocol_in_ruleClusteredNetwork3098);
                    lv_routingProtocol_10_0=ruleRoutingProtocol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"routingProtocol",
                            		lv_routingProtocol_10_0, 
                            		"RoutingProtocol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1339:4: (otherlv_11= 'sink' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1339:6: otherlv_11= 'sink' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleClusteredNetwork3113); 

                        	newLeafNode(otherlv_11, grammarAccess.getClusteredNetworkAccess().getSinkKeyword_7_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1343:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1344:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1344:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1345:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClusteredNetworkRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getSinkSinkNodeCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClusteredNetwork3136);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1358:4: (otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1358:6: otherlv_13= 'sensors' otherlv_14= '{' ( (lv_sensors_15_0= ruleAbstractSensor ) ) (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleClusteredNetwork3151); 

                        	newLeafNode(otherlv_13, grammarAccess.getClusteredNetworkAccess().getSensorsKeyword_8_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusteredNetwork3163); 

                        	newLeafNode(otherlv_14, grammarAccess.getClusteredNetworkAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1366:1: ( (lv_sensors_15_0= ruleAbstractSensor ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1367:1: (lv_sensors_15_0= ruleAbstractSensor )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1367:1: (lv_sensors_15_0= ruleAbstractSensor )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1368:3: lv_sensors_15_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getSensorsAbstractSensorParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork3184);
                    lv_sensors_15_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"sensors",
                            		lv_sensors_15_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1384:2: (otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1384:4: otherlv_16= ',' ( (lv_sensors_17_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusteredNetwork3197); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getClusteredNetworkAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1388:1: ( (lv_sensors_17_0= ruleAbstractSensor ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1389:1: (lv_sensors_17_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1389:1: (lv_sensors_17_0= ruleAbstractSensor )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1390:3: lv_sensors_17_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getSensorsAbstractSensorParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork3218);
                    	    lv_sensors_17_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sensors",
                    	            		lv_sensors_17_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClusteredNetwork3232); 

                        	newLeafNode(otherlv_18, grammarAccess.getClusteredNetworkAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1410:3: (otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1410:5: otherlv_19= 'ports' otherlv_20= '{' ( (lv_ports_21_0= ruleAbstractPort ) ) (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleClusteredNetwork3247); 

                        	newLeafNode(otherlv_19, grammarAccess.getClusteredNetworkAccess().getPortsKeyword_9_0());
                        
                    otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusteredNetwork3259); 

                        	newLeafNode(otherlv_20, grammarAccess.getClusteredNetworkAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1418:1: ( (lv_ports_21_0= ruleAbstractPort ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1419:1: (lv_ports_21_0= ruleAbstractPort )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1419:1: (lv_ports_21_0= ruleAbstractPort )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1420:3: lv_ports_21_0= ruleAbstractPort
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getPortsAbstractPortParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractPort_in_ruleClusteredNetwork3280);
                    lv_ports_21_0=ruleAbstractPort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"ports",
                            		lv_ports_21_0, 
                            		"AbstractPort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1436:2: (otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==16) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1436:4: otherlv_22= ',' ( (lv_ports_23_0= ruleAbstractPort ) )
                    	    {
                    	    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusteredNetwork3293); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getClusteredNetworkAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1440:1: ( (lv_ports_23_0= ruleAbstractPort ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1441:1: (lv_ports_23_0= ruleAbstractPort )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1441:1: (lv_ports_23_0= ruleAbstractPort )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1442:3: lv_ports_23_0= ruleAbstractPort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getPortsAbstractPortParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractPort_in_ruleClusteredNetwork3314);
                    	    lv_ports_23_0=ruleAbstractPort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ports",
                    	            		lv_ports_23_0, 
                    	            		"AbstractPort");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClusteredNetwork3328); 

                        	newLeafNode(otherlv_24, grammarAccess.getClusteredNetworkAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1462:3: (otherlv_25= 'clusters' otherlv_26= '{' ( (lv_clusters_27_0= ruleCluster ) ) (otherlv_28= ',' ( (lv_clusters_29_0= ruleCluster ) ) )* otherlv_30= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==32) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1462:5: otherlv_25= 'clusters' otherlv_26= '{' ( (lv_clusters_27_0= ruleCluster ) ) (otherlv_28= ',' ( (lv_clusters_29_0= ruleCluster ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleClusteredNetwork3343); 

                        	newLeafNode(otherlv_25, grammarAccess.getClusteredNetworkAccess().getClustersKeyword_10_0());
                        
                    otherlv_26=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusteredNetwork3355); 

                        	newLeafNode(otherlv_26, grammarAccess.getClusteredNetworkAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1470:1: ( (lv_clusters_27_0= ruleCluster ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1471:1: (lv_clusters_27_0= ruleCluster )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1471:1: (lv_clusters_27_0= ruleCluster )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1472:3: lv_clusters_27_0= ruleCluster
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getClustersClusterParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCluster_in_ruleClusteredNetwork3376);
                    lv_clusters_27_0=ruleCluster();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"clusters",
                            		lv_clusters_27_0, 
                            		"Cluster");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1488:2: (otherlv_28= ',' ( (lv_clusters_29_0= ruleCluster ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==16) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1488:4: otherlv_28= ',' ( (lv_clusters_29_0= ruleCluster ) )
                    	    {
                    	    otherlv_28=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusteredNetwork3389); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getClusteredNetworkAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1492:1: ( (lv_clusters_29_0= ruleCluster ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1493:1: (lv_clusters_29_0= ruleCluster )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1493:1: (lv_clusters_29_0= ruleCluster )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1494:3: lv_clusters_29_0= ruleCluster
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getClustersClusterParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCluster_in_ruleClusteredNetwork3410);
                    	    lv_clusters_29_0=ruleCluster();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"clusters",
                    	            		lv_clusters_29_0, 
                    	            		"Cluster");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClusteredNetwork3424); 

                        	newLeafNode(otherlv_30, grammarAccess.getClusteredNetworkAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClusteredNetwork3438); 

                	newLeafNode(otherlv_31, grammarAccess.getClusteredNetworkAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClusteredNetwork"


    // $ANTLR start "entryRuleAccelerometerSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1526:1: entryRuleAccelerometerSensor returns [EObject current=null] : iv_ruleAccelerometerSensor= ruleAccelerometerSensor EOF ;
    public final EObject entryRuleAccelerometerSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccelerometerSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1527:2: (iv_ruleAccelerometerSensor= ruleAccelerometerSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1528:2: iv_ruleAccelerometerSensor= ruleAccelerometerSensor EOF
            {
             newCompositeNode(grammarAccess.getAccelerometerSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccelerometerSensor_in_entryRuleAccelerometerSensor3474);
            iv_ruleAccelerometerSensor=ruleAccelerometerSensor();

            state._fsp--;

             current =iv_ruleAccelerometerSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccelerometerSensor3484); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccelerometerSensor"


    // $ANTLR start "ruleAccelerometerSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1535:1: ruleAccelerometerSensor returns [EObject current=null] : ( () otherlv_1= 'AccelerometerSensor' ) ;
    public final EObject ruleAccelerometerSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1538:28: ( ( () otherlv_1= 'AccelerometerSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1539:1: ( () otherlv_1= 'AccelerometerSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1539:1: ( () otherlv_1= 'AccelerometerSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1539:2: () otherlv_1= 'AccelerometerSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1539:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1540:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccelerometerSensorAccess().getAccelerometerSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAccelerometerSensor3530); 

                	newLeafNode(otherlv_1, grammarAccess.getAccelerometerSensorAccess().getAccelerometerSensorKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccelerometerSensor"


    // $ANTLR start "entryRuleLightSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1557:1: entryRuleLightSensor returns [EObject current=null] : iv_ruleLightSensor= ruleLightSensor EOF ;
    public final EObject entryRuleLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1558:2: (iv_ruleLightSensor= ruleLightSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1559:2: iv_ruleLightSensor= ruleLightSensor EOF
            {
             newCompositeNode(grammarAccess.getLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_entryRuleLightSensor3566);
            iv_ruleLightSensor=ruleLightSensor();

            state._fsp--;

             current =iv_ruleLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSensor3576); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLightSensor"


    // $ANTLR start "ruleLightSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1566:1: ruleLightSensor returns [EObject current=null] : ( () otherlv_1= 'LightSensor' ) ;
    public final EObject ruleLightSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1569:28: ( ( () otherlv_1= 'LightSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1570:1: ( () otherlv_1= 'LightSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1570:1: ( () otherlv_1= 'LightSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1570:2: () otherlv_1= 'LightSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1570:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1571:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSensorAccess().getLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLightSensor3622); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSensorAccess().getLightSensorKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLightSensor"


    // $ANTLR start "entryRuleLocationSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1588:1: entryRuleLocationSensor returns [EObject current=null] : iv_ruleLocationSensor= ruleLocationSensor EOF ;
    public final EObject entryRuleLocationSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1589:2: (iv_ruleLocationSensor= ruleLocationSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1590:2: iv_ruleLocationSensor= ruleLocationSensor EOF
            {
             newCompositeNode(grammarAccess.getLocationSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocationSensor_in_entryRuleLocationSensor3658);
            iv_ruleLocationSensor=ruleLocationSensor();

            state._fsp--;

             current =iv_ruleLocationSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocationSensor3668); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationSensor"


    // $ANTLR start "ruleLocationSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1597:1: ruleLocationSensor returns [EObject current=null] : ( () otherlv_1= 'LocationSensor' ) ;
    public final EObject ruleLocationSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1600:28: ( ( () otherlv_1= 'LocationSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1601:1: ( () otherlv_1= 'LocationSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1601:1: ( () otherlv_1= 'LocationSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1601:2: () otherlv_1= 'LocationSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1601:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1602:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLocationSensorAccess().getLocationSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleLocationSensor3714); 

                	newLeafNode(otherlv_1, grammarAccess.getLocationSensorAccess().getLocationSensorKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationSensor"


    // $ANTLR start "entryRuleMicrophoneSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1619:1: entryRuleMicrophoneSensor returns [EObject current=null] : iv_ruleMicrophoneSensor= ruleMicrophoneSensor EOF ;
    public final EObject entryRuleMicrophoneSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMicrophoneSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1620:2: (iv_ruleMicrophoneSensor= ruleMicrophoneSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1621:2: iv_ruleMicrophoneSensor= ruleMicrophoneSensor EOF
            {
             newCompositeNode(grammarAccess.getMicrophoneSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMicrophoneSensor_in_entryRuleMicrophoneSensor3750);
            iv_ruleMicrophoneSensor=ruleMicrophoneSensor();

            state._fsp--;

             current =iv_ruleMicrophoneSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMicrophoneSensor3760); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMicrophoneSensor"


    // $ANTLR start "ruleMicrophoneSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1628:1: ruleMicrophoneSensor returns [EObject current=null] : ( () otherlv_1= 'MicrophoneSensor' ) ;
    public final EObject ruleMicrophoneSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1631:28: ( ( () otherlv_1= 'MicrophoneSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1632:1: ( () otherlv_1= 'MicrophoneSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1632:1: ( () otherlv_1= 'MicrophoneSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1632:2: () otherlv_1= 'MicrophoneSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1632:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1633:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMicrophoneSensorAccess().getMicrophoneSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMicrophoneSensor3806); 

                	newLeafNode(otherlv_1, grammarAccess.getMicrophoneSensorAccess().getMicrophoneSensorKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMicrophoneSensor"


    // $ANTLR start "entryRuleTemperatureSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1650:1: entryRuleTemperatureSensor returns [EObject current=null] : iv_ruleTemperatureSensor= ruleTemperatureSensor EOF ;
    public final EObject entryRuleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperatureSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1651:2: (iv_ruleTemperatureSensor= ruleTemperatureSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1652:2: iv_ruleTemperatureSensor= ruleTemperatureSensor EOF
            {
             newCompositeNode(grammarAccess.getTemperatureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3842);
            iv_ruleTemperatureSensor=ruleTemperatureSensor();

            state._fsp--;

             current =iv_ruleTemperatureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperatureSensor3852); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemperatureSensor"


    // $ANTLR start "ruleTemperatureSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1659:1: ruleTemperatureSensor returns [EObject current=null] : ( () otherlv_1= 'TemperatureSensor' ) ;
    public final EObject ruleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1662:28: ( ( () otherlv_1= 'TemperatureSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1663:1: ( () otherlv_1= 'TemperatureSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1663:1: ( () otherlv_1= 'TemperatureSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1663:2: () otherlv_1= 'TemperatureSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1663:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1664:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemperatureSensorAccess().getTemperatureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleTemperatureSensor3898); 

                	newLeafNode(otherlv_1, grammarAccess.getTemperatureSensorAccess().getTemperatureSensorKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemperatureSensor"


    // $ANTLR start "entryRulePressureSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1681:1: entryRulePressureSensor returns [EObject current=null] : iv_rulePressureSensor= rulePressureSensor EOF ;
    public final EObject entryRulePressureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePressureSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1682:2: (iv_rulePressureSensor= rulePressureSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1683:2: iv_rulePressureSensor= rulePressureSensor EOF
            {
             newCompositeNode(grammarAccess.getPressureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_entryRulePressureSensor3934);
            iv_rulePressureSensor=rulePressureSensor();

            state._fsp--;

             current =iv_rulePressureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePressureSensor3944); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePressureSensor"


    // $ANTLR start "rulePressureSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1690:1: rulePressureSensor returns [EObject current=null] : ( () otherlv_1= 'PressureSensor' ) ;
    public final EObject rulePressureSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1693:28: ( ( () otherlv_1= 'PressureSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1694:1: ( () otherlv_1= 'PressureSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1694:1: ( () otherlv_1= 'PressureSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1694:2: () otherlv_1= 'PressureSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1694:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1695:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPressureSensorAccess().getPressureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_rulePressureSensor3990); 

                	newLeafNode(otherlv_1, grammarAccess.getPressureSensorAccess().getPressureSensorKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePressureSensor"


    // $ANTLR start "entryRuleHumiditySensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1712:1: entryRuleHumiditySensor returns [EObject current=null] : iv_ruleHumiditySensor= ruleHumiditySensor EOF ;
    public final EObject entryRuleHumiditySensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumiditySensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1713:2: (iv_ruleHumiditySensor= ruleHumiditySensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1714:2: iv_ruleHumiditySensor= ruleHumiditySensor EOF
            {
             newCompositeNode(grammarAccess.getHumiditySensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor4026);
            iv_ruleHumiditySensor=ruleHumiditySensor();

            state._fsp--;

             current =iv_ruleHumiditySensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumiditySensor4036); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHumiditySensor"


    // $ANTLR start "ruleHumiditySensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1721:1: ruleHumiditySensor returns [EObject current=null] : ( () otherlv_1= 'HumiditySensor' ) ;
    public final EObject ruleHumiditySensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1724:28: ( ( () otherlv_1= 'HumiditySensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1725:1: ( () otherlv_1= 'HumiditySensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1725:1: ( () otherlv_1= 'HumiditySensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1725:2: () otherlv_1= 'HumiditySensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1725:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1726:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumiditySensorAccess().getHumiditySensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleHumiditySensor4082); 

                	newLeafNode(otherlv_1, grammarAccess.getHumiditySensorAccess().getHumiditySensorKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHumiditySensor"


    // $ANTLR start "entryRuleChemicalSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1743:1: entryRuleChemicalSensor returns [EObject current=null] : iv_ruleChemicalSensor= ruleChemicalSensor EOF ;
    public final EObject entryRuleChemicalSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemicalSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1744:2: (iv_ruleChemicalSensor= ruleChemicalSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1745:2: iv_ruleChemicalSensor= ruleChemicalSensor EOF
            {
             newCompositeNode(grammarAccess.getChemicalSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChemicalSensor_in_entryRuleChemicalSensor4118);
            iv_ruleChemicalSensor=ruleChemicalSensor();

            state._fsp--;

             current =iv_ruleChemicalSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChemicalSensor4128); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChemicalSensor"


    // $ANTLR start "ruleChemicalSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1752:1: ruleChemicalSensor returns [EObject current=null] : ( () otherlv_1= 'ChemicalSensor' ) ;
    public final EObject ruleChemicalSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1755:28: ( ( () otherlv_1= 'ChemicalSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1756:1: ( () otherlv_1= 'ChemicalSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1756:1: ( () otherlv_1= 'ChemicalSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1756:2: () otherlv_1= 'ChemicalSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1756:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1757:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getChemicalSensorAccess().getChemicalSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleChemicalSensor4174); 

                	newLeafNode(otherlv_1, grammarAccess.getChemicalSensorAccess().getChemicalSensorKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChemicalSensor"


    // $ANTLR start "entryRuleUsbPort"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1774:1: entryRuleUsbPort returns [EObject current=null] : iv_ruleUsbPort= ruleUsbPort EOF ;
    public final EObject entryRuleUsbPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsbPort = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1775:2: (iv_ruleUsbPort= ruleUsbPort EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1776:2: iv_ruleUsbPort= ruleUsbPort EOF
            {
             newCompositeNode(grammarAccess.getUsbPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUsbPort_in_entryRuleUsbPort4210);
            iv_ruleUsbPort=ruleUsbPort();

            state._fsp--;

             current =iv_ruleUsbPort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUsbPort4220); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUsbPort"


    // $ANTLR start "ruleUsbPort"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1783:1: ruleUsbPort returns [EObject current=null] : ( () otherlv_1= 'UsbPort' ) ;
    public final EObject ruleUsbPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1786:28: ( ( () otherlv_1= 'UsbPort' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1787:1: ( () otherlv_1= 'UsbPort' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1787:1: ( () otherlv_1= 'UsbPort' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1787:2: () otherlv_1= 'UsbPort'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1787:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1788:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUsbPortAccess().getUsbPortAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleUsbPort4266); 

                	newLeafNode(otherlv_1, grammarAccess.getUsbPortAccess().getUsbPortKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUsbPort"


    // $ANTLR start "entryRuleSerialPort"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1805:1: entryRuleSerialPort returns [EObject current=null] : iv_ruleSerialPort= ruleSerialPort EOF ;
    public final EObject entryRuleSerialPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerialPort = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1806:2: (iv_ruleSerialPort= ruleSerialPort EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1807:2: iv_ruleSerialPort= ruleSerialPort EOF
            {
             newCompositeNode(grammarAccess.getSerialPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSerialPort_in_entryRuleSerialPort4302);
            iv_ruleSerialPort=ruleSerialPort();

            state._fsp--;

             current =iv_ruleSerialPort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSerialPort4312); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSerialPort"


    // $ANTLR start "ruleSerialPort"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1814:1: ruleSerialPort returns [EObject current=null] : ( () otherlv_1= 'SerialPort' ) ;
    public final EObject ruleSerialPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1817:28: ( ( () otherlv_1= 'SerialPort' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1818:1: ( () otherlv_1= 'SerialPort' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1818:1: ( () otherlv_1= 'SerialPort' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1818:2: () otherlv_1= 'SerialPort'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1818:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1819:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSerialPortAccess().getSerialPortAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSerialPort4358); 

                	newLeafNode(otherlv_1, grammarAccess.getSerialPortAccess().getSerialPortKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSerialPort"


    // $ANTLR start "entryRuleOutPort_Impl"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1836:1: entryRuleOutPort_Impl returns [EObject current=null] : iv_ruleOutPort_Impl= ruleOutPort_Impl EOF ;
    public final EObject entryRuleOutPort_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPort_Impl = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1837:2: (iv_ruleOutPort_Impl= ruleOutPort_Impl EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1838:2: iv_ruleOutPort_Impl= ruleOutPort_Impl EOF
            {
             newCompositeNode(grammarAccess.getOutPort_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutPort_Impl_in_entryRuleOutPort_Impl4394);
            iv_ruleOutPort_Impl=ruleOutPort_Impl();

            state._fsp--;

             current =iv_ruleOutPort_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOutPort_Impl4404); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutPort_Impl"


    // $ANTLR start "ruleOutPort_Impl"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1845:1: ruleOutPort_Impl returns [EObject current=null] : ( () otherlv_1= 'OutPort' ) ;
    public final EObject ruleOutPort_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1848:28: ( ( () otherlv_1= 'OutPort' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1849:1: ( () otherlv_1= 'OutPort' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1849:1: ( () otherlv_1= 'OutPort' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1849:2: () otherlv_1= 'OutPort'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1849:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1850:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOutPort_ImplAccess().getOutPortAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOutPort_Impl4450); 

                	newLeafNode(otherlv_1, grammarAccess.getOutPort_ImplAccess().getOutPortKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutPort_Impl"


    // $ANTLR start "entryRuleInPort_Impl"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1867:1: entryRuleInPort_Impl returns [EObject current=null] : iv_ruleInPort_Impl= ruleInPort_Impl EOF ;
    public final EObject entryRuleInPort_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPort_Impl = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1868:2: (iv_ruleInPort_Impl= ruleInPort_Impl EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1869:2: iv_ruleInPort_Impl= ruleInPort_Impl EOF
            {
             newCompositeNode(grammarAccess.getInPort_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInPort_Impl_in_entryRuleInPort_Impl4486);
            iv_ruleInPort_Impl=ruleInPort_Impl();

            state._fsp--;

             current =iv_ruleInPort_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInPort_Impl4496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInPort_Impl"


    // $ANTLR start "ruleInPort_Impl"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1876:1: ruleInPort_Impl returns [EObject current=null] : ( () otherlv_1= 'InPort' ) ;
    public final EObject ruleInPort_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1879:28: ( ( () otherlv_1= 'InPort' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1880:1: ( () otherlv_1= 'InPort' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1880:1: ( () otherlv_1= 'InPort' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1880:2: () otherlv_1= 'InPort'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1880:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1881:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInPort_ImplAccess().getInPortAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleInPort_Impl4542); 

                	newLeafNode(otherlv_1, grammarAccess.getInPort_ImplAccess().getInPortKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInPort_Impl"


    // $ANTLR start "entryRuleTransmitter"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1898:1: entryRuleTransmitter returns [EObject current=null] : iv_ruleTransmitter= ruleTransmitter EOF ;
    public final EObject entryRuleTransmitter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransmitter = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1899:2: (iv_ruleTransmitter= ruleTransmitter EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1900:2: iv_ruleTransmitter= ruleTransmitter EOF
            {
             newCompositeNode(grammarAccess.getTransmitterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransmitter_in_entryRuleTransmitter4578);
            iv_ruleTransmitter=ruleTransmitter();

            state._fsp--;

             current =iv_ruleTransmitter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransmitter4588); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransmitter"


    // $ANTLR start "ruleTransmitter"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1907:1: ruleTransmitter returns [EObject current=null] : ( () otherlv_1= 'Transmitter' ) ;
    public final EObject ruleTransmitter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1910:28: ( ( () otherlv_1= 'Transmitter' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1911:1: ( () otherlv_1= 'Transmitter' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1911:1: ( () otherlv_1= 'Transmitter' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1911:2: () otherlv_1= 'Transmitter'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1911:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1912:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransmitterAccess().getTransmitterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleTransmitter4634); 

                	newLeafNode(otherlv_1, grammarAccess.getTransmitterAccess().getTransmitterKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransmitter"


    // $ANTLR start "entryRuleReciever"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1929:1: entryRuleReciever returns [EObject current=null] : iv_ruleReciever= ruleReciever EOF ;
    public final EObject entryRuleReciever() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReciever = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1930:2: (iv_ruleReciever= ruleReciever EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1931:2: iv_ruleReciever= ruleReciever EOF
            {
             newCompositeNode(grammarAccess.getRecieverRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReciever_in_entryRuleReciever4670);
            iv_ruleReciever=ruleReciever();

            state._fsp--;

             current =iv_ruleReciever; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReciever4680); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReciever"


    // $ANTLR start "ruleReciever"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1938:1: ruleReciever returns [EObject current=null] : ( () otherlv_1= 'Reciever' ) ;
    public final EObject ruleReciever() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1941:28: ( ( () otherlv_1= 'Reciever' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1942:1: ( () otherlv_1= 'Reciever' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1942:1: ( () otherlv_1= 'Reciever' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1942:2: () otherlv_1= 'Reciever'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1942:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1943:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRecieverAccess().getRecieverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleReciever4726); 

                	newLeafNode(otherlv_1, grammarAccess.getRecieverAccess().getRecieverKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReciever"


    // $ANTLR start "entryRuleSensorNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1960:1: entryRuleSensorNode returns [EObject current=null] : iv_ruleSensorNode= ruleSensorNode EOF ;
    public final EObject entryRuleSensorNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1961:2: (iv_ruleSensorNode= ruleSensorNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1962:2: iv_ruleSensorNode= ruleSensorNode EOF
            {
             newCompositeNode(grammarAccess.getSensorNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensorNode_in_entryRuleSensorNode4762);
            iv_ruleSensorNode=ruleSensorNode();

            state._fsp--;

             current =iv_ruleSensorNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensorNode4772); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorNode"


    // $ANTLR start "ruleSensorNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1969:1: ruleSensorNode returns [EObject current=null] : ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) ;
    public final EObject ruleSensorNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1972:28: ( ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1973:1: ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1973:1: ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1973:2: () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1973:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1974:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorNodeAccess().getSensorNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSensorNode4818); 

                	newLeafNode(otherlv_1, grammarAccess.getSensorNodeAccess().getSensorNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSensorNode4830); 

                	newLeafNode(otherlv_2, grammarAccess.getSensorNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1987:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==13) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1987:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSensorNode4843); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1991:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1992:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1992:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:1993:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSensorNode4864);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSensorNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2009:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==20) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2009:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSensorNode4879); 

                        	newLeafNode(otherlv_5, grammarAccess.getSensorNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2013:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2014:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2014:1: (lv_position_6_0= rulePosition )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2015:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleSensorNode4900);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSensorNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_6_0, 
                            		"Position");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2031:4: (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2031:6: otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSensorNode4915); 

                        	newLeafNode(otherlv_7, grammarAccess.getSensorNodeAccess().getPortsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSensorNode4927); 

                        	newLeafNode(otherlv_8, grammarAccess.getSensorNodeAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2039:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2040:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2040:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2041:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorNodeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getPortsAbstractPortCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSensorNode4950);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2054:2: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==16) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2054:4: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSensorNode4963); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSensorNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2058:1: ( ( ruleEString ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2059:1: ( ruleEString )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2059:1: ( ruleEString )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2060:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSensorNodeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getPortsAbstractPortCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSensorNode4986);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSensorNode5000); 

                        	newLeafNode(otherlv_12, grammarAccess.getSensorNodeAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2077:3: (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==24) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2077:5: otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSensorNode5015); 

                        	newLeafNode(otherlv_13, grammarAccess.getSensorNodeAccess().getSensorsKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSensorNode5027); 

                        	newLeafNode(otherlv_14, grammarAccess.getSensorNodeAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2085:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2086:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2086:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2087:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorNodeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getSensorsAbstractSensorCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSensorNode5050);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2100:2: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==16) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2100:4: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSensorNode5063); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getSensorNodeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2104:1: ( ( ruleEString ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2105:1: ( ruleEString )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2105:1: ( ruleEString )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2106:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSensorNodeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getSensorsAbstractSensorCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSensorNode5086);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSensorNode5100); 

                        	newLeafNode(otherlv_18, grammarAccess.getSensorNodeAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSensorNode5114); 

                	newLeafNode(otherlv_19, grammarAccess.getSensorNodeAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorNode"


    // $ANTLR start "entryRuleComputationNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2135:1: entryRuleComputationNode returns [EObject current=null] : iv_ruleComputationNode= ruleComputationNode EOF ;
    public final EObject entryRuleComputationNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2136:2: (iv_ruleComputationNode= ruleComputationNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2137:2: iv_ruleComputationNode= ruleComputationNode EOF
            {
             newCompositeNode(grammarAccess.getComputationNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComputationNode_in_entryRuleComputationNode5150);
            iv_ruleComputationNode=ruleComputationNode();

            state._fsp--;

             current =iv_ruleComputationNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComputationNode5160); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComputationNode"


    // $ANTLR start "ruleComputationNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2144:1: ruleComputationNode returns [EObject current=null] : ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) ;
    public final EObject ruleComputationNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2147:28: ( ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2148:1: ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2148:1: ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2148:2: () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2148:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2149:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComputationNodeAccess().getComputationNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleComputationNode5206); 

                	newLeafNode(otherlv_1, grammarAccess.getComputationNodeAccess().getComputationNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComputationNode5218); 

                	newLeafNode(otherlv_2, grammarAccess.getComputationNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2162:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==13) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2162:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleComputationNode5231); 

                        	newLeafNode(otherlv_3, grammarAccess.getComputationNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2166:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2167:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2167:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2168:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleComputationNode5252);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComputationNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2184:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==20) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2184:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleComputationNode5267); 

                        	newLeafNode(otherlv_5, grammarAccess.getComputationNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2188:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2189:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2189:1: (lv_position_6_0= rulePosition )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2190:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleComputationNode5288);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComputationNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_6_0, 
                            		"Position");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2206:4: (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==21) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2206:6: otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleComputationNode5303); 

                        	newLeafNode(otherlv_7, grammarAccess.getComputationNodeAccess().getPortsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleComputationNode5315); 

                        	newLeafNode(otherlv_8, grammarAccess.getComputationNodeAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2214:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2215:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2215:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2216:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComputationNodeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getPortsAbstractPortCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComputationNode5338);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2229:2: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==16) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2229:4: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComputationNode5351); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getComputationNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2233:1: ( ( ruleEString ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2234:1: ( ruleEString )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2234:1: ( ruleEString )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2235:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getComputationNodeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getPortsAbstractPortCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComputationNode5374);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleComputationNode5388); 

                        	newLeafNode(otherlv_12, grammarAccess.getComputationNodeAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2252:3: (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==24) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2252:5: otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleComputationNode5403); 

                        	newLeafNode(otherlv_13, grammarAccess.getComputationNodeAccess().getSensorsKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleComputationNode5415); 

                        	newLeafNode(otherlv_14, grammarAccess.getComputationNodeAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2260:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2261:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2261:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2262:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComputationNodeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getSensorsAbstractSensorCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComputationNode5438);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2275:2: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==16) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2275:4: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComputationNode5451); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getComputationNodeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2279:1: ( ( ruleEString ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2280:1: ( ruleEString )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2280:1: ( ruleEString )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2281:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getComputationNodeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getSensorsAbstractSensorCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComputationNode5474);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleComputationNode5488); 

                        	newLeafNode(otherlv_18, grammarAccess.getComputationNodeAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComputationNode5502); 

                	newLeafNode(otherlv_19, grammarAccess.getComputationNodeAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComputationNode"


    // $ANTLR start "entryRuleCluster"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2310:1: entryRuleCluster returns [EObject current=null] : iv_ruleCluster= ruleCluster EOF ;
    public final EObject entryRuleCluster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCluster = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2311:2: (iv_ruleCluster= ruleCluster EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2312:2: iv_ruleCluster= ruleCluster EOF
            {
             newCompositeNode(grammarAccess.getClusterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCluster_in_entryRuleCluster5538);
            iv_ruleCluster=ruleCluster();

            state._fsp--;

             current =iv_ruleCluster; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCluster5548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCluster"


    // $ANTLR start "ruleCluster"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2319:1: ruleCluster returns [EObject current=null] : ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'head' ( (lv_head_12_0= ruleClusterHeadNode ) ) )? (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleAbstractClusterNode ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleCluster() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_head_12_0 = null;

        EObject lv_nodes_15_0 = null;

        EObject lv_nodes_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2322:28: ( ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'head' ( (lv_head_12_0= ruleClusterHeadNode ) ) )? (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleAbstractClusterNode ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2323:1: ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'head' ( (lv_head_12_0= ruleClusterHeadNode ) ) )? (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleAbstractClusterNode ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2323:1: ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'head' ( (lv_head_12_0= ruleClusterHeadNode ) ) )? (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleAbstractClusterNode ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2323:2: () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'head' ( (lv_head_12_0= ruleClusterHeadNode ) ) )? (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleAbstractClusterNode ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2323:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2324:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClusterAccess().getClusterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleCluster5594); 

                	newLeafNode(otherlv_1, grammarAccess.getClusterAccess().getClusterKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCluster5606); 

                	newLeafNode(otherlv_2, grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2337:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==13) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2337:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCluster5619); 

                        	newLeafNode(otherlv_3, grammarAccess.getClusterAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2341:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2342:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2342:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2343:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCluster5640);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2359:4: (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2359:6: otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleCluster5655); 

                        	newLeafNode(otherlv_5, grammarAccess.getClusterAccess().getResourcesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCluster5667); 

                        	newLeafNode(otherlv_6, grammarAccess.getClusterAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2367:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2368:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2368:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2369:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClusterRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getResourcesAbstractResourceCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCluster5690);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2382:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==16) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2382:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCluster5703); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getClusterAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2386:1: ( ( ruleEString ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2387:1: ( ruleEString )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2387:1: ( ruleEString )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2388:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getClusterRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusterAccess().getResourcesAbstractResourceCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCluster5726);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCluster5740); 

                        	newLeafNode(otherlv_10, grammarAccess.getClusterAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2405:3: (otherlv_11= 'head' ( (lv_head_12_0= ruleClusterHeadNode ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==51) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2405:5: otherlv_11= 'head' ( (lv_head_12_0= ruleClusterHeadNode ) )
                    {
                    otherlv_11=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleCluster5755); 

                        	newLeafNode(otherlv_11, grammarAccess.getClusterAccess().getHeadKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2409:1: ( (lv_head_12_0= ruleClusterHeadNode ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2410:1: (lv_head_12_0= ruleClusterHeadNode )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2410:1: (lv_head_12_0= ruleClusterHeadNode )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2411:3: lv_head_12_0= ruleClusterHeadNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getHeadClusterHeadNodeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleClusterHeadNode_in_ruleCluster5776);
                    lv_head_12_0=ruleClusterHeadNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterRule());
                    	        }
                           		set(
                           			current, 
                           			"head",
                            		lv_head_12_0, 
                            		"ClusterHeadNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2427:4: (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleAbstractClusterNode ) ) )* otherlv_18= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==30) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2427:6: otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleAbstractClusterNode ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCluster5791); 

                        	newLeafNode(otherlv_13, grammarAccess.getClusterAccess().getNodesKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCluster5803); 

                        	newLeafNode(otherlv_14, grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2435:1: ( (lv_nodes_15_0= ruleAbstractClusterNode ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2436:1: (lv_nodes_15_0= ruleAbstractClusterNode )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2436:1: (lv_nodes_15_0= ruleAbstractClusterNode )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2437:3: lv_nodes_15_0= ruleAbstractClusterNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getNodesAbstractClusterNodeParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractClusterNode_in_ruleCluster5824);
                    lv_nodes_15_0=ruleAbstractClusterNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_15_0, 
                            		"AbstractClusterNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2453:2: (otherlv_16= ',' ( (lv_nodes_17_0= ruleAbstractClusterNode ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==16) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2453:4: otherlv_16= ',' ( (lv_nodes_17_0= ruleAbstractClusterNode ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCluster5837); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getClusterAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2457:1: ( (lv_nodes_17_0= ruleAbstractClusterNode ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2458:1: (lv_nodes_17_0= ruleAbstractClusterNode )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2458:1: (lv_nodes_17_0= ruleAbstractClusterNode )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2459:3: lv_nodes_17_0= ruleAbstractClusterNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusterAccess().getNodesAbstractClusterNodeParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractClusterNode_in_ruleCluster5858);
                    	    lv_nodes_17_0=ruleAbstractClusterNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_17_0, 
                    	            		"AbstractClusterNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCluster5872); 

                        	newLeafNode(otherlv_18, grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCluster5886); 

                	newLeafNode(otherlv_19, grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCluster"


    // $ANTLR start "entryRuleClusterHeadNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2491:1: entryRuleClusterHeadNode returns [EObject current=null] : iv_ruleClusterHeadNode= ruleClusterHeadNode EOF ;
    public final EObject entryRuleClusterHeadNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClusterHeadNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2492:2: (iv_ruleClusterHeadNode= ruleClusterHeadNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2493:2: iv_ruleClusterHeadNode= ruleClusterHeadNode EOF
            {
             newCompositeNode(grammarAccess.getClusterHeadNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClusterHeadNode_in_entryRuleClusterHeadNode5922);
            iv_ruleClusterHeadNode=ruleClusterHeadNode();

            state._fsp--;

             current =iv_ruleClusterHeadNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClusterHeadNode5932); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClusterHeadNode"


    // $ANTLR start "ruleClusterHeadNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2500:1: ruleClusterHeadNode returns [EObject current=null] : ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) ;
    public final EObject ruleClusterHeadNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2503:28: ( ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2504:1: ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2504:1: ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2504:2: () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2504:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2505:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClusterHeadNodeAccess().getClusterHeadNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleClusterHeadNode5978); 

                	newLeafNode(otherlv_1, grammarAccess.getClusterHeadNodeAccess().getClusterHeadNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusterHeadNode5990); 

                	newLeafNode(otherlv_2, grammarAccess.getClusterHeadNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2518:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==13) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2518:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClusterHeadNode6003); 

                        	newLeafNode(otherlv_3, grammarAccess.getClusterHeadNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2522:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2523:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2523:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2524:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleClusterHeadNode6024);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterHeadNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2540:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==20) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2540:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleClusterHeadNode6039); 

                        	newLeafNode(otherlv_5, grammarAccess.getClusterHeadNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2544:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2545:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2545:1: (lv_position_6_0= rulePosition )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2546:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleClusterHeadNode6060);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterHeadNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_6_0, 
                            		"Position");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2562:4: (otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==21) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2562:6: otherlv_7= 'ports' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleClusterHeadNode6075); 

                        	newLeafNode(otherlv_7, grammarAccess.getClusterHeadNodeAccess().getPortsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleClusterHeadNode6087); 

                        	newLeafNode(otherlv_8, grammarAccess.getClusterHeadNodeAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2570:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2571:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2571:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2572:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClusterHeadNodeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getPortsAbstractPortCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClusterHeadNode6110);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2585:2: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==16) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2585:4: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusterHeadNode6123); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getClusterHeadNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2589:1: ( ( ruleEString ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2590:1: ( ruleEString )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2590:1: ( ruleEString )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2591:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getClusterHeadNodeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getPortsAbstractPortCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClusterHeadNode6146);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleClusterHeadNode6160); 

                        	newLeafNode(otherlv_12, grammarAccess.getClusterHeadNodeAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2608:3: (otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==24) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2608:5: otherlv_13= 'sensors' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleClusterHeadNode6175); 

                        	newLeafNode(otherlv_13, grammarAccess.getClusterHeadNodeAccess().getSensorsKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleClusterHeadNode6187); 

                        	newLeafNode(otherlv_14, grammarAccess.getClusterHeadNodeAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2616:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2617:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2617:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2618:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClusterHeadNodeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getSensorsAbstractSensorCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClusterHeadNode6210);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2631:2: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==16) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2631:4: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusterHeadNode6223); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getClusterHeadNodeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2635:1: ( ( ruleEString ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2636:1: ( ruleEString )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2636:1: ( ruleEString )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2637:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getClusterHeadNodeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getSensorsAbstractSensorCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClusterHeadNode6246);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleClusterHeadNode6260); 

                        	newLeafNode(otherlv_18, grammarAccess.getClusterHeadNodeAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClusterHeadNode6274); 

                	newLeafNode(otherlv_19, grammarAccess.getClusterHeadNodeAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClusterHeadNode"


    // $ANTLR start "entryRuleContinuousJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2666:1: entryRuleContinuousJob returns [EObject current=null] : iv_ruleContinuousJob= ruleContinuousJob EOF ;
    public final EObject entryRuleContinuousJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinuousJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2667:2: (iv_ruleContinuousJob= ruleContinuousJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2668:2: iv_ruleContinuousJob= ruleContinuousJob EOF
            {
             newCompositeNode(grammarAccess.getContinuousJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContinuousJob_in_entryRuleContinuousJob6310);
            iv_ruleContinuousJob=ruleContinuousJob();

            state._fsp--;

             current =iv_ruleContinuousJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContinuousJob6320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContinuousJob"


    // $ANTLR start "ruleContinuousJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2675:1: ruleContinuousJob returns [EObject current=null] : ( () otherlv_1= 'ContinuousJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleContinuousJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_action_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2678:28: ( ( () otherlv_1= 'ContinuousJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? otherlv_7= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2679:1: ( () otherlv_1= 'ContinuousJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? otherlv_7= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2679:1: ( () otherlv_1= 'ContinuousJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? otherlv_7= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2679:2: () otherlv_1= 'ContinuousJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? otherlv_7= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2679:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2680:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContinuousJobAccess().getContinuousJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleContinuousJob6366); 

                	newLeafNode(otherlv_1, grammarAccess.getContinuousJobAccess().getContinuousJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContinuousJob6378); 

                	newLeafNode(otherlv_2, grammarAccess.getContinuousJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2693:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==13) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2693:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContinuousJob6391); 

                        	newLeafNode(otherlv_3, grammarAccess.getContinuousJobAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2697:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2698:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2698:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2699:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getContinuousJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleContinuousJob6412);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContinuousJobRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2715:4: (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==54) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2715:6: otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) )
                    {
                    otherlv_5=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleContinuousJob6427); 

                        	newLeafNode(otherlv_5, grammarAccess.getContinuousJobAccess().getActionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2719:1: ( (lv_action_6_0= ruleAbstractJobAction ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2720:1: (lv_action_6_0= ruleAbstractJobAction )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2720:1: (lv_action_6_0= ruleAbstractJobAction )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2721:3: lv_action_6_0= ruleAbstractJobAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getContinuousJobAccess().getActionAbstractJobActionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractJobAction_in_ruleContinuousJob6448);
                    lv_action_6_0=ruleAbstractJobAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContinuousJobRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_6_0, 
                            		"AbstractJobAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContinuousJob6462); 

                	newLeafNode(otherlv_7, grammarAccess.getContinuousJobAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContinuousJob"


    // $ANTLR start "entryRuleEventDrivenJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2749:1: entryRuleEventDrivenJob returns [EObject current=null] : iv_ruleEventDrivenJob= ruleEventDrivenJob EOF ;
    public final EObject entryRuleEventDrivenJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDrivenJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2750:2: (iv_ruleEventDrivenJob= ruleEventDrivenJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2751:2: iv_ruleEventDrivenJob= ruleEventDrivenJob EOF
            {
             newCompositeNode(grammarAccess.getEventDrivenJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEventDrivenJob_in_entryRuleEventDrivenJob6498);
            iv_ruleEventDrivenJob=ruleEventDrivenJob();

            state._fsp--;

             current =iv_ruleEventDrivenJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEventDrivenJob6508); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventDrivenJob"


    // $ANTLR start "ruleEventDrivenJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2758:1: ruleEventDrivenJob returns [EObject current=null] : ( () otherlv_1= 'EventDrivenJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? (otherlv_7= 'eventCondition' ( (lv_eventCondition_8_0= ruleLogicalCondition ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleEventDrivenJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_action_6_0 = null;

        EObject lv_eventCondition_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2761:28: ( ( () otherlv_1= 'EventDrivenJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? (otherlv_7= 'eventCondition' ( (lv_eventCondition_8_0= ruleLogicalCondition ) ) )? otherlv_9= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2762:1: ( () otherlv_1= 'EventDrivenJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? (otherlv_7= 'eventCondition' ( (lv_eventCondition_8_0= ruleLogicalCondition ) ) )? otherlv_9= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2762:1: ( () otherlv_1= 'EventDrivenJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? (otherlv_7= 'eventCondition' ( (lv_eventCondition_8_0= ruleLogicalCondition ) ) )? otherlv_9= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2762:2: () otherlv_1= 'EventDrivenJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? (otherlv_7= 'eventCondition' ( (lv_eventCondition_8_0= ruleLogicalCondition ) ) )? otherlv_9= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2762:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2763:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventDrivenJobAccess().getEventDrivenJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleEventDrivenJob6554); 

                	newLeafNode(otherlv_1, grammarAccess.getEventDrivenJobAccess().getEventDrivenJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEventDrivenJob6566); 

                	newLeafNode(otherlv_2, grammarAccess.getEventDrivenJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2776:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==13) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2776:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEventDrivenJob6579); 

                        	newLeafNode(otherlv_3, grammarAccess.getEventDrivenJobAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2780:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2781:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2781:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2782:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventDrivenJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEventDrivenJob6600);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventDrivenJobRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2798:4: (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==54) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2798:6: otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) )
                    {
                    otherlv_5=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEventDrivenJob6615); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventDrivenJobAccess().getActionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2802:1: ( (lv_action_6_0= ruleAbstractJobAction ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2803:1: (lv_action_6_0= ruleAbstractJobAction )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2803:1: (lv_action_6_0= ruleAbstractJobAction )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2804:3: lv_action_6_0= ruleAbstractJobAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventDrivenJobAccess().getActionAbstractJobActionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractJobAction_in_ruleEventDrivenJob6636);
                    lv_action_6_0=ruleAbstractJobAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventDrivenJobRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_6_0, 
                            		"AbstractJobAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2820:4: (otherlv_7= 'eventCondition' ( (lv_eventCondition_8_0= ruleLogicalCondition ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==56) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2820:6: otherlv_7= 'eventCondition' ( (lv_eventCondition_8_0= ruleLogicalCondition ) )
                    {
                    otherlv_7=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleEventDrivenJob6651); 

                        	newLeafNode(otherlv_7, grammarAccess.getEventDrivenJobAccess().getEventConditionKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2824:1: ( (lv_eventCondition_8_0= ruleLogicalCondition ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2825:1: (lv_eventCondition_8_0= ruleLogicalCondition )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2825:1: (lv_eventCondition_8_0= ruleLogicalCondition )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2826:3: lv_eventCondition_8_0= ruleLogicalCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventDrivenJobAccess().getEventConditionLogicalConditionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalCondition_in_ruleEventDrivenJob6672);
                    lv_eventCondition_8_0=ruleLogicalCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventDrivenJobRule());
                    	        }
                           		set(
                           			current, 
                           			"eventCondition",
                            		lv_eventCondition_8_0, 
                            		"LogicalCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEventDrivenJob6686); 

                	newLeafNode(otherlv_9, grammarAccess.getEventDrivenJobAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventDrivenJob"


    // $ANTLR start "entryRulePeriodicJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2854:1: entryRulePeriodicJob returns [EObject current=null] : iv_rulePeriodicJob= rulePeriodicJob EOF ;
    public final EObject entryRulePeriodicJob() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodicJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2855:2: (iv_rulePeriodicJob= rulePeriodicJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2856:2: iv_rulePeriodicJob= rulePeriodicJob EOF
            {
             newCompositeNode(grammarAccess.getPeriodicJobRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicJob_in_entryRulePeriodicJob6722);
            iv_rulePeriodicJob=rulePeriodicJob();

            state._fsp--;

             current =iv_rulePeriodicJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePeriodicJob6732); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePeriodicJob"


    // $ANTLR start "rulePeriodicJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2863:1: rulePeriodicJob returns [EObject current=null] : ( () otherlv_1= 'PeriodicJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'timer' ( (lv_timer_6_0= ruleELong ) ) )? (otherlv_7= 'action' ( (lv_action_8_0= ruleAbstractJobAction ) ) )? otherlv_9= '}' ) ;
    public final EObject rulePeriodicJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_timer_6_0 = null;

        EObject lv_action_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2866:28: ( ( () otherlv_1= 'PeriodicJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'timer' ( (lv_timer_6_0= ruleELong ) ) )? (otherlv_7= 'action' ( (lv_action_8_0= ruleAbstractJobAction ) ) )? otherlv_9= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2867:1: ( () otherlv_1= 'PeriodicJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'timer' ( (lv_timer_6_0= ruleELong ) ) )? (otherlv_7= 'action' ( (lv_action_8_0= ruleAbstractJobAction ) ) )? otherlv_9= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2867:1: ( () otherlv_1= 'PeriodicJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'timer' ( (lv_timer_6_0= ruleELong ) ) )? (otherlv_7= 'action' ( (lv_action_8_0= ruleAbstractJobAction ) ) )? otherlv_9= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2867:2: () otherlv_1= 'PeriodicJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'timer' ( (lv_timer_6_0= ruleELong ) ) )? (otherlv_7= 'action' ( (lv_action_8_0= ruleAbstractJobAction ) ) )? otherlv_9= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2867:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2868:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPeriodicJobAccess().getPeriodicJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePeriodicJob6778); 

                	newLeafNode(otherlv_1, grammarAccess.getPeriodicJobAccess().getPeriodicJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeriodicJob6790); 

                	newLeafNode(otherlv_2, grammarAccess.getPeriodicJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2881:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==13) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2881:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePeriodicJob6803); 

                        	newLeafNode(otherlv_3, grammarAccess.getPeriodicJobAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2885:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2886:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2886:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2887:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePeriodicJob6824);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicJobRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2903:4: (otherlv_5= 'timer' ( (lv_timer_6_0= ruleELong ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==58) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2903:6: otherlv_5= 'timer' ( (lv_timer_6_0= ruleELong ) )
                    {
                    otherlv_5=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulePeriodicJob6839); 

                        	newLeafNode(otherlv_5, grammarAccess.getPeriodicJobAccess().getTimerKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2907:1: ( (lv_timer_6_0= ruleELong ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2908:1: (lv_timer_6_0= ruleELong )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2908:1: (lv_timer_6_0= ruleELong )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2909:3: lv_timer_6_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicJobAccess().getTimerELongParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_rulePeriodicJob6860);
                    lv_timer_6_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicJobRule());
                    	        }
                           		set(
                           			current, 
                           			"timer",
                            		lv_timer_6_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2925:4: (otherlv_7= 'action' ( (lv_action_8_0= ruleAbstractJobAction ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==54) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2925:6: otherlv_7= 'action' ( (lv_action_8_0= ruleAbstractJobAction ) )
                    {
                    otherlv_7=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePeriodicJob6875); 

                        	newLeafNode(otherlv_7, grammarAccess.getPeriodicJobAccess().getActionKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2929:1: ( (lv_action_8_0= ruleAbstractJobAction ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2930:1: (lv_action_8_0= ruleAbstractJobAction )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2930:1: (lv_action_8_0= ruleAbstractJobAction )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2931:3: lv_action_8_0= ruleAbstractJobAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicJobAccess().getActionAbstractJobActionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractJobAction_in_rulePeriodicJob6896);
                    lv_action_8_0=ruleAbstractJobAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicJobRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_8_0, 
                            		"AbstractJobAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePeriodicJob6910); 

                	newLeafNode(otherlv_9, grammarAccess.getPeriodicJobAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePeriodicJob"


    // $ANTLR start "entryRuleRequestReplayJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2959:1: entryRuleRequestReplayJob returns [EObject current=null] : iv_ruleRequestReplayJob= ruleRequestReplayJob EOF ;
    public final EObject entryRuleRequestReplayJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestReplayJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2960:2: (iv_ruleRequestReplayJob= ruleRequestReplayJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2961:2: iv_ruleRequestReplayJob= ruleRequestReplayJob EOF
            {
             newCompositeNode(grammarAccess.getRequestReplayJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequestReplayJob_in_entryRuleRequestReplayJob6946);
            iv_ruleRequestReplayJob=ruleRequestReplayJob();

            state._fsp--;

             current =iv_ruleRequestReplayJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequestReplayJob6956); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequestReplayJob"


    // $ANTLR start "ruleRequestReplayJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2968:1: ruleRequestReplayJob returns [EObject current=null] : ( () otherlv_1= 'RequestReplayJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRequestReplayJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_action_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2971:28: ( ( () otherlv_1= 'RequestReplayJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? otherlv_7= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2972:1: ( () otherlv_1= 'RequestReplayJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? otherlv_7= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2972:1: ( () otherlv_1= 'RequestReplayJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? otherlv_7= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2972:2: () otherlv_1= 'RequestReplayJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )? otherlv_7= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2972:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2973:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequestReplayJobAccess().getRequestReplayJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleRequestReplayJob7002); 

                	newLeafNode(otherlv_1, grammarAccess.getRequestReplayJobAccess().getRequestReplayJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRequestReplayJob7014); 

                	newLeafNode(otherlv_2, grammarAccess.getRequestReplayJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2986:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==13) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2986:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRequestReplayJob7027); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequestReplayJobAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2990:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2991:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2991:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:2992:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequestReplayJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRequestReplayJob7048);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequestReplayJobRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3008:4: (otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==54) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3008:6: otherlv_5= 'action' ( (lv_action_6_0= ruleAbstractJobAction ) )
                    {
                    otherlv_5=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleRequestReplayJob7063); 

                        	newLeafNode(otherlv_5, grammarAccess.getRequestReplayJobAccess().getActionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3012:1: ( (lv_action_6_0= ruleAbstractJobAction ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3013:1: (lv_action_6_0= ruleAbstractJobAction )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3013:1: (lv_action_6_0= ruleAbstractJobAction )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3014:3: lv_action_6_0= ruleAbstractJobAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequestReplayJobAccess().getActionAbstractJobActionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractJobAction_in_ruleRequestReplayJob7084);
                    lv_action_6_0=ruleAbstractJobAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequestReplayJobRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_6_0, 
                            		"AbstractJobAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRequestReplayJob7098); 

                	newLeafNode(otherlv_7, grammarAccess.getRequestReplayJobAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequestReplayJob"


    // $ANTLR start "entryRuleSenseForwardAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3042:1: entryRuleSenseForwardAction returns [EObject current=null] : iv_ruleSenseForwardAction= ruleSenseForwardAction EOF ;
    public final EObject entryRuleSenseForwardAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenseForwardAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3043:2: (iv_ruleSenseForwardAction= ruleSenseForwardAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3044:2: iv_ruleSenseForwardAction= ruleSenseForwardAction EOF
            {
             newCompositeNode(grammarAccess.getSenseForwardActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSenseForwardAction_in_entryRuleSenseForwardAction7134);
            iv_ruleSenseForwardAction=ruleSenseForwardAction();

            state._fsp--;

             current =iv_ruleSenseForwardAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSenseForwardAction7144); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSenseForwardAction"


    // $ANTLR start "ruleSenseForwardAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3051:1: ruleSenseForwardAction returns [EObject current=null] : ( () otherlv_1= 'SenseForwardAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleSenseForwardAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3054:28: ( ( () otherlv_1= 'SenseForwardAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3055:1: ( () otherlv_1= 'SenseForwardAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3055:1: ( () otherlv_1= 'SenseForwardAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3055:2: () otherlv_1= 'SenseForwardAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3055:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3056:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSenseForwardActionAccess().getSenseForwardActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleSenseForwardAction7190); 

                	newLeafNode(otherlv_1, grammarAccess.getSenseForwardActionAccess().getSenseForwardActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseForwardAction7202); 

                	newLeafNode(otherlv_2, grammarAccess.getSenseForwardActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3069:1: (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==61) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3069:3: otherlv_3= 'sinkNode' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleSenseForwardAction7215); 

                        	newLeafNode(otherlv_3, grammarAccess.getSenseForwardActionAccess().getSinkNodeKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3073:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3074:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3074:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3075:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSenseForwardActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSenseForwardActionAccess().getSinkNodeSinkNodeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSenseForwardAction7238);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3088:4: (otherlv_5= 'targetNode' ( ( ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==62) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3088:6: otherlv_5= 'targetNode' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleSenseForwardAction7253); 

                        	newLeafNode(otherlv_5, grammarAccess.getSenseForwardActionAccess().getTargetNodeKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3092:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3093:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3093:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3094:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSenseForwardActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSenseForwardActionAccess().getTargetNodeAbstractNodeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSenseForwardAction7276);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSenseForwardAction7290); 

                	newLeafNode(otherlv_7, grammarAccess.getSenseForwardActionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSenseForwardAction"


    // $ANTLR start "entryRuleAggregationAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3119:1: entryRuleAggregationAction returns [EObject current=null] : iv_ruleAggregationAction= ruleAggregationAction EOF ;
    public final EObject entryRuleAggregationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregationAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3120:2: (iv_ruleAggregationAction= ruleAggregationAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3121:2: iv_ruleAggregationAction= ruleAggregationAction EOF
            {
             newCompositeNode(grammarAccess.getAggregationActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAggregationAction_in_entryRuleAggregationAction7326);
            iv_ruleAggregationAction=ruleAggregationAction();

            state._fsp--;

             current =iv_ruleAggregationAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAggregationAction7336); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAggregationAction"


    // $ANTLR start "ruleAggregationAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3128:1: ruleAggregationAction returns [EObject current=null] : ( () otherlv_1= 'AggregationAction' otherlv_2= '{' (otherlv_3= 'aggregation' ( (lv_aggregation_4_0= ruleAggregation ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'targetNode' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleAggregationAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_aggregation_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3131:28: ( ( () otherlv_1= 'AggregationAction' otherlv_2= '{' (otherlv_3= 'aggregation' ( (lv_aggregation_4_0= ruleAggregation ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'targetNode' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3132:1: ( () otherlv_1= 'AggregationAction' otherlv_2= '{' (otherlv_3= 'aggregation' ( (lv_aggregation_4_0= ruleAggregation ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'targetNode' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3132:1: ( () otherlv_1= 'AggregationAction' otherlv_2= '{' (otherlv_3= 'aggregation' ( (lv_aggregation_4_0= ruleAggregation ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'targetNode' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3132:2: () otherlv_1= 'AggregationAction' otherlv_2= '{' (otherlv_3= 'aggregation' ( (lv_aggregation_4_0= ruleAggregation ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'targetNode' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3132:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3133:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAggregationActionAccess().getAggregationActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleAggregationAction7382); 

                	newLeafNode(otherlv_1, grammarAccess.getAggregationActionAccess().getAggregationActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAggregationAction7394); 

                	newLeafNode(otherlv_2, grammarAccess.getAggregationActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3146:1: (otherlv_3= 'aggregation' ( (lv_aggregation_4_0= ruleAggregation ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==64) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3146:3: otherlv_3= 'aggregation' ( (lv_aggregation_4_0= ruleAggregation ) )
                    {
                    otherlv_3=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleAggregationAction7407); 

                        	newLeafNode(otherlv_3, grammarAccess.getAggregationActionAccess().getAggregationKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3150:1: ( (lv_aggregation_4_0= ruleAggregation ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3151:1: (lv_aggregation_4_0= ruleAggregation )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3151:1: (lv_aggregation_4_0= ruleAggregation )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3152:3: lv_aggregation_4_0= ruleAggregation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAggregationActionAccess().getAggregationAggregationEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAggregation_in_ruleAggregationAction7428);
                    lv_aggregation_4_0=ruleAggregation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAggregationActionRule());
                    	        }
                           		set(
                           			current, 
                           			"aggregation",
                            		lv_aggregation_4_0, 
                            		"Aggregation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3168:4: (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==61) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3168:6: otherlv_5= 'sinkNode' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleAggregationAction7443); 

                        	newLeafNode(otherlv_5, grammarAccess.getAggregationActionAccess().getSinkNodeKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3172:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3173:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3173:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3174:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAggregationActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAggregationActionAccess().getSinkNodeSinkNodeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAggregationAction7466);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3187:4: (otherlv_7= 'targetNode' ( ( ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==62) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3187:6: otherlv_7= 'targetNode' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleAggregationAction7481); 

                        	newLeafNode(otherlv_7, grammarAccess.getAggregationActionAccess().getTargetNodeKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3191:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3192:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3192:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3193:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAggregationActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAggregationActionAccess().getTargetNodeAbstractNodeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAggregationAction7504);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAggregationAction7518); 

                	newLeafNode(otherlv_9, grammarAccess.getAggregationActionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAggregationAction"


    // $ANTLR start "entryRuleFusionAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3218:1: entryRuleFusionAction returns [EObject current=null] : iv_ruleFusionAction= ruleFusionAction EOF ;
    public final EObject entryRuleFusionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFusionAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3219:2: (iv_ruleFusionAction= ruleFusionAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3220:2: iv_ruleFusionAction= ruleFusionAction EOF
            {
             newCompositeNode(grammarAccess.getFusionActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFusionAction_in_entryRuleFusionAction7554);
            iv_ruleFusionAction=ruleFusionAction();

            state._fsp--;

             current =iv_ruleFusionAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFusionAction7564); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFusionAction"


    // $ANTLR start "ruleFusionAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3227:1: ruleFusionAction returns [EObject current=null] : ( () otherlv_1= 'FusionAction' otherlv_2= '{' (otherlv_3= 'fusion' ( (lv_fusion_4_0= ruleFusion ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'compuNode' ( ( ruleEString ) ) )? (otherlv_9= 'clusterHead' ( ( ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleFusionAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_fusion_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3230:28: ( ( () otherlv_1= 'FusionAction' otherlv_2= '{' (otherlv_3= 'fusion' ( (lv_fusion_4_0= ruleFusion ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'compuNode' ( ( ruleEString ) ) )? (otherlv_9= 'clusterHead' ( ( ruleEString ) ) )? otherlv_11= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3231:1: ( () otherlv_1= 'FusionAction' otherlv_2= '{' (otherlv_3= 'fusion' ( (lv_fusion_4_0= ruleFusion ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'compuNode' ( ( ruleEString ) ) )? (otherlv_9= 'clusterHead' ( ( ruleEString ) ) )? otherlv_11= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3231:1: ( () otherlv_1= 'FusionAction' otherlv_2= '{' (otherlv_3= 'fusion' ( (lv_fusion_4_0= ruleFusion ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'compuNode' ( ( ruleEString ) ) )? (otherlv_9= 'clusterHead' ( ( ruleEString ) ) )? otherlv_11= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3231:2: () otherlv_1= 'FusionAction' otherlv_2= '{' (otherlv_3= 'fusion' ( (lv_fusion_4_0= ruleFusion ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'compuNode' ( ( ruleEString ) ) )? (otherlv_9= 'clusterHead' ( ( ruleEString ) ) )? otherlv_11= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3231:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3232:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFusionActionAccess().getFusionActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleFusionAction7610); 

                	newLeafNode(otherlv_1, grammarAccess.getFusionActionAccess().getFusionActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFusionAction7622); 

                	newLeafNode(otherlv_2, grammarAccess.getFusionActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3245:1: (otherlv_3= 'fusion' ( (lv_fusion_4_0= ruleFusion ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==66) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3245:3: otherlv_3= 'fusion' ( (lv_fusion_4_0= ruleFusion ) )
                    {
                    otherlv_3=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleFusionAction7635); 

                        	newLeafNode(otherlv_3, grammarAccess.getFusionActionAccess().getFusionKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3249:1: ( (lv_fusion_4_0= ruleFusion ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3250:1: (lv_fusion_4_0= ruleFusion )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3250:1: (lv_fusion_4_0= ruleFusion )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3251:3: lv_fusion_4_0= ruleFusion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFusionActionAccess().getFusionFusionEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFusion_in_ruleFusionAction7656);
                    lv_fusion_4_0=ruleFusion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFusionActionRule());
                    	        }
                           		set(
                           			current, 
                           			"fusion",
                            		lv_fusion_4_0, 
                            		"Fusion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3267:4: (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==61) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3267:6: otherlv_5= 'sinkNode' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleFusionAction7671); 

                        	newLeafNode(otherlv_5, grammarAccess.getFusionActionAccess().getSinkNodeKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3271:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3272:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3272:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3273:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFusionActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFusionActionAccess().getSinkNodeSinkNodeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFusionAction7694);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3286:4: (otherlv_7= 'compuNode' ( ( ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==67) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3286:6: otherlv_7= 'compuNode' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleFusionAction7709); 

                        	newLeafNode(otherlv_7, grammarAccess.getFusionActionAccess().getCompuNodeKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3290:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3291:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3291:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3292:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFusionActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFusionActionAccess().getCompuNodeComputationNodeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFusionAction7732);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3305:4: (otherlv_9= 'clusterHead' ( ( ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==68) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3305:6: otherlv_9= 'clusterHead' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleFusionAction7747); 

                        	newLeafNode(otherlv_9, grammarAccess.getFusionActionAccess().getClusterHeadKeyword_6_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3309:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3310:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3310:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3311:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFusionActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFusionActionAccess().getClusterHeadClusterHeadNodeCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFusionAction7770);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFusionAction7784); 

                	newLeafNode(otherlv_11, grammarAccess.getFusionActionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFusionAction"


    // $ANTLR start "entryRuleReadNodeMemoryAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3336:1: entryRuleReadNodeMemoryAction returns [EObject current=null] : iv_ruleReadNodeMemoryAction= ruleReadNodeMemoryAction EOF ;
    public final EObject entryRuleReadNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadNodeMemoryAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3337:2: (iv_ruleReadNodeMemoryAction= ruleReadNodeMemoryAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3338:2: iv_ruleReadNodeMemoryAction= ruleReadNodeMemoryAction EOF
            {
             newCompositeNode(grammarAccess.getReadNodeMemoryActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReadNodeMemoryAction_in_entryRuleReadNodeMemoryAction7820);
            iv_ruleReadNodeMemoryAction=ruleReadNodeMemoryAction();

            state._fsp--;

             current =iv_ruleReadNodeMemoryAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReadNodeMemoryAction7830); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadNodeMemoryAction"


    // $ANTLR start "ruleReadNodeMemoryAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3345:1: ruleReadNodeMemoryAction returns [EObject current=null] : ( () otherlv_1= 'ReadNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleReadNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3348:28: ( ( () otherlv_1= 'ReadNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3349:1: ( () otherlv_1= 'ReadNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3349:1: ( () otherlv_1= 'ReadNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3349:2: () otherlv_1= 'ReadNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3349:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3350:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReadNodeMemoryActionAccess().getReadNodeMemoryActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleReadNodeMemoryAction7876); 

                	newLeafNode(otherlv_1, grammarAccess.getReadNodeMemoryActionAccess().getReadNodeMemoryActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleReadNodeMemoryAction7888); 

                	newLeafNode(otherlv_2, grammarAccess.getReadNodeMemoryActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3363:1: (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==61) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3363:3: otherlv_3= 'sinkNode' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleReadNodeMemoryAction7901); 

                        	newLeafNode(otherlv_3, grammarAccess.getReadNodeMemoryActionAccess().getSinkNodeKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3367:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3368:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3368:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3369:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReadNodeMemoryActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReadNodeMemoryActionAccess().getSinkNodeSinkNodeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReadNodeMemoryAction7924);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3382:4: (otherlv_5= 'targetNode' ( ( ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==62) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3382:6: otherlv_5= 'targetNode' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleReadNodeMemoryAction7939); 

                        	newLeafNode(otherlv_5, grammarAccess.getReadNodeMemoryActionAccess().getTargetNodeKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3386:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3387:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3387:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3388:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReadNodeMemoryActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReadNodeMemoryActionAccess().getTargetNodeAbstractNodeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReadNodeMemoryAction7962);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleReadNodeMemoryAction7976); 

                	newLeafNode(otherlv_7, grammarAccess.getReadNodeMemoryActionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadNodeMemoryAction"


    // $ANTLR start "entryRuleWriteNodeMemoryAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3413:1: entryRuleWriteNodeMemoryAction returns [EObject current=null] : iv_ruleWriteNodeMemoryAction= ruleWriteNodeMemoryAction EOF ;
    public final EObject entryRuleWriteNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteNodeMemoryAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3414:2: (iv_ruleWriteNodeMemoryAction= ruleWriteNodeMemoryAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3415:2: iv_ruleWriteNodeMemoryAction= ruleWriteNodeMemoryAction EOF
            {
             newCompositeNode(grammarAccess.getWriteNodeMemoryActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWriteNodeMemoryAction_in_entryRuleWriteNodeMemoryAction8012);
            iv_ruleWriteNodeMemoryAction=ruleWriteNodeMemoryAction();

            state._fsp--;

             current =iv_ruleWriteNodeMemoryAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWriteNodeMemoryAction8022); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWriteNodeMemoryAction"


    // $ANTLR start "ruleWriteNodeMemoryAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3422:1: ruleWriteNodeMemoryAction returns [EObject current=null] : ( () otherlv_1= 'WriteNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleWriteNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3425:28: ( ( () otherlv_1= 'WriteNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3426:1: ( () otherlv_1= 'WriteNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3426:1: ( () otherlv_1= 'WriteNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3426:2: () otherlv_1= 'WriteNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3426:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3427:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWriteNodeMemoryActionAccess().getWriteNodeMemoryActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleWriteNodeMemoryAction8068); 

                	newLeafNode(otherlv_1, grammarAccess.getWriteNodeMemoryActionAccess().getWriteNodeMemoryActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWriteNodeMemoryAction8080); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteNodeMemoryActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3440:1: (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==61) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3440:3: otherlv_3= 'sinkNode' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleWriteNodeMemoryAction8093); 

                        	newLeafNode(otherlv_3, grammarAccess.getWriteNodeMemoryActionAccess().getSinkNodeKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3444:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3445:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3445:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3446:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWriteNodeMemoryActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getWriteNodeMemoryActionAccess().getSinkNodeSinkNodeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWriteNodeMemoryAction8116);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3459:4: (otherlv_5= 'targetNode' ( ( ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==62) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3459:6: otherlv_5= 'targetNode' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleWriteNodeMemoryAction8131); 

                        	newLeafNode(otherlv_5, grammarAccess.getWriteNodeMemoryActionAccess().getTargetNodeKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3463:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3464:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3464:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3465:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWriteNodeMemoryActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getWriteNodeMemoryActionAccess().getTargetNodeAbstractNodeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWriteNodeMemoryAction8154);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWriteNodeMemoryAction8168); 

                	newLeafNode(otherlv_7, grammarAccess.getWriteNodeMemoryActionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWriteNodeMemoryAction"


    // $ANTLR start "entryRuleSendMessageAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3490:1: entryRuleSendMessageAction returns [EObject current=null] : iv_ruleSendMessageAction= ruleSendMessageAction EOF ;
    public final EObject entryRuleSendMessageAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendMessageAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3491:2: (iv_ruleSendMessageAction= ruleSendMessageAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3492:2: iv_ruleSendMessageAction= ruleSendMessageAction EOF
            {
             newCompositeNode(grammarAccess.getSendMessageActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSendMessageAction_in_entryRuleSendMessageAction8204);
            iv_ruleSendMessageAction=ruleSendMessageAction();

            state._fsp--;

             current =iv_ruleSendMessageAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSendMessageAction8214); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSendMessageAction"


    // $ANTLR start "ruleSendMessageAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3499:1: ruleSendMessageAction returns [EObject current=null] : ( () otherlv_1= 'SendMessageAction' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'targetNode' ( ( ruleEString ) ) )? (otherlv_9= 'outPort' ( ( ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleSendMessageAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3502:28: ( ( () otherlv_1= 'SendMessageAction' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'targetNode' ( ( ruleEString ) ) )? (otherlv_9= 'outPort' ( ( ruleEString ) ) )? otherlv_11= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3503:1: ( () otherlv_1= 'SendMessageAction' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'targetNode' ( ( ruleEString ) ) )? (otherlv_9= 'outPort' ( ( ruleEString ) ) )? otherlv_11= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3503:1: ( () otherlv_1= 'SendMessageAction' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'targetNode' ( ( ruleEString ) ) )? (otherlv_9= 'outPort' ( ( ruleEString ) ) )? otherlv_11= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3503:2: () otherlv_1= 'SendMessageAction' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_7= 'targetNode' ( ( ruleEString ) ) )? (otherlv_9= 'outPort' ( ( ruleEString ) ) )? otherlv_11= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3503:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3504:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSendMessageActionAccess().getSendMessageActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleSendMessageAction8260); 

                	newLeafNode(otherlv_1, grammarAccess.getSendMessageActionAccess().getSendMessageActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSendMessageAction8272); 

                	newLeafNode(otherlv_2, grammarAccess.getSendMessageActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3517:1: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==72) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3517:3: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleSendMessageAction8285); 

                        	newLeafNode(otherlv_3, grammarAccess.getSendMessageActionAccess().getTextKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3521:1: ( (lv_text_4_0= ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3522:1: (lv_text_4_0= ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3522:1: (lv_text_4_0= ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3523:3: lv_text_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSendMessageActionAccess().getTextEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSendMessageAction8306);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSendMessageActionRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3539:4: (otherlv_5= 'sinkNode' ( ( ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==61) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3539:6: otherlv_5= 'sinkNode' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleSendMessageAction8321); 

                        	newLeafNode(otherlv_5, grammarAccess.getSendMessageActionAccess().getSinkNodeKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3543:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3544:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3544:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3545:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSendMessageActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSendMessageActionAccess().getSinkNodeSinkNodeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSendMessageAction8344);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3558:4: (otherlv_7= 'targetNode' ( ( ruleEString ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==62) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3558:6: otherlv_7= 'targetNode' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleSendMessageAction8359); 

                        	newLeafNode(otherlv_7, grammarAccess.getSendMessageActionAccess().getTargetNodeKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3562:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3563:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3563:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3564:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSendMessageActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSendMessageActionAccess().getTargetNodeAbstractNodeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSendMessageAction8382);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3577:4: (otherlv_9= 'outPort' ( ( ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==73) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3577:6: otherlv_9= 'outPort' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleSendMessageAction8397); 

                        	newLeafNode(otherlv_9, grammarAccess.getSendMessageActionAccess().getOutPortKeyword_6_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3581:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3582:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3582:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3583:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSendMessageActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSendMessageActionAccess().getOutPortOutPortCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSendMessageAction8420);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSendMessageAction8434); 

                	newLeafNode(otherlv_11, grammarAccess.getSendMessageActionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendMessageAction"


    // $ANTLR start "entryRuleReceiveMessageAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3608:1: entryRuleReceiveMessageAction returns [EObject current=null] : iv_ruleReceiveMessageAction= ruleReceiveMessageAction EOF ;
    public final EObject entryRuleReceiveMessageAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiveMessageAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3609:2: (iv_ruleReceiveMessageAction= ruleReceiveMessageAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3610:2: iv_ruleReceiveMessageAction= ruleReceiveMessageAction EOF
            {
             newCompositeNode(grammarAccess.getReceiveMessageActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReceiveMessageAction_in_entryRuleReceiveMessageAction8470);
            iv_ruleReceiveMessageAction=ruleReceiveMessageAction();

            state._fsp--;

             current =iv_ruleReceiveMessageAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReceiveMessageAction8480); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReceiveMessageAction"


    // $ANTLR start "ruleReceiveMessageAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3617:1: ruleReceiveMessageAction returns [EObject current=null] : ( () otherlv_1= 'ReceiveMessageAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? (otherlv_7= 'inPort' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleReceiveMessageAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3620:28: ( ( () otherlv_1= 'ReceiveMessageAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? (otherlv_7= 'inPort' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3621:1: ( () otherlv_1= 'ReceiveMessageAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? (otherlv_7= 'inPort' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3621:1: ( () otherlv_1= 'ReceiveMessageAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? (otherlv_7= 'inPort' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3621:2: () otherlv_1= 'ReceiveMessageAction' otherlv_2= '{' (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )? (otherlv_5= 'targetNode' ( ( ruleEString ) ) )? (otherlv_7= 'inPort' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3621:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3622:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReceiveMessageActionAccess().getReceiveMessageActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleReceiveMessageAction8526); 

                	newLeafNode(otherlv_1, grammarAccess.getReceiveMessageActionAccess().getReceiveMessageActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleReceiveMessageAction8538); 

                	newLeafNode(otherlv_2, grammarAccess.getReceiveMessageActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3635:1: (otherlv_3= 'sinkNode' ( ( ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==61) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3635:3: otherlv_3= 'sinkNode' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleReceiveMessageAction8551); 

                        	newLeafNode(otherlv_3, grammarAccess.getReceiveMessageActionAccess().getSinkNodeKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3639:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3640:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3640:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3641:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReceiveMessageActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReceiveMessageActionAccess().getSinkNodeSinkNodeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReceiveMessageAction8574);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3654:4: (otherlv_5= 'targetNode' ( ( ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==62) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3654:6: otherlv_5= 'targetNode' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleReceiveMessageAction8589); 

                        	newLeafNode(otherlv_5, grammarAccess.getReceiveMessageActionAccess().getTargetNodeKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3658:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3659:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3659:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3660:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReceiveMessageActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReceiveMessageActionAccess().getTargetNodeAbstractNodeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReceiveMessageAction8612);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3673:4: (otherlv_7= 'inPort' ( ( ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==75) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3673:6: otherlv_7= 'inPort' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleReceiveMessageAction8627); 

                        	newLeafNode(otherlv_7, grammarAccess.getReceiveMessageActionAccess().getInPortKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3677:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3678:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3678:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3679:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReceiveMessageActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReceiveMessageActionAccess().getInPortInPortCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReceiveMessageAction8650);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleReceiveMessageAction8664); 

                	newLeafNode(otherlv_9, grammarAccess.getReceiveMessageActionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReceiveMessageAction"


    // $ANTLR start "entryRuleLogicalCondition"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3704:1: entryRuleLogicalCondition returns [EObject current=null] : iv_ruleLogicalCondition= ruleLogicalCondition EOF ;
    public final EObject entryRuleLogicalCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCondition = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3705:2: (iv_ruleLogicalCondition= ruleLogicalCondition EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3706:2: iv_ruleLogicalCondition= ruleLogicalCondition EOF
            {
             newCompositeNode(grammarAccess.getLogicalConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalCondition_in_entryRuleLogicalCondition8700);
            iv_ruleLogicalCondition=ruleLogicalCondition();

            state._fsp--;

             current =iv_ruleLogicalCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalCondition8710); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalCondition"


    // $ANTLR start "ruleLogicalCondition"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3713:1: ruleLogicalCondition returns [EObject current=null] : ( () otherlv_1= 'LogicalCondition' otherlv_2= '{' (otherlv_3= 'jobSchedule' ( (lv_jobSchedule_4_0= ruleJobSchedule ) ) )? (otherlv_5= 'sensorTerm' ( (lv_sensorTerm_6_0= ruleEString ) ) )? (otherlv_7= 'logicalSymbol' ( (lv_logicalSymbol_8_0= ruleLogicalSymbol ) ) )? (otherlv_9= 'value' ( (lv_value_10_0= ruleELong ) ) )? (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleLogicalCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_jobSchedule_4_0 = null;

        AntlrDatatypeRuleToken lv_sensorTerm_6_0 = null;

        Enumerator lv_logicalSymbol_8_0 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;

        AntlrDatatypeRuleToken lv_unit_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3716:28: ( ( () otherlv_1= 'LogicalCondition' otherlv_2= '{' (otherlv_3= 'jobSchedule' ( (lv_jobSchedule_4_0= ruleJobSchedule ) ) )? (otherlv_5= 'sensorTerm' ( (lv_sensorTerm_6_0= ruleEString ) ) )? (otherlv_7= 'logicalSymbol' ( (lv_logicalSymbol_8_0= ruleLogicalSymbol ) ) )? (otherlv_9= 'value' ( (lv_value_10_0= ruleELong ) ) )? (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )? otherlv_13= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3717:1: ( () otherlv_1= 'LogicalCondition' otherlv_2= '{' (otherlv_3= 'jobSchedule' ( (lv_jobSchedule_4_0= ruleJobSchedule ) ) )? (otherlv_5= 'sensorTerm' ( (lv_sensorTerm_6_0= ruleEString ) ) )? (otherlv_7= 'logicalSymbol' ( (lv_logicalSymbol_8_0= ruleLogicalSymbol ) ) )? (otherlv_9= 'value' ( (lv_value_10_0= ruleELong ) ) )? (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )? otherlv_13= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3717:1: ( () otherlv_1= 'LogicalCondition' otherlv_2= '{' (otherlv_3= 'jobSchedule' ( (lv_jobSchedule_4_0= ruleJobSchedule ) ) )? (otherlv_5= 'sensorTerm' ( (lv_sensorTerm_6_0= ruleEString ) ) )? (otherlv_7= 'logicalSymbol' ( (lv_logicalSymbol_8_0= ruleLogicalSymbol ) ) )? (otherlv_9= 'value' ( (lv_value_10_0= ruleELong ) ) )? (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )? otherlv_13= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3717:2: () otherlv_1= 'LogicalCondition' otherlv_2= '{' (otherlv_3= 'jobSchedule' ( (lv_jobSchedule_4_0= ruleJobSchedule ) ) )? (otherlv_5= 'sensorTerm' ( (lv_sensorTerm_6_0= ruleEString ) ) )? (otherlv_7= 'logicalSymbol' ( (lv_logicalSymbol_8_0= ruleLogicalSymbol ) ) )? (otherlv_9= 'value' ( (lv_value_10_0= ruleELong ) ) )? (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )? otherlv_13= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3717:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3718:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLogicalConditionAccess().getLogicalConditionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleLogicalCondition8756); 

                	newLeafNode(otherlv_1, grammarAccess.getLogicalConditionAccess().getLogicalConditionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLogicalCondition8768); 

                	newLeafNode(otherlv_2, grammarAccess.getLogicalConditionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3731:1: (otherlv_3= 'jobSchedule' ( (lv_jobSchedule_4_0= ruleJobSchedule ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==77) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3731:3: otherlv_3= 'jobSchedule' ( (lv_jobSchedule_4_0= ruleJobSchedule ) )
                    {
                    otherlv_3=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleLogicalCondition8781); 

                        	newLeafNode(otherlv_3, grammarAccess.getLogicalConditionAccess().getJobScheduleKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3735:1: ( (lv_jobSchedule_4_0= ruleJobSchedule ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3736:1: (lv_jobSchedule_4_0= ruleJobSchedule )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3736:1: (lv_jobSchedule_4_0= ruleJobSchedule )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3737:3: lv_jobSchedule_4_0= ruleJobSchedule
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogicalConditionAccess().getJobScheduleJobScheduleEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleJobSchedule_in_ruleLogicalCondition8802);
                    lv_jobSchedule_4_0=ruleJobSchedule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogicalConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"jobSchedule",
                            		lv_jobSchedule_4_0, 
                            		"JobSchedule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3753:4: (otherlv_5= 'sensorTerm' ( (lv_sensorTerm_6_0= ruleEString ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==78) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3753:6: otherlv_5= 'sensorTerm' ( (lv_sensorTerm_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleLogicalCondition8817); 

                        	newLeafNode(otherlv_5, grammarAccess.getLogicalConditionAccess().getSensorTermKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3757:1: ( (lv_sensorTerm_6_0= ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3758:1: (lv_sensorTerm_6_0= ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3758:1: (lv_sensorTerm_6_0= ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3759:3: lv_sensorTerm_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogicalConditionAccess().getSensorTermEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLogicalCondition8838);
                    lv_sensorTerm_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogicalConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"sensorTerm",
                            		lv_sensorTerm_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3775:4: (otherlv_7= 'logicalSymbol' ( (lv_logicalSymbol_8_0= ruleLogicalSymbol ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==79) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3775:6: otherlv_7= 'logicalSymbol' ( (lv_logicalSymbol_8_0= ruleLogicalSymbol ) )
                    {
                    otherlv_7=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleLogicalCondition8853); 

                        	newLeafNode(otherlv_7, grammarAccess.getLogicalConditionAccess().getLogicalSymbolKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3779:1: ( (lv_logicalSymbol_8_0= ruleLogicalSymbol ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3780:1: (lv_logicalSymbol_8_0= ruleLogicalSymbol )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3780:1: (lv_logicalSymbol_8_0= ruleLogicalSymbol )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3781:3: lv_logicalSymbol_8_0= ruleLogicalSymbol
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogicalConditionAccess().getLogicalSymbolLogicalSymbolEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalSymbol_in_ruleLogicalCondition8874);
                    lv_logicalSymbol_8_0=ruleLogicalSymbol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogicalConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"logicalSymbol",
                            		lv_logicalSymbol_8_0, 
                            		"LogicalSymbol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3797:4: (otherlv_9= 'value' ( (lv_value_10_0= ruleELong ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==80) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3797:6: otherlv_9= 'value' ( (lv_value_10_0= ruleELong ) )
                    {
                    otherlv_9=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleLogicalCondition8889); 

                        	newLeafNode(otherlv_9, grammarAccess.getLogicalConditionAccess().getValueKeyword_6_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3801:1: ( (lv_value_10_0= ruleELong ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3802:1: (lv_value_10_0= ruleELong )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3802:1: (lv_value_10_0= ruleELong )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3803:3: lv_value_10_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogicalConditionAccess().getValueELongParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleLogicalCondition8910);
                    lv_value_10_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogicalConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_10_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3819:4: (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==81) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3819:6: otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleLogicalCondition8925); 

                        	newLeafNode(otherlv_11, grammarAccess.getLogicalConditionAccess().getUnitKeyword_7_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3823:1: ( (lv_unit_12_0= ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3824:1: (lv_unit_12_0= ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3824:1: (lv_unit_12_0= ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3825:3: lv_unit_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogicalConditionAccess().getUnitEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLogicalCondition8946);
                    lv_unit_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogicalConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"unit",
                            		lv_unit_12_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLogicalCondition8960); 

                	newLeafNode(otherlv_13, grammarAccess.getLogicalConditionAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalCondition"


    // $ANTLR start "entryRuleELong"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3853:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3854:2: (iv_ruleELong= ruleELong EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3855:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_entryRuleELong8997);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleELong9008); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3862:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3865:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3866:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3866:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3866:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3866:2: (kw= '-' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==18) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3867:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleELong9047); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleELong9064); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELong"


    // $ANTLR start "ruleInterNodeComm"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3887:1: ruleInterNodeComm returns [Enumerator current=null] : ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) ) ;
    public final Enumerator ruleInterNodeComm() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3889:28: ( ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3890:1: ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3890:1: ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) )
            int alt102=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt102=1;
                }
                break;
            case 83:
                {
                alt102=2;
                }
                break;
            case 84:
                {
                alt102=3;
                }
                break;
            case 85:
                {
                alt102=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3890:2: (enumLiteral_0= 'BT' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3890:2: (enumLiteral_0= 'BT' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3890:4: enumLiteral_0= 'BT'
                    {
                    enumLiteral_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleInterNodeComm9123); 

                            current = grammarAccess.getInterNodeCommAccess().getBTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInterNodeCommAccess().getBTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3896:6: (enumLiteral_1= 'Zigbee' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3896:6: (enumLiteral_1= 'Zigbee' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3896:8: enumLiteral_1= 'Zigbee'
                    {
                    enumLiteral_1=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleInterNodeComm9140); 

                            current = grammarAccess.getInterNodeCommAccess().getZigbeeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInterNodeCommAccess().getZigbeeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3902:6: (enumLiteral_2= 'WLan' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3902:6: (enumLiteral_2= 'WLan' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3902:8: enumLiteral_2= 'WLan'
                    {
                    enumLiteral_2=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleInterNodeComm9157); 

                            current = grammarAccess.getInterNodeCommAccess().getWLanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getInterNodeCommAccess().getWLanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3908:6: (enumLiteral_3= 'RF' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3908:6: (enumLiteral_3= 'RF' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3908:8: enumLiteral_3= 'RF'
                    {
                    enumLiteral_3=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleInterNodeComm9174); 

                            current = grammarAccess.getInterNodeCommAccess().getRFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getInterNodeCommAccess().getRFEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterNodeComm"


    // $ANTLR start "ruleRoutingProtocol"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3918:1: ruleRoutingProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) ) ;
    public final Enumerator ruleRoutingProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3920:28: ( ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3921:1: ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3921:1: ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) )
            int alt103=16;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt103=1;
                }
                break;
            case 87:
                {
                alt103=2;
                }
                break;
            case 88:
                {
                alt103=3;
                }
                break;
            case 89:
                {
                alt103=4;
                }
                break;
            case 90:
                {
                alt103=5;
                }
                break;
            case 91:
                {
                alt103=6;
                }
                break;
            case 92:
                {
                alt103=7;
                }
                break;
            case 93:
                {
                alt103=8;
                }
                break;
            case 94:
                {
                alt103=9;
                }
                break;
            case 95:
                {
                alt103=10;
                }
                break;
            case 96:
                {
                alt103=11;
                }
                break;
            case 97:
                {
                alt103=12;
                }
                break;
            case 98:
                {
                alt103=13;
                }
                break;
            case 99:
                {
                alt103=14;
                }
                break;
            case 100:
                {
                alt103=15;
                }
                break;
            case 101:
                {
                alt103=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3921:2: (enumLiteral_0= 'leach' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3921:2: (enumLiteral_0= 'leach' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3921:4: enumLiteral_0= 'leach'
                    {
                    enumLiteral_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleRoutingProtocol9219); 

                            current = grammarAccess.getRoutingProtocolAccess().getLeachEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoutingProtocolAccess().getLeachEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3927:6: (enumLiteral_1= 'lqrp' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3927:6: (enumLiteral_1= 'lqrp' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3927:8: enumLiteral_1= 'lqrp'
                    {
                    enumLiteral_1=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleRoutingProtocol9236); 

                            current = grammarAccess.getRoutingProtocolAccess().getLqrpEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRoutingProtocolAccess().getLqrpEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3933:6: (enumLiteral_2= 'spin' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3933:6: (enumLiteral_2= 'spin' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3933:8: enumLiteral_2= 'spin'
                    {
                    enumLiteral_2=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleRoutingProtocol9253); 

                            current = grammarAccess.getRoutingProtocolAccess().getSpinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRoutingProtocolAccess().getSpinEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3939:6: (enumLiteral_3= 'aodv' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3939:6: (enumLiteral_3= 'aodv' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3939:8: enumLiteral_3= 'aodv'
                    {
                    enumLiteral_3=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleRoutingProtocol9270); 

                            current = grammarAccess.getRoutingProtocolAccess().getAodvEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRoutingProtocolAccess().getAodvEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3945:6: (enumLiteral_4= 'dodv' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3945:6: (enumLiteral_4= 'dodv' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3945:8: enumLiteral_4= 'dodv'
                    {
                    enumLiteral_4=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleRoutingProtocol9287); 

                            current = grammarAccess.getRoutingProtocolAccess().getDodvEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getRoutingProtocolAccess().getDodvEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3951:6: (enumLiteral_5= 'dsr' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3951:6: (enumLiteral_5= 'dsr' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3951:8: enumLiteral_5= 'dsr'
                    {
                    enumLiteral_5=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleRoutingProtocol9304); 

                            current = grammarAccess.getRoutingProtocolAccess().getDsrEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getRoutingProtocolAccess().getDsrEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3957:6: (enumLiteral_6= 'dsdv' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3957:6: (enumLiteral_6= 'dsdv' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3957:8: enumLiteral_6= 'dsdv'
                    {
                    enumLiteral_6=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleRoutingProtocol9321); 

                            current = grammarAccess.getRoutingProtocolAccess().getDsdvEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getRoutingProtocolAccess().getDsdvEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3963:6: (enumLiteral_7= 'gsr' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3963:6: (enumLiteral_7= 'gsr' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3963:8: enumLiteral_7= 'gsr'
                    {
                    enumLiteral_7=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleRoutingProtocol9338); 

                            current = grammarAccess.getRoutingProtocolAccess().getGsrEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getRoutingProtocolAccess().getGsrEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3969:6: (enumLiteral_8= 'heed' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3969:6: (enumLiteral_8= 'heed' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3969:8: enumLiteral_8= 'heed'
                    {
                    enumLiteral_8=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleRoutingProtocol9355); 

                            current = grammarAccess.getRoutingProtocolAccess().getHeedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getRoutingProtocolAccess().getHeedEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3975:6: (enumLiteral_9= 'gaf' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3975:6: (enumLiteral_9= 'gaf' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3975:8: enumLiteral_9= 'gaf'
                    {
                    enumLiteral_9=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleRoutingProtocol9372); 

                            current = grammarAccess.getRoutingProtocolAccess().getGafEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getRoutingProtocolAccess().getGafEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3981:6: (enumLiteral_10= 'gear' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3981:6: (enumLiteral_10= 'gear' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3981:8: enumLiteral_10= 'gear'
                    {
                    enumLiteral_10=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleRoutingProtocol9389); 

                            current = grammarAccess.getRoutingProtocolAccess().getGearEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getRoutingProtocolAccess().getGearEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3987:6: (enumLiteral_11= 'tbf' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3987:6: (enumLiteral_11= 'tbf' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3987:8: enumLiteral_11= 'tbf'
                    {
                    enumLiteral_11=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleRoutingProtocol9406); 

                            current = grammarAccess.getRoutingProtocolAccess().getTbfEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getRoutingProtocolAccess().getTbfEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3993:6: (enumLiteral_12= 'ead' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3993:6: (enumLiteral_12= 'ead' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3993:8: enumLiteral_12= 'ead'
                    {
                    enumLiteral_12=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleRoutingProtocol9423); 

                            current = grammarAccess.getRoutingProtocolAccess().getEadEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getRoutingProtocolAccess().getEadEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3999:6: (enumLiteral_13= 'pegasis' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3999:6: (enumLiteral_13= 'pegasis' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:3999:8: enumLiteral_13= 'pegasis'
                    {
                    enumLiteral_13=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleRoutingProtocol9440); 

                            current = grammarAccess.getRoutingProtocolAccess().getPegasisEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getRoutingProtocolAccess().getPegasisEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4005:6: (enumLiteral_14= 'teen' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4005:6: (enumLiteral_14= 'teen' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4005:8: enumLiteral_14= 'teen'
                    {
                    enumLiteral_14=(Token)match(input,100,FollowSets000.FOLLOW_100_in_ruleRoutingProtocol9457); 

                            current = grammarAccess.getRoutingProtocolAccess().getTeenEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getRoutingProtocolAccess().getTeenEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4011:6: (enumLiteral_15= 'speed' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4011:6: (enumLiteral_15= 'speed' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4011:8: enumLiteral_15= 'speed'
                    {
                    enumLiteral_15=(Token)match(input,101,FollowSets000.FOLLOW_101_in_ruleRoutingProtocol9474); 

                            current = grammarAccess.getRoutingProtocolAccess().getSpeedEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getRoutingProtocolAccess().getSpeedEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoutingProtocol"


    // $ANTLR start "rulePosition"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4021:1: rulePosition returns [Enumerator current=null] : ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) ) ;
    public final Enumerator rulePosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4023:28: ( ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4024:1: ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4024:1: ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==102) ) {
                alt104=1;
            }
            else if ( (LA104_0==103) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4024:2: (enumLiteral_0= 'mobile' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4024:2: (enumLiteral_0= 'mobile' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4024:4: enumLiteral_0= 'mobile'
                    {
                    enumLiteral_0=(Token)match(input,102,FollowSets000.FOLLOW_102_in_rulePosition9519); 

                            current = grammarAccess.getPositionAccess().getMobileEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPositionAccess().getMobileEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4030:6: (enumLiteral_1= 'static' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4030:6: (enumLiteral_1= 'static' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4030:8: enumLiteral_1= 'static'
                    {
                    enumLiteral_1=(Token)match(input,103,FollowSets000.FOLLOW_103_in_rulePosition9536); 

                            current = grammarAccess.getPositionAccess().getStaticEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPositionAccess().getStaticEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "ruleAggregation"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4040:1: ruleAggregation returns [Enumerator current=null] : ( (enumLiteral_0= 'filtering' ) | (enumLiteral_1= 'compression' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'avg' ) | (enumLiteral_5= 'count' ) ) ;
    public final Enumerator ruleAggregation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4042:28: ( ( (enumLiteral_0= 'filtering' ) | (enumLiteral_1= 'compression' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'avg' ) | (enumLiteral_5= 'count' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4043:1: ( (enumLiteral_0= 'filtering' ) | (enumLiteral_1= 'compression' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'avg' ) | (enumLiteral_5= 'count' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4043:1: ( (enumLiteral_0= 'filtering' ) | (enumLiteral_1= 'compression' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'avg' ) | (enumLiteral_5= 'count' ) )
            int alt105=6;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt105=1;
                }
                break;
            case 105:
                {
                alt105=2;
                }
                break;
            case 106:
                {
                alt105=3;
                }
                break;
            case 107:
                {
                alt105=4;
                }
                break;
            case 108:
                {
                alt105=5;
                }
                break;
            case 109:
                {
                alt105=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4043:2: (enumLiteral_0= 'filtering' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4043:2: (enumLiteral_0= 'filtering' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4043:4: enumLiteral_0= 'filtering'
                    {
                    enumLiteral_0=(Token)match(input,104,FollowSets000.FOLLOW_104_in_ruleAggregation9581); 

                            current = grammarAccess.getAggregationAccess().getFilteringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAggregationAccess().getFilteringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4049:6: (enumLiteral_1= 'compression' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4049:6: (enumLiteral_1= 'compression' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4049:8: enumLiteral_1= 'compression'
                    {
                    enumLiteral_1=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleAggregation9598); 

                            current = grammarAccess.getAggregationAccess().getCompressionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAggregationAccess().getCompressionEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4055:6: (enumLiteral_2= 'max' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4055:6: (enumLiteral_2= 'max' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4055:8: enumLiteral_2= 'max'
                    {
                    enumLiteral_2=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleAggregation9615); 

                            current = grammarAccess.getAggregationAccess().getMaxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAggregationAccess().getMaxEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4061:6: (enumLiteral_3= 'min' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4061:6: (enumLiteral_3= 'min' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4061:8: enumLiteral_3= 'min'
                    {
                    enumLiteral_3=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleAggregation9632); 

                            current = grammarAccess.getAggregationAccess().getMinEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAggregationAccess().getMinEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4067:6: (enumLiteral_4= 'avg' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4067:6: (enumLiteral_4= 'avg' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4067:8: enumLiteral_4= 'avg'
                    {
                    enumLiteral_4=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleAggregation9649); 

                            current = grammarAccess.getAggregationAccess().getAvgEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAggregationAccess().getAvgEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4073:6: (enumLiteral_5= 'count' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4073:6: (enumLiteral_5= 'count' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4073:8: enumLiteral_5= 'count'
                    {
                    enumLiteral_5=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleAggregation9666); 

                            current = grammarAccess.getAggregationAccess().getCountEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAggregationAccess().getCountEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAggregation"


    // $ANTLR start "ruleFusion"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4083:1: ruleFusion returns [Enumerator current=null] : ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) ) ;
    public final Enumerator ruleFusion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4085:28: ( ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4086:1: ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4086:1: ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) )
            int alt106=4;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt106=1;
                }
                break;
            case 111:
                {
                alt106=2;
                }
                break;
            case 112:
                {
                alt106=3;
                }
                break;
            case 113:
                {
                alt106=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4086:2: (enumLiteral_0= 'classification' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4086:2: (enumLiteral_0= 'classification' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4086:4: enumLiteral_0= 'classification'
                    {
                    enumLiteral_0=(Token)match(input,110,FollowSets000.FOLLOW_110_in_ruleFusion9711); 

                            current = grammarAccess.getFusionAccess().getClassificationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFusionAccess().getClassificationEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4092:6: (enumLiteral_1= 'event_detection' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4092:6: (enumLiteral_1= 'event_detection' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4092:8: enumLiteral_1= 'event_detection'
                    {
                    enumLiteral_1=(Token)match(input,111,FollowSets000.FOLLOW_111_in_ruleFusion9728); 

                            current = grammarAccess.getFusionAccess().getEvent_detectionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFusionAccess().getEvent_detectionEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4098:6: (enumLiteral_2= 'tracking' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4098:6: (enumLiteral_2= 'tracking' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4098:8: enumLiteral_2= 'tracking'
                    {
                    enumLiteral_2=(Token)match(input,112,FollowSets000.FOLLOW_112_in_ruleFusion9745); 

                            current = grammarAccess.getFusionAccess().getTrackingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFusionAccess().getTrackingEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4104:6: (enumLiteral_3= 'decision_making' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4104:6: (enumLiteral_3= 'decision_making' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4104:8: enumLiteral_3= 'decision_making'
                    {
                    enumLiteral_3=(Token)match(input,113,FollowSets000.FOLLOW_113_in_ruleFusion9762); 

                            current = grammarAccess.getFusionAccess().getDecision_makingEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFusionAccess().getDecision_makingEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFusion"


    // $ANTLR start "ruleJobSchedule"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4114:1: ruleJobSchedule returns [Enumerator current=null] : ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'stop' ) ) ;
    public final Enumerator ruleJobSchedule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4116:28: ( ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'stop' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4117:1: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'stop' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4117:1: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'stop' ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==114) ) {
                alt107=1;
            }
            else if ( (LA107_0==115) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4117:2: (enumLiteral_0= 'start' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4117:2: (enumLiteral_0= 'start' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4117:4: enumLiteral_0= 'start'
                    {
                    enumLiteral_0=(Token)match(input,114,FollowSets000.FOLLOW_114_in_ruleJobSchedule9807); 

                            current = grammarAccess.getJobScheduleAccess().getStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getJobScheduleAccess().getStartEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4123:6: (enumLiteral_1= 'stop' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4123:6: (enumLiteral_1= 'stop' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4123:8: enumLiteral_1= 'stop'
                    {
                    enumLiteral_1=(Token)match(input,115,FollowSets000.FOLLOW_115_in_ruleJobSchedule9824); 

                            current = grammarAccess.getJobScheduleAccess().getStopEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getJobScheduleAccess().getStopEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJobSchedule"


    // $ANTLR start "ruleLogicalSymbol"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4133:1: ruleLogicalSymbol returns [Enumerator current=null] : ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'not' ) ) ;
    public final Enumerator ruleLogicalSymbol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4135:28: ( ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'not' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4136:1: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'not' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4136:1: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'not' ) )
            int alt108=6;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt108=1;
                }
                break;
            case 117:
                {
                alt108=2;
                }
                break;
            case 118:
                {
                alt108=3;
                }
                break;
            case 119:
                {
                alt108=4;
                }
                break;
            case 120:
                {
                alt108=5;
                }
                break;
            case 121:
                {
                alt108=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4136:2: (enumLiteral_0= 'equal' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4136:2: (enumLiteral_0= 'equal' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4136:4: enumLiteral_0= 'equal'
                    {
                    enumLiteral_0=(Token)match(input,116,FollowSets000.FOLLOW_116_in_ruleLogicalSymbol9869); 

                            current = grammarAccess.getLogicalSymbolAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalSymbolAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4142:6: (enumLiteral_1= 'greaterThan' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4142:6: (enumLiteral_1= 'greaterThan' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4142:8: enumLiteral_1= 'greaterThan'
                    {
                    enumLiteral_1=(Token)match(input,117,FollowSets000.FOLLOW_117_in_ruleLogicalSymbol9886); 

                            current = grammarAccess.getLogicalSymbolAccess().getGreaterThanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLogicalSymbolAccess().getGreaterThanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4148:6: (enumLiteral_2= 'greaterOrEqualThan' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4148:6: (enumLiteral_2= 'greaterOrEqualThan' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4148:8: enumLiteral_2= 'greaterOrEqualThan'
                    {
                    enumLiteral_2=(Token)match(input,118,FollowSets000.FOLLOW_118_in_ruleLogicalSymbol9903); 

                            current = grammarAccess.getLogicalSymbolAccess().getGreaterOrEqualThanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLogicalSymbolAccess().getGreaterOrEqualThanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4154:6: (enumLiteral_3= 'lessThan' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4154:6: (enumLiteral_3= 'lessThan' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4154:8: enumLiteral_3= 'lessThan'
                    {
                    enumLiteral_3=(Token)match(input,119,FollowSets000.FOLLOW_119_in_ruleLogicalSymbol9920); 

                            current = grammarAccess.getLogicalSymbolAccess().getLessThanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLogicalSymbolAccess().getLessThanEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4160:6: (enumLiteral_4= 'lessOrEqualThan' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4160:6: (enumLiteral_4= 'lessOrEqualThan' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4160:8: enumLiteral_4= 'lessOrEqualThan'
                    {
                    enumLiteral_4=(Token)match(input,120,FollowSets000.FOLLOW_120_in_ruleLogicalSymbol9937); 

                            current = grammarAccess.getLogicalSymbolAccess().getLessOrEqualThanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getLogicalSymbolAccess().getLessOrEqualThanEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4166:6: (enumLiteral_5= 'not' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4166:6: (enumLiteral_5= 'not' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalSNDsl.g:4166:8: enumLiteral_5= 'not'
                    {
                    enumLiteral_5=(Token)match(input,121,FollowSets000.FOLLOW_121_in_ruleLogicalSymbol9954); 

                            current = grammarAccess.getLogicalSymbolAccess().getNotEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getLogicalSymbolAccess().getNotEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalSymbol"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleWSNapp_in_entryRuleWSNapp75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWSNapp85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleWSNapp131 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWSNapp152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWSNapp164 = new BitSet(new long[]{0x000000000002E000L});
        public static final BitSet FOLLOW_13_in_ruleWSNapp177 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleWSNapp198 = new BitSet(new long[]{0x000000000002C000L});
        public static final BitSet FOLLOW_14_in_ruleWSNapp213 = new BitSet(new long[]{0x0000000082000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleWSNapp234 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_15_in_ruleWSNapp249 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWSNapp261 = new BitSet(new long[]{0x0AA0000000000000L});
        public static final BitSet FOLLOW_ruleAbstractJob_in_ruleWSNapp282 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleWSNapp295 = new BitSet(new long[]{0x0AA0000000000000L});
        public static final BitSet FOLLOW_ruleAbstractJob_in_ruleWSNapp316 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleWSNapp330 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleWSNapp344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_entryRuleAbstractNetwork380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNetwork390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlatNetwork_in_ruleAbstractNetwork437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusteredNetwork_in_ruleAbstractNetwork464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractJob_in_entryRuleAbstractJob499 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractJob509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContinuousJob_in_ruleAbstractJob556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEventDrivenJob_in_ruleAbstractJob583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicJob_in_ruleAbstractJob610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequestReplayJob_in_ruleAbstractJob637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractPort_in_entryRuleAbstractPort672 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractPort682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUsbPort_in_ruleAbstractPort729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSerialPort_in_ruleAbstractPort756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutPort_Impl_in_ruleAbstractPort783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInPort_Impl_in_ruleAbstractPort810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransmitter_in_ruleAbstractPort837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReciever_in_ruleAbstractPort864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_entryRuleAbstractSensor899 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSensor909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccelerometerSensor_in_ruleAbstractSensor956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_ruleAbstractSensor983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationSensor_in_ruleAbstractSensor1010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMicrophoneSensor_in_ruleAbstractSensor1037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_ruleAbstractSensor1064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_ruleAbstractSensor1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_ruleAbstractSensor1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChemicalSensor_in_ruleAbstractSensor1145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractFlatNode_in_entryRuleAbstractFlatNode1180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFlatNode1190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorNode_in_ruleAbstractFlatNode1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputationNode_in_ruleAbstractFlatNode1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractClusterNode_in_entryRuleAbstractClusterNode1299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractClusterNode1309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorNode_in_ruleAbstractClusterNode1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusterHeadNode_in_ruleAbstractClusterNode1383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractJobAction_in_entryRuleAbstractJobAction1418 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractJobAction1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSenseForwardAction_in_ruleAbstractJobAction1475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAggregationAction_in_ruleAbstractJobAction1502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFusionAction_in_ruleAbstractJobAction1529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReadNodeMemoryAction_in_ruleAbstractJobAction1556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWriteNodeMemoryAction_in_ruleAbstractJobAction1583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSendMessageAction_in_ruleAbstractJobAction1610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReceiveMessageAction_in_ruleAbstractJobAction1637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEInt1729 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1792 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSinkNode_in_entryRuleSinkNode1914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSinkNode1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSinkNode1970 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSinkNode1982 = new BitSet(new long[]{0x0000000001322000L});
        public static final BitSet FOLLOW_13_in_ruleSinkNode1995 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSinkNode2016 = new BitSet(new long[]{0x0000000001320000L});
        public static final BitSet FOLLOW_20_in_ruleSinkNode2031 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleSinkNode2052 = new BitSet(new long[]{0x0000000001220000L});
        public static final BitSet FOLLOW_21_in_ruleSinkNode2067 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSinkNode2079 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSinkNode2102 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_16_in_ruleSinkNode2115 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSinkNode2138 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleSinkNode2152 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleSinkNode2167 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSinkNode2179 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSinkNode2202 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_16_in_ruleSinkNode2215 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSinkNode2238 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleSinkNode2252 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSinkNode2266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlatNetwork_in_entryRuleFlatNetwork2302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFlatNetwork2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleFlatNetwork2358 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlatNetwork2370 = new BitSet(new long[]{0x000000007D222000L});
        public static final BitSet FOLLOW_13_in_ruleFlatNetwork2383 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleFlatNetwork2404 = new BitSet(new long[]{0x000000007D220000L});
        public static final BitSet FOLLOW_26_in_ruleFlatNetwork2419 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleFlatNetwork2440 = new BitSet(new long[]{0x0000000079220000L});
        public static final BitSet FOLLOW_27_in_ruleFlatNetwork2455 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
        public static final BitSet FOLLOW_ruleInterNodeComm_in_ruleFlatNetwork2476 = new BitSet(new long[]{0x0000000071220000L});
        public static final BitSet FOLLOW_28_in_ruleFlatNetwork2491 = new BitSet(new long[]{0x0000000000000000L,0x0000003FFFC00000L});
        public static final BitSet FOLLOW_ruleRoutingProtocol_in_ruleFlatNetwork2512 = new BitSet(new long[]{0x0000000061220000L});
        public static final BitSet FOLLOW_29_in_ruleFlatNetwork2527 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlatNetwork2550 = new BitSet(new long[]{0x0000000041220000L});
        public static final BitSet FOLLOW_24_in_ruleFlatNetwork2565 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlatNetwork2577 = new BitSet(new long[]{0x000001FE00000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork2598 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleFlatNetwork2611 = new BitSet(new long[]{0x000001FE00000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork2632 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleFlatNetwork2646 = new BitSet(new long[]{0x0000000040220000L});
        public static final BitSet FOLLOW_21_in_ruleFlatNetwork2661 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlatNetwork2673 = new BitSet(new long[]{0x00007E0000000000L});
        public static final BitSet FOLLOW_ruleAbstractPort_in_ruleFlatNetwork2694 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleFlatNetwork2707 = new BitSet(new long[]{0x00007E0000000000L});
        public static final BitSet FOLLOW_ruleAbstractPort_in_ruleFlatNetwork2728 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleFlatNetwork2742 = new BitSet(new long[]{0x0000000040020000L});
        public static final BitSet FOLLOW_30_in_ruleFlatNetwork2757 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlatNetwork2769 = new BitSet(new long[]{0x0001800000000000L});
        public static final BitSet FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork2790 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleFlatNetwork2803 = new BitSet(new long[]{0x0001800000000000L});
        public static final BitSet FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork2824 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleFlatNetwork2838 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFlatNetwork2852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusteredNetwork_in_entryRuleClusteredNetwork2888 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClusteredNetwork2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleClusteredNetwork2944 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusteredNetwork2956 = new BitSet(new long[]{0x000000013D222000L});
        public static final BitSet FOLLOW_13_in_ruleClusteredNetwork2969 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleClusteredNetwork2990 = new BitSet(new long[]{0x000000013D220000L});
        public static final BitSet FOLLOW_26_in_ruleClusteredNetwork3005 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleClusteredNetwork3026 = new BitSet(new long[]{0x0000000139220000L});
        public static final BitSet FOLLOW_27_in_ruleClusteredNetwork3041 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
        public static final BitSet FOLLOW_ruleInterNodeComm_in_ruleClusteredNetwork3062 = new BitSet(new long[]{0x0000000131220000L});
        public static final BitSet FOLLOW_28_in_ruleClusteredNetwork3077 = new BitSet(new long[]{0x0000000000000000L,0x0000003FFFC00000L});
        public static final BitSet FOLLOW_ruleRoutingProtocol_in_ruleClusteredNetwork3098 = new BitSet(new long[]{0x0000000121220000L});
        public static final BitSet FOLLOW_29_in_ruleClusteredNetwork3113 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClusteredNetwork3136 = new BitSet(new long[]{0x0000000101220000L});
        public static final BitSet FOLLOW_24_in_ruleClusteredNetwork3151 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusteredNetwork3163 = new BitSet(new long[]{0x000001FE00000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork3184 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleClusteredNetwork3197 = new BitSet(new long[]{0x000001FE00000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork3218 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleClusteredNetwork3232 = new BitSet(new long[]{0x0000000100220000L});
        public static final BitSet FOLLOW_21_in_ruleClusteredNetwork3247 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusteredNetwork3259 = new BitSet(new long[]{0x00007E0000000000L});
        public static final BitSet FOLLOW_ruleAbstractPort_in_ruleClusteredNetwork3280 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleClusteredNetwork3293 = new BitSet(new long[]{0x00007E0000000000L});
        public static final BitSet FOLLOW_ruleAbstractPort_in_ruleClusteredNetwork3314 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleClusteredNetwork3328 = new BitSet(new long[]{0x0000000100020000L});
        public static final BitSet FOLLOW_32_in_ruleClusteredNetwork3343 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusteredNetwork3355 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_ruleCluster_in_ruleClusteredNetwork3376 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleClusteredNetwork3389 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_ruleCluster_in_ruleClusteredNetwork3410 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleClusteredNetwork3424 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleClusteredNetwork3438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccelerometerSensor_in_entryRuleAccelerometerSensor3474 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccelerometerSensor3484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAccelerometerSensor3530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_entryRuleLightSensor3566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSensor3576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleLightSensor3622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationSensor_in_entryRuleLocationSensor3658 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocationSensor3668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleLocationSensor3714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMicrophoneSensor_in_entryRuleMicrophoneSensor3750 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMicrophoneSensor3760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleMicrophoneSensor3806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperatureSensor3852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleTemperatureSensor3898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_entryRulePressureSensor3934 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePressureSensor3944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rulePressureSensor3990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor4026 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumiditySensor4036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleHumiditySensor4082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChemicalSensor_in_entryRuleChemicalSensor4118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChemicalSensor4128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleChemicalSensor4174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUsbPort_in_entryRuleUsbPort4210 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUsbPort4220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleUsbPort4266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSerialPort_in_entryRuleSerialPort4302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSerialPort4312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleSerialPort4358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutPort_Impl_in_entryRuleOutPort_Impl4394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOutPort_Impl4404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleOutPort_Impl4450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInPort_Impl_in_entryRuleInPort_Impl4486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInPort_Impl4496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleInPort_Impl4542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransmitter_in_entryRuleTransmitter4578 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransmitter4588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleTransmitter4634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReciever_in_entryRuleReciever4670 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReciever4680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleReciever4726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorNode_in_entryRuleSensorNode4762 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensorNode4772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleSensorNode4818 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSensorNode4830 = new BitSet(new long[]{0x0000000001322000L});
        public static final BitSet FOLLOW_13_in_ruleSensorNode4843 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSensorNode4864 = new BitSet(new long[]{0x0000000001320000L});
        public static final BitSet FOLLOW_20_in_ruleSensorNode4879 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleSensorNode4900 = new BitSet(new long[]{0x0000000001220000L});
        public static final BitSet FOLLOW_21_in_ruleSensorNode4915 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSensorNode4927 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSensorNode4950 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_16_in_ruleSensorNode4963 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSensorNode4986 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleSensorNode5000 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleSensorNode5015 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSensorNode5027 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSensorNode5050 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_16_in_ruleSensorNode5063 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSensorNode5086 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleSensorNode5100 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSensorNode5114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputationNode_in_entryRuleComputationNode5150 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComputationNode5160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleComputationNode5206 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComputationNode5218 = new BitSet(new long[]{0x0000000001322000L});
        public static final BitSet FOLLOW_13_in_ruleComputationNode5231 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleComputationNode5252 = new BitSet(new long[]{0x0000000001320000L});
        public static final BitSet FOLLOW_20_in_ruleComputationNode5267 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleComputationNode5288 = new BitSet(new long[]{0x0000000001220000L});
        public static final BitSet FOLLOW_21_in_ruleComputationNode5303 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleComputationNode5315 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComputationNode5338 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_16_in_ruleComputationNode5351 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComputationNode5374 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleComputationNode5388 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleComputationNode5403 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleComputationNode5415 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComputationNode5438 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_16_in_ruleComputationNode5451 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComputationNode5474 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleComputationNode5488 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleComputationNode5502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCluster_in_entryRuleCluster5538 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCluster5548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleCluster5594 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCluster5606 = new BitSet(new long[]{0x000C000040022000L});
        public static final BitSet FOLLOW_13_in_ruleCluster5619 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCluster5640 = new BitSet(new long[]{0x000C000040020000L});
        public static final BitSet FOLLOW_50_in_ruleCluster5655 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCluster5667 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCluster5690 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_16_in_ruleCluster5703 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCluster5726 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleCluster5740 = new BitSet(new long[]{0x0008000040020000L});
        public static final BitSet FOLLOW_51_in_ruleCluster5755 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleClusterHeadNode_in_ruleCluster5776 = new BitSet(new long[]{0x0000000040020000L});
        public static final BitSet FOLLOW_30_in_ruleCluster5791 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCluster5803 = new BitSet(new long[]{0x0010800000000000L});
        public static final BitSet FOLLOW_ruleAbstractClusterNode_in_ruleCluster5824 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleCluster5837 = new BitSet(new long[]{0x0010800000000000L});
        public static final BitSet FOLLOW_ruleAbstractClusterNode_in_ruleCluster5858 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleCluster5872 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCluster5886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusterHeadNode_in_entryRuleClusterHeadNode5922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClusterHeadNode5932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleClusterHeadNode5978 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusterHeadNode5990 = new BitSet(new long[]{0x0000000001322000L});
        public static final BitSet FOLLOW_13_in_ruleClusterHeadNode6003 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleClusterHeadNode6024 = new BitSet(new long[]{0x0000000001320000L});
        public static final BitSet FOLLOW_20_in_ruleClusterHeadNode6039 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleClusterHeadNode6060 = new BitSet(new long[]{0x0000000001220000L});
        public static final BitSet FOLLOW_21_in_ruleClusterHeadNode6075 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleClusterHeadNode6087 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClusterHeadNode6110 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_16_in_ruleClusterHeadNode6123 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClusterHeadNode6146 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleClusterHeadNode6160 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleClusterHeadNode6175 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleClusterHeadNode6187 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClusterHeadNode6210 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_16_in_ruleClusterHeadNode6223 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClusterHeadNode6246 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleClusterHeadNode6260 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleClusterHeadNode6274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContinuousJob_in_entryRuleContinuousJob6310 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContinuousJob6320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleContinuousJob6366 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContinuousJob6378 = new BitSet(new long[]{0x0040000000022000L});
        public static final BitSet FOLLOW_13_in_ruleContinuousJob6391 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleContinuousJob6412 = new BitSet(new long[]{0x0040000000020000L});
        public static final BitSet FOLLOW_54_in_ruleContinuousJob6427 = new BitSet(new long[]{0x9000000000000000L,0x00000000000004E2L});
        public static final BitSet FOLLOW_ruleAbstractJobAction_in_ruleContinuousJob6448 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContinuousJob6462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEventDrivenJob_in_entryRuleEventDrivenJob6498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEventDrivenJob6508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleEventDrivenJob6554 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEventDrivenJob6566 = new BitSet(new long[]{0x0140000000022000L});
        public static final BitSet FOLLOW_13_in_ruleEventDrivenJob6579 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEventDrivenJob6600 = new BitSet(new long[]{0x0140000000020000L});
        public static final BitSet FOLLOW_54_in_ruleEventDrivenJob6615 = new BitSet(new long[]{0x9000000000000000L,0x00000000000004E2L});
        public static final BitSet FOLLOW_ruleAbstractJobAction_in_ruleEventDrivenJob6636 = new BitSet(new long[]{0x0100000000020000L});
        public static final BitSet FOLLOW_56_in_ruleEventDrivenJob6651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleLogicalCondition_in_ruleEventDrivenJob6672 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEventDrivenJob6686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicJob_in_entryRulePeriodicJob6722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeriodicJob6732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rulePeriodicJob6778 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeriodicJob6790 = new BitSet(new long[]{0x0440000000022000L});
        public static final BitSet FOLLOW_13_in_rulePeriodicJob6803 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePeriodicJob6824 = new BitSet(new long[]{0x0440000000020000L});
        public static final BitSet FOLLOW_58_in_rulePeriodicJob6839 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleELong_in_rulePeriodicJob6860 = new BitSet(new long[]{0x0040000000020000L});
        public static final BitSet FOLLOW_54_in_rulePeriodicJob6875 = new BitSet(new long[]{0x9000000000000000L,0x00000000000004E2L});
        public static final BitSet FOLLOW_ruleAbstractJobAction_in_rulePeriodicJob6896 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePeriodicJob6910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequestReplayJob_in_entryRuleRequestReplayJob6946 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequestReplayJob6956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleRequestReplayJob7002 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRequestReplayJob7014 = new BitSet(new long[]{0x0040000000022000L});
        public static final BitSet FOLLOW_13_in_ruleRequestReplayJob7027 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRequestReplayJob7048 = new BitSet(new long[]{0x0040000000020000L});
        public static final BitSet FOLLOW_54_in_ruleRequestReplayJob7063 = new BitSet(new long[]{0x9000000000000000L,0x00000000000004E2L});
        public static final BitSet FOLLOW_ruleAbstractJobAction_in_ruleRequestReplayJob7084 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRequestReplayJob7098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSenseForwardAction_in_entryRuleSenseForwardAction7134 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSenseForwardAction7144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleSenseForwardAction7190 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseForwardAction7202 = new BitSet(new long[]{0x6000000000020000L});
        public static final BitSet FOLLOW_61_in_ruleSenseForwardAction7215 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSenseForwardAction7238 = new BitSet(new long[]{0x4000000000020000L});
        public static final BitSet FOLLOW_62_in_ruleSenseForwardAction7253 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSenseForwardAction7276 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSenseForwardAction7290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAggregationAction_in_entryRuleAggregationAction7326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAggregationAction7336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleAggregationAction7382 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAggregationAction7394 = new BitSet(new long[]{0x6000000000020000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleAggregationAction7407 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000000000L});
        public static final BitSet FOLLOW_ruleAggregation_in_ruleAggregationAction7428 = new BitSet(new long[]{0x6000000000020000L});
        public static final BitSet FOLLOW_61_in_ruleAggregationAction7443 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAggregationAction7466 = new BitSet(new long[]{0x4000000000020000L});
        public static final BitSet FOLLOW_62_in_ruleAggregationAction7481 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAggregationAction7504 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAggregationAction7518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFusionAction_in_entryRuleFusionAction7554 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFusionAction7564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleFusionAction7610 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFusionAction7622 = new BitSet(new long[]{0x2000000000020000L,0x000000000000001CL});
        public static final BitSet FOLLOW_66_in_ruleFusionAction7635 = new BitSet(new long[]{0x0000000000000000L,0x0003C00000000000L});
        public static final BitSet FOLLOW_ruleFusion_in_ruleFusionAction7656 = new BitSet(new long[]{0x2000000000020000L,0x0000000000000018L});
        public static final BitSet FOLLOW_61_in_ruleFusionAction7671 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFusionAction7694 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000018L});
        public static final BitSet FOLLOW_67_in_ruleFusionAction7709 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFusionAction7732 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleFusionAction7747 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFusionAction7770 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFusionAction7784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReadNodeMemoryAction_in_entryRuleReadNodeMemoryAction7820 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReadNodeMemoryAction7830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleReadNodeMemoryAction7876 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleReadNodeMemoryAction7888 = new BitSet(new long[]{0x6000000000020000L});
        public static final BitSet FOLLOW_61_in_ruleReadNodeMemoryAction7901 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReadNodeMemoryAction7924 = new BitSet(new long[]{0x4000000000020000L});
        public static final BitSet FOLLOW_62_in_ruleReadNodeMemoryAction7939 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReadNodeMemoryAction7962 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleReadNodeMemoryAction7976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWriteNodeMemoryAction_in_entryRuleWriteNodeMemoryAction8012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWriteNodeMemoryAction8022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleWriteNodeMemoryAction8068 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWriteNodeMemoryAction8080 = new BitSet(new long[]{0x6000000000020000L});
        public static final BitSet FOLLOW_61_in_ruleWriteNodeMemoryAction8093 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWriteNodeMemoryAction8116 = new BitSet(new long[]{0x4000000000020000L});
        public static final BitSet FOLLOW_62_in_ruleWriteNodeMemoryAction8131 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWriteNodeMemoryAction8154 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleWriteNodeMemoryAction8168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSendMessageAction_in_entryRuleSendMessageAction8204 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSendMessageAction8214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleSendMessageAction8260 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSendMessageAction8272 = new BitSet(new long[]{0x6000000000020000L,0x0000000000000300L});
        public static final BitSet FOLLOW_72_in_ruleSendMessageAction8285 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSendMessageAction8306 = new BitSet(new long[]{0x6000000000020000L,0x0000000000000200L});
        public static final BitSet FOLLOW_61_in_ruleSendMessageAction8321 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSendMessageAction8344 = new BitSet(new long[]{0x4000000000020000L,0x0000000000000200L});
        public static final BitSet FOLLOW_62_in_ruleSendMessageAction8359 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSendMessageAction8382 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_ruleSendMessageAction8397 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSendMessageAction8420 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSendMessageAction8434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReceiveMessageAction_in_entryRuleReceiveMessageAction8470 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReceiveMessageAction8480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleReceiveMessageAction8526 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleReceiveMessageAction8538 = new BitSet(new long[]{0x6000000000020000L,0x0000000000000800L});
        public static final BitSet FOLLOW_61_in_ruleReceiveMessageAction8551 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReceiveMessageAction8574 = new BitSet(new long[]{0x4000000000020000L,0x0000000000000800L});
        public static final BitSet FOLLOW_62_in_ruleReceiveMessageAction8589 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReceiveMessageAction8612 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_ruleReceiveMessageAction8627 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReceiveMessageAction8650 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleReceiveMessageAction8664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalCondition_in_entryRuleLogicalCondition8700 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalCondition8710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleLogicalCondition8756 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLogicalCondition8768 = new BitSet(new long[]{0x0000000000020000L,0x000000000003E000L});
        public static final BitSet FOLLOW_77_in_ruleLogicalCondition8781 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
        public static final BitSet FOLLOW_ruleJobSchedule_in_ruleLogicalCondition8802 = new BitSet(new long[]{0x0000000000020000L,0x000000000003C000L});
        public static final BitSet FOLLOW_78_in_ruleLogicalCondition8817 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLogicalCondition8838 = new BitSet(new long[]{0x0000000000020000L,0x0000000000038000L});
        public static final BitSet FOLLOW_79_in_ruleLogicalCondition8853 = new BitSet(new long[]{0x0000000000000000L,0x03F0000000000000L});
        public static final BitSet FOLLOW_ruleLogicalSymbol_in_ruleLogicalCondition8874 = new BitSet(new long[]{0x0000000000020000L,0x0000000000030000L});
        public static final BitSet FOLLOW_80_in_ruleLogicalCondition8889 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleLogicalCondition8910 = new BitSet(new long[]{0x0000000000020000L,0x0000000000020000L});
        public static final BitSet FOLLOW_81_in_ruleLogicalCondition8925 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLogicalCondition8946 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLogicalCondition8960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_entryRuleELong8997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleELong9008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleELong9047 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleELong9064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleInterNodeComm9123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleInterNodeComm9140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleInterNodeComm9157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleInterNodeComm9174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleRoutingProtocol9219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleRoutingProtocol9236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleRoutingProtocol9253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleRoutingProtocol9270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleRoutingProtocol9287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleRoutingProtocol9304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleRoutingProtocol9321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_ruleRoutingProtocol9338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleRoutingProtocol9355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_ruleRoutingProtocol9372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_ruleRoutingProtocol9389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_97_in_ruleRoutingProtocol9406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_ruleRoutingProtocol9423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_99_in_ruleRoutingProtocol9440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_ruleRoutingProtocol9457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_101_in_ruleRoutingProtocol9474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_102_in_rulePosition9519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_103_in_rulePosition9536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_104_in_ruleAggregation9581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_105_in_ruleAggregation9598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_106_in_ruleAggregation9615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_107_in_ruleAggregation9632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_108_in_ruleAggregation9649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_109_in_ruleAggregation9666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_110_in_ruleFusion9711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_111_in_ruleFusion9728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_112_in_ruleFusion9745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_113_in_ruleFusion9762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_114_in_ruleJobSchedule9807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_115_in_ruleJobSchedule9824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_116_in_ruleLogicalSymbol9869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_117_in_ruleLogicalSymbol9886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_118_in_ruleLogicalSymbol9903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_119_in_ruleLogicalSymbol9920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_120_in_ruleLogicalSymbol9937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_121_in_ruleLogicalSymbol9954 = new BitSet(new long[]{0x0000000000000002L});
    }


}