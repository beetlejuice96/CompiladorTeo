package src;
//DO NOT EDIT
//Generated by JFlex 1.8.2 http://jflex.de/
//source: EjemploLexico.flex

import java.util.ArrayList;
import java.util.List;

import java_cup.runtime.Symbol;



//See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Lexico implements java_cup.runtime.Scanner {
	private List<Token> listaToken = new ArrayList();
/** This character denotes the end of file. */
public static final int YYEOF = -1;

/** Initial size of the lookahead buffer. */
private static final int ZZ_BUFFERSIZE = 16384;

// Lexical states.
public static final int YYINITIAL = 0;

/**
* ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
* ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
*                  at the beginning of a line
* l is of the form l = 2*k, k a non negative integer
*/
private static final int ZZ_LEXSTATE[] = {
  0, 0
};

/**
* Top-level table for translating characters to character classes
*/
private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

private static final String ZZ_CMAP_TOP_PACKED_0 =
 "\1\0\u10ff\u0100";

private static int [] zzUnpackcmap_top() {
 int [] result = new int[4352];
 int offset = 0;
 offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
 return result;
}

private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
 int i = 0;       /* index in packed string  */
 int j = offset;  /* index in unpacked array */
 int l = packed.length();
 while (i < l) {
   int count = packed.charAt(i++);
   int value = packed.charAt(i++);
   do result[j++] = value; while (--count > 0);
 }
 return j;
}


/**
* Second-level tables for translating characters to character classes
*/
private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
 "\11\0\2\1\1\0\1\1\24\0\1\2\1\3\2\4"+
 "\1\5\1\6\1\0\1\7\1\10\1\11\1\12\1\13"+
 "\1\14\1\15\1\16\12\17\1\20\1\21\1\22\1\23"+
 "\1\24\2\4\1\25\1\26\1\27\1\30\1\31\1\32"+
 "\1\33\1\34\1\35\2\0\1\36\1\37\1\40\1\41"+
 "\1\42\1\0\1\43\1\44\1\45\1\46\1\0\1\47"+
 "\3\0\1\50\1\0\1\51\1\52\1\53\1\0\32\54"+
 "\1\55\1\56\1\57\1\60\42\0\1\4\35\0\1\4"+
 "\2\0\1\4\u013d\0";

private static int [] zzUnpackcmap_blocks() {
 int [] result = new int[512];
 int offset = 0;
 offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
 return result;
}

private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
 int i = 0;       /* index in packed string  */
 int j = offset;  /* index in unpacked array */
 int l = packed.length();
 while (i < l) {
   int count = packed.charAt(i++);
   int value = packed.charAt(i++);
   do result[j++] = value; while (--count > 0);
 }
 return j;
}

/**
* Translates DFA states to action switch labels.
*/
private static final int [] ZZ_ACTION = zzUnpackAction();

private static final String ZZ_ACTION_PACKED_0 =
 "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\1\1"+
 "\1\6\1\7\1\10\1\11\1\12\1\13\1\1\1\14"+
 "\1\15\1\1\1\16\1\17\1\1\1\20\10\1\1\21"+
 "\1\22\1\23\1\1\1\24\1\25\1\1\1\26\1\27"+
 "\1\30\1\0\1\31\1\0\1\32\1\33\1\34\1\35"+
 "\1\36\1\37\1\40\1\41\2\0\1\42\5\0\1\43"+
 "\3\0\1\44\2\0\1\45\1\0\1\46\26\0\1\47"+
 "\1\50\5\0\1\51\12\0\1\52\4\0\1\53\1\54"+
 "\12\0\1\55\1\0\1\56\10\0\1\57\22\0\1\60"+
 "\3\0\1\61\3\0\1\62\17\0\1\63\1\0";

private static int [] zzUnpackAction() {
 int [] result = new int[182];
 int offset = 0;
 offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
 return result;
}

private static int zzUnpackAction(String packed, int offset, int [] result) {
 int i = 0;       /* index in packed string  */
 int j = offset;  /* index in unpacked array */
 int l = packed.length();
 while (i < l) {
   int count = packed.charAt(i++);
   int value = packed.charAt(i++);
   do result[j++] = value; while (--count > 0);
 }
 return j;
}


/**
* Translates a state to a row index in the transition table
*/
private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

