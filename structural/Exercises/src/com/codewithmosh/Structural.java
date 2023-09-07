package com.codewithmosh;

public class Structural {
    public static void main(String[] args) {
        divisor("Composite");
        com.codewithmosh.composite.Demo.show();
        divisor();

        divisor("Adapter");
        com.codewithmosh.adapter.Demo.show();
        divisor();

        divisor("Decorator");
        com.codewithmosh.decorator.Demo.show();
        divisor();
    }

    static void divisor(String pattern) {
        System.out.println("-------------== " + pattern + " ==-------------");
    }

    static void divisor() {
        System.out.print("\n\n");
    }
}
