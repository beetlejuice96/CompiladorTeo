import java_cup.runtime.*;


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
ESPECIALES =[\#]|[\$]|[\?]|[\¿]|[\¡]|[\@]|[!]
GUION = [\_]|[\-]
COMILLA = [\"]
IGUAL = [\=]
ESPACIO=[ \t\f\r\n]
LETRA_MA = [A-Z]

/*FILTER*/
FILTER = [F][I][L][T][E][R]

/*DECLARACION DE VARIABLES*/
DECLARE = [D][E][C][L][A][R][E]
ENDDECLARE = [E][N][D][D][E][C][L][A][R][E] 

/*DECLARACION DEL PROGRAMA*/
BEGIN = [B][E][G][I][N]{PUNTO}[P][R][O][G][R][A][M]
END =	[E][N][D]{PUNTO}[P][R][O][G][R][A][M]
/*---------------------------------------------------------------------------*/
FLOAT = [F][L][O][A][T]
INTEGER =[I][N][T][E][G][E][R]
STRING=[S][T][R][I][N][G]
VAR = {LETRA_MI}({LETRA_MI}|{DIGITO}|{GUION}|{ESPECIALES})*
CONST_INT = {DIGITO}+
CONST_STRING = [\"]({LETRA_MI}|{DIGITO}|{ESPACIO}|{GUION}|{PUNTO}|{LETRA_MA}|[\!])*[\"]
CONST_FLOAT = {DIGITO}*{PUNTO}{DIGITO}+|{DIGITO}+{PUNTO}{DIGITO}*
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
/*posible solucion:
  COMENTARIO = {COMENTARIO_APER}[^*]~{COMENTARIO}*{COMENTARIO_CIER}
  O PONER TODOS LOS TOKENS DEFINIDOS.*/
COMENTARIO = {COMENTARIO_APER}[^*]~ {COMENTARIO_CIER}


%%


<YYINITIAL> {

{PRINT}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("PRINT");
         		listaToken.add(t);
				 return new Symbol(sym.PRINT,yytext());}		

{COMENTARIO} 		{}
{PAREN_APER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("PAREN_APER");
         		listaToken.add(t);
				 return new Symbol(sym.PAREN_APER,yytext());}

{PAREN_CIER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("PAREN_CIER");
         		listaToken.add(t);
				 return new Symbol(sym.PAREN_CIER,yytext());}

{LLAVE_APER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("LLAVE_APER");
         		listaToken.add(t);
				 return new Symbol(sym.LLAVE_APER,yytext());}

{LLAVE_CIER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("LLAVE_CIER");
         		listaToken.add(t);
				 return new Symbol(sym.LLAVE_CIER,yytext());}

{CORCHETE_APER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("CORCHETE_APER");
         		listaToken.add(t);
				 return new Symbol(sym.CORCHETE_APER,yytext());}

{CORCHETE_CIER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("CORCHETE_CIER");
         		listaToken.add(t);
				 return new Symbol(sym.CORCHETE_CIER,yytext());}


{VAR}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("VAR");
         		listaToken.add(t);
				 return new Symbol(sym.VAR,yytext());}

{WHILE_INICIO}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("WHILE_INICIO");
         		listaToken.add(t);
				 return new Symbol(sym.WHILE_INICIO,yytext());}

{WHILE_FIN}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("WHILE_FIN");
         		listaToken.add(t);
				 return new Symbol(sym.WHILE_FIN,yytext());}

{IF_INICIO}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("IF_INICIO");
         		listaToken.add(t);
				 return new Symbol(sym.IF_INICIO,yytext());}

{IF_FIN}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("IF_FIN");
         		listaToken.add(t);
				 return new Symbol(sym.IF_FIN,yytext());}

{ELSE_IF}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("ELSE_IF");
         		listaToken.add(t);
				 return new Symbol(sym.ELSE_IF,yytext());}

{FOR_INICIO}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FOR_INICIO");
         		listaToken.add(t);
				 return new Symbol(sym.FOR_INICIO,yytext());}

{FOR_FIN}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FOR_FIN");
         		listaToken.add(t);
				 return new Symbol(sym.FOR_FIN,yytext());}

{FOR_MEDIO}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FOR_MEDIO");
         		listaToken.add(t);
				 return new Symbol(sym.FOR_MEDIO,yytext());}

{CONST_INT}		{Token t = new Token();
			int numero = Integer.parseInt(yytext());
			if ((numero >= -32767) && (numero <= 32767)) { 
         		t.setLexema(yytext());
         		t.setToken("CONST_INT");
         		listaToken.add(t);
				 return new Symbol(sym.CONST_INT,yytext());}
			}

{CONST_STRING}		{Token t = new Token(); 
			if (yytext().length() <= 30){
         		t.setLexema(yytext());
         		t.setToken("CONST_STRING");
			t.setValor(yytext());
			t.setLongitud(yytext().length());         	
			listaToken.add(t);}
			return new Symbol(sym.CONST_STRING,yytext());}

{CONST_FLOAT}			{int indexDecimal = yytext().indexOf(".");
	                 String entero = yytext().substring(0, indexDecimal);
	                 String decimal = yytext().substring(indexDecimal+1,yytext().length());
        		  if ( (Integer.valueOf(entero) > -32768) && (Integer.valueOf(entero) < 32768)
              	       && (Integer.valueOf(decimal) > -32768) && (Integer.valueOf(decimal) < 32768) ) {
			Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("CONST_FLOAT");
         		listaToken.add(t);}
				 return new Symbol(sym.CONST_FLOAT,yytext());}

{FLOAT}			{ Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FLOAT");
         		listaToken.add(t);
			 return new Symbol(sym.FLOAT,yytext());}


{INTEGER}		{ Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("INTEGER");
         		listaToken.add(t);
			 return new Symbol(sym.INTEGER,yytext());}


{STRING}		{ Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("STRING");
         		listaToken.add(t);
			 return new Symbol(sym.STRING,yytext());}

{COMA}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("COMA");
         		listaToken.add(t);
				 return new Symbol(sym.COMA,yytext());}

{PUNTO}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("PUNTO");
         		listaToken.add(t);
				 return new Symbol(sym.PUNTO,yytext());}

{FIN_LINEA}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FIN_LINEA");
         		listaToken.add(t);
				 return new Symbol(sym.FIN_LINEA,yytext());}

{ASIGNACION}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("ASIGNACION");
         		listaToken.add(t);
				 return new Symbol(sym.ASIGNACION,yytext());}

{OP_LO_AND}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_LO_AND");
         		listaToken.add(t);
				 return new Symbol(sym.OP_LO_AND,yytext());}

{OP_LO_OR}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_LO_OR");
         		listaToken.add(t);
				 return new Symbol(sym.OP_LO_OR,yytext());}

{OP_LO_NOT}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_LO_NOT");
         		listaToken.add(t);
				 return new Symbol(sym.OP_LO_NOT,yytext());}

{OP_AR_SUM}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_SUM");
         		listaToken.add(t);
				 return new Symbol(sym.OP_AR_SUM,yytext());}

{OP_AR_RTO}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_RTO");
         		listaToken.add(t);
				 return new Symbol(sym.OP_AR_RTO,yytext());}

{OP_AR_POT}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_POT");
         		listaToken.add(t);
				 return new Symbol(sym.OP_AR_POT,yytext());}

{OP_AR_RES}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_RES");
         		listaToken.add(t);
				 return new Symbol(sym.OP_AR_RES,yytext());}

{OP_AR_MUL}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_MUL");
         		listaToken.add(t);
				 return new Symbol(sym.OP_AR_MUL,yytext());}

{OP_AR_DIV}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_AR_DIV");
         		listaToken.add(t);
				 return new Symbol(sym.OP_AR_DIV,yytext());}

{OP_CO_IGU}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_IGU");
         		listaToken.add(t);
				 return new Symbol(sym.OP_CO_IGU,yytext());}

{OP_CO_MAY}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_MAY");
         		listaToken.add(t);
				 return new Symbol(sym.OP_CO_MAY,yytext());}

{OP_CO_MEN}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_MEN");
         		listaToken.add(t);
				 return new Symbol(sym.OP_CO_MEN,yytext());}

{OP_CO_MAY_IGU}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_MAY_IGU");
         		listaToken.add(t);
				 return new Symbol(sym.OP_CO_MAY_IGU,yytext());}

{OP_CO_MEN_IGU}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_MEN_IGU");
         		listaToken.add(t);
				return new Symbol(sym.OP_CO_MEN_IGU,yytext()); }

{OP_CO_DIS}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_CO_DIS");
         		listaToken.add(t);
				 return new Symbol(sym.OP_CO_DIS,yytext());}

{OP_TRUE}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_TRUE");
         		listaToken.add(t);
				 return new Symbol(sym.OP_TRUE,yytext());}

{OP_FALSE}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("OP_FALSE");
         		listaToken.add(t);
				 return new Symbol(sym.OP_FALSE,yytext());}

{DECLARE}	 	{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("DECLARE");
         		listaToken.add(t);
				 return new Symbol(sym.DECLARE,yytext());}

{ENDDECLARE}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("ENDDECLARE");
         		listaToken.add(t);
				 return new Symbol(sym.ENDDECLARE,yytext());}

{COMILLA}		{}

{GUION}		 	{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("GUION");
         		listaToken.add(t);
				 return new Symbol(sym.GUION,yytext());}

{ESPACIO}		{}

{ESPECIALES}		{}


{IGUAL}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("IGUAL");
         		listaToken.add(t);
				 return new Symbol(sym.IGUAL,yytext());}


{BARRA}			{}

{FILTER}		{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("FILTER");
         		listaToken.add(t);
				 return new Symbol(sym.FILTER,yytext());}

{BEGIN}			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("BEGIN PROGRAM");
         		listaToken.add(t);
				 return new Symbol(sym.BEGIN,yytext());}

{END} 			{Token t = new Token(); 
         		t.setLexema(yytext());
         		t.setToken("END PROGRAM");
         		listaToken.add(t);
				 return new Symbol(sym.END,yytext());}

}

[^]		{ throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }