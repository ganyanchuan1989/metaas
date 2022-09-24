// $ANTLR 3.5.3 AS3.g 2022-09-24 09:36:50

package org.asdt.core.internal.antlr;

import uk.co.badgersinfoil.metaas.impl.antlr.LinkedListTree;
import uk.co.badgersinfoil.metaas.impl.antlr.LinkedListTreeAdaptor;
import uk.co.badgersinfoil.metaas.impl.antlr.LinkedListToken;
import uk.co.badgersinfoil.metaas.impl.antlr.LinkedListTokenStream;
import uk.co.badgersinfoil.metaas.impl.antlr.LinkedListTokenSource;
import java.io.StringReader;
import java.io.Reader;
import java.io.IOException;
import uk.co.badgersinfoil.metaas.impl.parser.E4XHelper;
import uk.co.badgersinfoil.metaas.impl.parser.RegexSimpleHelper;
import uk.co.badgersinfoil.metaas.impl.TokenBuilder;
import uk.co.badgersinfoil.metaas.impl.ASTUtils;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class AS3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESSOR_ROLE", "ANNOTATION", 
		"ANNOTATIONS", "ANNOTATION_PARAMS", "ARGUMENTS", "ARRAY_ACC", "ARRAY_LITERAL", 
		"AS", "ASSIGN", "BAND", "BAND_ASSIGN", "BLOCK", "BNOT", "BOM", "BOR", 
		"BOR_ASSIGN", "BREAK", "BSR", "BSR_ASSIGN", "BXOR", "BXOR_ASSIGN", "CASE", 
		"CATCH", "CLASS", "CLASS_DEF", "COLON", "COMMA", "COMPILATION_UNIT", "CONDITION", 
		"CONST", "CONTINUE", "CTRLCHAR_ESC", "DBL_COLON", "DEC", "DECIMAL_LITERAL", 
		"DEFAULT", "DEFAULT_XML_NAMESPACE", "DELETE", "DIV", "DIV_ASSIGN", "DO", 
		"DOT", "DYNAMIC", "E4X_ATTRI", "E4X_ATTRI_EXPR", "E4X_ATTRI_PROPERTY", 
		"E4X_ATTRI_STAR", "E4X_DESC", "E4X_FILTER", "EACH", "ELIST", "ELSE", "ENCPS_EXPR", 
		"EQUAL", "ESC", "EXPONENT", "EXPR_STMNT", "EXTENDS", "FALSE", "FINAL", 
		"FINALLY", "FLOAT_LITERAL", "FOR", "FOR_CONDITION", "FOR_EACH", "FOR_IN", 
		"FOR_INIT", "FOR_ITERATOR", "FUNCTION", "FUNC_DEF", "GE", "GET", "GT", 
		"HEX_DIGIT", "HEX_LITERAL", "IDENT", "IDENTIFIER", "IDENTIFIER_STAR", 
		"IF", "IMPLEMENTS", "IMPORT", "IN", "INC", "INCLUDE_DIRECTIVE", "INSTANCEOF", 
		"INTERFACE", "INTERFACE_DEF", "INTERNAL", "IS", "LAND", "LAND_ASSIGN", 
		"LBRACK", "LCURLY", "LE", "LNOT", "LOR", "LOR_ASSIGN", "LPAREN", "LT", 
		"METHOD_CALL", "METHOD_DEF", "MINUS", "MINUS_ASSIGN", "ML_COMMENT", "MOD", 
		"MODIFIERS", "MOD_ASSIGN", "MULT", "NAMESPACE", "NAMESPACE_DEF", "NEW", 
		"NL", "NOT_EQUAL", "NULL", "OBJECT_FIELD", "OBJECT_LITERAL", "OCTAL_ESC", 
		"OCTAL_LITERAL", "OCT_DIGIT", "OVERRIDE", "PACKAGE", "PARAM", "PARAMS", 
		"PLUS", "PLUS_ASSIGN", "POST_DEC", "POST_INC", "PRE_DEC", "PRE_INC", "PRIVATE", 
		"PROPERTY_ACCESS", "PROPERTY_OR_IDENTIFIER", "PROTECTED", "PUBLIC", "QUESTION", 
		"RBRACK", "RCURLY", "REGEXP_LITERAL", "REST", "RETURN", "RPAREN", "SEMI", 
		"SET", "SL", "SL_ASSIGN", "SL_COMMENT", "SR", "SR_ASSIGN", "STAR", "STAR_ASSIGN", 
		"STATIC", "STRICT_EQUAL", "STRICT_NOT_EQUAL", "STRING_LITERAL", "SUPER", 
		"SWITCH", "SWITCH_STATEMENT_LIST", "THROW", "TRUE", "TRY", "TYPEOF", "TYPE_BLOCK", 
		"TYPE_NAME", "TYPE_SPEC", "UNARY_MINUS", "UNARY_PLUS", "UNDEFINED", "UNICODE_ESC", 
		"UNICODE_IDENTIFIER_PART", "UNICODE_IDENTIFIER_START", "USE", "VAR", "VAR_DEF", 
		"VAR_INIT", "VIRTUAL_PLACEHOLDER", "VOID", "WHILE", "WITH", "WS", "XML", 
		"XML_LITERAL", "'and'", "'enumerable'", "'explicit'", "'include'", "'intrinsic'", 
		"'or'"
	};
	public static final int EOF=-1;
	public static final int T__185=185;
	public static final int T__186=186;
	public static final int T__187=187;
	public static final int T__188=188;
	public static final int T__189=189;
	public static final int T__190=190;
	public static final int ACCESSOR_ROLE=4;
	public static final int ANNOTATION=5;
	public static final int ANNOTATIONS=6;
	public static final int ANNOTATION_PARAMS=7;
	public static final int ARGUMENTS=8;
	public static final int ARRAY_ACC=9;
	public static final int ARRAY_LITERAL=10;
	public static final int AS=11;
	public static final int ASSIGN=12;
	public static final int BAND=13;
	public static final int BAND_ASSIGN=14;
	public static final int BLOCK=15;
	public static final int BNOT=16;
	public static final int BOM=17;
	public static final int BOR=18;
	public static final int BOR_ASSIGN=19;
	public static final int BREAK=20;
	public static final int BSR=21;
	public static final int BSR_ASSIGN=22;
	public static final int BXOR=23;
	public static final int BXOR_ASSIGN=24;
	public static final int CASE=25;
	public static final int CATCH=26;
	public static final int CLASS=27;
	public static final int CLASS_DEF=28;
	public static final int COLON=29;
	public static final int COMMA=30;
	public static final int COMPILATION_UNIT=31;
	public static final int CONDITION=32;
	public static final int CONST=33;
	public static final int CONTINUE=34;
	public static final int CTRLCHAR_ESC=35;
	public static final int DBL_COLON=36;
	public static final int DEC=37;
	public static final int DECIMAL_LITERAL=38;
	public static final int DEFAULT=39;
	public static final int DEFAULT_XML_NAMESPACE=40;
	public static final int DELETE=41;
	public static final int DIV=42;
	public static final int DIV_ASSIGN=43;
	public static final int DO=44;
	public static final int DOT=45;
	public static final int DYNAMIC=46;
	public static final int E4X_ATTRI=47;
	public static final int E4X_ATTRI_EXPR=48;
	public static final int E4X_ATTRI_PROPERTY=49;
	public static final int E4X_ATTRI_STAR=50;
	public static final int E4X_DESC=51;
	public static final int E4X_FILTER=52;
	public static final int EACH=53;
	public static final int ELIST=54;
	public static final int ELSE=55;
	public static final int ENCPS_EXPR=56;
	public static final int EQUAL=57;
	public static final int ESC=58;
	public static final int EXPONENT=59;
	public static final int EXPR_STMNT=60;
	public static final int EXTENDS=61;
	public static final int FALSE=62;
	public static final int FINAL=63;
	public static final int FINALLY=64;
	public static final int FLOAT_LITERAL=65;
	public static final int FOR=66;
	public static final int FOR_CONDITION=67;
	public static final int FOR_EACH=68;
	public static final int FOR_IN=69;
	public static final int FOR_INIT=70;
	public static final int FOR_ITERATOR=71;
	public static final int FUNCTION=72;
	public static final int FUNC_DEF=73;
	public static final int GE=74;
	public static final int GET=75;
	public static final int GT=76;
	public static final int HEX_DIGIT=77;
	public static final int HEX_LITERAL=78;
	public static final int IDENT=79;
	public static final int IDENTIFIER=80;
	public static final int IDENTIFIER_STAR=81;
	public static final int IF=82;
	public static final int IMPLEMENTS=83;
	public static final int IMPORT=84;
	public static final int IN=85;
	public static final int INC=86;
	public static final int INCLUDE_DIRECTIVE=87;
	public static final int INSTANCEOF=88;
	public static final int INTERFACE=89;
	public static final int INTERFACE_DEF=90;
	public static final int INTERNAL=91;
	public static final int IS=92;
	public static final int LAND=93;
	public static final int LAND_ASSIGN=94;
	public static final int LBRACK=95;
	public static final int LCURLY=96;
	public static final int LE=97;
	public static final int LNOT=98;
	public static final int LOR=99;
	public static final int LOR_ASSIGN=100;
	public static final int LPAREN=101;
	public static final int LT=102;
	public static final int METHOD_CALL=103;
	public static final int METHOD_DEF=104;
	public static final int MINUS=105;
	public static final int MINUS_ASSIGN=106;
	public static final int ML_COMMENT=107;
	public static final int MOD=108;
	public static final int MODIFIERS=109;
	public static final int MOD_ASSIGN=110;
	public static final int MULT=111;
	public static final int NAMESPACE=112;
	public static final int NAMESPACE_DEF=113;
	public static final int NEW=114;
	public static final int NL=115;
	public static final int NOT_EQUAL=116;
	public static final int NULL=117;
	public static final int OBJECT_FIELD=118;
	public static final int OBJECT_LITERAL=119;
	public static final int OCTAL_ESC=120;
	public static final int OCTAL_LITERAL=121;
	public static final int OCT_DIGIT=122;
	public static final int OVERRIDE=123;
	public static final int PACKAGE=124;
	public static final int PARAM=125;
	public static final int PARAMS=126;
	public static final int PLUS=127;
	public static final int PLUS_ASSIGN=128;
	public static final int POST_DEC=129;
	public static final int POST_INC=130;
	public static final int PRE_DEC=131;
	public static final int PRE_INC=132;
	public static final int PRIVATE=133;
	public static final int PROPERTY_ACCESS=134;
	public static final int PROPERTY_OR_IDENTIFIER=135;
	public static final int PROTECTED=136;
	public static final int PUBLIC=137;
	public static final int QUESTION=138;
	public static final int RBRACK=139;
	public static final int RCURLY=140;
	public static final int REGEXP_LITERAL=141;
	public static final int REST=142;
	public static final int RETURN=143;
	public static final int RPAREN=144;
	public static final int SEMI=145;
	public static final int SET=146;
	public static final int SL=147;
	public static final int SL_ASSIGN=148;
	public static final int SL_COMMENT=149;
	public static final int SR=150;
	public static final int SR_ASSIGN=151;
	public static final int STAR=152;
	public static final int STAR_ASSIGN=153;
	public static final int STATIC=154;
	public static final int STRICT_EQUAL=155;
	public static final int STRICT_NOT_EQUAL=156;
	public static final int STRING_LITERAL=157;
	public static final int SUPER=158;
	public static final int SWITCH=159;
	public static final int SWITCH_STATEMENT_LIST=160;
	public static final int THROW=161;
	public static final int TRUE=162;
	public static final int TRY=163;
	public static final int TYPEOF=164;
	public static final int TYPE_BLOCK=165;
	public static final int TYPE_NAME=166;
	public static final int TYPE_SPEC=167;
	public static final int UNARY_MINUS=168;
	public static final int UNARY_PLUS=169;
	public static final int UNDEFINED=170;
	public static final int UNICODE_ESC=171;
	public static final int UNICODE_IDENTIFIER_PART=172;
	public static final int UNICODE_IDENTIFIER_START=173;
	public static final int USE=174;
	public static final int VAR=175;
	public static final int VAR_DEF=176;
	public static final int VAR_INIT=177;
	public static final int VIRTUAL_PLACEHOLDER=178;
	public static final int VOID=179;
	public static final int WHILE=180;
	public static final int WITH=181;
	public static final int WS=182;
	public static final int XML=183;
	public static final int XML_LITERAL=184;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators

	protected static class InOperator_scope {
		boolean allowed;
	}
	protected Stack<InOperator_scope> InOperator_stack = new Stack<InOperator_scope>();


	public AS3Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AS3Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return AS3Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "AS3.g"; }



		public static final int CHANNEL_PLACEHOLDER = 999;

		protected void mismatch(IntStream input, int ttype, BitSet follow)
			throws RecognitionException
		{
			throw new MismatchedTokenException(ttype, input);
		}
		
		private AS3Lexer lexer;
		private CharStream cs;

		public void setInput(AS3Lexer lexer, CharStream cs) {
			this.lexer = lexer;
			this.cs = cs;
		}

		/**
		 * Handle 'island grammar' for embeded XML-literal elements.
		 */
		private LinkedListTree parseXMLLiteral() throws RecognitionException {
			return E4XHelper.parseXMLLiteral(lexer, cs, (LinkedListTokenStream)input);
		}

		/**
		 * Handle 'island grammar' for skipping over embeded
		 * regular-expression-literal values.
		 */
		private LinkedListTree parseRegexpLiteral(LinkedListToken startMarker) throws RecognitionException {
			return RegexSimpleHelper.parseRegexpLiteral(startMarker, lexer, cs, (LinkedListTokenStream)input);
		}

		private boolean virtualSemi() {
			LinkedListToken tok = ((LinkedListToken)input.LT(1)).getPrev();
			while (tok.getType() == WS) {
				tok = tok.getPrev();
			}
			return tok.getType() == NL;
		}
		
		/**
		 * Adds a placeholder token into the stream, corresponding to the
		 * location of the given AST node, if the given AST node has no
		 * children.  Only use this function with 'imaginary' nodes, not with
		 * nodes that already correspond to a concrete Token.
		 */
		private LinkedListToken placeholder(LinkedListTree imaginary) {
			if (imaginary.getChildCount() > 0) {
				// one of this node's children will presumably have
				// some tokens of its own, so there's no need for us
				// to synthesize one,
				return imaginary.getStartToken();
			}

			// Since this this AST node is 'imaginary', it does not directly
			// correspond to any Token in the input stream.  Also, since
			// it has no children, there is nothing anchoring it to a
			// position in the token-stream, which will make it difficult to
			// know where new tokens should be inserted if the calling app
			// adds a child to this node.  We therefore insert a virtual
			// token at this point in the stream just so that the AST node
			// can remember its own location.

			LinkedListToken tok = (LinkedListToken)input.LT(1);
	    		LinkedListToken placeholder = TokenBuilder.newPlaceholder(imaginary);
			tok.beforeInsert(placeholder);
			return placeholder;
		}

		private void demarcate(LinkedListTree parent) {
			parent.setStartToken(parent.getFirstChild().getStartToken());
			parent.setStopToken(parent.getLastChild().getStopToken());
		}


	public static class compilationUnit_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "compilationUnit"
	// AS3.g:174:1: compilationUnit : ( as2CompilationUnit | as3CompilationUnit ) -> ^( COMPILATION_UNIT ( as2CompilationUnit )? ( as3CompilationUnit )? ) ;
	public final AS3Parser.compilationUnit_return compilationUnit() throws RecognitionException {
		AS3Parser.compilationUnit_return retval = new AS3Parser.compilationUnit_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope as2CompilationUnit1 =null;
		ParserRuleReturnScope as3CompilationUnit2 =null;

		RewriteRuleSubtreeStream stream_as3CompilationUnit=new RewriteRuleSubtreeStream(adaptor,"rule as3CompilationUnit");
		RewriteRuleSubtreeStream stream_as2CompilationUnit=new RewriteRuleSubtreeStream(adaptor,"rule as2CompilationUnit");

		try {
			// AS3.g:175:2: ( ( as2CompilationUnit | as3CompilationUnit ) -> ^( COMPILATION_UNIT ( as2CompilationUnit )? ( as3CompilationUnit )? ) )
			// AS3.g:175:4: ( as2CompilationUnit | as3CompilationUnit )
			{
			// AS3.g:175:4: ( as2CompilationUnit | as3CompilationUnit )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CLASS||LA1_0==DYNAMIC||LA1_0==FINAL||LA1_0==IDENT||LA1_0==IMPORT||LA1_0==INTERFACE||LA1_0==INTERNAL||LA1_0==LBRACK||LA1_0==OVERRIDE||LA1_0==PRIVATE||(LA1_0 >= PROTECTED && LA1_0 <= PUBLIC)||LA1_0==STATIC||(LA1_0 >= 186 && LA1_0 <= 189)) ) {
				alt1=1;
			}
			else if ( (LA1_0==PACKAGE) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// AS3.g:175:6: as2CompilationUnit
					{
					pushFollow(FOLLOW_as2CompilationUnit_in_compilationUnit288);
					as2CompilationUnit1=as2CompilationUnit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_as2CompilationUnit.add(as2CompilationUnit1.getTree());
					}
					break;
				case 2 :
					// AS3.g:176:5: as3CompilationUnit
					{
					pushFollow(FOLLOW_as3CompilationUnit_in_compilationUnit294);
					as3CompilationUnit2=as3CompilationUnit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_as3CompilationUnit.add(as3CompilationUnit2.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: as3CompilationUnit, as2CompilationUnit
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 177:5: -> ^( COMPILATION_UNIT ( as2CompilationUnit )? ( as3CompilationUnit )? )
			{
				// AS3.g:177:8: ^( COMPILATION_UNIT ( as2CompilationUnit )? ( as3CompilationUnit )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(COMPILATION_UNIT, "COMPILATION_UNIT"), root_1);
				// AS3.g:177:27: ( as2CompilationUnit )?
				if ( stream_as2CompilationUnit.hasNext() ) {
					adaptor.addChild(root_1, stream_as2CompilationUnit.nextTree());
				}
				stream_as2CompilationUnit.reset();

				// AS3.g:177:47: ( as3CompilationUnit )?
				if ( stream_as3CompilationUnit.hasNext() ) {
					adaptor.addChild(root_1, stream_as3CompilationUnit.nextTree());
				}
				stream_as3CompilationUnit.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compilationUnit"


	public static class as2CompilationUnit_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "as2CompilationUnit"
	// AS3.g:180:1: as2CompilationUnit : ( importDefinition )* as2Type ;
	public final AS3Parser.as2CompilationUnit_return as2CompilationUnit() throws RecognitionException {
		AS3Parser.as2CompilationUnit_return retval = new AS3Parser.as2CompilationUnit_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope importDefinition3 =null;
		ParserRuleReturnScope as2Type4 =null;


		try {
			// AS3.g:181:2: ( ( importDefinition )* as2Type )
			// AS3.g:181:4: ( importDefinition )* as2Type
			{
			root_0 = (LinkedListTree)adaptor.nil();


			// AS3.g:181:4: ( importDefinition )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IMPORT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// AS3.g:181:4: importDefinition
					{
					pushFollow(FOLLOW_importDefinition_in_as2CompilationUnit321);
					importDefinition3=importDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, importDefinition3.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			pushFollow(FOLLOW_as2Type_in_as2CompilationUnit326);
			as2Type4=as2Type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, as2Type4.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "as2CompilationUnit"


	public static class as2Type_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "as2Type"
	// AS3.g:185:1: as2Type : annos= annotations !mods= modifiers ! ( as2ClassDefinition[$annos.tree,$mods.tree] | as2InterfaceDefinition[$annos.tree,$mods.tree] ) ;
	public final AS3Parser.as2Type_return as2Type() throws RecognitionException {
		AS3Parser.as2Type_return retval = new AS3Parser.as2Type_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope annos =null;
		ParserRuleReturnScope mods =null;
		ParserRuleReturnScope as2ClassDefinition5 =null;
		ParserRuleReturnScope as2InterfaceDefinition6 =null;


		try {
			// AS3.g:186:2: (annos= annotations !mods= modifiers ! ( as2ClassDefinition[$annos.tree,$mods.tree] | as2InterfaceDefinition[$annos.tree,$mods.tree] ) )
			// AS3.g:186:4: annos= annotations !mods= modifiers ! ( as2ClassDefinition[$annos.tree,$mods.tree] | as2InterfaceDefinition[$annos.tree,$mods.tree] )
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_annotations_in_as2Type339);
			annos=annotations();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { placeholder((annos!=null?((LinkedListTree)annos.getTree()):null)); }
			pushFollow(FOLLOW_modifiers_in_as2Type348);
			mods=modifiers();
			state._fsp--;
			if (state.failed) return retval;
			// AS3.g:188:2: ( as2ClassDefinition[$annos.tree,$mods.tree] | as2InterfaceDefinition[$annos.tree,$mods.tree] )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CLASS) ) {
				alt3=1;
			}
			else if ( (LA3_0==INTERFACE) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// AS3.g:188:4: as2ClassDefinition[$annos.tree,$mods.tree]
					{
					pushFollow(FOLLOW_as2ClassDefinition_in_as2Type354);
					as2ClassDefinition5=as2ClassDefinition((annos!=null?((LinkedListTree)annos.getTree()):null), (mods!=null?((LinkedListTree)mods.getTree()):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, as2ClassDefinition5.getTree());

					}
					break;
				case 2 :
					// AS3.g:189:4: as2InterfaceDefinition[$annos.tree,$mods.tree]
					{
					pushFollow(FOLLOW_as2InterfaceDefinition_in_as2Type360);
					as2InterfaceDefinition6=as2InterfaceDefinition((annos!=null?((LinkedListTree)annos.getTree()):null), (mods!=null?((LinkedListTree)mods.getTree()):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, as2InterfaceDefinition6.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "as2Type"


	public static class as3CompilationUnit_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "as3CompilationUnit"
	// AS3.g:193:1: as3CompilationUnit : packageDecl ( packageBlockEntry )* EOF !;
	public final AS3Parser.as3CompilationUnit_return as3CompilationUnit() throws RecognitionException {
		AS3Parser.as3CompilationUnit_return retval = new AS3Parser.as3CompilationUnit_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token EOF9=null;
		ParserRuleReturnScope packageDecl7 =null;
		ParserRuleReturnScope packageBlockEntry8 =null;

		LinkedListTree EOF9_tree=null;

		try {
			// AS3.g:194:2: ( packageDecl ( packageBlockEntry )* EOF !)
			// AS3.g:194:4: packageDecl ( packageBlockEntry )* EOF !
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_packageDecl_in_as3CompilationUnit375);
			packageDecl7=packageDecl();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, packageDecl7.getTree());

			// AS3.g:195:3: ( packageBlockEntry )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CLASS||LA4_0==CONST||LA4_0==DYNAMIC||LA4_0==FINAL||LA4_0==FUNCTION||LA4_0==IDENT||LA4_0==IMPORT||LA4_0==INTERFACE||LA4_0==INTERNAL||LA4_0==LBRACK||LA4_0==NAMESPACE||LA4_0==OVERRIDE||LA4_0==PRIVATE||(LA4_0 >= PROTECTED && LA4_0 <= PUBLIC)||LA4_0==SEMI||LA4_0==STATIC||(LA4_0 >= USE && LA4_0 <= VAR)||(LA4_0 >= 186 && LA4_0 <= 189)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// AS3.g:195:3: packageBlockEntry
					{
					pushFollow(FOLLOW_packageBlockEntry_in_as3CompilationUnit379);
					packageBlockEntry8=packageBlockEntry();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, packageBlockEntry8.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			EOF9=(Token)match(input,EOF,FOLLOW_EOF_in_as3CompilationUnit384); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "as3CompilationUnit"


	public static class packageDecl_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "packageDecl"
	// AS3.g:199:1: packageDecl : PACKAGE ^ ( identifier )? packageBlock ;
	public final AS3Parser.packageDecl_return packageDecl() throws RecognitionException {
		AS3Parser.packageDecl_return retval = new AS3Parser.packageDecl_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token PACKAGE10=null;
		ParserRuleReturnScope identifier11 =null;
		ParserRuleReturnScope packageBlock12 =null;

		LinkedListTree PACKAGE10_tree=null;

		try {
			// AS3.g:200:2: ( PACKAGE ^ ( identifier )? packageBlock )
			// AS3.g:200:4: PACKAGE ^ ( identifier )? packageBlock
			{
			root_0 = (LinkedListTree)adaptor.nil();


			PACKAGE10=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDecl396); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PACKAGE10_tree = (LinkedListTree)adaptor.create(PACKAGE10);
			root_0 = (LinkedListTree)adaptor.becomeRoot(PACKAGE10_tree, root_0);
			}

			// AS3.g:200:13: ( identifier )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==AS||LA5_0==DYNAMIC||LA5_0==GET||LA5_0==IDENT||(LA5_0 >= INTERNAL && LA5_0 <= IS)||LA5_0==NAMESPACE||LA5_0==PRIVATE||(LA5_0 >= PROTECTED && LA5_0 <= PUBLIC)||LA5_0==SET||LA5_0==USE||LA5_0==XML) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// AS3.g:200:13: identifier
					{
					pushFollow(FOLLOW_identifier_in_packageDecl399);
					identifier11=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier11.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_packageBlock_in_packageDecl404);
			packageBlock12=packageBlock();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, packageBlock12.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "packageDecl"


	public static class packageBlock_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "packageBlock"
	// AS3.g:204:1: packageBlock : LCURLY ( packageBlockEntry )* RCURLY -> ^( BLOCK ( packageBlockEntry )* ) ;
	public final AS3Parser.packageBlock_return packageBlock() throws RecognitionException {
		AS3Parser.packageBlock_return retval = new AS3Parser.packageBlock_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LCURLY13=null;
		Token RCURLY15=null;
		ParserRuleReturnScope packageBlockEntry14 =null;

		LinkedListTree LCURLY13_tree=null;
		LinkedListTree RCURLY15_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_packageBlockEntry=new RewriteRuleSubtreeStream(adaptor,"rule packageBlockEntry");

		try {
			// AS3.g:205:2: ( LCURLY ( packageBlockEntry )* RCURLY -> ^( BLOCK ( packageBlockEntry )* ) )
			// AS3.g:205:4: LCURLY ( packageBlockEntry )* RCURLY
			{
			LCURLY13=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_packageBlock415); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY13);

			// AS3.g:206:3: ( packageBlockEntry )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==CLASS||LA6_0==CONST||LA6_0==DYNAMIC||LA6_0==FINAL||LA6_0==FUNCTION||LA6_0==IDENT||LA6_0==IMPORT||LA6_0==INTERFACE||LA6_0==INTERNAL||LA6_0==LBRACK||LA6_0==NAMESPACE||LA6_0==OVERRIDE||LA6_0==PRIVATE||(LA6_0 >= PROTECTED && LA6_0 <= PUBLIC)||LA6_0==SEMI||LA6_0==STATIC||(LA6_0 >= USE && LA6_0 <= VAR)||(LA6_0 >= 186 && LA6_0 <= 189)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// AS3.g:206:3: packageBlockEntry
					{
					pushFollow(FOLLOW_packageBlockEntry_in_packageBlock419);
					packageBlockEntry14=packageBlockEntry();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_packageBlockEntry.add(packageBlockEntry14.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			RCURLY15=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_packageBlock424); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY15);


			// AST REWRITE
			// elements: packageBlockEntry
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 208:3: -> ^( BLOCK ( packageBlockEntry )* )
			{
				// AS3.g:208:6: ^( BLOCK ( packageBlockEntry )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				// AS3.g:208:14: ( packageBlockEntry )*
				while ( stream_packageBlockEntry.hasNext() ) {
					adaptor.addChild(root_1, stream_packageBlockEntry.nextTree());
				}
				stream_packageBlockEntry.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "packageBlock"


	public static class packageBlockEntry_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "packageBlockEntry"
	// AS3.g:211:1: packageBlockEntry : ( importDefinition |annos= annotations !mods= modifiers ! ( classDefinition[$annos.tree,$mods.tree] | interfaceDefinition[$annos.tree,$mods.tree] | variableDefinition[$annos.tree,$mods.tree] | methodDefinition[$annos.tree,$mods.tree] | namespaceDefinition[$annos.tree,$mods.tree] | useNamespaceDirective ) | SEMI !) ;
	public final AS3Parser.packageBlockEntry_return packageBlockEntry() throws RecognitionException {
		AS3Parser.packageBlockEntry_return retval = new AS3Parser.packageBlockEntry_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token SEMI23=null;
		ParserRuleReturnScope annos =null;
		ParserRuleReturnScope mods =null;
		ParserRuleReturnScope importDefinition16 =null;
		ParserRuleReturnScope classDefinition17 =null;
		ParserRuleReturnScope interfaceDefinition18 =null;
		ParserRuleReturnScope variableDefinition19 =null;
		ParserRuleReturnScope methodDefinition20 =null;
		ParserRuleReturnScope namespaceDefinition21 =null;
		ParserRuleReturnScope useNamespaceDirective22 =null;

		LinkedListTree SEMI23_tree=null;

		try {
			// AS3.g:212:2: ( ( importDefinition |annos= annotations !mods= modifiers ! ( classDefinition[$annos.tree,$mods.tree] | interfaceDefinition[$annos.tree,$mods.tree] | variableDefinition[$annos.tree,$mods.tree] | methodDefinition[$annos.tree,$mods.tree] | namespaceDefinition[$annos.tree,$mods.tree] | useNamespaceDirective ) | SEMI !) )
			// AS3.g:212:4: ( importDefinition |annos= annotations !mods= modifiers ! ( classDefinition[$annos.tree,$mods.tree] | interfaceDefinition[$annos.tree,$mods.tree] | variableDefinition[$annos.tree,$mods.tree] | methodDefinition[$annos.tree,$mods.tree] | namespaceDefinition[$annos.tree,$mods.tree] | useNamespaceDirective ) | SEMI !)
			{
			root_0 = (LinkedListTree)adaptor.nil();


			// AS3.g:212:4: ( importDefinition |annos= annotations !mods= modifiers ! ( classDefinition[$annos.tree,$mods.tree] | interfaceDefinition[$annos.tree,$mods.tree] | variableDefinition[$annos.tree,$mods.tree] | methodDefinition[$annos.tree,$mods.tree] | namespaceDefinition[$annos.tree,$mods.tree] | useNamespaceDirective ) | SEMI !)
			int alt8=3;
			switch ( input.LA(1) ) {
			case IMPORT:
				{
				alt8=1;
				}
				break;
			case CLASS:
			case CONST:
			case DYNAMIC:
			case FINAL:
			case FUNCTION:
			case IDENT:
			case INTERFACE:
			case INTERNAL:
			case LBRACK:
			case NAMESPACE:
			case OVERRIDE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case USE:
			case VAR:
			case 186:
			case 187:
			case 188:
			case 189:
				{
				alt8=2;
				}
				break;
			case SEMI:
				{
				alt8=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// AS3.g:212:6: importDefinition
					{
					pushFollow(FOLLOW_importDefinition_in_packageBlockEntry448);
					importDefinition16=importDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, importDefinition16.getTree());

					}
					break;
				case 2 :
					// AS3.g:214:5: annos= annotations !mods= modifiers ! ( classDefinition[$annos.tree,$mods.tree] | interfaceDefinition[$annos.tree,$mods.tree] | variableDefinition[$annos.tree,$mods.tree] | methodDefinition[$annos.tree,$mods.tree] | namespaceDefinition[$annos.tree,$mods.tree] | useNamespaceDirective )
					{
					pushFollow(FOLLOW_annotations_in_packageBlockEntry457);
					annos=annotations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.start=placeholder((annos!=null?((LinkedListTree)annos.getTree()):null)); }
					pushFollow(FOLLOW_modifiers_in_packageBlockEntry467);
					mods=modifiers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { placeholder((mods!=null?((LinkedListTree)mods.getTree()):null)); }
					// AS3.g:216:4: ( classDefinition[$annos.tree,$mods.tree] | interfaceDefinition[$annos.tree,$mods.tree] | variableDefinition[$annos.tree,$mods.tree] | methodDefinition[$annos.tree,$mods.tree] | namespaceDefinition[$annos.tree,$mods.tree] | useNamespaceDirective )
					int alt7=6;
					switch ( input.LA(1) ) {
					case CLASS:
						{
						alt7=1;
						}
						break;
					case INTERFACE:
						{
						alt7=2;
						}
						break;
					case CONST:
					case VAR:
						{
						alt7=3;
						}
						break;
					case FUNCTION:
						{
						alt7=4;
						}
						break;
					case NAMESPACE:
						{
						alt7=5;
						}
						break;
					case USE:
						{
						alt7=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// AS3.g:216:6: classDefinition[$annos.tree,$mods.tree]
							{
							pushFollow(FOLLOW_classDefinition_in_packageBlockEntry477);
							classDefinition17=classDefinition((annos!=null?((LinkedListTree)annos.getTree()):null), (mods!=null?((LinkedListTree)mods.getTree()):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition17.getTree());

							}
							break;
						case 2 :
							// AS3.g:217:6: interfaceDefinition[$annos.tree,$mods.tree]
							{
							pushFollow(FOLLOW_interfaceDefinition_in_packageBlockEntry485);
							interfaceDefinition18=interfaceDefinition((annos!=null?((LinkedListTree)annos.getTree()):null), (mods!=null?((LinkedListTree)mods.getTree()):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDefinition18.getTree());

							}
							break;
						case 3 :
							// AS3.g:218:6: variableDefinition[$annos.tree,$mods.tree]
							{
							pushFollow(FOLLOW_variableDefinition_in_packageBlockEntry493);
							variableDefinition19=variableDefinition((annos!=null?((LinkedListTree)annos.getTree()):null), (mods!=null?((LinkedListTree)mods.getTree()):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDefinition19.getTree());

							}
							break;
						case 4 :
							// AS3.g:219:6: methodDefinition[$annos.tree,$mods.tree]
							{
							pushFollow(FOLLOW_methodDefinition_in_packageBlockEntry501);
							methodDefinition20=methodDefinition((annos!=null?((LinkedListTree)annos.getTree()):null), (mods!=null?((LinkedListTree)mods.getTree()):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDefinition20.getTree());

							}
							break;
						case 5 :
							// AS3.g:220:6: namespaceDefinition[$annos.tree,$mods.tree]
							{
							pushFollow(FOLLOW_namespaceDefinition_in_packageBlockEntry509);
							namespaceDefinition21=namespaceDefinition((annos!=null?((LinkedListTree)annos.getTree()):null), (mods!=null?((LinkedListTree)mods.getTree()):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceDefinition21.getTree());

							}
							break;
						case 6 :
							// AS3.g:221:6: useNamespaceDirective
							{
							pushFollow(FOLLOW_useNamespaceDirective_in_packageBlockEntry517);
							useNamespaceDirective22=useNamespaceDirective();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, useNamespaceDirective22.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// AS3.g:223:5: SEMI !
					{
					SEMI23=(Token)match(input,SEMI,FOLLOW_SEMI_in_packageBlockEntry528); if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "packageBlockEntry"


	public static class endOfFile_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "endOfFile"
	// AS3.g:228:1: endOfFile : EOF !;
	public final AS3Parser.endOfFile_return endOfFile() throws RecognitionException {
		AS3Parser.endOfFile_return retval = new AS3Parser.endOfFile_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token EOF24=null;

		LinkedListTree EOF24_tree=null;

		try {
			// AS3.g:229:2: ( EOF !)
			// AS3.g:229:4: EOF !
			{
			root_0 = (LinkedListTree)adaptor.nil();


			EOF24=(Token)match(input,EOF,FOLLOW_EOF_in_endOfFile545); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "endOfFile"


	public static class importDefinition_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "importDefinition"
	// AS3.g:232:1: importDefinition : IMPORT ^ identifierStar semi ;
	public final AS3Parser.importDefinition_return importDefinition() throws RecognitionException {
		AS3Parser.importDefinition_return retval = new AS3Parser.importDefinition_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token IMPORT25=null;
		ParserRuleReturnScope identifierStar26 =null;
		ParserRuleReturnScope semi27 =null;

		LinkedListTree IMPORT25_tree=null;

		try {
			// AS3.g:233:2: ( IMPORT ^ identifierStar semi )
			// AS3.g:233:4: IMPORT ^ identifierStar semi
			{
			root_0 = (LinkedListTree)adaptor.nil();


			IMPORT25=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_importDefinition557); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMPORT25_tree = (LinkedListTree)adaptor.create(IMPORT25);
			root_0 = (LinkedListTree)adaptor.becomeRoot(IMPORT25_tree, root_0);
			}

			pushFollow(FOLLOW_identifierStar_in_importDefinition560);
			identifierStar26=identifierStar();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierStar26.getTree());

			pushFollow(FOLLOW_semi_in_importDefinition562);
			semi27=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, semi27.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "importDefinition"


	public static class semi_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "semi"
	// AS3.g:236:1: semi : SEMI !;
	public final AS3Parser.semi_return semi() throws RecognitionException {
		AS3Parser.semi_return retval = new AS3Parser.semi_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token SEMI28=null;

		LinkedListTree SEMI28_tree=null;

		try {
			// AS3.g:237:2: ( SEMI !)
			// AS3.g:237:4: SEMI !
			{
			root_0 = (LinkedListTree)adaptor.nil();


			SEMI28=(Token)match(input,SEMI,FOLLOW_SEMI_in_semi573); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "semi"


	public static class classDefinition_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "classDefinition"
	// AS3.g:241:1: classDefinition[LinkedListTree annos, LinkedListTree mods] : CLASS ident classExtendsClause implementsClause typeBlock -> ^( CLASS_DEF ident classExtendsClause implementsClause typeBlock ) ;
	public final AS3Parser.classDefinition_return classDefinition(LinkedListTree annos, LinkedListTree mods) throws RecognitionException {
		AS3Parser.classDefinition_return retval = new AS3Parser.classDefinition_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token CLASS29=null;
		ParserRuleReturnScope ident30 =null;
		ParserRuleReturnScope classExtendsClause31 =null;
		ParserRuleReturnScope implementsClause32 =null;
		ParserRuleReturnScope typeBlock33 =null;

		LinkedListTree CLASS29_tree=null;
		RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_classExtendsClause=new RewriteRuleSubtreeStream(adaptor,"rule classExtendsClause");
		RewriteRuleSubtreeStream stream_typeBlock=new RewriteRuleSubtreeStream(adaptor,"rule typeBlock");
		RewriteRuleSubtreeStream stream_implementsClause=new RewriteRuleSubtreeStream(adaptor,"rule implementsClause");

		try {
			// AS3.g:242:2: ( CLASS ident classExtendsClause implementsClause typeBlock -> ^( CLASS_DEF ident classExtendsClause implementsClause typeBlock ) )
			// AS3.g:242:4: CLASS ident classExtendsClause implementsClause typeBlock
			{
			CLASS29=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDefinition588); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLASS.add(CLASS29);

			pushFollow(FOLLOW_ident_in_classDefinition590);
			ident30=ident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ident.add(ident30.getTree());
			pushFollow(FOLLOW_classExtendsClause_in_classDefinition594);
			classExtendsClause31=classExtendsClause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classExtendsClause.add(classExtendsClause31.getTree());
			pushFollow(FOLLOW_implementsClause_in_classDefinition598);
			implementsClause32=implementsClause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_implementsClause.add(implementsClause32.getTree());
			pushFollow(FOLLOW_typeBlock_in_classDefinition602);
			typeBlock33=typeBlock();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeBlock.add(typeBlock33.getTree());

			// AST REWRITE
			// elements: ident, typeBlock, classExtendsClause, implementsClause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 246:3: -> ^( CLASS_DEF ident classExtendsClause implementsClause typeBlock )
			{
				// AS3.g:246:6: ^( CLASS_DEF ident classExtendsClause implementsClause typeBlock )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(CLASS_DEF, "CLASS_DEF"), root_1);
				adaptor.addChild(root_1, annos);
				adaptor.addChild(root_1, mods);
				adaptor.addChild(root_1, stream_ident.nextTree());
				adaptor.addChild(root_1, stream_classExtendsClause.nextTree());
				adaptor.addChild(root_1, stream_implementsClause.nextTree());
				adaptor.addChild(root_1, stream_typeBlock.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classDefinition"


	public static class as2ClassDefinition_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "as2ClassDefinition"
	// AS3.g:249:1: as2ClassDefinition[LinkedListTree annos, LinkedListTree mods] : CLASS identifier classExtendsClause implementsClause typeBlock -> ^( CLASS_DEF identifier classExtendsClause implementsClause typeBlock ) ;
	public final AS3Parser.as2ClassDefinition_return as2ClassDefinition(LinkedListTree annos, LinkedListTree mods) throws RecognitionException {
		AS3Parser.as2ClassDefinition_return retval = new AS3Parser.as2ClassDefinition_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token CLASS34=null;
		ParserRuleReturnScope identifier35 =null;
		ParserRuleReturnScope classExtendsClause36 =null;
		ParserRuleReturnScope implementsClause37 =null;
		ParserRuleReturnScope typeBlock38 =null;

		LinkedListTree CLASS34_tree=null;
		RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_classExtendsClause=new RewriteRuleSubtreeStream(adaptor,"rule classExtendsClause");
		RewriteRuleSubtreeStream stream_typeBlock=new RewriteRuleSubtreeStream(adaptor,"rule typeBlock");
		RewriteRuleSubtreeStream stream_implementsClause=new RewriteRuleSubtreeStream(adaptor,"rule implementsClause");

		try {
			// AS3.g:250:2: ( CLASS identifier classExtendsClause implementsClause typeBlock -> ^( CLASS_DEF identifier classExtendsClause implementsClause typeBlock ) )
			// AS3.g:250:4: CLASS identifier classExtendsClause implementsClause typeBlock
			{
			CLASS34=(Token)match(input,CLASS,FOLLOW_CLASS_in_as2ClassDefinition634); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLASS.add(CLASS34);

			pushFollow(FOLLOW_identifier_in_as2ClassDefinition636);
			identifier35=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier35.getTree());
			pushFollow(FOLLOW_classExtendsClause_in_as2ClassDefinition640);
			classExtendsClause36=classExtendsClause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classExtendsClause.add(classExtendsClause36.getTree());
			pushFollow(FOLLOW_implementsClause_in_as2ClassDefinition644);
			implementsClause37=implementsClause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_implementsClause.add(implementsClause37.getTree());
			pushFollow(FOLLOW_typeBlock_in_as2ClassDefinition648);
			typeBlock38=typeBlock();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeBlock.add(typeBlock38.getTree());

			// AST REWRITE
			// elements: classExtendsClause, typeBlock, implementsClause, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 254:3: -> ^( CLASS_DEF identifier classExtendsClause implementsClause typeBlock )
			{
				// AS3.g:254:6: ^( CLASS_DEF identifier classExtendsClause implementsClause typeBlock )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(CLASS_DEF, "CLASS_DEF"), root_1);
				adaptor.addChild(root_1, annos);
				adaptor.addChild(root_1, mods);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_1, stream_classExtendsClause.nextTree());
				adaptor.addChild(root_1, stream_implementsClause.nextTree());
				adaptor.addChild(root_1, stream_typeBlock.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "as2ClassDefinition"


	public static class interfaceDefinition_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "interfaceDefinition"
	// AS3.g:257:1: interfaceDefinition[LinkedListTree annos, Tree mods] : INTERFACE ident interfaceExtendsClause typeBlock -> ^( INTERFACE_DEF ident interfaceExtendsClause typeBlock ) ;
	public final AS3Parser.interfaceDefinition_return interfaceDefinition(LinkedListTree annos, Tree mods) throws RecognitionException {
		AS3Parser.interfaceDefinition_return retval = new AS3Parser.interfaceDefinition_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token INTERFACE39=null;
		ParserRuleReturnScope ident40 =null;
		ParserRuleReturnScope interfaceExtendsClause41 =null;
		ParserRuleReturnScope typeBlock42 =null;

		LinkedListTree INTERFACE39_tree=null;
		RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_interfaceExtendsClause=new RewriteRuleSubtreeStream(adaptor,"rule interfaceExtendsClause");
		RewriteRuleSubtreeStream stream_typeBlock=new RewriteRuleSubtreeStream(adaptor,"rule typeBlock");

		try {
			// AS3.g:258:2: ( INTERFACE ident interfaceExtendsClause typeBlock -> ^( INTERFACE_DEF ident interfaceExtendsClause typeBlock ) )
			// AS3.g:258:4: INTERFACE ident interfaceExtendsClause typeBlock
			{
			if ( state.backtracking==0 ) { retval.start = annos.getStartToken(); }
			INTERFACE39=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDefinition684); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE39);

			pushFollow(FOLLOW_ident_in_interfaceDefinition686);
			ident40=ident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ident.add(ident40.getTree());
			pushFollow(FOLLOW_interfaceExtendsClause_in_interfaceDefinition690);
			interfaceExtendsClause41=interfaceExtendsClause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_interfaceExtendsClause.add(interfaceExtendsClause41.getTree());
			pushFollow(FOLLOW_typeBlock_in_interfaceDefinition694);
			typeBlock42=typeBlock();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeBlock.add(typeBlock42.getTree());

			// AST REWRITE
			// elements: typeBlock, ident, interfaceExtendsClause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 262:3: -> ^( INTERFACE_DEF ident interfaceExtendsClause typeBlock )
			{
				// AS3.g:262:6: ^( INTERFACE_DEF ident interfaceExtendsClause typeBlock )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(INTERFACE_DEF, "INTERFACE_DEF"), root_1);
				adaptor.addChild(root_1, annos);
				adaptor.addChild(root_1, mods);
				adaptor.addChild(root_1, stream_ident.nextTree());
				adaptor.addChild(root_1, stream_interfaceExtendsClause.nextTree());
				adaptor.addChild(root_1, stream_typeBlock.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "interfaceDefinition"


	public static class as2InterfaceDefinition_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "as2InterfaceDefinition"
	// AS3.g:265:1: as2InterfaceDefinition[LinkedListTree annos, Tree mods] : INTERFACE identifier interfaceExtendsClause typeBlock -> ^( INTERFACE_DEF identifier interfaceExtendsClause typeBlock ) ;
	public final AS3Parser.as2InterfaceDefinition_return as2InterfaceDefinition(LinkedListTree annos, Tree mods) throws RecognitionException {
		AS3Parser.as2InterfaceDefinition_return retval = new AS3Parser.as2InterfaceDefinition_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token INTERFACE43=null;
		ParserRuleReturnScope identifier44 =null;
		ParserRuleReturnScope interfaceExtendsClause45 =null;
		ParserRuleReturnScope typeBlock46 =null;

		LinkedListTree INTERFACE43_tree=null;
		RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_interfaceExtendsClause=new RewriteRuleSubtreeStream(adaptor,"rule interfaceExtendsClause");
		RewriteRuleSubtreeStream stream_typeBlock=new RewriteRuleSubtreeStream(adaptor,"rule typeBlock");

		try {
			// AS3.g:266:2: ( INTERFACE identifier interfaceExtendsClause typeBlock -> ^( INTERFACE_DEF identifier interfaceExtendsClause typeBlock ) )
			// AS3.g:266:4: INTERFACE identifier interfaceExtendsClause typeBlock
			{
			INTERFACE43=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_as2InterfaceDefinition724); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE43);

			pushFollow(FOLLOW_identifier_in_as2InterfaceDefinition726);
			identifier44=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier44.getTree());
			pushFollow(FOLLOW_interfaceExtendsClause_in_as2InterfaceDefinition730);
			interfaceExtendsClause45=interfaceExtendsClause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_interfaceExtendsClause.add(interfaceExtendsClause45.getTree());
			pushFollow(FOLLOW_typeBlock_in_as2InterfaceDefinition734);
			typeBlock46=typeBlock();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeBlock.add(typeBlock46.getTree());

			// AST REWRITE
			// elements: interfaceExtendsClause, typeBlock, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 269:3: -> ^( INTERFACE_DEF identifier interfaceExtendsClause typeBlock )
			{
				// AS3.g:269:6: ^( INTERFACE_DEF identifier interfaceExtendsClause typeBlock )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(INTERFACE_DEF, "INTERFACE_DEF"), root_1);
				adaptor.addChild(root_1, annos);
				adaptor.addChild(root_1, mods);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_1, stream_interfaceExtendsClause.nextTree());
				adaptor.addChild(root_1, stream_typeBlock.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "as2InterfaceDefinition"


	public static class classExtendsClause_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "classExtendsClause"
	// AS3.g:272:1: classExtendsClause : ( EXTENDS ^ identifier )? ;
	public final AS3Parser.classExtendsClause_return classExtendsClause() throws RecognitionException {
		AS3Parser.classExtendsClause_return retval = new AS3Parser.classExtendsClause_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token EXTENDS47=null;
		ParserRuleReturnScope identifier48 =null;

		LinkedListTree EXTENDS47_tree=null;

		try {
			// AS3.g:273:2: ( ( EXTENDS ^ identifier )? )
			// AS3.g:273:4: ( EXTENDS ^ identifier )?
			{
			root_0 = (LinkedListTree)adaptor.nil();


			// AS3.g:273:4: ( EXTENDS ^ identifier )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==EXTENDS) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// AS3.g:273:5: EXTENDS ^ identifier
					{
					EXTENDS47=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classExtendsClause764); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXTENDS47_tree = (LinkedListTree)adaptor.create(EXTENDS47);
					root_0 = (LinkedListTree)adaptor.becomeRoot(EXTENDS47_tree, root_0);
					}

					pushFollow(FOLLOW_identifier_in_classExtendsClause767);
					identifier48=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier48.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classExtendsClause"


	public static class interfaceExtendsClause_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "interfaceExtendsClause"
	// AS3.g:275:1: interfaceExtendsClause : ( EXTENDS ^ identifier ( COMMA ! identifier )* )? ;
	public final AS3Parser.interfaceExtendsClause_return interfaceExtendsClause() throws RecognitionException {
		AS3Parser.interfaceExtendsClause_return retval = new AS3Parser.interfaceExtendsClause_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token EXTENDS49=null;
		Token COMMA51=null;
		ParserRuleReturnScope identifier50 =null;
		ParserRuleReturnScope identifier52 =null;

		LinkedListTree EXTENDS49_tree=null;
		LinkedListTree COMMA51_tree=null;

		try {
			// AS3.g:276:2: ( ( EXTENDS ^ identifier ( COMMA ! identifier )* )? )
			// AS3.g:276:4: ( EXTENDS ^ identifier ( COMMA ! identifier )* )?
			{
			root_0 = (LinkedListTree)adaptor.nil();


			// AS3.g:276:4: ( EXTENDS ^ identifier ( COMMA ! identifier )* )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==EXTENDS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// AS3.g:276:5: EXTENDS ^ identifier ( COMMA ! identifier )*
					{
					EXTENDS49=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_interfaceExtendsClause780); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXTENDS49_tree = (LinkedListTree)adaptor.create(EXTENDS49);
					root_0 = (LinkedListTree)adaptor.becomeRoot(EXTENDS49_tree, root_0);
					}

					pushFollow(FOLLOW_identifier_in_interfaceExtendsClause783);
					identifier50=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier50.getTree());

					// AS3.g:276:25: ( COMMA ! identifier )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==COMMA) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// AS3.g:276:27: COMMA ! identifier
							{
							COMMA51=(Token)match(input,COMMA,FOLLOW_COMMA_in_interfaceExtendsClause787); if (state.failed) return retval;
							pushFollow(FOLLOW_identifier_in_interfaceExtendsClause790);
							identifier52=identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier52.getTree());

							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "interfaceExtendsClause"


	public static class implementsClause_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "implementsClause"
	// AS3.g:278:1: implementsClause : ( IMPLEMENTS ^ identifier ( COMMA ! identifier )* )? ;
	public final AS3Parser.implementsClause_return implementsClause() throws RecognitionException {
		AS3Parser.implementsClause_return retval = new AS3Parser.implementsClause_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token IMPLEMENTS53=null;
		Token COMMA55=null;
		ParserRuleReturnScope identifier54 =null;
		ParserRuleReturnScope identifier56 =null;

		LinkedListTree IMPLEMENTS53_tree=null;
		LinkedListTree COMMA55_tree=null;

		try {
			// AS3.g:279:2: ( ( IMPLEMENTS ^ identifier ( COMMA ! identifier )* )? )
			// AS3.g:279:4: ( IMPLEMENTS ^ identifier ( COMMA ! identifier )* )?
			{
			root_0 = (LinkedListTree)adaptor.nil();


			// AS3.g:279:4: ( IMPLEMENTS ^ identifier ( COMMA ! identifier )* )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==IMPLEMENTS) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// AS3.g:279:5: IMPLEMENTS ^ identifier ( COMMA ! identifier )*
					{
					IMPLEMENTS53=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_implementsClause805); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IMPLEMENTS53_tree = (LinkedListTree)adaptor.create(IMPLEMENTS53);
					root_0 = (LinkedListTree)adaptor.becomeRoot(IMPLEMENTS53_tree, root_0);
					}

					pushFollow(FOLLOW_identifier_in_implementsClause808);
					identifier54=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier54.getTree());

					// AS3.g:279:28: ( COMMA ! identifier )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==COMMA) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// AS3.g:279:30: COMMA ! identifier
							{
							COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_implementsClause812); if (state.failed) return retval;
							pushFollow(FOLLOW_identifier_in_implementsClause815);
							identifier56=identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier56.getTree());

							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "implementsClause"


	public static class typeBlock_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "typeBlock"
	// AS3.g:281:1: typeBlock : LCURLY ( typeBlockEntry )* RCURLY -> ^( TYPE_BLOCK ( typeBlockEntry )* ) ;
	public final AS3Parser.typeBlock_return typeBlock() throws RecognitionException {
		AS3Parser.typeBlock_return retval = new AS3Parser.typeBlock_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LCURLY57=null;
		Token RCURLY59=null;
		ParserRuleReturnScope typeBlockEntry58 =null;

		LinkedListTree LCURLY57_tree=null;
		LinkedListTree RCURLY59_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_typeBlockEntry=new RewriteRuleSubtreeStream(adaptor,"rule typeBlockEntry");

		try {
			// AS3.g:282:2: ( LCURLY ( typeBlockEntry )* RCURLY -> ^( TYPE_BLOCK ( typeBlockEntry )* ) )
			// AS3.g:282:4: LCURLY ( typeBlockEntry )* RCURLY
			{
			LCURLY57=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_typeBlock829); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY57);

			// AS3.g:283:3: ( typeBlockEntry )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CONST||LA14_0==DYNAMIC||LA14_0==FINAL||LA14_0==FUNCTION||LA14_0==IDENT||LA14_0==IMPORT||LA14_0==INCLUDE_DIRECTIVE||LA14_0==INTERNAL||LA14_0==LBRACK||LA14_0==OVERRIDE||LA14_0==PRIVATE||(LA14_0 >= PROTECTED && LA14_0 <= PUBLIC)||LA14_0==STATIC||LA14_0==VAR||(LA14_0 >= 186 && LA14_0 <= 189)) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// AS3.g:283:3: typeBlockEntry
					{
					pushFollow(FOLLOW_typeBlockEntry_in_typeBlock833);
					typeBlockEntry58=typeBlockEntry();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typeBlockEntry.add(typeBlockEntry58.getTree());
					}
					break;

				default :
					break loop14;
				}
			}

			RCURLY59=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_typeBlock838); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY59);


			// AST REWRITE
			// elements: typeBlockEntry
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 285:3: -> ^( TYPE_BLOCK ( typeBlockEntry )* )
			{
				// AS3.g:285:6: ^( TYPE_BLOCK ( typeBlockEntry )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(TYPE_BLOCK, "TYPE_BLOCK"), root_1);
				// AS3.g:285:19: ( typeBlockEntry )*
				while ( stream_typeBlockEntry.hasNext() ) {
					adaptor.addChild(root_1, stream_typeBlockEntry.nextTree());
				}
				stream_typeBlockEntry.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeBlock"


	public static class typeBlockEntry_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "typeBlockEntry"
	// AS3.g:288:1: typeBlockEntry : (a= annotations !m= modifiers ! ( variableDefinition[$a.tree,$m.tree] | methodDefinition[$a.tree,$m.tree] ) | importDefinition | as2IncludeDirective );
	public final AS3Parser.typeBlockEntry_return typeBlockEntry() throws RecognitionException {
		AS3Parser.typeBlockEntry_return retval = new AS3Parser.typeBlockEntry_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope m =null;
		ParserRuleReturnScope variableDefinition60 =null;
		ParserRuleReturnScope methodDefinition61 =null;
		ParserRuleReturnScope importDefinition62 =null;
		ParserRuleReturnScope as2IncludeDirective63 =null;


		try {
			// AS3.g:289:2: (a= annotations !m= modifiers ! ( variableDefinition[$a.tree,$m.tree] | methodDefinition[$a.tree,$m.tree] ) | importDefinition | as2IncludeDirective )
			int alt16=3;
			switch ( input.LA(1) ) {
			case CONST:
			case DYNAMIC:
			case FINAL:
			case FUNCTION:
			case IDENT:
			case INTERNAL:
			case LBRACK:
			case OVERRIDE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case VAR:
			case 186:
			case 187:
			case 188:
			case 189:
				{
				alt16=1;
				}
				break;
			case IMPORT:
				{
				alt16=2;
				}
				break;
			case INCLUDE_DIRECTIVE:
				{
				alt16=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// AS3.g:290:17: a= annotations !m= modifiers ! ( variableDefinition[$a.tree,$m.tree] | methodDefinition[$a.tree,$m.tree] )
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_annotations_in_typeBlockEntry864);
					a=annotations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.start = placeholder((a!=null?((LinkedListTree)a.getTree()):null)); }
					pushFollow(FOLLOW_modifiers_in_typeBlockEntry873);
					m=modifiers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { placeholder((m!=null?((LinkedListTree)m.getTree()):null)); }
					// AS3.g:292:3: ( variableDefinition[$a.tree,$m.tree] | methodDefinition[$a.tree,$m.tree] )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==CONST||LA15_0==VAR) ) {
						alt15=1;
					}
					else if ( (LA15_0==FUNCTION) ) {
						alt15=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// AS3.g:292:5: variableDefinition[$a.tree,$m.tree]
							{
							pushFollow(FOLLOW_variableDefinition_in_typeBlockEntry882);
							variableDefinition60=variableDefinition((a!=null?((LinkedListTree)a.getTree()):null), (m!=null?((LinkedListTree)m.getTree()):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDefinition60.getTree());

							}
							break;
						case 2 :
							// AS3.g:293:5: methodDefinition[$a.tree,$m.tree]
							{
							pushFollow(FOLLOW_methodDefinition_in_typeBlockEntry889);
							methodDefinition61=methodDefinition((a!=null?((LinkedListTree)a.getTree()):null), (m!=null?((LinkedListTree)m.getTree()):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDefinition61.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// AS3.g:295:4: importDefinition
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_importDefinition_in_typeBlockEntry899);
					importDefinition62=importDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, importDefinition62.getTree());

					}
					break;
				case 3 :
					// AS3.g:296:4: as2IncludeDirective
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_as2IncludeDirective_in_typeBlockEntry904);
					as2IncludeDirective63=as2IncludeDirective();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, as2IncludeDirective63.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeBlockEntry"


	public static class as2IncludeDirective_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "as2IncludeDirective"
	// AS3.g:300:1: as2IncludeDirective : INCLUDE_DIRECTIVE STRING_LITERAL ;
	public final AS3Parser.as2IncludeDirective_return as2IncludeDirective() throws RecognitionException {
		AS3Parser.as2IncludeDirective_return retval = new AS3Parser.as2IncludeDirective_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token INCLUDE_DIRECTIVE64=null;
		Token STRING_LITERAL65=null;

		LinkedListTree INCLUDE_DIRECTIVE64_tree=null;
		LinkedListTree STRING_LITERAL65_tree=null;

		try {
			// AS3.g:301:2: ( INCLUDE_DIRECTIVE STRING_LITERAL )
			// AS3.g:301:4: INCLUDE_DIRECTIVE STRING_LITERAL
			{
			root_0 = (LinkedListTree)adaptor.nil();


			INCLUDE_DIRECTIVE64=(Token)match(input,INCLUDE_DIRECTIVE,FOLLOW_INCLUDE_DIRECTIVE_in_as2IncludeDirective916); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			INCLUDE_DIRECTIVE64_tree = (LinkedListTree)adaptor.create(INCLUDE_DIRECTIVE64);
			adaptor.addChild(root_0, INCLUDE_DIRECTIVE64_tree);
			}

			STRING_LITERAL65=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_as2IncludeDirective920); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STRING_LITERAL65_tree = (LinkedListTree)adaptor.create(STRING_LITERAL65);
			adaptor.addChild(root_0, STRING_LITERAL65_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "as2IncludeDirective"


	public static class includeDirective_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "includeDirective"
	// AS3.g:305:1: includeDirective : 'include' STRING_LITERAL semi ;
	public final AS3Parser.includeDirective_return includeDirective() throws RecognitionException {
		AS3Parser.includeDirective_return retval = new AS3Parser.includeDirective_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token string_literal66=null;
		Token STRING_LITERAL67=null;
		ParserRuleReturnScope semi68 =null;

		LinkedListTree string_literal66_tree=null;
		LinkedListTree STRING_LITERAL67_tree=null;

		try {
			// AS3.g:306:2: ( 'include' STRING_LITERAL semi )
			// AS3.g:306:4: 'include' STRING_LITERAL semi
			{
			root_0 = (LinkedListTree)adaptor.nil();


			string_literal66=(Token)match(input,188,FOLLOW_188_in_includeDirective931); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal66_tree = (LinkedListTree)adaptor.create(string_literal66);
			adaptor.addChild(root_0, string_literal66_tree);
			}

			STRING_LITERAL67=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_includeDirective935); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STRING_LITERAL67_tree = (LinkedListTree)adaptor.create(STRING_LITERAL67);
			adaptor.addChild(root_0, STRING_LITERAL67_tree);
			}

			pushFollow(FOLLOW_semi_in_includeDirective939);
			semi68=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, semi68.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "includeDirective"


	public static class methodDefinition_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "methodDefinition"
	// AS3.g:312:1: methodDefinition[LinkedListTree annos, Tree mods] : FUNCTION r= optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ( block | semi ) -> ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ( block )? ) ;
	public final AS3Parser.methodDefinition_return methodDefinition(LinkedListTree annos, Tree mods) throws RecognitionException {
		AS3Parser.methodDefinition_return retval = new AS3Parser.methodDefinition_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token FUNCTION69=null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope ident70 =null;
		ParserRuleReturnScope parameterDeclarationList71 =null;
		ParserRuleReturnScope typeExpression72 =null;
		ParserRuleReturnScope block73 =null;
		ParserRuleReturnScope semi74 =null;

		LinkedListTree FUNCTION69_tree=null;
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_semi=new RewriteRuleSubtreeStream(adaptor,"rule semi");
		RewriteRuleSubtreeStream stream_parameterDeclarationList=new RewriteRuleSubtreeStream(adaptor,"rule parameterDeclarationList");
		RewriteRuleSubtreeStream stream_optionalAccessorRole=new RewriteRuleSubtreeStream(adaptor,"rule optionalAccessorRole");
		RewriteRuleSubtreeStream stream_typeExpression=new RewriteRuleSubtreeStream(adaptor,"rule typeExpression");

		try {
			// AS3.g:313:2: ( FUNCTION r= optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ( block | semi ) -> ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ( block )? ) )
			// AS3.g:313:4: FUNCTION r= optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ( block | semi )
			{
			if ( state.backtracking==0 ) { retval.start = annos.getStartToken(); }
			FUNCTION69=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_methodDefinition956); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION69);

			pushFollow(FOLLOW_optionalAccessorRole_in_methodDefinition962);
			r=optionalAccessorRole();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_optionalAccessorRole.add(r.getTree());
			if ( state.backtracking==0 ) { placeholder((r!=null?((LinkedListTree)r.getTree()):null)); }
			pushFollow(FOLLOW_ident_in_methodDefinition969);
			ident70=ident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ident.add(ident70.getTree());
			pushFollow(FOLLOW_parameterDeclarationList_in_methodDefinition973);
			parameterDeclarationList71=parameterDeclarationList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_parameterDeclarationList.add(parameterDeclarationList71.getTree());
			// AS3.g:318:3: ( typeExpression )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==COLON) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// AS3.g:318:3: typeExpression
					{
					pushFollow(FOLLOW_typeExpression_in_methodDefinition977);
					typeExpression72=typeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typeExpression.add(typeExpression72.getTree());
					}
					break;

			}

			// AS3.g:319:3: ( block | semi )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==LCURLY) ) {
				alt18=1;
			}
			else if ( (LA18_0==SEMI) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// AS3.g:319:4: block
					{
					pushFollow(FOLLOW_block_in_methodDefinition983);
					block73=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_block.add(block73.getTree());
					}
					break;
				case 2 :
					// AS3.g:319:10: semi
					{
					pushFollow(FOLLOW_semi_in_methodDefinition985);
					semi74=semi();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_semi.add(semi74.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: ident, parameterDeclarationList, optionalAccessorRole, block, typeExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 320:3: -> ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ( block )? )
			{
				// AS3.g:320:6: ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ( block )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(METHOD_DEF, "METHOD_DEF"), root_1);
				adaptor.addChild(root_1, annos);
				adaptor.addChild(root_1, mods);
				adaptor.addChild(root_1, stream_optionalAccessorRole.nextTree());
				adaptor.addChild(root_1, stream_ident.nextTree());
				adaptor.addChild(root_1, stream_parameterDeclarationList.nextTree());
				// AS3.g:323:5: ( typeExpression )?
				if ( stream_typeExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_typeExpression.nextTree());
				}
				stream_typeExpression.reset();

				// AS3.g:324:5: ( block )?
				if ( stream_block.hasNext() ) {
					adaptor.addChild(root_1, stream_block.nextTree());
				}
				stream_block.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methodDefinition"


	public static class optionalAccessorRole_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "optionalAccessorRole"
	// AS3.g:327:1: optionalAccessorRole : ( accessorRole )? -> ^( ACCESSOR_ROLE ( accessorRole )? ) ;
	public final AS3Parser.optionalAccessorRole_return optionalAccessorRole() throws RecognitionException {
		AS3Parser.optionalAccessorRole_return retval = new AS3Parser.optionalAccessorRole_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope accessorRole75 =null;

		RewriteRuleSubtreeStream stream_accessorRole=new RewriteRuleSubtreeStream(adaptor,"rule accessorRole");

		try {
			// AS3.g:328:2: ( ( accessorRole )? -> ^( ACCESSOR_ROLE ( accessorRole )? ) )
			// AS3.g:328:4: ( accessorRole )?
			{
			// AS3.g:328:4: ( accessorRole )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==GET) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==AS||LA19_1==DYNAMIC||LA19_1==GET||LA19_1==IDENT||LA19_1==IS||LA19_1==NAMESPACE||LA19_1==SET||LA19_1==USE||LA19_1==XML) ) {
					alt19=1;
				}
			}
			else if ( (LA19_0==SET) ) {
				int LA19_9 = input.LA(2);
				if ( (LA19_9==AS||LA19_9==DYNAMIC||LA19_9==GET||LA19_9==IDENT||LA19_9==IS||LA19_9==NAMESPACE||LA19_9==SET||LA19_9==USE||LA19_9==XML) ) {
					alt19=1;
				}
			}
			switch (alt19) {
				case 1 :
					// AS3.g:328:4: accessorRole
					{
					pushFollow(FOLLOW_accessorRole_in_optionalAccessorRole1051);
					accessorRole75=accessorRole();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_accessorRole.add(accessorRole75.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: accessorRole
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 329:3: -> ^( ACCESSOR_ROLE ( accessorRole )? )
			{
				// AS3.g:329:6: ^( ACCESSOR_ROLE ( accessorRole )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ACCESSOR_ROLE, "ACCESSOR_ROLE"), root_1);
				// AS3.g:329:22: ( accessorRole )?
				if ( stream_accessorRole.hasNext() ) {
					adaptor.addChild(root_1, stream_accessorRole.nextTree());
				}
				stream_accessorRole.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optionalAccessorRole"


	public static class accessorRole_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "accessorRole"
	// AS3.g:332:1: accessorRole : ( GET | SET );
	public final AS3Parser.accessorRole_return accessorRole() throws RecognitionException {
		AS3Parser.accessorRole_return retval = new AS3Parser.accessorRole_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set76=null;

		LinkedListTree set76_tree=null;

		try {
			// AS3.g:333:2: ( GET | SET )
			// AS3.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set76=input.LT(1);
			if ( input.LA(1)==GET||input.LA(1)==SET ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set76));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "accessorRole"


	public static class namespaceDefinition_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "namespaceDefinition"
	// AS3.g:336:1: namespaceDefinition[LinkedListTree annos, Tree mods] : NAMESPACE ident -> ^( NAMESPACE_DEF NAMESPACE ident ) ;
	public final AS3Parser.namespaceDefinition_return namespaceDefinition(LinkedListTree annos, Tree mods) throws RecognitionException {
		AS3Parser.namespaceDefinition_return retval = new AS3Parser.namespaceDefinition_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token NAMESPACE77=null;
		ParserRuleReturnScope ident78 =null;

		LinkedListTree NAMESPACE77_tree=null;
		RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");

		try {
			// AS3.g:337:2: ( NAMESPACE ident -> ^( NAMESPACE_DEF NAMESPACE ident ) )
			// AS3.g:337:4: NAMESPACE ident
			{
			NAMESPACE77=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceDefinition1090); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAMESPACE.add(NAMESPACE77);

			pushFollow(FOLLOW_ident_in_namespaceDefinition1092);
			ident78=ident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ident.add(ident78.getTree());

			// AST REWRITE
			// elements: ident, NAMESPACE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 338:3: -> ^( NAMESPACE_DEF NAMESPACE ident )
			{
				// AS3.g:338:6: ^( NAMESPACE_DEF NAMESPACE ident )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(NAMESPACE_DEF, "NAMESPACE_DEF"), root_1);
				adaptor.addChild(root_1, annos);
				adaptor.addChild(root_1, mods);
				adaptor.addChild(root_1, stream_NAMESPACE.nextNode());
				adaptor.addChild(root_1, stream_ident.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namespaceDefinition"


	public static class useNamespaceDirective_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "useNamespaceDirective"
	// AS3.g:341:1: useNamespaceDirective : USE NAMESPACE ident semi ;
	public final AS3Parser.useNamespaceDirective_return useNamespaceDirective() throws RecognitionException {
		AS3Parser.useNamespaceDirective_return retval = new AS3Parser.useNamespaceDirective_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token USE79=null;
		Token NAMESPACE80=null;
		ParserRuleReturnScope ident81 =null;
		ParserRuleReturnScope semi82 =null;

		LinkedListTree USE79_tree=null;
		LinkedListTree NAMESPACE80_tree=null;

		try {
			// AS3.g:342:2: ( USE NAMESPACE ident semi )
			// AS3.g:342:4: USE NAMESPACE ident semi
			{
			root_0 = (LinkedListTree)adaptor.nil();


			USE79=(Token)match(input,USE,FOLLOW_USE_in_useNamespaceDirective1119); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			USE79_tree = (LinkedListTree)adaptor.create(USE79);
			adaptor.addChild(root_0, USE79_tree);
			}

			NAMESPACE80=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_useNamespaceDirective1121); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NAMESPACE80_tree = (LinkedListTree)adaptor.create(NAMESPACE80);
			adaptor.addChild(root_0, NAMESPACE80_tree);
			}

			pushFollow(FOLLOW_ident_in_useNamespaceDirective1123);
			ident81=ident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ident81.getTree());

			pushFollow(FOLLOW_semi_in_useNamespaceDirective1125);
			semi82=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, semi82.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "useNamespaceDirective"


	public static class variableDefinition_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "variableDefinition"
	// AS3.g:345:1: variableDefinition[LinkedListTree annos, Tree mods] : decl= varOrConst variableDeclarator ( COMMA variableDeclarator )* semi -> ^( VAR_DEF $decl ( variableDeclarator )+ ) ;
	public final AS3Parser.variableDefinition_return variableDefinition(LinkedListTree annos, Tree mods) throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.variableDefinition_return retval = new AS3Parser.variableDefinition_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token COMMA84=null;
		ParserRuleReturnScope decl =null;
		ParserRuleReturnScope variableDeclarator83 =null;
		ParserRuleReturnScope variableDeclarator85 =null;
		ParserRuleReturnScope semi86 =null;

		LinkedListTree COMMA84_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
		RewriteRuleSubtreeStream stream_semi=new RewriteRuleSubtreeStream(adaptor,"rule semi");
		RewriteRuleSubtreeStream stream_varOrConst=new RewriteRuleSubtreeStream(adaptor,"rule varOrConst");


			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:350:2: (decl= varOrConst variableDeclarator ( COMMA variableDeclarator )* semi -> ^( VAR_DEF $decl ( variableDeclarator )+ ) )
			// AS3.g:350:4: decl= varOrConst variableDeclarator ( COMMA variableDeclarator )* semi
			{
			pushFollow(FOLLOW_varOrConst_in_variableDefinition1149);
			decl=varOrConst();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_varOrConst.add(decl.getTree());
			pushFollow(FOLLOW_variableDeclarator_in_variableDefinition1151);
			variableDeclarator83=variableDeclarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator83.getTree());
			// AS3.g:351:3: ( COMMA variableDeclarator )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==COMMA) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// AS3.g:351:4: COMMA variableDeclarator
					{
					COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableDefinition1156); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA84);

					pushFollow(FOLLOW_variableDeclarator_in_variableDefinition1158);
					variableDeclarator85=variableDeclarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator85.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			pushFollow(FOLLOW_semi_in_variableDefinition1164);
			semi86=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_semi.add(semi86.getTree());

			// AST REWRITE
			// elements: variableDeclarator, decl
			// token labels: 
			// rule labels: decl, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl",decl!=null?decl.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 353:3: -> ^( VAR_DEF $decl ( variableDeclarator )+ )
			{
				// AS3.g:353:6: ^( VAR_DEF $decl ( variableDeclarator )+ )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(VAR_DEF, "VAR_DEF"), root_1);
				adaptor.addChild(root_1, annos);
				adaptor.addChild(root_1, mods);
				adaptor.addChild(root_1, stream_decl.nextTree());
				if ( !(stream_variableDeclarator.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_variableDeclarator.hasNext() ) {
					adaptor.addChild(root_1, stream_variableDeclarator.nextTree());
				}
				stream_variableDeclarator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "variableDefinition"


	public static class varOrConst_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "varOrConst"
	// AS3.g:356:1: varOrConst : ( VAR | CONST );
	public final AS3Parser.varOrConst_return varOrConst() throws RecognitionException {
		AS3Parser.varOrConst_return retval = new AS3Parser.varOrConst_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set87=null;

		LinkedListTree set87_tree=null;

		try {
			// AS3.g:357:2: ( VAR | CONST )
			// AS3.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set87=input.LT(1);
			if ( input.LA(1)==CONST||input.LA(1)==VAR ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set87));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varOrConst"


	public static class variableDeclarator_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarator"
	// AS3.g:360:1: variableDeclarator : ident ^ ( typeExpression )? ( variableInitializer )? ;
	public final AS3Parser.variableDeclarator_return variableDeclarator() throws RecognitionException {
		AS3Parser.variableDeclarator_return retval = new AS3Parser.variableDeclarator_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope ident88 =null;
		ParserRuleReturnScope typeExpression89 =null;
		ParserRuleReturnScope variableInitializer90 =null;


		try {
			// AS3.g:361:2: ( ident ^ ( typeExpression )? ( variableInitializer )? )
			// AS3.g:361:4: ident ^ ( typeExpression )? ( variableInitializer )?
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_ident_in_variableDeclarator1208);
			ident88=ident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(ident88.getTree(), root_0);
			// AS3.g:361:11: ( typeExpression )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==COLON) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// AS3.g:361:11: typeExpression
					{
					pushFollow(FOLLOW_typeExpression_in_variableDeclarator1211);
					typeExpression89=typeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExpression89.getTree());

					}
					break;

			}

			// AS3.g:361:27: ( variableInitializer )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ASSIGN) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// AS3.g:361:27: variableInitializer
					{
					pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1214);
					variableInitializer90=variableInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer90.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDeclarator"


	public static class declaration_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// AS3.g:363:1: declaration : varOrConst ^ variableDeclarator declarationTail ;
	public final AS3Parser.declaration_return declaration() throws RecognitionException {
		AS3Parser.declaration_return retval = new AS3Parser.declaration_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope varOrConst91 =null;
		ParserRuleReturnScope variableDeclarator92 =null;
		ParserRuleReturnScope declarationTail93 =null;


		try {
			// AS3.g:364:2: ( varOrConst ^ variableDeclarator declarationTail )
			// AS3.g:364:4: varOrConst ^ variableDeclarator declarationTail
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_varOrConst_in_declaration1225);
			varOrConst91=varOrConst();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(varOrConst91.getTree(), root_0);
			pushFollow(FOLLOW_variableDeclarator_in_declaration1228);
			variableDeclarator92=variableDeclarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator92.getTree());

			pushFollow(FOLLOW_declarationTail_in_declaration1232);
			declarationTail93=declarationTail();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declarationTail93.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class declarationTail_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "declarationTail"
	// AS3.g:368:1: declarationTail : ( COMMA ! variableDeclarator )* ;
	public final AS3Parser.declarationTail_return declarationTail() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.declarationTail_return retval = new AS3Parser.declarationTail_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token COMMA94=null;
		ParserRuleReturnScope variableDeclarator95 =null;

		LinkedListTree COMMA94_tree=null;


			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:373:2: ( ( COMMA ! variableDeclarator )* )
			// AS3.g:373:4: ( COMMA ! variableDeclarator )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			// AS3.g:373:4: ( COMMA ! variableDeclarator )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// AS3.g:373:5: COMMA ! variableDeclarator
					{
					COMMA94=(Token)match(input,COMMA,FOLLOW_COMMA_in_declarationTail1254); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclarator_in_declarationTail1257);
					variableDeclarator95=variableDeclarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator95.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "declarationTail"


	public static class variableInitializer_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "variableInitializer"
	// AS3.g:376:1: variableInitializer : ASSIGN ^ assignmentExpression ;
	public final AS3Parser.variableInitializer_return variableInitializer() throws RecognitionException {
		AS3Parser.variableInitializer_return retval = new AS3Parser.variableInitializer_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token ASSIGN96=null;
		ParserRuleReturnScope assignmentExpression97 =null;

		LinkedListTree ASSIGN96_tree=null;

		try {
			// AS3.g:377:2: ( ASSIGN ^ assignmentExpression )
			// AS3.g:377:4: ASSIGN ^ assignmentExpression
			{
			root_0 = (LinkedListTree)adaptor.nil();


			ASSIGN96=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableInitializer1270); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN96_tree = (LinkedListTree)adaptor.create(ASSIGN96);
			root_0 = (LinkedListTree)adaptor.becomeRoot(ASSIGN96_tree, root_0);
			}

			pushFollow(FOLLOW_assignmentExpression_in_variableInitializer1273);
			assignmentExpression97=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression97.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableInitializer"


	public static class parameterDeclarationList_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "parameterDeclarationList"
	// AS3.g:382:1: parameterDeclarationList : LPAREN ( parameterDeclaration ( COMMA parameterDeclaration )* )? RPAREN -> ^( PARAMS ( parameterDeclaration )* ) ;
	public final AS3Parser.parameterDeclarationList_return parameterDeclarationList() throws RecognitionException {
		AS3Parser.parameterDeclarationList_return retval = new AS3Parser.parameterDeclarationList_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LPAREN98=null;
		Token COMMA100=null;
		Token RPAREN102=null;
		ParserRuleReturnScope parameterDeclaration99 =null;
		ParserRuleReturnScope parameterDeclaration101 =null;

		LinkedListTree LPAREN98_tree=null;
		LinkedListTree COMMA100_tree=null;
		LinkedListTree RPAREN102_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_parameterDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule parameterDeclaration");

		try {
			// AS3.g:383:2: ( LPAREN ( parameterDeclaration ( COMMA parameterDeclaration )* )? RPAREN -> ^( PARAMS ( parameterDeclaration )* ) )
			// AS3.g:383:4: LPAREN ( parameterDeclaration ( COMMA parameterDeclaration )* )? RPAREN
			{
			LPAREN98=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameterDeclarationList1286); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN98);

			// AS3.g:384:3: ( parameterDeclaration ( COMMA parameterDeclaration )* )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==AS||LA25_0==CONST||LA25_0==DYNAMIC||LA25_0==GET||LA25_0==IDENT||LA25_0==IS||LA25_0==NAMESPACE||LA25_0==REST||LA25_0==SET||LA25_0==USE||LA25_0==XML) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// AS3.g:384:5: parameterDeclaration ( COMMA parameterDeclaration )*
					{
					pushFollow(FOLLOW_parameterDeclaration_in_parameterDeclarationList1292);
					parameterDeclaration99=parameterDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameterDeclaration.add(parameterDeclaration99.getTree());
					// AS3.g:385:4: ( COMMA parameterDeclaration )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==COMMA) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// AS3.g:385:5: COMMA parameterDeclaration
							{
							COMMA100=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameterDeclarationList1298); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA100);

							pushFollow(FOLLOW_parameterDeclaration_in_parameterDeclarationList1300);
							parameterDeclaration101=parameterDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_parameterDeclaration.add(parameterDeclaration101.getTree());
							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;

			}

			RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameterDeclarationList1311); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN102);


			// AST REWRITE
			// elements: parameterDeclaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 388:3: -> ^( PARAMS ( parameterDeclaration )* )
			{
				// AS3.g:388:6: ^( PARAMS ( parameterDeclaration )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PARAMS, "PARAMS"), root_1);
				// AS3.g:388:15: ( parameterDeclaration )*
				while ( stream_parameterDeclaration.hasNext() ) {
					adaptor.addChild(root_1, stream_parameterDeclaration.nextTree());
				}
				stream_parameterDeclaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameterDeclarationList"


	public static class parameterDeclaration_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "parameterDeclaration"
	// AS3.g:392:1: parameterDeclaration : ( basicParameterDeclaration | parameterRestDeclaration );
	public final AS3Parser.parameterDeclaration_return parameterDeclaration() throws RecognitionException {
		AS3Parser.parameterDeclaration_return retval = new AS3Parser.parameterDeclaration_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope basicParameterDeclaration103 =null;
		ParserRuleReturnScope parameterRestDeclaration104 =null;


		try {
			// AS3.g:393:2: ( basicParameterDeclaration | parameterRestDeclaration )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==AS||LA26_0==CONST||LA26_0==DYNAMIC||LA26_0==GET||LA26_0==IDENT||LA26_0==IS||LA26_0==NAMESPACE||LA26_0==SET||LA26_0==USE||LA26_0==XML) ) {
				alt26=1;
			}
			else if ( (LA26_0==REST) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// AS3.g:393:4: basicParameterDeclaration
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_basicParameterDeclaration_in_parameterDeclaration1334);
					basicParameterDeclaration103=basicParameterDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, basicParameterDeclaration103.getTree());

					}
					break;
				case 2 :
					// AS3.g:393:32: parameterRestDeclaration
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_parameterRestDeclaration_in_parameterDeclaration1338);
					parameterRestDeclaration104=parameterRestDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameterRestDeclaration104.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameterDeclaration"


	public static class basicParameterDeclaration_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "basicParameterDeclaration"
	// AS3.g:396:1: basicParameterDeclaration : ( CONST )? ident ( typeExpression )? ( parameterDefault )? -> ^( PARAM ( CONST )? ident ( typeExpression )? ( parameterDefault )? ) ;
	public final AS3Parser.basicParameterDeclaration_return basicParameterDeclaration() throws RecognitionException {
		AS3Parser.basicParameterDeclaration_return retval = new AS3Parser.basicParameterDeclaration_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token CONST105=null;
		ParserRuleReturnScope ident106 =null;
		ParserRuleReturnScope typeExpression107 =null;
		ParserRuleReturnScope parameterDefault108 =null;

		LinkedListTree CONST105_tree=null;
		RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_parameterDefault=new RewriteRuleSubtreeStream(adaptor,"rule parameterDefault");
		RewriteRuleSubtreeStream stream_typeExpression=new RewriteRuleSubtreeStream(adaptor,"rule typeExpression");

		try {
			// AS3.g:397:2: ( ( CONST )? ident ( typeExpression )? ( parameterDefault )? -> ^( PARAM ( CONST )? ident ( typeExpression )? ( parameterDefault )? ) )
			// AS3.g:397:4: ( CONST )? ident ( typeExpression )? ( parameterDefault )?
			{
			// AS3.g:397:4: ( CONST )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==CONST) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// AS3.g:397:4: CONST
					{
					CONST105=(Token)match(input,CONST,FOLLOW_CONST_in_basicParameterDeclaration1349); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CONST.add(CONST105);

					}
					break;

			}

			pushFollow(FOLLOW_ident_in_basicParameterDeclaration1352);
			ident106=ident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ident.add(ident106.getTree());
			// AS3.g:397:17: ( typeExpression )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==COLON) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// AS3.g:397:17: typeExpression
					{
					pushFollow(FOLLOW_typeExpression_in_basicParameterDeclaration1354);
					typeExpression107=typeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typeExpression.add(typeExpression107.getTree());
					}
					break;

			}

			// AS3.g:397:33: ( parameterDefault )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ASSIGN) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// AS3.g:397:33: parameterDefault
					{
					pushFollow(FOLLOW_parameterDefault_in_basicParameterDeclaration1357);
					parameterDefault108=parameterDefault();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameterDefault.add(parameterDefault108.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: parameterDefault, CONST, ident, typeExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 398:3: -> ^( PARAM ( CONST )? ident ( typeExpression )? ( parameterDefault )? )
			{
				// AS3.g:398:6: ^( PARAM ( CONST )? ident ( typeExpression )? ( parameterDefault )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PARAM, "PARAM"), root_1);
				// AS3.g:398:14: ( CONST )?
				if ( stream_CONST.hasNext() ) {
					adaptor.addChild(root_1, stream_CONST.nextNode());
				}
				stream_CONST.reset();

				adaptor.addChild(root_1, stream_ident.nextTree());
				// AS3.g:398:27: ( typeExpression )?
				if ( stream_typeExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_typeExpression.nextTree());
				}
				stream_typeExpression.reset();

				// AS3.g:398:43: ( parameterDefault )?
				if ( stream_parameterDefault.hasNext() ) {
					adaptor.addChild(root_1, stream_parameterDefault.nextTree());
				}
				stream_parameterDefault.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "basicParameterDeclaration"


	public static class parameterDefault_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "parameterDefault"
	// AS3.g:401:1: parameterDefault : ASSIGN ^ assignmentExpression ;
	public final AS3Parser.parameterDefault_return parameterDefault() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.parameterDefault_return retval = new AS3Parser.parameterDefault_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token ASSIGN109=null;
		ParserRuleReturnScope assignmentExpression110 =null;

		LinkedListTree ASSIGN109_tree=null;


			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:407:2: ( ASSIGN ^ assignmentExpression )
			// AS3.g:407:4: ASSIGN ^ assignmentExpression
			{
			root_0 = (LinkedListTree)adaptor.nil();


			ASSIGN109=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_parameterDefault1401); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN109_tree = (LinkedListTree)adaptor.create(ASSIGN109);
			root_0 = (LinkedListTree)adaptor.becomeRoot(ASSIGN109_tree, root_0);
			}

			pushFollow(FOLLOW_assignmentExpression_in_parameterDefault1404);
			assignmentExpression110=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression110.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "parameterDefault"


	public static class parameterRestDeclaration_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "parameterRestDeclaration"
	// AS3.g:410:1: parameterRestDeclaration : REST ( ident )? -> ^( PARAM REST ( ident )? ) ;
	public final AS3Parser.parameterRestDeclaration_return parameterRestDeclaration() throws RecognitionException {
		AS3Parser.parameterRestDeclaration_return retval = new AS3Parser.parameterRestDeclaration_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token REST111=null;
		ParserRuleReturnScope ident112 =null;

		LinkedListTree REST111_tree=null;
		RewriteRuleTokenStream stream_REST=new RewriteRuleTokenStream(adaptor,"token REST");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");

		try {
			// AS3.g:411:2: ( REST ( ident )? -> ^( PARAM REST ( ident )? ) )
			// AS3.g:411:4: REST ( ident )?
			{
			REST111=(Token)match(input,REST,FOLLOW_REST_in_parameterRestDeclaration1415); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_REST.add(REST111);

			// AS3.g:411:9: ( ident )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==AS||LA30_0==DYNAMIC||LA30_0==GET||LA30_0==IDENT||LA30_0==IS||LA30_0==NAMESPACE||LA30_0==SET||LA30_0==USE||LA30_0==XML) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// AS3.g:411:9: ident
					{
					pushFollow(FOLLOW_ident_in_parameterRestDeclaration1417);
					ident112=ident();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ident.add(ident112.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: REST, ident
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 412:3: -> ^( PARAM REST ( ident )? )
			{
				// AS3.g:412:6: ^( PARAM REST ( ident )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PARAM, "PARAM"), root_1);
				adaptor.addChild(root_1, stream_REST.nextNode());
				// AS3.g:412:19: ( ident )?
				if ( stream_ident.hasNext() ) {
					adaptor.addChild(root_1, stream_ident.nextTree());
				}
				stream_ident.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameterRestDeclaration"


	public static class block_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// AS3.g:414:1: block : LCURLY ( blockEntry )* RCURLY -> ^( BLOCK ( blockEntry )* ) ;
	public final AS3Parser.block_return block() throws RecognitionException {
		AS3Parser.block_return retval = new AS3Parser.block_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LCURLY113=null;
		Token RCURLY115=null;
		ParserRuleReturnScope blockEntry114 =null;

		LinkedListTree LCURLY113_tree=null;
		LinkedListTree RCURLY115_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_blockEntry=new RewriteRuleSubtreeStream(adaptor,"rule blockEntry");

		try {
			// AS3.g:415:2: ( LCURLY ( blockEntry )* RCURLY -> ^( BLOCK ( blockEntry )* ) )
			// AS3.g:415:4: LCURLY ( blockEntry )* RCURLY
			{
			LCURLY113=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block1441); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY113);

			// AS3.g:415:11: ( blockEntry )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==AS||LA31_0==BNOT||LA31_0==BREAK||(LA31_0 >= CONST && LA31_0 <= CONTINUE)||(LA31_0 >= DEC && LA31_0 <= DEFAULT)||(LA31_0 >= DELETE && LA31_0 <= DIV)||LA31_0==DO||(LA31_0 >= DYNAMIC && LA31_0 <= E4X_ATTRI)||LA31_0==FALSE||(LA31_0 >= FLOAT_LITERAL && LA31_0 <= FOR)||LA31_0==FUNCTION||LA31_0==GET||(LA31_0 >= HEX_LITERAL && LA31_0 <= IDENT)||LA31_0==IF||LA31_0==INC||(LA31_0 >= INTERNAL && LA31_0 <= IS)||(LA31_0 >= LBRACK && LA31_0 <= LCURLY)||LA31_0==LNOT||(LA31_0 >= LPAREN && LA31_0 <= LT)||LA31_0==MINUS||LA31_0==NAMESPACE||LA31_0==NEW||LA31_0==NULL||LA31_0==OCTAL_LITERAL||LA31_0==PLUS||LA31_0==PRIVATE||(LA31_0 >= PROTECTED && LA31_0 <= PUBLIC)||LA31_0==RETURN||(LA31_0 >= SEMI && LA31_0 <= SET)||(LA31_0 >= STRING_LITERAL && LA31_0 <= SWITCH)||(LA31_0 >= THROW && LA31_0 <= TYPEOF)||LA31_0==UNDEFINED||(LA31_0 >= USE && LA31_0 <= VAR)||(LA31_0 >= VOID && LA31_0 <= WITH)||LA31_0==XML) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// AS3.g:415:11: blockEntry
					{
					pushFollow(FOLLOW_blockEntry_in_block1443);
					blockEntry114=blockEntry();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_blockEntry.add(blockEntry114.getTree());
					}
					break;

				default :
					break loop31;
				}
			}

			RCURLY115=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block1446); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY115);


			// AST REWRITE
			// elements: blockEntry
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 416:3: -> ^( BLOCK ( blockEntry )* )
			{
				// AS3.g:416:6: ^( BLOCK ( blockEntry )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				// AS3.g:416:14: ( blockEntry )*
				while ( stream_blockEntry.hasNext() ) {
					adaptor.addChild(root_1, stream_blockEntry.nextTree());
				}
				stream_blockEntry.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class blockEntry_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "blockEntry"
	// AS3.g:419:1: blockEntry : statement ;
	public final AS3Parser.blockEntry_return blockEntry() throws RecognitionException {
		AS3Parser.blockEntry_return retval = new AS3Parser.blockEntry_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope statement116 =null;


		try {
			// AS3.g:420:2: ( statement )
			// AS3.g:427:6: statement
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_statement_in_blockEntry1470);
			statement116=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement116.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blockEntry"


	public static class condition_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// AS3.g:430:1: condition : LPAREN expression RPAREN -> ^( CONDITION expression ) ;
	public final AS3Parser.condition_return condition() throws RecognitionException {
		AS3Parser.condition_return retval = new AS3Parser.condition_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LPAREN117=null;
		Token RPAREN119=null;
		ParserRuleReturnScope expression118 =null;

		LinkedListTree LPAREN117_tree=null;
		LinkedListTree RPAREN119_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// AS3.g:431:2: ( LPAREN expression RPAREN -> ^( CONDITION expression ) )
			// AS3.g:431:4: LPAREN expression RPAREN
			{
			LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_condition1481); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN117);

			pushFollow(FOLLOW_expression_in_condition1483);
			expression118=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression118.getTree());
			RPAREN119=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_condition1485); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN119);


			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 432:3: -> ^( CONDITION expression )
			{
				// AS3.g:432:6: ^( CONDITION expression )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(CONDITION, "CONDITION"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class statement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// AS3.g:435:1: statement : ( superStatement | ( LCURLY )=> block | declarationStatement | expressionStatement | ifStatement | forEachStatement | forStatement | whileStatement | doWhileStatement | withStatement | switchStatement | breakStatement | continueStatement | returnStatement | throwStatement | tryStatement | defaultXMLNamespaceStatement | SEMI !);
	public final AS3Parser.statement_return statement() throws RecognitionException {
		AS3Parser.statement_return retval = new AS3Parser.statement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token SEMI137=null;
		ParserRuleReturnScope superStatement120 =null;
		ParserRuleReturnScope block121 =null;
		ParserRuleReturnScope declarationStatement122 =null;
		ParserRuleReturnScope expressionStatement123 =null;
		ParserRuleReturnScope ifStatement124 =null;
		ParserRuleReturnScope forEachStatement125 =null;
		ParserRuleReturnScope forStatement126 =null;
		ParserRuleReturnScope whileStatement127 =null;
		ParserRuleReturnScope doWhileStatement128 =null;
		ParserRuleReturnScope withStatement129 =null;
		ParserRuleReturnScope switchStatement130 =null;
		ParserRuleReturnScope breakStatement131 =null;
		ParserRuleReturnScope continueStatement132 =null;
		ParserRuleReturnScope returnStatement133 =null;
		ParserRuleReturnScope throwStatement134 =null;
		ParserRuleReturnScope tryStatement135 =null;
		ParserRuleReturnScope defaultXMLNamespaceStatement136 =null;

		LinkedListTree SEMI137_tree=null;

		try {
			// AS3.g:436:2: ( superStatement | ( LCURLY )=> block | declarationStatement | expressionStatement | ifStatement | forEachStatement | forStatement | whileStatement | doWhileStatement | withStatement | switchStatement | breakStatement | continueStatement | returnStatement | throwStatement | tryStatement | defaultXMLNamespaceStatement | SEMI !)
			int alt32=18;
			alt32 = dfa32.predict(input);
			switch (alt32) {
				case 1 :
					// AS3.g:436:4: superStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_superStatement_in_statement1506);
					superStatement120=superStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, superStatement120.getTree());

					}
					break;
				case 2 :
					// AS3.g:437:4: ( LCURLY )=> block
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_block_in_statement1516);
					block121=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block121.getTree());

					}
					break;
				case 3 :
					// AS3.g:438:4: declarationStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_declarationStatement_in_statement1521);
					declarationStatement122=declarationStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declarationStatement122.getTree());

					}
					break;
				case 4 :
					// AS3.g:439:4: expressionStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_expressionStatement_in_statement1526);
					expressionStatement123=expressionStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStatement123.getTree());

					}
					break;
				case 5 :
					// AS3.g:440:4: ifStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement1531);
					ifStatement124=ifStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement124.getTree());

					}
					break;
				case 6 :
					// AS3.g:442:4: forEachStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_forEachStatement_in_statement1538);
					forEachStatement125=forEachStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forEachStatement125.getTree());

					}
					break;
				case 7 :
					// AS3.g:443:4: forStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement1543);
					forStatement126=forStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatement126.getTree());

					}
					break;
				case 8 :
					// AS3.g:446:4: whileStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement1551);
					whileStatement127=whileStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement127.getTree());

					}
					break;
				case 9 :
					// AS3.g:449:4: doWhileStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_doWhileStatement_in_statement1559);
					doWhileStatement128=doWhileStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileStatement128.getTree());

					}
					break;
				case 10 :
					// AS3.g:452:4: withStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_withStatement_in_statement1568);
					withStatement129=withStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withStatement129.getTree());

					}
					break;
				case 11 :
					// AS3.g:455:4: switchStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_switchStatement_in_statement1577);
					switchStatement130=switchStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStatement130.getTree());

					}
					break;
				case 12 :
					// AS3.g:458:4: breakStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_breakStatement_in_statement1586);
					breakStatement131=breakStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, breakStatement131.getTree());

					}
					break;
				case 13 :
					// AS3.g:461:4: continueStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_continueStatement_in_statement1594);
					continueStatement132=continueStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, continueStatement132.getTree());

					}
					break;
				case 14 :
					// AS3.g:464:4: returnStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_returnStatement_in_statement1602);
					returnStatement133=returnStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatement133.getTree());

					}
					break;
				case 15 :
					// AS3.g:467:4: throwStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_throwStatement_in_statement1610);
					throwStatement134=throwStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, throwStatement134.getTree());

					}
					break;
				case 16 :
					// AS3.g:470:4: tryStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_tryStatement_in_statement1619);
					tryStatement135=tryStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryStatement135.getTree());

					}
					break;
				case 17 :
					// AS3.g:473:4: defaultXMLNamespaceStatement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_defaultXMLNamespaceStatement_in_statement1628);
					defaultXMLNamespaceStatement136=defaultXMLNamespaceStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultXMLNamespaceStatement136.getTree());

					}
					break;
				case 18 :
					// AS3.g:476:4: SEMI !
					{
					root_0 = (LinkedListTree)adaptor.nil();


					SEMI137=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1636); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class superStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "superStatement"
	// AS3.g:479:1: superStatement : SUPER ^ arguments semi ;
	public final AS3Parser.superStatement_return superStatement() throws RecognitionException {
		AS3Parser.superStatement_return retval = new AS3Parser.superStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token SUPER138=null;
		ParserRuleReturnScope arguments139 =null;
		ParserRuleReturnScope semi140 =null;

		LinkedListTree SUPER138_tree=null;

		try {
			// AS3.g:480:2: ( SUPER ^ arguments semi )
			// AS3.g:480:4: SUPER ^ arguments semi
			{
			root_0 = (LinkedListTree)adaptor.nil();


			SUPER138=(Token)match(input,SUPER,FOLLOW_SUPER_in_superStatement1648); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SUPER138_tree = (LinkedListTree)adaptor.create(SUPER138);
			root_0 = (LinkedListTree)adaptor.becomeRoot(SUPER138_tree, root_0);
			}

			pushFollow(FOLLOW_arguments_in_superStatement1651);
			arguments139=arguments();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments139.getTree());

			pushFollow(FOLLOW_semi_in_superStatement1653);
			semi140=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, semi140.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "superStatement"


	public static class declarationStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "declarationStatement"
	// AS3.g:483:1: declarationStatement : declaration semi ;
	public final AS3Parser.declarationStatement_return declarationStatement() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.declarationStatement_return retval = new AS3Parser.declarationStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope declaration141 =null;
		ParserRuleReturnScope semi142 =null;



			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:488:2: ( declaration semi )
			// AS3.g:488:4: declaration semi
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_declaration_in_declarationStatement1674);
			declaration141=declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration141.getTree());

			pushFollow(FOLLOW_semi_in_declarationStatement1676);
			semi142=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, semi142.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "declarationStatement"


	public static class expressionStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "expressionStatement"
	// AS3.g:491:1: expressionStatement : expressionList semi -> ^( EXPR_STMNT expressionList ) ;
	public final AS3Parser.expressionStatement_return expressionStatement() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.expressionStatement_return retval = new AS3Parser.expressionStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope expressionList143 =null;
		ParserRuleReturnScope semi144 =null;

		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
		RewriteRuleSubtreeStream stream_semi=new RewriteRuleSubtreeStream(adaptor,"rule semi");


			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:496:2: ( expressionList semi -> ^( EXPR_STMNT expressionList ) )
			// AS3.g:496:4: expressionList semi
			{
			pushFollow(FOLLOW_expressionList_in_expressionStatement1697);
			expressionList143=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionList.add(expressionList143.getTree());
			pushFollow(FOLLOW_semi_in_expressionStatement1699);
			semi144=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_semi.add(semi144.getTree());

			// AST REWRITE
			// elements: expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 497:3: -> ^( EXPR_STMNT expressionList )
			{
				// AS3.g:497:6: ^( EXPR_STMNT expressionList )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(EXPR_STMNT, "EXPR_STMNT"), root_1);
				adaptor.addChild(root_1, stream_expressionList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "expressionStatement"


	public static class ifStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// AS3.g:500:1: ifStatement : IF ^ condition statement ( ( ELSE )=> elseClause )? ;
	public final AS3Parser.ifStatement_return ifStatement() throws RecognitionException {
		AS3Parser.ifStatement_return retval = new AS3Parser.ifStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token IF145=null;
		ParserRuleReturnScope condition146 =null;
		ParserRuleReturnScope statement147 =null;
		ParserRuleReturnScope elseClause148 =null;

		LinkedListTree IF145_tree=null;

		try {
			// AS3.g:501:2: ( IF ^ condition statement ( ( ELSE )=> elseClause )? )
			// AS3.g:501:4: IF ^ condition statement ( ( ELSE )=> elseClause )?
			{
			root_0 = (LinkedListTree)adaptor.nil();


			IF145=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1721); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF145_tree = (LinkedListTree)adaptor.create(IF145);
			root_0 = (LinkedListTree)adaptor.becomeRoot(IF145_tree, root_0);
			}

			pushFollow(FOLLOW_condition_in_ifStatement1724);
			condition146=condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, condition146.getTree());

			pushFollow(FOLLOW_statement_in_ifStatement1726);
			statement147=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement147.getTree());

			// AS3.g:502:3: ( ( ELSE )=> elseClause )?
			int alt33=2;
			alt33 = dfa33.predict(input);
			switch (alt33) {
				case 1 :
					// AS3.g:502:4: ( ELSE )=> elseClause
					{
					pushFollow(FOLLOW_elseClause_in_ifStatement1735);
					elseClause148=elseClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elseClause148.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class elseClause_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "elseClause"
	// AS3.g:505:1: elseClause : ELSE ^ statement ;
	public final AS3Parser.elseClause_return elseClause() throws RecognitionException {
		AS3Parser.elseClause_return retval = new AS3Parser.elseClause_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token ELSE149=null;
		ParserRuleReturnScope statement150 =null;

		LinkedListTree ELSE149_tree=null;

		try {
			// AS3.g:506:2: ( ELSE ^ statement )
			// AS3.g:506:4: ELSE ^ statement
			{
			root_0 = (LinkedListTree)adaptor.nil();


			ELSE149=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseClause1748); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ELSE149_tree = (LinkedListTree)adaptor.create(ELSE149);
			root_0 = (LinkedListTree)adaptor.becomeRoot(ELSE149_tree, root_0);
			}

			pushFollow(FOLLOW_statement_in_elseClause1751);
			statement150=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement150.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseClause"


	public static class throwStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "throwStatement"
	// AS3.g:509:1: throwStatement : THROW ^ expression semi !;
	public final AS3Parser.throwStatement_return throwStatement() throws RecognitionException {
		AS3Parser.throwStatement_return retval = new AS3Parser.throwStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token THROW151=null;
		ParserRuleReturnScope expression152 =null;
		ParserRuleReturnScope semi153 =null;

		LinkedListTree THROW151_tree=null;

		try {
			// AS3.g:510:2: ( THROW ^ expression semi !)
			// AS3.g:510:4: THROW ^ expression semi !
			{
			root_0 = (LinkedListTree)adaptor.nil();


			THROW151=(Token)match(input,THROW,FOLLOW_THROW_in_throwStatement1762); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			THROW151_tree = (LinkedListTree)adaptor.create(THROW151);
			root_0 = (LinkedListTree)adaptor.becomeRoot(THROW151_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_throwStatement1765);
			expression152=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression152.getTree());

			pushFollow(FOLLOW_semi_in_throwStatement1767);
			semi153=semi();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "throwStatement"


	public static class tryStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "tryStatement"
	// AS3.g:513:1: tryStatement : TRY block ( finallyBlock | ( catchBlock )+ ( finallyBlock )? ) -> ^( TRY block ( catchBlock )* ( finallyBlock )? ) ;
	public final AS3Parser.tryStatement_return tryStatement() throws RecognitionException {
		AS3Parser.tryStatement_return retval = new AS3Parser.tryStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token TRY154=null;
		ParserRuleReturnScope block155 =null;
		ParserRuleReturnScope finallyBlock156 =null;
		ParserRuleReturnScope catchBlock157 =null;
		ParserRuleReturnScope finallyBlock158 =null;

		LinkedListTree TRY154_tree=null;
		RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
		RewriteRuleSubtreeStream stream_catchBlock=new RewriteRuleSubtreeStream(adaptor,"rule catchBlock");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_finallyBlock=new RewriteRuleSubtreeStream(adaptor,"rule finallyBlock");

		try {
			// AS3.g:514:2: ( TRY block ( finallyBlock | ( catchBlock )+ ( finallyBlock )? ) -> ^( TRY block ( catchBlock )* ( finallyBlock )? ) )
			// AS3.g:514:4: TRY block ( finallyBlock | ( catchBlock )+ ( finallyBlock )? )
			{
			TRY154=(Token)match(input,TRY,FOLLOW_TRY_in_tryStatement1779); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TRY.add(TRY154);

			pushFollow(FOLLOW_block_in_tryStatement1783);
			block155=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block155.getTree());
			// AS3.g:516:2: ( finallyBlock | ( catchBlock )+ ( finallyBlock )? )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==FINALLY) ) {
				alt36=1;
			}
			else if ( (LA36_0==CATCH) ) {
				alt36=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// AS3.g:516:4: finallyBlock
					{
					pushFollow(FOLLOW_finallyBlock_in_tryStatement1788);
					finallyBlock156=finallyBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_finallyBlock.add(finallyBlock156.getTree());
					}
					break;
				case 2 :
					// AS3.g:517:4: ( catchBlock )+ ( finallyBlock )?
					{
					// AS3.g:517:4: ( catchBlock )+
					int cnt34=0;
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==CATCH) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// AS3.g:517:4: catchBlock
							{
							pushFollow(FOLLOW_catchBlock_in_tryStatement1793);
							catchBlock157=catchBlock();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_catchBlock.add(catchBlock157.getTree());
							}
							break;

						default :
							if ( cnt34 >= 1 ) break loop34;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(34, input);
							throw eee;
						}
						cnt34++;
					}

					// AS3.g:518:3: ( finallyBlock )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==FINALLY) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// AS3.g:518:3: finallyBlock
							{
							pushFollow(FOLLOW_finallyBlock_in_tryStatement1798);
							finallyBlock158=finallyBlock();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_finallyBlock.add(finallyBlock158.getTree());
							}
							break;

					}

					}
					break;

			}


			// AST REWRITE
			// elements: block, catchBlock, finallyBlock, TRY
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 520:3: -> ^( TRY block ( catchBlock )* ( finallyBlock )? )
			{
				// AS3.g:520:6: ^( TRY block ( catchBlock )* ( finallyBlock )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);
				adaptor.addChild(root_1, stream_block.nextTree());
				// AS3.g:520:18: ( catchBlock )*
				while ( stream_catchBlock.hasNext() ) {
					adaptor.addChild(root_1, stream_catchBlock.nextTree());
				}
				stream_catchBlock.reset();

				// AS3.g:520:30: ( finallyBlock )?
				if ( stream_finallyBlock.hasNext() ) {
					adaptor.addChild(root_1, stream_finallyBlock.nextTree());
				}
				stream_finallyBlock.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tryStatement"


	public static class catchBlock_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "catchBlock"
	// AS3.g:523:1: catchBlock : CATCH LPAREN ident ( typeExpression )? RPAREN block -> ^( CATCH ident ( typeExpression )? block ) ;
	public final AS3Parser.catchBlock_return catchBlock() throws RecognitionException {
		AS3Parser.catchBlock_return retval = new AS3Parser.catchBlock_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token CATCH159=null;
		Token LPAREN160=null;
		Token RPAREN163=null;
		ParserRuleReturnScope ident161 =null;
		ParserRuleReturnScope typeExpression162 =null;
		ParserRuleReturnScope block164 =null;

		LinkedListTree CATCH159_tree=null;
		LinkedListTree LPAREN160_tree=null;
		LinkedListTree RPAREN163_tree=null;
		RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_typeExpression=new RewriteRuleSubtreeStream(adaptor,"rule typeExpression");

		try {
			// AS3.g:524:2: ( CATCH LPAREN ident ( typeExpression )? RPAREN block -> ^( CATCH ident ( typeExpression )? block ) )
			// AS3.g:524:4: CATCH LPAREN ident ( typeExpression )? RPAREN block
			{
			CATCH159=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchBlock1829); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CATCH.add(CATCH159);

			LPAREN160=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchBlock1831); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN160);

			pushFollow(FOLLOW_ident_in_catchBlock1833);
			ident161=ident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ident.add(ident161.getTree());
			// AS3.g:524:23: ( typeExpression )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==COLON) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// AS3.g:524:23: typeExpression
					{
					pushFollow(FOLLOW_typeExpression_in_catchBlock1835);
					typeExpression162=typeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typeExpression.add(typeExpression162.getTree());
					}
					break;

			}

			RPAREN163=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchBlock1838); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN163);

			pushFollow(FOLLOW_block_in_catchBlock1842);
			block164=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block164.getTree());

			// AST REWRITE
			// elements: ident, block, CATCH, typeExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 526:3: -> ^( CATCH ident ( typeExpression )? block )
			{
				// AS3.g:526:6: ^( CATCH ident ( typeExpression )? block )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ident.nextTree());
				// AS3.g:526:20: ( typeExpression )?
				if ( stream_typeExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_typeExpression.nextTree());
				}
				stream_typeExpression.reset();

				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catchBlock"


	public static class finallyBlock_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "finallyBlock"
	// AS3.g:529:1: finallyBlock : FINALLY ^ block ;
	public final AS3Parser.finallyBlock_return finallyBlock() throws RecognitionException {
		AS3Parser.finallyBlock_return retval = new AS3Parser.finallyBlock_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token FINALLY165=null;
		ParserRuleReturnScope block166 =null;

		LinkedListTree FINALLY165_tree=null;

		try {
			// AS3.g:530:2: ( FINALLY ^ block )
			// AS3.g:530:4: FINALLY ^ block
			{
			root_0 = (LinkedListTree)adaptor.nil();


			FINALLY165=(Token)match(input,FINALLY,FOLLOW_FINALLY_in_finallyBlock1868); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FINALLY165_tree = (LinkedListTree)adaptor.create(FINALLY165);
			root_0 = (LinkedListTree)adaptor.becomeRoot(FINALLY165_tree, root_0);
			}

			pushFollow(FOLLOW_block_in_finallyBlock1871);
			block166=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block166.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "finallyBlock"


	public static class returnStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "returnStatement"
	// AS3.g:533:1: returnStatement : RETURN ^ ( expression )? semi ;
	public final AS3Parser.returnStatement_return returnStatement() throws RecognitionException {
		AS3Parser.returnStatement_return retval = new AS3Parser.returnStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token RETURN167=null;
		ParserRuleReturnScope expression168 =null;
		ParserRuleReturnScope semi169 =null;

		LinkedListTree RETURN167_tree=null;

		try {
			// AS3.g:534:2: ( RETURN ^ ( expression )? semi )
			// AS3.g:534:4: RETURN ^ ( expression )? semi
			{
			root_0 = (LinkedListTree)adaptor.nil();


			RETURN167=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnStatement1882); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RETURN167_tree = (LinkedListTree)adaptor.create(RETURN167);
			root_0 = (LinkedListTree)adaptor.becomeRoot(RETURN167_tree, root_0);
			}

			// AS3.g:534:12: ( expression )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==AS||LA38_0==BNOT||(LA38_0 >= DEC && LA38_0 <= DECIMAL_LITERAL)||(LA38_0 >= DELETE && LA38_0 <= DIV)||(LA38_0 >= DYNAMIC && LA38_0 <= E4X_ATTRI)||LA38_0==FALSE||LA38_0==FLOAT_LITERAL||LA38_0==FUNCTION||LA38_0==GET||(LA38_0 >= HEX_LITERAL && LA38_0 <= IDENT)||LA38_0==INC||(LA38_0 >= INTERNAL && LA38_0 <= IS)||(LA38_0 >= LBRACK && LA38_0 <= LCURLY)||LA38_0==LNOT||(LA38_0 >= LPAREN && LA38_0 <= LT)||LA38_0==MINUS||LA38_0==NAMESPACE||LA38_0==NEW||LA38_0==NULL||LA38_0==OCTAL_LITERAL||LA38_0==PLUS||LA38_0==PRIVATE||(LA38_0 >= PROTECTED && LA38_0 <= PUBLIC)||LA38_0==SET||LA38_0==STRING_LITERAL||LA38_0==TRUE||LA38_0==TYPEOF||LA38_0==UNDEFINED||LA38_0==USE||LA38_0==VOID||LA38_0==XML) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// AS3.g:534:12: expression
					{
					pushFollow(FOLLOW_expression_in_returnStatement1885);
					expression168=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression168.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_semi_in_returnStatement1888);
			semi169=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, semi169.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "returnStatement"


	public static class continueStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "continueStatement"
	// AS3.g:537:1: continueStatement : CONTINUE ^ semi ;
	public final AS3Parser.continueStatement_return continueStatement() throws RecognitionException {
		AS3Parser.continueStatement_return retval = new AS3Parser.continueStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token CONTINUE170=null;
		ParserRuleReturnScope semi171 =null;

		LinkedListTree CONTINUE170_tree=null;

		try {
			// AS3.g:538:2: ( CONTINUE ^ semi )
			// AS3.g:538:4: CONTINUE ^ semi
			{
			root_0 = (LinkedListTree)adaptor.nil();


			CONTINUE170=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement1901); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CONTINUE170_tree = (LinkedListTree)adaptor.create(CONTINUE170);
			root_0 = (LinkedListTree)adaptor.becomeRoot(CONTINUE170_tree, root_0);
			}

			pushFollow(FOLLOW_semi_in_continueStatement1904);
			semi171=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, semi171.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "continueStatement"


	public static class breakStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "breakStatement"
	// AS3.g:541:1: breakStatement : BREAK ^ semi ;
	public final AS3Parser.breakStatement_return breakStatement() throws RecognitionException {
		AS3Parser.breakStatement_return retval = new AS3Parser.breakStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token BREAK172=null;
		ParserRuleReturnScope semi173 =null;

		LinkedListTree BREAK172_tree=null;

		try {
			// AS3.g:542:2: ( BREAK ^ semi )
			// AS3.g:542:4: BREAK ^ semi
			{
			root_0 = (LinkedListTree)adaptor.nil();


			BREAK172=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStatement1915); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BREAK172_tree = (LinkedListTree)adaptor.create(BREAK172);
			root_0 = (LinkedListTree)adaptor.becomeRoot(BREAK172_tree, root_0);
			}

			pushFollow(FOLLOW_semi_in_breakStatement1918);
			semi173=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, semi173.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "breakStatement"


	public static class switchStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "switchStatement"
	// AS3.g:545:1: switchStatement : SWITCH ^ condition switchBlock ;
	public final AS3Parser.switchStatement_return switchStatement() throws RecognitionException {
		AS3Parser.switchStatement_return retval = new AS3Parser.switchStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token SWITCH174=null;
		ParserRuleReturnScope condition175 =null;
		ParserRuleReturnScope switchBlock176 =null;

		LinkedListTree SWITCH174_tree=null;

		try {
			// AS3.g:546:2: ( SWITCH ^ condition switchBlock )
			// AS3.g:546:4: SWITCH ^ condition switchBlock
			{
			root_0 = (LinkedListTree)adaptor.nil();


			SWITCH174=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement1929); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SWITCH174_tree = (LinkedListTree)adaptor.create(SWITCH174);
			root_0 = (LinkedListTree)adaptor.becomeRoot(SWITCH174_tree, root_0);
			}

			pushFollow(FOLLOW_condition_in_switchStatement1932);
			condition175=condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, condition175.getTree());

			pushFollow(FOLLOW_switchBlock_in_switchStatement1936);
			switchBlock176=switchBlock();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlock176.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "switchStatement"


	public static class switchBlock_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "switchBlock"
	// AS3.g:550:1: switchBlock : LCURLY ( caseStatement )* ( defaultStatement )? RCURLY -> ^( BLOCK ( caseStatement )* ( defaultStatement )? ) ;
	public final AS3Parser.switchBlock_return switchBlock() throws RecognitionException {
		AS3Parser.switchBlock_return retval = new AS3Parser.switchBlock_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LCURLY177=null;
		Token RCURLY180=null;
		ParserRuleReturnScope caseStatement178 =null;
		ParserRuleReturnScope defaultStatement179 =null;

		LinkedListTree LCURLY177_tree=null;
		LinkedListTree RCURLY180_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_caseStatement=new RewriteRuleSubtreeStream(adaptor,"rule caseStatement");
		RewriteRuleSubtreeStream stream_defaultStatement=new RewriteRuleSubtreeStream(adaptor,"rule defaultStatement");

		try {
			// AS3.g:551:2: ( LCURLY ( caseStatement )* ( defaultStatement )? RCURLY -> ^( BLOCK ( caseStatement )* ( defaultStatement )? ) )
			// AS3.g:551:4: LCURLY ( caseStatement )* ( defaultStatement )? RCURLY
			{
			LCURLY177=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_switchBlock1947); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY177);

			// AS3.g:552:3: ( caseStatement )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==CASE) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// AS3.g:552:4: caseStatement
					{
					pushFollow(FOLLOW_caseStatement_in_switchBlock1952);
					caseStatement178=caseStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseStatement.add(caseStatement178.getTree());
					}
					break;

				default :
					break loop39;
				}
			}

			// AS3.g:553:3: ( defaultStatement )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==DEFAULT) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// AS3.g:553:4: defaultStatement
					{
					pushFollow(FOLLOW_defaultStatement_in_switchBlock1959);
					defaultStatement179=defaultStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_defaultStatement.add(defaultStatement179.getTree());
					}
					break;

			}

			RCURLY180=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_switchBlock1965); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY180);


			// AST REWRITE
			// elements: defaultStatement, caseStatement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 555:3: -> ^( BLOCK ( caseStatement )* ( defaultStatement )? )
			{
				// AS3.g:555:6: ^( BLOCK ( caseStatement )* ( defaultStatement )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				// AS3.g:555:14: ( caseStatement )*
				while ( stream_caseStatement.hasNext() ) {
					adaptor.addChild(root_1, stream_caseStatement.nextTree());
				}
				stream_caseStatement.reset();

				// AS3.g:555:29: ( defaultStatement )?
				if ( stream_defaultStatement.hasNext() ) {
					adaptor.addChild(root_1, stream_defaultStatement.nextTree());
				}
				stream_defaultStatement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "switchBlock"


	public static class caseStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "caseStatement"
	// AS3.g:558:1: caseStatement : CASE ^ expression COLON !l= switchStatementList ;
	public final AS3Parser.caseStatement_return caseStatement() throws RecognitionException {
		AS3Parser.caseStatement_return retval = new AS3Parser.caseStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token CASE181=null;
		Token COLON183=null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope expression182 =null;

		LinkedListTree CASE181_tree=null;
		LinkedListTree COLON183_tree=null;

		try {
			// AS3.g:559:2: ( CASE ^ expression COLON !l= switchStatementList )
			// AS3.g:559:4: CASE ^ expression COLON !l= switchStatementList
			{
			root_0 = (LinkedListTree)adaptor.nil();


			CASE181=(Token)match(input,CASE,FOLLOW_CASE_in_caseStatement1990); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE181_tree = (LinkedListTree)adaptor.create(CASE181);
			root_0 = (LinkedListTree)adaptor.becomeRoot(CASE181_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_caseStatement1993);
			expression182=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression182.getTree());

			COLON183=(Token)match(input,COLON,FOLLOW_COLON_in_caseStatement1995); if (state.failed) return retval;
			pushFollow(FOLLOW_switchStatementList_in_caseStatement2000);
			l=switchStatementList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			if ( state.backtracking==0 ) { placeholder((l!=null?((LinkedListTree)l.getTree()):null)); }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseStatement"


	public static class defaultStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "defaultStatement"
	// AS3.g:562:1: defaultStatement : DEFAULT ^ COLON !l= switchStatementList ;
	public final AS3Parser.defaultStatement_return defaultStatement() throws RecognitionException {
		AS3Parser.defaultStatement_return retval = new AS3Parser.defaultStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token DEFAULT184=null;
		Token COLON185=null;
		ParserRuleReturnScope l =null;

		LinkedListTree DEFAULT184_tree=null;
		LinkedListTree COLON185_tree=null;

		try {
			// AS3.g:563:2: ( DEFAULT ^ COLON !l= switchStatementList )
			// AS3.g:563:4: DEFAULT ^ COLON !l= switchStatementList
			{
			root_0 = (LinkedListTree)adaptor.nil();


			DEFAULT184=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStatement2014); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFAULT184_tree = (LinkedListTree)adaptor.create(DEFAULT184);
			root_0 = (LinkedListTree)adaptor.becomeRoot(DEFAULT184_tree, root_0);
			}

			COLON185=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStatement2017); if (state.failed) return retval;
			pushFollow(FOLLOW_switchStatementList_in_defaultStatement2022);
			l=switchStatementList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			if ( state.backtracking==0 ) { placeholder((l!=null?((LinkedListTree)l.getTree()):null)); }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "defaultStatement"


	public static class switchStatementList_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "switchStatementList"
	// AS3.g:566:1: switchStatementList : ( statement )* -> ^( SWITCH_STATEMENT_LIST ( statement )* ) ;
	public final AS3Parser.switchStatementList_return switchStatementList() throws RecognitionException {
		AS3Parser.switchStatementList_return retval = new AS3Parser.switchStatementList_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope statement186 =null;

		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// AS3.g:567:2: ( ( statement )* -> ^( SWITCH_STATEMENT_LIST ( statement )* ) )
			// AS3.g:567:4: ( statement )*
			{
			// AS3.g:567:4: ( statement )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==DEFAULT) ) {
					int LA41_1 = input.LA(2);
					if ( (LA41_1==XML) ) {
						alt41=1;
					}

				}
				else if ( (LA41_0==AS||LA41_0==BNOT||LA41_0==BREAK||(LA41_0 >= CONST && LA41_0 <= CONTINUE)||(LA41_0 >= DEC && LA41_0 <= DECIMAL_LITERAL)||(LA41_0 >= DELETE && LA41_0 <= DIV)||LA41_0==DO||(LA41_0 >= DYNAMIC && LA41_0 <= E4X_ATTRI)||LA41_0==FALSE||(LA41_0 >= FLOAT_LITERAL && LA41_0 <= FOR)||LA41_0==FUNCTION||LA41_0==GET||(LA41_0 >= HEX_LITERAL && LA41_0 <= IDENT)||LA41_0==IF||LA41_0==INC||(LA41_0 >= INTERNAL && LA41_0 <= IS)||(LA41_0 >= LBRACK && LA41_0 <= LCURLY)||LA41_0==LNOT||(LA41_0 >= LPAREN && LA41_0 <= LT)||LA41_0==MINUS||LA41_0==NAMESPACE||LA41_0==NEW||LA41_0==NULL||LA41_0==OCTAL_LITERAL||LA41_0==PLUS||LA41_0==PRIVATE||(LA41_0 >= PROTECTED && LA41_0 <= PUBLIC)||LA41_0==RETURN||(LA41_0 >= SEMI && LA41_0 <= SET)||(LA41_0 >= STRING_LITERAL && LA41_0 <= SWITCH)||(LA41_0 >= THROW && LA41_0 <= TYPEOF)||LA41_0==UNDEFINED||(LA41_0 >= USE && LA41_0 <= VAR)||(LA41_0 >= VOID && LA41_0 <= WITH)||LA41_0==XML) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// AS3.g:567:4: statement
					{
					pushFollow(FOLLOW_statement_in_switchStatementList2035);
					statement186=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement186.getTree());
					}
					break;

				default :
					break loop41;
				}
			}


			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 567:15: -> ^( SWITCH_STATEMENT_LIST ( statement )* )
			{
				// AS3.g:567:18: ^( SWITCH_STATEMENT_LIST ( statement )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(SWITCH_STATEMENT_LIST, "SWITCH_STATEMENT_LIST"), root_1);
				// AS3.g:567:42: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "switchStatementList"


	public static class forEachStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "forEachStatement"
	// AS3.g:570:1: forEachStatement : f= FOR EACH LPAREN forInClause RPAREN statement -> ^( FOR_EACH[$f] forInClause statement ) ;
	public final AS3Parser.forEachStatement_return forEachStatement() throws RecognitionException {
		AS3Parser.forEachStatement_return retval = new AS3Parser.forEachStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token f=null;
		Token EACH187=null;
		Token LPAREN188=null;
		Token RPAREN190=null;
		ParserRuleReturnScope forInClause189 =null;
		ParserRuleReturnScope statement191 =null;

		LinkedListTree f_tree=null;
		LinkedListTree EACH187_tree=null;
		LinkedListTree LPAREN188_tree=null;
		LinkedListTree RPAREN190_tree=null;
		RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_forInClause=new RewriteRuleSubtreeStream(adaptor,"rule forInClause");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// AS3.g:571:2: (f= FOR EACH LPAREN forInClause RPAREN statement -> ^( FOR_EACH[$f] forInClause statement ) )
			// AS3.g:571:4: f= FOR EACH LPAREN forInClause RPAREN statement
			{
			f=(Token)match(input,FOR,FOLLOW_FOR_in_forEachStatement2058); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(f);

			EACH187=(Token)match(input,EACH,FOLLOW_EACH_in_forEachStatement2060); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EACH.add(EACH187);

			LPAREN188=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement2064); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN188);

			pushFollow(FOLLOW_forInClause_in_forEachStatement2068);
			forInClause189=forInClause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_forInClause.add(forInClause189.getTree());
			RPAREN190=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement2072); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN190);

			pushFollow(FOLLOW_statement_in_forEachStatement2076);
			statement191=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statement.add(statement191.getTree());

			// AST REWRITE
			// elements: forInClause, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 576:3: -> ^( FOR_EACH[$f] forInClause statement )
			{
				// AS3.g:576:6: ^( FOR_EACH[$f] forInClause statement )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FOR_EACH, f), root_1);
				adaptor.addChild(root_1, stream_forInClause.nextTree());
				adaptor.addChild(root_1, stream_statement.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forEachStatement"


	public static class forStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "forStatement"
	// AS3.g:579:1: forStatement : f= FOR LPAREN ( ( forInClauseDecl IN )=> forInClause RPAREN statement -> ^( FOR_IN[$f] forInClause statement ) | traditionalForClause RPAREN statement -> ^( $f traditionalForClause statement ) ) ;
	public final AS3Parser.forStatement_return forStatement() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.forStatement_return retval = new AS3Parser.forStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token f=null;
		Token LPAREN192=null;
		Token RPAREN194=null;
		Token RPAREN197=null;
		ParserRuleReturnScope forInClause193 =null;
		ParserRuleReturnScope statement195 =null;
		ParserRuleReturnScope traditionalForClause196 =null;
		ParserRuleReturnScope statement198 =null;

		LinkedListTree f_tree=null;
		LinkedListTree LPAREN192_tree=null;
		LinkedListTree RPAREN194_tree=null;
		LinkedListTree RPAREN197_tree=null;
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_forInClause=new RewriteRuleSubtreeStream(adaptor,"rule forInClause");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_traditionalForClause=new RewriteRuleSubtreeStream(adaptor,"rule traditionalForClause");


			InOperator_stack.peek().allowed = false;

		try {
			// AS3.g:584:2: (f= FOR LPAREN ( ( forInClauseDecl IN )=> forInClause RPAREN statement -> ^( FOR_IN[$f] forInClause statement ) | traditionalForClause RPAREN statement -> ^( $f traditionalForClause statement ) ) )
			// AS3.g:584:4: f= FOR LPAREN ( ( forInClauseDecl IN )=> forInClause RPAREN statement -> ^( FOR_IN[$f] forInClause statement ) | traditionalForClause RPAREN statement -> ^( $f traditionalForClause statement ) )
			{
			f=(Token)match(input,FOR,FOLLOW_FOR_in_forStatement2112); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(f);

			LPAREN192=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forStatement2116); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN192);

			// AS3.g:586:3: ( ( forInClauseDecl IN )=> forInClause RPAREN statement -> ^( FOR_IN[$f] forInClause statement ) | traditionalForClause RPAREN statement -> ^( $f traditionalForClause statement ) )
			int alt42=2;
			alt42 = dfa42.predict(input);
			switch (alt42) {
				case 1 :
					// AS3.g:586:5: ( forInClauseDecl IN )=> forInClause RPAREN statement
					{
					pushFollow(FOLLOW_forInClause_in_forStatement2128);
					forInClause193=forInClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_forInClause.add(forInClause193.getTree());
					RPAREN194=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forStatement2130); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN194);

					pushFollow(FOLLOW_statement_in_forStatement2132);
					statement195=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement195.getTree());

					// AST REWRITE
					// elements: statement, forInClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 587:4: -> ^( FOR_IN[$f] forInClause statement )
					{
						// AS3.g:587:7: ^( FOR_IN[$f] forInClause statement )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FOR_IN, f), root_1);
						adaptor.addChild(root_1, stream_forInClause.nextTree());
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AS3.g:589:5: traditionalForClause RPAREN statement
					{
					pushFollow(FOLLOW_traditionalForClause_in_forStatement2153);
					traditionalForClause196=traditionalForClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_traditionalForClause.add(traditionalForClause196.getTree());
					RPAREN197=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forStatement2155); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN197);

					pushFollow(FOLLOW_statement_in_forStatement2157);
					statement198=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement198.getTree());

					// AST REWRITE
					// elements: statement, traditionalForClause, f
					// token labels: f
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 590:4: -> ^( $f traditionalForClause statement )
					{
						// AS3.g:590:7: ^( $f traditionalForClause statement )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot(stream_f.nextNode(), root_1);
						adaptor.addChild(root_1, stream_traditionalForClause.nextTree());
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "forStatement"


	public static class traditionalForClause_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "traditionalForClause"
	// AS3.g:594:1: traditionalForClause : a= forInit SEMI !b= forCond SEMI !c= forIter ;
	public final AS3Parser.traditionalForClause_return traditionalForClause() throws RecognitionException {
		AS3Parser.traditionalForClause_return retval = new AS3Parser.traditionalForClause_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token SEMI199=null;
		Token SEMI200=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		LinkedListTree SEMI199_tree=null;
		LinkedListTree SEMI200_tree=null;

		try {
			// AS3.g:595:2: (a= forInit SEMI !b= forCond SEMI !c= forIter )
			// AS3.g:595:4: a= forInit SEMI !b= forCond SEMI !c= forIter
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_forInit_in_traditionalForClause2188);
			a=forInit();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

			if ( state.backtracking==0 ) {placeholder((a!=null?((LinkedListTree)a.getTree()):null));}
			SEMI199=(Token)match(input,SEMI,FOLLOW_SEMI_in_traditionalForClause2192); if (state.failed) return retval;
			pushFollow(FOLLOW_forCond_in_traditionalForClause2200);
			b=forCond();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, b.getTree());

			if ( state.backtracking==0 ) {placeholder((b!=null?((LinkedListTree)b.getTree()):null));}
			SEMI200=(Token)match(input,SEMI,FOLLOW_SEMI_in_traditionalForClause2204); if (state.failed) return retval;
			pushFollow(FOLLOW_forIter_in_traditionalForClause2212);
			c=forIter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());

			if ( state.backtracking==0 ) {placeholder((c!=null?((LinkedListTree)c.getTree()):null));}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "traditionalForClause"


	public static class forInClause_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "forInClause"
	// AS3.g:600:1: forInClause : forInClauseDecl IN ! forInClauseTail ;
	public final AS3Parser.forInClause_return forInClause() throws RecognitionException {
		AS3Parser.forInClause_return retval = new AS3Parser.forInClause_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token IN202=null;
		ParserRuleReturnScope forInClauseDecl201 =null;
		ParserRuleReturnScope forInClauseTail203 =null;

		LinkedListTree IN202_tree=null;

		try {
			// AS3.g:601:2: ( forInClauseDecl IN ! forInClauseTail )
			// AS3.g:601:4: forInClauseDecl IN ! forInClauseTail
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_forInClauseDecl_in_forInClause2227);
			forInClauseDecl201=forInClauseDecl();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forInClauseDecl201.getTree());

			IN202=(Token)match(input,IN,FOLLOW_IN_in_forInClause2229); if (state.failed) return retval;
			pushFollow(FOLLOW_forInClauseTail_in_forInClause2232);
			forInClauseTail203=forInClauseTail();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forInClauseTail203.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forInClause"


	public static class forInClauseDecl_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "forInClauseDecl"
	// AS3.g:604:1: forInClauseDecl : ( declaration | ident );
	public final AS3Parser.forInClauseDecl_return forInClauseDecl() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.forInClauseDecl_return retval = new AS3Parser.forInClauseDecl_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope declaration204 =null;
		ParserRuleReturnScope ident205 =null;



			InOperator_stack.peek().allowed = false;

		try {
			// AS3.g:609:2: ( declaration | ident )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==CONST||LA43_0==VAR) ) {
				alt43=1;
			}
			else if ( (LA43_0==AS||LA43_0==DYNAMIC||LA43_0==GET||LA43_0==IDENT||LA43_0==IS||LA43_0==NAMESPACE||LA43_0==SET||LA43_0==USE||LA43_0==XML) ) {
				alt43=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// AS3.g:609:4: declaration
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_forInClauseDecl2253);
					declaration204=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration204.getTree());

					}
					break;
				case 2 :
					// AS3.g:609:18: ident
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_ident_in_forInClauseDecl2257);
					ident205=ident();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ident205.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "forInClauseDecl"


	public static class forInClauseTail_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "forInClauseTail"
	// AS3.g:613:1: forInClauseTail : expressionList ;
	public final AS3Parser.forInClauseTail_return forInClauseTail() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.forInClauseTail_return retval = new AS3Parser.forInClauseTail_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope expressionList206 =null;



			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:618:2: ( expressionList )
			// AS3.g:618:4: expressionList
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_expressionList_in_forInClauseTail2279);
			expressionList206=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList206.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "forInClauseTail"


	public static class forInit_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// AS3.g:622:1: forInit : ( declaration | expressionList )? -> ^( FOR_INIT ( declaration )? ( expressionList )? ) ;
	public final AS3Parser.forInit_return forInit() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.forInit_return retval = new AS3Parser.forInit_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope declaration207 =null;
		ParserRuleReturnScope expressionList208 =null;

		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");


			InOperator_stack.peek().allowed = false;

		try {
			// AS3.g:627:2: ( ( declaration | expressionList )? -> ^( FOR_INIT ( declaration )? ( expressionList )? ) )
			// AS3.g:627:4: ( declaration | expressionList )?
			{
			// AS3.g:627:4: ( declaration | expressionList )?
			int alt44=3;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==CONST||LA44_0==VAR) ) {
				alt44=1;
			}
			else if ( (LA44_0==AS||LA44_0==BNOT||(LA44_0 >= DEC && LA44_0 <= DECIMAL_LITERAL)||(LA44_0 >= DELETE && LA44_0 <= DIV)||(LA44_0 >= DYNAMIC && LA44_0 <= E4X_ATTRI)||LA44_0==FALSE||LA44_0==FLOAT_LITERAL||LA44_0==FUNCTION||LA44_0==GET||(LA44_0 >= HEX_LITERAL && LA44_0 <= IDENT)||LA44_0==INC||(LA44_0 >= INTERNAL && LA44_0 <= IS)||(LA44_0 >= LBRACK && LA44_0 <= LCURLY)||LA44_0==LNOT||(LA44_0 >= LPAREN && LA44_0 <= LT)||LA44_0==MINUS||LA44_0==NAMESPACE||LA44_0==NEW||LA44_0==NULL||LA44_0==OCTAL_LITERAL||LA44_0==PLUS||LA44_0==PRIVATE||(LA44_0 >= PROTECTED && LA44_0 <= PUBLIC)||LA44_0==SET||LA44_0==STRING_LITERAL||LA44_0==TRUE||LA44_0==TYPEOF||LA44_0==UNDEFINED||LA44_0==USE||LA44_0==VOID||LA44_0==XML) ) {
				alt44=2;
			}
			switch (alt44) {
				case 1 :
					// AS3.g:627:5: declaration
					{
					pushFollow(FOLLOW_declaration_in_forInit2303);
					declaration207=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declaration.add(declaration207.getTree());
					}
					break;
				case 2 :
					// AS3.g:627:19: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forInit2307);
					expressionList208=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList208.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: declaration, expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 628:3: -> ^( FOR_INIT ( declaration )? ( expressionList )? )
			{
				// AS3.g:628:6: ^( FOR_INIT ( declaration )? ( expressionList )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FOR_INIT, "FOR_INIT"), root_1);
				// AS3.g:628:17: ( declaration )?
				if ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				// AS3.g:628:30: ( expressionList )?
				if ( stream_expressionList.hasNext() ) {
					adaptor.addChild(root_1, stream_expressionList.nextTree());
				}
				stream_expressionList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class forCond_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "forCond"
	// AS3.g:631:1: forCond : ( expressionList )? -> ^( FOR_CONDITION ( expressionList )? ) ;
	public final AS3Parser.forCond_return forCond() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.forCond_return retval = new AS3Parser.forCond_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope expressionList209 =null;

		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");


			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:636:2: ( ( expressionList )? -> ^( FOR_CONDITION ( expressionList )? ) )
			// AS3.g:636:4: ( expressionList )?
			{
			// AS3.g:636:4: ( expressionList )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==AS||LA45_0==BNOT||(LA45_0 >= DEC && LA45_0 <= DECIMAL_LITERAL)||(LA45_0 >= DELETE && LA45_0 <= DIV)||(LA45_0 >= DYNAMIC && LA45_0 <= E4X_ATTRI)||LA45_0==FALSE||LA45_0==FLOAT_LITERAL||LA45_0==FUNCTION||LA45_0==GET||(LA45_0 >= HEX_LITERAL && LA45_0 <= IDENT)||LA45_0==INC||(LA45_0 >= INTERNAL && LA45_0 <= IS)||(LA45_0 >= LBRACK && LA45_0 <= LCURLY)||LA45_0==LNOT||(LA45_0 >= LPAREN && LA45_0 <= LT)||LA45_0==MINUS||LA45_0==NAMESPACE||LA45_0==NEW||LA45_0==NULL||LA45_0==OCTAL_LITERAL||LA45_0==PLUS||LA45_0==PRIVATE||(LA45_0 >= PROTECTED && LA45_0 <= PUBLIC)||LA45_0==SET||LA45_0==STRING_LITERAL||LA45_0==TRUE||LA45_0==TYPEOF||LA45_0==UNDEFINED||LA45_0==USE||LA45_0==VOID||LA45_0==XML) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// AS3.g:636:4: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forCond2345);
					expressionList209=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList209.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 637:3: -> ^( FOR_CONDITION ( expressionList )? )
			{
				// AS3.g:637:6: ^( FOR_CONDITION ( expressionList )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FOR_CONDITION, "FOR_CONDITION"), root_1);
				// AS3.g:637:22: ( expressionList )?
				if ( stream_expressionList.hasNext() ) {
					adaptor.addChild(root_1, stream_expressionList.nextTree());
				}
				stream_expressionList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "forCond"


	public static class forIter_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "forIter"
	// AS3.g:640:1: forIter : ( expressionList )? -> ^( FOR_ITERATOR ( expressionList )? ) ;
	public final AS3Parser.forIter_return forIter() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.forIter_return retval = new AS3Parser.forIter_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope expressionList210 =null;

		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");


			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:645:2: ( ( expressionList )? -> ^( FOR_ITERATOR ( expressionList )? ) )
			// AS3.g:645:4: ( expressionList )?
			{
			// AS3.g:645:4: ( expressionList )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==AS||LA46_0==BNOT||(LA46_0 >= DEC && LA46_0 <= DECIMAL_LITERAL)||(LA46_0 >= DELETE && LA46_0 <= DIV)||(LA46_0 >= DYNAMIC && LA46_0 <= E4X_ATTRI)||LA46_0==FALSE||LA46_0==FLOAT_LITERAL||LA46_0==FUNCTION||LA46_0==GET||(LA46_0 >= HEX_LITERAL && LA46_0 <= IDENT)||LA46_0==INC||(LA46_0 >= INTERNAL && LA46_0 <= IS)||(LA46_0 >= LBRACK && LA46_0 <= LCURLY)||LA46_0==LNOT||(LA46_0 >= LPAREN && LA46_0 <= LT)||LA46_0==MINUS||LA46_0==NAMESPACE||LA46_0==NEW||LA46_0==NULL||LA46_0==OCTAL_LITERAL||LA46_0==PLUS||LA46_0==PRIVATE||(LA46_0 >= PROTECTED && LA46_0 <= PUBLIC)||LA46_0==SET||LA46_0==STRING_LITERAL||LA46_0==TRUE||LA46_0==TYPEOF||LA46_0==UNDEFINED||LA46_0==USE||LA46_0==VOID||LA46_0==XML) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// AS3.g:645:4: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forIter2378);
					expressionList210=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList210.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 646:3: -> ^( FOR_ITERATOR ( expressionList )? )
			{
				// AS3.g:646:6: ^( FOR_ITERATOR ( expressionList )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FOR_ITERATOR, "FOR_ITERATOR"), root_1);
				// AS3.g:646:21: ( expressionList )?
				if ( stream_expressionList.hasNext() ) {
					adaptor.addChild(root_1, stream_expressionList.nextTree());
				}
				stream_expressionList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "forIter"


	public static class whileStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// AS3.g:649:1: whileStatement : WHILE ^ condition statement ;
	public final AS3Parser.whileStatement_return whileStatement() throws RecognitionException {
		AS3Parser.whileStatement_return retval = new AS3Parser.whileStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token WHILE211=null;
		ParserRuleReturnScope condition212 =null;
		ParserRuleReturnScope statement213 =null;

		LinkedListTree WHILE211_tree=null;

		try {
			// AS3.g:650:2: ( WHILE ^ condition statement )
			// AS3.g:650:4: WHILE ^ condition statement
			{
			root_0 = (LinkedListTree)adaptor.nil();


			WHILE211=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement2401); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHILE211_tree = (LinkedListTree)adaptor.create(WHILE211);
			root_0 = (LinkedListTree)adaptor.becomeRoot(WHILE211_tree, root_0);
			}

			pushFollow(FOLLOW_condition_in_whileStatement2404);
			condition212=condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, condition212.getTree());

			pushFollow(FOLLOW_statement_in_whileStatement2406);
			statement213=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement213.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStatement"


	public static class doWhileStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "doWhileStatement"
	// AS3.g:653:1: doWhileStatement : DO ^ statement WHILE ! condition semi ;
	public final AS3Parser.doWhileStatement_return doWhileStatement() throws RecognitionException {
		AS3Parser.doWhileStatement_return retval = new AS3Parser.doWhileStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token DO214=null;
		Token WHILE216=null;
		ParserRuleReturnScope statement215 =null;
		ParserRuleReturnScope condition217 =null;
		ParserRuleReturnScope semi218 =null;

		LinkedListTree DO214_tree=null;
		LinkedListTree WHILE216_tree=null;

		try {
			// AS3.g:654:2: ( DO ^ statement WHILE ! condition semi )
			// AS3.g:654:4: DO ^ statement WHILE ! condition semi
			{
			root_0 = (LinkedListTree)adaptor.nil();


			DO214=(Token)match(input,DO,FOLLOW_DO_in_doWhileStatement2417); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DO214_tree = (LinkedListTree)adaptor.create(DO214);
			root_0 = (LinkedListTree)adaptor.becomeRoot(DO214_tree, root_0);
			}

			pushFollow(FOLLOW_statement_in_doWhileStatement2420);
			statement215=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement215.getTree());

			WHILE216=(Token)match(input,WHILE,FOLLOW_WHILE_in_doWhileStatement2422); if (state.failed) return retval;
			pushFollow(FOLLOW_condition_in_doWhileStatement2425);
			condition217=condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, condition217.getTree());

			pushFollow(FOLLOW_semi_in_doWhileStatement2427);
			semi218=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, semi218.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doWhileStatement"


	public static class withStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "withStatement"
	// AS3.g:657:1: withStatement : WITH ^ condition statement ;
	public final AS3Parser.withStatement_return withStatement() throws RecognitionException {
		AS3Parser.withStatement_return retval = new AS3Parser.withStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token WITH219=null;
		ParserRuleReturnScope condition220 =null;
		ParserRuleReturnScope statement221 =null;

		LinkedListTree WITH219_tree=null;

		try {
			// AS3.g:658:2: ( WITH ^ condition statement )
			// AS3.g:658:4: WITH ^ condition statement
			{
			root_0 = (LinkedListTree)adaptor.nil();


			WITH219=(Token)match(input,WITH,FOLLOW_WITH_in_withStatement2438); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WITH219_tree = (LinkedListTree)adaptor.create(WITH219);
			root_0 = (LinkedListTree)adaptor.becomeRoot(WITH219_tree, root_0);
			}

			pushFollow(FOLLOW_condition_in_withStatement2441);
			condition220=condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, condition220.getTree());

			pushFollow(FOLLOW_statement_in_withStatement2443);
			statement221=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement221.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "withStatement"


	public static class defaultXMLNamespaceStatement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "defaultXMLNamespaceStatement"
	// AS3.g:661:1: defaultXMLNamespaceStatement : DEFAULT XML NAMESPACE ASSIGN expression semi -> ^( DEFAULT_XML_NAMESPACE expression ) ;
	public final AS3Parser.defaultXMLNamespaceStatement_return defaultXMLNamespaceStatement() throws RecognitionException {
		AS3Parser.defaultXMLNamespaceStatement_return retval = new AS3Parser.defaultXMLNamespaceStatement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token DEFAULT222=null;
		Token XML223=null;
		Token NAMESPACE224=null;
		Token ASSIGN225=null;
		ParserRuleReturnScope expression226 =null;
		ParserRuleReturnScope semi227 =null;

		LinkedListTree DEFAULT222_tree=null;
		LinkedListTree XML223_tree=null;
		LinkedListTree NAMESPACE224_tree=null;
		LinkedListTree ASSIGN225_tree=null;
		RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
		RewriteRuleTokenStream stream_XML=new RewriteRuleTokenStream(adaptor,"token XML");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_semi=new RewriteRuleSubtreeStream(adaptor,"rule semi");

		try {
			// AS3.g:662:2: ( DEFAULT XML NAMESPACE ASSIGN expression semi -> ^( DEFAULT_XML_NAMESPACE expression ) )
			// AS3.g:662:4: DEFAULT XML NAMESPACE ASSIGN expression semi
			{
			DEFAULT222=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultXMLNamespaceStatement2454); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT222);

			XML223=(Token)match(input,XML,FOLLOW_XML_in_defaultXMLNamespaceStatement2456); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_XML.add(XML223);

			NAMESPACE224=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultXMLNamespaceStatement2458); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAMESPACE.add(NAMESPACE224);

			ASSIGN225=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_defaultXMLNamespaceStatement2460); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN225);

			pushFollow(FOLLOW_expression_in_defaultXMLNamespaceStatement2462);
			expression226=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression226.getTree());
			pushFollow(FOLLOW_semi_in_defaultXMLNamespaceStatement2464);
			semi227=semi();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_semi.add(semi227.getTree());

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 663:3: -> ^( DEFAULT_XML_NAMESPACE expression )
			{
				// AS3.g:663:6: ^( DEFAULT_XML_NAMESPACE expression )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(DEFAULT_XML_NAMESPACE, "DEFAULT_XML_NAMESPACE"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "defaultXMLNamespaceStatement"


	public static class typeExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "typeExpression"
	// AS3.g:666:1: typeExpression : c= COLON ( identifier | VOID | STAR ) -> ^( TYPE_SPEC[$c] ( identifier )? ( VOID )? ( STAR )? ) ;
	public final AS3Parser.typeExpression_return typeExpression() throws RecognitionException {
		AS3Parser.typeExpression_return retval = new AS3Parser.typeExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token c=null;
		Token VOID229=null;
		Token STAR230=null;
		ParserRuleReturnScope identifier228 =null;

		LinkedListTree c_tree=null;
		LinkedListTree VOID229_tree=null;
		LinkedListTree STAR230_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// AS3.g:667:2: (c= COLON ( identifier | VOID | STAR ) -> ^( TYPE_SPEC[$c] ( identifier )? ( VOID )? ( STAR )? ) )
			// AS3.g:667:4: c= COLON ( identifier | VOID | STAR )
			{
			c=(Token)match(input,COLON,FOLLOW_COLON_in_typeExpression2487); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(c);

			// AS3.g:669:3: ( identifier | VOID | STAR )
			int alt47=3;
			switch ( input.LA(1) ) {
			case AS:
			case DYNAMIC:
			case GET:
			case IDENT:
			case INTERNAL:
			case IS:
			case NAMESPACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SET:
			case USE:
			case XML:
				{
				alt47=1;
				}
				break;
			case VOID:
				{
				alt47=2;
				}
				break;
			case STAR:
				{
				alt47=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// AS3.g:669:4: identifier
					{
					pushFollow(FOLLOW_identifier_in_typeExpression2495);
					identifier228=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier228.getTree());
					}
					break;
				case 2 :
					// AS3.g:669:17: VOID
					{
					VOID229=(Token)match(input,VOID,FOLLOW_VOID_in_typeExpression2499); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VOID.add(VOID229);

					}
					break;
				case 3 :
					// AS3.g:669:24: STAR
					{
					STAR230=(Token)match(input,STAR,FOLLOW_STAR_in_typeExpression2503); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR230);

					}
					break;

			}


			// AST REWRITE
			// elements: STAR, VOID, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 670:3: -> ^( TYPE_SPEC[$c] ( identifier )? ( VOID )? ( STAR )? )
			{
				// AS3.g:670:6: ^( TYPE_SPEC[$c] ( identifier )? ( VOID )? ( STAR )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(TYPE_SPEC, c), root_1);
				// AS3.g:670:22: ( identifier )?
				if ( stream_identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_identifier.nextTree());
				}
				stream_identifier.reset();

				// AS3.g:670:34: ( VOID )?
				if ( stream_VOID.hasNext() ) {
					adaptor.addChild(root_1, stream_VOID.nextNode());
				}
				stream_VOID.reset();

				// AS3.g:670:40: ( STAR )?
				if ( stream_STAR.hasNext() ) {
					adaptor.addChild(root_1, stream_STAR.nextNode());
				}
				stream_STAR.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeExpression"


	public static class identifier_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// AS3.g:673:1: identifier : ( qualifiedIdent -> qualifiedIdent ) ( options {greedy=true; } :poi= propOrIdent[root_0, retval.start] -> $poi)* -> ^( IDENTIFIER $identifier) ;
	public final AS3Parser.identifier_return identifier() throws RecognitionException {
		AS3Parser.identifier_return retval = new AS3Parser.identifier_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope poi =null;
		ParserRuleReturnScope qualifiedIdent231 =null;

		RewriteRuleSubtreeStream stream_propOrIdent=new RewriteRuleSubtreeStream(adaptor,"rule propOrIdent");
		RewriteRuleSubtreeStream stream_qualifiedIdent=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedIdent");

		try {
			// AS3.g:674:2: ( ( qualifiedIdent -> qualifiedIdent ) ( options {greedy=true; } :poi= propOrIdent[root_0, retval.start] -> $poi)* -> ^( IDENTIFIER $identifier) )
			// AS3.g:674:4: ( qualifiedIdent -> qualifiedIdent ) ( options {greedy=true; } :poi= propOrIdent[root_0, retval.start] -> $poi)*
			{
			// AS3.g:674:4: ( qualifiedIdent -> qualifiedIdent )
			// AS3.g:674:7: qualifiedIdent
			{
			pushFollow(FOLLOW_qualifiedIdent_in_identifier2538);
			qualifiedIdent231=qualifiedIdent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_qualifiedIdent.add(qualifiedIdent231.getTree());

			// AST REWRITE
			// elements: qualifiedIdent
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 674:22: -> qualifiedIdent
			{
				adaptor.addChild(root_0, stream_qualifiedIdent.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// AS3.g:676:3: ( options {greedy=true; } :poi= propOrIdent[root_0, retval.start] -> $poi)*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==DOT) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// AS3.g:677:6: poi= propOrIdent[root_0, retval.start]
					{
					pushFollow(FOLLOW_propOrIdent_in_identifier2566);
					poi=propOrIdent(root_0, retval.start);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_propOrIdent.add(poi.getTree());

					// AST REWRITE
					// elements: poi
					// token labels: 
					// rule labels: poi, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_poi=new RewriteRuleSubtreeStream(adaptor,"rule poi",poi!=null?poi.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 677:44: -> $poi
					{
						adaptor.addChild(root_0, stream_poi.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop48;
				}
			}


			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 679:3: -> ^( IDENTIFIER $identifier)
			{
				// AS3.g:679:6: ^( IDENTIFIER $identifier)
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(IDENTIFIER, "IDENTIFIER"), root_1);
				adaptor.addChild(root_1, stream_retval.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class propertyIdentifier_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "propertyIdentifier"
	// AS3.g:682:1: propertyIdentifier : ( STAR | ident );
	public final AS3Parser.propertyIdentifier_return propertyIdentifier() throws RecognitionException {
		AS3Parser.propertyIdentifier_return retval = new AS3Parser.propertyIdentifier_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token STAR232=null;
		ParserRuleReturnScope ident233 =null;

		LinkedListTree STAR232_tree=null;

		try {
			// AS3.g:683:2: ( STAR | ident )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==STAR) ) {
				alt49=1;
			}
			else if ( (LA49_0==AS||LA49_0==DYNAMIC||LA49_0==GET||LA49_0==IDENT||LA49_0==IS||LA49_0==NAMESPACE||LA49_0==SET||LA49_0==USE||LA49_0==XML) ) {
				alt49=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// AS3.g:683:4: STAR
					{
					root_0 = (LinkedListTree)adaptor.nil();


					STAR232=(Token)match(input,STAR,FOLLOW_STAR_in_propertyIdentifier2599); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STAR232_tree = (LinkedListTree)adaptor.create(STAR232);
					adaptor.addChild(root_0, STAR232_tree);
					}

					}
					break;
				case 2 :
					// AS3.g:684:4: ident
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_ident_in_propertyIdentifier2604);
					ident233=ident();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ident233.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "propertyIdentifier"


	public static class qualifier_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "qualifier"
	// AS3.g:687:1: qualifier : ( propertyIdentifier | reservedNamespace ) ;
	public final AS3Parser.qualifier_return qualifier() throws RecognitionException {
		AS3Parser.qualifier_return retval = new AS3Parser.qualifier_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope propertyIdentifier234 =null;
		ParserRuleReturnScope reservedNamespace235 =null;


		try {
			// AS3.g:688:2: ( ( propertyIdentifier | reservedNamespace ) )
			// AS3.g:688:4: ( propertyIdentifier | reservedNamespace )
			{
			root_0 = (LinkedListTree)adaptor.nil();


			// AS3.g:688:4: ( propertyIdentifier | reservedNamespace )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==AS||LA50_0==DYNAMIC||LA50_0==GET||LA50_0==IDENT||LA50_0==IS||LA50_0==NAMESPACE||LA50_0==SET||LA50_0==STAR||LA50_0==USE||LA50_0==XML) ) {
				alt50=1;
			}
			else if ( (LA50_0==INTERNAL||LA50_0==PRIVATE||(LA50_0 >= PROTECTED && LA50_0 <= PUBLIC)) ) {
				alt50=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// AS3.g:688:6: propertyIdentifier
					{
					pushFollow(FOLLOW_propertyIdentifier_in_qualifier2617);
					propertyIdentifier234=propertyIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyIdentifier234.getTree());

					}
					break;
				case 2 :
					// AS3.g:688:27: reservedNamespace
					{
					pushFollow(FOLLOW_reservedNamespace_in_qualifier2621);
					reservedNamespace235=reservedNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, reservedNamespace235.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qualifier"


	public static class simpleQualifiedIdentifier_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "simpleQualifiedIdentifier"
	// AS3.g:691:1: simpleQualifiedIdentifier : ( propertyIdentifier | qualifier DBL_COLON ^ ( propertyIdentifier | brackets ) );
	public final AS3Parser.simpleQualifiedIdentifier_return simpleQualifiedIdentifier() throws RecognitionException {
		AS3Parser.simpleQualifiedIdentifier_return retval = new AS3Parser.simpleQualifiedIdentifier_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token DBL_COLON238=null;
		ParserRuleReturnScope propertyIdentifier236 =null;
		ParserRuleReturnScope qualifier237 =null;
		ParserRuleReturnScope propertyIdentifier239 =null;
		ParserRuleReturnScope brackets240 =null;

		LinkedListTree DBL_COLON238_tree=null;

		try {
			// AS3.g:692:2: ( propertyIdentifier | qualifier DBL_COLON ^ ( propertyIdentifier | brackets ) )
			int alt52=2;
			alt52 = dfa52.predict(input);
			switch (alt52) {
				case 1 :
					// AS3.g:692:4: propertyIdentifier
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_propertyIdentifier_in_simpleQualifiedIdentifier2634);
					propertyIdentifier236=propertyIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyIdentifier236.getTree());

					}
					break;
				case 2 :
					// AS3.g:693:4: qualifier DBL_COLON ^ ( propertyIdentifier | brackets )
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_qualifier_in_simpleQualifiedIdentifier2639);
					qualifier237=qualifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifier237.getTree());

					DBL_COLON238=(Token)match(input,DBL_COLON,FOLLOW_DBL_COLON_in_simpleQualifiedIdentifier2641); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DBL_COLON238_tree = (LinkedListTree)adaptor.create(DBL_COLON238);
					root_0 = (LinkedListTree)adaptor.becomeRoot(DBL_COLON238_tree, root_0);
					}

					// AS3.g:694:3: ( propertyIdentifier | brackets )
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==AS||LA51_0==DYNAMIC||LA51_0==GET||LA51_0==IDENT||LA51_0==IS||LA51_0==NAMESPACE||LA51_0==SET||LA51_0==STAR||LA51_0==USE||LA51_0==XML) ) {
						alt51=1;
					}
					else if ( (LA51_0==LBRACK) ) {
						alt51=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);
						throw nvae;
					}

					switch (alt51) {
						case 1 :
							// AS3.g:694:5: propertyIdentifier
							{
							pushFollow(FOLLOW_propertyIdentifier_in_simpleQualifiedIdentifier2648);
							propertyIdentifier239=propertyIdentifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyIdentifier239.getTree());

							}
							break;
						case 2 :
							// AS3.g:695:6: brackets
							{
							pushFollow(FOLLOW_brackets_in_simpleQualifiedIdentifier2655);
							brackets240=brackets();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, brackets240.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleQualifiedIdentifier"


	public static class expressionQualifiedIdentifier_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "expressionQualifiedIdentifier"
	// AS3.g:699:1: expressionQualifiedIdentifier : encapsulatedExpression DBL_COLON ^ ( propertyIdentifier | brackets ) ;
	public final AS3Parser.expressionQualifiedIdentifier_return expressionQualifiedIdentifier() throws RecognitionException {
		AS3Parser.expressionQualifiedIdentifier_return retval = new AS3Parser.expressionQualifiedIdentifier_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token DBL_COLON242=null;
		ParserRuleReturnScope encapsulatedExpression241 =null;
		ParserRuleReturnScope propertyIdentifier243 =null;
		ParserRuleReturnScope brackets244 =null;

		LinkedListTree DBL_COLON242_tree=null;

		try {
			// AS3.g:700:2: ( encapsulatedExpression DBL_COLON ^ ( propertyIdentifier | brackets ) )
			// AS3.g:700:4: encapsulatedExpression DBL_COLON ^ ( propertyIdentifier | brackets )
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_encapsulatedExpression_in_expressionQualifiedIdentifier2670);
			encapsulatedExpression241=encapsulatedExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, encapsulatedExpression241.getTree());

			DBL_COLON242=(Token)match(input,DBL_COLON,FOLLOW_DBL_COLON_in_expressionQualifiedIdentifier2672); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DBL_COLON242_tree = (LinkedListTree)adaptor.create(DBL_COLON242);
			root_0 = (LinkedListTree)adaptor.becomeRoot(DBL_COLON242_tree, root_0);
			}

			// AS3.g:701:3: ( propertyIdentifier | brackets )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==AS||LA53_0==DYNAMIC||LA53_0==GET||LA53_0==IDENT||LA53_0==IS||LA53_0==NAMESPACE||LA53_0==SET||LA53_0==STAR||LA53_0==USE||LA53_0==XML) ) {
				alt53=1;
			}
			else if ( (LA53_0==LBRACK) ) {
				alt53=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// AS3.g:701:5: propertyIdentifier
					{
					pushFollow(FOLLOW_propertyIdentifier_in_expressionQualifiedIdentifier2679);
					propertyIdentifier243=propertyIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyIdentifier243.getTree());

					}
					break;
				case 2 :
					// AS3.g:702:5: brackets
					{
					pushFollow(FOLLOW_brackets_in_expressionQualifiedIdentifier2685);
					brackets244=brackets();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, brackets244.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionQualifiedIdentifier"


	public static class nonAttributeQualifiedIdentifier_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "nonAttributeQualifiedIdentifier"
	// AS3.g:706:1: nonAttributeQualifiedIdentifier : ( simpleQualifiedIdentifier | expressionQualifiedIdentifier );
	public final AS3Parser.nonAttributeQualifiedIdentifier_return nonAttributeQualifiedIdentifier() throws RecognitionException {
		AS3Parser.nonAttributeQualifiedIdentifier_return retval = new AS3Parser.nonAttributeQualifiedIdentifier_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope simpleQualifiedIdentifier245 =null;
		ParserRuleReturnScope expressionQualifiedIdentifier246 =null;


		try {
			// AS3.g:707:2: ( simpleQualifiedIdentifier | expressionQualifiedIdentifier )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==AS||LA54_0==DYNAMIC||LA54_0==GET||LA54_0==IDENT||(LA54_0 >= INTERNAL && LA54_0 <= IS)||LA54_0==NAMESPACE||LA54_0==PRIVATE||(LA54_0 >= PROTECTED && LA54_0 <= PUBLIC)||LA54_0==SET||LA54_0==STAR||LA54_0==USE||LA54_0==XML) ) {
				alt54=1;
			}
			else if ( (LA54_0==LPAREN) ) {
				alt54=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// AS3.g:707:4: simpleQualifiedIdentifier
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_simpleQualifiedIdentifier_in_nonAttributeQualifiedIdentifier2700);
					simpleQualifiedIdentifier245=simpleQualifiedIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleQualifiedIdentifier245.getTree());

					}
					break;
				case 2 :
					// AS3.g:708:4: expressionQualifiedIdentifier
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_expressionQualifiedIdentifier_in_nonAttributeQualifiedIdentifier2705);
					expressionQualifiedIdentifier246=expressionQualifiedIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionQualifiedIdentifier246.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nonAttributeQualifiedIdentifier"


	public static class qualifiedIdentifier_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "qualifiedIdentifier"
	// AS3.g:711:1: qualifiedIdentifier : ( e4xAttributeIdentifier | nonAttributeQualifiedIdentifier );
	public final AS3Parser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
		AS3Parser.qualifiedIdentifier_return retval = new AS3Parser.qualifiedIdentifier_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope e4xAttributeIdentifier247 =null;
		ParserRuleReturnScope nonAttributeQualifiedIdentifier248 =null;


		try {
			// AS3.g:712:2: ( e4xAttributeIdentifier | nonAttributeQualifiedIdentifier )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==E4X_ATTRI) ) {
				alt55=1;
			}
			else if ( (LA55_0==AS||LA55_0==DYNAMIC||LA55_0==GET||LA55_0==IDENT||(LA55_0 >= INTERNAL && LA55_0 <= IS)||LA55_0==LPAREN||LA55_0==NAMESPACE||LA55_0==PRIVATE||(LA55_0 >= PROTECTED && LA55_0 <= PUBLIC)||LA55_0==SET||LA55_0==STAR||LA55_0==USE||LA55_0==XML) ) {
				alt55=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// AS3.g:712:4: e4xAttributeIdentifier
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_e4xAttributeIdentifier_in_qualifiedIdentifier2716);
					e4xAttributeIdentifier247=e4xAttributeIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e4xAttributeIdentifier247.getTree());

					}
					break;
				case 2 :
					// AS3.g:713:4: nonAttributeQualifiedIdentifier
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_nonAttributeQualifiedIdentifier_in_qualifiedIdentifier2721);
					nonAttributeQualifiedIdentifier248=nonAttributeQualifiedIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nonAttributeQualifiedIdentifier248.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qualifiedIdentifier"


	public static class qualifiedIdent_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "qualifiedIdent"
	// AS3.g:716:1: qualifiedIdent : ( namespaceName DBL_COLON ^)? ident ;
	public final AS3Parser.qualifiedIdent_return qualifiedIdent() throws RecognitionException {
		AS3Parser.qualifiedIdent_return retval = new AS3Parser.qualifiedIdent_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token DBL_COLON250=null;
		ParserRuleReturnScope namespaceName249 =null;
		ParserRuleReturnScope ident251 =null;

		LinkedListTree DBL_COLON250_tree=null;

		try {
			// AS3.g:717:2: ( ( namespaceName DBL_COLON ^)? ident )
			// AS3.g:717:4: ( namespaceName DBL_COLON ^)? ident
			{
			root_0 = (LinkedListTree)adaptor.nil();


			// AS3.g:717:4: ( namespaceName DBL_COLON ^)?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==IDENT) ) {
				int LA56_1 = input.LA(2);
				if ( (LA56_1==DBL_COLON) ) {
					alt56=1;
				}
			}
			else if ( (LA56_0==INTERNAL||LA56_0==PRIVATE||(LA56_0 >= PROTECTED && LA56_0 <= PUBLIC)) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// AS3.g:717:5: namespaceName DBL_COLON ^
					{
					pushFollow(FOLLOW_namespaceName_in_qualifiedIdent2733);
					namespaceName249=namespaceName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceName249.getTree());

					DBL_COLON250=(Token)match(input,DBL_COLON,FOLLOW_DBL_COLON_in_qualifiedIdent2735); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DBL_COLON250_tree = (LinkedListTree)adaptor.create(DBL_COLON250);
					root_0 = (LinkedListTree)adaptor.becomeRoot(DBL_COLON250_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_ident_in_qualifiedIdent2740);
			ident251=ident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ident251.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qualifiedIdent"


	public static class namespaceName_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "namespaceName"
	// AS3.g:720:1: namespaceName : ( IDENT | reservedNamespace );
	public final AS3Parser.namespaceName_return namespaceName() throws RecognitionException {
		AS3Parser.namespaceName_return retval = new AS3Parser.namespaceName_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token IDENT252=null;
		ParserRuleReturnScope reservedNamespace253 =null;

		LinkedListTree IDENT252_tree=null;

		try {
			// AS3.g:721:2: ( IDENT | reservedNamespace )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==IDENT) ) {
				alt57=1;
			}
			else if ( (LA57_0==INTERNAL||LA57_0==PRIVATE||(LA57_0 >= PROTECTED && LA57_0 <= PUBLIC)) ) {
				alt57=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// AS3.g:721:4: IDENT
					{
					root_0 = (LinkedListTree)adaptor.nil();


					IDENT252=(Token)match(input,IDENT,FOLLOW_IDENT_in_namespaceName2752); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT252_tree = (LinkedListTree)adaptor.create(IDENT252);
					adaptor.addChild(root_0, IDENT252_tree);
					}

					}
					break;
				case 2 :
					// AS3.g:721:12: reservedNamespace
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_reservedNamespace_in_namespaceName2756);
					reservedNamespace253=reservedNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, reservedNamespace253.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namespaceName"


	public static class reservedNamespace_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "reservedNamespace"
	// AS3.g:724:1: reservedNamespace : ( PUBLIC | PRIVATE | PROTECTED | INTERNAL );
	public final AS3Parser.reservedNamespace_return reservedNamespace() throws RecognitionException {
		AS3Parser.reservedNamespace_return retval = new AS3Parser.reservedNamespace_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set254=null;

		LinkedListTree set254_tree=null;

		try {
			// AS3.g:725:2: ( PUBLIC | PRIVATE | PROTECTED | INTERNAL )
			// AS3.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set254=input.LT(1);
			if ( input.LA(1)==INTERNAL||input.LA(1)==PRIVATE||(input.LA(1) >= PROTECTED && input.LA(1) <= PUBLIC) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set254));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reservedNamespace"


	public static class identifierStar_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "identifierStar"
	// AS3.g:731:1: identifierStar : ident ( options {greedy=true; } : DOT ident )* ( DOT STAR )? -> ^( IDENTIFIER_STAR ( ident )+ ( STAR )? ) ;
	public final AS3Parser.identifierStar_return identifierStar() throws RecognitionException {
		AS3Parser.identifierStar_return retval = new AS3Parser.identifierStar_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token DOT256=null;
		Token DOT258=null;
		Token STAR259=null;
		ParserRuleReturnScope ident255 =null;
		ParserRuleReturnScope ident257 =null;

		LinkedListTree DOT256_tree=null;
		LinkedListTree DOT258_tree=null;
		LinkedListTree STAR259_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");

		try {
			// AS3.g:732:2: ( ident ( options {greedy=true; } : DOT ident )* ( DOT STAR )? -> ^( IDENTIFIER_STAR ( ident )+ ( STAR )? ) )
			// AS3.g:732:4: ident ( options {greedy=true; } : DOT ident )* ( DOT STAR )?
			{
			pushFollow(FOLLOW_ident_in_identifierStar2793);
			ident255=ident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ident.add(ident255.getTree());
			// AS3.g:733:3: ( options {greedy=true; } : DOT ident )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==DOT) ) {
					int LA58_1 = input.LA(2);
					if ( (LA58_1==AS||LA58_1==DYNAMIC||LA58_1==GET||LA58_1==IDENT||LA58_1==IS||LA58_1==NAMESPACE||LA58_1==SET||LA58_1==USE||LA58_1==XML) ) {
						alt58=1;
					}

				}

				switch (alt58) {
				case 1 :
					// AS3.g:734:5: DOT ident
					{
					DOT256=(Token)match(input,DOT,FOLLOW_DOT_in_identifierStar2810); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT256);

					pushFollow(FOLLOW_ident_in_identifierStar2812);
					ident257=ident();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ident.add(ident257.getTree());
					}
					break;

				default :
					break loop58;
				}
			}

			// AS3.g:736:3: ( DOT STAR )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==DOT) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// AS3.g:736:5: DOT STAR
					{
					DOT258=(Token)match(input,DOT,FOLLOW_DOT_in_identifierStar2824); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT258);

					STAR259=(Token)match(input,STAR,FOLLOW_STAR_in_identifierStar2826); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR259);

					}
					break;

			}


			// AST REWRITE
			// elements: STAR, ident
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 738:3: -> ^( IDENTIFIER_STAR ( ident )+ ( STAR )? )
			{
				// AS3.g:738:6: ^( IDENTIFIER_STAR ( ident )+ ( STAR )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(IDENTIFIER_STAR, "IDENTIFIER_STAR"), root_1);
				if ( !(stream_ident.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_ident.hasNext() ) {
					adaptor.addChild(root_1, stream_ident.nextTree());
				}
				stream_ident.reset();

				// AS3.g:738:31: ( STAR )?
				if ( stream_STAR.hasNext() ) {
					adaptor.addChild(root_1, stream_STAR.nextNode());
				}
				stream_STAR.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifierStar"


	public static class annotations_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "annotations"
	// AS3.g:741:1: annotations : ( annotation | includeDirective )* -> ^( ANNOTATIONS ( annotation )* ) ;
	public final AS3Parser.annotations_return annotations() throws RecognitionException {
		AS3Parser.annotations_return retval = new AS3Parser.annotations_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope annotation260 =null;
		ParserRuleReturnScope includeDirective261 =null;

		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_includeDirective=new RewriteRuleSubtreeStream(adaptor,"rule includeDirective");

		try {
			// AS3.g:742:2: ( ( annotation | includeDirective )* -> ^( ANNOTATIONS ( annotation )* ) )
			// AS3.g:742:4: ( annotation | includeDirective )*
			{
			// AS3.g:742:4: ( annotation | includeDirective )*
			loop60:
			while (true) {
				int alt60=3;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==LBRACK) ) {
					alt60=1;
				}
				else if ( (LA60_0==188) ) {
					alt60=2;
				}

				switch (alt60) {
				case 1 :
					// AS3.g:742:6: annotation
					{
					pushFollow(FOLLOW_annotation_in_annotations2858);
					annotation260=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotation.add(annotation260.getTree());
					}
					break;
				case 2 :
					// AS3.g:743:5: includeDirective
					{
					pushFollow(FOLLOW_includeDirective_in_annotations2864);
					includeDirective261=includeDirective();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_includeDirective.add(includeDirective261.getTree());
					}
					break;

				default :
					break loop60;
				}
			}


			// AST REWRITE
			// elements: annotation
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 745:3: -> ^( ANNOTATIONS ( annotation )* )
			{
				// AS3.g:745:6: ^( ANNOTATIONS ( annotation )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ANNOTATIONS, "ANNOTATIONS"), root_1);
				// AS3.g:745:20: ( annotation )*
				while ( stream_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation.nextTree());
				}
				stream_annotation.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotations"


	public static class annotation_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "annotation"
	// AS3.g:748:1: annotation : LBRACK ident ( annotationParamList )? RBRACK -> ^( ANNOTATION ident ( annotationParamList )? ) ;
	public final AS3Parser.annotation_return annotation() throws RecognitionException {
		AS3Parser.annotation_return retval = new AS3Parser.annotation_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LBRACK262=null;
		Token RBRACK265=null;
		ParserRuleReturnScope ident263 =null;
		ParserRuleReturnScope annotationParamList264 =null;

		LinkedListTree LBRACK262_tree=null;
		LinkedListTree RBRACK265_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleSubtreeStream stream_annotationParamList=new RewriteRuleSubtreeStream(adaptor,"rule annotationParamList");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");

		try {
			// AS3.g:749:2: ( LBRACK ident ( annotationParamList )? RBRACK -> ^( ANNOTATION ident ( annotationParamList )? ) )
			// AS3.g:749:4: LBRACK ident ( annotationParamList )? RBRACK
			{
			LBRACK262=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_annotation2891); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK262);

			pushFollow(FOLLOW_ident_in_annotation2895);
			ident263=ident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ident.add(ident263.getTree());
			// AS3.g:751:3: ( annotationParamList )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==LPAREN) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// AS3.g:751:3: annotationParamList
					{
					pushFollow(FOLLOW_annotationParamList_in_annotation2899);
					annotationParamList264=annotationParamList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotationParamList.add(annotationParamList264.getTree());
					}
					break;

			}

			RBRACK265=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_annotation2904); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK265);


			// AST REWRITE
			// elements: ident, annotationParamList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 753:3: -> ^( ANNOTATION ident ( annotationParamList )? )
			{
				// AS3.g:753:6: ^( ANNOTATION ident ( annotationParamList )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ANNOTATION, "ANNOTATION"), root_1);
				adaptor.addChild(root_1, stream_ident.nextTree());
				// AS3.g:753:25: ( annotationParamList )?
				if ( stream_annotationParamList.hasNext() ) {
					adaptor.addChild(root_1, stream_annotationParamList.nextTree());
				}
				stream_annotationParamList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotation"


	public static class annotationParamList_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "annotationParamList"
	// AS3.g:756:1: annotationParamList : LPAREN ( annotationParam ( COMMA annotationParam )* )? RPAREN -> ^( ANNOTATION_PARAMS ( annotationParam )* ) ;
	public final AS3Parser.annotationParamList_return annotationParamList() throws RecognitionException {
		AS3Parser.annotationParamList_return retval = new AS3Parser.annotationParamList_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LPAREN266=null;
		Token COMMA268=null;
		Token RPAREN270=null;
		ParserRuleReturnScope annotationParam267 =null;
		ParserRuleReturnScope annotationParam269 =null;

		LinkedListTree LPAREN266_tree=null;
		LinkedListTree COMMA268_tree=null;
		LinkedListTree RPAREN270_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_annotationParam=new RewriteRuleSubtreeStream(adaptor,"rule annotationParam");

		try {
			// AS3.g:757:2: ( LPAREN ( annotationParam ( COMMA annotationParam )* )? RPAREN -> ^( ANNOTATION_PARAMS ( annotationParam )* ) )
			// AS3.g:758:3: LPAREN ( annotationParam ( COMMA annotationParam )* )? RPAREN
			{
			LPAREN266=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotationParamList2930); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN266);

			// AS3.g:759:3: ( annotationParam ( COMMA annotationParam )* )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==AS||LA63_0==DECIMAL_LITERAL||LA63_0==DIV||LA63_0==DYNAMIC||LA63_0==FALSE||LA63_0==FLOAT_LITERAL||LA63_0==GET||(LA63_0 >= HEX_LITERAL && LA63_0 <= IDENT)||LA63_0==IS||LA63_0==LT||LA63_0==NAMESPACE||LA63_0==NULL||LA63_0==OCTAL_LITERAL||LA63_0==SET||LA63_0==STRING_LITERAL||LA63_0==TRUE||LA63_0==USE||LA63_0==XML) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// AS3.g:759:5: annotationParam ( COMMA annotationParam )*
					{
					pushFollow(FOLLOW_annotationParam_in_annotationParamList2936);
					annotationParam267=annotationParam();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_annotationParam.add(annotationParam267.getTree());
					// AS3.g:760:4: ( COMMA annotationParam )*
					loop62:
					while (true) {
						int alt62=2;
						int LA62_0 = input.LA(1);
						if ( (LA62_0==COMMA) ) {
							alt62=1;
						}

						switch (alt62) {
						case 1 :
							// AS3.g:760:5: COMMA annotationParam
							{
							COMMA268=(Token)match(input,COMMA,FOLLOW_COMMA_in_annotationParamList2942); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA268);

							pushFollow(FOLLOW_annotationParam_in_annotationParamList2944);
							annotationParam269=annotationParam();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_annotationParam.add(annotationParam269.getTree());
							}
							break;

						default :
							break loop62;
						}
					}

					}
					break;

			}

			RPAREN270=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotationParamList2955); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN270);


			// AST REWRITE
			// elements: annotationParam
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 763:3: -> ^( ANNOTATION_PARAMS ( annotationParam )* )
			{
				// AS3.g:763:6: ^( ANNOTATION_PARAMS ( annotationParam )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ANNOTATION_PARAMS, "ANNOTATION_PARAMS"), root_1);
				// AS3.g:763:26: ( annotationParam )*
				while ( stream_annotationParam.hasNext() ) {
					adaptor.addChild(root_1, stream_annotationParam.nextTree());
				}
				stream_annotationParam.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotationParamList"


	public static class annotationParam_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "annotationParam"
	// AS3.g:777:1: annotationParam : ( ident ASSIGN constant -> ^( ASSIGN ident constant ) | constant -> constant | ident -> ident );
	public final AS3Parser.annotationParam_return annotationParam() throws RecognitionException {
		AS3Parser.annotationParam_return retval = new AS3Parser.annotationParam_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token ASSIGN272=null;
		ParserRuleReturnScope ident271 =null;
		ParserRuleReturnScope constant273 =null;
		ParserRuleReturnScope constant274 =null;
		ParserRuleReturnScope ident275 =null;

		LinkedListTree ASSIGN272_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");

		try {
			// AS3.g:778:2: ( ident ASSIGN constant -> ^( ASSIGN ident constant ) | constant -> constant | ident -> ident )
			int alt64=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA64_1 = input.LA(2);
				if ( (LA64_1==ASSIGN) ) {
					alt64=1;
				}
				else if ( (LA64_1==COMMA||LA64_1==RPAREN) ) {
					alt64=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case USE:
				{
				int LA64_2 = input.LA(2);
				if ( (LA64_2==ASSIGN) ) {
					alt64=1;
				}
				else if ( (LA64_2==COMMA||LA64_2==RPAREN) ) {
					alt64=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case XML:
				{
				int LA64_3 = input.LA(2);
				if ( (LA64_3==ASSIGN) ) {
					alt64=1;
				}
				else if ( (LA64_3==COMMA||LA64_3==RPAREN) ) {
					alt64=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DYNAMIC:
				{
				int LA64_4 = input.LA(2);
				if ( (LA64_4==ASSIGN) ) {
					alt64=1;
				}
				else if ( (LA64_4==COMMA||LA64_4==RPAREN) ) {
					alt64=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMESPACE:
				{
				int LA64_5 = input.LA(2);
				if ( (LA64_5==ASSIGN) ) {
					alt64=1;
				}
				else if ( (LA64_5==COMMA||LA64_5==RPAREN) ) {
					alt64=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IS:
				{
				int LA64_6 = input.LA(2);
				if ( (LA64_6==ASSIGN) ) {
					alt64=1;
				}
				else if ( (LA64_6==COMMA||LA64_6==RPAREN) ) {
					alt64=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AS:
				{
				int LA64_7 = input.LA(2);
				if ( (LA64_7==ASSIGN) ) {
					alt64=1;
				}
				else if ( (LA64_7==COMMA||LA64_7==RPAREN) ) {
					alt64=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case GET:
				{
				int LA64_8 = input.LA(2);
				if ( (LA64_8==ASSIGN) ) {
					alt64=1;
				}
				else if ( (LA64_8==COMMA||LA64_8==RPAREN) ) {
					alt64=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SET:
				{
				int LA64_9 = input.LA(2);
				if ( (LA64_9==ASSIGN) ) {
					alt64=1;
				}
				else if ( (LA64_9==COMMA||LA64_9==RPAREN) ) {
					alt64=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DECIMAL_LITERAL:
			case DIV:
			case FALSE:
			case FLOAT_LITERAL:
			case HEX_LITERAL:
			case LT:
			case NULL:
			case OCTAL_LITERAL:
			case STRING_LITERAL:
			case TRUE:
				{
				alt64=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// AS3.g:779:3: ident ASSIGN constant
					{
					pushFollow(FOLLOW_ident_in_annotationParam2982);
					ident271=ident();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ident.add(ident271.getTree());
					ASSIGN272=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationParam2984); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN272);

					pushFollow(FOLLOW_constant_in_annotationParam2986);
					constant273=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constant.add(constant273.getTree());

					// AST REWRITE
					// elements: constant, ident, ASSIGN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 779:25: -> ^( ASSIGN ident constant )
					{
						// AS3.g:779:28: ^( ASSIGN ident constant )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ident.nextTree());
						adaptor.addChild(root_1, stream_constant.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AS3.g:780:4: constant
					{
					pushFollow(FOLLOW_constant_in_annotationParam3001);
					constant274=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constant.add(constant274.getTree());

					// AST REWRITE
					// elements: constant
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 780:13: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AS3.g:781:4: ident
					{
					pushFollow(FOLLOW_ident_in_annotationParam3010);
					ident275=ident();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ident.add(ident275.getTree());

					// AST REWRITE
					// elements: ident
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 781:10: -> ident
					{
						adaptor.addChild(root_0, stream_ident.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotationParam"


	public static class modifiers_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "modifiers"
	// AS3.g:784:1: modifiers : ( modifier )* -> ^( MODIFIERS ( modifier )* ) ;
	public final AS3Parser.modifiers_return modifiers() throws RecognitionException {
		AS3Parser.modifiers_return retval = new AS3Parser.modifiers_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope modifier276 =null;

		RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");

		try {
			// AS3.g:785:2: ( ( modifier )* -> ^( MODIFIERS ( modifier )* ) )
			// AS3.g:785:4: ( modifier )*
			{
			// AS3.g:785:4: ( modifier )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==DYNAMIC||LA65_0==FINAL||LA65_0==IDENT||LA65_0==INTERNAL||LA65_0==OVERRIDE||LA65_0==PRIVATE||(LA65_0 >= PROTECTED && LA65_0 <= PUBLIC)||LA65_0==STATIC||(LA65_0 >= 186 && LA65_0 <= 187)||LA65_0==189) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// AS3.g:785:4: modifier
					{
					pushFollow(FOLLOW_modifier_in_modifiers3025);
					modifier276=modifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_modifier.add(modifier276.getTree());
					}
					break;

				default :
					break loop65;
				}
			}


			// AST REWRITE
			// elements: modifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 786:3: -> ^( MODIFIERS ( modifier )* )
			{
				// AS3.g:786:6: ^( MODIFIERS ( modifier )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(MODIFIERS, "MODIFIERS"), root_1);
				// AS3.g:786:18: ( modifier )*
				while ( stream_modifier.hasNext() ) {
					adaptor.addChild(root_1, stream_modifier.nextTree());
				}
				stream_modifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modifiers"


	public static class modifier_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "modifier"
	// AS3.g:789:1: modifier : ( namespaceName | STATIC | FINAL | 'enumerable' | 'explicit' | OVERRIDE | DYNAMIC | 'intrinsic' );
	public final AS3Parser.modifier_return modifier() throws RecognitionException {
		AS3Parser.modifier_return retval = new AS3Parser.modifier_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token STATIC278=null;
		Token FINAL279=null;
		Token string_literal280=null;
		Token string_literal281=null;
		Token OVERRIDE282=null;
		Token DYNAMIC283=null;
		Token string_literal284=null;
		ParserRuleReturnScope namespaceName277 =null;

		LinkedListTree STATIC278_tree=null;
		LinkedListTree FINAL279_tree=null;
		LinkedListTree string_literal280_tree=null;
		LinkedListTree string_literal281_tree=null;
		LinkedListTree OVERRIDE282_tree=null;
		LinkedListTree DYNAMIC283_tree=null;
		LinkedListTree string_literal284_tree=null;

		try {
			// AS3.g:790:2: ( namespaceName | STATIC | FINAL | 'enumerable' | 'explicit' | OVERRIDE | DYNAMIC | 'intrinsic' )
			int alt66=8;
			switch ( input.LA(1) ) {
			case IDENT:
			case INTERNAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
				{
				alt66=1;
				}
				break;
			case STATIC:
				{
				alt66=2;
				}
				break;
			case FINAL:
				{
				alt66=3;
				}
				break;
			case 186:
				{
				alt66=4;
				}
				break;
			case 187:
				{
				alt66=5;
				}
				break;
			case OVERRIDE:
				{
				alt66=6;
				}
				break;
			case DYNAMIC:
				{
				alt66=7;
				}
				break;
			case 189:
				{
				alt66=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// AS3.g:790:4: namespaceName
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_namespaceName_in_modifier3048);
					namespaceName277=namespaceName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceName277.getTree());

					}
					break;
				case 2 :
					// AS3.g:791:4: STATIC
					{
					root_0 = (LinkedListTree)adaptor.nil();


					STATIC278=(Token)match(input,STATIC,FOLLOW_STATIC_in_modifier3053); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STATIC278_tree = (LinkedListTree)adaptor.create(STATIC278);
					adaptor.addChild(root_0, STATIC278_tree);
					}

					}
					break;
				case 3 :
					// AS3.g:792:4: FINAL
					{
					root_0 = (LinkedListTree)adaptor.nil();


					FINAL279=(Token)match(input,FINAL,FOLLOW_FINAL_in_modifier3058); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FINAL279_tree = (LinkedListTree)adaptor.create(FINAL279);
					adaptor.addChild(root_0, FINAL279_tree);
					}

					}
					break;
				case 4 :
					// AS3.g:793:4: 'enumerable'
					{
					root_0 = (LinkedListTree)adaptor.nil();


					string_literal280=(Token)match(input,186,FOLLOW_186_in_modifier3063); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal280_tree = (LinkedListTree)adaptor.create(string_literal280);
					adaptor.addChild(root_0, string_literal280_tree);
					}

					}
					break;
				case 5 :
					// AS3.g:794:4: 'explicit'
					{
					root_0 = (LinkedListTree)adaptor.nil();


					string_literal281=(Token)match(input,187,FOLLOW_187_in_modifier3068); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal281_tree = (LinkedListTree)adaptor.create(string_literal281);
					adaptor.addChild(root_0, string_literal281_tree);
					}

					}
					break;
				case 6 :
					// AS3.g:795:4: OVERRIDE
					{
					root_0 = (LinkedListTree)adaptor.nil();


					OVERRIDE282=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_modifier3073); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OVERRIDE282_tree = (LinkedListTree)adaptor.create(OVERRIDE282);
					adaptor.addChild(root_0, OVERRIDE282_tree);
					}

					}
					break;
				case 7 :
					// AS3.g:796:4: DYNAMIC
					{
					root_0 = (LinkedListTree)adaptor.nil();


					DYNAMIC283=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_modifier3078); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DYNAMIC283_tree = (LinkedListTree)adaptor.create(DYNAMIC283);
					adaptor.addChild(root_0, DYNAMIC283_tree);
					}

					}
					break;
				case 8 :
					// AS3.g:797:4: 'intrinsic'
					{
					root_0 = (LinkedListTree)adaptor.nil();


					string_literal284=(Token)match(input,189,FOLLOW_189_in_modifier3083); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal284_tree = (LinkedListTree)adaptor.create(string_literal284);
					adaptor.addChild(root_0, string_literal284_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modifier"


	public static class arguments_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "arguments"
	// AS3.g:800:1: arguments : ( LPAREN expressionList RPAREN -> ^( ARGUMENTS expressionList ) | LPAREN RPAREN -> ARGUMENTS );
	public final AS3Parser.arguments_return arguments() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.arguments_return retval = new AS3Parser.arguments_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LPAREN285=null;
		Token RPAREN287=null;
		Token LPAREN288=null;
		Token RPAREN289=null;
		ParserRuleReturnScope expressionList286 =null;

		LinkedListTree LPAREN285_tree=null;
		LinkedListTree RPAREN287_tree=null;
		LinkedListTree LPAREN288_tree=null;
		LinkedListTree RPAREN289_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");


			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:805:2: ( LPAREN expressionList RPAREN -> ^( ARGUMENTS expressionList ) | LPAREN RPAREN -> ARGUMENTS )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==LPAREN) ) {
				int LA67_1 = input.LA(2);
				if ( (LA67_1==RPAREN) ) {
					alt67=2;
				}
				else if ( (LA67_1==AS||LA67_1==BNOT||(LA67_1 >= DEC && LA67_1 <= DECIMAL_LITERAL)||(LA67_1 >= DELETE && LA67_1 <= DIV)||(LA67_1 >= DYNAMIC && LA67_1 <= E4X_ATTRI)||LA67_1==FALSE||LA67_1==FLOAT_LITERAL||LA67_1==FUNCTION||LA67_1==GET||(LA67_1 >= HEX_LITERAL && LA67_1 <= IDENT)||LA67_1==INC||(LA67_1 >= INTERNAL && LA67_1 <= IS)||(LA67_1 >= LBRACK && LA67_1 <= LCURLY)||LA67_1==LNOT||(LA67_1 >= LPAREN && LA67_1 <= LT)||LA67_1==MINUS||LA67_1==NAMESPACE||LA67_1==NEW||LA67_1==NULL||LA67_1==OCTAL_LITERAL||LA67_1==PLUS||LA67_1==PRIVATE||(LA67_1 >= PROTECTED && LA67_1 <= PUBLIC)||LA67_1==SET||LA67_1==STRING_LITERAL||LA67_1==TRUE||LA67_1==TYPEOF||LA67_1==UNDEFINED||LA67_1==USE||LA67_1==VOID||LA67_1==XML) ) {
					alt67=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// AS3.g:805:4: LPAREN expressionList RPAREN
					{
					LPAREN285=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments3104); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN285);

					pushFollow(FOLLOW_expressionList_in_arguments3106);
					expressionList286=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList286.getTree());
					RPAREN287=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments3108); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN287);


					// AST REWRITE
					// elements: expressionList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 806:3: -> ^( ARGUMENTS expressionList )
					{
						// AS3.g:806:6: ^( ARGUMENTS expressionList )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);
						adaptor.addChild(root_1, stream_expressionList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AS3.g:807:4: LPAREN RPAREN
					{
					LPAREN288=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments3123); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN288);

					RPAREN289=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments3125); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN289);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 808:3: -> ARGUMENTS
					{
						adaptor.addChild(root_0, (LinkedListTree)adaptor.create(ARGUMENTS, "ARGUMENTS"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "arguments"


	public static class arrayLiteral_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "arrayLiteral"
	// AS3.g:811:1: arrayLiteral : LBRACK ( elementList )? RBRACK -> ^( ARRAY_LITERAL ( elementList )? ) ;
	public final AS3Parser.arrayLiteral_return arrayLiteral() throws RecognitionException {
		AS3Parser.arrayLiteral_return retval = new AS3Parser.arrayLiteral_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LBRACK290=null;
		Token RBRACK292=null;
		ParserRuleReturnScope elementList291 =null;

		LinkedListTree LBRACK290_tree=null;
		LinkedListTree RBRACK292_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleSubtreeStream stream_elementList=new RewriteRuleSubtreeStream(adaptor,"rule elementList");

		try {
			// AS3.g:812:2: ( LBRACK ( elementList )? RBRACK -> ^( ARRAY_LITERAL ( elementList )? ) )
			// AS3.g:812:4: LBRACK ( elementList )? RBRACK
			{
			LBRACK290=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3142); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK290);

			// AS3.g:812:11: ( elementList )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==AS||LA68_0==BNOT||LA68_0==COMMA||(LA68_0 >= DEC && LA68_0 <= DECIMAL_LITERAL)||(LA68_0 >= DELETE && LA68_0 <= DIV)||(LA68_0 >= DYNAMIC && LA68_0 <= E4X_ATTRI)||LA68_0==FALSE||LA68_0==FLOAT_LITERAL||LA68_0==FUNCTION||LA68_0==GET||(LA68_0 >= HEX_LITERAL && LA68_0 <= IDENT)||LA68_0==INC||(LA68_0 >= INTERNAL && LA68_0 <= IS)||(LA68_0 >= LBRACK && LA68_0 <= LCURLY)||LA68_0==LNOT||(LA68_0 >= LPAREN && LA68_0 <= LT)||LA68_0==MINUS||LA68_0==NAMESPACE||LA68_0==NEW||LA68_0==NULL||LA68_0==OCTAL_LITERAL||LA68_0==PLUS||LA68_0==PRIVATE||(LA68_0 >= PROTECTED && LA68_0 <= PUBLIC)||LA68_0==SET||LA68_0==STRING_LITERAL||LA68_0==TRUE||LA68_0==TYPEOF||LA68_0==UNDEFINED||LA68_0==USE||LA68_0==VOID||LA68_0==XML) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// AS3.g:812:11: elementList
					{
					pushFollow(FOLLOW_elementList_in_arrayLiteral3144);
					elementList291=elementList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_elementList.add(elementList291.getTree());
					}
					break;

			}

			RBRACK292=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3147); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK292);


			// AST REWRITE
			// elements: elementList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 813:3: -> ^( ARRAY_LITERAL ( elementList )? )
			{
				// AS3.g:813:6: ^( ARRAY_LITERAL ( elementList )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ARRAY_LITERAL, "ARRAY_LITERAL"), root_1);
				// AS3.g:813:22: ( elementList )?
				if ( stream_elementList.hasNext() ) {
					adaptor.addChild(root_1, stream_elementList.nextTree());
				}
				stream_elementList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayLiteral"


	public static class elementList_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "elementList"
	// AS3.g:816:1: elementList : ( COMMA !| nonemptyElementList );
	public final AS3Parser.elementList_return elementList() throws RecognitionException {
		AS3Parser.elementList_return retval = new AS3Parser.elementList_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token COMMA293=null;
		ParserRuleReturnScope nonemptyElementList294 =null;

		LinkedListTree COMMA293_tree=null;

		try {
			// AS3.g:817:2: ( COMMA !| nonemptyElementList )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==COMMA) ) {
				alt69=1;
			}
			else if ( (LA69_0==AS||LA69_0==BNOT||(LA69_0 >= DEC && LA69_0 <= DECIMAL_LITERAL)||(LA69_0 >= DELETE && LA69_0 <= DIV)||(LA69_0 >= DYNAMIC && LA69_0 <= E4X_ATTRI)||LA69_0==FALSE||LA69_0==FLOAT_LITERAL||LA69_0==FUNCTION||LA69_0==GET||(LA69_0 >= HEX_LITERAL && LA69_0 <= IDENT)||LA69_0==INC||(LA69_0 >= INTERNAL && LA69_0 <= IS)||(LA69_0 >= LBRACK && LA69_0 <= LCURLY)||LA69_0==LNOT||(LA69_0 >= LPAREN && LA69_0 <= LT)||LA69_0==MINUS||LA69_0==NAMESPACE||LA69_0==NEW||LA69_0==NULL||LA69_0==OCTAL_LITERAL||LA69_0==PLUS||LA69_0==PRIVATE||(LA69_0 >= PROTECTED && LA69_0 <= PUBLIC)||LA69_0==SET||LA69_0==STRING_LITERAL||LA69_0==TRUE||LA69_0==TYPEOF||LA69_0==UNDEFINED||LA69_0==USE||LA69_0==VOID||LA69_0==XML) ) {
				alt69=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// AS3.g:817:4: COMMA !
					{
					root_0 = (LinkedListTree)adaptor.nil();


					COMMA293=(Token)match(input,COMMA,FOLLOW_COMMA_in_elementList3171); if (state.failed) return retval;
					}
					break;
				case 2 :
					// AS3.g:818:4: nonemptyElementList
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_nonemptyElementList_in_elementList3177);
					nonemptyElementList294=nonemptyElementList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nonemptyElementList294.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elementList"


	public static class nonemptyElementList_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "nonemptyElementList"
	// AS3.g:820:1: nonemptyElementList : assignmentExpression ( COMMA ! assignmentExpression )* ;
	public final AS3Parser.nonemptyElementList_return nonemptyElementList() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.nonemptyElementList_return retval = new AS3Parser.nonemptyElementList_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token COMMA296=null;
		ParserRuleReturnScope assignmentExpression295 =null;
		ParserRuleReturnScope assignmentExpression297 =null;

		LinkedListTree COMMA296_tree=null;


			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:825:2: ( assignmentExpression ( COMMA ! assignmentExpression )* )
			// AS3.g:825:4: assignmentExpression ( COMMA ! assignmentExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_assignmentExpression_in_nonemptyElementList3197);
			assignmentExpression295=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression295.getTree());

			// AS3.g:825:25: ( COMMA ! assignmentExpression )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==COMMA) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// AS3.g:825:26: COMMA ! assignmentExpression
					{
					COMMA296=(Token)match(input,COMMA,FOLLOW_COMMA_in_nonemptyElementList3200); if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentExpression_in_nonemptyElementList3203);
					assignmentExpression297=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression297.getTree());

					}
					break;

				default :
					break loop70;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "nonemptyElementList"


	public static class element_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "element"
	// AS3.g:828:1: element : assignmentExpression ;
	public final AS3Parser.element_return element() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.element_return retval = new AS3Parser.element_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope assignmentExpression298 =null;



			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:833:2: ( assignmentExpression )
			// AS3.g:833:4: assignmentExpression
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_assignmentExpression_in_element3226);
			assignmentExpression298=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression298.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "element"


	public static class objectLiteral_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "objectLiteral"
	// AS3.g:837:1: objectLiteral : LCURLY ( fieldList )? RCURLY -> ^( OBJECT_LITERAL ( fieldList )? ) ;
	public final AS3Parser.objectLiteral_return objectLiteral() throws RecognitionException {
		AS3Parser.objectLiteral_return retval = new AS3Parser.objectLiteral_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LCURLY299=null;
		Token RCURLY301=null;
		ParserRuleReturnScope fieldList300 =null;

		LinkedListTree LCURLY299_tree=null;
		LinkedListTree RCURLY301_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");

		try {
			// AS3.g:838:2: ( LCURLY ( fieldList )? RCURLY -> ^( OBJECT_LITERAL ( fieldList )? ) )
			// AS3.g:838:4: LCURLY ( fieldList )? RCURLY
			{
			LCURLY299=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral3238); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY299);

			// AS3.g:838:11: ( fieldList )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==AS||LA71_0==DECIMAL_LITERAL||LA71_0==DYNAMIC||LA71_0==FLOAT_LITERAL||LA71_0==GET||(LA71_0 >= HEX_LITERAL && LA71_0 <= IDENT)||LA71_0==IS||LA71_0==NAMESPACE||LA71_0==OCTAL_LITERAL||LA71_0==SET||LA71_0==USE||LA71_0==XML) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// AS3.g:838:11: fieldList
					{
					pushFollow(FOLLOW_fieldList_in_objectLiteral3240);
					fieldList300=fieldList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fieldList.add(fieldList300.getTree());
					}
					break;

			}

			RCURLY301=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral3243); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY301);


			// AST REWRITE
			// elements: fieldList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 839:3: -> ^( OBJECT_LITERAL ( fieldList )? )
			{
				// AS3.g:839:6: ^( OBJECT_LITERAL ( fieldList )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(OBJECT_LITERAL, "OBJECT_LITERAL"), root_1);
				// AS3.g:839:23: ( fieldList )?
				if ( stream_fieldList.hasNext() ) {
					adaptor.addChild(root_1, stream_fieldList.nextTree());
				}
				stream_fieldList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "objectLiteral"


	public static class fieldList_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "fieldList"
	// AS3.g:842:1: fieldList : literalField ( COMMA ! ( literalField )? )* ;
	public final AS3Parser.fieldList_return fieldList() throws RecognitionException {
		AS3Parser.fieldList_return retval = new AS3Parser.fieldList_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token COMMA303=null;
		ParserRuleReturnScope literalField302 =null;
		ParserRuleReturnScope literalField304 =null;

		LinkedListTree COMMA303_tree=null;

		try {
			// AS3.g:843:2: ( literalField ( COMMA ! ( literalField )? )* )
			// AS3.g:843:4: literalField ( COMMA ! ( literalField )? )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_literalField_in_fieldList3266);
			literalField302=literalField();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, literalField302.getTree());

			// AS3.g:843:17: ( COMMA ! ( literalField )? )*
			loop73:
			while (true) {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==COMMA) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// AS3.g:843:18: COMMA ! ( literalField )?
					{
					COMMA303=(Token)match(input,COMMA,FOLLOW_COMMA_in_fieldList3269); if (state.failed) return retval;
					// AS3.g:843:25: ( literalField )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==AS||LA72_0==DECIMAL_LITERAL||LA72_0==DYNAMIC||LA72_0==FLOAT_LITERAL||LA72_0==GET||(LA72_0 >= HEX_LITERAL && LA72_0 <= IDENT)||LA72_0==IS||LA72_0==NAMESPACE||LA72_0==OCTAL_LITERAL||LA72_0==SET||LA72_0==USE||LA72_0==XML) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// AS3.g:843:25: literalField
							{
							pushFollow(FOLLOW_literalField_in_fieldList3272);
							literalField304=literalField();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, literalField304.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop73;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldList"


	public static class literalField_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "literalField"
	// AS3.g:846:1: literalField : fieldName COLON element -> ^( OBJECT_FIELD fieldName element ) ;
	public final AS3Parser.literalField_return literalField() throws RecognitionException {
		AS3Parser.literalField_return retval = new AS3Parser.literalField_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token COLON306=null;
		ParserRuleReturnScope fieldName305 =null;
		ParserRuleReturnScope element307 =null;

		LinkedListTree COLON306_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_fieldName=new RewriteRuleSubtreeStream(adaptor,"rule fieldName");
		RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");

		try {
			// AS3.g:847:2: ( fieldName COLON element -> ^( OBJECT_FIELD fieldName element ) )
			// AS3.g:847:5: fieldName COLON element
			{
			pushFollow(FOLLOW_fieldName_in_literalField3289);
			fieldName305=fieldName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_fieldName.add(fieldName305.getTree());
			COLON306=(Token)match(input,COLON,FOLLOW_COLON_in_literalField3291); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON306);

			pushFollow(FOLLOW_element_in_literalField3293);
			element307=element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_element.add(element307.getTree());

			// AST REWRITE
			// elements: element, fieldName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 848:3: -> ^( OBJECT_FIELD fieldName element )
			{
				// AS3.g:848:6: ^( OBJECT_FIELD fieldName element )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(OBJECT_FIELD, "OBJECT_FIELD"), root_1);
				adaptor.addChild(root_1, stream_fieldName.nextTree());
				adaptor.addChild(root_1, stream_element.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literalField"


	public static class fieldName_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "fieldName"
	// AS3.g:851:1: fieldName : ( ident | number );
	public final AS3Parser.fieldName_return fieldName() throws RecognitionException {
		AS3Parser.fieldName_return retval = new AS3Parser.fieldName_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope ident308 =null;
		ParserRuleReturnScope number309 =null;


		try {
			// AS3.g:852:2: ( ident | number )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==AS||LA74_0==DYNAMIC||LA74_0==GET||LA74_0==IDENT||LA74_0==IS||LA74_0==NAMESPACE||LA74_0==SET||LA74_0==USE||LA74_0==XML) ) {
				alt74=1;
			}
			else if ( (LA74_0==DECIMAL_LITERAL||LA74_0==FLOAT_LITERAL||LA74_0==HEX_LITERAL||LA74_0==OCTAL_LITERAL) ) {
				alt74=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// AS3.g:852:4: ident
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_ident_in_fieldName3317);
					ident308=ident();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ident308.getTree());

					}
					break;
				case 2 :
					// AS3.g:853:4: number
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_number_in_fieldName3322);
					number309=number();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number309.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldName"


	public static class expression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// AS3.g:857:1: expression : assignmentExpression ;
	public final AS3Parser.expression_return expression() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.expression_return retval = new AS3Parser.expression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope assignmentExpression310 =null;



			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:862:2: ( assignmentExpression )
			// AS3.g:862:4: assignmentExpression
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_assignmentExpression_in_expression3344);
			assignmentExpression310=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression310.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class expressionList_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// AS3.g:866:1: expressionList : assignmentExpression ( COMMA assignmentExpression )* -> ( assignmentExpression )+ ;
	public final AS3Parser.expressionList_return expressionList() throws RecognitionException {
		AS3Parser.expressionList_return retval = new AS3Parser.expressionList_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token COMMA312=null;
		ParserRuleReturnScope assignmentExpression311 =null;
		ParserRuleReturnScope assignmentExpression313 =null;

		LinkedListTree COMMA312_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");

		try {
			// AS3.g:867:2: ( assignmentExpression ( COMMA assignmentExpression )* -> ( assignmentExpression )+ )
			// AS3.g:867:4: assignmentExpression ( COMMA assignmentExpression )*
			{
			pushFollow(FOLLOW_assignmentExpression_in_expressionList3356);
			assignmentExpression311=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression311.getTree());
			// AS3.g:867:25: ( COMMA assignmentExpression )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==COMMA) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// AS3.g:867:26: COMMA assignmentExpression
					{
					COMMA312=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList3359); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA312);

					pushFollow(FOLLOW_assignmentExpression_in_expressionList3361);
					assignmentExpression313=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression313.getTree());
					}
					break;

				default :
					break loop75;
				}
			}


			// AST REWRITE
			// elements: assignmentExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 868:3: -> ( assignmentExpression )+
			{
				if ( !(stream_assignmentExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_assignmentExpression.hasNext() ) {
					adaptor.addChild(root_0, stream_assignmentExpression.nextTree());
				}
				stream_assignmentExpression.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class assignmentExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "assignmentExpression"
	// AS3.g:872:1: assignmentExpression : conditionalExpression ( ( assignmentOperator )=>o= assignmentOperator ^ assignmentExpression )* ;
	public final AS3Parser.assignmentExpression_return assignmentExpression() throws RecognitionException {
		AS3Parser.assignmentExpression_return retval = new AS3Parser.assignmentExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope o =null;
		ParserRuleReturnScope conditionalExpression314 =null;
		ParserRuleReturnScope assignmentExpression315 =null;


		try {
			// AS3.g:873:2: ( conditionalExpression ( ( assignmentOperator )=>o= assignmentOperator ^ assignmentExpression )* )
			// AS3.g:873:4: conditionalExpression ( ( assignmentOperator )=>o= assignmentOperator ^ assignmentExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression3382);
			conditionalExpression314=conditionalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression314.getTree());

			// AS3.g:874:2: ( ( assignmentOperator )=>o= assignmentOperator ^ assignmentExpression )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==ASSIGN||LA76_0==BAND_ASSIGN||LA76_0==BOR_ASSIGN||LA76_0==BSR_ASSIGN||LA76_0==BXOR_ASSIGN||LA76_0==DIV_ASSIGN||LA76_0==LAND_ASSIGN||LA76_0==LOR_ASSIGN||LA76_0==MINUS_ASSIGN||LA76_0==MOD_ASSIGN||LA76_0==PLUS_ASSIGN||LA76_0==SL_ASSIGN||LA76_0==SR_ASSIGN||LA76_0==STAR_ASSIGN) ) {
					int LA76_8 = input.LA(2);
					if ( (synpred4_AS3()) ) {
						alt76=1;
					}

				}

				switch (alt76) {
				case 1 :
					// AS3.g:874:4: ( assignmentOperator )=>o= assignmentOperator ^ assignmentExpression
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression3394);
					o=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
					pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression3399);
					assignmentExpression315=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression315.getTree());

					if ( state.backtracking==0 ) {demarcate((o!=null?((LinkedListTree)o.getTree()):null));}
					}
					break;

				default :
					break loop76;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignmentExpression"


	public static class assignmentOperator_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "assignmentOperator"
	// AS3.g:880:1: assignmentOperator : ( ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | SL_ASSIGN | SR_ASSIGN | BSR_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LAND_ASSIGN | LOR_ASSIGN );
	public final AS3Parser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		AS3Parser.assignmentOperator_return retval = new AS3Parser.assignmentOperator_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set316=null;

		LinkedListTree set316_tree=null;

		try {
			// AS3.g:881:2: ( ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | SL_ASSIGN | SR_ASSIGN | BSR_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LAND_ASSIGN | LOR_ASSIGN )
			// AS3.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set316=input.LT(1);
			if ( input.LA(1)==ASSIGN||input.LA(1)==BAND_ASSIGN||input.LA(1)==BOR_ASSIGN||input.LA(1)==BSR_ASSIGN||input.LA(1)==BXOR_ASSIGN||input.LA(1)==DIV_ASSIGN||input.LA(1)==LAND_ASSIGN||input.LA(1)==LOR_ASSIGN||input.LA(1)==MINUS_ASSIGN||input.LA(1)==MOD_ASSIGN||input.LA(1)==PLUS_ASSIGN||input.LA(1)==SL_ASSIGN||input.LA(1)==SR_ASSIGN||input.LA(1)==STAR_ASSIGN ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set316));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignmentOperator"


	public static class conditionalExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "conditionalExpression"
	// AS3.g:898:1: conditionalExpression : ( logicalOrExpression -> logicalOrExpression ) ( QUESTION conditionalSubExpression -> ^( QUESTION $conditionalExpression conditionalSubExpression ) )? ;
	public final AS3Parser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		AS3Parser.conditionalExpression_return retval = new AS3Parser.conditionalExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token QUESTION318=null;
		ParserRuleReturnScope logicalOrExpression317 =null;
		ParserRuleReturnScope conditionalSubExpression319 =null;

		LinkedListTree QUESTION318_tree=null;
		RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
		RewriteRuleSubtreeStream stream_conditionalSubExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalSubExpression");
		RewriteRuleSubtreeStream stream_logicalOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalOrExpression");

		try {
			// AS3.g:899:2: ( ( logicalOrExpression -> logicalOrExpression ) ( QUESTION conditionalSubExpression -> ^( QUESTION $conditionalExpression conditionalSubExpression ) )? )
			// AS3.g:899:4: ( logicalOrExpression -> logicalOrExpression ) ( QUESTION conditionalSubExpression -> ^( QUESTION $conditionalExpression conditionalSubExpression ) )?
			{
			// AS3.g:899:4: ( logicalOrExpression -> logicalOrExpression )
			// AS3.g:899:5: logicalOrExpression
			{
			pushFollow(FOLLOW_logicalOrExpression_in_conditionalExpression3497);
			logicalOrExpression317=logicalOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicalOrExpression.add(logicalOrExpression317.getTree());

			// AST REWRITE
			// elements: logicalOrExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 899:25: -> logicalOrExpression
			{
				adaptor.addChild(root_0, stream_logicalOrExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// AS3.g:900:3: ( QUESTION conditionalSubExpression -> ^( QUESTION $conditionalExpression conditionalSubExpression ) )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==QUESTION) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// AS3.g:901:4: QUESTION conditionalSubExpression
					{
					QUESTION318=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression3511); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION318);

					pushFollow(FOLLOW_conditionalSubExpression_in_conditionalExpression3516);
					conditionalSubExpression319=conditionalSubExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_conditionalSubExpression.add(conditionalSubExpression319.getTree());

					// AST REWRITE
					// elements: conditionalExpression, QUESTION, conditionalSubExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 903:4: -> ^( QUESTION $conditionalExpression conditionalSubExpression )
					{
						// AS3.g:903:7: ^( QUESTION $conditionalExpression conditionalSubExpression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot(stream_QUESTION.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_conditionalSubExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionalExpression"


	public static class conditionalSubExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "conditionalSubExpression"
	// AS3.g:906:1: conditionalSubExpression : assignmentExpression COLON ! assignmentExpression ;
	public final AS3Parser.conditionalSubExpression_return conditionalSubExpression() throws RecognitionException {
		AS3Parser.conditionalSubExpression_return retval = new AS3Parser.conditionalSubExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token COLON321=null;
		ParserRuleReturnScope assignmentExpression320 =null;
		ParserRuleReturnScope assignmentExpression322 =null;

		LinkedListTree COLON321_tree=null;

		try {
			// AS3.g:907:2: ( assignmentExpression COLON ! assignmentExpression )
			// AS3.g:907:4: assignmentExpression COLON ! assignmentExpression
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_assignmentExpression_in_conditionalSubExpression3545);
			assignmentExpression320=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression320.getTree());

			COLON321=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalSubExpression3547); if (state.failed) return retval;
			pushFollow(FOLLOW_assignmentExpression_in_conditionalSubExpression3550);
			assignmentExpression322=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression322.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionalSubExpression"


	public static class logicalOrExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "logicalOrExpression"
	// AS3.g:913:1: logicalOrExpression : logicalAndExpression (o= logicalOrOperator ^ logicalAndExpression )* ;
	public final AS3Parser.logicalOrExpression_return logicalOrExpression() throws RecognitionException {
		AS3Parser.logicalOrExpression_return retval = new AS3Parser.logicalOrExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope o =null;
		ParserRuleReturnScope logicalAndExpression323 =null;
		ParserRuleReturnScope logicalAndExpression324 =null;


		try {
			// AS3.g:914:2: ( logicalAndExpression (o= logicalOrOperator ^ logicalAndExpression )* )
			// AS3.g:914:4: logicalAndExpression (o= logicalOrOperator ^ logicalAndExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression3564);
			logicalAndExpression323=logicalAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression323.getTree());

			// AS3.g:915:3: (o= logicalOrOperator ^ logicalAndExpression )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==LOR||LA78_0==190) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// AS3.g:915:4: o= logicalOrOperator ^ logicalAndExpression
					{
					pushFollow(FOLLOW_logicalOrOperator_in_logicalOrExpression3571);
					o=logicalOrOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
					pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression3574);
					logicalAndExpression324=logicalAndExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression324.getTree());

					if ( state.backtracking==0 ) {demarcate((o!=null?((LinkedListTree)o.getTree()):null));}
					}
					break;

				default :
					break loop78;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalOrExpression"


	public static class logicalOrOperator_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "logicalOrOperator"
	// AS3.g:918:1: logicalOrOperator : ( LOR | 'or' );
	public final AS3Parser.logicalOrOperator_return logicalOrOperator() throws RecognitionException {
		AS3Parser.logicalOrOperator_return retval = new AS3Parser.logicalOrOperator_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set325=null;

		LinkedListTree set325_tree=null;

		try {
			// AS3.g:919:2: ( LOR | 'or' )
			// AS3.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set325=input.LT(1);
			if ( input.LA(1)==LOR||input.LA(1)==190 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set325));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalOrOperator"


	public static class logicalAndExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "logicalAndExpression"
	// AS3.g:923:1: logicalAndExpression : bitwiseOrExpression (o= logicalAndOperator ^ bitwiseOrExpression )* ;
	public final AS3Parser.logicalAndExpression_return logicalAndExpression() throws RecognitionException {
		AS3Parser.logicalAndExpression_return retval = new AS3Parser.logicalAndExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope o =null;
		ParserRuleReturnScope bitwiseOrExpression326 =null;
		ParserRuleReturnScope bitwiseOrExpression327 =null;


		try {
			// AS3.g:924:2: ( bitwiseOrExpression (o= logicalAndOperator ^ bitwiseOrExpression )* )
			// AS3.g:924:4: bitwiseOrExpression (o= logicalAndOperator ^ bitwiseOrExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOrExpression_in_logicalAndExpression3605);
			bitwiseOrExpression326=bitwiseOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOrExpression326.getTree());

			// AS3.g:925:3: (o= logicalAndOperator ^ bitwiseOrExpression )*
			loop79:
			while (true) {
				int alt79=2;
				int LA79_0 = input.LA(1);
				if ( (LA79_0==LAND||LA79_0==185) ) {
					alt79=1;
				}

				switch (alt79) {
				case 1 :
					// AS3.g:925:4: o= logicalAndOperator ^ bitwiseOrExpression
					{
					pushFollow(FOLLOW_logicalAndOperator_in_logicalAndExpression3612);
					o=logicalAndOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseOrExpression_in_logicalAndExpression3615);
					bitwiseOrExpression327=bitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOrExpression327.getTree());

					if ( state.backtracking==0 ) {demarcate((o!=null?((LinkedListTree)o.getTree()):null));}
					}
					break;

				default :
					break loop79;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalAndExpression"


	public static class logicalAndOperator_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "logicalAndOperator"
	// AS3.g:928:1: logicalAndOperator : ( LAND | 'and' );
	public final AS3Parser.logicalAndOperator_return logicalAndOperator() throws RecognitionException {
		AS3Parser.logicalAndOperator_return retval = new AS3Parser.logicalAndOperator_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set328=null;

		LinkedListTree set328_tree=null;

		try {
			// AS3.g:929:2: ( LAND | 'and' )
			// AS3.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set328=input.LT(1);
			if ( input.LA(1)==LAND||input.LA(1)==185 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set328));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalAndOperator"


	public static class bitwiseOrExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "bitwiseOrExpression"
	// AS3.g:933:1: bitwiseOrExpression : bitwiseXorExpression (o= BOR ^ bitwiseXorExpression )* ;
	public final AS3Parser.bitwiseOrExpression_return bitwiseOrExpression() throws RecognitionException {
		AS3Parser.bitwiseOrExpression_return retval = new AS3Parser.bitwiseOrExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token o=null;
		ParserRuleReturnScope bitwiseXorExpression329 =null;
		ParserRuleReturnScope bitwiseXorExpression330 =null;

		LinkedListTree o_tree=null;

		try {
			// AS3.g:934:2: ( bitwiseXorExpression (o= BOR ^ bitwiseXorExpression )* )
			// AS3.g:934:4: bitwiseXorExpression (o= BOR ^ bitwiseXorExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression3646);
			bitwiseXorExpression329=bitwiseXorExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXorExpression329.getTree());

			// AS3.g:935:3: (o= BOR ^ bitwiseXorExpression )*
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==BOR) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// AS3.g:935:4: o= BOR ^ bitwiseXorExpression
					{
					o=(Token)match(input,BOR,FOLLOW_BOR_in_bitwiseOrExpression3653); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					o_tree = (LinkedListTree)adaptor.create(o);
					root_0 = (LinkedListTree)adaptor.becomeRoot(o_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression3656);
					bitwiseXorExpression330=bitwiseXorExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXorExpression330.getTree());

					if ( state.backtracking==0 ) {demarcate(o_tree);}
					}
					break;

				default :
					break loop80;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitwiseOrExpression"


	public static class bitwiseXorExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "bitwiseXorExpression"
	// AS3.g:939:1: bitwiseXorExpression : bitwiseAndExpression (o= BXOR ^ bitwiseAndExpression )* ;
	public final AS3Parser.bitwiseXorExpression_return bitwiseXorExpression() throws RecognitionException {
		AS3Parser.bitwiseXorExpression_return retval = new AS3Parser.bitwiseXorExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token o=null;
		ParserRuleReturnScope bitwiseAndExpression331 =null;
		ParserRuleReturnScope bitwiseAndExpression332 =null;

		LinkedListTree o_tree=null;

		try {
			// AS3.g:940:2: ( bitwiseAndExpression (o= BXOR ^ bitwiseAndExpression )* )
			// AS3.g:940:4: bitwiseAndExpression (o= BXOR ^ bitwiseAndExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression3672);
			bitwiseAndExpression331=bitwiseAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAndExpression331.getTree());

			// AS3.g:941:3: (o= BXOR ^ bitwiseAndExpression )*
			loop81:
			while (true) {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==BXOR) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// AS3.g:941:4: o= BXOR ^ bitwiseAndExpression
					{
					o=(Token)match(input,BXOR,FOLLOW_BXOR_in_bitwiseXorExpression3679); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					o_tree = (LinkedListTree)adaptor.create(o);
					root_0 = (LinkedListTree)adaptor.becomeRoot(o_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression3682);
					bitwiseAndExpression332=bitwiseAndExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAndExpression332.getTree());

					if ( state.backtracking==0 ) {demarcate(o_tree);}
					}
					break;

				default :
					break loop81;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitwiseXorExpression"


	public static class bitwiseAndExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "bitwiseAndExpression"
	// AS3.g:945:1: bitwiseAndExpression : equalityExpression (o= BAND ^ equalityExpression )* ;
	public final AS3Parser.bitwiseAndExpression_return bitwiseAndExpression() throws RecognitionException {
		AS3Parser.bitwiseAndExpression_return retval = new AS3Parser.bitwiseAndExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token o=null;
		ParserRuleReturnScope equalityExpression333 =null;
		ParserRuleReturnScope equalityExpression334 =null;

		LinkedListTree o_tree=null;

		try {
			// AS3.g:946:2: ( equalityExpression (o= BAND ^ equalityExpression )* )
			// AS3.g:946:4: equalityExpression (o= BAND ^ equalityExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_bitwiseAndExpression3698);
			equalityExpression333=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression333.getTree());

			// AS3.g:947:3: (o= BAND ^ equalityExpression )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==BAND) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// AS3.g:947:4: o= BAND ^ equalityExpression
					{
					o=(Token)match(input,BAND,FOLLOW_BAND_in_bitwiseAndExpression3705); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					o_tree = (LinkedListTree)adaptor.create(o);
					root_0 = (LinkedListTree)adaptor.becomeRoot(o_tree, root_0);
					}

					pushFollow(FOLLOW_equalityExpression_in_bitwiseAndExpression3708);
					equalityExpression334=equalityExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression334.getTree());

					if ( state.backtracking==0 ) {demarcate(o_tree);}
					}
					break;

				default :
					break loop82;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitwiseAndExpression"


	public static class equalityExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "equalityExpression"
	// AS3.g:951:1: equalityExpression : relationalExpression (o= equalityOperator ^ relationalExpression )* ;
	public final AS3Parser.equalityExpression_return equalityExpression() throws RecognitionException {
		AS3Parser.equalityExpression_return retval = new AS3Parser.equalityExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope o =null;
		ParserRuleReturnScope relationalExpression335 =null;
		ParserRuleReturnScope relationalExpression336 =null;


		try {
			// AS3.g:952:2: ( relationalExpression (o= equalityOperator ^ relationalExpression )* )
			// AS3.g:952:4: relationalExpression (o= equalityOperator ^ relationalExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression3724);
			relationalExpression335=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression335.getTree());

			// AS3.g:953:2: (o= equalityOperator ^ relationalExpression )*
			loop83:
			while (true) {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( (LA83_0==EQUAL||LA83_0==NOT_EQUAL||(LA83_0 >= STRICT_EQUAL && LA83_0 <= STRICT_NOT_EQUAL)) ) {
					alt83=1;
				}

				switch (alt83) {
				case 1 :
					// AS3.g:953:4: o= equalityOperator ^ relationalExpression
					{
					pushFollow(FOLLOW_equalityOperator_in_equalityExpression3731);
					o=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression3736);
					relationalExpression336=relationalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression336.getTree());

					if ( state.backtracking==0 ) {demarcate((o!=null?((LinkedListTree)o.getTree()):null));}
					}
					break;

				default :
					break loop83;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equalityExpression"


	public static class equalityOperator_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "equalityOperator"
	// AS3.g:959:1: equalityOperator : ( STRICT_EQUAL | STRICT_NOT_EQUAL | NOT_EQUAL | EQUAL );
	public final AS3Parser.equalityOperator_return equalityOperator() throws RecognitionException {
		AS3Parser.equalityOperator_return retval = new AS3Parser.equalityOperator_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set337=null;

		LinkedListTree set337_tree=null;

		try {
			// AS3.g:960:2: ( STRICT_EQUAL | STRICT_NOT_EQUAL | NOT_EQUAL | EQUAL )
			// AS3.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set337=input.LT(1);
			if ( input.LA(1)==EQUAL||input.LA(1)==NOT_EQUAL||(input.LA(1) >= STRICT_EQUAL && input.LA(1) <= STRICT_NOT_EQUAL) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set337));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equalityOperator"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "relationalExpression"
	// AS3.g:964:1: relationalExpression : shiftExpression ( ( relationalOperator )=>o= relationalOperator ^ shiftExpression )* ;
	public final AS3Parser.relationalExpression_return relationalExpression() throws RecognitionException {
		AS3Parser.relationalExpression_return retval = new AS3Parser.relationalExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope o =null;
		ParserRuleReturnScope shiftExpression338 =null;
		ParserRuleReturnScope shiftExpression339 =null;


		try {
			// AS3.g:965:2: ( shiftExpression ( ( relationalOperator )=>o= relationalOperator ^ shiftExpression )* )
			// AS3.g:965:4: shiftExpression ( ( relationalOperator )=>o= relationalOperator ^ shiftExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_shiftExpression_in_relationalExpression3780);
			shiftExpression338=shiftExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression338.getTree());

			// AS3.g:966:3: ( ( relationalOperator )=>o= relationalOperator ^ shiftExpression )*
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( (LA84_0==IN) ) {
					switch ( input.LA(2) ) {
					case INC:
						{
						int LA84_23 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case DEC:
						{
						int LA84_24 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case MINUS:
						{
						int LA84_25 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case PLUS:
						{
						int LA84_26 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case DELETE:
						{
						int LA84_27 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case VOID:
						{
						int LA84_28 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case TYPEOF:
						{
						int LA84_29 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case LNOT:
						{
						int LA84_30 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case BNOT:
						{
						int LA84_31 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case UNDEFINED:
						{
						int LA84_32 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case LT:
						{
						int LA84_33 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case DIV:
						{
						int LA84_34 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case DECIMAL_LITERAL:
					case FLOAT_LITERAL:
					case HEX_LITERAL:
					case OCTAL_LITERAL:
						{
						int LA84_35 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case STRING_LITERAL:
						{
						int LA84_36 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case TRUE:
						{
						int LA84_37 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case FALSE:
						{
						int LA84_38 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case NULL:
						{
						int LA84_39 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case LBRACK:
						{
						int LA84_40 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case LCURLY:
						{
						int LA84_41 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case FUNCTION:
						{
						int LA84_42 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case NEW:
						{
						int LA84_43 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case LPAREN:
						{
						int LA84_44 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case E4X_ATTRI:
						{
						int LA84_45 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case IDENT:
						{
						int LA84_46 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case INTERNAL:
					case PRIVATE:
					case PROTECTED:
					case PUBLIC:
						{
						int LA84_47 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case USE:
						{
						int LA84_48 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case XML:
						{
						int LA84_49 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case DYNAMIC:
						{
						int LA84_50 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case NAMESPACE:
						{
						int LA84_51 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case IS:
						{
						int LA84_52 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case AS:
						{
						int LA84_53 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case GET:
						{
						int LA84_54 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					case SET:
						{
						int LA84_55 = input.LA(3);
						if ( ((synpred5_AS3()&&(InOperator_stack.peek().allowed))) ) {
							alt84=1;
						}

						}
						break;
					}
				}
				else if ( (LA84_0==LT) && (synpred5_AS3())) {
					alt84=1;
				}
				else if ( (LA84_0==GT) && (synpred5_AS3())) {
					alt84=1;
				}
				else if ( (LA84_0==LE) && (synpred5_AS3())) {
					alt84=1;
				}
				else if ( (LA84_0==GE) && (synpred5_AS3())) {
					alt84=1;
				}
				else if ( (LA84_0==IS) && (synpred5_AS3())) {
					alt84=1;
				}
				else if ( (LA84_0==AS) && (synpred5_AS3())) {
					alt84=1;
				}
				else if ( (LA84_0==INSTANCEOF) && (synpred5_AS3())) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// AS3.g:966:4: ( relationalOperator )=>o= relationalOperator ^ shiftExpression
					{
					pushFollow(FOLLOW_relationalOperator_in_relationalExpression3792);
					o=relationalOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
					pushFollow(FOLLOW_shiftExpression_in_relationalExpression3795);
					shiftExpression339=shiftExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression339.getTree());

					if ( state.backtracking==0 ) {demarcate((o!=null?((LinkedListTree)o.getTree()):null));}
					}
					break;

				default :
					break loop84;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relationalExpression"


	public static class relationalOperator_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "relationalOperator"
	// AS3.g:969:1: relationalOperator : ({...}? IN | LT | GT | LE | GE | IS | AS | INSTANCEOF );
	public final AS3Parser.relationalOperator_return relationalOperator() throws RecognitionException {
		AS3Parser.relationalOperator_return retval = new AS3Parser.relationalOperator_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token IN340=null;
		Token LT341=null;
		Token GT342=null;
		Token LE343=null;
		Token GE344=null;
		Token IS345=null;
		Token AS346=null;
		Token INSTANCEOF347=null;

		LinkedListTree IN340_tree=null;
		LinkedListTree LT341_tree=null;
		LinkedListTree GT342_tree=null;
		LinkedListTree LE343_tree=null;
		LinkedListTree GE344_tree=null;
		LinkedListTree IS345_tree=null;
		LinkedListTree AS346_tree=null;
		LinkedListTree INSTANCEOF347_tree=null;

		try {
			// AS3.g:970:2: ({...}? IN | LT | GT | LE | GE | IS | AS | INSTANCEOF )
			int alt85=8;
			switch ( input.LA(1) ) {
			case IN:
				{
				alt85=1;
				}
				break;
			case LT:
				{
				alt85=2;
				}
				break;
			case GT:
				{
				alt85=3;
				}
				break;
			case LE:
				{
				alt85=4;
				}
				break;
			case GE:
				{
				alt85=5;
				}
				break;
			case IS:
				{
				alt85=6;
				}
				break;
			case AS:
				{
				alt85=7;
				}
				break;
			case INSTANCEOF:
				{
				alt85=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// AS3.g:970:4: {...}? IN
					{
					root_0 = (LinkedListTree)adaptor.nil();


					if ( !((InOperator_stack.peek().allowed)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "relationalOperator", "$InOperator::allowed");
					}
					IN340=(Token)match(input,IN,FOLLOW_IN_in_relationalOperator3812); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IN340_tree = (LinkedListTree)adaptor.create(IN340);
					adaptor.addChild(root_0, IN340_tree);
					}

					}
					break;
				case 2 :
					// AS3.g:971:4: LT
					{
					root_0 = (LinkedListTree)adaptor.nil();


					LT341=(Token)match(input,LT,FOLLOW_LT_in_relationalOperator3817); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LT341_tree = (LinkedListTree)adaptor.create(LT341);
					adaptor.addChild(root_0, LT341_tree);
					}

					}
					break;
				case 3 :
					// AS3.g:971:9: GT
					{
					root_0 = (LinkedListTree)adaptor.nil();


					GT342=(Token)match(input,GT,FOLLOW_GT_in_relationalOperator3821); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GT342_tree = (LinkedListTree)adaptor.create(GT342);
					adaptor.addChild(root_0, GT342_tree);
					}

					}
					break;
				case 4 :
					// AS3.g:971:14: LE
					{
					root_0 = (LinkedListTree)adaptor.nil();


					LE343=(Token)match(input,LE,FOLLOW_LE_in_relationalOperator3825); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LE343_tree = (LinkedListTree)adaptor.create(LE343);
					adaptor.addChild(root_0, LE343_tree);
					}

					}
					break;
				case 5 :
					// AS3.g:971:19: GE
					{
					root_0 = (LinkedListTree)adaptor.nil();


					GE344=(Token)match(input,GE,FOLLOW_GE_in_relationalOperator3829); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GE344_tree = (LinkedListTree)adaptor.create(GE344);
					adaptor.addChild(root_0, GE344_tree);
					}

					}
					break;
				case 6 :
					// AS3.g:971:24: IS
					{
					root_0 = (LinkedListTree)adaptor.nil();


					IS345=(Token)match(input,IS,FOLLOW_IS_in_relationalOperator3833); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IS345_tree = (LinkedListTree)adaptor.create(IS345);
					adaptor.addChild(root_0, IS345_tree);
					}

					}
					break;
				case 7 :
					// AS3.g:971:29: AS
					{
					root_0 = (LinkedListTree)adaptor.nil();


					AS346=(Token)match(input,AS,FOLLOW_AS_in_relationalOperator3837); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AS346_tree = (LinkedListTree)adaptor.create(AS346);
					adaptor.addChild(root_0, AS346_tree);
					}

					}
					break;
				case 8 :
					// AS3.g:971:34: INSTANCEOF
					{
					root_0 = (LinkedListTree)adaptor.nil();


					INSTANCEOF347=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_relationalOperator3841); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INSTANCEOF347_tree = (LinkedListTree)adaptor.create(INSTANCEOF347);
					adaptor.addChild(root_0, INSTANCEOF347_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relationalOperator"


	public static class shiftExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "shiftExpression"
	// AS3.g:975:1: shiftExpression : additiveExpression (o= shiftOperator ^ additiveExpression )* ;
	public final AS3Parser.shiftExpression_return shiftExpression() throws RecognitionException {
		AS3Parser.shiftExpression_return retval = new AS3Parser.shiftExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope o =null;
		ParserRuleReturnScope additiveExpression348 =null;
		ParserRuleReturnScope additiveExpression349 =null;


		try {
			// AS3.g:976:2: ( additiveExpression (o= shiftOperator ^ additiveExpression )* )
			// AS3.g:976:4: additiveExpression (o= shiftOperator ^ additiveExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_shiftExpression3853);
			additiveExpression348=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression348.getTree());

			// AS3.g:977:3: (o= shiftOperator ^ additiveExpression )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==BSR||LA86_0==SL||LA86_0==SR) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// AS3.g:977:4: o= shiftOperator ^ additiveExpression
					{
					pushFollow(FOLLOW_shiftOperator_in_shiftExpression3860);
					o=shiftOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
					pushFollow(FOLLOW_additiveExpression_in_shiftExpression3863);
					additiveExpression349=additiveExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression349.getTree());

					if ( state.backtracking==0 ) {demarcate((o!=null?((LinkedListTree)o.getTree()):null));}
					}
					break;

				default :
					break loop86;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "shiftExpression"


	public static class shiftOperator_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "shiftOperator"
	// AS3.g:980:1: shiftOperator : ( SL | SR | BSR );
	public final AS3Parser.shiftOperator_return shiftOperator() throws RecognitionException {
		AS3Parser.shiftOperator_return retval = new AS3Parser.shiftOperator_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set350=null;

		LinkedListTree set350_tree=null;

		try {
			// AS3.g:981:2: ( SL | SR | BSR )
			// AS3.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set350=input.LT(1);
			if ( input.LA(1)==BSR||input.LA(1)==SL||input.LA(1)==SR ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set350));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "shiftOperator"


	public static class additiveExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// AS3.g:985:1: additiveExpression : multiplicativeExpression (o= additiveOperator ^ multiplicativeExpression )* ;
	public final AS3Parser.additiveExpression_return additiveExpression() throws RecognitionException {
		AS3Parser.additiveExpression_return retval = new AS3Parser.additiveExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope o =null;
		ParserRuleReturnScope multiplicativeExpression351 =null;
		ParserRuleReturnScope multiplicativeExpression352 =null;


		try {
			// AS3.g:986:2: ( multiplicativeExpression (o= additiveOperator ^ multiplicativeExpression )* )
			// AS3.g:986:4: multiplicativeExpression (o= additiveOperator ^ multiplicativeExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3898);
			multiplicativeExpression351=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression351.getTree());

			// AS3.g:987:3: (o= additiveOperator ^ multiplicativeExpression )*
			loop87:
			while (true) {
				int alt87=2;
				int LA87_0 = input.LA(1);
				if ( (LA87_0==MINUS||LA87_0==PLUS) ) {
					alt87=1;
				}

				switch (alt87) {
				case 1 :
					// AS3.g:987:4: o= additiveOperator ^ multiplicativeExpression
					{
					pushFollow(FOLLOW_additiveOperator_in_additiveExpression3905);
					o=additiveOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3908);
					multiplicativeExpression352=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression352.getTree());

					if ( state.backtracking==0 ) {demarcate((o!=null?((LinkedListTree)o.getTree()):null));}
					}
					break;

				default :
					break loop87;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additiveExpression"


	public static class additiveOperator_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "additiveOperator"
	// AS3.g:990:1: additiveOperator : ( PLUS | MINUS );
	public final AS3Parser.additiveOperator_return additiveOperator() throws RecognitionException {
		AS3Parser.additiveOperator_return retval = new AS3Parser.additiveOperator_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set353=null;

		LinkedListTree set353_tree=null;

		try {
			// AS3.g:991:2: ( PLUS | MINUS )
			// AS3.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set353=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set353));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additiveOperator"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeExpression"
	// AS3.g:995:1: multiplicativeExpression : unaryExpression (o= multiplicativeOperator ^ unaryExpression )* ;
	public final AS3Parser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		AS3Parser.multiplicativeExpression_return retval = new AS3Parser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope o =null;
		ParserRuleReturnScope unaryExpression354 =null;
		ParserRuleReturnScope unaryExpression355 =null;


		try {
			// AS3.g:996:2: ( unaryExpression (o= multiplicativeOperator ^ unaryExpression )* )
			// AS3.g:996:4: unaryExpression (o= multiplicativeOperator ^ unaryExpression )*
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3939);
			unaryExpression354=unaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression354.getTree());

			// AS3.g:997:3: (o= multiplicativeOperator ^ unaryExpression )*
			loop88:
			while (true) {
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==DIV||LA88_0==MOD||LA88_0==STAR) ) {
					alt88=1;
				}

				switch (alt88) {
				case 1 :
					// AS3.g:997:5: o= multiplicativeOperator ^ unaryExpression
					{
					pushFollow(FOLLOW_multiplicativeOperator_in_multiplicativeExpression3947);
					o=multiplicativeOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3953);
					unaryExpression355=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression355.getTree());

					if ( state.backtracking==0 ) {demarcate((o!=null?((LinkedListTree)o.getTree()):null));}
					}
					break;

				default :
					break loop88;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicativeExpression"


	public static class multiplicativeOperator_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeOperator"
	// AS3.g:1003:1: multiplicativeOperator : (s= STAR -> MULT[$s] | DIV | MOD );
	public final AS3Parser.multiplicativeOperator_return multiplicativeOperator() throws RecognitionException {
		AS3Parser.multiplicativeOperator_return retval = new AS3Parser.multiplicativeOperator_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token s=null;
		Token DIV356=null;
		Token MOD357=null;

		LinkedListTree s_tree=null;
		LinkedListTree DIV356_tree=null;
		LinkedListTree MOD357_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");

		try {
			// AS3.g:1004:2: (s= STAR -> MULT[$s] | DIV | MOD )
			int alt89=3;
			switch ( input.LA(1) ) {
			case STAR:
				{
				alt89=1;
				}
				break;
			case DIV:
				{
				alt89=2;
				}
				break;
			case MOD:
				{
				alt89=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}
			switch (alt89) {
				case 1 :
					// AS3.g:1004:4: s= STAR
					{
					s=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicativeOperator3976); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(s);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1004:11: -> MULT[$s]
					{
						adaptor.addChild(root_0, (LinkedListTree)adaptor.create(MULT, s));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AS3.g:1005:4: DIV
					{
					root_0 = (LinkedListTree)adaptor.nil();


					DIV356=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicativeOperator3986); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DIV356_tree = (LinkedListTree)adaptor.create(DIV356);
					adaptor.addChild(root_0, DIV356_tree);
					}

					}
					break;
				case 3 :
					// AS3.g:1006:4: MOD
					{
					root_0 = (LinkedListTree)adaptor.nil();


					MOD357=(Token)match(input,MOD,FOLLOW_MOD_in_multiplicativeOperator3991); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MOD357_tree = (LinkedListTree)adaptor.create(MOD357);
					adaptor.addChild(root_0, MOD357_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicativeOperator"


	public static class unaryExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "unaryExpression"
	// AS3.g:1010:1: unaryExpression : (in= INC unaryExpression -> ^( PRE_INC[$in] unaryExpression ) |de= DEC unaryExpression -> ^( PRE_DEC[$de] unaryExpression ) | MINUS unaryExpression -> ^( UNARY_MINUS unaryExpression ) | PLUS unaryExpression -> ^( UNARY_PLUS unaryExpression ) | unaryExpressionNotPlusMinus );
	public final AS3Parser.unaryExpression_return unaryExpression() throws RecognitionException {
		AS3Parser.unaryExpression_return retval = new AS3Parser.unaryExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token in=null;
		Token de=null;
		Token MINUS360=null;
		Token PLUS362=null;
		ParserRuleReturnScope unaryExpression358 =null;
		ParserRuleReturnScope unaryExpression359 =null;
		ParserRuleReturnScope unaryExpression361 =null;
		ParserRuleReturnScope unaryExpression363 =null;
		ParserRuleReturnScope unaryExpressionNotPlusMinus364 =null;

		LinkedListTree in_tree=null;
		LinkedListTree de_tree=null;
		LinkedListTree MINUS360_tree=null;
		LinkedListTree PLUS362_tree=null;
		RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
		RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");

		try {
			// AS3.g:1011:2: (in= INC unaryExpression -> ^( PRE_INC[$in] unaryExpression ) |de= DEC unaryExpression -> ^( PRE_DEC[$de] unaryExpression ) | MINUS unaryExpression -> ^( UNARY_MINUS unaryExpression ) | PLUS unaryExpression -> ^( UNARY_PLUS unaryExpression ) | unaryExpressionNotPlusMinus )
			int alt90=5;
			switch ( input.LA(1) ) {
			case INC:
				{
				alt90=1;
				}
				break;
			case DEC:
				{
				alt90=2;
				}
				break;
			case MINUS:
				{
				alt90=3;
				}
				break;
			case PLUS:
				{
				alt90=4;
				}
				break;
			case AS:
			case BNOT:
			case DECIMAL_LITERAL:
			case DELETE:
			case DIV:
			case DYNAMIC:
			case E4X_ATTRI:
			case FALSE:
			case FLOAT_LITERAL:
			case FUNCTION:
			case GET:
			case HEX_LITERAL:
			case IDENT:
			case INTERNAL:
			case IS:
			case LBRACK:
			case LCURLY:
			case LNOT:
			case LPAREN:
			case LT:
			case NAMESPACE:
			case NEW:
			case NULL:
			case OCTAL_LITERAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SET:
			case STRING_LITERAL:
			case TRUE:
			case TYPEOF:
			case UNDEFINED:
			case USE:
			case VOID:
			case XML:
				{
				alt90=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}
			switch (alt90) {
				case 1 :
					// AS3.g:1011:4: in= INC unaryExpression
					{
					in=(Token)match(input,INC,FOLLOW_INC_in_unaryExpression4005); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INC.add(in);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression4007);
					unaryExpression358=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression358.getTree());

					// AST REWRITE
					// elements: unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1011:27: -> ^( PRE_INC[$in] unaryExpression )
					{
						// AS3.g:1011:30: ^( PRE_INC[$in] unaryExpression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PRE_INC, in), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AS3.g:1012:4: de= DEC unaryExpression
					{
					de=(Token)match(input,DEC,FOLLOW_DEC_in_unaryExpression4023); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEC.add(de);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression4025);
					unaryExpression359=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression359.getTree());

					// AST REWRITE
					// elements: unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1012:27: -> ^( PRE_DEC[$de] unaryExpression )
					{
						// AS3.g:1012:30: ^( PRE_DEC[$de] unaryExpression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PRE_DEC, de), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AS3.g:1013:4: MINUS unaryExpression
					{
					MINUS360=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression4039); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS360);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression4041);
					unaryExpression361=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression361.getTree());

					// AST REWRITE
					// elements: unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1013:26: -> ^( UNARY_MINUS unaryExpression )
					{
						// AS3.g:1013:29: ^( UNARY_MINUS unaryExpression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// AS3.g:1014:4: PLUS unaryExpression
					{
					PLUS362=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression4054); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS362);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression4056);
					unaryExpression363=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression363.getTree());

					// AST REWRITE
					// elements: unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1014:25: -> ^( UNARY_PLUS unaryExpression )
					{
						// AS3.g:1014:28: ^( UNARY_PLUS unaryExpression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(UNARY_PLUS, "UNARY_PLUS"), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// AS3.g:1015:4: unaryExpressionNotPlusMinus
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression4069);
					unaryExpressionNotPlusMinus364=unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus364.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryExpression"


	public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "unaryExpressionNotPlusMinus"
	// AS3.g:1018:1: unaryExpressionNotPlusMinus : ( DELETE postfixExpression -> ^( DELETE postfixExpression ) | VOID unaryExpression -> ^( VOID unaryExpression ) | TYPEOF unaryExpression -> ^( TYPEOF unaryExpression ) | LNOT unaryExpression -> ^( LNOT unaryExpression ) | BNOT unaryExpression -> ^( BNOT unaryExpression ) | postfixExpression );
	public final AS3Parser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
		AS3Parser.unaryExpressionNotPlusMinus_return retval = new AS3Parser.unaryExpressionNotPlusMinus_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token DELETE365=null;
		Token VOID367=null;
		Token TYPEOF369=null;
		Token LNOT371=null;
		Token BNOT373=null;
		ParserRuleReturnScope postfixExpression366 =null;
		ParserRuleReturnScope unaryExpression368 =null;
		ParserRuleReturnScope unaryExpression370 =null;
		ParserRuleReturnScope unaryExpression372 =null;
		ParserRuleReturnScope unaryExpression374 =null;
		ParserRuleReturnScope postfixExpression375 =null;

		LinkedListTree DELETE365_tree=null;
		LinkedListTree VOID367_tree=null;
		LinkedListTree TYPEOF369_tree=null;
		LinkedListTree LNOT371_tree=null;
		LinkedListTree BNOT373_tree=null;
		RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
		RewriteRuleTokenStream stream_TYPEOF=new RewriteRuleTokenStream(adaptor,"token TYPEOF");
		RewriteRuleTokenStream stream_LNOT=new RewriteRuleTokenStream(adaptor,"token LNOT");
		RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
		RewriteRuleTokenStream stream_BNOT=new RewriteRuleTokenStream(adaptor,"token BNOT");
		RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
		RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");

		try {
			// AS3.g:1019:2: ( DELETE postfixExpression -> ^( DELETE postfixExpression ) | VOID unaryExpression -> ^( VOID unaryExpression ) | TYPEOF unaryExpression -> ^( TYPEOF unaryExpression ) | LNOT unaryExpression -> ^( LNOT unaryExpression ) | BNOT unaryExpression -> ^( BNOT unaryExpression ) | postfixExpression )
			int alt91=6;
			switch ( input.LA(1) ) {
			case DELETE:
				{
				alt91=1;
				}
				break;
			case VOID:
				{
				alt91=2;
				}
				break;
			case TYPEOF:
				{
				alt91=3;
				}
				break;
			case LNOT:
				{
				alt91=4;
				}
				break;
			case BNOT:
				{
				alt91=5;
				}
				break;
			case AS:
			case DECIMAL_LITERAL:
			case DIV:
			case DYNAMIC:
			case E4X_ATTRI:
			case FALSE:
			case FLOAT_LITERAL:
			case FUNCTION:
			case GET:
			case HEX_LITERAL:
			case IDENT:
			case INTERNAL:
			case IS:
			case LBRACK:
			case LCURLY:
			case LPAREN:
			case LT:
			case NAMESPACE:
			case NEW:
			case NULL:
			case OCTAL_LITERAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SET:
			case STRING_LITERAL:
			case TRUE:
			case UNDEFINED:
			case USE:
			case XML:
				{
				alt91=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// AS3.g:1019:4: DELETE postfixExpression
					{
					DELETE365=(Token)match(input,DELETE,FOLLOW_DELETE_in_unaryExpressionNotPlusMinus4080); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DELETE.add(DELETE365);

					pushFollow(FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus4082);
					postfixExpression366=postfixExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfixExpression.add(postfixExpression366.getTree());

					// AST REWRITE
					// elements: DELETE, postfixExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1019:29: -> ^( DELETE postfixExpression )
					{
						// AS3.g:1019:32: ^( DELETE postfixExpression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot(stream_DELETE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_postfixExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AS3.g:1020:4: VOID unaryExpression
					{
					VOID367=(Token)match(input,VOID,FOLLOW_VOID_in_unaryExpressionNotPlusMinus4095); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VOID.add(VOID367);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4097);
					unaryExpression368=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression368.getTree());

					// AST REWRITE
					// elements: unaryExpression, VOID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1020:25: -> ^( VOID unaryExpression )
					{
						// AS3.g:1020:28: ^( VOID unaryExpression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot(stream_VOID.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AS3.g:1021:4: TYPEOF unaryExpression
					{
					TYPEOF369=(Token)match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryExpressionNotPlusMinus4110); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TYPEOF.add(TYPEOF369);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4112);
					unaryExpression370=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression370.getTree());

					// AST REWRITE
					// elements: TYPEOF, unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1021:27: -> ^( TYPEOF unaryExpression )
					{
						// AS3.g:1021:30: ^( TYPEOF unaryExpression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot(stream_TYPEOF.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// AS3.g:1022:4: LNOT unaryExpression
					{
					LNOT371=(Token)match(input,LNOT,FOLLOW_LNOT_in_unaryExpressionNotPlusMinus4125); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LNOT.add(LNOT371);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4127);
					unaryExpression372=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression372.getTree());

					// AST REWRITE
					// elements: unaryExpression, LNOT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1022:25: -> ^( LNOT unaryExpression )
					{
						// AS3.g:1022:28: ^( LNOT unaryExpression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot(stream_LNOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// AS3.g:1023:4: BNOT unaryExpression
					{
					BNOT373=(Token)match(input,BNOT,FOLLOW_BNOT_in_unaryExpressionNotPlusMinus4140); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BNOT.add(BNOT373);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4142);
					unaryExpression374=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression374.getTree());

					// AST REWRITE
					// elements: BNOT, unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1023:25: -> ^( BNOT unaryExpression )
					{
						// AS3.g:1023:28: ^( BNOT unaryExpression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot(stream_BNOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// AS3.g:1024:4: postfixExpression
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus4155);
					postfixExpression375=postfixExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression375.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryExpressionNotPlusMinus"


	public static class postfixExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "postfixExpression"
	// AS3.g:1028:1: postfixExpression : ( primaryExpression -> primaryExpression ) (poi= propOrIdent[root_0, retval.start] -> $poi| ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACC $postfixExpression expression ) ) | E4X_DESC qualifiedIdentifier -> ^( E4X_DESC $postfixExpression qualifiedIdentifier ) | DOT LPAREN expression RPAREN -> ^( E4X_FILTER $postfixExpression expression ) |d= DOT e4xAttributeIdentifier -> ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression e4xAttributeIdentifier ) |d= DOT STAR -> ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression STAR ) | ( arguments -> ^( METHOD_CALL $postfixExpression arguments ) ) )* (in= INC -> ^( POST_INC[$in] $postfixExpression) |de= DEC -> ^( POST_DEC[$de] $postfixExpression) )? ;
	public final AS3Parser.postfixExpression_return postfixExpression() throws RecognitionException {
		AS3Parser.postfixExpression_return retval = new AS3Parser.postfixExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token rb=null;
		Token d=null;
		Token in=null;
		Token de=null;
		Token LBRACK377=null;
		Token E4X_DESC379=null;
		Token DOT381=null;
		Token LPAREN382=null;
		Token RPAREN384=null;
		Token STAR386=null;
		ParserRuleReturnScope poi =null;
		ParserRuleReturnScope primaryExpression376 =null;
		ParserRuleReturnScope expression378 =null;
		ParserRuleReturnScope qualifiedIdentifier380 =null;
		ParserRuleReturnScope expression383 =null;
		ParserRuleReturnScope e4xAttributeIdentifier385 =null;
		ParserRuleReturnScope arguments387 =null;

		LinkedListTree rb_tree=null;
		LinkedListTree d_tree=null;
		LinkedListTree in_tree=null;
		LinkedListTree de_tree=null;
		LinkedListTree LBRACK377_tree=null;
		LinkedListTree E4X_DESC379_tree=null;
		LinkedListTree DOT381_tree=null;
		LinkedListTree LPAREN382_tree=null;
		LinkedListTree RPAREN384_tree=null;
		LinkedListTree STAR386_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_E4X_DESC=new RewriteRuleTokenStream(adaptor,"token E4X_DESC");
		RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");
		RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
		RewriteRuleSubtreeStream stream_propOrIdent=new RewriteRuleSubtreeStream(adaptor,"rule propOrIdent");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
		RewriteRuleSubtreeStream stream_e4xAttributeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule e4xAttributeIdentifier");
		RewriteRuleSubtreeStream stream_qualifiedIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedIdentifier");

		try {
			// AS3.g:1029:2: ( ( primaryExpression -> primaryExpression ) (poi= propOrIdent[root_0, retval.start] -> $poi| ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACC $postfixExpression expression ) ) | E4X_DESC qualifiedIdentifier -> ^( E4X_DESC $postfixExpression qualifiedIdentifier ) | DOT LPAREN expression RPAREN -> ^( E4X_FILTER $postfixExpression expression ) |d= DOT e4xAttributeIdentifier -> ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression e4xAttributeIdentifier ) |d= DOT STAR -> ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression STAR ) | ( arguments -> ^( METHOD_CALL $postfixExpression arguments ) ) )* (in= INC -> ^( POST_INC[$in] $postfixExpression) |de= DEC -> ^( POST_DEC[$de] $postfixExpression) )? )
			// AS3.g:1029:4: ( primaryExpression -> primaryExpression ) (poi= propOrIdent[root_0, retval.start] -> $poi| ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACC $postfixExpression expression ) ) | E4X_DESC qualifiedIdentifier -> ^( E4X_DESC $postfixExpression qualifiedIdentifier ) | DOT LPAREN expression RPAREN -> ^( E4X_FILTER $postfixExpression expression ) |d= DOT e4xAttributeIdentifier -> ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression e4xAttributeIdentifier ) |d= DOT STAR -> ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression STAR ) | ( arguments -> ^( METHOD_CALL $postfixExpression arguments ) ) )* (in= INC -> ^( POST_INC[$in] $postfixExpression) |de= DEC -> ^( POST_DEC[$de] $postfixExpression) )?
			{
			// AS3.g:1029:4: ( primaryExpression -> primaryExpression )
			// AS3.g:1029:5: primaryExpression
			{
			pushFollow(FOLLOW_primaryExpression_in_postfixExpression4168);
			primaryExpression376=primaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primaryExpression.add(primaryExpression376.getTree());

			// AST REWRITE
			// elements: primaryExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 1029:23: -> primaryExpression
			{
				adaptor.addChild(root_0, stream_primaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// AS3.g:1030:3: (poi= propOrIdent[root_0, retval.start] -> $poi| ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACC $postfixExpression expression ) ) | E4X_DESC qualifiedIdentifier -> ^( E4X_DESC $postfixExpression qualifiedIdentifier ) | DOT LPAREN expression RPAREN -> ^( E4X_FILTER $postfixExpression expression ) |d= DOT e4xAttributeIdentifier -> ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression e4xAttributeIdentifier ) |d= DOT STAR -> ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression STAR ) | ( arguments -> ^( METHOD_CALL $postfixExpression arguments ) ) )*
			loop92:
			while (true) {
				int alt92=8;
				switch ( input.LA(1) ) {
				case DOT:
					{
					switch ( input.LA(2) ) {
					case LPAREN:
						{
						alt92=4;
						}
						break;
					case STAR:
						{
						alt92=6;
						}
						break;
					case AS:
					case DYNAMIC:
					case GET:
					case IDENT:
					case INTERNAL:
					case IS:
					case NAMESPACE:
					case PRIVATE:
					case PROTECTED:
					case PUBLIC:
					case SET:
					case USE:
					case XML:
						{
						alt92=1;
						}
						break;
					case E4X_ATTRI:
						{
						alt92=5;
						}
						break;
					}
					}
					break;
				case LBRACK:
					{
					alt92=2;
					}
					break;
				case E4X_DESC:
					{
					alt92=3;
					}
					break;
				case LPAREN:
					{
					alt92=7;
					}
					break;
				}
				switch (alt92) {
				case 1 :
					// AS3.g:1030:5: poi= propOrIdent[root_0, retval.start]
					{
					pushFollow(FOLLOW_propOrIdent_in_postfixExpression4181);
					poi=propOrIdent(root_0, retval.start);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_propOrIdent.add(poi.getTree());

					// AST REWRITE
					// elements: poi
					// token labels: 
					// rule labels: poi, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_poi=new RewriteRuleSubtreeStream(adaptor,"rule poi",poi!=null?poi.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1030:43: -> $poi
					{
						adaptor.addChild(root_0, stream_poi.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AS3.g:1031:5: ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACC $postfixExpression expression ) )
					{
					// AS3.g:1031:5: ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACC $postfixExpression expression ) )
					// AS3.g:1031:6: LBRACK expression rb= RBRACK
					{
					LBRACK377=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfixExpression4194); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK377);

					pushFollow(FOLLOW_expression_in_postfixExpression4196);
					expression378=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression378.getTree());
					rb=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfixExpression4200); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACK.add(rb);


					// AST REWRITE
					// elements: expression, postfixExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1031:34: -> ^( ARRAY_ACC $postfixExpression expression )
					{
						// AS3.g:1031:37: ^( ARRAY_ACC $postfixExpression expression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ARRAY_ACC, "ARRAY_ACC"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					if ( state.backtracking==0 ) {demarcate(root_0.getFirstChild()); root_0.getFirstChild().setStopToken((LinkedListToken)rb);}
					}
					break;
				case 3 :
					// AS3.g:1032:5: E4X_DESC qualifiedIdentifier
					{
					E4X_DESC379=(Token)match(input,E4X_DESC,FOLLOW_E4X_DESC_in_postfixExpression4220); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_E4X_DESC.add(E4X_DESC379);

					pushFollow(FOLLOW_qualifiedIdentifier_in_postfixExpression4222);
					qualifiedIdentifier380=qualifiedIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_qualifiedIdentifier.add(qualifiedIdentifier380.getTree());

					// AST REWRITE
					// elements: postfixExpression, qualifiedIdentifier, E4X_DESC
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1032:34: -> ^( E4X_DESC $postfixExpression qualifiedIdentifier )
					{
						// AS3.g:1032:37: ^( E4X_DESC $postfixExpression qualifiedIdentifier )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot(stream_E4X_DESC.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_qualifiedIdentifier.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// AS3.g:1033:5: DOT LPAREN expression RPAREN
					{
					DOT381=(Token)match(input,DOT,FOLLOW_DOT_in_postfixExpression4239); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT381);

					LPAREN382=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfixExpression4241); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN382);

					pushFollow(FOLLOW_expression_in_postfixExpression4243);
					expression383=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression383.getTree());
					RPAREN384=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfixExpression4245); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN384);


					// AST REWRITE
					// elements: expression, postfixExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1033:34: -> ^( E4X_FILTER $postfixExpression expression )
					{
						// AS3.g:1033:37: ^( E4X_FILTER $postfixExpression expression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(E4X_FILTER, "E4X_FILTER"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// AS3.g:1034:5: d= DOT e4xAttributeIdentifier
					{
					d=(Token)match(input,DOT,FOLLOW_DOT_in_postfixExpression4264); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(d);

					pushFollow(FOLLOW_e4xAttributeIdentifier_in_postfixExpression4266);
					e4xAttributeIdentifier385=e4xAttributeIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_e4xAttributeIdentifier.add(e4xAttributeIdentifier385.getTree());

					// AST REWRITE
					// elements: e4xAttributeIdentifier, postfixExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1034:34: -> ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression e4xAttributeIdentifier )
					{
						// AS3.g:1034:37: ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression e4xAttributeIdentifier )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PROPERTY_OR_IDENTIFIER, d), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_e4xAttributeIdentifier.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// AS3.g:1035:5: d= DOT STAR
					{
					d=(Token)match(input,DOT,FOLLOW_DOT_in_postfixExpression4286); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(d);

					STAR386=(Token)match(input,STAR,FOLLOW_STAR_in_postfixExpression4288); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR386);


					// AST REWRITE
					// elements: STAR, postfixExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1035:16: -> ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression STAR )
					{
						// AS3.g:1035:19: ^( PROPERTY_OR_IDENTIFIER[$d] $postfixExpression STAR )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PROPERTY_OR_IDENTIFIER, d), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_STAR.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// AS3.g:1036:5: ( arguments -> ^( METHOD_CALL $postfixExpression arguments ) )
					{
					// AS3.g:1036:5: ( arguments -> ^( METHOD_CALL $postfixExpression arguments ) )
					// AS3.g:1036:6: arguments
					{
					pushFollow(FOLLOW_arguments_in_postfixExpression4307);
					arguments387=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arguments.add(arguments387.getTree());

					// AST REWRITE
					// elements: arguments, postfixExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1036:16: -> ^( METHOD_CALL $postfixExpression arguments )
					{
						// AS3.g:1036:19: ^( METHOD_CALL $postfixExpression arguments )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(METHOD_CALL, "METHOD_CALL"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_arguments.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					if ( state.backtracking==0 ) {demarcate(root_0.getFirstChild());}
					}
					break;

				default :
					break loop92;
				}
			}

			// AS3.g:1039:3: (in= INC -> ^( POST_INC[$in] $postfixExpression) |de= DEC -> ^( POST_DEC[$de] $postfixExpression) )?
			int alt93=3;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==INC) ) {
				alt93=1;
			}
			else if ( (LA93_0==DEC) ) {
				alt93=2;
			}
			switch (alt93) {
				case 1 :
					// AS3.g:1039:6: in= INC
					{
					in=(Token)match(input,INC,FOLLOW_INC_in_postfixExpression4336); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INC.add(in);


					// AST REWRITE
					// elements: postfixExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1039:13: -> ^( POST_INC[$in] $postfixExpression)
					{
						// AS3.g:1039:16: ^( POST_INC[$in] $postfixExpression)
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(POST_INC, in), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AS3.g:1040:6: de= DEC
					{
					de=(Token)match(input,DEC,FOLLOW_DEC_in_postfixExpression4355); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEC.add(de);


					// AST REWRITE
					// elements: postfixExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1040:13: -> ^( POST_DEC[$de] $postfixExpression)
					{
						// AS3.g:1040:16: ^( POST_DEC[$de] $postfixExpression)
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(POST_DEC, de), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "postfixExpression"


	public static class e4xAttributeIdentifier_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "e4xAttributeIdentifier"
	// AS3.g:1045:1: e4xAttributeIdentifier : E4X_ATTRI ( qualifiedIdent -> ^( E4X_ATTRI_PROPERTY qualifiedIdent ) | STAR -> ^( E4X_ATTRI_STAR ) | LBRACK expression RBRACK -> ^( E4X_ATTRI_EXPR expression ) ) ;
	public final AS3Parser.e4xAttributeIdentifier_return e4xAttributeIdentifier() throws RecognitionException {
		AS3Parser.e4xAttributeIdentifier_return retval = new AS3Parser.e4xAttributeIdentifier_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token E4X_ATTRI388=null;
		Token STAR390=null;
		Token LBRACK391=null;
		Token RBRACK393=null;
		ParserRuleReturnScope qualifiedIdent389 =null;
		ParserRuleReturnScope expression392 =null;

		LinkedListTree E4X_ATTRI388_tree=null;
		LinkedListTree STAR390_tree=null;
		LinkedListTree LBRACK391_tree=null;
		LinkedListTree RBRACK393_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_E4X_ATTRI=new RewriteRuleTokenStream(adaptor,"token E4X_ATTRI");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_qualifiedIdent=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedIdent");

		try {
			// AS3.g:1046:2: ( E4X_ATTRI ( qualifiedIdent -> ^( E4X_ATTRI_PROPERTY qualifiedIdent ) | STAR -> ^( E4X_ATTRI_STAR ) | LBRACK expression RBRACK -> ^( E4X_ATTRI_EXPR expression ) ) )
			// AS3.g:1046:4: E4X_ATTRI ( qualifiedIdent -> ^( E4X_ATTRI_PROPERTY qualifiedIdent ) | STAR -> ^( E4X_ATTRI_STAR ) | LBRACK expression RBRACK -> ^( E4X_ATTRI_EXPR expression ) )
			{
			E4X_ATTRI388=(Token)match(input,E4X_ATTRI,FOLLOW_E4X_ATTRI_in_e4xAttributeIdentifier4383); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_E4X_ATTRI.add(E4X_ATTRI388);

			// AS3.g:1047:3: ( qualifiedIdent -> ^( E4X_ATTRI_PROPERTY qualifiedIdent ) | STAR -> ^( E4X_ATTRI_STAR ) | LBRACK expression RBRACK -> ^( E4X_ATTRI_EXPR expression ) )
			int alt94=3;
			switch ( input.LA(1) ) {
			case AS:
			case DYNAMIC:
			case GET:
			case IDENT:
			case INTERNAL:
			case IS:
			case NAMESPACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SET:
			case USE:
			case XML:
				{
				alt94=1;
				}
				break;
			case STAR:
				{
				alt94=2;
				}
				break;
			case LBRACK:
				{
				alt94=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}
			switch (alt94) {
				case 1 :
					// AS3.g:1047:5: qualifiedIdent
					{
					pushFollow(FOLLOW_qualifiedIdent_in_e4xAttributeIdentifier4389);
					qualifiedIdent389=qualifiedIdent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_qualifiedIdent.add(qualifiedIdent389.getTree());

					// AST REWRITE
					// elements: qualifiedIdent
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1047:20: -> ^( E4X_ATTRI_PROPERTY qualifiedIdent )
					{
						// AS3.g:1047:23: ^( E4X_ATTRI_PROPERTY qualifiedIdent )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(E4X_ATTRI_PROPERTY, "E4X_ATTRI_PROPERTY"), root_1);
						adaptor.addChild(root_1, stream_qualifiedIdent.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AS3.g:1048:5: STAR
					{
					STAR390=(Token)match(input,STAR,FOLLOW_STAR_in_e4xAttributeIdentifier4403); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR390);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1048:10: -> ^( E4X_ATTRI_STAR )
					{
						// AS3.g:1048:13: ^( E4X_ATTRI_STAR )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(E4X_ATTRI_STAR, "E4X_ATTRI_STAR"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AS3.g:1049:5: LBRACK expression RBRACK
					{
					LBRACK391=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_e4xAttributeIdentifier4415); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK391);

					pushFollow(FOLLOW_expression_in_e4xAttributeIdentifier4417);
					expression392=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression392.getTree());
					RBRACK393=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_e4xAttributeIdentifier4419); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK393);


					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1049:30: -> ^( E4X_ATTRI_EXPR expression )
					{
						// AS3.g:1049:33: ^( E4X_ATTRI_EXPR expression )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(E4X_ATTRI_EXPR, "E4X_ATTRI_EXPR"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "e4xAttributeIdentifier"


	public static class primaryExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "primaryExpression"
	// AS3.g:1053:1: primaryExpression : ( UNDEFINED | constant | arrayLiteral | objectLiteral | functionExpression | newExpression | encapsulatedExpression | e4xAttributeIdentifier | qualifiedIdent );
	public final AS3Parser.primaryExpression_return primaryExpression() throws RecognitionException {
		AS3Parser.primaryExpression_return retval = new AS3Parser.primaryExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token UNDEFINED394=null;
		ParserRuleReturnScope constant395 =null;
		ParserRuleReturnScope arrayLiteral396 =null;
		ParserRuleReturnScope objectLiteral397 =null;
		ParserRuleReturnScope functionExpression398 =null;
		ParserRuleReturnScope newExpression399 =null;
		ParserRuleReturnScope encapsulatedExpression400 =null;
		ParserRuleReturnScope e4xAttributeIdentifier401 =null;
		ParserRuleReturnScope qualifiedIdent402 =null;

		LinkedListTree UNDEFINED394_tree=null;

		try {
			// AS3.g:1054:2: ( UNDEFINED | constant | arrayLiteral | objectLiteral | functionExpression | newExpression | encapsulatedExpression | e4xAttributeIdentifier | qualifiedIdent )
			int alt95=9;
			switch ( input.LA(1) ) {
			case UNDEFINED:
				{
				alt95=1;
				}
				break;
			case DECIMAL_LITERAL:
			case DIV:
			case FALSE:
			case FLOAT_LITERAL:
			case HEX_LITERAL:
			case LT:
			case NULL:
			case OCTAL_LITERAL:
			case STRING_LITERAL:
			case TRUE:
				{
				alt95=2;
				}
				break;
			case LBRACK:
				{
				alt95=3;
				}
				break;
			case LCURLY:
				{
				alt95=4;
				}
				break;
			case FUNCTION:
				{
				alt95=5;
				}
				break;
			case NEW:
				{
				alt95=6;
				}
				break;
			case LPAREN:
				{
				alt95=7;
				}
				break;
			case E4X_ATTRI:
				{
				alt95=8;
				}
				break;
			case AS:
			case DYNAMIC:
			case GET:
			case IDENT:
			case INTERNAL:
			case IS:
			case NAMESPACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SET:
			case USE:
			case XML:
				{
				alt95=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}
			switch (alt95) {
				case 1 :
					// AS3.g:1054:4: UNDEFINED
					{
					root_0 = (LinkedListTree)adaptor.nil();


					UNDEFINED394=(Token)match(input,UNDEFINED,FOLLOW_UNDEFINED_in_primaryExpression4442); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNDEFINED394_tree = (LinkedListTree)adaptor.create(UNDEFINED394);
					adaptor.addChild(root_0, UNDEFINED394_tree);
					}

					}
					break;
				case 2 :
					// AS3.g:1055:4: constant
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_constant_in_primaryExpression4447);
					constant395=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant395.getTree());

					}
					break;
				case 3 :
					// AS3.g:1056:4: arrayLiteral
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_arrayLiteral_in_primaryExpression4452);
					arrayLiteral396=arrayLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLiteral396.getTree());

					}
					break;
				case 4 :
					// AS3.g:1057:4: objectLiteral
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_objectLiteral_in_primaryExpression4457);
					objectLiteral397=objectLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral397.getTree());

					}
					break;
				case 5 :
					// AS3.g:1058:4: functionExpression
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_functionExpression_in_primaryExpression4462);
					functionExpression398=functionExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionExpression398.getTree());

					}
					break;
				case 6 :
					// AS3.g:1059:4: newExpression
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_newExpression_in_primaryExpression4467);
					newExpression399=newExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpression399.getTree());

					}
					break;
				case 7 :
					// AS3.g:1060:4: encapsulatedExpression
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_encapsulatedExpression_in_primaryExpression4472);
					encapsulatedExpression400=encapsulatedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, encapsulatedExpression400.getTree());

					}
					break;
				case 8 :
					// AS3.g:1061:4: e4xAttributeIdentifier
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_e4xAttributeIdentifier_in_primaryExpression4477);
					e4xAttributeIdentifier401=e4xAttributeIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e4xAttributeIdentifier401.getTree());

					}
					break;
				case 9 :
					// AS3.g:1062:4: qualifiedIdent
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_qualifiedIdent_in_primaryExpression4482);
					qualifiedIdent402=qualifiedIdent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedIdent402.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primaryExpression"


	public static class propOrIdent_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "propOrIdent"
	// AS3.g:1083:1: propOrIdent[LinkedListTree identPrimary, Token startToken] :d= DOT propId= qualifiedIdent -> ^( PROPERTY_OR_IDENTIFIER[$d] $propId) ;
	public final AS3Parser.propOrIdent_return propOrIdent(LinkedListTree identPrimary, Token startToken) throws RecognitionException {
		AS3Parser.propOrIdent_return retval = new AS3Parser.propOrIdent_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token d=null;
		ParserRuleReturnScope propId =null;

		LinkedListTree d_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_qualifiedIdent=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedIdent");

		try {
			// AS3.g:1084:2: (d= DOT propId= qualifiedIdent -> ^( PROPERTY_OR_IDENTIFIER[$d] $propId) )
			// AS3.g:1085:3: d= DOT propId= qualifiedIdent
			{
			if ( state.backtracking==0 ) { retval.start = startToken; }
			d=(Token)match(input,DOT,FOLLOW_DOT_in_propOrIdent4521); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOT.add(d);

			pushFollow(FOLLOW_qualifiedIdent_in_propOrIdent4525);
			propId=qualifiedIdent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_qualifiedIdent.add(propId.getTree());

			// AST REWRITE
			// elements: propId
			// token labels: 
			// rule labels: propId, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_propId=new RewriteRuleSubtreeStream(adaptor,"rule propId",propId!=null?propId.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 1092:3: -> ^( PROPERTY_OR_IDENTIFIER[$d] $propId)
			{
				// AS3.g:1092:6: ^( PROPERTY_OR_IDENTIFIER[$d] $propId)
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PROPERTY_OR_IDENTIFIER, d), root_1);
				adaptor.addChild(root_1, identPrimary);
				adaptor.addChild(root_1, stream_propId.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "propOrIdent"


	public static class constant_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// AS3.g:1095:1: constant : ( xmlLiteral | regexpLiteral | number | STRING_LITERAL | TRUE | FALSE | NULL );
	public final AS3Parser.constant_return constant() throws RecognitionException {
		AS3Parser.constant_return retval = new AS3Parser.constant_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token STRING_LITERAL406=null;
		Token TRUE407=null;
		Token FALSE408=null;
		Token NULL409=null;
		ParserRuleReturnScope xmlLiteral403 =null;
		ParserRuleReturnScope regexpLiteral404 =null;
		ParserRuleReturnScope number405 =null;

		LinkedListTree STRING_LITERAL406_tree=null;
		LinkedListTree TRUE407_tree=null;
		LinkedListTree FALSE408_tree=null;
		LinkedListTree NULL409_tree=null;

		try {
			// AS3.g:1096:2: ( xmlLiteral | regexpLiteral | number | STRING_LITERAL | TRUE | FALSE | NULL )
			int alt96=7;
			switch ( input.LA(1) ) {
			case LT:
				{
				alt96=1;
				}
				break;
			case DIV:
				{
				alt96=2;
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
				{
				alt96=3;
				}
				break;
			case STRING_LITERAL:
				{
				alt96=4;
				}
				break;
			case TRUE:
				{
				alt96=5;
				}
				break;
			case FALSE:
				{
				alt96=6;
				}
				break;
			case NULL:
				{
				alt96=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// AS3.g:1096:4: xmlLiteral
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlLiteral_in_constant4554);
					xmlLiteral403=xmlLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, xmlLiteral403.getTree());

					}
					break;
				case 2 :
					// AS3.g:1097:4: regexpLiteral
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_regexpLiteral_in_constant4559);
					regexpLiteral404=regexpLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, regexpLiteral404.getTree());

					}
					break;
				case 3 :
					// AS3.g:1098:4: number
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_number_in_constant4564);
					number405=number();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number405.getTree());

					}
					break;
				case 4 :
					// AS3.g:1099:4: STRING_LITERAL
					{
					root_0 = (LinkedListTree)adaptor.nil();


					STRING_LITERAL406=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant4569); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING_LITERAL406_tree = (LinkedListTree)adaptor.create(STRING_LITERAL406);
					adaptor.addChild(root_0, STRING_LITERAL406_tree);
					}

					}
					break;
				case 5 :
					// AS3.g:1100:4: TRUE
					{
					root_0 = (LinkedListTree)adaptor.nil();


					TRUE407=(Token)match(input,TRUE,FOLLOW_TRUE_in_constant4574); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TRUE407_tree = (LinkedListTree)adaptor.create(TRUE407);
					adaptor.addChild(root_0, TRUE407_tree);
					}

					}
					break;
				case 6 :
					// AS3.g:1101:4: FALSE
					{
					root_0 = (LinkedListTree)adaptor.nil();


					FALSE408=(Token)match(input,FALSE,FOLLOW_FALSE_in_constant4579); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FALSE408_tree = (LinkedListTree)adaptor.create(FALSE408);
					adaptor.addChild(root_0, FALSE408_tree);
					}

					}
					break;
				case 7 :
					// AS3.g:1102:4: NULL
					{
					root_0 = (LinkedListTree)adaptor.nil();


					NULL409=(Token)match(input,NULL,FOLLOW_NULL_in_constant4584); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL409_tree = (LinkedListTree)adaptor.create(NULL409);
					adaptor.addChild(root_0, NULL409_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class number_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "number"
	// AS3.g:1105:1: number : ( HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOAT_LITERAL );
	public final AS3Parser.number_return number() throws RecognitionException {
		AS3Parser.number_return retval = new AS3Parser.number_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set410=null;

		LinkedListTree set410_tree=null;

		try {
			// AS3.g:1105:8: ( HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOAT_LITERAL )
			// AS3.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set410=input.LT(1);
			if ( input.LA(1)==DECIMAL_LITERAL||input.LA(1)==FLOAT_LITERAL||input.LA(1)==HEX_LITERAL||input.LA(1)==OCTAL_LITERAL ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set410));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "number"


	public static class xmlLiteral_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlLiteral"
	// AS3.g:1112:1: xmlLiteral : LT -> ^( XML_LITERAL ) ;
	public final AS3Parser.xmlLiteral_return xmlLiteral() throws RecognitionException {
		AS3Parser.xmlLiteral_return retval = new AS3Parser.xmlLiteral_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LT411=null;

		LinkedListTree LT411_tree=null;
		RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");


				LinkedListTree xml = null;
			
		try {
			// AS3.g:1116:2: ( LT -> ^( XML_LITERAL ) )
			// AS3.g:1119:3: LT
			{
			LT411=(Token)match(input,LT,FOLLOW_LT_in_xmlLiteral4637); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LT.add(LT411);

			if ( state.backtracking==0 ) { xml=parseXMLLiteral(); }

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 1121:3: -> ^( XML_LITERAL )
			{
				// AS3.g:1121:6: ^( XML_LITERAL )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_LITERAL, "XML_LITERAL"), root_1);
				adaptor.addChild(root_1, xml);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "xmlLiteral"


	public static class regexpLiteral_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "regexpLiteral"
	// AS3.g:1124:1: regexpLiteral : s= DIV -> ^( REGEXP_LITERAL ) ;
	public final AS3Parser.regexpLiteral_return regexpLiteral() throws RecognitionException {
		AS3Parser.regexpLiteral_return retval = new AS3Parser.regexpLiteral_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token s=null;

		LinkedListTree s_tree=null;
		RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");


				LinkedListTree regexp = null;
			
		try {
			// AS3.g:1128:2: (s= DIV -> ^( REGEXP_LITERAL ) )
			// AS3.g:1128:4: s= DIV
			{
			s=(Token)match(input,DIV,FOLLOW_DIV_in_regexpLiteral4670); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIV.add(s);

			if ( state.backtracking==0 ) { regexp=parseRegexpLiteral((LinkedListToken)s); }

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 1129:3: -> ^( REGEXP_LITERAL )
			{
				// AS3.g:1129:6: ^( REGEXP_LITERAL )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(REGEXP_LITERAL, "REGEXP_LITERAL"), root_1);
				adaptor.addChild(root_1, regexp);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "regexpLiteral"


	public static class newExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "newExpression"
	// AS3.g:1132:1: newExpression : NEW ^ fullNewSubexpression ( ( LPAREN )=> arguments )? ;
	public final AS3Parser.newExpression_return newExpression() throws RecognitionException {
		AS3Parser.newExpression_return retval = new AS3Parser.newExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token NEW412=null;
		ParserRuleReturnScope fullNewSubexpression413 =null;
		ParserRuleReturnScope arguments414 =null;

		LinkedListTree NEW412_tree=null;

		try {
			// AS3.g:1133:2: ( NEW ^ fullNewSubexpression ( ( LPAREN )=> arguments )? )
			// AS3.g:1133:4: NEW ^ fullNewSubexpression ( ( LPAREN )=> arguments )?
			{
			root_0 = (LinkedListTree)adaptor.nil();


			NEW412=(Token)match(input,NEW,FOLLOW_NEW_in_newExpression4693); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NEW412_tree = (LinkedListTree)adaptor.create(NEW412);
			root_0 = (LinkedListTree)adaptor.becomeRoot(NEW412_tree, root_0);
			}

			pushFollow(FOLLOW_fullNewSubexpression_in_newExpression4696);
			fullNewSubexpression413=fullNewSubexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fullNewSubexpression413.getTree());

			// AS3.g:1133:30: ( ( LPAREN )=> arguments )?
			int alt97=2;
			alt97 = dfa97.predict(input);
			switch (alt97) {
				case 1 :
					// AS3.g:1133:31: ( LPAREN )=> arguments
					{
					pushFollow(FOLLOW_arguments_in_newExpression4704);
					arguments414=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments414.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "newExpression"


	public static class fullNewSubexpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "fullNewSubexpression"
	// AS3.g:1136:1: fullNewSubexpression : ( primaryExpression -> primaryExpression ) ( ( DOT )=>d= DOT qualifiedIdent -> ^( PROPERTY_OR_IDENTIFIER[$d] $fullNewSubexpression qualifiedIdent ) | ( LBRACK )=> brackets -> ^( ARRAY_ACC $fullNewSubexpression brackets ) )* ;
	public final AS3Parser.fullNewSubexpression_return fullNewSubexpression() throws RecognitionException {
		AS3Parser.fullNewSubexpression_return retval = new AS3Parser.fullNewSubexpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token d=null;
		ParserRuleReturnScope primaryExpression415 =null;
		ParserRuleReturnScope qualifiedIdent416 =null;
		ParserRuleReturnScope brackets417 =null;

		LinkedListTree d_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
		RewriteRuleSubtreeStream stream_qualifiedIdent=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedIdent");
		RewriteRuleSubtreeStream stream_brackets=new RewriteRuleSubtreeStream(adaptor,"rule brackets");

		try {
			// AS3.g:1137:2: ( ( primaryExpression -> primaryExpression ) ( ( DOT )=>d= DOT qualifiedIdent -> ^( PROPERTY_OR_IDENTIFIER[$d] $fullNewSubexpression qualifiedIdent ) | ( LBRACK )=> brackets -> ^( ARRAY_ACC $fullNewSubexpression brackets ) )* )
			// AS3.g:1137:4: ( primaryExpression -> primaryExpression ) ( ( DOT )=>d= DOT qualifiedIdent -> ^( PROPERTY_OR_IDENTIFIER[$d] $fullNewSubexpression qualifiedIdent ) | ( LBRACK )=> brackets -> ^( ARRAY_ACC $fullNewSubexpression brackets ) )*
			{
			// AS3.g:1137:4: ( primaryExpression -> primaryExpression )
			// AS3.g:1137:6: primaryExpression
			{
			pushFollow(FOLLOW_primaryExpression_in_fullNewSubexpression4719);
			primaryExpression415=primaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primaryExpression.add(primaryExpression415.getTree());

			// AST REWRITE
			// elements: primaryExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 1137:24: -> primaryExpression
			{
				adaptor.addChild(root_0, stream_primaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// AS3.g:1139:3: ( ( DOT )=>d= DOT qualifiedIdent -> ^( PROPERTY_OR_IDENTIFIER[$d] $fullNewSubexpression qualifiedIdent ) | ( LBRACK )=> brackets -> ^( ARRAY_ACC $fullNewSubexpression brackets ) )*
			loop98:
			while (true) {
				int alt98=3;
				alt98 = dfa98.predict(input);
				switch (alt98) {
				case 1 :
					// AS3.g:1139:5: ( DOT )=>d= DOT qualifiedIdent
					{
					d=(Token)match(input,DOT,FOLLOW_DOT_in_fullNewSubexpression4740); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(d);

					pushFollow(FOLLOW_qualifiedIdent_in_fullNewSubexpression4742);
					qualifiedIdent416=qualifiedIdent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_qualifiedIdent.add(qualifiedIdent416.getTree());

					// AST REWRITE
					// elements: qualifiedIdent, fullNewSubexpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1139:34: -> ^( PROPERTY_OR_IDENTIFIER[$d] $fullNewSubexpression qualifiedIdent )
					{
						// AS3.g:1139:37: ^( PROPERTY_OR_IDENTIFIER[$d] $fullNewSubexpression qualifiedIdent )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PROPERTY_OR_IDENTIFIER, d), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_qualifiedIdent.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AS3.g:1140:5: ( LBRACK )=> brackets
					{
					pushFollow(FOLLOW_brackets_in_fullNewSubexpression4765);
					brackets417=brackets();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_brackets.add(brackets417.getTree());

					// AST REWRITE
					// elements: fullNewSubexpression, brackets
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1140:25: -> ^( ARRAY_ACC $fullNewSubexpression brackets )
					{
						// AS3.g:1140:28: ^( ARRAY_ACC $fullNewSubexpression brackets )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ARRAY_ACC, "ARRAY_ACC"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_brackets.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop98;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fullNewSubexpression"


	public static class propertyOperator_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "propertyOperator"
	// AS3.g:1144:1: propertyOperator : ( DOT ^ qualifiedIdent | brackets );
	public final AS3Parser.propertyOperator_return propertyOperator() throws RecognitionException {
		AS3Parser.propertyOperator_return retval = new AS3Parser.propertyOperator_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token DOT418=null;
		ParserRuleReturnScope qualifiedIdent419 =null;
		ParserRuleReturnScope brackets420 =null;

		LinkedListTree DOT418_tree=null;

		try {
			// AS3.g:1145:2: ( DOT ^ qualifiedIdent | brackets )
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==DOT) ) {
				alt99=1;
			}
			else if ( (LA99_0==LBRACK) ) {
				alt99=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}

			switch (alt99) {
				case 1 :
					// AS3.g:1145:4: DOT ^ qualifiedIdent
					{
					root_0 = (LinkedListTree)adaptor.nil();


					DOT418=(Token)match(input,DOT,FOLLOW_DOT_in_propertyOperator4792); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT418_tree = (LinkedListTree)adaptor.create(DOT418);
					root_0 = (LinkedListTree)adaptor.becomeRoot(DOT418_tree, root_0);
					}

					pushFollow(FOLLOW_qualifiedIdent_in_propertyOperator4795);
					qualifiedIdent419=qualifiedIdent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedIdent419.getTree());

					}
					break;
				case 2 :
					// AS3.g:1146:4: brackets
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_brackets_in_propertyOperator4800);
					brackets420=brackets();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, brackets420.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "propertyOperator"


	public static class brackets_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "brackets"
	// AS3.g:1149:1: brackets : LBRACK expressionList RBRACK ;
	public final AS3Parser.brackets_return brackets() throws RecognitionException {
		AS3Parser.brackets_return retval = new AS3Parser.brackets_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LBRACK421=null;
		Token RBRACK423=null;
		ParserRuleReturnScope expressionList422 =null;

		LinkedListTree LBRACK421_tree=null;
		LinkedListTree RBRACK423_tree=null;


			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:1153:2: ( LBRACK expressionList RBRACK )
			// AS3.g:1153:4: LBRACK expressionList RBRACK
			{
			root_0 = (LinkedListTree)adaptor.nil();


			LBRACK421=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_brackets4816); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LBRACK421_tree = (LinkedListTree)adaptor.create(LBRACK421);
			adaptor.addChild(root_0, LBRACK421_tree);
			}

			pushFollow(FOLLOW_expressionList_in_brackets4818);
			expressionList422=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList422.getTree());

			RBRACK423=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_brackets4820); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RBRACK423_tree = (LinkedListTree)adaptor.create(RBRACK423);
			adaptor.addChild(root_0, RBRACK423_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "brackets"


	public static class superExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "superExpression"
	// AS3.g:1156:1: superExpression : SUPER ^ ( arguments )? ;
	public final AS3Parser.superExpression_return superExpression() throws RecognitionException {
		AS3Parser.superExpression_return retval = new AS3Parser.superExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token SUPER424=null;
		ParserRuleReturnScope arguments425 =null;

		LinkedListTree SUPER424_tree=null;

		try {
			// AS3.g:1157:2: ( SUPER ^ ( arguments )? )
			// AS3.g:1157:4: SUPER ^ ( arguments )?
			{
			root_0 = (LinkedListTree)adaptor.nil();


			SUPER424=(Token)match(input,SUPER,FOLLOW_SUPER_in_superExpression4831); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SUPER424_tree = (LinkedListTree)adaptor.create(SUPER424);
			root_0 = (LinkedListTree)adaptor.becomeRoot(SUPER424_tree, root_0);
			}

			// AS3.g:1157:11: ( arguments )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==LPAREN) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// AS3.g:1157:11: arguments
					{
					pushFollow(FOLLOW_arguments_in_superExpression4834);
					arguments425=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments425.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "superExpression"


	public static class encapsulatedExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "encapsulatedExpression"
	// AS3.g:1160:1: encapsulatedExpression : LPAREN assignmentExpression RPAREN -> ^( ENCPS_EXPR assignmentExpression ) ;
	public final AS3Parser.encapsulatedExpression_return encapsulatedExpression() throws RecognitionException {
		InOperator_stack.push(new InOperator_scope());

		AS3Parser.encapsulatedExpression_return retval = new AS3Parser.encapsulatedExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LPAREN426=null;
		Token RPAREN428=null;
		ParserRuleReturnScope assignmentExpression427 =null;

		LinkedListTree LPAREN426_tree=null;
		LinkedListTree RPAREN428_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");


			InOperator_stack.peek().allowed = true;

		try {
			// AS3.g:1165:2: ( LPAREN assignmentExpression RPAREN -> ^( ENCPS_EXPR assignmentExpression ) )
			// AS3.g:1165:4: LPAREN assignmentExpression RPAREN
			{
			LPAREN426=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_encapsulatedExpression4856); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN426);

			pushFollow(FOLLOW_assignmentExpression_in_encapsulatedExpression4858);
			assignmentExpression427=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression427.getTree());
			RPAREN428=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_encapsulatedExpression4860); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN428);


			// AST REWRITE
			// elements: assignmentExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 1166:3: -> ^( ENCPS_EXPR assignmentExpression )
			{
				// AS3.g:1166:6: ^( ENCPS_EXPR assignmentExpression )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ENCPS_EXPR, "ENCPS_EXPR"), root_1);
				adaptor.addChild(root_1, stream_assignmentExpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
			InOperator_stack.pop();

		}
		return retval;
	}
	// $ANTLR end "encapsulatedExpression"


	public static class functionSignature_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "functionSignature"
	// AS3.g:1169:1: functionSignature : parameterDeclarationList ( typeExpression )? ;
	public final AS3Parser.functionSignature_return functionSignature() throws RecognitionException {
		AS3Parser.functionSignature_return retval = new AS3Parser.functionSignature_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope parameterDeclarationList429 =null;
		ParserRuleReturnScope typeExpression430 =null;


		try {
			// AS3.g:1170:2: ( parameterDeclarationList ( typeExpression )? )
			// AS3.g:1170:4: parameterDeclarationList ( typeExpression )?
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_parameterDeclarationList_in_functionSignature4881);
			parameterDeclarationList429=parameterDeclarationList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, parameterDeclarationList429.getTree());

			// AS3.g:1170:29: ( typeExpression )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==COLON) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// AS3.g:1170:29: typeExpression
					{
					pushFollow(FOLLOW_typeExpression_in_functionSignature4883);
					typeExpression430=typeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExpression430.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionSignature"


	public static class functionCommon_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "functionCommon"
	// AS3.g:1174:1: functionCommon : functionSignature block ;
	public final AS3Parser.functionCommon_return functionCommon() throws RecognitionException {
		AS3Parser.functionCommon_return retval = new AS3Parser.functionCommon_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope functionSignature431 =null;
		ParserRuleReturnScope block432 =null;


		try {
			// AS3.g:1175:2: ( functionSignature block )
			// AS3.g:1175:4: functionSignature block
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_functionSignature_in_functionCommon4896);
			functionSignature431=functionSignature();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionSignature431.getTree());

			pushFollow(FOLLOW_block_in_functionCommon4898);
			block432=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block432.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCommon"


	public static class functionExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "functionExpression"
	// AS3.g:1178:1: functionExpression : FUNCTION ( IDENT )? functionCommon -> ^( FUNC_DEF ( IDENT )? functionCommon ) ;
	public final AS3Parser.functionExpression_return functionExpression() throws RecognitionException {
		AS3Parser.functionExpression_return retval = new AS3Parser.functionExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token FUNCTION433=null;
		Token IDENT434=null;
		ParserRuleReturnScope functionCommon435 =null;

		LinkedListTree FUNCTION433_tree=null;
		LinkedListTree IDENT434_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleSubtreeStream stream_functionCommon=new RewriteRuleSubtreeStream(adaptor,"rule functionCommon");

		try {
			// AS3.g:1179:2: ( FUNCTION ( IDENT )? functionCommon -> ^( FUNC_DEF ( IDENT )? functionCommon ) )
			// AS3.g:1179:4: FUNCTION ( IDENT )? functionCommon
			{
			FUNCTION433=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression4909); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION433);

			// AS3.g:1179:13: ( IDENT )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==IDENT) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// AS3.g:1179:13: IDENT
					{
					IDENT434=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionExpression4911); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENT.add(IDENT434);

					}
					break;

			}

			pushFollow(FOLLOW_functionCommon_in_functionExpression4914);
			functionCommon435=functionCommon();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionCommon.add(functionCommon435.getTree());

			// AST REWRITE
			// elements: IDENT, functionCommon
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 1180:3: -> ^( FUNC_DEF ( IDENT )? functionCommon )
			{
				// AS3.g:1180:6: ^( FUNC_DEF ( IDENT )? functionCommon )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);
				// AS3.g:1180:17: ( IDENT )?
				if ( stream_IDENT.hasNext() ) {
					adaptor.addChild(root_1, stream_IDENT.nextNode());
				}
				stream_IDENT.reset();

				adaptor.addChild(root_1, stream_functionCommon.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionExpression"


	public static class ident_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "ident"
	// AS3.g:1184:1: ident : ( IDENT |i= USE -> IDENT[$i] |i= XML -> IDENT[$i] |i= DYNAMIC -> IDENT[$i] |i= NAMESPACE -> IDENT[$i] |i= IS -> IDENT[$i] |i= AS -> IDENT[$i] |i= GET -> IDENT[$i] |i= SET -> IDENT[$i] );
	public final AS3Parser.ident_return ident() throws RecognitionException {
		AS3Parser.ident_return retval = new AS3Parser.ident_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token i=null;
		Token IDENT436=null;

		LinkedListTree i_tree=null;
		LinkedListTree IDENT436_tree=null;
		RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
		RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
		RewriteRuleTokenStream stream_XML=new RewriteRuleTokenStream(adaptor,"token XML");
		RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleTokenStream stream_DYNAMIC=new RewriteRuleTokenStream(adaptor,"token DYNAMIC");

		try {
			// AS3.g:1185:2: ( IDENT |i= USE -> IDENT[$i] |i= XML -> IDENT[$i] |i= DYNAMIC -> IDENT[$i] |i= NAMESPACE -> IDENT[$i] |i= IS -> IDENT[$i] |i= AS -> IDENT[$i] |i= GET -> IDENT[$i] |i= SET -> IDENT[$i] )
			int alt103=9;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt103=1;
				}
				break;
			case USE:
				{
				alt103=2;
				}
				break;
			case XML:
				{
				alt103=3;
				}
				break;
			case DYNAMIC:
				{
				alt103=4;
				}
				break;
			case NAMESPACE:
				{
				alt103=5;
				}
				break;
			case IS:
				{
				alt103=6;
				}
				break;
			case AS:
				{
				alt103=7;
				}
				break;
			case GET:
				{
				alt103=8;
				}
				break;
			case SET:
				{
				alt103=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}
			switch (alt103) {
				case 1 :
					// AS3.g:1185:4: IDENT
					{
					root_0 = (LinkedListTree)adaptor.nil();


					IDENT436=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident4939); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT436_tree = (LinkedListTree)adaptor.create(IDENT436);
					adaptor.addChild(root_0, IDENT436_tree);
					}

					}
					break;
				case 2 :
					// AS3.g:1186:4: i= USE
					{
					i=(Token)match(input,USE,FOLLOW_USE_in_ident4946); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USE.add(i);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1186:10: -> IDENT[$i]
					{
						adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AS3.g:1187:4: i= XML
					{
					i=(Token)match(input,XML,FOLLOW_XML_in_ident4958); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_XML.add(i);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1187:10: -> IDENT[$i]
					{
						adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// AS3.g:1188:4: i= DYNAMIC
					{
					i=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_ident4970); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DYNAMIC.add(i);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1188:14: -> IDENT[$i]
					{
						adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// AS3.g:1189:4: i= NAMESPACE
					{
					i=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_ident4982); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAMESPACE.add(i);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1189:16: -> IDENT[$i]
					{
						adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// AS3.g:1190:4: i= IS
					{
					i=(Token)match(input,IS,FOLLOW_IS_in_ident4994); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IS.add(i);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1190:9: -> IDENT[$i]
					{
						adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// AS3.g:1191:4: i= AS
					{
					i=(Token)match(input,AS,FOLLOW_AS_in_ident5006); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AS.add(i);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1191:9: -> IDENT[$i]
					{
						adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// AS3.g:1192:4: i= GET
					{
					i=(Token)match(input,GET,FOLLOW_GET_in_ident5018); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GET.add(i);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1192:10: -> IDENT[$i]
					{
						adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					// AS3.g:1193:4: i= SET
					{
					i=(Token)match(input,SET,FOLLOW_SET_in_ident5030); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SET.add(i);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 1193:10: -> IDENT[$i]
					{
						adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ident"

	// $ANTLR start synpred1_AS3
	public final void synpred1_AS3_fragment() throws RecognitionException {
		// AS3.g:437:4: ( LCURLY )
		// AS3.g:437:5: LCURLY
		{
		match(input,LCURLY,FOLLOW_LCURLY_in_synpred1_AS31512); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_AS3

	// $ANTLR start synpred2_AS3
	public final void synpred2_AS3_fragment() throws RecognitionException {
		// AS3.g:502:4: ( ELSE )
		// AS3.g:502:5: ELSE
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred2_AS31732); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_AS3

	// $ANTLR start synpred3_AS3
	public final void synpred3_AS3_fragment() throws RecognitionException {
		// AS3.g:586:5: ( forInClauseDecl IN )
		// AS3.g:586:6: forInClauseDecl IN
		{
		pushFollow(FOLLOW_forInClauseDecl_in_synpred3_AS32123);
		forInClauseDecl();
		state._fsp--;
		if (state.failed) return;

		match(input,IN,FOLLOW_IN_in_synpred3_AS32125); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_AS3

	// $ANTLR start synpred4_AS3
	public final void synpred4_AS3_fragment() throws RecognitionException {
		// AS3.g:874:4: ( assignmentOperator )
		// AS3.g:874:5: assignmentOperator
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred4_AS33388);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_AS3

	// $ANTLR start synpred5_AS3
	public final void synpred5_AS3_fragment() throws RecognitionException {
		// AS3.g:966:4: ( relationalOperator )
		// AS3.g:966:5: relationalOperator
		{
		pushFollow(FOLLOW_relationalOperator_in_synpred5_AS33786);
		relationalOperator();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_AS3

	// $ANTLR start synpred6_AS3
	public final void synpred6_AS3_fragment() throws RecognitionException {
		// AS3.g:1133:31: ( LPAREN )
		// AS3.g:1133:32: LPAREN
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred6_AS34700); if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_AS3

	// $ANTLR start synpred7_AS3
	public final void synpred7_AS3_fragment() throws RecognitionException {
		// AS3.g:1139:5: ( DOT )
		// AS3.g:1139:6: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred7_AS34734); if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_AS3

	// $ANTLR start synpred8_AS3
	public final void synpred8_AS3_fragment() throws RecognitionException {
		// AS3.g:1140:5: ( LBRACK )
		// AS3.g:1140:6: LBRACK
		{
		match(input,LBRACK,FOLLOW_LBRACK_in_synpred8_AS34761); if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_AS3

	// Delegated rules

	public final boolean synpred4_AS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_AS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_AS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_AS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_AS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_AS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_AS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_AS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_AS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_AS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_AS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_AS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_AS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_AS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_AS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_AS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA32 dfa32 = new DFA32(this);
	protected DFA33 dfa33 = new DFA33(this);
	protected DFA42 dfa42 = new DFA42(this);
	protected DFA52 dfa52 = new DFA52(this);
	protected DFA97 dfa97 = new DFA97(this);
	protected DFA98 dfa98 = new DFA98(this);
	static final String DFA32_eotS =
		"\144\uffff";
	static final String DFA32_eofS =
		"\144\uffff";
	static final String DFA32_minS =
		"\1\13\1\uffff\1\13\42\uffff\1\65\32\uffff\1\0\11\uffff\1\0\1\uffff\10"+
		"\0\15\uffff\1\0\2\uffff";
	static final String DFA32_maxS =
		"\1\u00b7\1\uffff\1\u00b7\42\uffff\1\145\32\uffff\1\0\11\uffff\1\0\1\uffff"+
		"\10\0\15\uffff\1\0\2\uffff";
	static final String DFA32_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\1\4\37\uffff\1\5\1\uffff\1\10\1\11\1\12\1\13"+
		"\1\14\1\15\1\16\1\17\1\20\1\21\1\22\17\2\1\uffff\11\2\1\uffff\1\2\10\uffff"+
		"\15\2\1\uffff\1\6\1\7";
	static final String DFA32_specialS =
		"\2\uffff\1\0\75\uffff\1\1\11\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10"+
		"\1\11\1\12\15\uffff\1\13\2\uffff}>";
	static final String[] DFA32_transitionS = {
			"\1\4\4\uffff\1\4\3\uffff\1\52\14\uffff\1\3\1\53\2\uffff\2\4\1\57\1\uffff"+
			"\2\4\1\uffff\1\47\1\uffff\2\4\16\uffff\1\4\2\uffff\1\4\1\45\5\uffff\1"+
			"\4\2\uffff\1\4\2\uffff\2\4\2\uffff\1\44\3\uffff\1\4\4\uffff\2\4\2\uffff"+
			"\1\4\1\2\1\uffff\1\4\2\uffff\2\4\2\uffff\1\4\6\uffff\1\4\1\uffff\1\4"+
			"\2\uffff\1\4\3\uffff\1\4\5\uffff\1\4\5\uffff\1\4\2\uffff\2\4\5\uffff"+
			"\1\54\1\uffff\1\60\1\4\12\uffff\1\4\1\1\1\51\1\uffff\1\55\1\4\1\56\1"+
			"\4\5\uffff\1\4\3\uffff\1\4\1\3\3\uffff\1\4\1\46\1\50\1\uffff\1\4",
			"",
			"\1\121\4\uffff\1\74\3\uffff\1\132\14\uffff\1\63\1\133\2\uffff\1\65\1"+
			"\100\1\137\1\uffff\1\70\1\77\1\uffff\1\127\1\uffff\1\116\1\111\16\uffff"+
			"\1\103\2\uffff\1\100\1\125\5\uffff\1\106\2\uffff\1\122\2\uffff\1\100"+
			"\1\112\2\uffff\1\124\3\uffff\1\64\4\uffff\1\113\1\120\2\uffff\1\105\1"+
			"\62\1\uffff\1\73\2\uffff\1\110\1\76\2\uffff\1\66\6\uffff\1\117\1\uffff"+
			"\1\107\2\uffff\1\104\3\uffff\1\100\5\uffff\1\67\5\uffff\1\113\2\uffff"+
			"\2\113\2\uffff\1\141\2\uffff\1\134\1\uffff\1\140\1\123\12\uffff\1\101"+
			"\1\61\1\131\1\uffff\1\135\1\102\1\136\1\72\5\uffff\1\75\3\uffff\1\114"+
			"\1\63\3\uffff\1\71\1\126\1\130\1\uffff\1\115",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\142\57\uffff\1\143",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "435:1: statement : ( superStatement | ( LCURLY )=> block | declarationStatement | expressionStatement | ifStatement | forEachStatement | forStatement | whileStatement | doWhileStatement | withStatement | switchStatement | breakStatement | continueStatement | returnStatement | throwStatement | tryStatement | defaultXMLNamespaceStatement | SEMI !);";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA32_2 = input.LA(1);
						 
						int index32_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA32_2==SUPER) && (synpred1_AS3())) {s = 49;}
						else if ( (LA32_2==LCURLY) && (synpred1_AS3())) {s = 50;}
						else if ( (LA32_2==CONST||LA32_2==VAR) && (synpred1_AS3())) {s = 51;}
						else if ( (LA32_2==INC) && (synpred1_AS3())) {s = 52;}
						else if ( (LA32_2==DEC) && (synpred1_AS3())) {s = 53;}
						else if ( (LA32_2==MINUS) && (synpred1_AS3())) {s = 54;}
						else if ( (LA32_2==PLUS) && (synpred1_AS3())) {s = 55;}
						else if ( (LA32_2==DELETE) && (synpred1_AS3())) {s = 56;}
						else if ( (LA32_2==VOID) && (synpred1_AS3())) {s = 57;}
						else if ( (LA32_2==TYPEOF) && (synpred1_AS3())) {s = 58;}
						else if ( (LA32_2==LNOT) && (synpred1_AS3())) {s = 59;}
						else if ( (LA32_2==BNOT) && (synpred1_AS3())) {s = 60;}
						else if ( (LA32_2==UNDEFINED) && (synpred1_AS3())) {s = 61;}
						else if ( (LA32_2==LT) && (synpred1_AS3())) {s = 62;}
						else if ( (LA32_2==DIV) && (synpred1_AS3())) {s = 63;}
						else if ( (LA32_2==DECIMAL_LITERAL||LA32_2==FLOAT_LITERAL||LA32_2==HEX_LITERAL||LA32_2==OCTAL_LITERAL) ) {s = 64;}
						else if ( (LA32_2==STRING_LITERAL) && (synpred1_AS3())) {s = 65;}
						else if ( (LA32_2==TRUE) && (synpred1_AS3())) {s = 66;}
						else if ( (LA32_2==FALSE) && (synpred1_AS3())) {s = 67;}
						else if ( (LA32_2==NULL) && (synpred1_AS3())) {s = 68;}
						else if ( (LA32_2==LBRACK) && (synpred1_AS3())) {s = 69;}
						else if ( (LA32_2==FUNCTION) && (synpred1_AS3())) {s = 70;}
						else if ( (LA32_2==NEW) && (synpred1_AS3())) {s = 71;}
						else if ( (LA32_2==LPAREN) && (synpred1_AS3())) {s = 72;}
						else if ( (LA32_2==E4X_ATTRI) && (synpred1_AS3())) {s = 73;}
						else if ( (LA32_2==IDENT) ) {s = 74;}
						else if ( (LA32_2==INTERNAL||LA32_2==PRIVATE||(LA32_2 >= PROTECTED && LA32_2 <= PUBLIC)) && (synpred1_AS3())) {s = 75;}
						else if ( (LA32_2==USE) ) {s = 76;}
						else if ( (LA32_2==XML) ) {s = 77;}
						else if ( (LA32_2==DYNAMIC) ) {s = 78;}
						else if ( (LA32_2==NAMESPACE) ) {s = 79;}
						else if ( (LA32_2==IS) ) {s = 80;}
						else if ( (LA32_2==AS) ) {s = 81;}
						else if ( (LA32_2==GET) ) {s = 82;}
						else if ( (LA32_2==SET) ) {s = 83;}
						else if ( (LA32_2==IF) && (synpred1_AS3())) {s = 84;}
						else if ( (LA32_2==FOR) && (synpred1_AS3())) {s = 85;}
						else if ( (LA32_2==WHILE) && (synpred1_AS3())) {s = 86;}
						else if ( (LA32_2==DO) && (synpred1_AS3())) {s = 87;}
						else if ( (LA32_2==WITH) && (synpred1_AS3())) {s = 88;}
						else if ( (LA32_2==SWITCH) && (synpred1_AS3())) {s = 89;}
						else if ( (LA32_2==BREAK) && (synpred1_AS3())) {s = 90;}
						else if ( (LA32_2==CONTINUE) && (synpred1_AS3())) {s = 91;}
						else if ( (LA32_2==RETURN) && (synpred1_AS3())) {s = 92;}
						else if ( (LA32_2==THROW) && (synpred1_AS3())) {s = 93;}
						else if ( (LA32_2==TRY) && (synpred1_AS3())) {s = 94;}
						else if ( (LA32_2==DEFAULT) && (synpred1_AS3())) {s = 95;}
						else if ( (LA32_2==SEMI) && (synpred1_AS3())) {s = 96;}
						else if ( (LA32_2==RCURLY) ) {s = 97;}
						 
						input.seek(index32_2);
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA32_64 = input.LA(1);
						 
						int index32_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_AS3()) ) {s = 96;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index32_64);
						if ( s>=0 ) return s;
						break;
					case 2 : 
						int LA32_74 = input.LA(1);
						 
						int index32_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_AS3()) ) {s = 96;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index32_74);
						if ( s>=0 ) return s;
						break;
					case 3 : 
						int LA32_76 = input.LA(1);
						 
						int index32_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_AS3()) ) {s = 96;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index32_76);
						if ( s>=0 ) return s;
						break;
					case 4 : 
						int LA32_77 = input.LA(1);
						 
						int index32_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_AS3()) ) {s = 96;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index32_77);
						if ( s>=0 ) return s;
						break;
					case 5 : 
						int LA32_78 = input.LA(1);
						 
						int index32_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_AS3()) ) {s = 96;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index32_78);
						if ( s>=0 ) return s;
						break;
					case 6 : 
						int LA32_79 = input.LA(1);
						 
						int index32_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_AS3()) ) {s = 96;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index32_79);
						if ( s>=0 ) return s;
						break;
					case 7 : 
						int LA32_80 = input.LA(1);
						 
						int index32_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_AS3()) ) {s = 96;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index32_80);
						if ( s>=0 ) return s;
						break;
					case 8 : 
						int LA32_81 = input.LA(1);
						 
						int index32_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_AS3()) ) {s = 96;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index32_81);
						if ( s>=0 ) return s;
						break;
					case 9 : 
						int LA32_82 = input.LA(1);
						 
						int index32_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_AS3()) ) {s = 96;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index32_82);
						if ( s>=0 ) return s;
						break;
					case 10 : 
						int LA32_83 = input.LA(1);
						 
						int index32_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_AS3()) ) {s = 96;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index32_83);
						if ( s>=0 ) return s;
						break;
					case 11 : 
						int LA32_97 = input.LA(1);
						 
						int index32_97 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_AS3()) ) {s = 96;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index32_97);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 32, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA33_eotS =
		"\145\uffff";
	static final String DFA33_eofS =
		"\145\uffff";
	static final String DFA33_minS =
		"\1\13\1\0\143\uffff";
	static final String DFA33_maxS =
		"\1\u00b7\1\0\143\uffff";
	static final String DFA33_acceptS =
		"\2\uffff\1\2\141\uffff\1\1";
	static final String DFA33_specialS =
		"\1\uffff\1\0\143\uffff}>";
	static final String[] DFA33_transitionS = {
			"\1\2\4\uffff\1\2\3\uffff\1\2\4\uffff\1\2\7\uffff\2\2\2\uffff\3\2\1\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\2\2\7\uffff\1\1\6\uffff\1\2\2\uffff\2\2\5\uffff"+
			"\1\2\2\uffff\1\2\2\uffff\2\2\2\uffff\1\2\3\uffff\1\2\4\uffff\2\2\2\uffff"+
			"\2\2\1\uffff\1\2\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\1\2\3\uffff\1\2\5\uffff\1\2\5\uffff\1\2\2\uffff\2\2\2\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\2\2\12\uffff\3\2\1\uffff\4\2\5\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\1\uffff\1\2",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
	static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
	static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
	static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
	static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
	static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
	static final short[][] DFA33_transition;

	static {
		int numStates = DFA33_transitionS.length;
		DFA33_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
		}
	}

	protected class DFA33 extends DFA {

		public DFA33(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 33;
			this.eot = DFA33_eot;
			this.eof = DFA33_eof;
			this.min = DFA33_min;
			this.max = DFA33_max;
			this.accept = DFA33_accept;
			this.special = DFA33_special;
			this.transition = DFA33_transition;
		}
		@Override
		public String getDescription() {
			return "502:3: ( ( ELSE )=> elseClause )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA33_1 = input.LA(1);
						 
						int index33_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_AS3()) ) {s = 100;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index33_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 33, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA42_eotS =
		"\u0134\uffff";
	static final String DFA42_eofS =
		"\u0134\uffff";
	static final String DFA42_minS =
		"\13\13\31\uffff\12\0\35\uffff\1\0\34\uffff\1\0\34\uffff\1\0\34\uffff\1"+
		"\0\34\uffff\1\0\34\uffff\1\0\34\uffff\1\0\34\uffff\1\0\35\uffff";
	static final String DFA42_maxS =
		"\2\u00b7\11\u00be\31\uffff\12\0\35\uffff\1\0\34\uffff\1\0\34\uffff\1\0"+
		"\34\uffff\1\0\34\uffff\1\0\34\uffff\1\0\34\uffff\1\0\34\uffff\1\0\35\uffff";
	static final String DFA42_acceptS =
		"\13\uffff\1\2\u0127\uffff\1\1";
	static final String DFA42_specialS =
		"\44\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\35\uffff\1\12\34\uffff"+
		"\1\13\34\uffff\1\14\34\uffff\1\15\34\uffff\1\16\34\uffff\1\17\34\uffff"+
		"\1\20\34\uffff\1\21\35\uffff}>";
	static final String[] DFA42_transitionS = {
			"\1\10\4\uffff\1\13\20\uffff\1\1\3\uffff\2\13\2\uffff\2\13\3\uffff\1\5"+
			"\1\13\16\uffff\1\13\2\uffff\1\13\6\uffff\1\13\2\uffff\1\11\2\uffff\1"+
			"\13\1\2\6\uffff\1\13\4\uffff\1\13\1\7\2\uffff\2\13\1\uffff\1\13\2\uffff"+
			"\2\13\2\uffff\1\13\6\uffff\1\6\1\uffff\1\13\2\uffff\1\13\3\uffff\1\13"+
			"\5\uffff\1\13\5\uffff\1\13\2\uffff\2\13\7\uffff\1\13\1\12\12\uffff\1"+
			"\13\4\uffff\1\13\1\uffff\1\13\5\uffff\1\13\3\uffff\1\3\1\1\3\uffff\1"+
			"\13\3\uffff\1\4",
			"\1\52\42\uffff\1\47\34\uffff\1\53\3\uffff\1\44\14\uffff\1\51\23\uffff"+
			"\1\50\41\uffff\1\54\33\uffff\1\45\10\uffff\1\46",
			"\4\13\3\uffff\2\13\1\uffff\4\13\5\uffff\1\13\5\uffff\2\13\4\uffff\2"+
			"\13\1\uffff\1\13\5\uffff\1\13\5\uffff\1\13\20\uffff\1\13\1\uffff\1\13"+
			"\10\uffff\1\55\1\13\1\uffff\1\13\3\uffff\4\13\1\uffff\1\13\1\uffff\4"+
			"\13\2\uffff\2\13\1\uffff\1\13\1\uffff\1\13\5\uffff\1\13\12\uffff\2\13"+
			"\11\uffff\1\13\6\uffff\1\13\1\uffff\2\13\1\uffff\4\13\1\uffff\2\13\34"+
			"\uffff\1\13\4\uffff\1\13",
			"\4\13\3\uffff\2\13\1\uffff\4\13\5\uffff\1\13\6\uffff\1\13\4\uffff\2"+
			"\13\1\uffff\1\13\5\uffff\1\13\5\uffff\1\13\20\uffff\1\13\1\uffff\1\13"+
			"\10\uffff\1\113\1\13\1\uffff\1\13\3\uffff\4\13\1\uffff\1\13\1\uffff\4"+
			"\13\2\uffff\2\13\1\uffff\1\13\1\uffff\1\13\5\uffff\1\13\12\uffff\2\13"+
			"\11\uffff\1\13\6\uffff\1\13\1\uffff\2\13\1\uffff\4\13\1\uffff\2\13\34"+
			"\uffff\1\13\4\uffff\1\13",
			"\4\13\3\uffff\2\13\1\uffff\4\13\5\uffff\1\13\6\uffff\1\13\4\uffff\2"+
			"\13\1\uffff\1\13\5\uffff\1\13\5\uffff\1\13\20\uffff\1\13\1\uffff\1\13"+
			"\10\uffff\1\150\1\13\1\uffff\1\13\3\uffff\4\13\1\uffff\1\13\1\uffff\4"+
			"\13\2\uffff\2\13\1\uffff\1\13\1\uffff\1\13\5\uffff\1\13\12\uffff\2\13"+
			"\11\uffff\1\13\6\uffff\1\13\1\uffff\2\13\1\uffff\4\13\1\uffff\2\13\34"+
			"\uffff\1\13\4\uffff\1\13",
			"\4\13\3\uffff\2\13\1\uffff\4\13\5\uffff\1\13\6\uffff\1\13\4\uffff\2"+
			"\13\1\uffff\1\13\5\uffff\1\13\5\uffff\1\13\20\uffff\1\13\1\uffff\1\13"+
			"\10\uffff\1\u0085\1\13\1\uffff\1\13\3\uffff\4\13\1\uffff\1\13\1\uffff"+
			"\4\13\2\uffff\2\13\1\uffff\1\13\1\uffff\1\13\5\uffff\1\13\12\uffff\2"+
			"\13\11\uffff\1\13\6\uffff\1\13\1\uffff\2\13\1\uffff\4\13\1\uffff\2\13"+
			"\34\uffff\1\13\4\uffff\1\13",
			"\4\13\3\uffff\2\13\1\uffff\4\13\5\uffff\1\13\6\uffff\1\13\4\uffff\2"+
			"\13\1\uffff\1\13\5\uffff\1\13\5\uffff\1\13\20\uffff\1\13\1\uffff\1\13"+
			"\10\uffff\1\u00a2\1\13\1\uffff\1\13\3\uffff\4\13\1\uffff\1\13\1\uffff"+
			"\4\13\2\uffff\2\13\1\uffff\1\13\1\uffff\1\13\5\uffff\1\13\12\uffff\2"+
			"\13\11\uffff\1\13\6\uffff\1\13\1\uffff\2\13\1\uffff\4\13\1\uffff\2\13"+
			"\34\uffff\1\13\4\uffff\1\13",
			"\4\13\3\uffff\2\13\1\uffff\4\13\5\uffff\1\13\6\uffff\1\13\4\uffff\2"+
			"\13\1\uffff\1\13\5\uffff\1\13\5\uffff\1\13\20\uffff\1\13\1\uffff\1\13"+
			"\10\uffff\1\u00bf\1\13\1\uffff\1\13\3\uffff\4\13\1\uffff\1\13\1\uffff"+
			"\4\13\2\uffff\2\13\1\uffff\1\13\1\uffff\1\13\5\uffff\1\13\12\uffff\2"+
			"\13\11\uffff\1\13\6\uffff\1\13\1\uffff\2\13\1\uffff\4\13\1\uffff\2\13"+
			"\34\uffff\1\13\4\uffff\1\13",
			"\4\13\3\uffff\2\13\1\uffff\4\13\5\uffff\1\13\6\uffff\1\13\4\uffff\2"+
			"\13\1\uffff\1\13\5\uffff\1\13\5\uffff\1\13\20\uffff\1\13\1\uffff\1\13"+
			"\10\uffff\1\u00dc\1\13\1\uffff\1\13\3\uffff\4\13\1\uffff\1\13\1\uffff"+
			"\4\13\2\uffff\2\13\1\uffff\1\13\1\uffff\1\13\5\uffff\1\13\12\uffff\2"+
			"\13\11\uffff\1\13\6\uffff\1\13\1\uffff\2\13\1\uffff\4\13\1\uffff\2\13"+
			"\34\uffff\1\13\4\uffff\1\13",
			"\4\13\3\uffff\2\13\1\uffff\4\13\5\uffff\1\13\6\uffff\1\13\4\uffff\2"+
			"\13\1\uffff\1\13\5\uffff\1\13\5\uffff\1\13\20\uffff\1\13\1\uffff\1\13"+
			"\10\uffff\1\u00f9\1\13\1\uffff\1\13\3\uffff\4\13\1\uffff\1\13\1\uffff"+
			"\4\13\2\uffff\2\13\1\uffff\1\13\1\uffff\1\13\5\uffff\1\13\12\uffff\2"+
			"\13\11\uffff\1\13\6\uffff\1\13\1\uffff\2\13\1\uffff\4\13\1\uffff\2\13"+
			"\34\uffff\1\13\4\uffff\1\13",
			"\4\13\3\uffff\2\13\1\uffff\4\13\5\uffff\1\13\6\uffff\1\13\4\uffff\2"+
			"\13\1\uffff\1\13\5\uffff\1\13\5\uffff\1\13\20\uffff\1\13\1\uffff\1\13"+
			"\10\uffff\1\u0116\1\13\1\uffff\1\13\3\uffff\4\13\1\uffff\1\13\1\uffff"+
			"\4\13\2\uffff\2\13\1\uffff\1\13\1\uffff\1\13\5\uffff\1\13\12\uffff\2"+
			"\13\11\uffff\1\13\6\uffff\1\13\1\uffff\2\13\1\uffff\4\13\1\uffff\2\13"+
			"\34\uffff\1\13\4\uffff\1\13",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
	static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
	static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
	static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
	static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
	static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
	static final short[][] DFA42_transition;

	static {
		int numStates = DFA42_transitionS.length;
		DFA42_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
		}
	}

	protected class DFA42 extends DFA {

		public DFA42(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 42;
			this.eot = DFA42_eot;
			this.eof = DFA42_eof;
			this.min = DFA42_min;
			this.max = DFA42_max;
			this.accept = DFA42_accept;
			this.special = DFA42_special;
			this.transition = DFA42_transition;
		}
		@Override
		public String getDescription() {
			return "586:3: ( ( forInClauseDecl IN )=> forInClause RPAREN statement -> ^( FOR_IN[$f] forInClause statement ) | traditionalForClause RPAREN statement -> ^( $f traditionalForClause statement ) )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA42_36 = input.LA(1);
						 
						int index42_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_36);
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA42_37 = input.LA(1);
						 
						int index42_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_37);
						if ( s>=0 ) return s;
						break;
					case 2 : 
						int LA42_38 = input.LA(1);
						 
						int index42_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_38);
						if ( s>=0 ) return s;
						break;
					case 3 : 
						int LA42_39 = input.LA(1);
						 
						int index42_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_39);
						if ( s>=0 ) return s;
						break;
					case 4 : 
						int LA42_40 = input.LA(1);
						 
						int index42_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_40);
						if ( s>=0 ) return s;
						break;
					case 5 : 
						int LA42_41 = input.LA(1);
						 
						int index42_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_41);
						if ( s>=0 ) return s;
						break;
					case 6 : 
						int LA42_42 = input.LA(1);
						 
						int index42_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_42);
						if ( s>=0 ) return s;
						break;
					case 7 : 
						int LA42_43 = input.LA(1);
						 
						int index42_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_43);
						if ( s>=0 ) return s;
						break;
					case 8 : 
						int LA42_44 = input.LA(1);
						 
						int index42_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_44);
						if ( s>=0 ) return s;
						break;
					case 9 : 
						int LA42_45 = input.LA(1);
						 
						int index42_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_45);
						if ( s>=0 ) return s;
						break;
					case 10 : 
						int LA42_75 = input.LA(1);
						 
						int index42_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_75);
						if ( s>=0 ) return s;
						break;
					case 11 : 
						int LA42_104 = input.LA(1);
						 
						int index42_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_104);
						if ( s>=0 ) return s;
						break;
					case 12 : 
						int LA42_133 = input.LA(1);
						 
						int index42_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_133);
						if ( s>=0 ) return s;
						break;
					case 13 : 
						int LA42_162 = input.LA(1);
						 
						int index42_162 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_162);
						if ( s>=0 ) return s;
						break;
					case 14 : 
						int LA42_191 = input.LA(1);
						 
						int index42_191 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_191);
						if ( s>=0 ) return s;
						break;
					case 15 : 
						int LA42_220 = input.LA(1);
						 
						int index42_220 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_220);
						if ( s>=0 ) return s;
						break;
					case 16 : 
						int LA42_249 = input.LA(1);
						 
						int index42_249 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_249);
						if ( s>=0 ) return s;
						break;
					case 17 : 
						int LA42_278 = input.LA(1);
						 
						int index42_278 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_AS3()) ) {s = 307;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index42_278);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 42, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA52_eotS =
		"\u0160\uffff";
	static final String DFA52_eofS =
		"\u0160\uffff";
	static final String DFA52_minS =
		"\13\13\u0155\uffff";
	static final String DFA52_maxS =
		"\1\u00b7\12\u00be\u0155\uffff";
	static final String DFA52_acceptS =
		"\13\uffff\1\2\1\1\u0153\uffff";
	static final String DFA52_specialS =
		"\u0160\uffff}>";
	static final String[] DFA52_transitionS = {
			"\1\10\42\uffff\1\5\34\uffff\1\11\3\uffff\1\2\13\uffff\1\13\1\7\23\uffff"+
			"\1\6\24\uffff\1\13\2\uffff\2\13\10\uffff\1\12\5\uffff\1\1\25\uffff\1"+
			"\3\10\uffff\1\4",
			"\4\14\3\uffff\2\14\1\uffff\4\14\4\uffff\2\14\5\uffff\1\13\1\14\4\uffff"+
			"\2\14\1\uffff\1\14\5\uffff\1\14\5\uffff\1\14\20\uffff\1\14\1\uffff\1"+
			"\14\10\uffff\2\14\1\uffff\1\14\3\uffff\4\14\1\uffff\1\14\1\uffff\4\14"+
			"\2\uffff\2\14\1\uffff\1\14\1\uffff\1\14\5\uffff\1\14\12\uffff\2\14\11"+
			"\uffff\3\14\3\uffff\2\14\1\uffff\2\14\1\uffff\4\14\1\uffff\2\14\34\uffff"+
			"\1\14\4\uffff\1\14",
			"\4\14\3\uffff\2\14\1\uffff\4\14\4\uffff\2\14\5\uffff\1\13\1\14\4\uffff"+
			"\2\14\1\uffff\1\14\5\uffff\1\14\5\uffff\1\14\20\uffff\1\14\1\uffff\1"+
			"\14\10\uffff\2\14\1\uffff\1\14\3\uffff\4\14\1\uffff\1\14\1\uffff\4\14"+
			"\2\uffff\2\14\1\uffff\1\14\1\uffff\1\14\5\uffff\1\14\12\uffff\2\14\11"+
			"\uffff\3\14\3\uffff\2\14\1\uffff\2\14\1\uffff\4\14\1\uffff\2\14\34\uffff"+
			"\1\14\4\uffff\1\14",
			"\4\14\3\uffff\2\14\1\uffff\4\14\4\uffff\2\14\5\uffff\1\13\1\14\4\uffff"+
			"\2\14\1\uffff\1\14\5\uffff\1\14\5\uffff\1\14\20\uffff\1\14\1\uffff\1"+
			"\14\10\uffff\2\14\1\uffff\1\14\3\uffff\4\14\1\uffff\1\14\1\uffff\4\14"+
			"\2\uffff\2\14\1\uffff\1\14\1\uffff\1\14\5\uffff\1\14\12\uffff\2\14\11"+
			"\uffff\3\14\3\uffff\2\14\1\uffff\2\14\1\uffff\4\14\1\uffff\2\14\34\uffff"+
			"\1\14\4\uffff\1\14",
			"\4\14\3\uffff\2\14\1\uffff\4\14\4\uffff\2\14\5\uffff\1\13\1\14\4\uffff"+
			"\2\14\1\uffff\1\14\5\uffff\1\14\5\uffff\1\14\20\uffff\1\14\1\uffff\1"+
			"\14\10\uffff\2\14\1\uffff\1\14\3\uffff\4\14\1\uffff\1\14\1\uffff\4\14"+
			"\2\uffff\2\14\1\uffff\1\14\1\uffff\1\14\5\uffff\1\14\12\uffff\2\14\11"+
			"\uffff\3\14\3\uffff\2\14\1\uffff\2\14\1\uffff\4\14\1\uffff\2\14\34\uffff"+
			"\1\14\4\uffff\1\14",
			"\4\14\3\uffff\2\14\1\uffff\4\14\4\uffff\2\14\5\uffff\1\13\1\14\4\uffff"+
			"\2\14\1\uffff\1\14\5\uffff\1\14\5\uffff\1\14\20\uffff\1\14\1\uffff\1"+
			"\14\10\uffff\2\14\1\uffff\1\14\3\uffff\4\14\1\uffff\1\14\1\uffff\4\14"+
			"\2\uffff\2\14\1\uffff\1\14\1\uffff\1\14\5\uffff\1\14\12\uffff\2\14\11"+
			"\uffff\3\14\3\uffff\2\14\1\uffff\2\14\1\uffff\4\14\1\uffff\2\14\34\uffff"+
			"\1\14\4\uffff\1\14",
			"\4\14\3\uffff\2\14\1\uffff\4\14\4\uffff\2\14\5\uffff\1\13\1\14\4\uffff"+
			"\2\14\1\uffff\1\14\5\uffff\1\14\5\uffff\1\14\20\uffff\1\14\1\uffff\1"+
			"\14\10\uffff\2\14\1\uffff\1\14\3\uffff\4\14\1\uffff\1\14\1\uffff\4\14"+
			"\2\uffff\2\14\1\uffff\1\14\1\uffff\1\14\5\uffff\1\14\12\uffff\2\14\11"+
			"\uffff\3\14\3\uffff\2\14\1\uffff\2\14\1\uffff\4\14\1\uffff\2\14\34\uffff"+
			"\1\14\4\uffff\1\14",
			"\4\14\3\uffff\2\14\1\uffff\4\14\4\uffff\2\14\5\uffff\1\13\1\14\4\uffff"+
			"\2\14\1\uffff\1\14\5\uffff\1\14\5\uffff\1\14\20\uffff\1\14\1\uffff\1"+
			"\14\10\uffff\2\14\1\uffff\1\14\3\uffff\4\14\1\uffff\1\14\1\uffff\4\14"+
			"\2\uffff\2\14\1\uffff\1\14\1\uffff\1\14\5\uffff\1\14\12\uffff\2\14\11"+
			"\uffff\3\14\3\uffff\2\14\1\uffff\2\14\1\uffff\4\14\1\uffff\2\14\34\uffff"+
			"\1\14\4\uffff\1\14",
			"\4\14\3\uffff\2\14\1\uffff\4\14\4\uffff\2\14\5\uffff\1\13\1\14\4\uffff"+
			"\2\14\1\uffff\1\14\5\uffff\1\14\5\uffff\1\14\20\uffff\1\14\1\uffff\1"+
			"\14\10\uffff\2\14\1\uffff\1\14\3\uffff\4\14\1\uffff\1\14\1\uffff\4\14"+
			"\2\uffff\2\14\1\uffff\1\14\1\uffff\1\14\5\uffff\1\14\12\uffff\2\14\11"+
			"\uffff\3\14\3\uffff\2\14\1\uffff\2\14\1\uffff\4\14\1\uffff\2\14\34\uffff"+
			"\1\14\4\uffff\1\14",
			"\4\14\3\uffff\2\14\1\uffff\4\14\4\uffff\2\14\5\uffff\1\13\1\14\4\uffff"+
			"\2\14\1\uffff\1\14\5\uffff\1\14\5\uffff\1\14\20\uffff\1\14\1\uffff\1"+
			"\14\10\uffff\2\14\1\uffff\1\14\3\uffff\4\14\1\uffff\1\14\1\uffff\4\14"+
			"\2\uffff\2\14\1\uffff\1\14\1\uffff\1\14\5\uffff\1\14\12\uffff\2\14\11"+
			"\uffff\3\14\3\uffff\2\14\1\uffff\2\14\1\uffff\4\14\1\uffff\2\14\34\uffff"+
			"\1\14\4\uffff\1\14",
			"\4\14\3\uffff\2\14\1\uffff\4\14\4\uffff\2\14\5\uffff\1\13\1\14\4\uffff"+
			"\2\14\1\uffff\1\14\5\uffff\1\14\5\uffff\1\14\20\uffff\1\14\1\uffff\1"+
			"\14\10\uffff\2\14\1\uffff\1\14\3\uffff\4\14\1\uffff\1\14\1\uffff\4\14"+
			"\2\uffff\2\14\1\uffff\1\14\1\uffff\1\14\5\uffff\1\14\12\uffff\2\14\11"+
			"\uffff\3\14\3\uffff\2\14\1\uffff\2\14\1\uffff\4\14\1\uffff\2\14\34\uffff"+
			"\1\14\4\uffff\1\14",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
	static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
	static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
	static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
	static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
	static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
	static final short[][] DFA52_transition;

	static {
		int numStates = DFA52_transitionS.length;
		DFA52_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
		}
	}

	protected class DFA52 extends DFA {

		public DFA52(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 52;
			this.eot = DFA52_eot;
			this.eof = DFA52_eof;
			this.min = DFA52_min;
			this.max = DFA52_max;
			this.accept = DFA52_accept;
			this.special = DFA52_special;
			this.transition = DFA52_transition;
		}
		@Override
		public String getDescription() {
			return "691:1: simpleQualifiedIdentifier : ( propertyIdentifier | qualifier DBL_COLON ^ ( propertyIdentifier | brackets ) );";
		}
	}

	static final String DFA97_eotS =
		"\105\uffff";
	static final String DFA97_eofS =
		"\105\uffff";
	static final String DFA97_minS =
		"\1\13\1\0\103\uffff";
	static final String DFA97_maxS =
		"\1\u00be\1\0\103\uffff";
	static final String DFA97_acceptS =
		"\2\uffff\1\2\101\uffff\1\1";
	static final String DFA97_specialS =
		"\1\uffff\1\0\103\uffff}>";
	static final String[] DFA97_transitionS = {
			"\4\2\3\uffff\2\2\1\uffff\4\2\4\uffff\2\2\6\uffff\1\2\4\uffff\2\2\1\uffff"+
			"\1\2\5\uffff\1\2\5\uffff\1\2\20\uffff\1\2\1\uffff\1\2\10\uffff\2\2\1"+
			"\uffff\1\2\3\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\1\1\2\2\uffff\2\2\1"+
			"\uffff\1\2\1\uffff\1\2\5\uffff\1\2\12\uffff\2\2\11\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\2\2\1\uffff\4\2\1\uffff\2\2\34\uffff\1\2\4\uffff\1\2",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA97_eot = DFA.unpackEncodedString(DFA97_eotS);
	static final short[] DFA97_eof = DFA.unpackEncodedString(DFA97_eofS);
	static final char[] DFA97_min = DFA.unpackEncodedStringToUnsignedChars(DFA97_minS);
	static final char[] DFA97_max = DFA.unpackEncodedStringToUnsignedChars(DFA97_maxS);
	static final short[] DFA97_accept = DFA.unpackEncodedString(DFA97_acceptS);
	static final short[] DFA97_special = DFA.unpackEncodedString(DFA97_specialS);
	static final short[][] DFA97_transition;

	static {
		int numStates = DFA97_transitionS.length;
		DFA97_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA97_transition[i] = DFA.unpackEncodedString(DFA97_transitionS[i]);
		}
	}

	protected class DFA97 extends DFA {

		public DFA97(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 97;
			this.eot = DFA97_eot;
			this.eof = DFA97_eof;
			this.min = DFA97_min;
			this.max = DFA97_max;
			this.accept = DFA97_accept;
			this.special = DFA97_special;
			this.transition = DFA97_transition;
		}
		@Override
		public String getDescription() {
			return "1133:30: ( ( LPAREN )=> arguments )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA97_1 = input.LA(1);
						 
						int index97_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred6_AS3()) ) {s = 68;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index97_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 97, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA98_eotS =
		"\122\uffff";
	static final String DFA98_eofS =
		"\122\uffff";
	static final String DFA98_minS =
		"\1\13\1\uffff\2\0\116\uffff";
	static final String DFA98_maxS =
		"\1\u00be\1\uffff\2\0\116\uffff";
	static final String DFA98_acceptS =
		"\1\uffff\1\3\55\uffff\1\1\41\uffff\1\2";
	static final String DFA98_specialS =
		"\2\uffff\1\0\1\1\116\uffff}>";
	static final String[] DFA98_transitionS = {
			"\4\1\3\uffff\2\1\1\uffff\4\1\4\uffff\2\1\6\uffff\1\1\4\uffff\2\1\1\uffff"+
			"\1\2\5\uffff\1\1\5\uffff\1\1\20\uffff\1\1\1\uffff\1\1\10\uffff\2\1\1"+
			"\uffff\1\1\3\uffff\3\1\1\3\1\uffff\1\1\1\uffff\4\1\2\uffff\2\1\1\uffff"+
			"\1\1\1\uffff\1\1\5\uffff\1\1\12\uffff\2\1\11\uffff\3\1\3\uffff\2\1\1"+
			"\uffff\2\1\1\uffff\4\1\1\uffff\2\1\34\uffff\1\1\4\uffff\1\1",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA98_eot = DFA.unpackEncodedString(DFA98_eotS);
	static final short[] DFA98_eof = DFA.unpackEncodedString(DFA98_eofS);
	static final char[] DFA98_min = DFA.unpackEncodedStringToUnsignedChars(DFA98_minS);
	static final char[] DFA98_max = DFA.unpackEncodedStringToUnsignedChars(DFA98_maxS);
	static final short[] DFA98_accept = DFA.unpackEncodedString(DFA98_acceptS);
	static final short[] DFA98_special = DFA.unpackEncodedString(DFA98_specialS);
	static final short[][] DFA98_transition;

	static {
		int numStates = DFA98_transitionS.length;
		DFA98_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA98_transition[i] = DFA.unpackEncodedString(DFA98_transitionS[i]);
		}
	}

	protected class DFA98 extends DFA {

		public DFA98(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 98;
			this.eot = DFA98_eot;
			this.eof = DFA98_eof;
			this.min = DFA98_min;
			this.max = DFA98_max;
			this.accept = DFA98_accept;
			this.special = DFA98_special;
			this.transition = DFA98_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 1139:3: ( ( DOT )=>d= DOT qualifiedIdent -> ^( PROPERTY_OR_IDENTIFIER[$d] $fullNewSubexpression qualifiedIdent ) | ( LBRACK )=> brackets -> ^( ARRAY_ACC $fullNewSubexpression brackets ) )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA98_2 = input.LA(1);
						 
						int index98_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_AS3()) ) {s = 47;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index98_2);
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA98_3 = input.LA(1);
						 
						int index98_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred8_AS3()) ) {s = 81;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index98_3);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 98, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_as2CompilationUnit_in_compilationUnit288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_as3CompilationUnit_in_compilationUnit294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_importDefinition_in_as2CompilationUnit321 = new BitSet(new long[]{0x8000400008000000L,0x080000008A108000L,0x3C00000004000320L});
	public static final BitSet FOLLOW_as2Type_in_as2CompilationUnit326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotations_in_as2Type339 = new BitSet(new long[]{0x8000400008000000L,0x080000000A008000L,0x2C00000004000320L});
	public static final BitSet FOLLOW_modifiers_in_as2Type348 = new BitSet(new long[]{0x0000000008000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_as2ClassDefinition_in_as2Type354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_as2InterfaceDefinition_in_as2Type360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_packageDecl_in_as3CompilationUnit375 = new BitSet(new long[]{0x8000400208000000L,0x080100008A108100L,0x3C00C00004020320L});
	public static final BitSet FOLLOW_packageBlockEntry_in_as3CompilationUnit379 = new BitSet(new long[]{0x8000400208000000L,0x080100008A108100L,0x3C00C00004020320L});
	public static final BitSet FOLLOW_EOF_in_as3CompilationUnit384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKAGE_in_packageDecl396 = new BitSet(new long[]{0x0000400000000800L,0x0001000118008800L,0x0080400000040320L});
	public static final BitSet FOLLOW_identifier_in_packageDecl399 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_packageBlock_in_packageDecl404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_packageBlock415 = new BitSet(new long[]{0x8000400208000000L,0x080100008A108100L,0x3C00C00004021320L});
	public static final BitSet FOLLOW_packageBlockEntry_in_packageBlock419 = new BitSet(new long[]{0x8000400208000000L,0x080100008A108100L,0x3C00C00004021320L});
	public static final BitSet FOLLOW_RCURLY_in_packageBlock424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_importDefinition_in_packageBlockEntry448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotations_in_packageBlockEntry457 = new BitSet(new long[]{0x8000400208000000L,0x080100000A008100L,0x2C00C00004000320L});
	public static final BitSet FOLLOW_modifiers_in_packageBlockEntry467 = new BitSet(new long[]{0x0000000208000000L,0x0001000002000100L,0x0000C00000000000L});
	public static final BitSet FOLLOW_classDefinition_in_packageBlockEntry477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDefinition_in_packageBlockEntry485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDefinition_in_packageBlockEntry493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDefinition_in_packageBlockEntry501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceDefinition_in_packageBlockEntry509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useNamespaceDirective_in_packageBlockEntry517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_packageBlockEntry528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOF_in_endOfFile545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_importDefinition557 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_identifierStar_in_importDefinition560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_importDefinition562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_semi573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classDefinition588 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_ident_in_classDefinition590 = new BitSet(new long[]{0x2000000000000000L,0x0000000100080000L});
	public static final BitSet FOLLOW_classExtendsClause_in_classDefinition594 = new BitSet(new long[]{0x0000000000000000L,0x0000000100080000L});
	public static final BitSet FOLLOW_implementsClause_in_classDefinition598 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_typeBlock_in_classDefinition602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_as2ClassDefinition634 = new BitSet(new long[]{0x0000400000000800L,0x0001000018008800L,0x0080400000040320L});
	public static final BitSet FOLLOW_identifier_in_as2ClassDefinition636 = new BitSet(new long[]{0x2000000000000000L,0x0000000100080000L});
	public static final BitSet FOLLOW_classExtendsClause_in_as2ClassDefinition640 = new BitSet(new long[]{0x0000000000000000L,0x0000000100080000L});
	public static final BitSet FOLLOW_implementsClause_in_as2ClassDefinition644 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_typeBlock_in_as2ClassDefinition648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERFACE_in_interfaceDefinition684 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_ident_in_interfaceDefinition686 = new BitSet(new long[]{0x2000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_interfaceExtendsClause_in_interfaceDefinition690 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_typeBlock_in_interfaceDefinition694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERFACE_in_as2InterfaceDefinition724 = new BitSet(new long[]{0x0000400000000800L,0x0001000018008800L,0x0080400000040320L});
	public static final BitSet FOLLOW_identifier_in_as2InterfaceDefinition726 = new BitSet(new long[]{0x2000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_interfaceExtendsClause_in_as2InterfaceDefinition730 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_typeBlock_in_as2InterfaceDefinition734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_classExtendsClause764 = new BitSet(new long[]{0x0000400000000800L,0x0001000018008800L,0x0080400000040320L});
	public static final BitSet FOLLOW_identifier_in_classExtendsClause767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_interfaceExtendsClause780 = new BitSet(new long[]{0x0000400000000800L,0x0001000018008800L,0x0080400000040320L});
	public static final BitSet FOLLOW_identifier_in_interfaceExtendsClause783 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_interfaceExtendsClause787 = new BitSet(new long[]{0x0000400000000800L,0x0001000018008800L,0x0080400000040320L});
	public static final BitSet FOLLOW_identifier_in_interfaceExtendsClause790 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_IMPLEMENTS_in_implementsClause805 = new BitSet(new long[]{0x0000400000000800L,0x0001000018008800L,0x0080400000040320L});
	public static final BitSet FOLLOW_identifier_in_implementsClause808 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_implementsClause812 = new BitSet(new long[]{0x0000400000000800L,0x0001000018008800L,0x0080400000040320L});
	public static final BitSet FOLLOW_identifier_in_implementsClause815 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LCURLY_in_typeBlock829 = new BitSet(new long[]{0x8000400200000000L,0x0800000088908100L,0x3C00800004001320L});
	public static final BitSet FOLLOW_typeBlockEntry_in_typeBlock833 = new BitSet(new long[]{0x8000400200000000L,0x0800000088908100L,0x3C00800004001320L});
	public static final BitSet FOLLOW_RCURLY_in_typeBlock838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotations_in_typeBlockEntry864 = new BitSet(new long[]{0x8000400200000000L,0x0800000008008100L,0x2C00800004000320L});
	public static final BitSet FOLLOW_modifiers_in_typeBlockEntry873 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000100L,0x0000800000000000L});
	public static final BitSet FOLLOW_variableDefinition_in_typeBlockEntry882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDefinition_in_typeBlockEntry889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_importDefinition_in_typeBlockEntry899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_as2IncludeDirective_in_typeBlockEntry904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_DIRECTIVE_in_as2IncludeDirective916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_as2IncludeDirective920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_188_in_includeDirective931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_includeDirective935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_includeDirective939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_methodDefinition956 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_optionalAccessorRole_in_methodDefinition962 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_ident_in_methodDefinition969 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_parameterDeclarationList_in_methodDefinition973 = new BitSet(new long[]{0x0000000020000000L,0x0000000100000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_typeExpression_in_methodDefinition977 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_block_in_methodDefinition983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_semi_in_methodDefinition985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorRole_in_optionalAccessorRole1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMESPACE_in_namespaceDefinition1090 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_ident_in_namespaceDefinition1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_useNamespaceDirective1119 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_NAMESPACE_in_useNamespaceDirective1121 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_ident_in_useNamespaceDirective1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_useNamespaceDirective1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varOrConst_in_variableDefinition1149 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDefinition1151 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_COMMA_in_variableDefinition1156 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDefinition1158 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_variableDefinition1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_variableDeclarator1208 = new BitSet(new long[]{0x0000000020001002L});
	public static final BitSet FOLLOW_typeExpression_in_variableDeclarator1211 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varOrConst_in_declaration1225 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_variableDeclarator_in_declaration1228 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_declarationTail_in_declaration1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_declarationTail1254 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_variableDeclarator_in_declarationTail1257 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ASSIGN_in_variableInitializer1270 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_assignmentExpression_in_variableInitializer1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parameterDeclarationList1286 = new BitSet(new long[]{0x0000400200000800L,0x0001000010008800L,0x0080400000054000L});
	public static final BitSet FOLLOW_parameterDeclaration_in_parameterDeclarationList1292 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_parameterDeclarationList1298 = new BitSet(new long[]{0x0000400200000800L,0x0001000010008800L,0x0080400000044000L});
	public static final BitSet FOLLOW_parameterDeclaration_in_parameterDeclarationList1300 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RPAREN_in_parameterDeclarationList1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basicParameterDeclaration_in_parameterDeclaration1334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameterRestDeclaration_in_parameterDeclaration1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_basicParameterDeclaration1349 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_ident_in_basicParameterDeclaration1352 = new BitSet(new long[]{0x0000000020001002L});
	public static final BitSet FOLLOW_typeExpression_in_basicParameterDeclaration1354 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_parameterDefault_in_basicParameterDeclaration1357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_parameterDefault1401 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_assignmentExpression_in_parameterDefault1404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REST_in_parameterRestDeclaration1415 = new BitSet(new long[]{0x0000400000000802L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_ident_in_parameterRestDeclaration1417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_block1441 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0069320L});
	public static final BitSet FOLLOW_blockEntry_in_block1443 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0069320L});
	public static final BitSet FOLLOW_RCURLY_in_block1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_blockEntry1470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_condition1481 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_expression_in_condition1483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RPAREN_in_condition1485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_superStatement_in_statement1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement1516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationStatement_in_statement1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionStatement_in_statement1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forEachStatement_in_statement1538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement1551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileStatement_in_statement1559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withStatement_in_statement1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchStatement_in_statement1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breakStatement_in_statement1586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continueStatement_in_statement1594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStatement_in_statement1602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwStatement_in_statement1610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryStatement_in_statement1619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_defaultXMLNamespaceStatement_in_statement1628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_statement1636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_in_superStatement1648 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_arguments_in_superStatement1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_superStatement1653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarationStatement1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_declarationStatement1676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_expressionStatement1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_expressionStatement1699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement1721 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_condition_in_ifStatement1724 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0068320L});
	public static final BitSet FOLLOW_statement_in_ifStatement1726 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_elseClause_in_ifStatement1735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_elseClause1748 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0068320L});
	public static final BitSet FOLLOW_statement_in_elseClause1751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROW_in_throwStatement1762 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_expression_in_throwStatement1765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_throwStatement1767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_in_tryStatement1779 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_block_in_tryStatement1783 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_finallyBlock_in_tryStatement1788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catchBlock_in_tryStatement1793 = new BitSet(new long[]{0x0000000004000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_finallyBlock_in_tryStatement1798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CATCH_in_catchBlock1829 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchBlock1831 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_ident_in_catchBlock1833 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_typeExpression_in_catchBlock1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RPAREN_in_catchBlock1838 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_block_in_catchBlock1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINALLY_in_finallyBlock1868 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_block_in_finallyBlock1871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnStatement1882 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420060320L});
	public static final BitSet FOLLOW_expression_in_returnStatement1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_returnStatement1888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_continueStatement1901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_continueStatement1904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_breakStatement1915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_breakStatement1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_switchStatement1929 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_condition_in_switchStatement1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_switchBlock_in_switchStatement1936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_switchBlock1947 = new BitSet(new long[]{0x0000008002000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_caseStatement_in_switchBlock1952 = new BitSet(new long[]{0x0000008002000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_defaultStatement_in_switchBlock1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RCURLY_in_switchBlock1965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_caseStatement1990 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_expression_in_caseStatement1993 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_caseStatement1995 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0068320L});
	public static final BitSet FOLLOW_switchStatementList_in_caseStatement2000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_defaultStatement2014 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_defaultStatement2017 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0068320L});
	public static final BitSet FOLLOW_switchStatementList_in_defaultStatement2022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_switchStatementList2035 = new BitSet(new long[]{0x4000D6E600110802L,0x822502659844C906L,0x00B8C41EE0068320L});
	public static final BitSet FOLLOW_FOR_in_forEachStatement2058 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EACH_in_forEachStatement2060 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_forEachStatement2064 = new BitSet(new long[]{0x0000400200000800L,0x0001000010008800L,0x0080C00000040000L});
	public static final BitSet FOLLOW_forInClause_in_forEachStatement2068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RPAREN_in_forEachStatement2072 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0068320L});
	public static final BitSet FOLLOW_statement_in_forEachStatement2076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStatement2112 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_forStatement2116 = new BitSet(new long[]{0x4000C66200010800L,0x822502659840C902L,0x0088C41420060320L});
	public static final BitSet FOLLOW_forInClause_in_forStatement2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RPAREN_in_forStatement2130 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0068320L});
	public static final BitSet FOLLOW_statement_in_forStatement2132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_traditionalForClause_in_forStatement2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RPAREN_in_forStatement2155 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0068320L});
	public static final BitSet FOLLOW_statement_in_forStatement2157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_traditionalForClause2188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SEMI_in_traditionalForClause2192 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420060320L});
	public static final BitSet FOLLOW_forCond_in_traditionalForClause2200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SEMI_in_traditionalForClause2204 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_forIter_in_traditionalForClause2212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInClauseDecl_in_forInClause2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_IN_in_forInClause2229 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_forInClauseTail_in_forInClause2232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_forInClauseDecl2253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_forInClauseDecl2257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInClauseTail2279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_forInit2303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit2307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forCond2345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forIter2378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement2401 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_condition_in_whileStatement2404 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0068320L});
	public static final BitSet FOLLOW_statement_in_whileStatement2406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_doWhileStatement2417 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0068320L});
	public static final BitSet FOLLOW_statement_in_doWhileStatement2420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_WHILE_in_doWhileStatement2422 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_condition_in_doWhileStatement2425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_doWhileStatement2427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_withStatement2438 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_condition_in_withStatement2441 = new BitSet(new long[]{0x4000D6E600110800L,0x822502659844C906L,0x00B8C41EE0068320L});
	public static final BitSet FOLLOW_statement_in_withStatement2443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_defaultXMLNamespaceStatement2454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_XML_in_defaultXMLNamespaceStatement2456 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_NAMESPACE_in_defaultXMLNamespaceStatement2458 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ASSIGN_in_defaultXMLNamespaceStatement2460 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_expression_in_defaultXMLNamespaceStatement2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_semi_in_defaultXMLNamespaceStatement2464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_typeExpression2487 = new BitSet(new long[]{0x0000400000000800L,0x0001000018008800L,0x0088400001040320L});
	public static final BitSet FOLLOW_identifier_in_typeExpression2495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_typeExpression2499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_typeExpression2503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedIdent_in_identifier2538 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_propOrIdent_in_identifier2566 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_STAR_in_propertyIdentifier2599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_propertyIdentifier2604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyIdentifier_in_qualifier2617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedNamespace_in_qualifier2621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyIdentifier_in_simpleQualifiedIdentifier2634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifier_in_simpleQualifiedIdentifier2639 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_DBL_COLON_in_simpleQualifiedIdentifier2641 = new BitSet(new long[]{0x0000400000000800L,0x0001000090008800L,0x0080400001040000L});
	public static final BitSet FOLLOW_propertyIdentifier_in_simpleQualifiedIdentifier2648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_brackets_in_simpleQualifiedIdentifier2655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_encapsulatedExpression_in_expressionQualifiedIdentifier2670 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_DBL_COLON_in_expressionQualifiedIdentifier2672 = new BitSet(new long[]{0x0000400000000800L,0x0001000090008800L,0x0080400001040000L});
	public static final BitSet FOLLOW_propertyIdentifier_in_expressionQualifiedIdentifier2679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_brackets_in_expressionQualifiedIdentifier2685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleQualifiedIdentifier_in_nonAttributeQualifiedIdentifier2700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionQualifiedIdentifier_in_nonAttributeQualifiedIdentifier2705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_e4xAttributeIdentifier_in_qualifiedIdentifier2716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonAttributeQualifiedIdentifier_in_qualifiedIdentifier2721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceName_in_qualifiedIdent2733 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_DBL_COLON_in_qualifiedIdent2735 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_ident_in_qualifiedIdent2740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_namespaceName2752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedNamespace_in_namespaceName2756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_identifierStar2793 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_DOT_in_identifierStar2810 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_ident_in_identifierStar2812 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_DOT_in_identifierStar2824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_STAR_in_identifierStar2826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_annotations2858 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_includeDirective_in_annotations2864 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_LBRACK_in_annotation2891 = new BitSet(new long[]{0x0000400000000800L,0x0001000010008800L,0x0080400000040000L});
	public static final BitSet FOLLOW_ident_in_annotation2895 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_annotationParamList_in_annotation2899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RBRACK_in_annotation2904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_annotationParamList2930 = new BitSet(new long[]{0x4000444000000800L,0x022100401000C802L,0x0080400420050000L});
	public static final BitSet FOLLOW_annotationParam_in_annotationParamList2936 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_annotationParamList2942 = new BitSet(new long[]{0x4000444000000800L,0x022100401000C802L,0x0080400420040000L});
	public static final BitSet FOLLOW_annotationParam_in_annotationParamList2944 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RPAREN_in_annotationParamList2955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_annotationParam2982 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ASSIGN_in_annotationParam2984 = new BitSet(new long[]{0x4000044000000000L,0x0220004000004002L,0x0000000420000000L});
	public static final BitSet FOLLOW_constant_in_annotationParam2986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_annotationParam3001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_annotationParam3010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifiers3025 = new BitSet(new long[]{0x8000400000000002L,0x0800000008008000L,0x2C00000004000320L});
	public static final BitSet FOLLOW_namespaceName_in_modifier3048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_modifier3053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINAL_in_modifier3058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_186_in_modifier3063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_modifier3068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OVERRIDE_in_modifier3073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DYNAMIC_in_modifier3078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_189_in_modifier3083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_arguments3104 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_expressionList_in_arguments3106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RPAREN_in_arguments3108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_arguments3123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RPAREN_in_arguments3125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3142 = new BitSet(new long[]{0x4000C66040010800L,0x822502659840C902L,0x0088441420040B20L});
	public static final BitSet FOLLOW_elementList_in_arrayLiteral3144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_elementList3171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonemptyElementList_in_elementList3177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentExpression_in_nonemptyElementList3197 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_nonemptyElementList3200 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_assignmentExpression_in_nonemptyElementList3203 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_assignmentExpression_in_element3226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_objectLiteral3238 = new BitSet(new long[]{0x0000404000000800L,0x020100001000C802L,0x0080400000041000L});
	public static final BitSet FOLLOW_fieldList_in_objectLiteral3240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RCURLY_in_objectLiteral3243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literalField_in_fieldList3266 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_fieldList3269 = new BitSet(new long[]{0x0000404040000802L,0x020100001000C802L,0x0080400000040000L});
	public static final BitSet FOLLOW_literalField_in_fieldList3272 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_fieldName_in_literalField3289 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_literalField3291 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_element_in_literalField3293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_fieldName3317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_fieldName3322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentExpression_in_expression3344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentExpression_in_expressionList3356 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_expressionList3359 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_assignmentExpression_in_expressionList3361 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression3382 = new BitSet(new long[]{0x0000080001485002L,0x0000441040000000L,0x0000000002900001L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression3394 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression3399 = new BitSet(new long[]{0x0000080001485002L,0x0000441040000000L,0x0000000002900001L});
	public static final BitSet FOLLOW_logicalOrExpression_in_conditionalExpression3497 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_QUESTION_in_conditionalExpression3511 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_conditionalSubExpression_in_conditionalExpression3516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentExpression_in_conditionalSubExpression3545 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_conditionalSubExpression3547 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_assignmentExpression_in_conditionalSubExpression3550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression3564 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_logicalOrOperator_in_logicalOrExpression3571 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression3574 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_bitwiseOrExpression_in_logicalAndExpression3605 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_logicalAndOperator_in_logicalAndExpression3612 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_bitwiseOrExpression_in_logicalAndExpression3615 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression3646 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_BOR_in_bitwiseOrExpression3653 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression3656 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression3672 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_BXOR_in_bitwiseXorExpression3679 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression3682 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_equalityExpression_in_bitwiseAndExpression3698 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_BAND_in_bitwiseAndExpression3705 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_equalityExpression_in_bitwiseAndExpression3708 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3724 = new BitSet(new long[]{0x0200000000000002L,0x0010000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_equalityOperator_in_equalityExpression3731 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3736 = new BitSet(new long[]{0x0200000000000002L,0x0010000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3780 = new BitSet(new long[]{0x0000000000000802L,0x0000004211201400L});
	public static final BitSet FOLLOW_relationalOperator_in_relationalExpression3792 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3795 = new BitSet(new long[]{0x0000000000000802L,0x0000004211201400L});
	public static final BitSet FOLLOW_IN_in_relationalOperator3812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_relationalOperator3817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_relationalOperator3821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_relationalOperator3825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_relationalOperator3829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_in_relationalOperator3833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_relationalOperator3837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTANCEOF_in_relationalOperator3841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3853 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000000L,0x0000000000480000L});
	public static final BitSet FOLLOW_shiftOperator_in_shiftExpression3860 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3863 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000000L,0x0000000000480000L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3898 = new BitSet(new long[]{0x0000000000000002L,0x8000020000000000L});
	public static final BitSet FOLLOW_additiveOperator_in_additiveExpression3905 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3908 = new BitSet(new long[]{0x0000000000000002L,0x8000020000000000L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3939 = new BitSet(new long[]{0x0000040000000002L,0x0000100000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_multiplicativeOperator_in_multiplicativeExpression3947 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3953 = new BitSet(new long[]{0x0000040000000002L,0x0000100000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_STAR_in_multiplicativeOperator3976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIV_in_multiplicativeOperator3986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOD_in_multiplicativeOperator3991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INC_in_unaryExpression4005 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_unaryExpression4023 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpression4039 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unaryExpression4054 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression4069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DELETE_in_unaryExpressionNotPlusMinus4080 = new BitSet(new long[]{0x4000C44000000800L,0x022500619800C902L,0x0080440420040320L});
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus4082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_unaryExpressionNotPlusMinus4095 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEOF_in_unaryExpressionNotPlusMinus4110 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LNOT_in_unaryExpressionNotPlusMinus4125 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BNOT_in_unaryExpressionNotPlusMinus4140 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus4155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_postfixExpression4168 = new BitSet(new long[]{0x0008202000000002L,0x0000002080400000L});
	public static final BitSet FOLLOW_propOrIdent_in_postfixExpression4181 = new BitSet(new long[]{0x0008202000000002L,0x0000002080400000L});
	public static final BitSet FOLLOW_LBRACK_in_postfixExpression4194 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_expression_in_postfixExpression4196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RBRACK_in_postfixExpression4200 = new BitSet(new long[]{0x0008202000000002L,0x0000002080400000L});
	public static final BitSet FOLLOW_E4X_DESC_in_postfixExpression4220 = new BitSet(new long[]{0x0000C00000000800L,0x0001002018008800L,0x0080400001040320L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_postfixExpression4222 = new BitSet(new long[]{0x0008202000000002L,0x0000002080400000L});
	public static final BitSet FOLLOW_DOT_in_postfixExpression4239 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_postfixExpression4241 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_expression_in_postfixExpression4243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RPAREN_in_postfixExpression4245 = new BitSet(new long[]{0x0008202000000002L,0x0000002080400000L});
	public static final BitSet FOLLOW_DOT_in_postfixExpression4264 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_e4xAttributeIdentifier_in_postfixExpression4266 = new BitSet(new long[]{0x0008202000000002L,0x0000002080400000L});
	public static final BitSet FOLLOW_DOT_in_postfixExpression4286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_STAR_in_postfixExpression4288 = new BitSet(new long[]{0x0008202000000002L,0x0000002080400000L});
	public static final BitSet FOLLOW_arguments_in_postfixExpression4307 = new BitSet(new long[]{0x0008202000000002L,0x0000002080400000L});
	public static final BitSet FOLLOW_INC_in_postfixExpression4336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_postfixExpression4355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_E4X_ATTRI_in_e4xAttributeIdentifier4383 = new BitSet(new long[]{0x0000400000000800L,0x0001000098008800L,0x0080400001040320L});
	public static final BitSet FOLLOW_qualifiedIdent_in_e4xAttributeIdentifier4389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_e4xAttributeIdentifier4403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_e4xAttributeIdentifier4415 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_expression_in_e4xAttributeIdentifier4417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RBRACK_in_e4xAttributeIdentifier4419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNDEFINED_in_primaryExpression4442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primaryExpression4447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression4452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectLiteral_in_primaryExpression4457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionExpression_in_primaryExpression4462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newExpression_in_primaryExpression4467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_encapsulatedExpression_in_primaryExpression4472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_e4xAttributeIdentifier_in_primaryExpression4477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedIdent_in_primaryExpression4482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_propOrIdent4521 = new BitSet(new long[]{0x0000400000000800L,0x0001000018008800L,0x0080400000040320L});
	public static final BitSet FOLLOW_qualifiedIdent_in_propOrIdent4525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlLiteral_in_constant4554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_regexpLiteral_in_constant4559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_constant4564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant4569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_constant4574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_constant4579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_constant4584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_xmlLiteral4637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIV_in_regexpLiteral4670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_newExpression4693 = new BitSet(new long[]{0x4000C44000000800L,0x022500619800C902L,0x0080440420040320L});
	public static final BitSet FOLLOW_fullNewSubexpression_in_newExpression4696 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_arguments_in_newExpression4704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_fullNewSubexpression4719 = new BitSet(new long[]{0x0000200000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_DOT_in_fullNewSubexpression4740 = new BitSet(new long[]{0x0000400000000800L,0x0001000018008800L,0x0080400000040320L});
	public static final BitSet FOLLOW_qualifiedIdent_in_fullNewSubexpression4742 = new BitSet(new long[]{0x0000200000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_brackets_in_fullNewSubexpression4765 = new BitSet(new long[]{0x0000200000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_DOT_in_propertyOperator4792 = new BitSet(new long[]{0x0000400000000800L,0x0001000018008800L,0x0080400000040320L});
	public static final BitSet FOLLOW_qualifiedIdent_in_propertyOperator4795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_brackets_in_propertyOperator4800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_brackets4816 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_expressionList_in_brackets4818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RBRACK_in_brackets4820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_in_superExpression4831 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_arguments_in_superExpression4834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_encapsulatedExpression4856 = new BitSet(new long[]{0x4000C66000010800L,0x822502659840C902L,0x0088441420040320L});
	public static final BitSet FOLLOW_assignmentExpression_in_encapsulatedExpression4858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RPAREN_in_encapsulatedExpression4860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameterDeclarationList_in_functionSignature4881 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_typeExpression_in_functionSignature4883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionSignature_in_functionCommon4896 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_block_in_functionCommon4898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionExpression4909 = new BitSet(new long[]{0x0000000000000000L,0x0000002000008000L});
	public static final BitSet FOLLOW_IDENT_in_functionExpression4911 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_functionCommon_in_functionExpression4914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident4939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_ident4946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XML_in_ident4958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DYNAMIC_in_ident4970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMESPACE_in_ident4982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_in_ident4994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_ident5006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_ident5018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_ident5030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_synpred1_AS31512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred2_AS31732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInClauseDecl_in_synpred3_AS32123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_IN_in_synpred3_AS32125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred4_AS33388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationalOperator_in_synpred5_AS33786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred6_AS34700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred7_AS34734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_synpred8_AS34761 = new BitSet(new long[]{0x0000000000000002L});
}
