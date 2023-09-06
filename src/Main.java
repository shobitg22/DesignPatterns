import ObserverPattern.ObserverPattern;
import StrategyPattern.*;

public class Main {
    public static void main(String[] args) {

//                      ***** STRATEGY DESIGN PATTERN *****
         StrategyPattern strategyPattern = new StrategyPattern();
         strategyPattern.startStrategyPattern(new StrategyContext(new AgeSort()));
         strategyPattern.startStrategyPattern(new StrategyContext(new NameSort()));

//                      ***** OBSERVER DESIGN PATTERN *****
         ObserverPattern observerPattern = new ObserverPattern();
         observerPattern.letsDoSomething();
   }
}