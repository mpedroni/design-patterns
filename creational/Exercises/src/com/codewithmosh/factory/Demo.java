package com.codewithmosh.factory;

public class Demo {
    public static void show() {
        var gregorian = new Scheduler();
        var arabian = new ArabianScheduler();

        gregorian.schedule(new Event());
        arabian.schedule(new Event());
    }
}
