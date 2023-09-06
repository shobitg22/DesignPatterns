package StrategyPattern;

public class StrategyContext {

    private SortingStrategy sortingStrategy;

    public StrategyContext(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void letsDoSomething(){
        sortingStrategy.doSort();
    }
}
