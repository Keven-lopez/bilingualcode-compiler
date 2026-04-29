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
    | constantDecl
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

constantDecl
    : CONST IDENTIFIER AS type ASSIGN expression SEMICOLON
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
    : IF expression THEN statement* (ELSE statement*)? ENDIF SEMICOLON
    ;

whileStmt
    : WHILE expression DO statement* ENDWHILE SEMICOLON
    ;

functionDecl
    : FUNCTION IDENTIFIER LPAREN paramList? RPAREN DO statement* (returnStmt)? ENDFUNCTION SEMICOLON
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

type
    : NUMBER
    | TEXT
    | BOOLEAN
    ;

expression
    : expression operator expression
    | LPAREN expression RPAREN
    | literal
    | IDENTIFIER
    ;

literal
    : NUMBER_LITERAL
    | STRING_LITERAL
    | TRUE
    | FALSE
    ;

operator
    : PLUS
    | MINUS
    | MULT
    | DIV
    | EQ
    | NEQ
    | LT
    | GT
    | LTE
    | GTE
    | AND
    | OR
    ;

// =====================
// LEXER RULES
// =====================

// Program structure
START       : 'start' | 'inicio';
FINISH      : 'finish' | 'fin';

// Variable declarations
DEFINE      : 'define' | 'definir';
AS          : 'as' | 'como';
CONST       : 'const' | 'constante';

// Assignment
SET         : 'set' | 'poner';
TO          : 'to' | 'para';
ASSIGN      : '=';

// Input / Output
INPUT       : 'input' | 'entrada';
DISPLAY     : 'display' | 'mostrar';

// Conditionals
IF          : 'if' | 'si';
THEN        : 'then' | 'entonces';
ELSE        : 'else' | 'sino';
ENDIF       : 'end_if' | 'fin_si';

// Loops
WHILE       : 'while' | 'mientras';
DO          : 'do' | 'hacer';
ENDWHILE    : 'end_while' | 'fin_mientras';

// Functions
FUNCTION    : 'function' | 'funcion';
ENDFUNCTION : 'end_function' | 'fin_funcion';
RETURN      : 'return' | 'retornar';
CALL        : 'call' | 'llamar';

// Data types
NUMBER      : 'number' | 'numero';
TEXT        : 'text' | 'texto';
BOOLEAN     : 'boolean' | 'booleano';

// Boolean values
TRUE        : 'true' | 'verdadero';
FALSE       : 'false' | 'falso';

// Logical operators
AND         : 'and' | 'y';
OR          : 'or' | 'o';
NOT         : 'not' | 'no';

// Arithmetic operators
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';

// Comparison operators
EQ          : '==';
NEQ         : '!=';
LT          : '<';
GT          : '>';
LTE         : '<=';
GTE         : '>=';

// Symbols
LPAREN      : '(';
RPAREN      : ')';
LBRACE      : '{';
RBRACE      : '}';
SEMICOLON   : ';';
COMMA       : ',';

// Literals
NUMBER_LITERAL
    : [0-9]+ ('.' [0-9]+)?
    ;

STRING_LITERAL
    : '"' .*? '"'
    ;

// Identifiers
IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

// Ignore whitespace
WS
    : [ \t\r\n]+ -> skip
    ;

// Lexical error token
ERROR_CHAR
    : .
    ;