/* Generated By:JavaCC: Do not edit this line. CMMParserConstants.java */
package cmm.javacc.zck;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface CMMParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int IF = 13;
  /** RegularExpression Id. */
  int ELSE = 14;
  /** RegularExpression Id. */
  int WHILE = 15;
  /** RegularExpression Id. */
  int BREAK = 16;
  /** RegularExpression Id. */
  int CONTINUE = 17;
  /** RegularExpression Id. */
  int RETURN = 18;
  /** RegularExpression Id. */
  int INT = 19;
  /** RegularExpression Id. */
  int REAL = 20;
  /** RegularExpression Id. */
  int CHAR = 21;
  /** RegularExpression Id. */
  int VOID = 22;
  /** RegularExpression Id. */
  int LCB = 23;
  /** RegularExpression Id. */
  int RCB = 24;
  /** RegularExpression Id. */
  int SEMI = 25;
  /** RegularExpression Id. */
  int LRB = 26;
  /** RegularExpression Id. */
  int RRB = 27;
  /** RegularExpression Id. */
  int ASN = 28;
  /** RegularExpression Id. */
  int LSB = 29;
  /** RegularExpression Id. */
  int RSB = 30;
  /** RegularExpression Id. */
  int LT = 31;
  /** RegularExpression Id. */
  int LTE = 32;
  /** RegularExpression Id. */
  int EQ = 33;
  /** RegularExpression Id. */
  int NEQ = 34;
  /** RegularExpression Id. */
  int GT = 35;
  /** RegularExpression Id. */
  int GTE = 36;
  /** RegularExpression Id. */
  int ADD = 37;
  /** RegularExpression Id. */
  int SUB = 38;
  /** RegularExpression Id. */
  int MUL = 39;
  /** RegularExpression Id. */
  int DIV = 40;
  /** RegularExpression Id. */
  int CMMA = 41;
  /** RegularExpression Id. */
  int LAND = 42;
  /** RegularExpression Id. */
  int BAND = 43;
  /** RegularExpression Id. */
  int LOR = 44;
  /** RegularExpression Id. */
  int BOR = 45;
  /** RegularExpression Id. */
  int BXOR = 46;
  /** RegularExpression Id. */
  int LNT = 47;
  /** RegularExpression Id. */
  int BNT = 48;
  /** RegularExpression Id. */
  int DEC = 49;
  /** RegularExpression Id. */
  int INC = 50;
  /** RegularExpression Id. */
  int MOD = 51;
  /** RegularExpression Id. */
  int ILT = 52;
  /** RegularExpression Id. */
  int RLT = 53;
  /** RegularExpression Id. */
  int DIGITS = 54;
  /** RegularExpression Id. */
  int CLT = 55;
  /** RegularExpression Id. */
  int SLT = 56;
  /** RegularExpression Id. */
  int ID = 57;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int WithinMultiComment = 1;
  /** Lexical state. */
  int WithinLineComment = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\r\\n\"",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 7>",
    "\"//\"",
    "\"\\r\"",
    "\"\\n\"",
    "\"\\r\\n\"",
    "<token of kind 12>",
    "\"if\"",
    "\"else\"",
    "\"while\"",
    "\"break\"",
    "\"continue\"",
    "\"return\"",
    "\"int\"",
    "\"real\"",
    "\"char\"",
    "\"void\"",
    "\"{\"",
    "\"}\"",
    "\";\"",
    "\"(\"",
    "\")\"",
    "\"=\"",
    "\"[\"",
    "\"]\"",
    "\"<\"",
    "\"<=\"",
    "\"==\"",
    "\"<>\"",
    "\">\"",
    "\">=\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\",\"",
    "\"&&\"",
    "\"&\"",
    "\"||\"",
    "\"|\"",
    "\"^\"",
    "\"!\"",
    "\"~\"",
    "\"--\"",
    "\"++\"",
    "\"%\"",
    "<ILT>",
    "<RLT>",
    "<DIGITS>",
    "<CLT>",
    "<SLT>",
    "<ID>",
  };

}