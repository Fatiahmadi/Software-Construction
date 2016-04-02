// Generated from QL.g4 by ANTLR 4.4
package antlrProducts;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class QLLexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__23 = 1, T__22 = 2, T__21 = 3, T__20 = 4,
			T__19 = 5, T__18 = 6, T__17 = 7, T__16 = 8, T__15 = 9, T__14 = 10,
			T__13 = 11, T__12 = 12, T__11 = 13, T__10 = 14, T__9 = 15,
			T__8 = 16, T__7 = 17, T__6 = 18, T__5 = 19, T__4 = 20, T__3 = 21,
			T__2 = 22, T__1 = 23, T__0 = 24, STRINGLITERAL = 25,
			BOOLEANLITERAL = 26, INTEGERLITERAL = 27, IDENTIFIER = 28,
			LOWERCASE = 29, UPPERCASE = 30, DIGIT = 31, WS = 32, ESC = 33,
			COMMENT = 34;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "'\\u0000'", "'\\u0001'",
			"'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", "'\\u0006'",
			"'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", "'\r'",
			"'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'",
			"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'",
			"'\\u0018'", "'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'",
			"'\\u001D'", "'\\u001E'", "'\\u001F'", "' '", "'!'", "'\"'" };
	public static final String[] ruleNames = { "T__23", "T__22", "T__21",
			"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14",
			"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6",
			"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "STRINGLITERAL",
			"BOOLEANLITERAL", "INTEGERLITERAL", "IDENTIFIER", "LOWERCASE",
			"UPPERCASE", "DIGIT", "WS", "ESC", "COMMENT" };

	public QLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "QL.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00dc\b\1\4\2\t"
			+ "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
			+ "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
			+ "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
			+ "\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"
			+ "\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"
			+ "\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"
			+ "\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"
			+ "\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"
			+ "\3\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u0099\n\32\f\32\16\32\u009c\13"
			+ "\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00a9"
			+ "\n\33\3\34\6\34\u00ac\n\34\r\34\16\34\u00ad\3\35\3\35\5\35\u00b2\n\35"
			+ "\3\35\3\35\3\35\7\35\u00b7\n\35\f\35\16\35\u00ba\13\35\3\36\3\36\3\37"
			+ "\3\37\3 \3 \3!\6!\u00c3\n!\r!\16!\u00c4\3!\3!\3\"\3\"\3\"\3\"\5\"\u00cd"
			+ "\n\"\3#\3#\3#\3#\7#\u00d3\n#\f#\16#\u00d6\13#\3#\3#\3#\3#\3#\4\u009a\u00d4"
			+ "\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"
			+ "\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"
			+ ";\37= ?!A\"C#E$\3\2\6\3\2c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\u00e6\2"
			+ "\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"
			+ "\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"
			+ "\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"
			+ "\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"
			+ "\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"
			+ "\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2"
			+ "\5I\3\2\2\2\7Q\3\2\2\2\tY\3\2\2\2\13\\\3\2\2\2\r^\3\2\2\2\17a\3\2\2\2"
			+ "\21d\3\2\2\2\23f\3\2\2\2\25i\3\2\2\2\27l\3\2\2\2\31n\3\2\2\2\33p\3\2\2"
			+ "\2\35r\3\2\2\2\37u\3\2\2\2!x\3\2\2\2#z\3\2\2\2%\u0081\3\2\2\2\'\u0086"
			+ "\3\2\2\2)\u008b\3\2\2\2+\u008d\3\2\2\2-\u008f\3\2\2\2/\u0091\3\2\2\2\61"
			+ "\u0093\3\2\2\2\63\u0095\3\2\2\2\65\u00a8\3\2\2\2\67\u00ab\3\2\2\29\u00b1"
			+ "\3\2\2\2;\u00bb\3\2\2\2=\u00bd\3\2\2\2?\u00bf\3\2\2\2A\u00c2\3\2\2\2C"
			+ "\u00cc\3\2\2\2E\u00ce\3\2\2\2GH\7\61\2\2H\4\3\2\2\2IJ\7d\2\2JK\7q\2\2"
			+ "KL\7q\2\2LM\7n\2\2MN\7g\2\2NO\7c\2\2OP\7p\2\2P\6\3\2\2\2QR\7k\2\2RS\7"
			+ "p\2\2ST\7v\2\2TU\7g\2\2UV\7i\2\2VW\7g\2\2WX\7t\2\2X\b\3\2\2\2YZ\7#\2\2"
			+ "Z[\7?\2\2[\n\3\2\2\2\\]\7<\2\2]\f\3\2\2\2^_\7~\2\2_`\7~\2\2`\16\3\2\2"
			+ "\2ab\7@\2\2bc\7?\2\2c\20\3\2\2\2de\7}\2\2e\22\3\2\2\2fg\7(\2\2gh\7(\2"
			+ "\2h\24\3\2\2\2ij\7?\2\2jk\7?\2\2k\26\3\2\2\2lm\7>\2\2m\30\3\2\2\2no\7"
			+ "\177\2\2o\32\3\2\2\2pq\7@\2\2q\34\3\2\2\2rs\7k\2\2st\7h\2\2t\36\3\2\2"
			+ "\2uv\7>\2\2vw\7?\2\2w \3\2\2\2xy\7#\2\2y\"\3\2\2\2z{\7u\2\2{|\7v\2\2|"
			+ "}\7t\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7i\2\2\u0080$\3\2\2\2\u0081\u0082"
			+ "\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085"
			+ "&\3\2\2\2\u0086\u0087\7H\2\2\u0087\u0088\7q\2\2\u0088\u0089\7t\2\2\u0089"
			+ "\u008a\7o\2\2\u008a(\3\2\2\2\u008b\u008c\7*\2\2\u008c*\3\2\2\2\u008d\u008e"
			+ "\7+\2\2\u008e,\3\2\2\2\u008f\u0090\7,\2\2\u0090.\3\2\2\2\u0091\u0092\7"
			+ "-\2\2\u0092\60\3\2\2\2\u0093\u0094\7/\2\2\u0094\62\3\2\2\2\u0095\u009a"
			+ "\7$\2\2\u0096\u0099\5C\"\2\u0097\u0099\13\2\2\2\u0098\u0096\3\2\2\2\u0098"
			+ "\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2"
			+ "\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7$\2\2\u009e"
			+ "\64\3\2\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7w\2\2\u00a2"
			+ "\u00a9\7g\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2"
			+ "\u00a6\u00a7\7u\2\2\u00a7\u00a9\7g\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a3"
			+ "\3\2\2\2\u00a9\66\3\2\2\2\u00aa\u00ac\5? \2\u00ab\u00aa\3\2\2\2\u00ac"
			+ "\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae8\3\2\2\2"
			+ "\u00af\u00b2\5;\36\2\u00b0\u00b2\5=\37\2\u00b1\u00af\3\2\2\2\u00b1\u00b0"
			+ "\3\2\2\2\u00b2\u00b8\3\2\2\2\u00b3\u00b7\5;\36\2\u00b4\u00b7\5=\37\2\u00b5"
			+ "\u00b7\5? \2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2"
			+ "\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9:"
			+ "\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bc<\3\2\2\2\u00bd"
			+ "\u00be\t\3\2\2\u00be>\3\2\2\2\u00bf\u00c0\t\4\2\2\u00c0@\3\2\2\2\u00c1"
			+ "\u00c3\t\5\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2"
			+ "\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b!\2\2\u00c7"
			+ "B\3\2\2\2\u00c8\u00c9\7^\2\2\u00c9\u00cd\7$\2\2\u00ca\u00cb\7^\2\2\u00cb"
			+ "\u00cd\7^\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cdD\3\2\2\2\u00ce"
			+ "\u00cf\7\61\2\2\u00cf\u00d0\7,\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\13"
			+ "\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d4"
			+ "\u00d2\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7,"
			+ "\2\2\u00d8\u00d9\7\61\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b#\2\2\u00db"
			+ "F\3\2\2\2\r\2\u0098\u009a\u00a8\u00ad\u00b1\u00b6\u00b8\u00c4\u00cc\u00d4"
			+ "\3\b\2\2";
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}