private static final String ZZ_ROWMAP_PACKED_0 =
 "\0\0\0\61\0\61\0\142\0\223\0\61\0\61\0\304"+
 "\0\61\0\61\0\61\0\61\0\61\0\61\0\365\0\u0126"+
 "\0\u0157\0\u0188\0\61\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d"+
 "\0\u02ae\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3\0\61\0\61"+
 "\0\61\0\u03d4\0\u0405\0\61\0\u0436\0\61\0\61\0\61"+
 "\0\223\0\61\0\u0467\0\61\0\365\0\61\0\61\0\u0498"+
 "\0\61\0\61\0\61\0\u04c9\0\u04fa\0\61\0\u052b\0\u055c"+
 "\0\u058d\0\u05be\0\u05ef\0\61\0\u0620\0\u0651\0\u0682\0\61"+
 "\0\u06b3\0\u06e4\0\61\0\u0715\0\61\0\u0498\0\u0746\0\u0777"+
 "\0\u07a8\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff"+
 "\0\u0930\0\u0961\0\u0992\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87"+
 "\0\u0ab8\0\u0ae9\0\u0b1a\0\61\0\61\0\u0b4b\0\u0b7c\0\u0bad"+
 "\0\u0bde\0\u0c0f\0\u086c\0\u0c40\0\u0c71\0\u0ca2\0\u0cd3\0\u0d04"+
 "\0\u0d35\0\u0d66\0\u0d97\0\u0dc8\0\u0df9\0\61\0\u0e2a\0\u0e5b"+
 "\0\u0e8c\0\u0ebd\0\61\0\61\0\u0eee\0\u0f1f\0\u0f50\0\u0f81"+
 "\0\u0fb2\0\u0fe3\0\u1014\0\u1045\0\u1076\0\u10a7\0\61\0\u10d8"+
 "\0\61\0\u1109\0\u113a\0\u116b\0\u119c\0\u11cd\0\u11fe\0\u122f"+
 "\0\u1260\0\u1291\0\u12c2\0\u12f3\0\u1324\0\u1355\0\u1386\0\u13b7"+
 "\0\u13e8\0\u1419\0\u144a\0\u147b\0\u14ac\0\u14dd\0\u150e\0\u153f"+
 "\0\u1570\0\u15a1\0\u15d2\0\u1603\0\61\0\u1634\0\u1665\0\u1696"+
 "\0\61\0\u16c7\0\u16f8\0\u1729\0\61\0\u175a\0\u178b\0\u17bc"+
 "\0\u17ed\0\u1291\0\u181e\0\u184f\0\u1880\0\u18b1\0\u18e2\0\u1913"+
 "\0\u1944\0\u1975\0\u19a6\0\u19d7\0\61\0\u1a08";

private static int [] zzUnpackRowMap() {
 int [] result = new int[182];
 int offset = 0;
 offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
 return result;
}

private static int zzUnpackRowMap(String packed, int offset, int [] result) {
 int i = 0;  /* index in packed string  */
 int j = offset;  /* index in unpacked array */
 int l = packed.length();
 while (i < l) {
   int high = packed.charAt(i++) << 16;
   result[j++] = high | packed.charAt(i++);
 }
 return j;
}

/**
* The transition table of the DFA
*/
private static final int [] ZZ_TRANS = zzUnpackTrans();

