package com.codewithmosh;

import java.io.IOException;

public class Creational {

    public static void main(String[] args) throws IOException {
        divisor("Prototype");
        com.codewithmosh.prototype.Demo.show();
        divisor();
    }

    static void divisor(String pattern) {
        System.out.println("-------------== " + pattern + " ==-------------");
    }

    static void divisor() {
        System.out.print("\n\n");
    }
}
