package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        divisor("Memento");
        com.codewithmosh.memento.Demo.show();
        divisor();

        divisor("State");
        com.codewithmosh.state.Demo.show();
        divisor();

        divisor("Iterator");
        com.codewithmosh.iterator.Demo.show();
        divisor();

        divisor("Strategy");
        com.codewithmosh.strategy.Demo.show();
        divisor();
    }

    static void divisor(String title) {
        System.out.println("-------------== " + title + " ==-------------");
    }

    static void divisor() {
        System.out.print("\n\n");
    }
}
