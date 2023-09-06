package StrategyPattern;

public class NameSort implements SortingStrategy{
    @Override
    public void doSort() {
        System.out.println("I do Name Sorting");
    }
}