private static final String ZZ_TRANS_PACKED_0 =
 "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
 "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
 "\1\22\1\23\1\24\1\25\1\26\1\2\1\27\1\2"+
 "\1\30\1\31\1\32\2\2\1\33\6\2\1\34\1\35"+
 "\1\2\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
 "\1\45\1\46\1\47\104\0\1\50\36\0\1\51\1\0"+
 "\1\52\13\0\1\51\33\0\1\53\1\51\12\0\1\54"+
 "\71\0\1\55\65\0\1\56\51\0\1\55\1\0\1\21"+
 "\64\0\1\57\53\0\1\60\4\0\1\61\60\0\1\62"+
 "\60\0\1\63\66\0\1\64\60\0\1\65\7\0\1\66"+
 "\55\0\1\67\1\0\1\70\45\0\1\71\10\0\1\72"+
 "\2\0\1\73\51\0\1\74\5\0\1\75\65\0\1\76"+
 "\47\0\1\77\4\0\1\100\1\0\1\101\51\0\1\102"+
 "\40\0\1\103\50\0\1\43\11\0\2\43\33\0\1\104"+
 "\1\43\62\0\1\105\16\0\1\51\45\0\1\106\1\107"+
 "\1\110\2\106\1\111\6\106\1\112\1\113\1\114\1\107"+
 "\1\106\1\115\1\107\1\115\3\0\1\116\1\117\1\120"+
 "\2\0\1\121\7\0\1\122\1\0\1\123\2\0\1\106"+
 "\1\124\2\106\1\125\2\106\33\0\1\126\54\0\1\127"+
 "\75\0\1\130\44\0\1\131\66\0\1\132\63\0\1\133"+
 "\62\0\1\134\62\0\1\135\56\0\1\136\46\0\1\137"+
 "\75\0\1\140\47\0\1\141\37\0\1\43\67\0\1\106"+
 "\36\0\1\110\1\0\1\106\13\0\1\110\33\0\1\142"+
 "\1\110\12\0\1\106\71\0\1\106\42\0\1\106\1\107"+
 "\1\110\2\106\1\111\6\106\1\112\1\113\1\114\1\107"+
 "\1\106\1\115\1\107\1\143\3\0\1\116\1\117\1\120"+
 "\2\0\1\121\7\0\1\122\1\0\1\123\2\0\1\106"+
 "\1\124\2\106\1\125\2\106\1\0\1\106\1\107\1\110"+
 "\2\106\1\111\7\106\1\113\1\114\1\107\1\106\1\115"+
 "\1\107\1\115\3\0\1\116\1\117\1\120\2\0\1\121"+
 "\7\0\1\122\1\0\1\123\2\0\1\106\1\124\2\106"+
 "\1\125\2\106\1\0\1\106\1\107\1\110\2\106\1\111"+
 "\6\106\1\112\1\113\1\114\1\107\1\106\3\115\3\0"+
 "\1\116\1\117\1\120\2\0\1\121\7\0\1\122\1\0"+
 "\1\123\2\0\1\106\1\124\2\106\1\125\2\106\31\0"+
 "\1\144\7\0\1\106\55\0\1\145\1\0\1\146\45\0"+
 "\1\147\13\0\1\150\51\0\1\106\62\0\1\151\4\0"+
 "\1\106\1\0\1\152\51\0\1\153\40\0\1\106\122\0"+
 "\1\106\37\0\1\154\61\0\1\155\53\0\1\156\44\0"+
 "\1\157\12\0\1\160\74\0\1\161\41\0\1\75\70\0"+
 "\1\162\63\0\1\163\51\0\1\164\65\0\1\165\36\0"+
 "\1\110\73\0\1\166\75\0\1\167\44\0\1\170\66\0"+
 "\1\145\65\0\1\106\46\0\1\171\75\0\1\167\47\0"+
 "\1\172\63\0\1\173\45\0\1\174\75\0\1\175\47\0"+
 "\1\176\60\0\1\177\67\0\1\200\51\0\1\201\65\0"+
 "\1\202\53\0\1\106\57\0\1\203\70\0\1\106\56\0"+
 "\1\167\37\0\1\204\106\0\1\205\60\0\1\206\44\0"+
 "\1\207\64\0\1\135\52\0\1\210\64\0\1\144\71\0"+
 "\1\211\47\0\1\212\70\0\1\213\55\0\1\214\65\0"+
 "\1\167\60\0\1\215\46\0\1\216\16\0\1\217\43\0"+
 "\1\220\52\0\1\221\74\0\1\222\57\0\1\223\71\0"+
 "\1\224\2\0\1\225\47\0\1\226\60\0\1\227\50\0"+
 "\1\230\55\0\1\231\50\0\1\232\44\0\1\225\6\0"+
 "\1\217\2\0\2\225\31\0\1\224\1\0\1\233\1\225"+
 "\31\0\1\234\64\0\1\235\72\0\1\236\45\0\1\237"+
 "\53\0\1\240\51\0\1\225\103\0\1\241\46\0\1\242"+
 "\64\0\1\243\77\0\1\244\47\0\1\245\50\0\1\246"+
 "\63\0\1\247\2\0\1\250\6\0\1\251\4\0\1\252"+
 "\45\0\1\253\60\0\1\254\62\0\1\255\65\0\1\256"+
 "\40\0\1\257\74\0\1\260\64\0\1\261\56\0\1\262"+
 "\60\0\1\263\42\0\1\255\46\0\1\244\16\0\1\247"+
 "\2\0\1\250\6\0\1\251\4\0\1\252\44\0\1\264"+
 "\54\0\1\265\67\0\1\266\53\0\1\261\25\0";

