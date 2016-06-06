/*
* generated by Xtext
*/
package org.nader.sennet.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.nader.sennet.xtext.services.SNDslGrammarAccess;

public class SNDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SNDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.nader.sennet.xtext.parser.antlr.internal.InternalSNDslParser createParser(XtextTokenStream stream) {
		return new org.nader.sennet.xtext.parser.antlr.internal.InternalSNDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "WSNapp";
	}
	
	public SNDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SNDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}