
grammar decaf;

WS: [ \t\r\n]+ ->	channel(HIDDEN);

program : 'class' 'Program' ID '{'  (declaration)*  '}';
declaration : structDeclaration | varDeclaration | methodDeclaration;

varDeclaration : varType ID ';'|varType ID '[' NUM ']' ';';
structDeclaration : 'struct' ID '{' (varDeclaration)* '}';

varType : 'int' | 'char' | 'boolean' | 'struct' ID | structDeclaration | 'void';
methodDeclaration : methodType ID  '('  (parameter)*  ')'  block;
methodType : 'int' | 'char' | 'boolean' | 'void';
parameter : parameterType ID | parameterType ID '[' ']';
parameterType : 'int' | 'char' | 'boolean';
block : '{' (varDeclaration)* (statement)* '}';
statement : 'if' '(' expression ')' block ( 'else' block )? | 'while' '('expression')' block | 'return' (expression)? ';' | methodCall ';' | block | location '=' expression | (expression)? ';';
location : (ID |  ID '[' expression ']') ( '.' location )?;
methodCall : ID '(' (arg(',' arg)*)? ')';
literal : int_literal | char_literal | bool_literal;

expression : location #ExpressionLocation
| methodCall #ExpressionMethod
| literal #ExpressionLit
| expression op expression #ExpressionPro
| '-' expression #ExpressionNeg
| '!' expression #ExpressionExc
| '(' expression ')' #ExpressionParentesis
;
arg : expression;
op : arith_op | rel_op | eq_op | cond_op;
arith_op : '+' | '-' | '*' | '/' | '%';
rel_op : '<' | '>' | '<=' | '>=';
eq_op : '==' | '!=';
cond_op : '&&' | '||';
int_literal : NUM ;  
char_literal : APOSTROFE CHAR APOSTROFE ;
bool_literal : 'true' | 'false';

APOSTROFE: '"';
ID : [a-z] ([a-z]|[0-9])* ;        
NUM : [0-9] ([0-9])*;
CHAR : [a-z];
