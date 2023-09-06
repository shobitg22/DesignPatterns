package StrategyPattern;

public class AgeSort implements SortingStrategy{
    @Override
    public void doSort() {
        System.out.println("I do Age Sorting");
    }
}
