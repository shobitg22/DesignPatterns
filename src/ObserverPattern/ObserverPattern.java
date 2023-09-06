package ObserverPattern;

public class ObserverPattern {

    public void letsDoSomething(){
        Observable observable = new MovieObservable();
        Observer customerOne = new CustomerOneObserver(observable);
        Observer customerTwo = new CustomerTwoObserver(observable);
        observable.add(customerOne);
        observable.add(customerTwo);
        observable.setValue("ddlj");
        observable.setValue("bhagwan");

    }
}
