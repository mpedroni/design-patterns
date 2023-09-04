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

        divisor("Chain of Responsibility");
        com.codewithmosh.chainOfResponsibility.Demo.show();
        divisor();

        divisor("Visitor");
        com.codewithmosh.visitor.Demo.show();
        divisor();
    }

    static void divisor(String pattern) {
        System.out.println("-------------== " + pattern + " ==-------------");
    }

    static void divisor() {
        System.out.print("\n\n");
    }
}