private static int [] zzUnpackTrans() {
 int [] result = new int[6713];
 int offset = 0;
 offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
 return result;
}

private static int zzUnpackTrans(String packed, int offset, int [] result) {
 int i = 0;       /* index in packed string  */
 int j = offset;  /* index in unpacked array */
 int l = packed.length();
 while (i < l) {
   int count = packed.charAt(i++);
   int value = packed.charAt(i++);
   value--;
   do result[j++] = value; while (--count > 0);
 }
 return j;
}


/** Error code for "Unknown internal scanner error". */
private static final int ZZ_UNKNOWN_ERROR = 0;
/** Error code for "could not match input". */
private static final int ZZ_NO_MATCH = 1;
/** Error code for "pushback value was too large". */
private static final int ZZ_PUSHBACK_2BIG = 2;

/**
* Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
* {@link #ZZ_PUSHBACK_2BIG} respectively.
*/
private static final String ZZ_ERROR_MSG[] = {
 "Unknown internal scanner error",
 "Error: could not match input",
 "Error: pushback value was too large"
};

/**
* ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
*/
private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

private static final String ZZ_ATTRIBUTE_PACKED_0 =
 "\1\0\2\11\2\1\2\11\1\1\6\11\4\1\1\11"+
 "\13\1\3\11\2\1\1\11\1\1\3\11\1\0\1\11"+
 "\1\0\1\11\1\1\2\11\1\1\3\11\2\0\1\11"+
 "\5\0\1\11\3\0\1\11\2\0\1\11\1\0\1\11"+
 "\26\0\2\11\5\0\1\1\12\0\1\11\4\0\2\11"+
 "\12\0\1\11\1\0\1\11\10\0\1\1\22\0\1\11"+
 "\3\0\1\11\3\0\1\11\17\0\1\11\1\0";

private static int [] zzUnpackAttribute() {
 int [] result = new int[182];
 int offset = 0;
 offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
 return result;
}

private static int zzUnpackAttribute(String packed, int offset, int [] result) {
 int i = 0;       /* index in packed string  */
 int j = offset;  /* index in unpacked array */
 int l = packed.length();
 while (i < l) {
   int count = packed.charAt(i++);
   int value = packed.charAt(i++);
   do result[j++] = value; while (--count > 0);
 }
 return j;
}

/** Input device. */
private java.io.Reader zzReader;

/** Current state of the DFA. */
private int zzState;

/** Current lexical state. */
private int zzLexicalState = YYINITIAL;

/**
* This buffer contains the current text to be matched and is the source of the {@link #yytext()}
* string.
*/
private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

/** Text position at the last accepting state. */
private int zzMarkedPos;

/** Current text position in the buffer. */
private int zzCurrentPos;

/** Marks the beginning of the {@link #yytext()} string in the buffer. */
private int zzStartRead;

/** Marks the last character in the buffer, that has been read from input. */
private int zzEndRead;

/**
* Whether the scanner is at the end of file.
* @see #yyatEOF
*/
private boolean zzAtEOF;

/**
* The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
*
* <p>When a lead/high surrogate has been read from the input stream into the final
* {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
*/
private int zzFinalHighSurrogate = 0;

/** Number of newlines encountered up to the start of the matched text. */
private int yyline;

/** Number of characters from the last newline up to the start of the matched text. */
private int yycolumn;

/** Number of characters up to the start of the matched text. */
private long yychar;

/** Whether the scanner is currently at the beginning of a line. */
@SuppressWarnings("unused")
private boolean zzAtBOL = true;

/** Whether the user-EOF-code has already been executed. */
private boolean zzEOFDone;


/**
* Creates a new scanner
*
* @param   in  the java.io.Reader to read input from.
*/
public Lexico(java.io.Reader in) {
 this.zzReader = in;
}

/**
* Translates raw input code points to DFA table row
*/
private static int zzCMap(int input) {
 int offset = input & 255;
 return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
}

