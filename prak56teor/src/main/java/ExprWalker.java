import com.antlr.ExprBaseListener;
import com.antlr.ExprParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ExprWalker extends ExprBaseListener {
    public void enterR(ExprParser.RContext ctx) {
        for(ParseTree tree:ctx.children){
            System.out.printf("%-20s",tree.getText());
            if (tree instanceof TerminalNode) {
                TerminalNode node = (TerminalNode)tree;
                Token symbol = node.getSymbol();
                switch (symbol.getType()){
                    case ExprParser.ID:
                        System.out.printf("%-20s","Идентификатор");
                        break;
                    case ExprParser.NUMBER:
                        System.out.printf("%-20s","Число");
                        break;
                    case ExprParser.ADD:
                        System.out.printf("%-20s","Знак операции 'сложение'");
                        break;
                    case ExprParser.DIV:
                        System.out.printf("%-20s","Знак операции 'деление'");
                        break;
                    case ExprParser.MUL:
                        System.out.printf("%-20s","Знак операции 'умножение'");
                        break;
                    case ExprParser.SUB:
                        System.out.printf("%-20s","Знак операции 'вычитание'");
                        break;
                    default:
                        System.out.printf("%-20s","Знак присвоения");
                        break;

                }
                System.out.println();
            }
        }
    }
}