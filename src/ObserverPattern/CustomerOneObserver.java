package ObserverPattern;

public class CustomerOneObserver implements Observer{

    private Observable observable;

    public CustomerOneObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("CUSTOMER 1 says : "+observable.getValue().toUpperCase()+" movie has been released");
    }
}