/**
* Refills the input buffer.
*
* @return {@code false} iff there was new input.
* @exception java.io.IOException  if any I/O-Error occurs
*/
private boolean zzRefill() throws java.io.IOException {

 /* first: make room (if you can) */
 if (zzStartRead > 0) {
   zzEndRead += zzFinalHighSurrogate;
   zzFinalHighSurrogate = 0;
   System.arraycopy(zzBuffer, zzStartRead,
                    zzBuffer, 0,
                    zzEndRead - zzStartRead);

   /* translate stored positions */
   zzEndRead -= zzStartRead;
   zzCurrentPos -= zzStartRead;
   zzMarkedPos -= zzStartRead;
   zzStartRead = 0;
 }

 /* is the buffer big enough? */
 if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
   /* if not: blow it up */
   char newBuffer[] = new char[zzBuffer.length * 2];
   System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
   zzBuffer = newBuffer;
   zzEndRead += zzFinalHighSurrogate;
   zzFinalHighSurrogate = 0;
 }

 /* fill the buffer with new input */
 int requested = zzBuffer.length - zzEndRead;
 int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

 /* not supposed to occur according to specification of java.io.Reader */
 if (numRead == 0) {
   throw new java.io.IOException(
       "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
 }
 if (numRead > 0) {
   zzEndRead += numRead;
   if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
     if (numRead == requested) { // We requested too few chars to encode a full Unicode character
       --zzEndRead;
       zzFinalHighSurrogate = 1;
     } else {                    // There is room in the buffer for at least one more char
       int c = zzReader.read();  // Expecting to read a paired low surrogate char
       if (c == -1) {
         return true;
       } else {
         zzBuffer[zzEndRead++] = (char)c;
       }
     }
   }
   /* potentially more input available */
   return false;
 }

 /* numRead < 0 ==> end of stream */
 return true;
}


/**
* Closes the input reader.
*
* @throws java.io.IOException if the reader could not be closed.
*/
public final void yyclose() throws java.io.IOException {
 zzAtEOF = true; // indicate end of file
 zzEndRead = zzStartRead; // invalidate buffer

 if (zzReader != null) {
   zzReader.close();
 }
}


/**
* Resets the scanner to read from a new input stream.
*
* <p>Does not close the old reader.
*
* <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
* buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
*
* <p>Internal scan buffer is resized down to its initial length, if it has grown.
*
* @param reader The new input stream.
*/
public final void yyreset(java.io.Reader reader) {
 zzReader = reader;
 zzEOFDone = false;
 yyResetPosition();
 zzLexicalState = YYINITIAL;
 if (zzBuffer.length > ZZ_BUFFERSIZE) {
   zzBuffer = new char[ZZ_BUFFERSIZE];
 }
}

/**
* Resets the input position.
*/
private final void yyResetPosition() {
   zzAtBOL  = true;
   zzAtEOF  = false;
   zzCurrentPos = 0;
   zzMarkedPos = 0;
   zzStartRead = 0;
   zzEndRead = 0;
   zzFinalHighSurrogate = 0;
   yyline = 0;
   yycolumn = 0;
   yychar = 0L;
}


/**
* Returns whether the scanner has reached the end of the reader it reads from.
*
* @return whether the scanner has reached EOF.
*/
public final boolean yyatEOF() {
 return zzAtEOF;
}


/**
* Returns the current lexical state.
*
* @return the current lexical state.
*/
public final int yystate() {
 return zzLexicalState;
}


/**
* Enters a new lexical state.
*
* @param newState the new lexical state
*/
public final void yybegin(int newState) {
 zzLexicalState = newState;
}


/**
* Returns the text matched by the current regular expression.
*
* @return the matched text.
*/
public final String yytext() {
 return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
}


/**
* Returns the character at the given position from the matched text.
*
* <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
*
* @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
*
* @return the character at {@code position}.
*/
public final char yycharat(int position) {
 return zzBuffer[zzStartRead + position];
}


/**
* How many characters were matched.
*
* @return the length of the matched text region.
*/
public final int yylength() {
 return zzMarkedPos-zzStartRead;
}


/**
* Reports an error that occurred while scanning.
*
* <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
* match-all fallback rule) this method will only be called with things that
* "Can't Possibly Happen".
*
* <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
* scanner etc.).
*
* <p>Usual syntax/scanner level error handling should be done in error fallback rules.
*
* @param errorCode the code of the error message to display.
*/
private static void zzScanError(int errorCode) {
 String message;
 try {
   message = ZZ_ERROR_MSG[errorCode];
 } catch (ArrayIndexOutOfBoundsException e) {
   message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
 }

 throw new Error(message);
}


/**
* Pushes the specified amount of characters back into the input stream.
*
* <p>They will be read again by then next call of the scanning method.
*
* @param number the number of characters to be read again. This number must not be greater than
*     {@link #yylength()}.
*/
public void yypushback(int number)  {
 if ( number > yylength() )
   zzScanError(ZZ_PUSHBACK_2BIG);

 zzMarkedPos -= number;
}


