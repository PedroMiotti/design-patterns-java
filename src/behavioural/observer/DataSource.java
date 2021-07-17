package behavioural.observer;

public class DataSource extends Subject{
    private int value; // Whenever this value changes, other objects has to be notified

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }
}
