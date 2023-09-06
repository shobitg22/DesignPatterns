package ObserverPattern;

public interface Observable {

    void add(Observer observer);
    void remove(Observer observer);
    void setValue(String value);
    void notifyToObservers();
    String getValue();
}
