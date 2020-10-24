grammar bit;

startRule: program EOF;

program
    : program_blocks+
    ;

program_blocks
    : statement
    | function_decl
    | struct
    | decl
    ;

function_decl
    : multilevel_id PARENTHESIS_OPEN function_parameters PARENTHESIS_CLOSE CURLY_BRACES_OPEN statement* CURLY_BRACES_CLOSE
    ;

function_call
    : multilevel_id PARENTHESIS_OPEN function_arguments PARENTHESIS_CLOSE
    ;

function_parameters
    : (type ID)?
    | (type ID ',')* type ID
    ;

function_arguments
    : ID?
    | (ID ',')* ID
    ;

struct
    : STRUCT ID CURLY_BRACES_OPEN  decl+ CURLY_BRACES_CLOSE SEMICOLON
    ;

decl
    : type ID SEMICOLON
    ;

statement
    : type? id_or_reg ASSIGN expression SEMICOLON
    | expression SEMICOLON
    ;

multilevel_id
    : ID ('.' ID)*
    ;

id_or_reg
    : multilevel_id
    | reg
    ;

type
    : BYTE
    | WORD
    | DWORD
    | QWORD
    | OWORD
    | STRUCT ID
    ;

expression
    : id_or_reg
    | NUM
    | function_call
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
CURLY_BRACES_OPEN: '{';
CURLY_BRACES_CLOSE: '}';
BRACKET_OPEN: '[';
BRACKET_CLOSE: ']';
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

BYTE: 'byte';
WORD: 'word';
DWORD: 'dword';
QWORD: 'qword';
OWORD: 'oword';

STRUCT: 'struct';

NUM: [0-9]+;
ID: [_a-zA-Z][_a-zA-Z0-9]*;

WS: [ \t\n\r]+ -> skip;
