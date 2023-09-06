package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class MovieObservable implements Observable{

    private List<Observer> observers = new ArrayList<>();
    private String movie;
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void setValue(String movie) {
        this.movie = movie;
        notifyToObservers();
    }

    @Override
    public void notifyToObservers() {
        observers.forEach(observer -> observer.update());
    }

    @Override
    public String getValue() {
        return movie;
    }
}
