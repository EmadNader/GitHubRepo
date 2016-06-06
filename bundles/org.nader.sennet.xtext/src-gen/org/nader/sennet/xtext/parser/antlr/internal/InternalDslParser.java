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
import org.nader.sennet.xtext.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SeNetApp'", "'{'", "'id'", "'jobs'", "','", "'}'", "'-'", "'SenseForwardJob'", "'sensingThreshold'", "'JobTargetNode'", "'JobTargetNetwork'", "'startEndTrigger'", "'jobaction'", "'AggregationJob'", "'aggregation'", "'FusionJob'", "'fusion'", "'SenseNowJob'", "'SinkJob'", "'RegularSenseJob'", "'SensorNode'", "'position'", "'nodeResources'", "'ClusterHeadNode'", "'SinkNode'", "'ComputationNode'", "'AccelerometerSensor'", "'LightSensor'", "'LocationSensor'", "'MicrophoneSensor'", "'TemperatureSensor'", "'PressureSensor'", "'HumiditySensor'", "'VoltageSensor'", "'FlatNetwork'", "'nbOfNodes'", "'interNodeComm'", "'routingProtocol'", "'resources'", "'sink'", "'nodes'", "'ClusteredNetwork'", "'clusters'", "'Cluster'", "'('", "')'", "'ReceiveMessageTrigger'", "'RecieveSerialMsgTrigger'", "'StartJobTrigger'", "'StopJobTrigger'", "'PushButtomTrigger'", "'ConditionalAction'", "'sensorTerm'", "'logicalSymbol'", "'value'", "'unit'", "'ReadNodeMemoryAction'", "'condition'", "'WriteNodeMemoryAction'", "'SendMessageAction'", "'sendMessageTo'", "'BlinkAction'", "'led'", "'status'", "'SendSerialPortMsgAction'", "'mobile'", "'static'", "'BT'", "'Zigbee'", "'WLan'", "'RF'", "'leach'", "'lqrp'", "'spin'", "'aodv'", "'dodv'", "'dsr'", "'dsdv'", "'gsr'", "'heed'", "'gaf'", "'gear'", "'tbf'", "'ead'", "'pegasis'", "'teen'", "'speed'", "'ctp'", "'dismentation'", "'activeMessage'", "'equal'", "'greaterThan'", "'greaterOrEqualThan'", "'lessThan'", "'lessOrEqualThan'", "'notEqual'", "'led0'", "'led1'", "'led2'", "'on'", "'off'", "'toggle'", "'filtering'", "'compression'", "'max'", "'min'", "'avg'", "'count'", "'classification'", "'event_detection'", "'tracking'", "'decision_making'"
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
    public static final int T__122=122;
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


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SeNetApp";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSeNetApp"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:68:1: entryRuleSeNetApp returns [EObject current=null] : iv_ruleSeNetApp= ruleSeNetApp EOF ;
    public final EObject entryRuleSeNetApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeNetApp = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:69:2: (iv_ruleSeNetApp= ruleSeNetApp EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:70:2: iv_ruleSeNetApp= ruleSeNetApp EOF
            {
             newCompositeNode(grammarAccess.getSeNetAppRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSeNetApp_in_entryRuleSeNetApp75);
            iv_ruleSeNetApp=ruleSeNetApp();

            state._fsp--;

             current =iv_ruleSeNetApp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSeNetApp85); 

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
    // $ANTLR end "entryRuleSeNetApp"


    // $ANTLR start "ruleSeNetApp"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:77:1: ruleSeNetApp returns [EObject current=null] : ( () otherlv_1= 'SeNetApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleSeNetApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        EObject lv_jobs_8_0 = null;

        EObject lv_jobs_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:80:28: ( ( () otherlv_1= 'SeNetApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:81:1: ( () otherlv_1= 'SeNetApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:81:1: ( () otherlv_1= 'SeNetApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:81:2: () otherlv_1= 'SeNetApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:81:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSeNetAppAccess().getSeNetAppAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSeNetApp131); 

                	newLeafNode(otherlv_1, grammarAccess.getSeNetAppAccess().getSeNetAppKeyword_1());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:92:1: (lv_name_2_0= ruleEString )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSeNetAppAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSeNetApp152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSeNetAppRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSeNetApp164); 

                	newLeafNode(otherlv_3, grammarAccess.getSeNetAppAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:113:1: (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:113:3: otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSeNetApp177); 

                        	newLeafNode(otherlv_4, grammarAccess.getSeNetAppAccess().getIdKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:117:1: ( (lv_id_5_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:118:1: (lv_id_5_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:118:1: (lv_id_5_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:119:3: lv_id_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSeNetAppAccess().getIdEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSeNetApp198);
                    lv_id_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSeNetAppRule());
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:135:4: (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:135:6: otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSeNetApp213); 

                        	newLeafNode(otherlv_6, grammarAccess.getSeNetAppAccess().getJobsKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSeNetApp225); 

                        	newLeafNode(otherlv_7, grammarAccess.getSeNetAppAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:143:1: ( (lv_jobs_8_0= ruleAbstractJob ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:144:1: (lv_jobs_8_0= ruleAbstractJob )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:144:1: (lv_jobs_8_0= ruleAbstractJob )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:145:3: lv_jobs_8_0= ruleAbstractJob
                    {
                     
                    	        newCompositeNode(grammarAccess.getSeNetAppAccess().getJobsAbstractJobParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractJob_in_ruleSeNetApp246);
                    lv_jobs_8_0=ruleAbstractJob();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSeNetAppRule());
                    	        }
                           		add(
                           			current, 
                           			"jobs",
                            		lv_jobs_8_0, 
                            		"AbstractJob");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:161:2: (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:161:4: otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSeNetApp259); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSeNetAppAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:165:1: ( (lv_jobs_10_0= ruleAbstractJob ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:166:1: (lv_jobs_10_0= ruleAbstractJob )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:166:1: (lv_jobs_10_0= ruleAbstractJob )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:167:3: lv_jobs_10_0= ruleAbstractJob
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSeNetAppAccess().getJobsAbstractJobParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractJob_in_ruleSeNetApp280);
                    	    lv_jobs_10_0=ruleAbstractJob();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSeNetAppRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobs",
                    	            		lv_jobs_10_0, 
                    	            		"AbstractJob");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSeNetApp294); 

                        	newLeafNode(otherlv_11, grammarAccess.getSeNetAppAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSeNetApp308); 

                	newLeafNode(otherlv_12, grammarAccess.getSeNetAppAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSeNetApp"


    // $ANTLR start "entryRuleAbstractJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:199:1: entryRuleAbstractJob returns [EObject current=null] : iv_ruleAbstractJob= ruleAbstractJob EOF ;
    public final EObject entryRuleAbstractJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:200:2: (iv_ruleAbstractJob= ruleAbstractJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:201:2: iv_ruleAbstractJob= ruleAbstractJob EOF
            {
             newCompositeNode(grammarAccess.getAbstractJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractJob_in_entryRuleAbstractJob344);
            iv_ruleAbstractJob=ruleAbstractJob();

            state._fsp--;

             current =iv_ruleAbstractJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractJob354); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:208:1: ruleAbstractJob returns [EObject current=null] : (this_SenseForwardJob_0= ruleSenseForwardJob | this_AggregationJob_1= ruleAggregationJob | this_FusionJob_2= ruleFusionJob | this_SenseNowJob_3= ruleSenseNowJob | this_SinkJob_4= ruleSinkJob | this_RegularSenseJob_5= ruleRegularSenseJob ) ;
    public final EObject ruleAbstractJob() throws RecognitionException {
        EObject current = null;

        EObject this_SenseForwardJob_0 = null;

        EObject this_AggregationJob_1 = null;

        EObject this_FusionJob_2 = null;

        EObject this_SenseNowJob_3 = null;

        EObject this_SinkJob_4 = null;

        EObject this_RegularSenseJob_5 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:211:28: ( (this_SenseForwardJob_0= ruleSenseForwardJob | this_AggregationJob_1= ruleAggregationJob | this_FusionJob_2= ruleFusionJob | this_SenseNowJob_3= ruleSenseNowJob | this_SinkJob_4= ruleSinkJob | this_RegularSenseJob_5= ruleRegularSenseJob ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:212:1: (this_SenseForwardJob_0= ruleSenseForwardJob | this_AggregationJob_1= ruleAggregationJob | this_FusionJob_2= ruleFusionJob | this_SenseNowJob_3= ruleSenseNowJob | this_SinkJob_4= ruleSinkJob | this_RegularSenseJob_5= ruleRegularSenseJob )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:212:1: (this_SenseForwardJob_0= ruleSenseForwardJob | this_AggregationJob_1= ruleAggregationJob | this_FusionJob_2= ruleFusionJob | this_SenseNowJob_3= ruleSenseNowJob | this_SinkJob_4= ruleSinkJob | this_RegularSenseJob_5= ruleRegularSenseJob )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            case 29:
                {
                alt4=5;
                }
                break;
            case 30:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:213:5: this_SenseForwardJob_0= ruleSenseForwardJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getSenseForwardJobParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSenseForwardJob_in_ruleAbstractJob401);
                    this_SenseForwardJob_0=ruleSenseForwardJob();

                    state._fsp--;

                     
                            current = this_SenseForwardJob_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:223:5: this_AggregationJob_1= ruleAggregationJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getAggregationJobParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAggregationJob_in_ruleAbstractJob428);
                    this_AggregationJob_1=ruleAggregationJob();

                    state._fsp--;

                     
                            current = this_AggregationJob_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:233:5: this_FusionJob_2= ruleFusionJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getFusionJobParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFusionJob_in_ruleAbstractJob455);
                    this_FusionJob_2=ruleFusionJob();

                    state._fsp--;

                     
                            current = this_FusionJob_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:243:5: this_SenseNowJob_3= ruleSenseNowJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getSenseNowJobParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSenseNowJob_in_ruleAbstractJob482);
                    this_SenseNowJob_3=ruleSenseNowJob();

                    state._fsp--;

                     
                            current = this_SenseNowJob_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:253:5: this_SinkJob_4= ruleSinkJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getSinkJobParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSinkJob_in_ruleAbstractJob509);
                    this_SinkJob_4=ruleSinkJob();

                    state._fsp--;

                     
                            current = this_SinkJob_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:263:5: this_RegularSenseJob_5= ruleRegularSenseJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getRegularSenseJobParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRegularSenseJob_in_ruleAbstractJob536);
                    this_RegularSenseJob_5=ruleRegularSenseJob();

                    state._fsp--;

                     
                            current = this_RegularSenseJob_5; 
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


    // $ANTLR start "entryRuleAbstractNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:279:1: entryRuleAbstractNode returns [EObject current=null] : iv_ruleAbstractNode= ruleAbstractNode EOF ;
    public final EObject entryRuleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:280:2: (iv_ruleAbstractNode= ruleAbstractNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:281:2: iv_ruleAbstractNode= ruleAbstractNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode571);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;

             current =iv_ruleAbstractNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode581); 

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
    // $ANTLR end "entryRuleAbstractNode"


    // $ANTLR start "ruleAbstractNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:288:1: ruleAbstractNode returns [EObject current=null] : (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode | this_SinkNode_2= ruleSinkNode | this_ComputationNode_3= ruleComputationNode ) ;
    public final EObject ruleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject this_SensorNode_0 = null;

        EObject this_ClusterHeadNode_1 = null;

        EObject this_SinkNode_2 = null;

        EObject this_ComputationNode_3 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:291:28: ( (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode | this_SinkNode_2= ruleSinkNode | this_ComputationNode_3= ruleComputationNode ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:292:1: (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode | this_SinkNode_2= ruleSinkNode | this_ComputationNode_3= ruleComputationNode )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:292:1: (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode | this_SinkNode_2= ruleSinkNode | this_ComputationNode_3= ruleComputationNode )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 34:
                {
                alt5=2;
                }
                break;
            case 35:
                {
                alt5=3;
                }
                break;
            case 36:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:293:5: this_SensorNode_0= ruleSensorNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getSensorNodeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSensorNode_in_ruleAbstractNode628);
                    this_SensorNode_0=ruleSensorNode();

                    state._fsp--;

                     
                            current = this_SensorNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:303:5: this_ClusterHeadNode_1= ruleClusterHeadNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getClusterHeadNodeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClusterHeadNode_in_ruleAbstractNode655);
                    this_ClusterHeadNode_1=ruleClusterHeadNode();

                    state._fsp--;

                     
                            current = this_ClusterHeadNode_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:313:5: this_SinkNode_2= ruleSinkNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getSinkNodeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSinkNode_in_ruleAbstractNode682);
                    this_SinkNode_2=ruleSinkNode();

                    state._fsp--;

                     
                            current = this_SinkNode_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:323:5: this_ComputationNode_3= ruleComputationNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getComputationNodeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComputationNode_in_ruleAbstractNode709);
                    this_ComputationNode_3=ruleComputationNode();

                    state._fsp--;

                     
                            current = this_ComputationNode_3; 
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
    // $ANTLR end "ruleAbstractNode"


    // $ANTLR start "entryRuleAbstractNetwork"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:339:1: entryRuleAbstractNetwork returns [EObject current=null] : iv_ruleAbstractNetwork= ruleAbstractNetwork EOF ;
    public final EObject entryRuleAbstractNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNetwork = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:340:2: (iv_ruleAbstractNetwork= ruleAbstractNetwork EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:341:2: iv_ruleAbstractNetwork= ruleAbstractNetwork EOF
            {
             newCompositeNode(grammarAccess.getAbstractNetworkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_entryRuleAbstractNetwork744);
            iv_ruleAbstractNetwork=ruleAbstractNetwork();

            state._fsp--;

             current =iv_ruleAbstractNetwork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNetwork754); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:348:1: ruleAbstractNetwork returns [EObject current=null] : (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork ) ;
    public final EObject ruleAbstractNetwork() throws RecognitionException {
        EObject current = null;

        EObject this_FlatNetwork_0 = null;

        EObject this_ClusteredNetwork_1 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:351:28: ( (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:352:1: (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:352:1: (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==45) ) {
                alt6=1;
            }
            else if ( (LA6_0==52) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:353:5: this_FlatNetwork_0= ruleFlatNetwork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNetworkAccess().getFlatNetworkParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFlatNetwork_in_ruleAbstractNetwork801);
                    this_FlatNetwork_0=ruleFlatNetwork();

                    state._fsp--;

                     
                            current = this_FlatNetwork_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:363:5: this_ClusteredNetwork_1= ruleClusteredNetwork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNetworkAccess().getClusteredNetworkParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClusteredNetwork_in_ruleAbstractNetwork828);
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


    // $ANTLR start "entryRuleAbstractStartEndingJobTrigger"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:379:1: entryRuleAbstractStartEndingJobTrigger returns [EObject current=null] : iv_ruleAbstractStartEndingJobTrigger= ruleAbstractStartEndingJobTrigger EOF ;
    public final EObject entryRuleAbstractStartEndingJobTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractStartEndingJobTrigger = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:380:2: (iv_ruleAbstractStartEndingJobTrigger= ruleAbstractStartEndingJobTrigger EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:381:2: iv_ruleAbstractStartEndingJobTrigger= ruleAbstractStartEndingJobTrigger EOF
            {
             newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_entryRuleAbstractStartEndingJobTrigger863);
            iv_ruleAbstractStartEndingJobTrigger=ruleAbstractStartEndingJobTrigger();

            state._fsp--;

             current =iv_ruleAbstractStartEndingJobTrigger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractStartEndingJobTrigger873); 

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
    // $ANTLR end "entryRuleAbstractStartEndingJobTrigger"


    // $ANTLR start "ruleAbstractStartEndingJobTrigger"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:388:1: ruleAbstractStartEndingJobTrigger returns [EObject current=null] : (this_ReceiveMessageTrigger_0= ruleReceiveMessageTrigger | this_RecieveSerialMsgTrigger_1= ruleRecieveSerialMsgTrigger | this_StartJobTrigger_Impl_2= ruleStartJobTrigger_Impl | this_StopJobTrigger_Impl_3= ruleStopJobTrigger_Impl | this_PushButtomTrigger_4= rulePushButtomTrigger ) ;
    public final EObject ruleAbstractStartEndingJobTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReceiveMessageTrigger_0 = null;

        EObject this_RecieveSerialMsgTrigger_1 = null;

        EObject this_StartJobTrigger_Impl_2 = null;

        EObject this_StopJobTrigger_Impl_3 = null;

        EObject this_PushButtomTrigger_4 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:391:28: ( (this_ReceiveMessageTrigger_0= ruleReceiveMessageTrigger | this_RecieveSerialMsgTrigger_1= ruleRecieveSerialMsgTrigger | this_StartJobTrigger_Impl_2= ruleStartJobTrigger_Impl | this_StopJobTrigger_Impl_3= ruleStopJobTrigger_Impl | this_PushButtomTrigger_4= rulePushButtomTrigger ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:392:1: (this_ReceiveMessageTrigger_0= ruleReceiveMessageTrigger | this_RecieveSerialMsgTrigger_1= ruleRecieveSerialMsgTrigger | this_StartJobTrigger_Impl_2= ruleStartJobTrigger_Impl | this_StopJobTrigger_Impl_3= ruleStopJobTrigger_Impl | this_PushButtomTrigger_4= rulePushButtomTrigger )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:392:1: (this_ReceiveMessageTrigger_0= ruleReceiveMessageTrigger | this_RecieveSerialMsgTrigger_1= ruleRecieveSerialMsgTrigger | this_StartJobTrigger_Impl_2= ruleStartJobTrigger_Impl | this_StopJobTrigger_Impl_3= ruleStopJobTrigger_Impl | this_PushButtomTrigger_4= rulePushButtomTrigger )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt7=1;
                }
                break;
            case 58:
                {
                alt7=2;
                }
                break;
            case 59:
                {
                alt7=3;
                }
                break;
            case 60:
                {
                alt7=4;
                }
                break;
            case 61:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:393:5: this_ReceiveMessageTrigger_0= ruleReceiveMessageTrigger
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerAccess().getReceiveMessageTriggerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReceiveMessageTrigger_in_ruleAbstractStartEndingJobTrigger920);
                    this_ReceiveMessageTrigger_0=ruleReceiveMessageTrigger();

                    state._fsp--;

                     
                            current = this_ReceiveMessageTrigger_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:403:5: this_RecieveSerialMsgTrigger_1= ruleRecieveSerialMsgTrigger
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerAccess().getRecieveSerialMsgTriggerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRecieveSerialMsgTrigger_in_ruleAbstractStartEndingJobTrigger947);
                    this_RecieveSerialMsgTrigger_1=ruleRecieveSerialMsgTrigger();

                    state._fsp--;

                     
                            current = this_RecieveSerialMsgTrigger_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:413:5: this_StartJobTrigger_Impl_2= ruleStartJobTrigger_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerAccess().getStartJobTrigger_ImplParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStartJobTrigger_Impl_in_ruleAbstractStartEndingJobTrigger974);
                    this_StartJobTrigger_Impl_2=ruleStartJobTrigger_Impl();

                    state._fsp--;

                     
                            current = this_StartJobTrigger_Impl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:423:5: this_StopJobTrigger_Impl_3= ruleStopJobTrigger_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerAccess().getStopJobTrigger_ImplParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStopJobTrigger_Impl_in_ruleAbstractStartEndingJobTrigger1001);
                    this_StopJobTrigger_Impl_3=ruleStopJobTrigger_Impl();

                    state._fsp--;

                     
                            current = this_StopJobTrigger_Impl_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:433:5: this_PushButtomTrigger_4= rulePushButtomTrigger
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerAccess().getPushButtomTriggerParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePushButtomTrigger_in_ruleAbstractStartEndingJobTrigger1028);
                    this_PushButtomTrigger_4=rulePushButtomTrigger();

                    state._fsp--;

                     
                            current = this_PushButtomTrigger_4; 
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
    // $ANTLR end "ruleAbstractStartEndingJobTrigger"


    // $ANTLR start "entryRuleAbstratAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:449:1: entryRuleAbstratAction returns [EObject current=null] : iv_ruleAbstratAction= ruleAbstratAction EOF ;
    public final EObject entryRuleAbstratAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstratAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:450:2: (iv_ruleAbstratAction= ruleAbstratAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:451:2: iv_ruleAbstratAction= ruleAbstratAction EOF
            {
             newCompositeNode(grammarAccess.getAbstratActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_entryRuleAbstratAction1063);
            iv_ruleAbstratAction=ruleAbstratAction();

            state._fsp--;

             current =iv_ruleAbstratAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstratAction1073); 

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
    // $ANTLR end "entryRuleAbstratAction"


    // $ANTLR start "ruleAbstratAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:458:1: ruleAbstratAction returns [EObject current=null] : (this_ReadNodeMemoryAction_0= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_1= ruleWriteNodeMemoryAction | this_SendMessageAction_2= ruleSendMessageAction | this_BlinkAction_3= ruleBlinkAction | this_SendSerialPortMsgAction_4= ruleSendSerialPortMsgAction ) ;
    public final EObject ruleAbstratAction() throws RecognitionException {
        EObject current = null;

        EObject this_ReadNodeMemoryAction_0 = null;

        EObject this_WriteNodeMemoryAction_1 = null;

        EObject this_SendMessageAction_2 = null;

        EObject this_BlinkAction_3 = null;

        EObject this_SendSerialPortMsgAction_4 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:461:28: ( (this_ReadNodeMemoryAction_0= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_1= ruleWriteNodeMemoryAction | this_SendMessageAction_2= ruleSendMessageAction | this_BlinkAction_3= ruleBlinkAction | this_SendSerialPortMsgAction_4= ruleSendSerialPortMsgAction ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:462:1: (this_ReadNodeMemoryAction_0= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_1= ruleWriteNodeMemoryAction | this_SendMessageAction_2= ruleSendMessageAction | this_BlinkAction_3= ruleBlinkAction | this_SendSerialPortMsgAction_4= ruleSendSerialPortMsgAction )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:462:1: (this_ReadNodeMemoryAction_0= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_1= ruleWriteNodeMemoryAction | this_SendMessageAction_2= ruleSendMessageAction | this_BlinkAction_3= ruleBlinkAction | this_SendSerialPortMsgAction_4= ruleSendSerialPortMsgAction )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt8=1;
                }
                break;
            case 69:
                {
                alt8=2;
                }
                break;
            case 70:
                {
                alt8=3;
                }
                break;
            case 72:
                {
                alt8=4;
                }
                break;
            case 75:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:463:5: this_ReadNodeMemoryAction_0= ruleReadNodeMemoryAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstratActionAccess().getReadNodeMemoryActionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReadNodeMemoryAction_in_ruleAbstratAction1120);
                    this_ReadNodeMemoryAction_0=ruleReadNodeMemoryAction();

                    state._fsp--;

                     
                            current = this_ReadNodeMemoryAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:473:5: this_WriteNodeMemoryAction_1= ruleWriteNodeMemoryAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstratActionAccess().getWriteNodeMemoryActionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWriteNodeMemoryAction_in_ruleAbstratAction1147);
                    this_WriteNodeMemoryAction_1=ruleWriteNodeMemoryAction();

                    state._fsp--;

                     
                            current = this_WriteNodeMemoryAction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:483:5: this_SendMessageAction_2= ruleSendMessageAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstratActionAccess().getSendMessageActionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSendMessageAction_in_ruleAbstratAction1174);
                    this_SendMessageAction_2=ruleSendMessageAction();

                    state._fsp--;

                     
                            current = this_SendMessageAction_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:493:5: this_BlinkAction_3= ruleBlinkAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstratActionAccess().getBlinkActionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBlinkAction_in_ruleAbstratAction1201);
                    this_BlinkAction_3=ruleBlinkAction();

                    state._fsp--;

                     
                            current = this_BlinkAction_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:503:5: this_SendSerialPortMsgAction_4= ruleSendSerialPortMsgAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstratActionAccess().getSendSerialPortMsgActionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSendSerialPortMsgAction_in_ruleAbstratAction1228);
                    this_SendSerialPortMsgAction_4=ruleSendSerialPortMsgAction();

                    state._fsp--;

                     
                            current = this_SendSerialPortMsgAction_4; 
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
    // $ANTLR end "ruleAbstratAction"


    // $ANTLR start "entryRuleAbstractSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:519:1: entryRuleAbstractSensor returns [EObject current=null] : iv_ruleAbstractSensor= ruleAbstractSensor EOF ;
    public final EObject entryRuleAbstractSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:520:2: (iv_ruleAbstractSensor= ruleAbstractSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:521:2: iv_ruleAbstractSensor= ruleAbstractSensor EOF
            {
             newCompositeNode(grammarAccess.getAbstractSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_entryRuleAbstractSensor1263);
            iv_ruleAbstractSensor=ruleAbstractSensor();

            state._fsp--;

             current =iv_ruleAbstractSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractSensor1273); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:528:1: ruleAbstractSensor returns [EObject current=null] : (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_VoltageSensor_7= ruleVoltageSensor ) ;
    public final EObject ruleAbstractSensor() throws RecognitionException {
        EObject current = null;

        EObject this_AccelerometerSensor_0 = null;

        EObject this_LightSensor_1 = null;

        EObject this_LocationSensor_2 = null;

        EObject this_MicrophoneSensor_3 = null;

        EObject this_TemperatureSensor_4 = null;

        EObject this_PressureSensor_5 = null;

        EObject this_HumiditySensor_6 = null;

        EObject this_VoltageSensor_7 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:531:28: ( (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_VoltageSensor_7= ruleVoltageSensor ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:532:1: (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_VoltageSensor_7= ruleVoltageSensor )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:532:1: (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_VoltageSensor_7= ruleVoltageSensor )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt9=1;
                }
                break;
            case 38:
                {
                alt9=2;
                }
                break;
            case 39:
                {
                alt9=3;
                }
                break;
            case 40:
                {
                alt9=4;
                }
                break;
            case 41:
                {
                alt9=5;
                }
                break;
            case 42:
                {
                alt9=6;
                }
                break;
            case 43:
                {
                alt9=7;
                }
                break;
            case 44:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:533:5: this_AccelerometerSensor_0= ruleAccelerometerSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getAccelerometerSensorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAccelerometerSensor_in_ruleAbstractSensor1320);
                    this_AccelerometerSensor_0=ruleAccelerometerSensor();

                    state._fsp--;

                     
                            current = this_AccelerometerSensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:543:5: this_LightSensor_1= ruleLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getLightSensorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_ruleAbstractSensor1347);
                    this_LightSensor_1=ruleLightSensor();

                    state._fsp--;

                     
                            current = this_LightSensor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:553:5: this_LocationSensor_2= ruleLocationSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getLocationSensorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLocationSensor_in_ruleAbstractSensor1374);
                    this_LocationSensor_2=ruleLocationSensor();

                    state._fsp--;

                     
                            current = this_LocationSensor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:563:5: this_MicrophoneSensor_3= ruleMicrophoneSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getMicrophoneSensorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMicrophoneSensor_in_ruleAbstractSensor1401);
                    this_MicrophoneSensor_3=ruleMicrophoneSensor();

                    state._fsp--;

                     
                            current = this_MicrophoneSensor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:573:5: this_TemperatureSensor_4= ruleTemperatureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getTemperatureSensorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_ruleAbstractSensor1428);
                    this_TemperatureSensor_4=ruleTemperatureSensor();

                    state._fsp--;

                     
                            current = this_TemperatureSensor_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:583:5: this_PressureSensor_5= rulePressureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getPressureSensorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_ruleAbstractSensor1455);
                    this_PressureSensor_5=rulePressureSensor();

                    state._fsp--;

                     
                            current = this_PressureSensor_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:593:5: this_HumiditySensor_6= ruleHumiditySensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getHumiditySensorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_ruleAbstractSensor1482);
                    this_HumiditySensor_6=ruleHumiditySensor();

                    state._fsp--;

                     
                            current = this_HumiditySensor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:603:5: this_VoltageSensor_7= ruleVoltageSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getVoltageSensorParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVoltageSensor_in_ruleAbstractSensor1509);
                    this_VoltageSensor_7=ruleVoltageSensor();

                    state._fsp--;

                     
                            current = this_VoltageSensor_7; 
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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:619:1: entryRuleAbstractFlatNode returns [EObject current=null] : iv_ruleAbstractFlatNode= ruleAbstractFlatNode EOF ;
    public final EObject entryRuleAbstractFlatNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFlatNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:620:2: (iv_ruleAbstractFlatNode= ruleAbstractFlatNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:621:2: iv_ruleAbstractFlatNode= ruleAbstractFlatNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractFlatNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractFlatNode_in_entryRuleAbstractFlatNode1544);
            iv_ruleAbstractFlatNode=ruleAbstractFlatNode();

            state._fsp--;

             current =iv_ruleAbstractFlatNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractFlatNode1554); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:628:1: ruleAbstractFlatNode returns [EObject current=null] : (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode ) ;
    public final EObject ruleAbstractFlatNode() throws RecognitionException {
        EObject current = null;

        EObject this_SensorNode_0 = null;

        EObject this_ComputationNode_1 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:631:28: ( (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:632:1: (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:632:1: (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( (LA10_0==36) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:633:5: this_SensorNode_0= ruleSensorNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFlatNodeAccess().getSensorNodeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSensorNode_in_ruleAbstractFlatNode1601);
                    this_SensorNode_0=ruleSensorNode();

                    state._fsp--;

                     
                            current = this_SensorNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:643:5: this_ComputationNode_1= ruleComputationNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFlatNodeAccess().getComputationNodeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComputationNode_in_ruleAbstractFlatNode1628);
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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:659:1: entryRuleAbstractClusterNode returns [EObject current=null] : iv_ruleAbstractClusterNode= ruleAbstractClusterNode EOF ;
    public final EObject entryRuleAbstractClusterNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractClusterNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:660:2: (iv_ruleAbstractClusterNode= ruleAbstractClusterNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:661:2: iv_ruleAbstractClusterNode= ruleAbstractClusterNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractClusterNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractClusterNode_in_entryRuleAbstractClusterNode1663);
            iv_ruleAbstractClusterNode=ruleAbstractClusterNode();

            state._fsp--;

             current =iv_ruleAbstractClusterNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractClusterNode1673); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:668:1: ruleAbstractClusterNode returns [EObject current=null] : (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode ) ;
    public final EObject ruleAbstractClusterNode() throws RecognitionException {
        EObject current = null;

        EObject this_SensorNode_0 = null;

        EObject this_ClusterHeadNode_1 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:671:28: ( (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:672:1: (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:672:1: (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==34) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:673:5: this_SensorNode_0= ruleSensorNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractClusterNodeAccess().getSensorNodeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSensorNode_in_ruleAbstractClusterNode1720);
                    this_SensorNode_0=ruleSensorNode();

                    state._fsp--;

                     
                            current = this_SensorNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:683:5: this_ClusterHeadNode_1= ruleClusterHeadNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractClusterNodeAccess().getClusterHeadNodeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClusterHeadNode_in_ruleAbstractClusterNode1747);
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


    // $ANTLR start "entryRuleEInt"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:699:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:700:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:701:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1783);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1794); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:708:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:711:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:712:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:712:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:712:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:712:2: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:713:2: kw= '-'
                    {
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEInt1833); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1850); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:733:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:734:2: (iv_ruleEString= ruleEString EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:735:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1896);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1907); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:742:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:745:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:746:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:746:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:746:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1947); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:754:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1973); 

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


    // $ANTLR start "entryRuleSenseForwardJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:769:1: entryRuleSenseForwardJob returns [EObject current=null] : iv_ruleSenseForwardJob= ruleSenseForwardJob EOF ;
    public final EObject entryRuleSenseForwardJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenseForwardJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:770:2: (iv_ruleSenseForwardJob= ruleSenseForwardJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:771:2: iv_ruleSenseForwardJob= ruleSenseForwardJob EOF
            {
             newCompositeNode(grammarAccess.getSenseForwardJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSenseForwardJob_in_entryRuleSenseForwardJob2018);
            iv_ruleSenseForwardJob=ruleSenseForwardJob();

            state._fsp--;

             current =iv_ruleSenseForwardJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSenseForwardJob2028); 

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
    // $ANTLR end "entryRuleSenseForwardJob"


    // $ANTLR start "ruleSenseForwardJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:778:1: ruleSenseForwardJob returns [EObject current=null] : ( () otherlv_1= 'SenseForwardJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleSenseForwardJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_sensingThreshold_6_0 = null;

        EObject lv_JobTargetNode_8_0 = null;

        EObject lv_JobTargetNetwork_10_0 = null;

        EObject lv_startEndTrigger_13_0 = null;

        EObject lv_startEndTrigger_15_0 = null;

        EObject lv_jobaction_19_0 = null;

        EObject lv_jobaction_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:781:28: ( ( () otherlv_1= 'SenseForwardJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:782:1: ( () otherlv_1= 'SenseForwardJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:782:1: ( () otherlv_1= 'SenseForwardJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:782:2: () otherlv_1= 'SenseForwardJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:782:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:783:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSenseForwardJobAccess().getSenseForwardJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSenseForwardJob2074); 

                	newLeafNode(otherlv_1, grammarAccess.getSenseForwardJobAccess().getSenseForwardJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseForwardJob2086); 

                	newLeafNode(otherlv_2, grammarAccess.getSenseForwardJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:796:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:796:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSenseForwardJob2099); 

                        	newLeafNode(otherlv_3, grammarAccess.getSenseForwardJobAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:800:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:801:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:801:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:802:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseForwardJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSenseForwardJob2120);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseForwardJobRule());
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:818:4: (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:818:6: otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSenseForwardJob2135); 

                        	newLeafNode(otherlv_5, grammarAccess.getSenseForwardJobAccess().getSensingThresholdKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:822:1: ( (lv_sensingThreshold_6_0= ruleELong ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:823:1: (lv_sensingThreshold_6_0= ruleELong )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:823:1: (lv_sensingThreshold_6_0= ruleELong )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:824:3: lv_sensingThreshold_6_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseForwardJobAccess().getSensingThresholdELongParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleSenseForwardJob2156);
                    lv_sensingThreshold_6_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseForwardJobRule());
                    	        }
                           		set(
                           			current, 
                           			"sensingThreshold",
                            		lv_sensingThreshold_6_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:840:4: (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:840:6: otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSenseForwardJob2171); 

                        	newLeafNode(otherlv_7, grammarAccess.getSenseForwardJobAccess().getJobTargetNodeKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:844:1: ( (lv_JobTargetNode_8_0= ruleAbstractNode ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:845:1: (lv_JobTargetNode_8_0= ruleAbstractNode )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:845:1: (lv_JobTargetNode_8_0= ruleAbstractNode )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:846:3: lv_JobTargetNode_8_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseForwardJobAccess().getJobTargetNodeAbstractNodeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleSenseForwardJob2192);
                    lv_JobTargetNode_8_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseForwardJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_8_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:862:4: (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:862:6: otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) )
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSenseForwardJob2207); 

                        	newLeafNode(otherlv_9, grammarAccess.getSenseForwardJobAccess().getJobTargetNetworkKeyword_6_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:866:1: ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:867:1: (lv_JobTargetNetwork_10_0= ruleAbstractNetwork )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:867:1: (lv_JobTargetNetwork_10_0= ruleAbstractNetwork )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:868:3: lv_JobTargetNetwork_10_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseForwardJobAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleSenseForwardJob2228);
                    lv_JobTargetNetwork_10_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseForwardJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_10_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:884:4: (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:884:6: otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSenseForwardJob2243); 

                        	newLeafNode(otherlv_11, grammarAccess.getSenseForwardJobAccess().getStartEndTriggerKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseForwardJob2255); 

                        	newLeafNode(otherlv_12, grammarAccess.getSenseForwardJobAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:892:1: ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:893:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:893:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:894:3: lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseForwardJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseForwardJob2276);
                    lv_startEndTrigger_13_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseForwardJobRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_13_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:910:2: (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:910:4: otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSenseForwardJob2289); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getSenseForwardJobAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:914:1: ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:915:1: (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:915:1: (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:916:3: lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSenseForwardJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseForwardJob2310);
                    	    lv_startEndTrigger_15_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSenseForwardJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_15_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseForwardJob2324); 

                        	newLeafNode(otherlv_16, grammarAccess.getSenseForwardJobAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:936:3: (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:936:5: otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSenseForwardJob2339); 

                        	newLeafNode(otherlv_17, grammarAccess.getSenseForwardJobAccess().getJobactionKeyword_8_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseForwardJob2351); 

                        	newLeafNode(otherlv_18, grammarAccess.getSenseForwardJobAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:944:1: ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:945:1: (lv_jobaction_19_0= ruleAbstratAction )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:945:1: (lv_jobaction_19_0= ruleAbstratAction )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:946:3: lv_jobaction_19_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseForwardJobAccess().getJobactionAbstratActionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSenseForwardJob2372);
                    lv_jobaction_19_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseForwardJobRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_19_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:962:2: (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:962:4: otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSenseForwardJob2385); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getSenseForwardJobAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:966:1: ( (lv_jobaction_21_0= ruleAbstratAction ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:967:1: (lv_jobaction_21_0= ruleAbstratAction )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:967:1: (lv_jobaction_21_0= ruleAbstratAction )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:968:3: lv_jobaction_21_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSenseForwardJobAccess().getJobactionAbstratActionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSenseForwardJob2406);
                    	    lv_jobaction_21_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSenseForwardJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_21_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseForwardJob2420); 

                        	newLeafNode(otherlv_22, grammarAccess.getSenseForwardJobAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseForwardJob2434); 

                	newLeafNode(otherlv_23, grammarAccess.getSenseForwardJobAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleSenseForwardJob"


    // $ANTLR start "entryRuleAggregationJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1000:1: entryRuleAggregationJob returns [EObject current=null] : iv_ruleAggregationJob= ruleAggregationJob EOF ;
    public final EObject entryRuleAggregationJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregationJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1001:2: (iv_ruleAggregationJob= ruleAggregationJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1002:2: iv_ruleAggregationJob= ruleAggregationJob EOF
            {
             newCompositeNode(grammarAccess.getAggregationJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAggregationJob_in_entryRuleAggregationJob2470);
            iv_ruleAggregationJob=ruleAggregationJob();

            state._fsp--;

             current =iv_ruleAggregationJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAggregationJob2480); 

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
    // $ANTLR end "entryRuleAggregationJob"


    // $ANTLR start "ruleAggregationJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1009:1: ruleAggregationJob returns [EObject current=null] : ( () otherlv_1= 'AggregationJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'aggregation' ( (lv_aggregation_6_0= ruleAggregation ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleAggregationJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_aggregation_6_0 = null;

        EObject lv_JobTargetNode_8_0 = null;

        EObject lv_JobTargetNetwork_10_0 = null;

        EObject lv_startEndTrigger_13_0 = null;

        EObject lv_startEndTrigger_15_0 = null;

        EObject lv_jobaction_19_0 = null;

        EObject lv_jobaction_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1012:28: ( ( () otherlv_1= 'AggregationJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'aggregation' ( (lv_aggregation_6_0= ruleAggregation ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1013:1: ( () otherlv_1= 'AggregationJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'aggregation' ( (lv_aggregation_6_0= ruleAggregation ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1013:1: ( () otherlv_1= 'AggregationJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'aggregation' ( (lv_aggregation_6_0= ruleAggregation ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1013:2: () otherlv_1= 'AggregationJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'aggregation' ( (lv_aggregation_6_0= ruleAggregation ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1013:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1014:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAggregationJobAccess().getAggregationJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAggregationJob2526); 

                	newLeafNode(otherlv_1, grammarAccess.getAggregationJobAccess().getAggregationJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAggregationJob2538); 

                	newLeafNode(otherlv_2, grammarAccess.getAggregationJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1027:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1027:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAggregationJob2551); 

                        	newLeafNode(otherlv_3, grammarAccess.getAggregationJobAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1031:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1032:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1032:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1033:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAggregationJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAggregationJob2572);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAggregationJobRule());
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1049:4: (otherlv_5= 'aggregation' ( (lv_aggregation_6_0= ruleAggregation ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1049:6: otherlv_5= 'aggregation' ( (lv_aggregation_6_0= ruleAggregation ) )
                    {
                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAggregationJob2587); 

                        	newLeafNode(otherlv_5, grammarAccess.getAggregationJobAccess().getAggregationKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1053:1: ( (lv_aggregation_6_0= ruleAggregation ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1054:1: (lv_aggregation_6_0= ruleAggregation )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1054:1: (lv_aggregation_6_0= ruleAggregation )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1055:3: lv_aggregation_6_0= ruleAggregation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAggregationJobAccess().getAggregationAggregationEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAggregation_in_ruleAggregationJob2608);
                    lv_aggregation_6_0=ruleAggregation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAggregationJobRule());
                    	        }
                           		set(
                           			current, 
                           			"aggregation",
                            		lv_aggregation_6_0, 
                            		"Aggregation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1071:4: (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1071:6: otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAggregationJob2623); 

                        	newLeafNode(otherlv_7, grammarAccess.getAggregationJobAccess().getJobTargetNodeKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1075:1: ( (lv_JobTargetNode_8_0= ruleAbstractNode ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1076:1: (lv_JobTargetNode_8_0= ruleAbstractNode )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1076:1: (lv_JobTargetNode_8_0= ruleAbstractNode )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1077:3: lv_JobTargetNode_8_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getAggregationJobAccess().getJobTargetNodeAbstractNodeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleAggregationJob2644);
                    lv_JobTargetNode_8_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAggregationJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_8_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1093:4: (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1093:6: otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) )
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAggregationJob2659); 

                        	newLeafNode(otherlv_9, grammarAccess.getAggregationJobAccess().getJobTargetNetworkKeyword_6_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1097:1: ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1098:1: (lv_JobTargetNetwork_10_0= ruleAbstractNetwork )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1098:1: (lv_JobTargetNetwork_10_0= ruleAbstractNetwork )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1099:3: lv_JobTargetNetwork_10_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getAggregationJobAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleAggregationJob2680);
                    lv_JobTargetNetwork_10_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAggregationJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_10_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1115:4: (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1115:6: otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAggregationJob2695); 

                        	newLeafNode(otherlv_11, grammarAccess.getAggregationJobAccess().getStartEndTriggerKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAggregationJob2707); 

                        	newLeafNode(otherlv_12, grammarAccess.getAggregationJobAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1123:1: ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1124:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1124:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1125:3: lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getAggregationJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleAggregationJob2728);
                    lv_startEndTrigger_13_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAggregationJobRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_13_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1141:2: (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1141:4: otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAggregationJob2741); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getAggregationJobAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1145:1: ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1146:1: (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1146:1: (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1147:3: lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAggregationJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleAggregationJob2762);
                    	    lv_startEndTrigger_15_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAggregationJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_15_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAggregationJob2776); 

                        	newLeafNode(otherlv_16, grammarAccess.getAggregationJobAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1167:3: (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1167:5: otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAggregationJob2791); 

                        	newLeafNode(otherlv_17, grammarAccess.getAggregationJobAccess().getJobactionKeyword_8_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAggregationJob2803); 

                        	newLeafNode(otherlv_18, grammarAccess.getAggregationJobAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1175:1: ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1176:1: (lv_jobaction_19_0= ruleAbstratAction )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1176:1: (lv_jobaction_19_0= ruleAbstratAction )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1177:3: lv_jobaction_19_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getAggregationJobAccess().getJobactionAbstratActionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleAggregationJob2824);
                    lv_jobaction_19_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAggregationJobRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_19_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1193:2: (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==15) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1193:4: otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAggregationJob2837); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getAggregationJobAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1197:1: ( (lv_jobaction_21_0= ruleAbstratAction ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1198:1: (lv_jobaction_21_0= ruleAbstratAction )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1198:1: (lv_jobaction_21_0= ruleAbstratAction )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1199:3: lv_jobaction_21_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAggregationJobAccess().getJobactionAbstratActionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleAggregationJob2858);
                    	    lv_jobaction_21_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAggregationJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_21_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAggregationJob2872); 

                        	newLeafNode(otherlv_22, grammarAccess.getAggregationJobAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAggregationJob2886); 

                	newLeafNode(otherlv_23, grammarAccess.getAggregationJobAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleAggregationJob"


    // $ANTLR start "entryRuleFusionJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1231:1: entryRuleFusionJob returns [EObject current=null] : iv_ruleFusionJob= ruleFusionJob EOF ;
    public final EObject entryRuleFusionJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFusionJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1232:2: (iv_ruleFusionJob= ruleFusionJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1233:2: iv_ruleFusionJob= ruleFusionJob EOF
            {
             newCompositeNode(grammarAccess.getFusionJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFusionJob_in_entryRuleFusionJob2922);
            iv_ruleFusionJob=ruleFusionJob();

            state._fsp--;

             current =iv_ruleFusionJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFusionJob2932); 

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
    // $ANTLR end "entryRuleFusionJob"


    // $ANTLR start "ruleFusionJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1240:1: ruleFusionJob returns [EObject current=null] : ( () otherlv_1= 'FusionJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'fusion' ( (lv_fusion_6_0= ruleFusion ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleFusionJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_fusion_6_0 = null;

        EObject lv_JobTargetNode_8_0 = null;

        EObject lv_JobTargetNetwork_10_0 = null;

        EObject lv_startEndTrigger_13_0 = null;

        EObject lv_startEndTrigger_15_0 = null;

        EObject lv_jobaction_19_0 = null;

        EObject lv_jobaction_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1243:28: ( ( () otherlv_1= 'FusionJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'fusion' ( (lv_fusion_6_0= ruleFusion ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1244:1: ( () otherlv_1= 'FusionJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'fusion' ( (lv_fusion_6_0= ruleFusion ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1244:1: ( () otherlv_1= 'FusionJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'fusion' ( (lv_fusion_6_0= ruleFusion ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1244:2: () otherlv_1= 'FusionJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'fusion' ( (lv_fusion_6_0= ruleFusion ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1244:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1245:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFusionJobAccess().getFusionJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFusionJob2978); 

                	newLeafNode(otherlv_1, grammarAccess.getFusionJobAccess().getFusionJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFusionJob2990); 

                	newLeafNode(otherlv_2, grammarAccess.getFusionJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1258:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1258:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFusionJob3003); 

                        	newLeafNode(otherlv_3, grammarAccess.getFusionJobAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1262:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1263:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1263:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1264:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFusionJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleFusionJob3024);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFusionJobRule());
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1280:4: (otherlv_5= 'fusion' ( (lv_fusion_6_0= ruleFusion ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1280:6: otherlv_5= 'fusion' ( (lv_fusion_6_0= ruleFusion ) )
                    {
                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFusionJob3039); 

                        	newLeafNode(otherlv_5, grammarAccess.getFusionJobAccess().getFusionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1284:1: ( (lv_fusion_6_0= ruleFusion ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1285:1: (lv_fusion_6_0= ruleFusion )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1285:1: (lv_fusion_6_0= ruleFusion )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1286:3: lv_fusion_6_0= ruleFusion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFusionJobAccess().getFusionFusionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFusion_in_ruleFusionJob3060);
                    lv_fusion_6_0=ruleFusion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFusionJobRule());
                    	        }
                           		set(
                           			current, 
                           			"fusion",
                            		lv_fusion_6_0, 
                            		"Fusion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1302:4: (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1302:6: otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFusionJob3075); 

                        	newLeafNode(otherlv_7, grammarAccess.getFusionJobAccess().getJobTargetNodeKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1306:1: ( (lv_JobTargetNode_8_0= ruleAbstractNode ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1307:1: (lv_JobTargetNode_8_0= ruleAbstractNode )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1307:1: (lv_JobTargetNode_8_0= ruleAbstractNode )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1308:3: lv_JobTargetNode_8_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getFusionJobAccess().getJobTargetNodeAbstractNodeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleFusionJob3096);
                    lv_JobTargetNode_8_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFusionJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_8_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1324:4: (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1324:6: otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) )
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFusionJob3111); 

                        	newLeafNode(otherlv_9, grammarAccess.getFusionJobAccess().getJobTargetNetworkKeyword_6_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1328:1: ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1329:1: (lv_JobTargetNetwork_10_0= ruleAbstractNetwork )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1329:1: (lv_JobTargetNetwork_10_0= ruleAbstractNetwork )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1330:3: lv_JobTargetNetwork_10_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getFusionJobAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleFusionJob3132);
                    lv_JobTargetNetwork_10_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFusionJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_10_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1346:4: (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1346:6: otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFusionJob3147); 

                        	newLeafNode(otherlv_11, grammarAccess.getFusionJobAccess().getStartEndTriggerKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFusionJob3159); 

                        	newLeafNode(otherlv_12, grammarAccess.getFusionJobAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1354:1: ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1355:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1355:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1356:3: lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getFusionJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleFusionJob3180);
                    lv_startEndTrigger_13_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFusionJobRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_13_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1372:2: (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==15) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1372:4: otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFusionJob3193); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getFusionJobAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1376:1: ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1377:1: (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1377:1: (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1378:3: lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFusionJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleFusionJob3214);
                    	    lv_startEndTrigger_15_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFusionJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_15_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFusionJob3228); 

                        	newLeafNode(otherlv_16, grammarAccess.getFusionJobAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1398:3: (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1398:5: otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFusionJob3243); 

                        	newLeafNode(otherlv_17, grammarAccess.getFusionJobAccess().getJobactionKeyword_8_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFusionJob3255); 

                        	newLeafNode(otherlv_18, grammarAccess.getFusionJobAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1406:1: ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1407:1: (lv_jobaction_19_0= ruleAbstratAction )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1407:1: (lv_jobaction_19_0= ruleAbstratAction )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1408:3: lv_jobaction_19_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getFusionJobAccess().getJobactionAbstratActionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleFusionJob3276);
                    lv_jobaction_19_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFusionJobRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_19_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1424:2: (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==15) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1424:4: otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFusionJob3289); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getFusionJobAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1428:1: ( (lv_jobaction_21_0= ruleAbstratAction ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1429:1: (lv_jobaction_21_0= ruleAbstratAction )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1429:1: (lv_jobaction_21_0= ruleAbstratAction )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1430:3: lv_jobaction_21_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFusionJobAccess().getJobactionAbstratActionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleFusionJob3310);
                    	    lv_jobaction_21_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFusionJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_21_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFusionJob3324); 

                        	newLeafNode(otherlv_22, grammarAccess.getFusionJobAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFusionJob3338); 

                	newLeafNode(otherlv_23, grammarAccess.getFusionJobAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleFusionJob"


    // $ANTLR start "entryRuleSenseNowJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1462:1: entryRuleSenseNowJob returns [EObject current=null] : iv_ruleSenseNowJob= ruleSenseNowJob EOF ;
    public final EObject entryRuleSenseNowJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenseNowJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1463:2: (iv_ruleSenseNowJob= ruleSenseNowJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1464:2: iv_ruleSenseNowJob= ruleSenseNowJob EOF
            {
             newCompositeNode(grammarAccess.getSenseNowJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSenseNowJob_in_entryRuleSenseNowJob3374);
            iv_ruleSenseNowJob=ruleSenseNowJob();

            state._fsp--;

             current =iv_ruleSenseNowJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSenseNowJob3384); 

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
    // $ANTLR end "entryRuleSenseNowJob"


    // $ANTLR start "ruleSenseNowJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1471:1: ruleSenseNowJob returns [EObject current=null] : ( () otherlv_1= 'SenseNowJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleSenseNowJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_JobTargetNode_6_0 = null;

        EObject lv_JobTargetNetwork_8_0 = null;

        EObject lv_startEndTrigger_11_0 = null;

        EObject lv_startEndTrigger_13_0 = null;

        EObject lv_jobaction_17_0 = null;

        EObject lv_jobaction_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1474:28: ( ( () otherlv_1= 'SenseNowJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1475:1: ( () otherlv_1= 'SenseNowJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1475:1: ( () otherlv_1= 'SenseNowJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1475:2: () otherlv_1= 'SenseNowJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1475:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1476:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSenseNowJobAccess().getSenseNowJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSenseNowJob3430); 

                	newLeafNode(otherlv_1, grammarAccess.getSenseNowJobAccess().getSenseNowJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseNowJob3442); 

                	newLeafNode(otherlv_2, grammarAccess.getSenseNowJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1489:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1489:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSenseNowJob3455); 

                        	newLeafNode(otherlv_3, grammarAccess.getSenseNowJobAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1493:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1494:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1494:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1495:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSenseNowJob3476);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1511:4: (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1511:6: otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSenseNowJob3491); 

                        	newLeafNode(otherlv_5, grammarAccess.getSenseNowJobAccess().getJobTargetNodeKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1515:1: ( (lv_JobTargetNode_6_0= ruleAbstractNode ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1516:1: (lv_JobTargetNode_6_0= ruleAbstractNode )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1516:1: (lv_JobTargetNode_6_0= ruleAbstractNode )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1517:3: lv_JobTargetNode_6_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getJobTargetNodeAbstractNodeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleSenseNowJob3512);
                    lv_JobTargetNode_6_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_6_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1533:4: (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1533:6: otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) )
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSenseNowJob3527); 

                        	newLeafNode(otherlv_7, grammarAccess.getSenseNowJobAccess().getJobTargetNetworkKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1537:1: ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1538:1: (lv_JobTargetNetwork_8_0= ruleAbstractNetwork )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1538:1: (lv_JobTargetNetwork_8_0= ruleAbstractNetwork )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1539:3: lv_JobTargetNetwork_8_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleSenseNowJob3548);
                    lv_JobTargetNetwork_8_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_8_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1555:4: (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==22) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1555:6: otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSenseNowJob3563); 

                        	newLeafNode(otherlv_9, grammarAccess.getSenseNowJobAccess().getStartEndTriggerKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseNowJob3575); 

                        	newLeafNode(otherlv_10, grammarAccess.getSenseNowJobAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1563:1: ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1564:1: (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1564:1: (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1565:3: lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseNowJob3596);
                    lv_startEndTrigger_11_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_11_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1581:2: (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1581:4: otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSenseNowJob3609); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSenseNowJobAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1585:1: ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1586:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1586:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1587:3: lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseNowJob3630);
                    	    lv_startEndTrigger_13_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_13_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseNowJob3644); 

                        	newLeafNode(otherlv_14, grammarAccess.getSenseNowJobAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1607:3: (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==23) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1607:5: otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSenseNowJob3659); 

                        	newLeafNode(otherlv_15, grammarAccess.getSenseNowJobAccess().getJobactionKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseNowJob3671); 

                        	newLeafNode(otherlv_16, grammarAccess.getSenseNowJobAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1615:1: ( (lv_jobaction_17_0= ruleAbstratAction ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1616:1: (lv_jobaction_17_0= ruleAbstratAction )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1616:1: (lv_jobaction_17_0= ruleAbstratAction )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1617:3: lv_jobaction_17_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getJobactionAbstratActionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSenseNowJob3692);
                    lv_jobaction_17_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_17_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1633:2: (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==15) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1633:4: otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSenseNowJob3705); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSenseNowJobAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1637:1: ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1638:1: (lv_jobaction_19_0= ruleAbstratAction )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1638:1: (lv_jobaction_19_0= ruleAbstratAction )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1639:3: lv_jobaction_19_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getJobactionAbstratActionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSenseNowJob3726);
                    	    lv_jobaction_19_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_19_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseNowJob3740); 

                        	newLeafNode(otherlv_20, grammarAccess.getSenseNowJobAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseNowJob3754); 

                	newLeafNode(otherlv_21, grammarAccess.getSenseNowJobAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleSenseNowJob"


    // $ANTLR start "entryRuleSinkJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1671:1: entryRuleSinkJob returns [EObject current=null] : iv_ruleSinkJob= ruleSinkJob EOF ;
    public final EObject entryRuleSinkJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinkJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1672:2: (iv_ruleSinkJob= ruleSinkJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1673:2: iv_ruleSinkJob= ruleSinkJob EOF
            {
             newCompositeNode(grammarAccess.getSinkJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSinkJob_in_entryRuleSinkJob3790);
            iv_ruleSinkJob=ruleSinkJob();

            state._fsp--;

             current =iv_ruleSinkJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSinkJob3800); 

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
    // $ANTLR end "entryRuleSinkJob"


    // $ANTLR start "ruleSinkJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1680:1: ruleSinkJob returns [EObject current=null] : ( () otherlv_1= 'SinkJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleSinkJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_JobTargetNode_6_0 = null;

        EObject lv_JobTargetNetwork_8_0 = null;

        EObject lv_startEndTrigger_11_0 = null;

        EObject lv_startEndTrigger_13_0 = null;

        EObject lv_jobaction_17_0 = null;

        EObject lv_jobaction_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1683:28: ( ( () otherlv_1= 'SinkJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1684:1: ( () otherlv_1= 'SinkJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1684:1: ( () otherlv_1= 'SinkJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1684:2: () otherlv_1= 'SinkJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1684:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1685:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinkJobAccess().getSinkJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSinkJob3846); 

                	newLeafNode(otherlv_1, grammarAccess.getSinkJobAccess().getSinkJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSinkJob3858); 

                	newLeafNode(otherlv_2, grammarAccess.getSinkJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1698:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==13) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1698:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSinkJob3871); 

                        	newLeafNode(otherlv_3, grammarAccess.getSinkJobAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1702:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1703:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1703:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1704:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSinkJob3892);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1720:4: (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1720:6: otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSinkJob3907); 

                        	newLeafNode(otherlv_5, grammarAccess.getSinkJobAccess().getJobTargetNodeKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1724:1: ( (lv_JobTargetNode_6_0= ruleAbstractNode ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1725:1: (lv_JobTargetNode_6_0= ruleAbstractNode )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1725:1: (lv_JobTargetNode_6_0= ruleAbstractNode )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1726:3: lv_JobTargetNode_6_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkJobAccess().getJobTargetNodeAbstractNodeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleSinkJob3928);
                    lv_JobTargetNode_6_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_6_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1742:4: (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==21) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1742:6: otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) )
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSinkJob3943); 

                        	newLeafNode(otherlv_7, grammarAccess.getSinkJobAccess().getJobTargetNetworkKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1746:1: ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1747:1: (lv_JobTargetNetwork_8_0= ruleAbstractNetwork )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1747:1: (lv_JobTargetNetwork_8_0= ruleAbstractNetwork )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1748:3: lv_JobTargetNetwork_8_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkJobAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleSinkJob3964);
                    lv_JobTargetNetwork_8_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_8_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1764:4: (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==22) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1764:6: otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSinkJob3979); 

                        	newLeafNode(otherlv_9, grammarAccess.getSinkJobAccess().getStartEndTriggerKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSinkJob3991); 

                        	newLeafNode(otherlv_10, grammarAccess.getSinkJobAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1772:1: ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1773:1: (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1773:1: (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1774:3: lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSinkJob4012);
                    lv_startEndTrigger_11_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_11_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1790:2: (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==15) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1790:4: otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSinkJob4025); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSinkJobAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1794:1: ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1795:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1795:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1796:3: lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinkJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSinkJob4046);
                    	    lv_startEndTrigger_13_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_13_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkJob4060); 

                        	newLeafNode(otherlv_14, grammarAccess.getSinkJobAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1816:3: (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==23) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1816:5: otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSinkJob4075); 

                        	newLeafNode(otherlv_15, grammarAccess.getSinkJobAccess().getJobactionKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSinkJob4087); 

                        	newLeafNode(otherlv_16, grammarAccess.getSinkJobAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1824:1: ( (lv_jobaction_17_0= ruleAbstratAction ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1825:1: (lv_jobaction_17_0= ruleAbstratAction )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1825:1: (lv_jobaction_17_0= ruleAbstratAction )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1826:3: lv_jobaction_17_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkJobAccess().getJobactionAbstratActionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSinkJob4108);
                    lv_jobaction_17_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_17_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1842:2: (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==15) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1842:4: otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSinkJob4121); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSinkJobAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1846:1: ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1847:1: (lv_jobaction_19_0= ruleAbstratAction )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1847:1: (lv_jobaction_19_0= ruleAbstratAction )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1848:3: lv_jobaction_19_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinkJobAccess().getJobactionAbstratActionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSinkJob4142);
                    	    lv_jobaction_19_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_19_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkJob4156); 

                        	newLeafNode(otherlv_20, grammarAccess.getSinkJobAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkJob4170); 

                	newLeafNode(otherlv_21, grammarAccess.getSinkJobAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleSinkJob"


    // $ANTLR start "entryRuleRegularSenseJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1880:1: entryRuleRegularSenseJob returns [EObject current=null] : iv_ruleRegularSenseJob= ruleRegularSenseJob EOF ;
    public final EObject entryRuleRegularSenseJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularSenseJob = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1881:2: (iv_ruleRegularSenseJob= ruleRegularSenseJob EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1882:2: iv_ruleRegularSenseJob= ruleRegularSenseJob EOF
            {
             newCompositeNode(grammarAccess.getRegularSenseJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegularSenseJob_in_entryRuleRegularSenseJob4206);
            iv_ruleRegularSenseJob=ruleRegularSenseJob();

            state._fsp--;

             current =iv_ruleRegularSenseJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegularSenseJob4216); 

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
    // $ANTLR end "entryRuleRegularSenseJob"


    // $ANTLR start "ruleRegularSenseJob"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1889:1: ruleRegularSenseJob returns [EObject current=null] : ( () otherlv_1= 'RegularSenseJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleRegularSenseJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_sensingThreshold_6_0 = null;

        EObject lv_JobTargetNode_8_0 = null;

        EObject lv_JobTargetNetwork_10_0 = null;

        EObject lv_startEndTrigger_13_0 = null;

        EObject lv_startEndTrigger_15_0 = null;

        EObject lv_jobaction_19_0 = null;

        EObject lv_jobaction_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1892:28: ( ( () otherlv_1= 'RegularSenseJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1893:1: ( () otherlv_1= 'RegularSenseJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1893:1: ( () otherlv_1= 'RegularSenseJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1893:2: () otherlv_1= 'RegularSenseJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1893:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1894:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRegularSenseJobAccess().getRegularSenseJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRegularSenseJob4262); 

                	newLeafNode(otherlv_1, grammarAccess.getRegularSenseJobAccess().getRegularSenseJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRegularSenseJob4274); 

                	newLeafNode(otherlv_2, grammarAccess.getRegularSenseJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1907:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==13) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1907:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRegularSenseJob4287); 

                        	newLeafNode(otherlv_3, grammarAccess.getRegularSenseJobAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1911:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1912:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1912:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1913:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRegularSenseJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRegularSenseJob4308);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRegularSenseJobRule());
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1929:4: (otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==19) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1929:6: otherlv_5= 'sensingThreshold' ( (lv_sensingThreshold_6_0= ruleELong ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRegularSenseJob4323); 

                        	newLeafNode(otherlv_5, grammarAccess.getRegularSenseJobAccess().getSensingThresholdKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1933:1: ( (lv_sensingThreshold_6_0= ruleELong ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1934:1: (lv_sensingThreshold_6_0= ruleELong )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1934:1: (lv_sensingThreshold_6_0= ruleELong )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1935:3: lv_sensingThreshold_6_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getRegularSenseJobAccess().getSensingThresholdELongParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleRegularSenseJob4344);
                    lv_sensingThreshold_6_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRegularSenseJobRule());
                    	        }
                           		set(
                           			current, 
                           			"sensingThreshold",
                            		lv_sensingThreshold_6_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1951:4: (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==20) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1951:6: otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRegularSenseJob4359); 

                        	newLeafNode(otherlv_7, grammarAccess.getRegularSenseJobAccess().getJobTargetNodeKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1955:1: ( (lv_JobTargetNode_8_0= ruleAbstractNode ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1956:1: (lv_JobTargetNode_8_0= ruleAbstractNode )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1956:1: (lv_JobTargetNode_8_0= ruleAbstractNode )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1957:3: lv_JobTargetNode_8_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getRegularSenseJobAccess().getJobTargetNodeAbstractNodeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleRegularSenseJob4380);
                    lv_JobTargetNode_8_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRegularSenseJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_8_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1973:4: (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==21) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1973:6: otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) )
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRegularSenseJob4395); 

                        	newLeafNode(otherlv_9, grammarAccess.getRegularSenseJobAccess().getJobTargetNetworkKeyword_6_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1977:1: ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1978:1: (lv_JobTargetNetwork_10_0= ruleAbstractNetwork )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1978:1: (lv_JobTargetNetwork_10_0= ruleAbstractNetwork )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1979:3: lv_JobTargetNetwork_10_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRegularSenseJobAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleRegularSenseJob4416);
                    lv_JobTargetNetwork_10_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRegularSenseJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_10_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1995:4: (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==22) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:1995:6: otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRegularSenseJob4431); 

                        	newLeafNode(otherlv_11, grammarAccess.getRegularSenseJobAccess().getStartEndTriggerKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRegularSenseJob4443); 

                        	newLeafNode(otherlv_12, grammarAccess.getRegularSenseJobAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2003:1: ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2004:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2004:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2005:3: lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getRegularSenseJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleRegularSenseJob4464);
                    lv_startEndTrigger_13_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRegularSenseJobRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_13_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2021:2: (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==15) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2021:4: otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRegularSenseJob4477); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getRegularSenseJobAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2025:1: ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2026:1: (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2026:1: (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2027:3: lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRegularSenseJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleRegularSenseJob4498);
                    	    lv_startEndTrigger_15_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRegularSenseJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_15_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRegularSenseJob4512); 

                        	newLeafNode(otherlv_16, grammarAccess.getRegularSenseJobAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2047:3: (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==23) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2047:5: otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRegularSenseJob4527); 

                        	newLeafNode(otherlv_17, grammarAccess.getRegularSenseJobAccess().getJobactionKeyword_8_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRegularSenseJob4539); 

                        	newLeafNode(otherlv_18, grammarAccess.getRegularSenseJobAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2055:1: ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2056:1: (lv_jobaction_19_0= ruleAbstratAction )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2056:1: (lv_jobaction_19_0= ruleAbstratAction )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2057:3: lv_jobaction_19_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getRegularSenseJobAccess().getJobactionAbstratActionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleRegularSenseJob4560);
                    lv_jobaction_19_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRegularSenseJobRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_19_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2073:2: (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==15) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2073:4: otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRegularSenseJob4573); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getRegularSenseJobAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2077:1: ( (lv_jobaction_21_0= ruleAbstratAction ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2078:1: (lv_jobaction_21_0= ruleAbstratAction )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2078:1: (lv_jobaction_21_0= ruleAbstratAction )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2079:3: lv_jobaction_21_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRegularSenseJobAccess().getJobactionAbstratActionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleRegularSenseJob4594);
                    	    lv_jobaction_21_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRegularSenseJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_21_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRegularSenseJob4608); 

                        	newLeafNode(otherlv_22, grammarAccess.getRegularSenseJobAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRegularSenseJob4622); 

                	newLeafNode(otherlv_23, grammarAccess.getRegularSenseJobAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleRegularSenseJob"


    // $ANTLR start "entryRuleSensorNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2111:1: entryRuleSensorNode returns [EObject current=null] : iv_ruleSensorNode= ruleSensorNode EOF ;
    public final EObject entryRuleSensorNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2112:2: (iv_ruleSensorNode= ruleSensorNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2113:2: iv_ruleSensorNode= ruleSensorNode EOF
            {
             newCompositeNode(grammarAccess.getSensorNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensorNode_in_entryRuleSensorNode4658);
            iv_ruleSensorNode=ruleSensorNode();

            state._fsp--;

             current =iv_ruleSensorNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensorNode4668); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2120:1: ruleSensorNode returns [EObject current=null] : ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;

        EObject lv_nodeResources_9_0 = null;

        EObject lv_nodeResources_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2123:28: ( ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2124:1: ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2124:1: ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2124:2: () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2124:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2125:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorNodeAccess().getSensorNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSensorNode4714); 

                	newLeafNode(otherlv_1, grammarAccess.getSensorNodeAccess().getSensorNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSensorNode4726); 

                	newLeafNode(otherlv_2, grammarAccess.getSensorNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2138:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==13) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2138:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSensorNode4739); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2142:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2143:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2143:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2144:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSensorNode4760);
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2160:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==32) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2160:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSensorNode4775); 

                        	newLeafNode(otherlv_5, grammarAccess.getSensorNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2164:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2165:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2165:1: (lv_position_6_0= rulePosition )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2166:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleSensorNode4796);
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2182:4: (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==33) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2182:6: otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSensorNode4811); 

                        	newLeafNode(otherlv_7, grammarAccess.getSensorNodeAccess().getNodeResourcesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSensorNode4823); 

                        	newLeafNode(otherlv_8, grammarAccess.getSensorNodeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2190:1: ( (lv_nodeResources_9_0= ruleAbstractSensor ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2191:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2191:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2192:3: lv_nodeResources_9_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleSensorNode4844);
                    lv_nodeResources_9_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSensorNodeRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeResources",
                            		lv_nodeResources_9_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2208:2: (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==15) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2208:4: otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSensorNode4857); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSensorNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2212:1: ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2213:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2213:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2214:3: lv_nodeResources_11_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleSensorNode4878);
                    	    lv_nodeResources_11_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSensorNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeResources",
                    	            		lv_nodeResources_11_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSensorNode4892); 

                        	newLeafNode(otherlv_12, grammarAccess.getSensorNodeAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSensorNode4906); 

                	newLeafNode(otherlv_13, grammarAccess.getSensorNodeAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleClusterHeadNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2246:1: entryRuleClusterHeadNode returns [EObject current=null] : iv_ruleClusterHeadNode= ruleClusterHeadNode EOF ;
    public final EObject entryRuleClusterHeadNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClusterHeadNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2247:2: (iv_ruleClusterHeadNode= ruleClusterHeadNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2248:2: iv_ruleClusterHeadNode= ruleClusterHeadNode EOF
            {
             newCompositeNode(grammarAccess.getClusterHeadNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClusterHeadNode_in_entryRuleClusterHeadNode4942);
            iv_ruleClusterHeadNode=ruleClusterHeadNode();

            state._fsp--;

             current =iv_ruleClusterHeadNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClusterHeadNode4952); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2255:1: ruleClusterHeadNode returns [EObject current=null] : ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;

        EObject lv_nodeResources_9_0 = null;

        EObject lv_nodeResources_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2258:28: ( ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2259:1: ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2259:1: ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2259:2: () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2259:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2260:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClusterHeadNodeAccess().getClusterHeadNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleClusterHeadNode4998); 

                	newLeafNode(otherlv_1, grammarAccess.getClusterHeadNodeAccess().getClusterHeadNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusterHeadNode5010); 

                	newLeafNode(otherlv_2, grammarAccess.getClusterHeadNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2273:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==13) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2273:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClusterHeadNode5023); 

                        	newLeafNode(otherlv_3, grammarAccess.getClusterHeadNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2277:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2278:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2278:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2279:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleClusterHeadNode5044);
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2295:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==32) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2295:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleClusterHeadNode5059); 

                        	newLeafNode(otherlv_5, grammarAccess.getClusterHeadNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2299:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2300:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2300:1: (lv_position_6_0= rulePosition )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2301:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleClusterHeadNode5080);
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2317:4: (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==33) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2317:6: otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleClusterHeadNode5095); 

                        	newLeafNode(otherlv_7, grammarAccess.getClusterHeadNodeAccess().getNodeResourcesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusterHeadNode5107); 

                        	newLeafNode(otherlv_8, grammarAccess.getClusterHeadNodeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2325:1: ( (lv_nodeResources_9_0= ruleAbstractSensor ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2326:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2326:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2327:3: lv_nodeResources_9_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleClusterHeadNode5128);
                    lv_nodeResources_9_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterHeadNodeRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeResources",
                            		lv_nodeResources_9_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2343:2: (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==15) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2343:4: otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClusterHeadNode5141); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getClusterHeadNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2347:1: ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2348:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2348:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2349:3: lv_nodeResources_11_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleClusterHeadNode5162);
                    	    lv_nodeResources_11_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusterHeadNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeResources",
                    	            		lv_nodeResources_11_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusterHeadNode5176); 

                        	newLeafNode(otherlv_12, grammarAccess.getClusterHeadNodeAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusterHeadNode5190); 

                	newLeafNode(otherlv_13, grammarAccess.getClusterHeadNodeAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleSinkNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2381:1: entryRuleSinkNode returns [EObject current=null] : iv_ruleSinkNode= ruleSinkNode EOF ;
    public final EObject entryRuleSinkNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinkNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2382:2: (iv_ruleSinkNode= ruleSinkNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2383:2: iv_ruleSinkNode= ruleSinkNode EOF
            {
             newCompositeNode(grammarAccess.getSinkNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSinkNode_in_entryRuleSinkNode5226);
            iv_ruleSinkNode=ruleSinkNode();

            state._fsp--;

             current =iv_ruleSinkNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSinkNode5236); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2390:1: ruleSinkNode returns [EObject current=null] : ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;

        EObject lv_nodeResources_9_0 = null;

        EObject lv_nodeResources_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2393:28: ( ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2394:1: ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2394:1: ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2394:2: () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2394:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2395:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinkNodeAccess().getSinkNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSinkNode5282); 

                	newLeafNode(otherlv_1, grammarAccess.getSinkNodeAccess().getSinkNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSinkNode5294); 

                	newLeafNode(otherlv_2, grammarAccess.getSinkNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2408:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==13) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2408:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSinkNode5307); 

                        	newLeafNode(otherlv_3, grammarAccess.getSinkNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2412:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2413:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2413:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2414:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSinkNode5328);
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2430:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==32) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2430:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSinkNode5343); 

                        	newLeafNode(otherlv_5, grammarAccess.getSinkNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2434:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2435:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2435:1: (lv_position_6_0= rulePosition )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2436:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleSinkNode5364);
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2452:4: (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==33) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2452:6: otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSinkNode5379); 

                        	newLeafNode(otherlv_7, grammarAccess.getSinkNodeAccess().getNodeResourcesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSinkNode5391); 

                        	newLeafNode(otherlv_8, grammarAccess.getSinkNodeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2460:1: ( (lv_nodeResources_9_0= ruleAbstractSensor ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2461:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2461:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2462:3: lv_nodeResources_9_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleSinkNode5412);
                    lv_nodeResources_9_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkNodeRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeResources",
                            		lv_nodeResources_9_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2478:2: (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==15) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2478:4: otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSinkNode5425); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSinkNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2482:1: ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2483:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2483:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2484:3: lv_nodeResources_11_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleSinkNode5446);
                    	    lv_nodeResources_11_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSinkNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeResources",
                    	            		lv_nodeResources_11_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkNode5460); 

                        	newLeafNode(otherlv_12, grammarAccess.getSinkNodeAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkNode5474); 

                	newLeafNode(otherlv_13, grammarAccess.getSinkNodeAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleComputationNode"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2516:1: entryRuleComputationNode returns [EObject current=null] : iv_ruleComputationNode= ruleComputationNode EOF ;
    public final EObject entryRuleComputationNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationNode = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2517:2: (iv_ruleComputationNode= ruleComputationNode EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2518:2: iv_ruleComputationNode= ruleComputationNode EOF
            {
             newCompositeNode(grammarAccess.getComputationNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComputationNode_in_entryRuleComputationNode5510);
            iv_ruleComputationNode=ruleComputationNode();

            state._fsp--;

             current =iv_ruleComputationNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComputationNode5520); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2525:1: ruleComputationNode returns [EObject current=null] : ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;

        EObject lv_nodeResources_9_0 = null;

        EObject lv_nodeResources_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2528:28: ( ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2529:1: ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2529:1: ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2529:2: () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2529:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2530:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComputationNodeAccess().getComputationNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleComputationNode5566); 

                	newLeafNode(otherlv_1, grammarAccess.getComputationNodeAccess().getComputationNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComputationNode5578); 

                	newLeafNode(otherlv_2, grammarAccess.getComputationNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2543:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==13) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2543:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleComputationNode5591); 

                        	newLeafNode(otherlv_3, grammarAccess.getComputationNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2547:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2548:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2548:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2549:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleComputationNode5612);
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2565:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==32) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2565:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleComputationNode5627); 

                        	newLeafNode(otherlv_5, grammarAccess.getComputationNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2569:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2570:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2570:1: (lv_position_6_0= rulePosition )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2571:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleComputationNode5648);
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2587:4: (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==33) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2587:6: otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleComputationNode5663); 

                        	newLeafNode(otherlv_7, grammarAccess.getComputationNodeAccess().getNodeResourcesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComputationNode5675); 

                        	newLeafNode(otherlv_8, grammarAccess.getComputationNodeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2595:1: ( (lv_nodeResources_9_0= ruleAbstractSensor ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2596:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2596:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2597:3: lv_nodeResources_9_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleComputationNode5696);
                    lv_nodeResources_9_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComputationNodeRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeResources",
                            		lv_nodeResources_9_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2613:2: (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==15) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2613:4: otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComputationNode5709); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getComputationNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2617:1: ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2618:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2618:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2619:3: lv_nodeResources_11_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleComputationNode5730);
                    	    lv_nodeResources_11_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComputationNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeResources",
                    	            		lv_nodeResources_11_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComputationNode5744); 

                        	newLeafNode(otherlv_12, grammarAccess.getComputationNodeAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComputationNode5758); 

                	newLeafNode(otherlv_13, grammarAccess.getComputationNodeAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleAccelerometerSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2651:1: entryRuleAccelerometerSensor returns [EObject current=null] : iv_ruleAccelerometerSensor= ruleAccelerometerSensor EOF ;
    public final EObject entryRuleAccelerometerSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccelerometerSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2652:2: (iv_ruleAccelerometerSensor= ruleAccelerometerSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2653:2: iv_ruleAccelerometerSensor= ruleAccelerometerSensor EOF
            {
             newCompositeNode(grammarAccess.getAccelerometerSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccelerometerSensor_in_entryRuleAccelerometerSensor5794);
            iv_ruleAccelerometerSensor=ruleAccelerometerSensor();

            state._fsp--;

             current =iv_ruleAccelerometerSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccelerometerSensor5804); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2660:1: ruleAccelerometerSensor returns [EObject current=null] : ( () otherlv_1= 'AccelerometerSensor' ) ;
    public final EObject ruleAccelerometerSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2663:28: ( ( () otherlv_1= 'AccelerometerSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2664:1: ( () otherlv_1= 'AccelerometerSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2664:1: ( () otherlv_1= 'AccelerometerSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2664:2: () otherlv_1= 'AccelerometerSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2664:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2665:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccelerometerSensorAccess().getAccelerometerSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAccelerometerSensor5850); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2682:1: entryRuleLightSensor returns [EObject current=null] : iv_ruleLightSensor= ruleLightSensor EOF ;
    public final EObject entryRuleLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2683:2: (iv_ruleLightSensor= ruleLightSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2684:2: iv_ruleLightSensor= ruleLightSensor EOF
            {
             newCompositeNode(grammarAccess.getLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_entryRuleLightSensor5886);
            iv_ruleLightSensor=ruleLightSensor();

            state._fsp--;

             current =iv_ruleLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSensor5896); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2691:1: ruleLightSensor returns [EObject current=null] : ( () otherlv_1= 'LightSensor' ) ;
    public final EObject ruleLightSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2694:28: ( ( () otherlv_1= 'LightSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2695:1: ( () otherlv_1= 'LightSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2695:1: ( () otherlv_1= 'LightSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2695:2: () otherlv_1= 'LightSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2695:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2696:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSensorAccess().getLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleLightSensor5942); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2713:1: entryRuleLocationSensor returns [EObject current=null] : iv_ruleLocationSensor= ruleLocationSensor EOF ;
    public final EObject entryRuleLocationSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2714:2: (iv_ruleLocationSensor= ruleLocationSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2715:2: iv_ruleLocationSensor= ruleLocationSensor EOF
            {
             newCompositeNode(grammarAccess.getLocationSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocationSensor_in_entryRuleLocationSensor5978);
            iv_ruleLocationSensor=ruleLocationSensor();

            state._fsp--;

             current =iv_ruleLocationSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocationSensor5988); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2722:1: ruleLocationSensor returns [EObject current=null] : ( () otherlv_1= 'LocationSensor' ) ;
    public final EObject ruleLocationSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2725:28: ( ( () otherlv_1= 'LocationSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2726:1: ( () otherlv_1= 'LocationSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2726:1: ( () otherlv_1= 'LocationSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2726:2: () otherlv_1= 'LocationSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2726:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2727:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLocationSensorAccess().getLocationSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleLocationSensor6034); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2744:1: entryRuleMicrophoneSensor returns [EObject current=null] : iv_ruleMicrophoneSensor= ruleMicrophoneSensor EOF ;
    public final EObject entryRuleMicrophoneSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMicrophoneSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2745:2: (iv_ruleMicrophoneSensor= ruleMicrophoneSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2746:2: iv_ruleMicrophoneSensor= ruleMicrophoneSensor EOF
            {
             newCompositeNode(grammarAccess.getMicrophoneSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMicrophoneSensor_in_entryRuleMicrophoneSensor6070);
            iv_ruleMicrophoneSensor=ruleMicrophoneSensor();

            state._fsp--;

             current =iv_ruleMicrophoneSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMicrophoneSensor6080); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2753:1: ruleMicrophoneSensor returns [EObject current=null] : ( () otherlv_1= 'MicrophoneSensor' ) ;
    public final EObject ruleMicrophoneSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2756:28: ( ( () otherlv_1= 'MicrophoneSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2757:1: ( () otherlv_1= 'MicrophoneSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2757:1: ( () otherlv_1= 'MicrophoneSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2757:2: () otherlv_1= 'MicrophoneSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2757:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2758:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMicrophoneSensorAccess().getMicrophoneSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMicrophoneSensor6126); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2775:1: entryRuleTemperatureSensor returns [EObject current=null] : iv_ruleTemperatureSensor= ruleTemperatureSensor EOF ;
    public final EObject entryRuleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperatureSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2776:2: (iv_ruleTemperatureSensor= ruleTemperatureSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2777:2: iv_ruleTemperatureSensor= ruleTemperatureSensor EOF
            {
             newCompositeNode(grammarAccess.getTemperatureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor6162);
            iv_ruleTemperatureSensor=ruleTemperatureSensor();

            state._fsp--;

             current =iv_ruleTemperatureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperatureSensor6172); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2784:1: ruleTemperatureSensor returns [EObject current=null] : ( () otherlv_1= 'TemperatureSensor' ) ;
    public final EObject ruleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2787:28: ( ( () otherlv_1= 'TemperatureSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2788:1: ( () otherlv_1= 'TemperatureSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2788:1: ( () otherlv_1= 'TemperatureSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2788:2: () otherlv_1= 'TemperatureSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2788:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2789:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemperatureSensorAccess().getTemperatureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTemperatureSensor6218); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2806:1: entryRulePressureSensor returns [EObject current=null] : iv_rulePressureSensor= rulePressureSensor EOF ;
    public final EObject entryRulePressureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePressureSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2807:2: (iv_rulePressureSensor= rulePressureSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2808:2: iv_rulePressureSensor= rulePressureSensor EOF
            {
             newCompositeNode(grammarAccess.getPressureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_entryRulePressureSensor6254);
            iv_rulePressureSensor=rulePressureSensor();

            state._fsp--;

             current =iv_rulePressureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePressureSensor6264); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2815:1: rulePressureSensor returns [EObject current=null] : ( () otherlv_1= 'PressureSensor' ) ;
    public final EObject rulePressureSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2818:28: ( ( () otherlv_1= 'PressureSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2819:1: ( () otherlv_1= 'PressureSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2819:1: ( () otherlv_1= 'PressureSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2819:2: () otherlv_1= 'PressureSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2819:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2820:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPressureSensorAccess().getPressureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulePressureSensor6310); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2837:1: entryRuleHumiditySensor returns [EObject current=null] : iv_ruleHumiditySensor= ruleHumiditySensor EOF ;
    public final EObject entryRuleHumiditySensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumiditySensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2838:2: (iv_ruleHumiditySensor= ruleHumiditySensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2839:2: iv_ruleHumiditySensor= ruleHumiditySensor EOF
            {
             newCompositeNode(grammarAccess.getHumiditySensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor6346);
            iv_ruleHumiditySensor=ruleHumiditySensor();

            state._fsp--;

             current =iv_ruleHumiditySensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumiditySensor6356); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2846:1: ruleHumiditySensor returns [EObject current=null] : ( () otherlv_1= 'HumiditySensor' ) ;
    public final EObject ruleHumiditySensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2849:28: ( ( () otherlv_1= 'HumiditySensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2850:1: ( () otherlv_1= 'HumiditySensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2850:1: ( () otherlv_1= 'HumiditySensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2850:2: () otherlv_1= 'HumiditySensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2850:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2851:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumiditySensorAccess().getHumiditySensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleHumiditySensor6402); 

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


    // $ANTLR start "entryRuleVoltageSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2868:1: entryRuleVoltageSensor returns [EObject current=null] : iv_ruleVoltageSensor= ruleVoltageSensor EOF ;
    public final EObject entryRuleVoltageSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoltageSensor = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2869:2: (iv_ruleVoltageSensor= ruleVoltageSensor EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2870:2: iv_ruleVoltageSensor= ruleVoltageSensor EOF
            {
             newCompositeNode(grammarAccess.getVoltageSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVoltageSensor_in_entryRuleVoltageSensor6438);
            iv_ruleVoltageSensor=ruleVoltageSensor();

            state._fsp--;

             current =iv_ruleVoltageSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVoltageSensor6448); 

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
    // $ANTLR end "entryRuleVoltageSensor"


    // $ANTLR start "ruleVoltageSensor"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2877:1: ruleVoltageSensor returns [EObject current=null] : ( () otherlv_1= 'VoltageSensor' ) ;
    public final EObject ruleVoltageSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2880:28: ( ( () otherlv_1= 'VoltageSensor' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2881:1: ( () otherlv_1= 'VoltageSensor' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2881:1: ( () otherlv_1= 'VoltageSensor' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2881:2: () otherlv_1= 'VoltageSensor'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2881:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2882:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVoltageSensorAccess().getVoltageSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleVoltageSensor6494); 

                	newLeafNode(otherlv_1, grammarAccess.getVoltageSensorAccess().getVoltageSensorKeyword_1());
                

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
    // $ANTLR end "ruleVoltageSensor"


    // $ANTLR start "entryRuleFlatNetwork"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2899:1: entryRuleFlatNetwork returns [EObject current=null] : iv_ruleFlatNetwork= ruleFlatNetwork EOF ;
    public final EObject entryRuleFlatNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlatNetwork = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2900:2: (iv_ruleFlatNetwork= ruleFlatNetwork EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2901:2: iv_ruleFlatNetwork= ruleFlatNetwork EOF
            {
             newCompositeNode(grammarAccess.getFlatNetworkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlatNetwork_in_entryRuleFlatNetwork6530);
            iv_ruleFlatNetwork=ruleFlatNetwork();

            state._fsp--;

             current =iv_ruleFlatNetwork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFlatNetwork6540); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2908:1: ruleFlatNetwork returns [EObject current=null] : (otherlv_0= 'FlatNetwork' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )? (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )? (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )? (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )? otherlv_16= 'sink' ( (lv_sink_17_0= ruleSinkNode ) ) (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleAbstractFlatNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleAbstractFlatNode ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleFlatNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_nbOfNodes_5_0 = null;

        Enumerator lv_interNodeComm_7_0 = null;

        Enumerator lv_routingProtocol_9_0 = null;

        EObject lv_resources_12_0 = null;

        EObject lv_resources_14_0 = null;

        EObject lv_sink_17_0 = null;

        EObject lv_nodes_20_0 = null;

        EObject lv_nodes_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2911:28: ( (otherlv_0= 'FlatNetwork' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )? (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )? (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )? (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )? otherlv_16= 'sink' ( (lv_sink_17_0= ruleSinkNode ) ) (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleAbstractFlatNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleAbstractFlatNode ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2912:1: (otherlv_0= 'FlatNetwork' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )? (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )? (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )? (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )? otherlv_16= 'sink' ( (lv_sink_17_0= ruleSinkNode ) ) (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleAbstractFlatNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleAbstractFlatNode ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2912:1: (otherlv_0= 'FlatNetwork' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )? (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )? (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )? (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )? otherlv_16= 'sink' ( (lv_sink_17_0= ruleSinkNode ) ) (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleAbstractFlatNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleAbstractFlatNode ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2912:3: otherlv_0= 'FlatNetwork' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )? (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )? (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )? (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )? otherlv_16= 'sink' ( (lv_sink_17_0= ruleSinkNode ) ) (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleAbstractFlatNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleAbstractFlatNode ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleFlatNetwork6577); 

                	newLeafNode(otherlv_0, grammarAccess.getFlatNetworkAccess().getFlatNetworkKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlatNetwork6589); 

                	newLeafNode(otherlv_1, grammarAccess.getFlatNetworkAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2920:1: (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==13) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2920:3: otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFlatNetwork6602); 

                        	newLeafNode(otherlv_2, grammarAccess.getFlatNetworkAccess().getIdKeyword_2_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2924:1: ( (lv_id_3_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2925:1: (lv_id_3_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2925:1: (lv_id_3_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2926:3: lv_id_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getIdEIntParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleFlatNetwork6623);
                    lv_id_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2942:4: (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==46) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2942:6: otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleFlatNetwork6638); 

                        	newLeafNode(otherlv_4, grammarAccess.getFlatNetworkAccess().getNbOfNodesKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2946:1: ( (lv_nbOfNodes_5_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2947:1: (lv_nbOfNodes_5_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2947:1: (lv_nbOfNodes_5_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2948:3: lv_nbOfNodes_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getNbOfNodesEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleFlatNetwork6659);
                    lv_nbOfNodes_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"nbOfNodes",
                            		lv_nbOfNodes_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2964:4: (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==47) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2964:6: otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) )
                    {
                    otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleFlatNetwork6674); 

                        	newLeafNode(otherlv_6, grammarAccess.getFlatNetworkAccess().getInterNodeCommKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2968:1: ( (lv_interNodeComm_7_0= ruleInterNodeComm ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2969:1: (lv_interNodeComm_7_0= ruleInterNodeComm )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2969:1: (lv_interNodeComm_7_0= ruleInterNodeComm )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2970:3: lv_interNodeComm_7_0= ruleInterNodeComm
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getInterNodeCommInterNodeCommEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInterNodeComm_in_ruleFlatNetwork6695);
                    lv_interNodeComm_7_0=ruleInterNodeComm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"interNodeComm",
                            		lv_interNodeComm_7_0, 
                            		"InterNodeComm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2986:4: (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==48) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2986:6: otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) )
                    {
                    otherlv_8=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleFlatNetwork6710); 

                        	newLeafNode(otherlv_8, grammarAccess.getFlatNetworkAccess().getRoutingProtocolKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2990:1: ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2991:1: (lv_routingProtocol_9_0= ruleRoutingProtocol )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2991:1: (lv_routingProtocol_9_0= ruleRoutingProtocol )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:2992:3: lv_routingProtocol_9_0= ruleRoutingProtocol
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getRoutingProtocolRoutingProtocolEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoutingProtocol_in_ruleFlatNetwork6731);
                    lv_routingProtocol_9_0=ruleRoutingProtocol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"routingProtocol",
                            		lv_routingProtocol_9_0, 
                            		"RoutingProtocol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3008:4: (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==49) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3008:6: otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleFlatNetwork6746); 

                        	newLeafNode(otherlv_10, grammarAccess.getFlatNetworkAccess().getResourcesKeyword_6_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlatNetwork6758); 

                        	newLeafNode(otherlv_11, grammarAccess.getFlatNetworkAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3016:1: ( (lv_resources_12_0= ruleAbstractSensor ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3017:1: (lv_resources_12_0= ruleAbstractSensor )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3017:1: (lv_resources_12_0= ruleAbstractSensor )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3018:3: lv_resources_12_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getResourcesAbstractSensorParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork6779);
                    lv_resources_12_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_12_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3034:2: (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==15) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3034:4: otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFlatNetwork6792); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getFlatNetworkAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3038:1: ( (lv_resources_14_0= ruleAbstractSensor ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3039:1: (lv_resources_14_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3039:1: (lv_resources_14_0= ruleAbstractSensor )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3040:3: lv_resources_14_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getResourcesAbstractSensorParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork6813);
                    	    lv_resources_14_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_14_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFlatNetwork6827); 

                        	newLeafNode(otherlv_15, grammarAccess.getFlatNetworkAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleFlatNetwork6841); 

                	newLeafNode(otherlv_16, grammarAccess.getFlatNetworkAccess().getSinkKeyword_7());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3064:1: ( (lv_sink_17_0= ruleSinkNode ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3065:1: (lv_sink_17_0= ruleSinkNode )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3065:1: (lv_sink_17_0= ruleSinkNode )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3066:3: lv_sink_17_0= ruleSinkNode
            {
             
            	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getSinkSinkNodeParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSinkNode_in_ruleFlatNetwork6862);
            lv_sink_17_0=ruleSinkNode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
            	        }
                   		set(
                   			current, 
                   			"sink",
                    		lv_sink_17_0, 
                    		"SinkNode");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3082:2: (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleAbstractFlatNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleAbstractFlatNode ) ) )* otherlv_23= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==51) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3082:4: otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleAbstractFlatNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleAbstractFlatNode ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleFlatNetwork6875); 

                        	newLeafNode(otherlv_18, grammarAccess.getFlatNetworkAccess().getNodesKeyword_9_0());
                        
                    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlatNetwork6887); 

                        	newLeafNode(otherlv_19, grammarAccess.getFlatNetworkAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3090:1: ( (lv_nodes_20_0= ruleAbstractFlatNode ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3091:1: (lv_nodes_20_0= ruleAbstractFlatNode )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3091:1: (lv_nodes_20_0= ruleAbstractFlatNode )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3092:3: lv_nodes_20_0= ruleAbstractFlatNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getNodesAbstractFlatNodeParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork6908);
                    lv_nodes_20_0=ruleAbstractFlatNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_20_0, 
                            		"AbstractFlatNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3108:2: (otherlv_21= ',' ( (lv_nodes_22_0= ruleAbstractFlatNode ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==15) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3108:4: otherlv_21= ',' ( (lv_nodes_22_0= ruleAbstractFlatNode ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFlatNetwork6921); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getFlatNetworkAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3112:1: ( (lv_nodes_22_0= ruleAbstractFlatNode ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3113:1: (lv_nodes_22_0= ruleAbstractFlatNode )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3113:1: (lv_nodes_22_0= ruleAbstractFlatNode )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3114:3: lv_nodes_22_0= ruleAbstractFlatNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getNodesAbstractFlatNodeParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork6942);
                    	    lv_nodes_22_0=ruleAbstractFlatNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_22_0, 
                    	            		"AbstractFlatNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFlatNetwork6956); 

                        	newLeafNode(otherlv_23, grammarAccess.getFlatNetworkAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFlatNetwork6970); 

                	newLeafNode(otherlv_24, grammarAccess.getFlatNetworkAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3146:1: entryRuleClusteredNetwork returns [EObject current=null] : iv_ruleClusteredNetwork= ruleClusteredNetwork EOF ;
    public final EObject entryRuleClusteredNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClusteredNetwork = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3147:2: (iv_ruleClusteredNetwork= ruleClusteredNetwork EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3148:2: iv_ruleClusteredNetwork= ruleClusteredNetwork EOF
            {
             newCompositeNode(grammarAccess.getClusteredNetworkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClusteredNetwork_in_entryRuleClusteredNetwork7006);
            iv_ruleClusteredNetwork=ruleClusteredNetwork();

            state._fsp--;

             current =iv_ruleClusteredNetwork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClusteredNetwork7016); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3155:1: ruleClusteredNetwork returns [EObject current=null] : (otherlv_0= 'ClusteredNetwork' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )? (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )? (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )? (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )? otherlv_16= 'sink' ( (lv_sink_17_0= ruleSinkNode ) ) (otherlv_18= 'clusters' otherlv_19= '{' ( (lv_clusters_20_0= ruleCluster ) ) (otherlv_21= ',' ( (lv_clusters_22_0= ruleCluster ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleClusteredNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_nbOfNodes_5_0 = null;

        Enumerator lv_interNodeComm_7_0 = null;

        Enumerator lv_routingProtocol_9_0 = null;

        EObject lv_resources_12_0 = null;

        EObject lv_resources_14_0 = null;

        EObject lv_sink_17_0 = null;

        EObject lv_clusters_20_0 = null;

        EObject lv_clusters_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3158:28: ( (otherlv_0= 'ClusteredNetwork' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )? (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )? (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )? (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )? otherlv_16= 'sink' ( (lv_sink_17_0= ruleSinkNode ) ) (otherlv_18= 'clusters' otherlv_19= '{' ( (lv_clusters_20_0= ruleCluster ) ) (otherlv_21= ',' ( (lv_clusters_22_0= ruleCluster ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3159:1: (otherlv_0= 'ClusteredNetwork' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )? (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )? (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )? (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )? otherlv_16= 'sink' ( (lv_sink_17_0= ruleSinkNode ) ) (otherlv_18= 'clusters' otherlv_19= '{' ( (lv_clusters_20_0= ruleCluster ) ) (otherlv_21= ',' ( (lv_clusters_22_0= ruleCluster ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3159:1: (otherlv_0= 'ClusteredNetwork' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )? (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )? (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )? (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )? otherlv_16= 'sink' ( (lv_sink_17_0= ruleSinkNode ) ) (otherlv_18= 'clusters' otherlv_19= '{' ( (lv_clusters_20_0= ruleCluster ) ) (otherlv_21= ',' ( (lv_clusters_22_0= ruleCluster ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3159:3: otherlv_0= 'ClusteredNetwork' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )? (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )? (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )? (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )? otherlv_16= 'sink' ( (lv_sink_17_0= ruleSinkNode ) ) (otherlv_18= 'clusters' otherlv_19= '{' ( (lv_clusters_20_0= ruleCluster ) ) (otherlv_21= ',' ( (lv_clusters_22_0= ruleCluster ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleClusteredNetwork7053); 

                	newLeafNode(otherlv_0, grammarAccess.getClusteredNetworkAccess().getClusteredNetworkKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusteredNetwork7065); 

                	newLeafNode(otherlv_1, grammarAccess.getClusteredNetworkAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3167:1: (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==13) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3167:3: otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClusteredNetwork7078); 

                        	newLeafNode(otherlv_2, grammarAccess.getClusteredNetworkAccess().getIdKeyword_2_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3171:1: ( (lv_id_3_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3172:1: (lv_id_3_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3172:1: (lv_id_3_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3173:3: lv_id_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getIdEIntParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleClusteredNetwork7099);
                    lv_id_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3189:4: (otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==46) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3189:6: otherlv_4= 'nbOfNodes' ( (lv_nbOfNodes_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleClusteredNetwork7114); 

                        	newLeafNode(otherlv_4, grammarAccess.getClusteredNetworkAccess().getNbOfNodesKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3193:1: ( (lv_nbOfNodes_5_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3194:1: (lv_nbOfNodes_5_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3194:1: (lv_nbOfNodes_5_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3195:3: lv_nbOfNodes_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getNbOfNodesEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleClusteredNetwork7135);
                    lv_nbOfNodes_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"nbOfNodes",
                            		lv_nbOfNodes_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3211:4: (otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==47) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3211:6: otherlv_6= 'interNodeComm' ( (lv_interNodeComm_7_0= ruleInterNodeComm ) )
                    {
                    otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleClusteredNetwork7150); 

                        	newLeafNode(otherlv_6, grammarAccess.getClusteredNetworkAccess().getInterNodeCommKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3215:1: ( (lv_interNodeComm_7_0= ruleInterNodeComm ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3216:1: (lv_interNodeComm_7_0= ruleInterNodeComm )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3216:1: (lv_interNodeComm_7_0= ruleInterNodeComm )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3217:3: lv_interNodeComm_7_0= ruleInterNodeComm
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getInterNodeCommInterNodeCommEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInterNodeComm_in_ruleClusteredNetwork7171);
                    lv_interNodeComm_7_0=ruleInterNodeComm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"interNodeComm",
                            		lv_interNodeComm_7_0, 
                            		"InterNodeComm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3233:4: (otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==48) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3233:6: otherlv_8= 'routingProtocol' ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) )
                    {
                    otherlv_8=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleClusteredNetwork7186); 

                        	newLeafNode(otherlv_8, grammarAccess.getClusteredNetworkAccess().getRoutingProtocolKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3237:1: ( (lv_routingProtocol_9_0= ruleRoutingProtocol ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3238:1: (lv_routingProtocol_9_0= ruleRoutingProtocol )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3238:1: (lv_routingProtocol_9_0= ruleRoutingProtocol )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3239:3: lv_routingProtocol_9_0= ruleRoutingProtocol
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getRoutingProtocolRoutingProtocolEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoutingProtocol_in_ruleClusteredNetwork7207);
                    lv_routingProtocol_9_0=ruleRoutingProtocol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"routingProtocol",
                            		lv_routingProtocol_9_0, 
                            		"RoutingProtocol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3255:4: (otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==49) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3255:6: otherlv_10= 'resources' otherlv_11= '{' ( (lv_resources_12_0= ruleAbstractSensor ) ) (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleClusteredNetwork7222); 

                        	newLeafNode(otherlv_10, grammarAccess.getClusteredNetworkAccess().getResourcesKeyword_6_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusteredNetwork7234); 

                        	newLeafNode(otherlv_11, grammarAccess.getClusteredNetworkAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3263:1: ( (lv_resources_12_0= ruleAbstractSensor ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3264:1: (lv_resources_12_0= ruleAbstractSensor )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3264:1: (lv_resources_12_0= ruleAbstractSensor )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3265:3: lv_resources_12_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getResourcesAbstractSensorParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork7255);
                    lv_resources_12_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_12_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3281:2: (otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==15) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3281:4: otherlv_13= ',' ( (lv_resources_14_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClusteredNetwork7268); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getClusteredNetworkAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3285:1: ( (lv_resources_14_0= ruleAbstractSensor ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3286:1: (lv_resources_14_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3286:1: (lv_resources_14_0= ruleAbstractSensor )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3287:3: lv_resources_14_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getResourcesAbstractSensorParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork7289);
                    	    lv_resources_14_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_14_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusteredNetwork7303); 

                        	newLeafNode(otherlv_15, grammarAccess.getClusteredNetworkAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleClusteredNetwork7317); 

                	newLeafNode(otherlv_16, grammarAccess.getClusteredNetworkAccess().getSinkKeyword_7());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3311:1: ( (lv_sink_17_0= ruleSinkNode ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3312:1: (lv_sink_17_0= ruleSinkNode )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3312:1: (lv_sink_17_0= ruleSinkNode )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3313:3: lv_sink_17_0= ruleSinkNode
            {
             
            	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getSinkSinkNodeParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSinkNode_in_ruleClusteredNetwork7338);
            lv_sink_17_0=ruleSinkNode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
            	        }
                   		set(
                   			current, 
                   			"sink",
                    		lv_sink_17_0, 
                    		"SinkNode");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3329:2: (otherlv_18= 'clusters' otherlv_19= '{' ( (lv_clusters_20_0= ruleCluster ) ) (otherlv_21= ',' ( (lv_clusters_22_0= ruleCluster ) ) )* otherlv_23= '}' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==53) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3329:4: otherlv_18= 'clusters' otherlv_19= '{' ( (lv_clusters_20_0= ruleCluster ) ) (otherlv_21= ',' ( (lv_clusters_22_0= ruleCluster ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleClusteredNetwork7351); 

                        	newLeafNode(otherlv_18, grammarAccess.getClusteredNetworkAccess().getClustersKeyword_9_0());
                        
                    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusteredNetwork7363); 

                        	newLeafNode(otherlv_19, grammarAccess.getClusteredNetworkAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3337:1: ( (lv_clusters_20_0= ruleCluster ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3338:1: (lv_clusters_20_0= ruleCluster )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3338:1: (lv_clusters_20_0= ruleCluster )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3339:3: lv_clusters_20_0= ruleCluster
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getClustersClusterParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCluster_in_ruleClusteredNetwork7384);
                    lv_clusters_20_0=ruleCluster();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"clusters",
                            		lv_clusters_20_0, 
                            		"Cluster");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3355:2: (otherlv_21= ',' ( (lv_clusters_22_0= ruleCluster ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==15) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3355:4: otherlv_21= ',' ( (lv_clusters_22_0= ruleCluster ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClusteredNetwork7397); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getClusteredNetworkAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3359:1: ( (lv_clusters_22_0= ruleCluster ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3360:1: (lv_clusters_22_0= ruleCluster )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3360:1: (lv_clusters_22_0= ruleCluster )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3361:3: lv_clusters_22_0= ruleCluster
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getClustersClusterParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCluster_in_ruleClusteredNetwork7418);
                    	    lv_clusters_22_0=ruleCluster();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"clusters",
                    	            		lv_clusters_22_0, 
                    	            		"Cluster");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusteredNetwork7432); 

                        	newLeafNode(otherlv_23, grammarAccess.getClusteredNetworkAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusteredNetwork7446); 

                	newLeafNode(otherlv_24, grammarAccess.getClusteredNetworkAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleCluster"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3393:1: entryRuleCluster returns [EObject current=null] : iv_ruleCluster= ruleCluster EOF ;
    public final EObject entryRuleCluster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCluster = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3394:2: (iv_ruleCluster= ruleCluster EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3395:2: iv_ruleCluster= ruleCluster EOF
            {
             newCompositeNode(grammarAccess.getClusterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCluster_in_entryRuleCluster7482);
            iv_ruleCluster=ruleCluster();

            state._fsp--;

             current =iv_ruleCluster; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCluster7492); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3402:1: ruleCluster returns [EObject current=null] : ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
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
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_nodes_13_0 = null;

        EObject lv_nodes_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3405:28: ( ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3406:1: ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3406:1: ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3406:2: () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3406:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3407:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClusterAccess().getClusterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleCluster7538); 

                	newLeafNode(otherlv_1, grammarAccess.getClusterAccess().getClusterKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCluster7550); 

                	newLeafNode(otherlv_2, grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3420:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==13) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3420:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCluster7563); 

                        	newLeafNode(otherlv_3, grammarAccess.getClusterAccess().getIdKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3424:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3425:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3425:1: (lv_id_4_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3426:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCluster7584);
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

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3442:4: (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==49) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3442:6: otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleCluster7599); 

                        	newLeafNode(otherlv_5, grammarAccess.getClusterAccess().getResourcesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleCluster7611); 

                        	newLeafNode(otherlv_6, grammarAccess.getClusterAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3450:1: ( ( ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3451:1: ( ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3451:1: ( ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3452:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClusterRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getResourcesAbstractSensorCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCluster7634);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3465:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==15) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3465:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCluster7647); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getClusterAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3469:1: ( ( ruleEString ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3470:1: ( ruleEString )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3470:1: ( ruleEString )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3471:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getClusterRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusterAccess().getResourcesAbstractSensorCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCluster7670);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleCluster7684); 

                        	newLeafNode(otherlv_10, grammarAccess.getClusterAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3488:3: (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==51) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3488:5: otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleCluster7699); 

                        	newLeafNode(otherlv_11, grammarAccess.getClusterAccess().getNodesKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCluster7711); 

                        	newLeafNode(otherlv_12, grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3496:1: ( (lv_nodes_13_0= ruleAbstractClusterNode ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3497:1: (lv_nodes_13_0= ruleAbstractClusterNode )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3497:1: (lv_nodes_13_0= ruleAbstractClusterNode )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3498:3: lv_nodes_13_0= ruleAbstractClusterNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getNodesAbstractClusterNodeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractClusterNode_in_ruleCluster7732);
                    lv_nodes_13_0=ruleAbstractClusterNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_13_0, 
                            		"AbstractClusterNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3514:2: (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==15) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3514:4: otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCluster7745); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getClusterAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3518:1: ( (lv_nodes_15_0= ruleAbstractClusterNode ) )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3519:1: (lv_nodes_15_0= ruleAbstractClusterNode )
                    	    {
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3519:1: (lv_nodes_15_0= ruleAbstractClusterNode )
                    	    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3520:3: lv_nodes_15_0= ruleAbstractClusterNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusterAccess().getNodesAbstractClusterNodeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractClusterNode_in_ruleCluster7766);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCluster7780); 

                        	newLeafNode(otherlv_16, grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCluster7794); 

                	newLeafNode(otherlv_17, grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleReceiveMessageTrigger"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3552:1: entryRuleReceiveMessageTrigger returns [EObject current=null] : iv_ruleReceiveMessageTrigger= ruleReceiveMessageTrigger EOF ;
    public final EObject entryRuleReceiveMessageTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiveMessageTrigger = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3553:2: (iv_ruleReceiveMessageTrigger= ruleReceiveMessageTrigger EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3554:2: iv_ruleReceiveMessageTrigger= ruleReceiveMessageTrigger EOF
            {
             newCompositeNode(grammarAccess.getReceiveMessageTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReceiveMessageTrigger_in_entryRuleReceiveMessageTrigger7830);
            iv_ruleReceiveMessageTrigger=ruleReceiveMessageTrigger();

            state._fsp--;

             current =iv_ruleReceiveMessageTrigger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReceiveMessageTrigger7840); 

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
    // $ANTLR end "entryRuleReceiveMessageTrigger"


    // $ANTLR start "ruleReceiveMessageTrigger"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3561:1: ruleReceiveMessageTrigger returns [EObject current=null] : ( () otherlv_1= 'ReceiveMessageTrigger' ) ;
    public final EObject ruleReceiveMessageTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3564:28: ( ( () otherlv_1= 'ReceiveMessageTrigger' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3565:1: ( () otherlv_1= 'ReceiveMessageTrigger' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3565:1: ( () otherlv_1= 'ReceiveMessageTrigger' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3565:2: () otherlv_1= 'ReceiveMessageTrigger'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3565:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3566:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReceiveMessageTriggerAccess().getReceiveMessageTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleReceiveMessageTrigger7886); 

                	newLeafNode(otherlv_1, grammarAccess.getReceiveMessageTriggerAccess().getReceiveMessageTriggerKeyword_1());
                

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
    // $ANTLR end "ruleReceiveMessageTrigger"


    // $ANTLR start "entryRuleRecieveSerialMsgTrigger"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3583:1: entryRuleRecieveSerialMsgTrigger returns [EObject current=null] : iv_ruleRecieveSerialMsgTrigger= ruleRecieveSerialMsgTrigger EOF ;
    public final EObject entryRuleRecieveSerialMsgTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecieveSerialMsgTrigger = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3584:2: (iv_ruleRecieveSerialMsgTrigger= ruleRecieveSerialMsgTrigger EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3585:2: iv_ruleRecieveSerialMsgTrigger= ruleRecieveSerialMsgTrigger EOF
            {
             newCompositeNode(grammarAccess.getRecieveSerialMsgTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecieveSerialMsgTrigger_in_entryRuleRecieveSerialMsgTrigger7922);
            iv_ruleRecieveSerialMsgTrigger=ruleRecieveSerialMsgTrigger();

            state._fsp--;

             current =iv_ruleRecieveSerialMsgTrigger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecieveSerialMsgTrigger7932); 

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
    // $ANTLR end "entryRuleRecieveSerialMsgTrigger"


    // $ANTLR start "ruleRecieveSerialMsgTrigger"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3592:1: ruleRecieveSerialMsgTrigger returns [EObject current=null] : ( () otherlv_1= 'RecieveSerialMsgTrigger' ) ;
    public final EObject ruleRecieveSerialMsgTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3595:28: ( ( () otherlv_1= 'RecieveSerialMsgTrigger' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3596:1: ( () otherlv_1= 'RecieveSerialMsgTrigger' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3596:1: ( () otherlv_1= 'RecieveSerialMsgTrigger' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3596:2: () otherlv_1= 'RecieveSerialMsgTrigger'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3596:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3597:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRecieveSerialMsgTriggerAccess().getRecieveSerialMsgTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleRecieveSerialMsgTrigger7978); 

                	newLeafNode(otherlv_1, grammarAccess.getRecieveSerialMsgTriggerAccess().getRecieveSerialMsgTriggerKeyword_1());
                

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
    // $ANTLR end "ruleRecieveSerialMsgTrigger"


    // $ANTLR start "entryRuleStartJobTrigger_Impl"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3614:1: entryRuleStartJobTrigger_Impl returns [EObject current=null] : iv_ruleStartJobTrigger_Impl= ruleStartJobTrigger_Impl EOF ;
    public final EObject entryRuleStartJobTrigger_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartJobTrigger_Impl = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3615:2: (iv_ruleStartJobTrigger_Impl= ruleStartJobTrigger_Impl EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3616:2: iv_ruleStartJobTrigger_Impl= ruleStartJobTrigger_Impl EOF
            {
             newCompositeNode(grammarAccess.getStartJobTrigger_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStartJobTrigger_Impl_in_entryRuleStartJobTrigger_Impl8014);
            iv_ruleStartJobTrigger_Impl=ruleStartJobTrigger_Impl();

            state._fsp--;

             current =iv_ruleStartJobTrigger_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStartJobTrigger_Impl8024); 

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
    // $ANTLR end "entryRuleStartJobTrigger_Impl"


    // $ANTLR start "ruleStartJobTrigger_Impl"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3623:1: ruleStartJobTrigger_Impl returns [EObject current=null] : ( () otherlv_1= 'StartJobTrigger' ) ;
    public final EObject ruleStartJobTrigger_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3626:28: ( ( () otherlv_1= 'StartJobTrigger' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3627:1: ( () otherlv_1= 'StartJobTrigger' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3627:1: ( () otherlv_1= 'StartJobTrigger' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3627:2: () otherlv_1= 'StartJobTrigger'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3627:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3628:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStartJobTrigger_ImplAccess().getStartJobTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleStartJobTrigger_Impl8070); 

                	newLeafNode(otherlv_1, grammarAccess.getStartJobTrigger_ImplAccess().getStartJobTriggerKeyword_1());
                

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
    // $ANTLR end "ruleStartJobTrigger_Impl"


    // $ANTLR start "entryRuleStopJobTrigger_Impl"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3645:1: entryRuleStopJobTrigger_Impl returns [EObject current=null] : iv_ruleStopJobTrigger_Impl= ruleStopJobTrigger_Impl EOF ;
    public final EObject entryRuleStopJobTrigger_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopJobTrigger_Impl = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3646:2: (iv_ruleStopJobTrigger_Impl= ruleStopJobTrigger_Impl EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3647:2: iv_ruleStopJobTrigger_Impl= ruleStopJobTrigger_Impl EOF
            {
             newCompositeNode(grammarAccess.getStopJobTrigger_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStopJobTrigger_Impl_in_entryRuleStopJobTrigger_Impl8106);
            iv_ruleStopJobTrigger_Impl=ruleStopJobTrigger_Impl();

            state._fsp--;

             current =iv_ruleStopJobTrigger_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStopJobTrigger_Impl8116); 

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
    // $ANTLR end "entryRuleStopJobTrigger_Impl"


    // $ANTLR start "ruleStopJobTrigger_Impl"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3654:1: ruleStopJobTrigger_Impl returns [EObject current=null] : ( () otherlv_1= 'StopJobTrigger' ) ;
    public final EObject ruleStopJobTrigger_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3657:28: ( ( () otherlv_1= 'StopJobTrigger' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3658:1: ( () otherlv_1= 'StopJobTrigger' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3658:1: ( () otherlv_1= 'StopJobTrigger' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3658:2: () otherlv_1= 'StopJobTrigger'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3658:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3659:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStopJobTrigger_ImplAccess().getStopJobTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleStopJobTrigger_Impl8162); 

                	newLeafNode(otherlv_1, grammarAccess.getStopJobTrigger_ImplAccess().getStopJobTriggerKeyword_1());
                

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
    // $ANTLR end "ruleStopJobTrigger_Impl"


    // $ANTLR start "entryRulePushButtomTrigger"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3676:1: entryRulePushButtomTrigger returns [EObject current=null] : iv_rulePushButtomTrigger= rulePushButtomTrigger EOF ;
    public final EObject entryRulePushButtomTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePushButtomTrigger = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3677:2: (iv_rulePushButtomTrigger= rulePushButtomTrigger EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3678:2: iv_rulePushButtomTrigger= rulePushButtomTrigger EOF
            {
             newCompositeNode(grammarAccess.getPushButtomTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePushButtomTrigger_in_entryRulePushButtomTrigger8198);
            iv_rulePushButtomTrigger=rulePushButtomTrigger();

            state._fsp--;

             current =iv_rulePushButtomTrigger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePushButtomTrigger8208); 

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
    // $ANTLR end "entryRulePushButtomTrigger"


    // $ANTLR start "rulePushButtomTrigger"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3685:1: rulePushButtomTrigger returns [EObject current=null] : ( () otherlv_1= 'PushButtomTrigger' ) ;
    public final EObject rulePushButtomTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3688:28: ( ( () otherlv_1= 'PushButtomTrigger' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3689:1: ( () otherlv_1= 'PushButtomTrigger' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3689:1: ( () otherlv_1= 'PushButtomTrigger' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3689:2: () otherlv_1= 'PushButtomTrigger'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3689:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3690:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPushButtomTriggerAccess().getPushButtomTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_rulePushButtomTrigger8254); 

                	newLeafNode(otherlv_1, grammarAccess.getPushButtomTriggerAccess().getPushButtomTriggerKeyword_1());
                

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
    // $ANTLR end "rulePushButtomTrigger"


    // $ANTLR start "entryRuleConditionalAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3707:1: entryRuleConditionalAction returns [EObject current=null] : iv_ruleConditionalAction= ruleConditionalAction EOF ;
    public final EObject entryRuleConditionalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3708:2: (iv_ruleConditionalAction= ruleConditionalAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3709:2: iv_ruleConditionalAction= ruleConditionalAction EOF
            {
             newCompositeNode(grammarAccess.getConditionalActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_entryRuleConditionalAction8290);
            iv_ruleConditionalAction=ruleConditionalAction();

            state._fsp--;

             current =iv_ruleConditionalAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditionalAction8300); 

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
    // $ANTLR end "entryRuleConditionalAction"


    // $ANTLR start "ruleConditionalAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3716:1: ruleConditionalAction returns [EObject current=null] : ( () otherlv_1= 'ConditionalAction' otherlv_2= '{' (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )? (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleConditionalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_sensorTerm_4_0 = null;

        Enumerator lv_logicalSymbol_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_unit_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3719:28: ( ( () otherlv_1= 'ConditionalAction' otherlv_2= '{' (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )? (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3720:1: ( () otherlv_1= 'ConditionalAction' otherlv_2= '{' (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )? (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3720:1: ( () otherlv_1= 'ConditionalAction' otherlv_2= '{' (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )? (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3720:2: () otherlv_1= 'ConditionalAction' otherlv_2= '{' (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )? (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3720:2: ()
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3721:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConditionalActionAccess().getConditionalActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleConditionalAction8346); 

                	newLeafNode(otherlv_1, grammarAccess.getConditionalActionAccess().getConditionalActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConditionalAction8358); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionalActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3734:1: (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==63) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3734:3: otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleConditionalAction8371); 

                        	newLeafNode(otherlv_3, grammarAccess.getConditionalActionAccess().getSensorTermKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3738:1: ( (lv_sensorTerm_4_0= ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3739:1: (lv_sensorTerm_4_0= ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3739:1: (lv_sensorTerm_4_0= ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3740:3: lv_sensorTerm_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalActionAccess().getSensorTermEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConditionalAction8392);
                    lv_sensorTerm_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalActionRule());
                    	        }
                           		set(
                           			current, 
                           			"sensorTerm",
                            		lv_sensorTerm_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3756:4: (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==64) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3756:6: otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) )
                    {
                    otherlv_5=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleConditionalAction8407); 

                        	newLeafNode(otherlv_5, grammarAccess.getConditionalActionAccess().getLogicalSymbolKeyword_4_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3760:1: ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3761:1: (lv_logicalSymbol_6_0= ruleLogicalSymbol )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3761:1: (lv_logicalSymbol_6_0= ruleLogicalSymbol )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3762:3: lv_logicalSymbol_6_0= ruleLogicalSymbol
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalActionAccess().getLogicalSymbolLogicalSymbolEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalSymbol_in_ruleConditionalAction8428);
                    lv_logicalSymbol_6_0=ruleLogicalSymbol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalActionRule());
                    	        }
                           		set(
                           			current, 
                           			"logicalSymbol",
                            		lv_logicalSymbol_6_0, 
                            		"LogicalSymbol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3778:4: (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==65) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3778:6: otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) )
                    {
                    otherlv_7=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleConditionalAction8443); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionalActionAccess().getValueKeyword_5_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3782:1: ( (lv_value_8_0= ruleELong ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3783:1: (lv_value_8_0= ruleELong )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3783:1: (lv_value_8_0= ruleELong )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3784:3: lv_value_8_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalActionAccess().getValueELongParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleConditionalAction8464);
                    lv_value_8_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalActionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_8_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3800:4: (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==66) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3800:6: otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleConditionalAction8479); 

                        	newLeafNode(otherlv_9, grammarAccess.getConditionalActionAccess().getUnitKeyword_6_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3804:1: ( (lv_unit_10_0= ruleEString ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3805:1: (lv_unit_10_0= ruleEString )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3805:1: (lv_unit_10_0= ruleEString )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3806:3: lv_unit_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalActionAccess().getUnitEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConditionalAction8500);
                    lv_unit_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalActionRule());
                    	        }
                           		set(
                           			current, 
                           			"unit",
                            		lv_unit_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConditionalAction8514); 

                	newLeafNode(otherlv_11, grammarAccess.getConditionalActionAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleConditionalAction"


    // $ANTLR start "entryRuleReadNodeMemoryAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3834:1: entryRuleReadNodeMemoryAction returns [EObject current=null] : iv_ruleReadNodeMemoryAction= ruleReadNodeMemoryAction EOF ;
    public final EObject entryRuleReadNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadNodeMemoryAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3835:2: (iv_ruleReadNodeMemoryAction= ruleReadNodeMemoryAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3836:2: iv_ruleReadNodeMemoryAction= ruleReadNodeMemoryAction EOF
            {
             newCompositeNode(grammarAccess.getReadNodeMemoryActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReadNodeMemoryAction_in_entryRuleReadNodeMemoryAction8550);
            iv_ruleReadNodeMemoryAction=ruleReadNodeMemoryAction();

            state._fsp--;

             current =iv_ruleReadNodeMemoryAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReadNodeMemoryAction8560); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3843:1: ruleReadNodeMemoryAction returns [EObject current=null] : (otherlv_0= 'ReadNodeMemoryAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' ) ;
    public final EObject ruleReadNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3846:28: ( (otherlv_0= 'ReadNodeMemoryAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3847:1: (otherlv_0= 'ReadNodeMemoryAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3847:1: (otherlv_0= 'ReadNodeMemoryAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3847:3: otherlv_0= 'ReadNodeMemoryAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleReadNodeMemoryAction8597); 

                	newLeafNode(otherlv_0, grammarAccess.getReadNodeMemoryActionAccess().getReadNodeMemoryActionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleReadNodeMemoryAction8609); 

                	newLeafNode(otherlv_1, grammarAccess.getReadNodeMemoryActionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleReadNodeMemoryAction8621); 

                	newLeafNode(otherlv_2, grammarAccess.getReadNodeMemoryActionAccess().getConditionKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3859:1: ( (lv_condition_3_0= ruleConditionalAction ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3860:1: (lv_condition_3_0= ruleConditionalAction )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3860:1: (lv_condition_3_0= ruleConditionalAction )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3861:3: lv_condition_3_0= ruleConditionalAction
            {
             
            	        newCompositeNode(grammarAccess.getReadNodeMemoryActionAccess().getConditionConditionalActionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_ruleReadNodeMemoryAction8642);
            lv_condition_3_0=ruleConditionalAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadNodeMemoryActionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_3_0, 
                    		"ConditionalAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleReadNodeMemoryAction8654); 

                	newLeafNode(otherlv_4, grammarAccess.getReadNodeMemoryActionAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3889:1: entryRuleWriteNodeMemoryAction returns [EObject current=null] : iv_ruleWriteNodeMemoryAction= ruleWriteNodeMemoryAction EOF ;
    public final EObject entryRuleWriteNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteNodeMemoryAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3890:2: (iv_ruleWriteNodeMemoryAction= ruleWriteNodeMemoryAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3891:2: iv_ruleWriteNodeMemoryAction= ruleWriteNodeMemoryAction EOF
            {
             newCompositeNode(grammarAccess.getWriteNodeMemoryActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWriteNodeMemoryAction_in_entryRuleWriteNodeMemoryAction8690);
            iv_ruleWriteNodeMemoryAction=ruleWriteNodeMemoryAction();

            state._fsp--;

             current =iv_ruleWriteNodeMemoryAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWriteNodeMemoryAction8700); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3898:1: ruleWriteNodeMemoryAction returns [EObject current=null] : (otherlv_0= 'WriteNodeMemoryAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' ) ;
    public final EObject ruleWriteNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3901:28: ( (otherlv_0= 'WriteNodeMemoryAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3902:1: (otherlv_0= 'WriteNodeMemoryAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3902:1: (otherlv_0= 'WriteNodeMemoryAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3902:3: otherlv_0= 'WriteNodeMemoryAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleWriteNodeMemoryAction8737); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteNodeMemoryActionAccess().getWriteNodeMemoryActionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWriteNodeMemoryAction8749); 

                	newLeafNode(otherlv_1, grammarAccess.getWriteNodeMemoryActionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleWriteNodeMemoryAction8761); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteNodeMemoryActionAccess().getConditionKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3914:1: ( (lv_condition_3_0= ruleConditionalAction ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3915:1: (lv_condition_3_0= ruleConditionalAction )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3915:1: (lv_condition_3_0= ruleConditionalAction )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3916:3: lv_condition_3_0= ruleConditionalAction
            {
             
            	        newCompositeNode(grammarAccess.getWriteNodeMemoryActionAccess().getConditionConditionalActionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_ruleWriteNodeMemoryAction8782);
            lv_condition_3_0=ruleConditionalAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteNodeMemoryActionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_3_0, 
                    		"ConditionalAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleWriteNodeMemoryAction8794); 

                	newLeafNode(otherlv_4, grammarAccess.getWriteNodeMemoryActionAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3944:1: entryRuleSendMessageAction returns [EObject current=null] : iv_ruleSendMessageAction= ruleSendMessageAction EOF ;
    public final EObject entryRuleSendMessageAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendMessageAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3945:2: (iv_ruleSendMessageAction= ruleSendMessageAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3946:2: iv_ruleSendMessageAction= ruleSendMessageAction EOF
            {
             newCompositeNode(grammarAccess.getSendMessageActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSendMessageAction_in_entryRuleSendMessageAction8830);
            iv_ruleSendMessageAction=ruleSendMessageAction();

            state._fsp--;

             current =iv_ruleSendMessageAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSendMessageAction8840); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3953:1: ruleSendMessageAction returns [EObject current=null] : (otherlv_0= 'SendMessageAction' otherlv_1= '{' (otherlv_2= 'sendMessageTo' ( (lv_sendMessageTo_3_0= ruleEInt ) ) )? otherlv_4= 'condition' ( (lv_condition_5_0= ruleConditionalAction ) ) otherlv_6= '}' ) ;
    public final EObject ruleSendMessageAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_sendMessageTo_3_0 = null;

        EObject lv_condition_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3956:28: ( (otherlv_0= 'SendMessageAction' otherlv_1= '{' (otherlv_2= 'sendMessageTo' ( (lv_sendMessageTo_3_0= ruleEInt ) ) )? otherlv_4= 'condition' ( (lv_condition_5_0= ruleConditionalAction ) ) otherlv_6= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3957:1: (otherlv_0= 'SendMessageAction' otherlv_1= '{' (otherlv_2= 'sendMessageTo' ( (lv_sendMessageTo_3_0= ruleEInt ) ) )? otherlv_4= 'condition' ( (lv_condition_5_0= ruleConditionalAction ) ) otherlv_6= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3957:1: (otherlv_0= 'SendMessageAction' otherlv_1= '{' (otherlv_2= 'sendMessageTo' ( (lv_sendMessageTo_3_0= ruleEInt ) ) )? otherlv_4= 'condition' ( (lv_condition_5_0= ruleConditionalAction ) ) otherlv_6= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3957:3: otherlv_0= 'SendMessageAction' otherlv_1= '{' (otherlv_2= 'sendMessageTo' ( (lv_sendMessageTo_3_0= ruleEInt ) ) )? otherlv_4= 'condition' ( (lv_condition_5_0= ruleConditionalAction ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleSendMessageAction8877); 

                	newLeafNode(otherlv_0, grammarAccess.getSendMessageActionAccess().getSendMessageActionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSendMessageAction8889); 

                	newLeafNode(otherlv_1, grammarAccess.getSendMessageActionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3965:1: (otherlv_2= 'sendMessageTo' ( (lv_sendMessageTo_3_0= ruleEInt ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==71) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3965:3: otherlv_2= 'sendMessageTo' ( (lv_sendMessageTo_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleSendMessageAction8902); 

                        	newLeafNode(otherlv_2, grammarAccess.getSendMessageActionAccess().getSendMessageToKeyword_2_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3969:1: ( (lv_sendMessageTo_3_0= ruleEInt ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3970:1: (lv_sendMessageTo_3_0= ruleEInt )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3970:1: (lv_sendMessageTo_3_0= ruleEInt )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3971:3: lv_sendMessageTo_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSendMessageActionAccess().getSendMessageToEIntParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSendMessageAction8923);
                    lv_sendMessageTo_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSendMessageActionRule());
                    	        }
                           		set(
                           			current, 
                           			"sendMessageTo",
                            		lv_sendMessageTo_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleSendMessageAction8937); 

                	newLeafNode(otherlv_4, grammarAccess.getSendMessageActionAccess().getConditionKeyword_3());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3991:1: ( (lv_condition_5_0= ruleConditionalAction ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3992:1: (lv_condition_5_0= ruleConditionalAction )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3992:1: (lv_condition_5_0= ruleConditionalAction )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:3993:3: lv_condition_5_0= ruleConditionalAction
            {
             
            	        newCompositeNode(grammarAccess.getSendMessageActionAccess().getConditionConditionalActionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_ruleSendMessageAction8958);
            lv_condition_5_0=ruleConditionalAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSendMessageActionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_5_0, 
                    		"ConditionalAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSendMessageAction8970); 

                	newLeafNode(otherlv_6, grammarAccess.getSendMessageActionAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleBlinkAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4021:1: entryRuleBlinkAction returns [EObject current=null] : iv_ruleBlinkAction= ruleBlinkAction EOF ;
    public final EObject entryRuleBlinkAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlinkAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4022:2: (iv_ruleBlinkAction= ruleBlinkAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4023:2: iv_ruleBlinkAction= ruleBlinkAction EOF
            {
             newCompositeNode(grammarAccess.getBlinkActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlinkAction_in_entryRuleBlinkAction9006);
            iv_ruleBlinkAction=ruleBlinkAction();

            state._fsp--;

             current =iv_ruleBlinkAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlinkAction9016); 

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
    // $ANTLR end "entryRuleBlinkAction"


    // $ANTLR start "ruleBlinkAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4030:1: ruleBlinkAction returns [EObject current=null] : (otherlv_0= 'BlinkAction' otherlv_1= '{' (otherlv_2= 'led' ( (lv_led_3_0= ruleLeds ) ) )? (otherlv_4= 'status' ( (lv_status_5_0= ruleLedStatus ) ) )? otherlv_6= 'condition' ( (lv_condition_7_0= ruleConditionalAction ) ) otherlv_8= '}' ) ;
    public final EObject ruleBlinkAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_led_3_0 = null;

        Enumerator lv_status_5_0 = null;

        EObject lv_condition_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4033:28: ( (otherlv_0= 'BlinkAction' otherlv_1= '{' (otherlv_2= 'led' ( (lv_led_3_0= ruleLeds ) ) )? (otherlv_4= 'status' ( (lv_status_5_0= ruleLedStatus ) ) )? otherlv_6= 'condition' ( (lv_condition_7_0= ruleConditionalAction ) ) otherlv_8= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4034:1: (otherlv_0= 'BlinkAction' otherlv_1= '{' (otherlv_2= 'led' ( (lv_led_3_0= ruleLeds ) ) )? (otherlv_4= 'status' ( (lv_status_5_0= ruleLedStatus ) ) )? otherlv_6= 'condition' ( (lv_condition_7_0= ruleConditionalAction ) ) otherlv_8= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4034:1: (otherlv_0= 'BlinkAction' otherlv_1= '{' (otherlv_2= 'led' ( (lv_led_3_0= ruleLeds ) ) )? (otherlv_4= 'status' ( (lv_status_5_0= ruleLedStatus ) ) )? otherlv_6= 'condition' ( (lv_condition_7_0= ruleConditionalAction ) ) otherlv_8= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4034:3: otherlv_0= 'BlinkAction' otherlv_1= '{' (otherlv_2= 'led' ( (lv_led_3_0= ruleLeds ) ) )? (otherlv_4= 'status' ( (lv_status_5_0= ruleLedStatus ) ) )? otherlv_6= 'condition' ( (lv_condition_7_0= ruleConditionalAction ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleBlinkAction9053); 

                	newLeafNode(otherlv_0, grammarAccess.getBlinkActionAccess().getBlinkActionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBlinkAction9065); 

                	newLeafNode(otherlv_1, grammarAccess.getBlinkActionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4042:1: (otherlv_2= 'led' ( (lv_led_3_0= ruleLeds ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==73) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4042:3: otherlv_2= 'led' ( (lv_led_3_0= ruleLeds ) )
                    {
                    otherlv_2=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleBlinkAction9078); 

                        	newLeafNode(otherlv_2, grammarAccess.getBlinkActionAccess().getLedKeyword_2_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4046:1: ( (lv_led_3_0= ruleLeds ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4047:1: (lv_led_3_0= ruleLeds )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4047:1: (lv_led_3_0= ruleLeds )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4048:3: lv_led_3_0= ruleLeds
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlinkActionAccess().getLedLedsEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLeds_in_ruleBlinkAction9099);
                    lv_led_3_0=ruleLeds();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlinkActionRule());
                    	        }
                           		set(
                           			current, 
                           			"led",
                            		lv_led_3_0, 
                            		"Leds");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4064:4: (otherlv_4= 'status' ( (lv_status_5_0= ruleLedStatus ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==74) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4064:6: otherlv_4= 'status' ( (lv_status_5_0= ruleLedStatus ) )
                    {
                    otherlv_4=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleBlinkAction9114); 

                        	newLeafNode(otherlv_4, grammarAccess.getBlinkActionAccess().getStatusKeyword_3_0());
                        
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4068:1: ( (lv_status_5_0= ruleLedStatus ) )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4069:1: (lv_status_5_0= ruleLedStatus )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4069:1: (lv_status_5_0= ruleLedStatus )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4070:3: lv_status_5_0= ruleLedStatus
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlinkActionAccess().getStatusLedStatusEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLedStatus_in_ruleBlinkAction9135);
                    lv_status_5_0=ruleLedStatus();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlinkActionRule());
                    	        }
                           		set(
                           			current, 
                           			"status",
                            		lv_status_5_0, 
                            		"LedStatus");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleBlinkAction9149); 

                	newLeafNode(otherlv_6, grammarAccess.getBlinkActionAccess().getConditionKeyword_4());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4090:1: ( (lv_condition_7_0= ruleConditionalAction ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4091:1: (lv_condition_7_0= ruleConditionalAction )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4091:1: (lv_condition_7_0= ruleConditionalAction )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4092:3: lv_condition_7_0= ruleConditionalAction
            {
             
            	        newCompositeNode(grammarAccess.getBlinkActionAccess().getConditionConditionalActionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_ruleBlinkAction9170);
            lv_condition_7_0=ruleConditionalAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBlinkActionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_7_0, 
                    		"ConditionalAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBlinkAction9182); 

                	newLeafNode(otherlv_8, grammarAccess.getBlinkActionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleBlinkAction"


    // $ANTLR start "entryRuleSendSerialPortMsgAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4120:1: entryRuleSendSerialPortMsgAction returns [EObject current=null] : iv_ruleSendSerialPortMsgAction= ruleSendSerialPortMsgAction EOF ;
    public final EObject entryRuleSendSerialPortMsgAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendSerialPortMsgAction = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4121:2: (iv_ruleSendSerialPortMsgAction= ruleSendSerialPortMsgAction EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4122:2: iv_ruleSendSerialPortMsgAction= ruleSendSerialPortMsgAction EOF
            {
             newCompositeNode(grammarAccess.getSendSerialPortMsgActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSendSerialPortMsgAction_in_entryRuleSendSerialPortMsgAction9218);
            iv_ruleSendSerialPortMsgAction=ruleSendSerialPortMsgAction();

            state._fsp--;

             current =iv_ruleSendSerialPortMsgAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSendSerialPortMsgAction9228); 

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
    // $ANTLR end "entryRuleSendSerialPortMsgAction"


    // $ANTLR start "ruleSendSerialPortMsgAction"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4129:1: ruleSendSerialPortMsgAction returns [EObject current=null] : (otherlv_0= 'SendSerialPortMsgAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' ) ;
    public final EObject ruleSendSerialPortMsgAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4132:28: ( (otherlv_0= 'SendSerialPortMsgAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4133:1: (otherlv_0= 'SendSerialPortMsgAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4133:1: (otherlv_0= 'SendSerialPortMsgAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}' )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4133:3: otherlv_0= 'SendSerialPortMsgAction' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionalAction ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleSendSerialPortMsgAction9265); 

                	newLeafNode(otherlv_0, grammarAccess.getSendSerialPortMsgActionAccess().getSendSerialPortMsgActionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSendSerialPortMsgAction9277); 

                	newLeafNode(otherlv_1, grammarAccess.getSendSerialPortMsgActionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleSendSerialPortMsgAction9289); 

                	newLeafNode(otherlv_2, grammarAccess.getSendSerialPortMsgActionAccess().getConditionKeyword_2());
                
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4145:1: ( (lv_condition_3_0= ruleConditionalAction ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4146:1: (lv_condition_3_0= ruleConditionalAction )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4146:1: (lv_condition_3_0= ruleConditionalAction )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4147:3: lv_condition_3_0= ruleConditionalAction
            {
             
            	        newCompositeNode(grammarAccess.getSendSerialPortMsgActionAccess().getConditionConditionalActionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_ruleSendSerialPortMsgAction9310);
            lv_condition_3_0=ruleConditionalAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSendSerialPortMsgActionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_3_0, 
                    		"ConditionalAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSendSerialPortMsgAction9322); 

                	newLeafNode(otherlv_4, grammarAccess.getSendSerialPortMsgActionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSendSerialPortMsgAction"


    // $ANTLR start "entryRuleELong"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4175:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4176:2: (iv_ruleELong= ruleELong EOF )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4177:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_entryRuleELong9359);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleELong9370); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4184:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4187:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4188:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4188:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4188:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4188:2: (kw= '-' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==17) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4189:2: kw= '-'
                    {
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleELong9409); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleELong9426); 

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


    // $ANTLR start "rulePosition"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4209:1: rulePosition returns [Enumerator current=null] : ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) ) ;
    public final Enumerator rulePosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4211:28: ( ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4212:1: ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4212:1: ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==76) ) {
                alt105=1;
            }
            else if ( (LA105_0==77) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4212:2: (enumLiteral_0= 'mobile' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4212:2: (enumLiteral_0= 'mobile' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4212:4: enumLiteral_0= 'mobile'
                    {
                    enumLiteral_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_rulePosition9485); 

                            current = grammarAccess.getPositionAccess().getMobileEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPositionAccess().getMobileEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4218:6: (enumLiteral_1= 'static' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4218:6: (enumLiteral_1= 'static' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4218:8: enumLiteral_1= 'static'
                    {
                    enumLiteral_1=(Token)match(input,77,FollowSets000.FOLLOW_77_in_rulePosition9502); 

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


    // $ANTLR start "ruleInterNodeComm"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4228:1: ruleInterNodeComm returns [Enumerator current=null] : ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) ) ;
    public final Enumerator ruleInterNodeComm() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4230:28: ( ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4231:1: ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4231:1: ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) )
            int alt106=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt106=1;
                }
                break;
            case 79:
                {
                alt106=2;
                }
                break;
            case 80:
                {
                alt106=3;
                }
                break;
            case 81:
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
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4231:2: (enumLiteral_0= 'BT' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4231:2: (enumLiteral_0= 'BT' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4231:4: enumLiteral_0= 'BT'
                    {
                    enumLiteral_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleInterNodeComm9547); 

                            current = grammarAccess.getInterNodeCommAccess().getBTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInterNodeCommAccess().getBTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4237:6: (enumLiteral_1= 'Zigbee' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4237:6: (enumLiteral_1= 'Zigbee' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4237:8: enumLiteral_1= 'Zigbee'
                    {
                    enumLiteral_1=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleInterNodeComm9564); 

                            current = grammarAccess.getInterNodeCommAccess().getZigbeeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInterNodeCommAccess().getZigbeeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4243:6: (enumLiteral_2= 'WLan' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4243:6: (enumLiteral_2= 'WLan' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4243:8: enumLiteral_2= 'WLan'
                    {
                    enumLiteral_2=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleInterNodeComm9581); 

                            current = grammarAccess.getInterNodeCommAccess().getWLanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getInterNodeCommAccess().getWLanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4249:6: (enumLiteral_3= 'RF' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4249:6: (enumLiteral_3= 'RF' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4249:8: enumLiteral_3= 'RF'
                    {
                    enumLiteral_3=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleInterNodeComm9598); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4259:1: ruleRoutingProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) | (enumLiteral_16= 'ctp' ) | (enumLiteral_17= 'dismentation' ) | (enumLiteral_18= 'activeMessage' ) ) ;
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
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4261:28: ( ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) | (enumLiteral_16= 'ctp' ) | (enumLiteral_17= 'dismentation' ) | (enumLiteral_18= 'activeMessage' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4262:1: ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) | (enumLiteral_16= 'ctp' ) | (enumLiteral_17= 'dismentation' ) | (enumLiteral_18= 'activeMessage' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4262:1: ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) | (enumLiteral_16= 'ctp' ) | (enumLiteral_17= 'dismentation' ) | (enumLiteral_18= 'activeMessage' ) )
            int alt107=19;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt107=1;
                }
                break;
            case 83:
                {
                alt107=2;
                }
                break;
            case 84:
                {
                alt107=3;
                }
                break;
            case 85:
                {
                alt107=4;
                }
                break;
            case 86:
                {
                alt107=5;
                }
                break;
            case 87:
                {
                alt107=6;
                }
                break;
            case 88:
                {
                alt107=7;
                }
                break;
            case 89:
                {
                alt107=8;
                }
                break;
            case 90:
                {
                alt107=9;
                }
                break;
            case 91:
                {
                alt107=10;
                }
                break;
            case 92:
                {
                alt107=11;
                }
                break;
            case 93:
                {
                alt107=12;
                }
                break;
            case 94:
                {
                alt107=13;
                }
                break;
            case 95:
                {
                alt107=14;
                }
                break;
            case 96:
                {
                alt107=15;
                }
                break;
            case 97:
                {
                alt107=16;
                }
                break;
            case 98:
                {
                alt107=17;
                }
                break;
            case 99:
                {
                alt107=18;
                }
                break;
            case 100:
                {
                alt107=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4262:2: (enumLiteral_0= 'leach' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4262:2: (enumLiteral_0= 'leach' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4262:4: enumLiteral_0= 'leach'
                    {
                    enumLiteral_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleRoutingProtocol9643); 

                            current = grammarAccess.getRoutingProtocolAccess().getLeachEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoutingProtocolAccess().getLeachEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4268:6: (enumLiteral_1= 'lqrp' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4268:6: (enumLiteral_1= 'lqrp' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4268:8: enumLiteral_1= 'lqrp'
                    {
                    enumLiteral_1=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleRoutingProtocol9660); 

                            current = grammarAccess.getRoutingProtocolAccess().getLqrpEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRoutingProtocolAccess().getLqrpEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4274:6: (enumLiteral_2= 'spin' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4274:6: (enumLiteral_2= 'spin' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4274:8: enumLiteral_2= 'spin'
                    {
                    enumLiteral_2=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleRoutingProtocol9677); 

                            current = grammarAccess.getRoutingProtocolAccess().getSpinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRoutingProtocolAccess().getSpinEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4280:6: (enumLiteral_3= 'aodv' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4280:6: (enumLiteral_3= 'aodv' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4280:8: enumLiteral_3= 'aodv'
                    {
                    enumLiteral_3=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleRoutingProtocol9694); 

                            current = grammarAccess.getRoutingProtocolAccess().getAodvEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRoutingProtocolAccess().getAodvEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4286:6: (enumLiteral_4= 'dodv' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4286:6: (enumLiteral_4= 'dodv' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4286:8: enumLiteral_4= 'dodv'
                    {
                    enumLiteral_4=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleRoutingProtocol9711); 

                            current = grammarAccess.getRoutingProtocolAccess().getDodvEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getRoutingProtocolAccess().getDodvEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4292:6: (enumLiteral_5= 'dsr' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4292:6: (enumLiteral_5= 'dsr' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4292:8: enumLiteral_5= 'dsr'
                    {
                    enumLiteral_5=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleRoutingProtocol9728); 

                            current = grammarAccess.getRoutingProtocolAccess().getDsrEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getRoutingProtocolAccess().getDsrEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4298:6: (enumLiteral_6= 'dsdv' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4298:6: (enumLiteral_6= 'dsdv' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4298:8: enumLiteral_6= 'dsdv'
                    {
                    enumLiteral_6=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleRoutingProtocol9745); 

                            current = grammarAccess.getRoutingProtocolAccess().getDsdvEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getRoutingProtocolAccess().getDsdvEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4304:6: (enumLiteral_7= 'gsr' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4304:6: (enumLiteral_7= 'gsr' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4304:8: enumLiteral_7= 'gsr'
                    {
                    enumLiteral_7=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleRoutingProtocol9762); 

                            current = grammarAccess.getRoutingProtocolAccess().getGsrEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getRoutingProtocolAccess().getGsrEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4310:6: (enumLiteral_8= 'heed' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4310:6: (enumLiteral_8= 'heed' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4310:8: enumLiteral_8= 'heed'
                    {
                    enumLiteral_8=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleRoutingProtocol9779); 

                            current = grammarAccess.getRoutingProtocolAccess().getHeedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getRoutingProtocolAccess().getHeedEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4316:6: (enumLiteral_9= 'gaf' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4316:6: (enumLiteral_9= 'gaf' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4316:8: enumLiteral_9= 'gaf'
                    {
                    enumLiteral_9=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleRoutingProtocol9796); 

                            current = grammarAccess.getRoutingProtocolAccess().getGafEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getRoutingProtocolAccess().getGafEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4322:6: (enumLiteral_10= 'gear' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4322:6: (enumLiteral_10= 'gear' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4322:8: enumLiteral_10= 'gear'
                    {
                    enumLiteral_10=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleRoutingProtocol9813); 

                            current = grammarAccess.getRoutingProtocolAccess().getGearEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getRoutingProtocolAccess().getGearEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4328:6: (enumLiteral_11= 'tbf' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4328:6: (enumLiteral_11= 'tbf' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4328:8: enumLiteral_11= 'tbf'
                    {
                    enumLiteral_11=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleRoutingProtocol9830); 

                            current = grammarAccess.getRoutingProtocolAccess().getTbfEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getRoutingProtocolAccess().getTbfEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4334:6: (enumLiteral_12= 'ead' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4334:6: (enumLiteral_12= 'ead' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4334:8: enumLiteral_12= 'ead'
                    {
                    enumLiteral_12=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleRoutingProtocol9847); 

                            current = grammarAccess.getRoutingProtocolAccess().getEadEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getRoutingProtocolAccess().getEadEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4340:6: (enumLiteral_13= 'pegasis' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4340:6: (enumLiteral_13= 'pegasis' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4340:8: enumLiteral_13= 'pegasis'
                    {
                    enumLiteral_13=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleRoutingProtocol9864); 

                            current = grammarAccess.getRoutingProtocolAccess().getPegasisEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getRoutingProtocolAccess().getPegasisEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4346:6: (enumLiteral_14= 'teen' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4346:6: (enumLiteral_14= 'teen' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4346:8: enumLiteral_14= 'teen'
                    {
                    enumLiteral_14=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleRoutingProtocol9881); 

                            current = grammarAccess.getRoutingProtocolAccess().getTeenEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getRoutingProtocolAccess().getTeenEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4352:6: (enumLiteral_15= 'speed' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4352:6: (enumLiteral_15= 'speed' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4352:8: enumLiteral_15= 'speed'
                    {
                    enumLiteral_15=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleRoutingProtocol9898); 

                            current = grammarAccess.getRoutingProtocolAccess().getSpeedEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getRoutingProtocolAccess().getSpeedEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4358:6: (enumLiteral_16= 'ctp' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4358:6: (enumLiteral_16= 'ctp' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4358:8: enumLiteral_16= 'ctp'
                    {
                    enumLiteral_16=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleRoutingProtocol9915); 

                            current = grammarAccess.getRoutingProtocolAccess().getCtpEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getRoutingProtocolAccess().getCtpEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4364:6: (enumLiteral_17= 'dismentation' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4364:6: (enumLiteral_17= 'dismentation' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4364:8: enumLiteral_17= 'dismentation'
                    {
                    enumLiteral_17=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleRoutingProtocol9932); 

                            current = grammarAccess.getRoutingProtocolAccess().getDismentationEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getRoutingProtocolAccess().getDismentationEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4370:6: (enumLiteral_18= 'activeMessage' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4370:6: (enumLiteral_18= 'activeMessage' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4370:8: enumLiteral_18= 'activeMessage'
                    {
                    enumLiteral_18=(Token)match(input,100,FollowSets000.FOLLOW_100_in_ruleRoutingProtocol9949); 

                            current = grammarAccess.getRoutingProtocolAccess().getActiveMessageEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getRoutingProtocolAccess().getActiveMessageEnumLiteralDeclaration_18()); 
                        

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


    // $ANTLR start "ruleLogicalSymbol"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4380:1: ruleLogicalSymbol returns [Enumerator current=null] : ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'notEqual' ) ) ;
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
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4382:28: ( ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'notEqual' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4383:1: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'notEqual' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4383:1: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'notEqual' ) )
            int alt108=6;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt108=1;
                }
                break;
            case 102:
                {
                alt108=2;
                }
                break;
            case 103:
                {
                alt108=3;
                }
                break;
            case 104:
                {
                alt108=4;
                }
                break;
            case 105:
                {
                alt108=5;
                }
                break;
            case 106:
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
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4383:2: (enumLiteral_0= 'equal' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4383:2: (enumLiteral_0= 'equal' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4383:4: enumLiteral_0= 'equal'
                    {
                    enumLiteral_0=(Token)match(input,101,FollowSets000.FOLLOW_101_in_ruleLogicalSymbol9994); 

                            current = grammarAccess.getLogicalSymbolAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalSymbolAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4389:6: (enumLiteral_1= 'greaterThan' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4389:6: (enumLiteral_1= 'greaterThan' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4389:8: enumLiteral_1= 'greaterThan'
                    {
                    enumLiteral_1=(Token)match(input,102,FollowSets000.FOLLOW_102_in_ruleLogicalSymbol10011); 

                            current = grammarAccess.getLogicalSymbolAccess().getGreaterThanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLogicalSymbolAccess().getGreaterThanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4395:6: (enumLiteral_2= 'greaterOrEqualThan' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4395:6: (enumLiteral_2= 'greaterOrEqualThan' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4395:8: enumLiteral_2= 'greaterOrEqualThan'
                    {
                    enumLiteral_2=(Token)match(input,103,FollowSets000.FOLLOW_103_in_ruleLogicalSymbol10028); 

                            current = grammarAccess.getLogicalSymbolAccess().getGreaterOrEqualThanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLogicalSymbolAccess().getGreaterOrEqualThanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4401:6: (enumLiteral_3= 'lessThan' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4401:6: (enumLiteral_3= 'lessThan' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4401:8: enumLiteral_3= 'lessThan'
                    {
                    enumLiteral_3=(Token)match(input,104,FollowSets000.FOLLOW_104_in_ruleLogicalSymbol10045); 

                            current = grammarAccess.getLogicalSymbolAccess().getLessThanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLogicalSymbolAccess().getLessThanEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4407:6: (enumLiteral_4= 'lessOrEqualThan' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4407:6: (enumLiteral_4= 'lessOrEqualThan' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4407:8: enumLiteral_4= 'lessOrEqualThan'
                    {
                    enumLiteral_4=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleLogicalSymbol10062); 

                            current = grammarAccess.getLogicalSymbolAccess().getLessOrEqualThanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getLogicalSymbolAccess().getLessOrEqualThanEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4413:6: (enumLiteral_5= 'notEqual' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4413:6: (enumLiteral_5= 'notEqual' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4413:8: enumLiteral_5= 'notEqual'
                    {
                    enumLiteral_5=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleLogicalSymbol10079); 

                            current = grammarAccess.getLogicalSymbolAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getLogicalSymbolAccess().getNotEqualEnumLiteralDeclaration_5()); 
                        

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


    // $ANTLR start "ruleLeds"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4423:1: ruleLeds returns [Enumerator current=null] : ( (enumLiteral_0= 'led0' ) | (enumLiteral_1= 'led1' ) | (enumLiteral_2= 'led2' ) ) ;
    public final Enumerator ruleLeds() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4425:28: ( ( (enumLiteral_0= 'led0' ) | (enumLiteral_1= 'led1' ) | (enumLiteral_2= 'led2' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4426:1: ( (enumLiteral_0= 'led0' ) | (enumLiteral_1= 'led1' ) | (enumLiteral_2= 'led2' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4426:1: ( (enumLiteral_0= 'led0' ) | (enumLiteral_1= 'led1' ) | (enumLiteral_2= 'led2' ) )
            int alt109=3;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt109=1;
                }
                break;
            case 108:
                {
                alt109=2;
                }
                break;
            case 109:
                {
                alt109=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4426:2: (enumLiteral_0= 'led0' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4426:2: (enumLiteral_0= 'led0' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4426:4: enumLiteral_0= 'led0'
                    {
                    enumLiteral_0=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleLeds10124); 

                            current = grammarAccess.getLedsAccess().getLed0EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLedsAccess().getLed0EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4432:6: (enumLiteral_1= 'led1' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4432:6: (enumLiteral_1= 'led1' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4432:8: enumLiteral_1= 'led1'
                    {
                    enumLiteral_1=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleLeds10141); 

                            current = grammarAccess.getLedsAccess().getLed1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLedsAccess().getLed1EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4438:6: (enumLiteral_2= 'led2' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4438:6: (enumLiteral_2= 'led2' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4438:8: enumLiteral_2= 'led2'
                    {
                    enumLiteral_2=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleLeds10158); 

                            current = grammarAccess.getLedsAccess().getLed2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLedsAccess().getLed2EnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleLeds"


    // $ANTLR start "ruleLedStatus"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4448:1: ruleLedStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) | (enumLiteral_2= 'toggle' ) ) ;
    public final Enumerator ruleLedStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4450:28: ( ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) | (enumLiteral_2= 'toggle' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4451:1: ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) | (enumLiteral_2= 'toggle' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4451:1: ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) | (enumLiteral_2= 'toggle' ) )
            int alt110=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt110=1;
                }
                break;
            case 111:
                {
                alt110=2;
                }
                break;
            case 112:
                {
                alt110=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4451:2: (enumLiteral_0= 'on' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4451:2: (enumLiteral_0= 'on' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4451:4: enumLiteral_0= 'on'
                    {
                    enumLiteral_0=(Token)match(input,110,FollowSets000.FOLLOW_110_in_ruleLedStatus10203); 

                            current = grammarAccess.getLedStatusAccess().getOnEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLedStatusAccess().getOnEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4457:6: (enumLiteral_1= 'off' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4457:6: (enumLiteral_1= 'off' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4457:8: enumLiteral_1= 'off'
                    {
                    enumLiteral_1=(Token)match(input,111,FollowSets000.FOLLOW_111_in_ruleLedStatus10220); 

                            current = grammarAccess.getLedStatusAccess().getOffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLedStatusAccess().getOffEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4463:6: (enumLiteral_2= 'toggle' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4463:6: (enumLiteral_2= 'toggle' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4463:8: enumLiteral_2= 'toggle'
                    {
                    enumLiteral_2=(Token)match(input,112,FollowSets000.FOLLOW_112_in_ruleLedStatus10237); 

                            current = grammarAccess.getLedStatusAccess().getToggleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLedStatusAccess().getToggleEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleLedStatus"


    // $ANTLR start "ruleAggregation"
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4473:1: ruleAggregation returns [Enumerator current=null] : ( (enumLiteral_0= 'filtering' ) | (enumLiteral_1= 'compression' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'avg' ) | (enumLiteral_5= 'count' ) ) ;
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
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4475:28: ( ( (enumLiteral_0= 'filtering' ) | (enumLiteral_1= 'compression' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'avg' ) | (enumLiteral_5= 'count' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4476:1: ( (enumLiteral_0= 'filtering' ) | (enumLiteral_1= 'compression' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'avg' ) | (enumLiteral_5= 'count' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4476:1: ( (enumLiteral_0= 'filtering' ) | (enumLiteral_1= 'compression' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'avg' ) | (enumLiteral_5= 'count' ) )
            int alt111=6;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt111=1;
                }
                break;
            case 114:
                {
                alt111=2;
                }
                break;
            case 115:
                {
                alt111=3;
                }
                break;
            case 116:
                {
                alt111=4;
                }
                break;
            case 117:
                {
                alt111=5;
                }
                break;
            case 118:
                {
                alt111=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4476:2: (enumLiteral_0= 'filtering' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4476:2: (enumLiteral_0= 'filtering' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4476:4: enumLiteral_0= 'filtering'
                    {
                    enumLiteral_0=(Token)match(input,113,FollowSets000.FOLLOW_113_in_ruleAggregation10282); 

                            current = grammarAccess.getAggregationAccess().getFilteringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAggregationAccess().getFilteringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4482:6: (enumLiteral_1= 'compression' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4482:6: (enumLiteral_1= 'compression' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4482:8: enumLiteral_1= 'compression'
                    {
                    enumLiteral_1=(Token)match(input,114,FollowSets000.FOLLOW_114_in_ruleAggregation10299); 

                            current = grammarAccess.getAggregationAccess().getCompressionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAggregationAccess().getCompressionEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4488:6: (enumLiteral_2= 'max' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4488:6: (enumLiteral_2= 'max' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4488:8: enumLiteral_2= 'max'
                    {
                    enumLiteral_2=(Token)match(input,115,FollowSets000.FOLLOW_115_in_ruleAggregation10316); 

                            current = grammarAccess.getAggregationAccess().getMaxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAggregationAccess().getMaxEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4494:6: (enumLiteral_3= 'min' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4494:6: (enumLiteral_3= 'min' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4494:8: enumLiteral_3= 'min'
                    {
                    enumLiteral_3=(Token)match(input,116,FollowSets000.FOLLOW_116_in_ruleAggregation10333); 

                            current = grammarAccess.getAggregationAccess().getMinEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAggregationAccess().getMinEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4500:6: (enumLiteral_4= 'avg' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4500:6: (enumLiteral_4= 'avg' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4500:8: enumLiteral_4= 'avg'
                    {
                    enumLiteral_4=(Token)match(input,117,FollowSets000.FOLLOW_117_in_ruleAggregation10350); 

                            current = grammarAccess.getAggregationAccess().getAvgEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAggregationAccess().getAvgEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4506:6: (enumLiteral_5= 'count' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4506:6: (enumLiteral_5= 'count' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4506:8: enumLiteral_5= 'count'
                    {
                    enumLiteral_5=(Token)match(input,118,FollowSets000.FOLLOW_118_in_ruleAggregation10367); 

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
    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4516:1: ruleFusion returns [Enumerator current=null] : ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) ) ;
    public final Enumerator ruleFusion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4518:28: ( ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) ) )
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4519:1: ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) )
            {
            // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4519:1: ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) )
            int alt112=4;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt112=1;
                }
                break;
            case 120:
                {
                alt112=2;
                }
                break;
            case 121:
                {
                alt112=3;
                }
                break;
            case 122:
                {
                alt112=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4519:2: (enumLiteral_0= 'classification' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4519:2: (enumLiteral_0= 'classification' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4519:4: enumLiteral_0= 'classification'
                    {
                    enumLiteral_0=(Token)match(input,119,FollowSets000.FOLLOW_119_in_ruleFusion10412); 

                            current = grammarAccess.getFusionAccess().getClassificationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFusionAccess().getClassificationEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4525:6: (enumLiteral_1= 'event_detection' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4525:6: (enumLiteral_1= 'event_detection' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4525:8: enumLiteral_1= 'event_detection'
                    {
                    enumLiteral_1=(Token)match(input,120,FollowSets000.FOLLOW_120_in_ruleFusion10429); 

                            current = grammarAccess.getFusionAccess().getEvent_detectionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFusionAccess().getEvent_detectionEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4531:6: (enumLiteral_2= 'tracking' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4531:6: (enumLiteral_2= 'tracking' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4531:8: enumLiteral_2= 'tracking'
                    {
                    enumLiteral_2=(Token)match(input,121,FollowSets000.FOLLOW_121_in_ruleFusion10446); 

                            current = grammarAccess.getFusionAccess().getTrackingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFusionAccess().getTrackingEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4537:6: (enumLiteral_3= 'decision_making' )
                    {
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4537:6: (enumLiteral_3= 'decision_making' )
                    // ../org.nader.sennet.xtext/src-gen/org/nader/sennet/xtext/parser/antlr/internal/InternalDsl.g:4537:8: enumLiteral_3= 'decision_making'
                    {
                    enumLiteral_3=(Token)match(input,122,FollowSets000.FOLLOW_122_in_ruleFusion10463); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSeNetApp_in_entryRuleSeNetApp75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSeNetApp85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSeNetApp131 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSeNetApp152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSeNetApp164 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_13_in_ruleSeNetApp177 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSeNetApp198 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_14_in_ruleSeNetApp213 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSeNetApp225 = new BitSet(new long[]{0x0000000075040000L});
        public static final BitSet FOLLOW_ruleAbstractJob_in_ruleSeNetApp246 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSeNetApp259 = new BitSet(new long[]{0x0000000075040000L});
        public static final BitSet FOLLOW_ruleAbstractJob_in_ruleSeNetApp280 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSeNetApp294 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSeNetApp308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractJob_in_entryRuleAbstractJob344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractJob354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSenseForwardJob_in_ruleAbstractJob401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAggregationJob_in_ruleAbstractJob428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFusionJob_in_ruleAbstractJob455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSenseNowJob_in_ruleAbstractJob482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSinkJob_in_ruleAbstractJob509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegularSenseJob_in_ruleAbstractJob536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorNode_in_ruleAbstractNode628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusterHeadNode_in_ruleAbstractNode655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSinkNode_in_ruleAbstractNode682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputationNode_in_ruleAbstractNode709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_entryRuleAbstractNetwork744 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNetwork754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlatNetwork_in_ruleAbstractNetwork801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusteredNetwork_in_ruleAbstractNetwork828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_entryRuleAbstractStartEndingJobTrigger863 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractStartEndingJobTrigger873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReceiveMessageTrigger_in_ruleAbstractStartEndingJobTrigger920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecieveSerialMsgTrigger_in_ruleAbstractStartEndingJobTrigger947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStartJobTrigger_Impl_in_ruleAbstractStartEndingJobTrigger974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStopJobTrigger_Impl_in_ruleAbstractStartEndingJobTrigger1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePushButtomTrigger_in_ruleAbstractStartEndingJobTrigger1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_entryRuleAbstratAction1063 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstratAction1073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReadNodeMemoryAction_in_ruleAbstratAction1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWriteNodeMemoryAction_in_ruleAbstratAction1147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSendMessageAction_in_ruleAbstratAction1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlinkAction_in_ruleAbstratAction1201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSendSerialPortMsgAction_in_ruleAbstratAction1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_entryRuleAbstractSensor1263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSensor1273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccelerometerSensor_in_ruleAbstractSensor1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_ruleAbstractSensor1347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationSensor_in_ruleAbstractSensor1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMicrophoneSensor_in_ruleAbstractSensor1401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_ruleAbstractSensor1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_ruleAbstractSensor1455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_ruleAbstractSensor1482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVoltageSensor_in_ruleAbstractSensor1509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractFlatNode_in_entryRuleAbstractFlatNode1544 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFlatNode1554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorNode_in_ruleAbstractFlatNode1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputationNode_in_ruleAbstractFlatNode1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractClusterNode_in_entryRuleAbstractClusterNode1663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractClusterNode1673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorNode_in_ruleAbstractClusterNode1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusterHeadNode_in_ruleAbstractClusterNode1747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleEInt1833 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSenseForwardJob_in_entryRuleSenseForwardJob2018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSenseForwardJob2028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSenseForwardJob2074 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseForwardJob2086 = new BitSet(new long[]{0x0000000000F92000L});
        public static final BitSet FOLLOW_13_in_ruleSenseForwardJob2099 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSenseForwardJob2120 = new BitSet(new long[]{0x0000000000F90000L});
        public static final BitSet FOLLOW_19_in_ruleSenseForwardJob2135 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleSenseForwardJob2156 = new BitSet(new long[]{0x0000000000F10000L});
        public static final BitSet FOLLOW_20_in_ruleSenseForwardJob2171 = new BitSet(new long[]{0x0000001C80000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleSenseForwardJob2192 = new BitSet(new long[]{0x0000000000E10000L});
        public static final BitSet FOLLOW_21_in_ruleSenseForwardJob2207 = new BitSet(new long[]{0x0010200000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleSenseForwardJob2228 = new BitSet(new long[]{0x0000000000C10000L});
        public static final BitSet FOLLOW_22_in_ruleSenseForwardJob2243 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseForwardJob2255 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseForwardJob2276 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSenseForwardJob2289 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseForwardJob2310 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSenseForwardJob2324 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleSenseForwardJob2339 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseForwardJob2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSenseForwardJob2372 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSenseForwardJob2385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSenseForwardJob2406 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSenseForwardJob2420 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSenseForwardJob2434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAggregationJob_in_entryRuleAggregationJob2470 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAggregationJob2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAggregationJob2526 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAggregationJob2538 = new BitSet(new long[]{0x0000000002F12000L});
        public static final BitSet FOLLOW_13_in_ruleAggregationJob2551 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAggregationJob2572 = new BitSet(new long[]{0x0000000002F10000L});
        public static final BitSet FOLLOW_25_in_ruleAggregationJob2587 = new BitSet(new long[]{0x0000000000000000L,0x007E000000000000L});
        public static final BitSet FOLLOW_ruleAggregation_in_ruleAggregationJob2608 = new BitSet(new long[]{0x0000000000F10000L});
        public static final BitSet FOLLOW_20_in_ruleAggregationJob2623 = new BitSet(new long[]{0x0000001C80000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleAggregationJob2644 = new BitSet(new long[]{0x0000000000E10000L});
        public static final BitSet FOLLOW_21_in_ruleAggregationJob2659 = new BitSet(new long[]{0x0010200000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleAggregationJob2680 = new BitSet(new long[]{0x0000000000C10000L});
        public static final BitSet FOLLOW_22_in_ruleAggregationJob2695 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAggregationJob2707 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleAggregationJob2728 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleAggregationJob2741 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleAggregationJob2762 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleAggregationJob2776 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleAggregationJob2791 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAggregationJob2803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleAggregationJob2824 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleAggregationJob2837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleAggregationJob2858 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleAggregationJob2872 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAggregationJob2886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFusionJob_in_entryRuleFusionJob2922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFusionJob2932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleFusionJob2978 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFusionJob2990 = new BitSet(new long[]{0x0000000008F12000L});
        public static final BitSet FOLLOW_13_in_ruleFusionJob3003 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleFusionJob3024 = new BitSet(new long[]{0x0000000008F10000L});
        public static final BitSet FOLLOW_27_in_ruleFusionJob3039 = new BitSet(new long[]{0x0000000000000000L,0x0780000000000000L});
        public static final BitSet FOLLOW_ruleFusion_in_ruleFusionJob3060 = new BitSet(new long[]{0x0000000000F10000L});
        public static final BitSet FOLLOW_20_in_ruleFusionJob3075 = new BitSet(new long[]{0x0000001C80000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleFusionJob3096 = new BitSet(new long[]{0x0000000000E10000L});
        public static final BitSet FOLLOW_21_in_ruleFusionJob3111 = new BitSet(new long[]{0x0010200000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleFusionJob3132 = new BitSet(new long[]{0x0000000000C10000L});
        public static final BitSet FOLLOW_22_in_ruleFusionJob3147 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFusionJob3159 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleFusionJob3180 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFusionJob3193 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleFusionJob3214 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFusionJob3228 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleFusionJob3243 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFusionJob3255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleFusionJob3276 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFusionJob3289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleFusionJob3310 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFusionJob3324 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFusionJob3338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSenseNowJob_in_entryRuleSenseNowJob3374 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSenseNowJob3384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleSenseNowJob3430 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseNowJob3442 = new BitSet(new long[]{0x0000000000F12000L});
        public static final BitSet FOLLOW_13_in_ruleSenseNowJob3455 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSenseNowJob3476 = new BitSet(new long[]{0x0000000000F10000L});
        public static final BitSet FOLLOW_20_in_ruleSenseNowJob3491 = new BitSet(new long[]{0x0000001C80000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleSenseNowJob3512 = new BitSet(new long[]{0x0000000000E10000L});
        public static final BitSet FOLLOW_21_in_ruleSenseNowJob3527 = new BitSet(new long[]{0x0010200000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleSenseNowJob3548 = new BitSet(new long[]{0x0000000000C10000L});
        public static final BitSet FOLLOW_22_in_ruleSenseNowJob3563 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseNowJob3575 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseNowJob3596 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSenseNowJob3609 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseNowJob3630 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSenseNowJob3644 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleSenseNowJob3659 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseNowJob3671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSenseNowJob3692 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSenseNowJob3705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSenseNowJob3726 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSenseNowJob3740 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSenseNowJob3754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSinkJob_in_entryRuleSinkJob3790 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSinkJob3800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSinkJob3846 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSinkJob3858 = new BitSet(new long[]{0x0000000000F12000L});
        public static final BitSet FOLLOW_13_in_ruleSinkJob3871 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSinkJob3892 = new BitSet(new long[]{0x0000000000F10000L});
        public static final BitSet FOLLOW_20_in_ruleSinkJob3907 = new BitSet(new long[]{0x0000001C80000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleSinkJob3928 = new BitSet(new long[]{0x0000000000E10000L});
        public static final BitSet FOLLOW_21_in_ruleSinkJob3943 = new BitSet(new long[]{0x0010200000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleSinkJob3964 = new BitSet(new long[]{0x0000000000C10000L});
        public static final BitSet FOLLOW_22_in_ruleSinkJob3979 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSinkJob3991 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSinkJob4012 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSinkJob4025 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSinkJob4046 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSinkJob4060 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleSinkJob4075 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSinkJob4087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSinkJob4108 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSinkJob4121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSinkJob4142 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSinkJob4156 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSinkJob4170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegularSenseJob_in_entryRuleRegularSenseJob4206 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegularSenseJob4216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleRegularSenseJob4262 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRegularSenseJob4274 = new BitSet(new long[]{0x0000000000F92000L});
        public static final BitSet FOLLOW_13_in_ruleRegularSenseJob4287 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRegularSenseJob4308 = new BitSet(new long[]{0x0000000000F90000L});
        public static final BitSet FOLLOW_19_in_ruleRegularSenseJob4323 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleRegularSenseJob4344 = new BitSet(new long[]{0x0000000000F10000L});
        public static final BitSet FOLLOW_20_in_ruleRegularSenseJob4359 = new BitSet(new long[]{0x0000001C80000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleRegularSenseJob4380 = new BitSet(new long[]{0x0000000000E10000L});
        public static final BitSet FOLLOW_21_in_ruleRegularSenseJob4395 = new BitSet(new long[]{0x0010200000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleRegularSenseJob4416 = new BitSet(new long[]{0x0000000000C10000L});
        public static final BitSet FOLLOW_22_in_ruleRegularSenseJob4431 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRegularSenseJob4443 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleRegularSenseJob4464 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRegularSenseJob4477 = new BitSet(new long[]{0x3E00000000000000L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleRegularSenseJob4498 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRegularSenseJob4512 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleRegularSenseJob4527 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRegularSenseJob4539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleRegularSenseJob4560 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRegularSenseJob4573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000968L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleRegularSenseJob4594 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRegularSenseJob4608 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRegularSenseJob4622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorNode_in_entryRuleSensorNode4658 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensorNode4668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSensorNode4714 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSensorNode4726 = new BitSet(new long[]{0x0000000300012000L});
        public static final BitSet FOLLOW_13_in_ruleSensorNode4739 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSensorNode4760 = new BitSet(new long[]{0x0000000300010000L});
        public static final BitSet FOLLOW_32_in_ruleSensorNode4775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleSensorNode4796 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_33_in_ruleSensorNode4811 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSensorNode4823 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleSensorNode4844 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSensorNode4857 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleSensorNode4878 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSensorNode4892 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSensorNode4906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusterHeadNode_in_entryRuleClusterHeadNode4942 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClusterHeadNode4952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleClusterHeadNode4998 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusterHeadNode5010 = new BitSet(new long[]{0x0000000300012000L});
        public static final BitSet FOLLOW_13_in_ruleClusterHeadNode5023 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleClusterHeadNode5044 = new BitSet(new long[]{0x0000000300010000L});
        public static final BitSet FOLLOW_32_in_ruleClusterHeadNode5059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleClusterHeadNode5080 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_33_in_ruleClusterHeadNode5095 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusterHeadNode5107 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleClusterHeadNode5128 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleClusterHeadNode5141 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleClusterHeadNode5162 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleClusterHeadNode5176 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleClusterHeadNode5190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSinkNode_in_entryRuleSinkNode5226 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSinkNode5236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleSinkNode5282 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSinkNode5294 = new BitSet(new long[]{0x0000000300012000L});
        public static final BitSet FOLLOW_13_in_ruleSinkNode5307 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSinkNode5328 = new BitSet(new long[]{0x0000000300010000L});
        public static final BitSet FOLLOW_32_in_ruleSinkNode5343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleSinkNode5364 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_33_in_ruleSinkNode5379 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSinkNode5391 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleSinkNode5412 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSinkNode5425 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleSinkNode5446 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSinkNode5460 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSinkNode5474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputationNode_in_entryRuleComputationNode5510 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComputationNode5520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleComputationNode5566 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComputationNode5578 = new BitSet(new long[]{0x0000000300012000L});
        public static final BitSet FOLLOW_13_in_ruleComputationNode5591 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleComputationNode5612 = new BitSet(new long[]{0x0000000300010000L});
        public static final BitSet FOLLOW_32_in_ruleComputationNode5627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleComputationNode5648 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_33_in_ruleComputationNode5663 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComputationNode5675 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleComputationNode5696 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleComputationNode5709 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleComputationNode5730 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleComputationNode5744 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleComputationNode5758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccelerometerSensor_in_entryRuleAccelerometerSensor5794 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccelerometerSensor5804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAccelerometerSensor5850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_entryRuleLightSensor5886 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSensor5896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleLightSensor5942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationSensor_in_entryRuleLocationSensor5978 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocationSensor5988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleLocationSensor6034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMicrophoneSensor_in_entryRuleMicrophoneSensor6070 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMicrophoneSensor6080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleMicrophoneSensor6126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor6162 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperatureSensor6172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleTemperatureSensor6218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_entryRulePressureSensor6254 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePressureSensor6264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rulePressureSensor6310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor6346 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumiditySensor6356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleHumiditySensor6402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVoltageSensor_in_entryRuleVoltageSensor6438 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVoltageSensor6448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleVoltageSensor6494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlatNetwork_in_entryRuleFlatNetwork6530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFlatNetwork6540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleFlatNetwork6577 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlatNetwork6589 = new BitSet(new long[]{0x0007C00000002000L});
        public static final BitSet FOLLOW_13_in_ruleFlatNetwork6602 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleFlatNetwork6623 = new BitSet(new long[]{0x0007C00000000000L});
        public static final BitSet FOLLOW_46_in_ruleFlatNetwork6638 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleFlatNetwork6659 = new BitSet(new long[]{0x0007800000000000L});
        public static final BitSet FOLLOW_47_in_ruleFlatNetwork6674 = new BitSet(new long[]{0x0000000000000000L,0x000000000003C000L});
        public static final BitSet FOLLOW_ruleInterNodeComm_in_ruleFlatNetwork6695 = new BitSet(new long[]{0x0007000000000000L});
        public static final BitSet FOLLOW_48_in_ruleFlatNetwork6710 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFFFC0000L});
        public static final BitSet FOLLOW_ruleRoutingProtocol_in_ruleFlatNetwork6731 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_49_in_ruleFlatNetwork6746 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlatNetwork6758 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork6779 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFlatNetwork6792 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork6813 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFlatNetwork6827 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleFlatNetwork6841 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleSinkNode_in_ruleFlatNetwork6862 = new BitSet(new long[]{0x0008000000010000L});
        public static final BitSet FOLLOW_51_in_ruleFlatNetwork6875 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlatNetwork6887 = new BitSet(new long[]{0x0000001C80000000L});
        public static final BitSet FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork6908 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFlatNetwork6921 = new BitSet(new long[]{0x0000001C80000000L});
        public static final BitSet FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork6942 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFlatNetwork6956 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFlatNetwork6970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusteredNetwork_in_entryRuleClusteredNetwork7006 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClusteredNetwork7016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleClusteredNetwork7053 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusteredNetwork7065 = new BitSet(new long[]{0x0007C00000002000L});
        public static final BitSet FOLLOW_13_in_ruleClusteredNetwork7078 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleClusteredNetwork7099 = new BitSet(new long[]{0x0007C00000000000L});
        public static final BitSet FOLLOW_46_in_ruleClusteredNetwork7114 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleClusteredNetwork7135 = new BitSet(new long[]{0x0007800000000000L});
        public static final BitSet FOLLOW_47_in_ruleClusteredNetwork7150 = new BitSet(new long[]{0x0000000000000000L,0x000000000003C000L});
        public static final BitSet FOLLOW_ruleInterNodeComm_in_ruleClusteredNetwork7171 = new BitSet(new long[]{0x0007000000000000L});
        public static final BitSet FOLLOW_48_in_ruleClusteredNetwork7186 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFFFC0000L});
        public static final BitSet FOLLOW_ruleRoutingProtocol_in_ruleClusteredNetwork7207 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_49_in_ruleClusteredNetwork7222 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusteredNetwork7234 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork7255 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleClusteredNetwork7268 = new BitSet(new long[]{0x00001FE000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork7289 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleClusteredNetwork7303 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleClusteredNetwork7317 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleSinkNode_in_ruleClusteredNetwork7338 = new BitSet(new long[]{0x0020000000010000L});
        public static final BitSet FOLLOW_53_in_ruleClusteredNetwork7351 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusteredNetwork7363 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_ruleCluster_in_ruleClusteredNetwork7384 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleClusteredNetwork7397 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_ruleCluster_in_ruleClusteredNetwork7418 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleClusteredNetwork7432 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleClusteredNetwork7446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCluster_in_entryRuleCluster7482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCluster7492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleCluster7538 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCluster7550 = new BitSet(new long[]{0x000A000000012000L});
        public static final BitSet FOLLOW_13_in_ruleCluster7563 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCluster7584 = new BitSet(new long[]{0x000A000000010000L});
        public static final BitSet FOLLOW_49_in_ruleCluster7599 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleCluster7611 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCluster7634 = new BitSet(new long[]{0x0100000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCluster7647 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCluster7670 = new BitSet(new long[]{0x0100000000008000L});
        public static final BitSet FOLLOW_56_in_ruleCluster7684 = new BitSet(new long[]{0x0008000000010000L});
        public static final BitSet FOLLOW_51_in_ruleCluster7699 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCluster7711 = new BitSet(new long[]{0x0000000480000000L});
        public static final BitSet FOLLOW_ruleAbstractClusterNode_in_ruleCluster7732 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleCluster7745 = new BitSet(new long[]{0x0000000480000000L});
        public static final BitSet FOLLOW_ruleAbstractClusterNode_in_ruleCluster7766 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleCluster7780 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCluster7794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReceiveMessageTrigger_in_entryRuleReceiveMessageTrigger7830 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReceiveMessageTrigger7840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleReceiveMessageTrigger7886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecieveSerialMsgTrigger_in_entryRuleRecieveSerialMsgTrigger7922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecieveSerialMsgTrigger7932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleRecieveSerialMsgTrigger7978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStartJobTrigger_Impl_in_entryRuleStartJobTrigger_Impl8014 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStartJobTrigger_Impl8024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleStartJobTrigger_Impl8070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStopJobTrigger_Impl_in_entryRuleStopJobTrigger_Impl8106 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStopJobTrigger_Impl8116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleStopJobTrigger_Impl8162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePushButtomTrigger_in_entryRulePushButtomTrigger8198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePushButtomTrigger8208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rulePushButtomTrigger8254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_entryRuleConditionalAction8290 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAction8300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleConditionalAction8346 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConditionalAction8358 = new BitSet(new long[]{0x8000000000010000L,0x0000000000000007L});
        public static final BitSet FOLLOW_63_in_ruleConditionalAction8371 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConditionalAction8392 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000007L});
        public static final BitSet FOLLOW_64_in_ruleConditionalAction8407 = new BitSet(new long[]{0x0000000000000000L,0x000007E000000000L});
        public static final BitSet FOLLOW_ruleLogicalSymbol_in_ruleConditionalAction8428 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000006L});
        public static final BitSet FOLLOW_65_in_ruleConditionalAction8443 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleConditionalAction8464 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleConditionalAction8479 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConditionalAction8500 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConditionalAction8514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReadNodeMemoryAction_in_entryRuleReadNodeMemoryAction8550 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReadNodeMemoryAction8560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleReadNodeMemoryAction8597 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleReadNodeMemoryAction8609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleReadNodeMemoryAction8621 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_ruleReadNodeMemoryAction8642 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleReadNodeMemoryAction8654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWriteNodeMemoryAction_in_entryRuleWriteNodeMemoryAction8690 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWriteNodeMemoryAction8700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleWriteNodeMemoryAction8737 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWriteNodeMemoryAction8749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleWriteNodeMemoryAction8761 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_ruleWriteNodeMemoryAction8782 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleWriteNodeMemoryAction8794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSendMessageAction_in_entryRuleSendMessageAction8830 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSendMessageAction8840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleSendMessageAction8877 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSendMessageAction8889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
        public static final BitSet FOLLOW_71_in_ruleSendMessageAction8902 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSendMessageAction8923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleSendMessageAction8937 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_ruleSendMessageAction8958 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSendMessageAction8970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlinkAction_in_entryRuleBlinkAction9006 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlinkAction9016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleBlinkAction9053 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBlinkAction9065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000610L});
        public static final BitSet FOLLOW_73_in_ruleBlinkAction9078 = new BitSet(new long[]{0x0000000000000000L,0x0000380000000000L});
        public static final BitSet FOLLOW_ruleLeds_in_ruleBlinkAction9099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000410L});
        public static final BitSet FOLLOW_74_in_ruleBlinkAction9114 = new BitSet(new long[]{0x0000000000000000L,0x0001C00000000000L});
        public static final BitSet FOLLOW_ruleLedStatus_in_ruleBlinkAction9135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleBlinkAction9149 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_ruleBlinkAction9170 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBlinkAction9182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSendSerialPortMsgAction_in_entryRuleSendSerialPortMsgAction9218 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSendSerialPortMsgAction9228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleSendSerialPortMsgAction9265 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSendSerialPortMsgAction9277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleSendSerialPortMsgAction9289 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_ruleSendSerialPortMsgAction9310 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSendSerialPortMsgAction9322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_entryRuleELong9359 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleELong9370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleELong9409 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleELong9426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_rulePosition9485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_rulePosition9502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleInterNodeComm9547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleInterNodeComm9564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleInterNodeComm9581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleInterNodeComm9598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleRoutingProtocol9643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleRoutingProtocol9660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleRoutingProtocol9677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleRoutingProtocol9694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleRoutingProtocol9711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleRoutingProtocol9728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleRoutingProtocol9745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleRoutingProtocol9762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleRoutingProtocol9779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleRoutingProtocol9796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleRoutingProtocol9813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_ruleRoutingProtocol9830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleRoutingProtocol9847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_ruleRoutingProtocol9864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_ruleRoutingProtocol9881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_97_in_ruleRoutingProtocol9898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_ruleRoutingProtocol9915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_99_in_ruleRoutingProtocol9932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_ruleRoutingProtocol9949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_101_in_ruleLogicalSymbol9994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_102_in_ruleLogicalSymbol10011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_103_in_ruleLogicalSymbol10028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_104_in_ruleLogicalSymbol10045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_105_in_ruleLogicalSymbol10062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_106_in_ruleLogicalSymbol10079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_107_in_ruleLeds10124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_108_in_ruleLeds10141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_109_in_ruleLeds10158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_110_in_ruleLedStatus10203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_111_in_ruleLedStatus10220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_112_in_ruleLedStatus10237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_113_in_ruleAggregation10282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_114_in_ruleAggregation10299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_115_in_ruleAggregation10316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_116_in_ruleAggregation10333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_117_in_ruleAggregation10350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_118_in_ruleAggregation10367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_119_in_ruleFusion10412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_120_in_ruleFusion10429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_121_in_ruleFusion10446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_122_in_ruleFusion10463 = new BitSet(new long[]{0x0000000000000002L});
    }


}