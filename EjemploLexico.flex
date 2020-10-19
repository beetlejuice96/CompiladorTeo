import java_cup.runtime.Symbol;


%%


/*%cupsym Simbolo*/
%cup
%public
%class Lexico
%line
%column
%char


ENTER = [ \n]
COM = [']
LETRA = [a-zA-Z]
DIGITO = [0-9]
ESPACIO = [\t]|[\f]
ID = {LETRA}({LETRA}|{DIGITO}|_)*
CONST_INT = {DIGITO}+
CONST_STRING = {COM}({LETRA}|{DIGITO}|{ESPACIO})*{COM}
COMENTARIO = [<][/]{CONS_STRING}[/][>]
FLOAT = {DIGITO}\.[0-9]*

COMA = ","

// Cada sentencia se encuentra finalizada por un punto y coma
FIN_DE_LINEA = ";"

/* Definimos los operadores lógicos:
	- & : operador AND
	- || : operador OR
	- ~ : operador NOT
*/

OPERADOR_LOGICO = "&&" | "||" | "~"

/* Definimos los operadores ariméticos:
	- + : operador suma
	- * : operador de multiplicación
	- - : operador resta
	- / : operador de división

*/

OPERADOR_ARITMETICO = "+" | "-" | "*" | "/"

/* Definimos operadores comparativos
	- == : operador es igual
	- > : operador de mayor a
	- < : operador de menor a
	- <= : operador de menor o igual a
	- >= : operador de mayor o igual a
	- <> : operador de distinto a

*/

OPERADOR_COMPARATIVO = "==" | ">" | "<" | "<=" | ">=" | "<>"

/* Definimos los booleanos:
	- True : hace referencia al valor de verdad Verdadero
	- False : hace referencia al valor de verdad Falso

*/

BOOLEAN = "True" | "False"

ASIGNACION = ":="

// Inicio de una declaración
DECLARE = "DECLARE"

// Fin de una declaración
ENDDECLARE = "ENDDECLARE"

/********** EJEMPLO *********************
	DECLARE
		[a1, b1] := [FLOAT, INT]
		[p1, p2, p3] := [FLOAT,FLOAT,INT]
	ENDDECLARE
******************************************/

// Inicio de sentencia de un programa
BEGIN = "BEGIN.PROGRAM"

// Fin de una sentencia de programa
END = "END.PROGRAM"
%%

<YYINITIAL> {

{ID}		{System.out.println("Token ID encontrado, Lexema "+ yytext());}

{CONST_INT}		{System.out.println("Token CONST_INT, encontrado Lexema "+ yytext());}

{ASIGNACION}		{System.out.println("Token ASIGNACION encontrado, Lexema "+ yytext());}

{CONST_STRING} {System.out.println("Token CONST_STRING encontrado, Lexema "+ yytext());}

{COMA} {System.out.println("Token COMA encontrado, Lexema "+ yytext());}

{FIN_DE_LINEA} {System.out.println("Token FIN_DE_LINEA encontrado, Lexema "+ yytext());}

{DECLARE} {System.out.println("Token DECLARE encontrado, Lexema "+ yytext());}

{ENDDECLARE} {System.out.println("Token ENDDECLARE encontrado, Lexema "+ yytext());}

{BEGIN} {System.out.println("Token BEGIN encontrado, Lexema "+ yytext());}

{END} {System.out.println("Token END encontrado, Lexema "+ yytext());}

{FLOAT} {System.out.println("Token FLOAT encontrado, Lexema "+ yytext());}

"&&" {System.out.println("Token AND (operador lógico) encontrado, Lexema "+ yytext());}

"||" {System.out.println("Token OR (operador lógico) encontrado, Lexema "+ yytext());}

"~" {System.out.println("Token NOT (operador lógico) encontrado, Lexema "+ yytext());}

"+" {System.out.println("Token SUMA (operador aritmético) encontrado, Lexema "+ yytext());}

"-" {System.out.println("Token RESTA (operador aritmético) encontrado, Lexema "+ yytext());}

"*" {System.out.println("Token MULTIPLICACION (operador aritmético) encontrado, Lexema "+ yytext());}

"/" {System.out.println("Token DIVISION (operador aritmético) encontrado, Lexema "+ yytext());}

"==" {System.out.println("Token IGUAL_A (operador comparativo) encontrado, Lexema "+ yytext());}

"<>" {System.out.println("Token DISTINTO_A (operador comparativo) encontrado, Lexema "+ yytext());}

"<" {System.out.println("Token MENOR_A (operador comparativo) encontrado, Lexema "+ yytext());}

">" {System.out.println("Token MAYOR_A (operador comparativo) encontrado, Lexema "+ yytext());}

">=" {System.out.println("Token MAYOR_IGUAL_A (operador comparativo) encontrado, Lexema "+ yytext());}

"<=" {System.out.println("Token MENOR_IGUAL_A (operador comparativo) encontrado, Lexema "+ yytext());}

"True" {System.out.println("Token TRUE (boolean) encontrado, Lexema "+ yytext());}

"False" {System.out.println("Token FALSE (boolean) encontrado, Lexema "+ yytext());}
}

[^]		{ throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }
