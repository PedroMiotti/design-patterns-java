package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>(); // The object added to this list will be notified

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for(var obs : observers)
            obs.update(); // The update method inside Observer Interface will be called when the value changes
    }
}
