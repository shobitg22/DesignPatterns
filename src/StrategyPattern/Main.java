package StrategyPattern;

public class Main {
    public static void main(String[] args) {

        StrategyPattern strategyPattern = new StrategyPattern();
        strategyPattern.startStrategyPattern(new StrategyContext(new AgeSort()));
        strategyPattern.startStrategyPattern(new StrategyContext(new NameSort()));

    }
}
