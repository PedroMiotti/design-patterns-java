package visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node){
        nodes.add(node);
    }

    // Extensibility point
    // We can create new operations without modifying this
    public void execute(Operation operation){
        for(var node: nodes){
            node.execute(operation);
        }
    }
}
