grammar bit;

startRule: program EOF;

program
    : statement
    ;

statement
    : reg ASSIGN expression SEMICOLON
    ;

expression
    : reg
    | NUM
    | ID
    | expression binop expression
    | PARENTHESIS_OPEN expression PARENTHESIS_CLOSE
    ;

binop
    : PLUS
    | MINUS
    | MULTIPLY
    | DIVIDE
    | MODULO
    ;

reg
    : i86regs8
    | i86regs16
    ;

i86regs8
    : AH
    | AL
    | BH
    | BL
    | CH
    | CL
    | DH
    | DL
    ;

i86regs16
    : AX
    | BX
    | CX
    | DX
    ;

PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';
ASSIGN: '=';
PARENTHESIS_OPEN: '(';
PARENTHESIS_CLOSE: ')';
SEMICOLON: ';';

AH: 'ah';
AL: 'al';
BH: 'bh';
BL: 'bl';
CH: 'ch';
CL: 'cl';
DH: 'dh';
DL: 'dl';
AX: 'ax';
BX: 'bx';
CX: 'cx';
DX: 'dx';

NUM: [0-9]+;
ID: [a-zA-Z]+;

WS: [ \t\n\r]+ -> skip;
