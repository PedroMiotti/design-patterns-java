package visitor;

public class Main {

    public static void main(String[] args){
        HtmlDocument document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new PlainTextOperation());
        document.execute(new HighlightOperation());

    }
}
