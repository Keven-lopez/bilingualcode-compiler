// Generated from C:/Users/ded5t/IdeaProjects/bilingualcode-compiler/src/main/antlr4/SpanglishCode.g4 by ANTLR 4.13.2

package com.umg.bilingualcode;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SpanglishCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, FINISH=2, DEFINE=3, AS=4, SET=5, TO=6, INPUT=7, DISPLAY=8, IF=9, 
		THEN=10, ELSE=11, ENDIF=12, WHILE=13, DO=14, ENDWHILE=15, FUNCTION=16, 
		ENDFUNCTION=17, RETURN=18, CALL=19, NUMBER=20, TEXT=21, BOOLEAN=22, TRUE=23, 
		FALSE=24, AND=25, OR=26, PLUS=27, MINUS=28, MULT=29, DIV=30, EQ=31, NEQ=32, 
		GT=33, LT=34, GTE=35, LTE=36, LPAREN=37, RPAREN=38, COMMA=39, SEMICOLON=40, 
		NUMBER_LITERAL=41, STRING_LITERAL=42, COMMENT=43, IDENTIFIER=44, WS=45;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_assignment = 4, RULE_inputStmt = 5, RULE_displayStmt = 6, RULE_ifStmt = 7, 
		RULE_whileStmt = 8, RULE_functionDecl = 9, RULE_paramList = 10, RULE_functionCall = 11, 
		RULE_argList = 12, RULE_returnStmt = 13, RULE_condition = 14, RULE_comparator = 15, 
		RULE_expression = 16, RULE_operator = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "type", "assignment", "inputStmt", 
			"displayStmt", "ifStmt", "whileStmt", "functionDecl", "paramList", "functionCall", 
			"argList", "returnStmt", "condition", "comparator", "expression", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "FINISH", "DEFINE", "AS", "SET", "TO", "INPUT", "DISPLAY", 
			"IF", "THEN", "ELSE", "ENDIF", "WHILE", "DO", "ENDWHILE", "FUNCTION", 
			"ENDFUNCTION", "RETURN", "CALL", "NUMBER", "TEXT", "BOOLEAN", "TRUE", 
			"FALSE", "AND", "OR", "PLUS", "MINUS", "MULT", "DIV", "EQ", "NEQ", "GT", 
			"LT", "GTE", "LTE", "LPAREN", "RPAREN", "COMMA", "SEMICOLON", "NUMBER_LITERAL", 
			"STRING_LITERAL", "COMMENT", "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "SpanglishCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpanglishCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(SpanglishCodeParser.START, 0); }
		public TerminalNode FINISH() { return getToken(SpanglishCodeParser.FINISH, 0); }
		public TerminalNode EOF() { return getToken(SpanglishCodeParser.EOF, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(START);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 861096L) != 0)) {
				{
				{
				setState(37);
				statement();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(FINISH);
			setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public DisplayStmtContext displayStmt() {
			return getRuleContext(DisplayStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				declaration();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				assignment();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				inputStmt();
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				displayStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				ifStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				whileStmt();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				functionDecl();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 8);
				{
				setState(53);
				functionCall();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(54);
				returnStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SpanglishCodeParser.DEFINE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SpanglishCodeParser.IDENTIFIER, 0); }
		public TerminalNode AS() { return getToken(SpanglishCodeParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SpanglishCodeParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(DEFINE);
			setState(58);
			match(IDENTIFIER);
			setState(59);
			match(AS);
			setState(60);
			type();
			setState(61);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SpanglishCodeParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(SpanglishCodeParser.TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(SpanglishCodeParser.BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SpanglishCodeParser.SET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SpanglishCodeParser.IDENTIFIER, 0); }
		public TerminalNode TO() { return getToken(SpanglishCodeParser.TO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SpanglishCodeParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(SET);
			setState(66);
			match(IDENTIFIER);
			setState(67);
			match(TO);
			setState(68);
			expression(0);
			setState(69);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputStmtContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(SpanglishCodeParser.INPUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SpanglishCodeParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(SpanglishCodeParser.SEMICOLON, 0); }
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(INPUT);
			setState(72);
			match(IDENTIFIER);
			setState(73);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DisplayStmtContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(SpanglishCodeParser.DISPLAY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SpanglishCodeParser.SEMICOLON, 0); }
		public DisplayStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterDisplayStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitDisplayStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitDisplayStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStmtContext displayStmt() throws RecognitionException {
		DisplayStmtContext _localctx = new DisplayStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_displayStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(DISPLAY);
			setState(76);
			expression(0);
			setState(77);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SpanglishCodeParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SpanglishCodeParser.THEN, 0); }
		public TerminalNode ENDIF() { return getToken(SpanglishCodeParser.ENDIF, 0); }
		public TerminalNode SEMICOLON() { return getToken(SpanglishCodeParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SpanglishCodeParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IF);
			setState(80);
			condition();
			setState(81);
			match(THEN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 861096L) != 0)) {
				{
				{
				setState(82);
				statement();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(88);
				match(ELSE);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 861096L) != 0)) {
					{
					{
					setState(89);
					statement();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(97);
			match(ENDIF);
			setState(98);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SpanglishCodeParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DO() { return getToken(SpanglishCodeParser.DO, 0); }
		public TerminalNode ENDWHILE() { return getToken(SpanglishCodeParser.ENDWHILE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SpanglishCodeParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(WHILE);
			setState(101);
			condition();
			setState(102);
			match(DO);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 861096L) != 0)) {
				{
				{
				setState(103);
				statement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(ENDWHILE);
			setState(110);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(SpanglishCodeParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SpanglishCodeParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(SpanglishCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SpanglishCodeParser.RPAREN, 0); }
		public TerminalNode DO() { return getToken(SpanglishCodeParser.DO, 0); }
		public TerminalNode RETURN() { return getToken(SpanglishCodeParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SpanglishCodeParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SpanglishCodeParser.SEMICOLON, i);
		}
		public TerminalNode ENDFUNCTION() { return getToken(SpanglishCodeParser.ENDFUNCTION, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(FUNCTION);
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(LPAREN);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(115);
				paramList();
				}
			}

			setState(118);
			match(RPAREN);
			setState(119);
			match(DO);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					statement();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(126);
			match(RETURN);
			setState(127);
			expression(0);
			setState(128);
			match(SEMICOLON);
			setState(129);
			match(ENDFUNCTION);
			setState(130);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SpanglishCodeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SpanglishCodeParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SpanglishCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpanglishCodeParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDENTIFIER);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(133);
				match(COMMA);
				setState(134);
				match(IDENTIFIER);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(SpanglishCodeParser.CALL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SpanglishCodeParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(SpanglishCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SpanglishCodeParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SpanglishCodeParser.SEMICOLON, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CALL);
			setState(141);
			match(IDENTIFIER);
			setState(142);
			match(LPAREN);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 24326719930368L) != 0)) {
				{
				setState(143);
				argList();
				}
			}

			setState(146);
			match(RPAREN);
			setState(147);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SpanglishCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpanglishCodeParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expression(0);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150);
				match(COMMA);
				setState(151);
				expression(0);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SpanglishCodeParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SpanglishCodeParser.SEMICOLON, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(RETURN);
			setState(158);
			expression(0);
			setState(159);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expression(0);
			setState(162);
			comparator();
			setState(163);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SpanglishCodeParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SpanglishCodeParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(SpanglishCodeParser.GT, 0); }
		public TerminalNode LT() { return getToken(SpanglishCodeParser.LT, 0); }
		public TerminalNode GTE() { return getToken(SpanglishCodeParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(SpanglishCodeParser.LTE, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469824L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SpanglishCodeParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SpanglishCodeParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SpanglishCodeParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(SpanglishCodeParser.NUMBER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SpanglishCodeParser.STRING_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(SpanglishCodeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SpanglishCodeParser.FALSE, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(168);
				match(LPAREN);
				setState(169);
				expression(0);
				setState(170);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				{
				setState(172);
				match(IDENTIFIER);
				}
				break;
			case NUMBER_LITERAL:
				{
				setState(173);
				match(NUMBER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				{
				setState(174);
				match(STRING_LITERAL);
				}
				break;
			case TRUE:
				{
				setState(175);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(176);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(179);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(180);
					operator();
					setState(181);
					expression(8);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SpanglishCodeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SpanglishCodeParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(SpanglishCodeParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(SpanglishCodeParser.DIV, 0); }
		public TerminalNode AND() { return getToken(SpanglishCodeParser.AND, 0); }
		public TerminalNode OR() { return getToken(SpanglishCodeParser.OR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanglishCodeListener ) ((SpanglishCodeListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanglishCodeVisitor ) return ((SpanglishCodeVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) ) {
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
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00bf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007T\b\u0007\n\u0007\f\u0007W\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007[\b\u0007\n\u0007\f\u0007^\t\u0007"+
		"\u0003\u0007`\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bi\b\b\n\b\f\bl\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tu\b\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\tz\b\t\n\t\f\t}\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0088\b\n\n\n\f\n\u008b\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0091\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0099\b\f\n\f\f\f\u009c"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00b2\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00b8\b\u0010\n\u0010\f\u0010\u00bb\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0000\u0001 \u0012\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000"+
		"\u0003\u0001\u0000\u0014\u0016\u0001\u0000\u001f$\u0001\u0000\u0019\u001e"+
		"\u00c4\u0000$\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004"+
		"9\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bA\u0001\u0000"+
		"\u0000\u0000\nG\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000\u000e"+
		"O\u0001\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012p\u0001"+
		"\u0000\u0000\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u008c\u0001"+
		"\u0000\u0000\u0000\u0018\u0095\u0001\u0000\u0000\u0000\u001a\u009d\u0001"+
		"\u0000\u0000\u0000\u001c\u00a1\u0001\u0000\u0000\u0000\u001e\u00a5\u0001"+
		"\u0000\u0000\u0000 \u00b1\u0001\u0000\u0000\u0000\"\u00bc\u0001\u0000"+
		"\u0000\u0000$(\u0005\u0001\u0000\u0000%\'\u0003\u0002\u0001\u0000&%\u0001"+
		"\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000+,\u0005\u0002\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001\u0001"+
		"\u0000\u0000\u0000.8\u0003\u0004\u0002\u0000/8\u0003\b\u0004\u000008\u0003"+
		"\n\u0005\u000018\u0003\f\u0006\u000028\u0003\u000e\u0007\u000038\u0003"+
		"\u0010\b\u000048\u0003\u0012\t\u000058\u0003\u0016\u000b\u000068\u0003"+
		"\u001a\r\u00007.\u0001\u0000\u0000\u00007/\u0001\u0000\u0000\u000070\u0001"+
		"\u0000\u0000\u000071\u0001\u0000\u0000\u000072\u0001\u0000\u0000\u0000"+
		"73\u0001\u0000\u0000\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000076\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u00009:\u0005"+
		"\u0003\u0000\u0000:;\u0005,\u0000\u0000;<\u0005\u0004\u0000\u0000<=\u0003"+
		"\u0006\u0003\u0000=>\u0005(\u0000\u0000>\u0005\u0001\u0000\u0000\u0000"+
		"?@\u0007\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AB\u0005\u0005"+
		"\u0000\u0000BC\u0005,\u0000\u0000CD\u0005\u0006\u0000\u0000DE\u0003 \u0010"+
		"\u0000EF\u0005(\u0000\u0000F\t\u0001\u0000\u0000\u0000GH\u0005\u0007\u0000"+
		"\u0000HI\u0005,\u0000\u0000IJ\u0005(\u0000\u0000J\u000b\u0001\u0000\u0000"+
		"\u0000KL\u0005\b\u0000\u0000LM\u0003 \u0010\u0000MN\u0005(\u0000\u0000"+
		"N\r\u0001\u0000\u0000\u0000OP\u0005\t\u0000\u0000PQ\u0003\u001c\u000e"+
		"\u0000QU\u0005\n\u0000\u0000RT\u0003\u0002\u0001\u0000SR\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000V_\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000X\\\u0005"+
		"\u000b\u0000\u0000Y[\u0003\u0002\u0001\u0000ZY\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_X\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0005"+
		"\f\u0000\u0000bc\u0005(\u0000\u0000c\u000f\u0001\u0000\u0000\u0000de\u0005"+
		"\r\u0000\u0000ef\u0003\u001c\u000e\u0000fj\u0005\u000e\u0000\u0000gi\u0003"+
		"\u0002\u0001\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000mn\u0005\u000f\u0000\u0000no\u0005(\u0000"+
		"\u0000o\u0011\u0001\u0000\u0000\u0000pq\u0005\u0010\u0000\u0000qr\u0005"+
		",\u0000\u0000rt\u0005%\u0000\u0000su\u0003\u0014\n\u0000ts\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0005"+
		"&\u0000\u0000w{\u0005\u000e\u0000\u0000xz\u0003\u0002\u0001\u0000yx\u0001"+
		"\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\u0012\u0000\u0000\u007f\u0080\u0003 \u0010\u0000\u0080"+
		"\u0081\u0005(\u0000\u0000\u0081\u0082\u0005\u0011\u0000\u0000\u0082\u0083"+
		"\u0005(\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0089\u0005"+
		",\u0000\u0000\u0085\u0086\u0005\'\u0000\u0000\u0086\u0088\u0005,\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u0015\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u0013\u0000\u0000\u008d\u008e\u0005,\u0000\u0000"+
		"\u008e\u0090\u0005%\u0000\u0000\u008f\u0091\u0003\u0018\f\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005&\u0000\u0000\u0093\u0094"+
		"\u0005(\u0000\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u009a\u0003"+
		" \u0010\u0000\u0096\u0097\u0005\'\u0000\u0000\u0097\u0099\u0003 \u0010"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u0012\u0000\u0000\u009e\u009f\u0003 \u0010\u0000"+
		"\u009f\u00a0\u0005(\u0000\u0000\u00a0\u001b\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0003 \u0010\u0000\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3\u00a4"+
		"\u0003 \u0010\u0000\u00a4\u001d\u0001\u0000\u0000\u0000\u00a5\u00a6\u0007"+
		"\u0001\u0000\u0000\u00a6\u001f\u0001\u0000\u0000\u0000\u00a7\u00a8\u0006"+
		"\u0010\uffff\uffff\u0000\u00a8\u00a9\u0005%\u0000\u0000\u00a9\u00aa\u0003"+
		" \u0010\u0000\u00aa\u00ab\u0005&\u0000\u0000\u00ab\u00b2\u0001\u0000\u0000"+
		"\u0000\u00ac\u00b2\u0005,\u0000\u0000\u00ad\u00b2\u0005)\u0000\u0000\u00ae"+
		"\u00b2\u0005*\u0000\u0000\u00af\u00b2\u0005\u0017\u0000\u0000\u00b0\u00b2"+
		"\u0005\u0018\u0000\u0000\u00b1\u00a7\u0001\u0000\u0000\u0000\u00b1\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b9\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\n\u0007\u0000\u0000\u00b4\u00b5\u0003\"\u0011\u0000\u00b5\u00b6\u0003"+
		" \u0010\b\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba!\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0007\u0002\u0000"+
		"\u0000\u00bd#\u0001\u0000\u0000\u0000\r(7U\\_jt{\u0089\u0090\u009a\u00b1"+
		"\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}