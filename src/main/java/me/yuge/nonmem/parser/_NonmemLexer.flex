package me.yuge.nonmem.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static me.yuge.nonmem.psi.NonmemTypes.*;

%%

%{
  public _NonmemLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _NonmemLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
COMMENT=;.*
NUMBER=-?[0-9]+(\.[0-9]*)?([Ee][+-][0-9]+)?
DATA_FORMAT=(I[0-9]+(\.[0-9]+)?)|(F[0-9]+\.[0-9]+)|(((([0-9]+P)?E)|ES|EN)[0-9]+\.[0-9]+(E[0-9]+)?)
TABLE_FORMAT=(,|s|space|t|tab)((I[0-9]+(\.[0-9]+)?)|(F[0-9]+\.[0-9]+)|(((([0-9]+P)?E)|ES|EN)[0-9]+\.[0-9]+(E[0-9]+)?))
ID=[\w._]+
STRING=('[^';]*')|(\"[^\";]*\")|([^\s;=+\-*/,()$]*)

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "="                  { return OP_ASSIGN; }
  "+"                  { return OP_PLUS; }
  "-"                  { return OP_MINUS; }
  "*"                  { return OP_MUL; }
  "**"                 { return OP_POWER; }
  "/"                  { return OP_QUOTIENT; }
  ","                  { return COMMA; }
  "("                  { return LEFT_PAREN; }
  ")"                  { return RIGHT_PAREN; }
  "$"                  { return DOLLAR; }

  {SPACE}              { return SPACE; }
  {COMMENT}            { return COMMENT; }
  {NUMBER}             { return NUMBER; }
  {DATA_FORMAT}        { return DATA_FORMAT; }
  {TABLE_FORMAT}       { return TABLE_FORMAT; }
  {ID}                 { return ID; }
  {STRING}             { return STRING; }

}

[^] { return BAD_CHARACTER; }
