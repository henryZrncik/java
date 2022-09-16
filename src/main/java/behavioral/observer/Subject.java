package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();

    void registerObserver(Observer o){
        observers.add(o);
    }
    void notifyObservers(String news){
        for (Observer o: observers) {
            o.react(news);
        }
    }
}
