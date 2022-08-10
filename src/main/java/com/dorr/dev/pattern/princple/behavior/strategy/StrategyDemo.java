package com.dorr.dev.pattern.princple.behavior.strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 6, 7, 12, 9, 8};
        SortContext sortContext = new SortContext(new HeapSortStrategy());

        sortContext.sort(arr);
        for (int i : arr) {
            System.out.print(i  + "-> " );
        }
    }
}
