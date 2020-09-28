// Generated from /home/user/IdeaProjects/Bit/src/bit/compiler/parser/bit.g4 by ANTLR 4.8
package bit.compiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bitParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, MODULO=5, ASSIGN=6, PARENTHESIS_OPEN=7, 
		PARENTHESIS_CLOSE=8, SEMICOLON=9, AH=10, AL=11, BH=12, BL=13, CH=14, CL=15, 
		DH=16, DL=17, AX=18, BX=19, CX=20, DX=21, NUM=22, ID=23, WS=24;
	public static final int
		RULE_startRule = 0, RULE_program = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_binop = 4, RULE_reg = 5, RULE_i86regs8 = 6, RULE_i86regs16 = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "program", "statement", "expression", "binop", "reg", "i86regs8", 
			"i86regs16"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'('", "')'", "';'", 
			"'ah'", "'al'", "'bh'", "'bl'", "'ch'", "'cl'", "'dh'", "'dl'", "'ax'", 
			"'bx'", "'cx'", "'dx'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "ASSIGN", "PARENTHESIS_OPEN", 
			"PARENTHESIS_CLOSE", "SEMICOLON", "AH", "AL", "BH", "BL", "CH", "CL", 
			"DH", "DL", "AX", "BX", "CX", "DX", "NUM", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "bit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bitParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartRuleContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(bitParser.EOF, 0); }
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			program();
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(bitParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(bitParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			reg();
			setState(22);
			match(ASSIGN);
			setState(23);
			expression(0);
			setState(24);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public TerminalNode NUM() { return getToken(bitParser.NUM, 0); }
		public TerminalNode ID() { return getToken(bitParser.ID, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(bitParser.PARENTHESIS_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(bitParser.PARENTHESIS_CLOSE, 0); }
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case BH:
			case BL:
			case CH:
			case CL:
			case DH:
			case DL:
			case AX:
			case BX:
			case CX:
			case DX:
				{
				setState(27);
				reg();
				}
				break;
			case NUM:
				{
				setState(28);
				match(NUM);
				}
				break;
			case ID:
				{
				setState(29);
				match(ID);
				}
				break;
			case PARENTHESIS_OPEN:
				{
				setState(30);
				match(PARENTHESIS_OPEN);
				setState(31);
				expression(0);
				setState(32);
				match(PARENTHESIS_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(36);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(37);
					binop();
					setState(38);
					expression(3);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(bitParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(bitParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(bitParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(bitParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(bitParser.MODULO, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegContext extends ParserRuleContext {
		public I86regs8Context i86regs8() {
			return getRuleContext(I86regs8Context.class,0);
		}
		public I86regs16Context i86regs16() {
			return getRuleContext(I86regs16Context.class,0);
		}
		public RegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitReg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegContext reg() throws RecognitionException {
		RegContext _localctx = new RegContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_reg);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case BH:
			case BL:
			case CH:
			case CL:
			case DH:
			case DL:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				i86regs8();
				}
				break;
			case AX:
			case BX:
			case CX:
			case DX:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				i86regs16();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class I86regs8Context extends ParserRuleContext {
		public TerminalNode AH() { return getToken(bitParser.AH, 0); }
		public TerminalNode AL() { return getToken(bitParser.AL, 0); }
		public TerminalNode BH() { return getToken(bitParser.BH, 0); }
		public TerminalNode BL() { return getToken(bitParser.BL, 0); }
		public TerminalNode CH() { return getToken(bitParser.CH, 0); }
		public TerminalNode CL() { return getToken(bitParser.CL, 0); }
		public TerminalNode DH() { return getToken(bitParser.DH, 0); }
		public TerminalNode DL() { return getToken(bitParser.DL, 0); }
		public I86regs8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i86regs8; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitI86regs8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final I86regs8Context i86regs8() throws RecognitionException {
		I86regs8Context _localctx = new I86regs8Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_i86regs8);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AH) | (1L << AL) | (1L << BH) | (1L << BL) | (1L << CH) | (1L << CL) | (1L << DH) | (1L << DL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class I86regs16Context extends ParserRuleContext {
		public TerminalNode AX() { return getToken(bitParser.AX, 0); }
		public TerminalNode BX() { return getToken(bitParser.BX, 0); }
		public TerminalNode CX() { return getToken(bitParser.CX, 0); }
		public TerminalNode DX() { return getToken(bitParser.DX, 0); }
		public I86regs16Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i86regs16; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitI86regs16(this);
			else return visitor.visitChildren(this);
		}
	}

	public final I86regs16Context i86regs16() throws RecognitionException {
		I86regs16Context _localctx = new I86regs16Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_i86regs16);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AX) | (1L << BX) | (1L << CX) | (1L << DX))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5%\n\5\3\5\3\5"+
		"\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\6\3\6\3\7\3\7\5\7\64\n\7\3\b\3\b\3"+
		"\t\3\t\3\t\2\3\b\n\2\4\6\b\n\f\16\20\2\5\3\2\3\7\3\2\f\23\3\2\24\27\2"+
		"\66\2\22\3\2\2\2\4\25\3\2\2\2\6\27\3\2\2\2\b$\3\2\2\2\n/\3\2\2\2\f\63"+
		"\3\2\2\2\16\65\3\2\2\2\20\67\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3"+
		"\3\2\2\2\25\26\5\6\4\2\26\5\3\2\2\2\27\30\5\f\7\2\30\31\7\b\2\2\31\32"+
		"\5\b\5\2\32\33\7\13\2\2\33\7\3\2\2\2\34\35\b\5\1\2\35%\5\f\7\2\36%\7\30"+
		"\2\2\37%\7\31\2\2 !\7\t\2\2!\"\5\b\5\2\"#\7\n\2\2#%\3\2\2\2$\34\3\2\2"+
		"\2$\36\3\2\2\2$\37\3\2\2\2$ \3\2\2\2%,\3\2\2\2&\'\f\4\2\2\'(\5\n\6\2("+
		")\5\b\5\5)+\3\2\2\2*&\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\t\3\2\2\2"+
		".,\3\2\2\2/\60\t\2\2\2\60\13\3\2\2\2\61\64\5\16\b\2\62\64\5\20\t\2\63"+
		"\61\3\2\2\2\63\62\3\2\2\2\64\r\3\2\2\2\65\66\t\3\2\2\66\17\3\2\2\2\67"+
		"8\t\4\2\28\21\3\2\2\2\5$,\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}