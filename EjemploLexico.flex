import java_cup.runtime.Symbol;


%%


/*%cupsym Simbolo*/
%cup
%public
%class Lexico
%line
%column
%char

/*NO SE MUESTRAN*/
DIGITO = [0-9]
LETRA_MI = [a-z]
GUION = [\_][\-]
COMILLA = [\"]
ESPACIO = \t | \n | \f

/*DECLARACION DE VARIABLES*/
DECLARE = [D][E][C][L][A][R][E]
ENDDECLARE = [E][N][D][D][E][C][L][A][R][E] 
DECLARACION = {DECLARE}([\[]({VAR}|({VAR}{COMA})*)*[\]]{ASIGNACION}[\[]({TIPOS_DATOS}|({TIPOS_DATOS}{COMA})*)*[\]])*{ENDDECLARE}

/*DECLARACION DEL PROGRAMA*/
INICIO = [B][E][G][I][N][.][P][R][O][G][R][A][M]
FIN =	[E][N][D][.][P][R][O][G][R][A][M]
/*---------------------------------------------------------------------------*/
TIPOS_DATOS = [F][L][O][A][T]|[I][N][T]|[S][T][R][I][N][G]
VAR = {LETRA_MI}({LETRA_MI}|{DIGITO}|_)*
CONST_INT = {DIGITO}+
CONST_STRING = [\"]({LETRA_MI}|{DIGITO}|{ESPACIO}|{GUION})*[\"]
FLOAT = {DIGITO}*[.]{DIGITO}+|{DIGITO}+[.]{DIGITO}*
COMA = [,]
FIN_LINEA = [;]
ASIGNACION = [:][=]
/*---------------------------------------------------------------------------*/

/*DECLARACION DE WHILE*/
WHILE_INICIO = [W][H][I][L][E]
WHILE_FIN = [D][O]

/*DECLARACION IF*/
IF_INICIO = [I][F]
IF_FIN = [T][H][E][N]
ELSE_IF = [E][L][S][E]


/*DECLARACION FOR*/
FOR_INICIO = [F][O][R]
FOR_FIN = [T][O]



/*LLAVES, PARENTECIS Y CORCHETES*/
PAREN_APER = [\(]
PAREN_CIER = [\)]
LLAVE_APER = [\{]
LLAVE_CIER = [\}]
CORCHETE_APER = [\[]
CORCHETE_CIER = [\]]

/*OPERADORES LOGICOS*/
OP_LO_AND = [&][&]
OP_LO_OR = [|][|]
OP_LO_NOT = [~]

/*OPERADORES ARITMETICOS*/
OP_AR_SUM = [+]
OP_AR_RTO = [\%]
OP_AR_POT = [\^]
OP_AR_RES = [-]
OP_AR_MUL = [*]
OP_AR_DIV = [/]

/*OPERADORES COMPARATIVOS*/
OP_CO_IGU = [=][=]
OP_CO_MAY = [>]
OP_CO_MEN = [<]
OP_CO_MEN_IGU = [<][=]
OP_CO_MAY_IGU = [>][=]
OP_CO_DIS = [!][=]

/*OPERADORES BOOLEANOS*/
OP_TRUE = [T][R][U][E]
OP_FALSE = [F][A][L][S][E]

/*COMENTARIO*/
COMENTARIO_APER = [\<][/]
COMENTARIO_CIER = [/][\>]
COMENTARIO = {COMENTARIO_APER}({WHILE_INICIO}|{WHILE_FIN}|{IF_INICIO}|{IF_FIN}|{ELSE_IF}|{FOR_INICIO}|{FOR_FIN}|{ESPACIO}|{VAR}|{CONST_INT}|{CONST_STRING}|{FLOAT}|{COMA}|{FIN_LINEA}|{ASIGNACION}|{OP_AR_DIV}|{OP_AR_MUL}|{OP_AR_POT}|{OP_AR_SUM}|{OP_CO_DIS}|{OP_CO_IGU}|{OP_CO_MAY}|{OP_CO_MAY_IGU}|{OP_CO_MEN}|{OP_CO_MEN_IGU}|{OP_FALSE}|{OP_LO_AND}|{OP_LO_NOT}|{OP_LO_OR}|{OP_TRUE}|{OP_AR_RTO}|{OP_AR_RES}|{DECLARE}|{ENDDECLARE}|{COMENTARIO_CIER}|{COMENTARIO_APER}|{PAREN_APER}|{PAREN_CIER}|{LLAVE_APER}|{LLAVE_CIER})*{COMENTARIO_CIER}

%%

<YYINITIAL> {
{COMENTARIO_APER} {System.out.println("Token COMENTARIO_APER encontrado, Lexema "+ yytext());} 
{COMENTARIO_CIER} {System.out.println("Token COMENTARIO_CIER encontrado, Lexema "+ yytext());} 
{PAREN_APER}	{System.out.println("Token PAREN_APER encontrado, Lexema "+ yytext());}
{PAREN_CIER}	{System.out.println("Token PAREN_CIER encontrado, Lexema "+ yytext());}
{LLAVE_APER}	{System.out.println("Token LLAVE_APER encontrado, Lexema "+ yytext());}
{LLAVE_CIER}	{System.out.println("Token LLAVE_CIER encontrado, Lexema "+ yytext());}
{CORCHETE_APER}	{System.out.println("Token CORCHETE_APER encontrado, Lexema "+ yytext());}
{CORCHETE_CIER}	{System.out.println("Token CORCHETE_CIER encontrado, Lexema "+ yytext());}
{TIPOS_DATOS}	{System.out.println("Token TIPOS_DATOS encontrado, Lexema "+ yytext());}  
{VAR}		{System.out.println("Token VAR encontrado, Lexema "+ yytext());}
{WHILE_INICIO}	{System.out.println("Token WHILE_INICIO encontrado, Lexema "+ yytext());}
{WHILE_FIN}	{System.out.println("Token WHILE_FIN encontrado, Lexema "+ yytext());}
{IF_INICIO}	{System.out.println("Token IF_INICIO encontrado, Lexema "+ yytext());}
{IF_FIN}	{System.out.println("Token IF_FIN encontrado, Lexema "+ yytext());}
{ELSE_IF}	{System.out.println("Token ELSE_IF encontrado, Lexema "+ yytext());}
{FOR_INICIO}	{System.out.println("Token FOR_INICIO encontrado, Lexema "+ yytext());}
{FOR_FIN}	{System.out.println("Token FOR_FIN encontrado, Lexema "+ yytext());}
{CONST_INT}	{System.out.println("Token CONST_INT, encontrado Lexema "+ yytext());}
{CONST_STRING}	{System.out.println("Token CONST_STRING, encontrado Lexema "+ yytext());}
{FLOAT}		{System.out.println("Token FLOAT encontrado, Lexema "+ yytext());}
{COMA}		{System.out.println("Token COMA encontrado, Lexema "+ yytext());}
{FIN_LINEA}	{System.out.println("Token FIN_LINEA encontrado, Lexema "+ yytext());}
{ASIGNACION}	{System.out.println("Token ASIGNACION encontrado, Lexema "+ yytext());}
{OP_LO_AND}	{System.out.println("Token OP_LO_AND encontrado, Lexema "+ yytext());}
{OP_LO_OR}	{System.out.println("Token OP_LO_OR encontrado, Lexema "+ yytext());}
{OP_LO_NOT}	{System.out.println("Token OP_LO_NOT encontrado, Lexema "+ yytext());}
{OP_AR_SUM}	{System.out.println("Token OP_AR_SUM encontrado, Lexema "+ yytext());}
{OP_AR_RTO}	{System.out.println("Token OP_AR_RTO encontrado, Lexema "+ yytext());}
{OP_AR_POT}	{System.out.println("Token OP_AR_POT encontrado, Lexema "+ yytext());}
{OP_AR_RES}	{System.out.println("Token OP_AR_RES encontrado, Lexema "+ yytext());}
{OP_AR_MUL}	{System.out.println("Token OP_AR_MUL encontrado, Lexema "+ yytext());}
{OP_AR_DIV}	{System.out.println("Token OP_AR_DIV encontrado, Lexema "+ yytext());}
{OP_CO_IGU}	{System.out.println("Token OP_CO_IGU encontrado, Lexema "+ yytext());}
{OP_CO_MAY}	{System.out.println("Token OP_CO_MAY encontrado, Lexema "+ yytext());}
{OP_CO_MEN}	{System.out.println("Token OP_CO_MEN encontrado, Lexema "+ yytext());}
{OP_CO_MAY_IGU}	{System.out.println("Token OP_CO_MAY_IGU encontrado, Lexema "+ yytext());}
{OP_CO_MEN_IGU}	{System.out.println("Token OP_CO_MEN_IGU encontrado, Lexema "+ yytext());}
{OP_CO_DIS}	{System.out.println("Token OP_CO_DIS encontrado, Lexema "+ yytext());}
{OP_TRUE}	{System.out.println("Token OP_TRUE encontrado, Lexema "+ yytext());}
{OP_FALSE}	{System.out.println("Token OP_FALSE encontrado, Lexema "+ yytext());}
{DECLARE} 	{System.out.println("Token DECLARE encontrado, Lexema "+ yytext());}
{ENDDECLARE}	{System.out.println("Token ENDDECLARE encontrado, Lexema "+ yytext());}
{DECLARACION}	{/*System.out.println("Token DECLARACIONencontrado, Lexema "+ yytext());*/}
{INICIO}	{/*System.out.println("Token INICIO encontrado, Lexema "+ yytext());*/}
{FIN}		{/*System.out.println("Token FIN encontrado, Lexema "+ yytext());*/}
{COMILLA}	{/*System.out.println("Token COMILLA encontrado, Lexema "+ yytext());*/}
{GUION} 	{/*System.out.println("Token GUION encontrado, Lexema "+ yytext());*/}
{ESPACIO}	{/*System.out.println("Token ESPACIO encontrado, Lexema "+ yytext());*/}
{COMENTARIO}	{/*System.out.println("Token COMENTARIO encontrado, Lexema "+ yytext());*/}

}

[^]		{ throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }