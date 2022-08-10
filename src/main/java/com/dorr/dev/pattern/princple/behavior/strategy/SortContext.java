package com.dorr.dev.pattern.princple.behavior.strategy;

public class SortContext {
    private SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] arr){
        return sortStrategy.sort(arr);
    }
}
