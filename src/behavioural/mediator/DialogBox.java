package mediator;

// The abstract mediator
public abstract class DialogBox {

    // When a UIControll objects changes, its going to call this method
    public abstract void changed(UIControl control);
}
