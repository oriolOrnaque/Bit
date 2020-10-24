// Generated from /home/user/IdeaProjects/Bit/src/bit/compiler/parser/bit.g4 by ANTLR 4.8
package bit.compiler.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bitLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, MODULO=5, INC=6, DEC=7, NOT=8, 
		ASSIGN=9, PARENTHESIS_OPEN=10, PARENTHESIS_CLOSE=11, SEMICOLON=12, AH=13, 
		AL=14, BH=15, BL=16, CH=17, CL=18, DH=19, DL=20, AX=21, BX=22, CX=23, 
		DX=24, U8=25, U16=26, I8=27, I16=28, NUM=29, ID=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "INC", "DEC", "NOT", 
			"ASSIGN", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "SEMICOLON", "AH", 
			"AL", "BH", "BL", "CH", "CL", "DH", "DL", "AX", "BX", "CX", "DX", "U8", 
			"U16", "I8", "I16", "NUM", "ID", "WS"
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


	public bitLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u009e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\36\6\36\u008f\n\36\r\36\16\36\u0090\3\37\6\37\u0094\n\37\r\37\16"+
		"\37\u0095\3 \6 \u0099\n \r \16 \u009a\3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\5\3\2\62;\4\2"+
		"C\\c|\5\2\13\f\17\17\"\"\2\u00a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2"+
		"\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17N\3\2\2\2\21"+
		"Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2"+
		"\35^\3\2\2\2\37a\3\2\2\2!d\3\2\2\2#g\3\2\2\2%j\3\2\2\2\'m\3\2\2\2)p\3"+
		"\2\2\2+s\3\2\2\2-v\3\2\2\2/y\3\2\2\2\61|\3\2\2\2\63\177\3\2\2\2\65\u0082"+
		"\3\2\2\2\67\u0086\3\2\2\29\u0089\3\2\2\2;\u008e\3\2\2\2=\u0093\3\2\2\2"+
		"?\u0098\3\2\2\2AB\7-\2\2B\4\3\2\2\2CD\7/\2\2D\6\3\2\2\2EF\7,\2\2F\b\3"+
		"\2\2\2GH\7\61\2\2H\n\3\2\2\2IJ\7\'\2\2J\f\3\2\2\2KL\7-\2\2LM\7-\2\2M\16"+
		"\3\2\2\2NO\7/\2\2OP\7/\2\2P\20\3\2\2\2QR\7#\2\2R\22\3\2\2\2ST\7?\2\2T"+
		"\24\3\2\2\2UV\7*\2\2V\26\3\2\2\2WX\7+\2\2X\30\3\2\2\2YZ\7=\2\2Z\32\3\2"+
		"\2\2[\\\7c\2\2\\]\7j\2\2]\34\3\2\2\2^_\7c\2\2_`\7n\2\2`\36\3\2\2\2ab\7"+
		"d\2\2bc\7j\2\2c \3\2\2\2de\7d\2\2ef\7n\2\2f\"\3\2\2\2gh\7e\2\2hi\7j\2"+
		"\2i$\3\2\2\2jk\7e\2\2kl\7n\2\2l&\3\2\2\2mn\7f\2\2no\7j\2\2o(\3\2\2\2p"+
		"q\7f\2\2qr\7n\2\2r*\3\2\2\2st\7c\2\2tu\7z\2\2u,\3\2\2\2vw\7d\2\2wx\7z"+
		"\2\2x.\3\2\2\2yz\7e\2\2z{\7z\2\2{\60\3\2\2\2|}\7f\2\2}~\7z\2\2~\62\3\2"+
		"\2\2\177\u0080\7w\2\2\u0080\u0081\7:\2\2\u0081\64\3\2\2\2\u0082\u0083"+
		"\7w\2\2\u0083\u0084\7\63\2\2\u0084\u0085\78\2\2\u0085\66\3\2\2\2\u0086"+
		"\u0087\7k\2\2\u0087\u0088\7:\2\2\u00888\3\2\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7\63\2\2\u008b\u008c\78\2\2\u008c:\3\2\2\2\u008d\u008f\t\2\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091<\3\2\2\2\u0092\u0094\t\3\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096>\3\2\2\2"+
		"\u0097\u0099\t\4\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b \2\2\u009d"+
		"@\3\2\2\2\6\2\u0090\u0095\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}