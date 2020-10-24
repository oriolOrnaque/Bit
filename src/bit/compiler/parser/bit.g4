grammar bit;

startRule: program EOF;

program
    : statement+
    ;

statement
    : type? id_or_reg ASSIGN expression SEMICOLON
    ;

id_or_reg
    : ID
    | reg
    ;

type
    : U8
    | U16
    | I8
    | I16
    ;

expression
    : id_or_reg
    | NUM
    | PARENTHESIS_OPEN expression PARENTHESIS_CLOSE
    | expression binop expression
    | unaryop_pre expression
    | expression unaryop_post
    ;

binop
    : PLUS
    | MINUS
    | MULTIPLY
    | DIVIDE
    | MODULO
    ;

unaryop_post
    : unaryop_pre
    | NOT
    ;

unaryop_pre
    : INC
    | DEC
    ;

reg
    : regs8
    | regs16
    ;

regs8
    : AH
    | AL
    | BH
    | BL
    | CH
    | CL
    | DH
    | DL
    ;

regs16
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
INC: '++';
DEC: '--';
NOT: '!';
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

U8: 'u8';
U16: 'u16';
I8: 'i8';
I16: 'i16';

NUM: [0-9]+;
ID: [a-zA-Z]+;

WS: [ \t\n\r]+ -> skip;
