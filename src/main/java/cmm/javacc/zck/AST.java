package cmm.javacc.zck;
import java.util.ArrayList; // import the ArrayList class

enum ASTType {
    Sentences, Sentence, FuncParamBracketExpr,
    FuncParamCommaExpr, FuncParamExpr, DeclCommaExpr, 
    DeclExpr, Type, Literal, CommaExpr, AssignExpr,
    LogicOrExpr
}

class AST {
    ASTType type;
    String origin;
    ArrayList<AST> children;
}