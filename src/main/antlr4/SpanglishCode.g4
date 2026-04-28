grammar SpanglishCode;

@header {
package com.umg.bilingualcode;
}

// =====================
// PARSER RULES
// =====================

program
    : START statement* FINISH EOF
    ;

statement
    : declaration
    | assignment
    | inputStmt
    | displayStmt
    | ifStmt
    | whileStmt
    | functionDecl
    | functionCall
    | returnStmt
    ;

declaration
    : DEFINE IDENTIFIER AS type SEMICOLON
    ;

type
    : NUMBER
    | TEXT
    | BOOLEAN
    ;

assignment
    : SET IDENTIFIER TO expression SEMICOLON
    ;

inputStmt
    : INPUT IDENTIFIER SEMICOLON
    ;

displayStmt
    : DISPLAY expression SEMICOLON
    ;

ifStmt
    : IF condition THEN statement* (ELSE statement*)? ENDIF SEMICOLON
    ;

whileStmt
    : WHILE condition DO statement* ENDWHILE SEMICOLON
    ;

functionDecl
    : FUNCTION IDENTIFIER LPAREN paramList? RPAREN DO statement* RETURN expression SEMICOLON ENDFUNCTION SEMICOLON
    ;

paramList
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

functionCall
    : CALL IDENTIFIER LPAREN argList? RPAREN SEMICOLON
    ;

argList
    : expression (COMMA expression)*
    ;

returnStmt
    : RETURN expression SEMICOLON
    ;

condition
    : expression comparator expression
    ;

comparator
    : EQ
    | NEQ
    | GT
    | LT
    | GTE
    | LTE
    ;

expression
    : expression operator expression
    | LPAREN expression RPAREN
    | IDENTIFIER
    | NUMBER_LITERAL
    | STRING_LITERAL
    | TRUE
    | FALSE
    ;

operator
    : PLUS
    | MINUS
    | MULT
    | DIV
    | AND
    | OR
    ;

// =====================
// LEXER RULES
// English + Spanish aliases
// =====================

START       : 'start' | 'inicio';
FINISH      : 'finish' | 'fin';

DEFINE      : 'define' | 'definir';
AS          : 'as' | 'como';

SET         : 'set' | 'poner';
TO          : 'to' | 'a';

INPUT       : 'input' | 'entrada';
DISPLAY     : 'display' | 'mostrar';

IF          : 'if' | 'si';
THEN        : 'then' | 'entonces';
ELSE        : 'else' | 'sino';
ENDIF       : 'end_if' | 'fin_si';

WHILE       : 'while' | 'mientras';
DO          : 'do' | 'hacer';
ENDWHILE    : 'end_while' | 'fin_mientras';

FUNCTION    : 'function' | 'funcion';
ENDFUNCTION : 'end_function' | 'fin_funcion';

RETURN      : 'return' | 'retornar';
CALL        : 'call' | 'llamar';

NUMBER      : 'number' | 'numero';
TEXT        : 'text' | 'texto';
BOOLEAN     : 'boolean' | 'booleano';

TRUE        : 'true' | 'verdadero';
FALSE       : 'false' | 'falso';

AND         : 'and' | 'y';
OR          : 'or' | 'o';

// Operators
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';

EQ          : '==';
NEQ         : '!=';
GT          : '>';
LT          : '<';
GTE         : '>=';
LTE         : '<=';

// Symbols
LPAREN      : '(';
RPAREN      : ')';
COMMA       : ',';
SEMICOLON   : ';';

// Literals
NUMBER_LITERAL : [0-9]+ ('.' [0-9]+)?;
STRING_LITERAL : '"' .*? '"';

// Comments
COMMENT     : '//' ~[\r\n]* -> skip;

// Identifier
IDENTIFIER  : [a-zA-Z_][a-zA-Z0-9_]*;

// Whitespace
WS          : [ \t\r\n]+ -> skip;