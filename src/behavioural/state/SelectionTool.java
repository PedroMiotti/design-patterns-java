package behavioural.state;

public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Drew dotted rectangle");
    }

}
