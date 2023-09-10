package com.codewithmosh;

import java.io.IOException;

public class Creational {

    public static void main(String[] args) throws IOException {
        divisor("Prototype");
        com.codewithmosh.prototype.Demo.show();
        divisor();

        divisor("Singleton");
        com.codewithmosh.singleton.Demo.show();
        divisor();

        divisor("Factory Method");
        com.codewithmosh.factory.Demo.show();
        divisor();

        divisor("Abstract Factory");
        com.codewithmosh.abstractFactory.Demo.show();
        divisor();
    }

    static void divisor(String pattern) {
        System.out.println("-------------== " + pattern + " ==-------------");
    }

    static void divisor() {
        System.out.print("\n\n");
    }
}
