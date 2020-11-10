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
BARRA = [\\]
DIGITO = [0-9]
LETRA_MI = [a-z]
ESPECIALES =[\#]|[\$]|[\?]|[\¿]|[\¡]|[\@]
GUION = [\_][\-]
COMILLA = [\"]
IGUAL = [\=]
ESPACIO = \t | \n | \f

/*FILTER*/
FILTER = [F][I][L][T][E][R]

/*DECLARACION DE VARIABLES*/
DECLARE = [D][E][C][L][A][R][E]
ENDDECLARE = [E][N][D][D][E][C][L][A][R][E] 

/*DECLARACION DEL PROGRAMA*/
BEGIN = [B][E][G][I][N]{PUNTO}[P][R][O][G][R][A][M]
END =	[E][N][D]{PUNTO}[P][R][O][G][R][A][M]
/*---------------------------------------------------------------------------*/
TIPOS_DATOS = [F][L][O][A][T]|[I][N][T]|[S][T][R][I][N][G]
VAR = {LETRA_MI}({LETRA_MI}|{DIGITO}|{GUION}|{ESPECIALES})*
CONST_INT = {DIGITO}+
CONST_STRING = [\"]({LETRA_MI}|{DIGITO}|{ESPACIO}|{GUION})*[\"]
FLOAT = {DIGITO}*{PUNTO}{DIGITO}+|{DIGITO}+{PUNTO}{DIGITO}*
COMA = [\,]
PUNTO = [\.]
FIN_LINEA = [;]
ASIGNACION = [:][=]
/*---------------------------------------------------------------------------*/
/*MOSTRAR POR PANTALLA*/
PRINT = [P][R][I][N][T]


/*DECLARACION DE WHILE*/
WHILE_INICIO = [W][H][I][L][E]
WHILE_FIN = [D][O]

/*DECLARACION FOR*/
FOR_INICIO = [F][O][R]
FOR_FIN = [M][A][K][E]
FOR_MEDIO = [T][O]


/*DECLARACION IF*/
IF_INICIO = [I][F]
IF_FIN = [T][H][E][N]
ELSE_IF = [E][L][S][E]


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
COMENTARIO_CIER = [\/][\>]


%%


<YYINITIAL> {

{COMENTARIO_APER} 	{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("COMENTARIO_APER");
         		listaToken.add(t);}


{COMENTARIO_CIER} 	{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("COMENTARIO_CIER");
         		listaToken.add(t);}

{PAREN_APER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("PAREN_APER");
         		listaToken.add(t);}

{PAREN_CIER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("PAREN_CIER");
         		listaToken.add(t);}

{LLAVE_APER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("LLAVE_APER");
         		listaToken.add(t);}

{LLAVE_CIER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("LLAVE_CIER");
         		listaToken.add(t);}

{CORCHETE_APER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("CORCHETE_APER");
         		listaToken.add(t);}

{CORCHETE_CIER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("CORCHETE_CIER");
         		listaToken.add(t);}

{TIPOS_DATOS}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("TIPOS_DATOS");
         		listaToken.add(t);}

{VAR}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("VAR");
         		listaToken.add(t);}

{WHILE_INICIO}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("WHILE_INICIO");
         		listaToken.add(t);}

{WHILE_FIN}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("WHILE_FIN");
         		listaToken.add(t);}

{IF_INICIO}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("IF_INICIO");
         		listaToken.add(t);}

{IF_FIN}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("IF_FIN");
         		listaToken.add(t);}

{ELSE_IF}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("ELSE_IF");
         		listaToken.add(t);}

{FOR_INICIO}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FOR_INICIO");
         		listaToken.add(t);}

{FOR_FIN}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FOR_FIN");
         		listaToken.add(t);}

{FOR_MEDIO}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FOR_MEDIO");
         		listaToken.add(t);}

{CONST_INT}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("CONST_INT");
         		listaToken.add(t);}

{CONST_STRING}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("CONST_STRING");
			t.setValor(yytext());
			t.setLongitud(yytext().length());         	
			listaToken.add(t);}

{FLOAT}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FLOAT");
         		listaToken.add(t);}

{COMA}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("COMA");
         		listaToken.add(t);}

{PUNTO}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("PUNTO");
         		listaToken.add(t);}

{FIN_LINEA}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FIN_LINEA");
         		listaToken.add(t);}

{ASIGNACION}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("ASIGNACION");
         		listaToken.add(t);}

{OP_LO_AND}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_LO_AND");
         		listaToken.add(t);}

{OP_LO_OR}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_LO_OR");
         		listaToken.add(t);}

{OP_LO_NOT}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_LO_NOT");
         		listaToken.add(t);}

{OP_AR_SUM}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_SUM");
         		listaToken.add(t);}

{OP_AR_RTO}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_RTO");
         		listaToken.add(t);}

{OP_AR_POT}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_POT");
         		listaToken.add(t);}

{OP_AR_RES}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_RES");
         		listaToken.add(t);}

{OP_AR_MUL}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_MUL");
         		listaToken.add(t);}

{OP_AR_DIV}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_DIV");
         		listaToken.add(t);}

{OP_CO_IGU}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_IGU");
         		listaToken.add(t);}

{OP_CO_MAY}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_MAY");
         		listaToken.add(t);}

{OP_CO_MEN}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_MEN");
         		listaToken.add(t);}

{OP_CO_MAY_IGU}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_MAY_IGU");
         		listaToken.add(t);}

{OP_CO_MEN_IGU}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_MEN_IGU");
         		listaToken.add(t);}

{OP_CO_DIS}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_DIS");
         		listaToken.add(t);}

{OP_TRUE}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_TRUE");
         		listaToken.add(t);}

{OP_FALSE}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_FALSE");
         		listaToken.add(t);}

{DECLARE}	 	{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("DECLARE");
         		listaToken.add(t);}

{ENDDECLARE}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("ENDDECLARE");
         		listaToken.add(t);}

{COMILLA}		{}

{GUION}		 	{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("GUION");
         		listaToken.add(t);}

{ESPACIO}		{}

{ESPECIALES}		{}


{IGUAL}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("IGUAL");
         		listaToken.add(t);}

{BARRA}			{}

{FILTER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FILTER");
         		listaToken.add(t);}

{BEGIN}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("BEGIN PROGRAM");
         		listaToken.add(t);}

{END} 			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("END PROGRAM");
         		listaToken.add(t);}

}

[^]		{ throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }