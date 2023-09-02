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

        divisor("Template Method");
        com.codewithmosh.template.Demo.show();
        divisor();

        divisor("Command");
        com.codewithmosh.command.Demo.show();
        divisor();

        divisor("Observer");
        com.codewithmosh.observer.Demo.show();
        divisor();

        divisor("Mediator");
        com.codewithmosh.mediator.Demo.show();
        divisor();
    }

    static void divisor(String title) {
        System.out.println("-------------== " + title + " ==-------------");
    }

    static void divisor() {
        System.out.print("\n\n");
    }
}
