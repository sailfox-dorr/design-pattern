package com.dorr.dev.pattern.princple.behavior.iterator;

public class IteratorDemo {
    /**
     *
     * @param args
     *
     * 迭代器模式
     *
     */
    public static void main(String[] args) {


        ConcreteAggregate<Integer> agg = new ConcreteAggregate<>();

        agg.add(1);
        agg.add(3);
        agg.add(5);
        agg.add(7);
        agg.add(9);

        Iterator<Integer> iterator = agg.iterator();


        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
