grammar Expr;

r  : ID '=' NUMBER ((ADD | SUB | MUL | DIV) NUMBER)*;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+('.'[0-9]*)? | '.' [0-9]+;
WHITESPACE: [ \n\r\t]+ -> skip;
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';

expr: left=add(op+=('+'|'-')right+=add)*;
add: left=mul(op+=('*'|'/')right+=mul)*;
mul: num=NUMBER | '(' expr ')';

