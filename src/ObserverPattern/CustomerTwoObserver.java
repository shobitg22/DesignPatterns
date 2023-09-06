package ObserverPattern;

public class CustomerTwoObserver implements Observer{

    private Observable observable;

    public CustomerTwoObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("CUSTOMER 2 says : "+observable.getValue().toUpperCase()+" movie has been released");

    }
}
