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
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, MODULO=5, INC=6, DEC=7, NOT=8, 
		ASSIGN=9, PARENTHESIS_OPEN=10, PARENTHESIS_CLOSE=11, SEMICOLON=12, AH=13, 
		AL=14, BH=15, BL=16, CH=17, CL=18, DH=19, DL=20, AX=21, BX=22, CX=23, 
		DX=24, U8=25, U16=26, I8=27, I16=28, NUM=29, ID=30, WS=31;
	public static final int
		RULE_startRule = 0, RULE_program = 1, RULE_statement = 2, RULE_id_or_reg = 3, 
		RULE_type = 4, RULE_expression = 5, RULE_binop = 6, RULE_unaryop_post = 7, 
		RULE_unaryop_pre = 8, RULE_reg = 9, RULE_regs8 = 10, RULE_regs16 = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "program", "statement", "id_or_reg", "type", "expression", 
			"binop", "unaryop_post", "unaryop_pre", "reg", "regs8", "regs16"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'='", 
			"'('", "')'", "';'", "'ah'", "'al'", "'bh'", "'bl'", "'ch'", "'cl'", 
			"'dh'", "'dl'", "'ax'", "'bx'", "'cx'", "'dx'", "'u8'", "'u16'", "'i8'", 
			"'i16'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "INC", "DEC", 
			"NOT", "ASSIGN", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "SEMICOLON", 
			"AH", "AL", "BH", "BL", "CH", "CL", "DH", "DL", "AX", "BX", "CX", "DX", 
			"U8", "U16", "I8", "I16", "NUM", "ID", "WS"
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
			setState(24);
			program();
			setState(25);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				statement();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AH) | (1L << AL) | (1L << BH) | (1L << BL) | (1L << CH) | (1L << CL) | (1L << DH) | (1L << DL) | (1L << AX) | (1L << BX) | (1L << CX) | (1L << DX) | (1L << U8) | (1L << U16) | (1L << I8) | (1L << I16) | (1L << ID))) != 0) );
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
		public Id_or_regContext id_or_reg() {
			return getRuleContext(Id_or_regContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(bitParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(bitParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << U8) | (1L << U16) | (1L << I8) | (1L << I16))) != 0)) {
				{
				setState(32);
				type();
				}
			}

			setState(35);
			id_or_reg();
			setState(36);
			match(ASSIGN);
			setState(37);
			expression(0);
			setState(38);
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

	public static class Id_or_regContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bitParser.ID, 0); }
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public Id_or_regContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_or_reg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitId_or_reg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_or_regContext id_or_reg() throws RecognitionException {
		Id_or_regContext _localctx = new Id_or_regContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id_or_reg);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(ID);
				}
				break;
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
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				reg();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode U8() { return getToken(bitParser.U8, 0); }
		public TerminalNode U16() { return getToken(bitParser.U16, 0); }
		public TerminalNode I8() { return getToken(bitParser.I8, 0); }
		public TerminalNode I16() { return getToken(bitParser.I16, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << U8) | (1L << U16) | (1L << I8) | (1L << I16))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public Id_or_regContext id_or_reg() {
			return getRuleContext(Id_or_regContext.class,0);
		}
		public TerminalNode NUM() { return getToken(bitParser.NUM, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(bitParser.PARENTHESIS_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(bitParser.PARENTHESIS_CLOSE, 0); }
		public Unaryop_preContext unaryop_pre() {
			return getRuleContext(Unaryop_preContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public Unaryop_postContext unaryop_post() {
			return getRuleContext(Unaryop_postContext.class,0);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
			case ID:
				{
				setState(47);
				id_or_reg();
				}
				break;
			case NUM:
				{
				setState(48);
				match(NUM);
				}
				break;
			case PARENTHESIS_OPEN:
				{
				setState(49);
				match(PARENTHESIS_OPEN);
				setState(50);
				expression(0);
				setState(51);
				match(PARENTHESIS_CLOSE);
				}
				break;
			case INC:
			case DEC:
				{
				setState(53);
				unaryop_pre();
				setState(54);
				expression(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59);
						binop();
						setState(60);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(63);
						unaryop_post();
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 12, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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

	public static class Unaryop_postContext extends ParserRuleContext {
		public Unaryop_preContext unaryop_pre() {
			return getRuleContext(Unaryop_preContext.class,0);
		}
		public TerminalNode NOT() { return getToken(bitParser.NOT, 0); }
		public Unaryop_postContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryop_post; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitUnaryop_post(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unaryop_postContext unaryop_post() throws RecognitionException {
		Unaryop_postContext _localctx = new Unaryop_postContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryop_post);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
			case DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				unaryop_pre();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(NOT);
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

	public static class Unaryop_preContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(bitParser.INC, 0); }
		public TerminalNode DEC() { return getToken(bitParser.DEC, 0); }
		public Unaryop_preContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryop_pre; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitUnaryop_pre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unaryop_preContext unaryop_pre() throws RecognitionException {
		Unaryop_preContext _localctx = new Unaryop_preContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryop_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
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
		public Regs8Context regs8() {
			return getRuleContext(Regs8Context.class,0);
		}
		public Regs16Context regs16() {
			return getRuleContext(Regs16Context.class,0);
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
		enterRule(_localctx, 18, RULE_reg);
		try {
			setState(79);
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
				setState(77);
				regs8();
				}
				break;
			case AX:
			case BX:
			case CX:
			case DX:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				regs16();
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

	public static class Regs8Context extends ParserRuleContext {
		public TerminalNode AH() { return getToken(bitParser.AH, 0); }
		public TerminalNode AL() { return getToken(bitParser.AL, 0); }
		public TerminalNode BH() { return getToken(bitParser.BH, 0); }
		public TerminalNode BL() { return getToken(bitParser.BL, 0); }
		public TerminalNode CH() { return getToken(bitParser.CH, 0); }
		public TerminalNode CL() { return getToken(bitParser.CL, 0); }
		public TerminalNode DH() { return getToken(bitParser.DH, 0); }
		public TerminalNode DL() { return getToken(bitParser.DL, 0); }
		public Regs8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regs8; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitRegs8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Regs8Context regs8() throws RecognitionException {
		Regs8Context _localctx = new Regs8Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_regs8);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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

	public static class Regs16Context extends ParserRuleContext {
		public TerminalNode AX() { return getToken(bitParser.AX, 0); }
		public TerminalNode BX() { return getToken(bitParser.BX, 0); }
		public TerminalNode CX() { return getToken(bitParser.CX, 0); }
		public TerminalNode DX() { return getToken(bitParser.DX, 0); }
		public Regs16Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regs16; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bitVisitor ) return ((bitVisitor<? extends T>)visitor).visitRegs16(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Regs16Context regs16() throws RecognitionException {
		Regs16Context _localctx = new Regs16Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_regs16);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!X\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\3\2\3\2\3\2\3\3\6\3\37\n\3\r\3\16\3 \3\4\5\4$\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\5\5-\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7;\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7C\n\7\f\7\16\7F\13\7\3\b"+
		"\3\b\3\t\3\t\5\tL\n\t\3\n\3\n\3\13\3\13\5\13R\n\13\3\f\3\f\3\r\3\r\3\r"+
		"\2\3\f\16\2\4\6\b\n\f\16\20\22\24\26\30\2\7\3\2\33\36\3\2\3\7\3\2\b\t"+
		"\3\2\17\26\3\2\27\32\2U\2\32\3\2\2\2\4\36\3\2\2\2\6#\3\2\2\2\b,\3\2\2"+
		"\2\n.\3\2\2\2\f:\3\2\2\2\16G\3\2\2\2\20K\3\2\2\2\22M\3\2\2\2\24Q\3\2\2"+
		"\2\26S\3\2\2\2\30U\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3\3\2\2\2\35"+
		"\37\5\6\4\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2"+
		"\"$\5\n\6\2#\"\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\5\b\5\2&\'\7\13\2\2\'(\5"+
		"\f\7\2()\7\16\2\2)\7\3\2\2\2*-\7 \2\2+-\5\24\13\2,*\3\2\2\2,+\3\2\2\2"+
		"-\t\3\2\2\2./\t\2\2\2/\13\3\2\2\2\60\61\b\7\1\2\61;\5\b\5\2\62;\7\37\2"+
		"\2\63\64\7\f\2\2\64\65\5\f\7\2\65\66\7\r\2\2\66;\3\2\2\2\678\5\22\n\2"+
		"89\5\f\7\49;\3\2\2\2:\60\3\2\2\2:\62\3\2\2\2:\63\3\2\2\2:\67\3\2\2\2;"+
		"D\3\2\2\2<=\f\5\2\2=>\5\16\b\2>?\5\f\7\6?C\3\2\2\2@A\f\3\2\2AC\5\20\t"+
		"\2B<\3\2\2\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\r\3\2\2\2FD\3\2"+
		"\2\2GH\t\3\2\2H\17\3\2\2\2IL\5\22\n\2JL\7\n\2\2KI\3\2\2\2KJ\3\2\2\2L\21"+
		"\3\2\2\2MN\t\4\2\2N\23\3\2\2\2OR\5\26\f\2PR\5\30\r\2QO\3\2\2\2QP\3\2\2"+
		"\2R\25\3\2\2\2ST\t\5\2\2T\27\3\2\2\2UV\t\6\2\2V\31\3\2\2\2\n #,:BDKQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}