/**
* Contains user EOF-code, which will be executed exactly once,
* when the end of file is reached
*/
private void zzDoEOF() throws java.io.IOException {
 if (!zzEOFDone) {
   zzEOFDone = true;
 
yyclose();    }
}




/**
* Resumes scanning until the next regular expression is matched, the end of input is encountered
* or an I/O-Error occurs.
*
* @return the next token.
* @exception java.io.IOException if any I/O-Error occurs.
*/
@Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
 int zzInput;
 int zzAction;

 // cached fields:
 int zzCurrentPosL;
 int zzMarkedPosL;
 int zzEndReadL = zzEndRead;
 char[] zzBufferL = zzBuffer;

 int [] zzTransL = ZZ_TRANS;
 int [] zzRowMapL = ZZ_ROWMAP;
 int [] zzAttrL = ZZ_ATTRIBUTE;

 while (true) {
   zzMarkedPosL = zzMarkedPos;

   yychar+= zzMarkedPosL-zzStartRead;

   boolean zzR = false;
   int zzCh;
   int zzCharCount;
   for (zzCurrentPosL = zzStartRead  ;
        zzCurrentPosL < zzMarkedPosL ;
        zzCurrentPosL += zzCharCount ) {
     zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
     zzCharCount = Character.charCount(zzCh);
     switch (zzCh) {
     case '\u000B':  // fall through
     case '\u000C':  // fall through
     case '\u0085':  // fall through
     case '\u2028':  // fall through
     case '\u2029':
       yyline++;
       yycolumn = 0;
       zzR = false;
       break;
     case '\r':
       yyline++;
       yycolumn = 0;
       zzR = true;
       break;
     case '\n':
       if (zzR)
         zzR = false;
       else {
         yyline++;
         yycolumn = 0;
       }
       break;
     default:
       zzR = false;
       yycolumn += zzCharCount;
     }
   }

   if (zzR) {
     // peek one character ahead if it is
     // (if we have counted one line too much)
     boolean zzPeek;
     if (zzMarkedPosL < zzEndReadL)
       zzPeek = zzBufferL[zzMarkedPosL] == '\n';
     else if (zzAtEOF)
       zzPeek = false;
     else {
       boolean eof = zzRefill();
       zzEndReadL = zzEndRead;
       zzMarkedPosL = zzMarkedPos;
       zzBufferL = zzBuffer;
       if (eof)
         zzPeek = false;
       else
         zzPeek = zzBufferL[zzMarkedPosL] == '\n';
     }
     if (zzPeek) yyline--;
   }
   zzAction = -1;

   zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

   zzState = ZZ_LEXSTATE[zzLexicalState];

   // set up zzAction for empty match case:
   int zzAttributes = zzAttrL[zzState];
   if ( (zzAttributes & 1) == 1 ) {
     zzAction = zzState;
   }


   zzForAction: {
     while (true) {

       if (zzCurrentPosL < zzEndReadL) {
         zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
         zzCurrentPosL += Character.charCount(zzInput);
       }
       else if (zzAtEOF) {
         zzInput = YYEOF;
         break zzForAction;
       }
       else {
         // store back cached positions
         zzCurrentPos  = zzCurrentPosL;
         zzMarkedPos   = zzMarkedPosL;
         boolean eof = zzRefill();
         // get translated positions and possibly new buffer
         zzCurrentPosL  = zzCurrentPos;
         zzMarkedPosL   = zzMarkedPos;
         zzBufferL      = zzBuffer;
         zzEndReadL     = zzEndRead;
         if (eof) {
           zzInput = YYEOF;
           break zzForAction;
         }
         else {
           zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
           zzCurrentPosL += Character.charCount(zzInput);
         }
       }
       int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
       if (zzNext == -1) break zzForAction;
       zzState = zzNext;

       zzAttributes = zzAttrL[zzState];
       if ( (zzAttributes & 1) == 1 ) {
         zzAction = zzState;
         zzMarkedPosL = zzCurrentPosL;
         if ( (zzAttributes & 8) == 8 ) break zzForAction;
       }

     }
   }

   // store back cached position
   zzMarkedPos = zzMarkedPosL;

   if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
     zzAtEOF = true;
         zzDoEOF();
       { return null; }
   }
   else {
     switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
      case 1:
         { throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline);
         }
         // fall through
       case 52: break;
       case 2:
         { /*System.out.println("Token ESPACIO encontrado, Lexema "+ yytext());*/
         }
         // fall through
       case 53: break;
       case 3:
         { /*System.out.println("Token COMILLA encontrado, Lexema "+ yytext());*/
         }
         // fall through
       case 54: break;
       case 4:
         { /*System.out.println("Token ESPECIALES encontrado, Lexema "+ yytext());*/
         }
         // fall through
       case 55: break;
       case 5:
         {// System.out.println("Token OP_AR_RTO encontrado, Lexema "+ yytext());
          Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_AR_RTO");
         listaToken.add(t);}
		
         // fall through
       case 56: break;
       case 6:
         {// System.out.println("Token PAREN_APER encontrado, Lexema "+ yytext());
        Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("PAREN_APER");
         listaToken.add(t);}
		 
         // fall through
       case 57: break;
       case 7:
         {// System.out.println("Token PAREN_CIER encontrado, Lexema "+ yytext());
            Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("PAREN_CIER");
         listaToken.add(t);}
		
         // fall through
       case 58: break;
       case 8:
         { //System.out.println("Token OP_AR_MUL encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_AR_MUL");
         listaToken.add(t);}

         // fall through
       case 59: break;
       case 9:
         { //System.out.println("Token OP_AR_SUM encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_AR_SUM");
         listaToken.add(t);}
         // fall through
       case 60: break;
       case 10:
         { System.out.println("Token COMA encontrado, Lexema "+ yytext());
         }
         // fall through
       case 61: break;
       case 11:
         {// System.out.println("Token OP_AR_RES encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_AR_RES");
         listaToken.add(t);}
         // fall through
       case 62: break;
       case 12:
         {// System.out.println("Token OP_AR_DIV encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_AR_DIV");
         listaToken.add(t);}
         // fall through
       case 63: break;
       case 13:
         {// System.out.println("Token CONST_INT, encontrado Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("CONST_INT");
         listaToken.add(t);}
         // fall through
       case 64: break;
       case 14:
         { //System.out.println("Token FIN_LINEA encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("FIN_LINEA");
         listaToken.add(t);}
         // fall through
       case 65: break;
       case 15:
         { //System.out.println("Token OP_CO_MEN encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_CO_MEN");
         listaToken.add(t);}
         // fall through
       case 66: break;
       case 16:
         { //System.out.println("Token OP_CO_MAY encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_CO_MAY");
         listaToken.add(t);}
         // fall through
       case 67: break;
       case 17:
         {// System.out.println("Token CORCHETE_APER encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("CORCHETE_APER");
         listaToken.add(t);}
		
         // fall through
       case 68: break;
       case 18:
         {// System.out.println("Token CORCHETE_CIER encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("CORCHETE_CIER");
         listaToken.add(t);}
         // fall through
       case 69: break;
       case 19:
         { //System.out.println("Token OP_AR_POT encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_AR_POT");
         listaToken.add(t);}
         // fall through
       case 70: break;
       case 20:
         {// System.out.println("Token VAR encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("VAR");
         listaToken.add(t);}
         // fall through
       case 71: break;
       case 21:
         { //System.out.println("Token LLAVE_APER encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("LLAVE_APER");
         listaToken.add(t);}
         // fall through
       case 72: break;
       case 22:
         {// System.out.println("Token LLAVE_CIER encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("LLAVE_CIER");
         listaToken.add(t);}
         // fall through
       case 73: break;
       case 23:
         { //System.out.println("Token OP_LO_NOT encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_LO_NOT");
         listaToken.add(t);}
         // fall through
       case 74: break;
       case 24:
         { //System.out.println("Token OP_CO_DIS encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_CO_DIS");
         listaToken.add(t);}
         // fall through
       case 75: break;
       case 25:
         { //System.out.println("Token CONST_STRING, encontrado Lexema "+ yytext());
         if (yytext().length() <= 30) {	
         	Token t = new Token(); 
             t.setLexema(yytext());
             t.setToken("CONST_STRING");
             t.setValor(yytext());
             t.setLongitud(yytext().length());
             listaToken.add(t);
             } else {
             	throw new Error("Excede la Longitud Maxima de un String, debe ser menor a 30 ");
             }
         }
         // fall through
       case 76: break;
       case 26:
         { //System.out.println("Token OP_LO_AND encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_LO_AND");
         listaToken.add(t);}
         // fall through
       case 77: break;
       case 27:
         {// System.out.println("Token FLOAT encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("FLOAT");
         listaToken.add(t);}
         // fall through
       case 78: break;
       case 28:
         { System.out.println("Token COMENTARIO_CIER encontrado, Lexema "+ yytext());
         }
         // fall through
       case 79: break;
       case 29:
         {//System.out.println("Token ASIGNACION encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("ASIGNACION");
         listaToken.add(t);}
         // fall through
       case 80: break;
       case 30:
         {//System.out.println("Token COMENTARIO_APER encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("COMENTARIO_APER");
         listaToken.add(t);}
         // fall through
       case 81: break;
       case 31:
         { //System.out.println("Token OP_CO_MEN_IGU encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_CO_MEN_IGU");
         listaToken.add(t);}
         // fall through
       case 82: break;
       case 32:
         {// System.out.println("Token OP_CO_IGU encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_CO_IGU");
         listaToken.add(t);}
         // fall through
       case 83: break;
       case 33:
         { //System.out.println("Token OP_CO_MAY_IGU encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_CO_MAY_IGU");
         listaToken.add(t);}
         // fall through
       case 84: break;
       case 34:
         { //System.out.println("Token WHILE_FIN encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("WHILE_FIN");
         listaToken.add(t);}
         // fall through
       case 85: break;
       case 35:
         { //System.out.println("Token IF_INICIO encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("IF_INICO");
         listaToken.add(t);}
         // fall through
       case 86: break;
       case 36:
         {// System.out.println("Token FOR_FIN encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("FOR_FIN");
         listaToken.add(t);}
         // fall through
       case 87: break;
       case 37:
         { /*System.out.println("Token GUION encontrado, Lexema "+ yytext());*/
         }
         // fall through
       case 88: break;
       case 38:
         {// System.out.println("Token OP_LO_OR encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_OR");
         listaToken.add(t);}
         // fall through
       case 89: break;
       case 39:
         { //System.out.println("Token FOR_INICIO encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("FOR_INICIO");
         listaToken.add(t);}
         // fall through
       case 90: break;
       case 40:
         { //System.out.println("Token TIPOS_DATOS encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("TIPOS_DATOS");
         listaToken.add(t);}
         // fall through
       case 91: break;
       case 41:
         { /*System.out.println("Token COMENTARIO encontrado, Lexema "+ yytext());*/
         }
         // fall through
       case 92: break;
       case 42:
         { //System.out.println("Token ELSE_IF encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("ELSE_IF");
         listaToken.add(t);}
         // fall through
       case 93: break;
       case 43:
         { //System.out.println("Token IF_FIN encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("IF_FIN");
         listaToken.add(t);}
         // fall through
       case 94: break;
       case 44:
         {// System.out.println("Token OP_TRUE encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_TRUE");
         listaToken.add(t);}
         // fall through
       case 95: break;
       case 45:
         {// System.out.println("Token OP_FALSE encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("OP_FALSE");
         listaToken.add(t);}
         // fall through
       case 96: break;
       case 46:
         { //System.out.println("Token WHILE_INICIO encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("WHILE_INICIO");
         listaToken.add(t);}
         // fall through
       case 97: break;
       case 47:
         { //System.out.println("Token DECLARE encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("DECLARE");
         listaToken.add(t);}
         // fall through
       case 98: break;
       case 48:
         { //System.out.println("Token ENDDECLARE encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("ENDDECLARE");
         listaToken.add(t);}
         // fall through
       case 99: break;
       case 49:
         { //System.out.println("Token FIN encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("FIN");
         listaToken.add(t);}
         // fall through
       case 100: break;
       case 50:
         { //System.out.println("Token INICIO encontrado, Lexema "+ yytext());
         Token t = new Token(); 
         t.setLexema(yytext());
         t.setToken("INICIO");
         listaToken.add(t);}
         // fall through
       case 101: break;
       case 51:
         { /*System.out.println("Token DECLARACION encontrado, Lexema "+ yytext());*/
         }
         // fall through
       case 102: break;
       default:
         zzScanError(ZZ_NO_MATCH);
     }
   }
 }
}
public void setListaToken(List<Token> lista) {this.listaToken = lista;} //Defino la lista que utilizaremos para los token
public List<Token> getListToken() {return listaToken;} //Nos devolvera la lista con todos los tokems

}