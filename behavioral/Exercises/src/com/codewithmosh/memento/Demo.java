package com.codewithmosh.memento;

public class Demo {
    public static void show() {
        Document d = new Document();
        History h = new History();

        d.setContent("Hello");
        d.setFontName("Arial");
        d.setFontSize(12);
        h.push(d.createState());

        d.setContent("World");
        d.setFontName("Times");
        d.setFontSize(14);
        h.push(d.createState());

        d.setContent("Goodbye");
        d.setFontName("Courier");
        d.setFontSize(10);

        System.out.println(d);

        d.restore(h.pop());
        System.out.println(d);
    }
}
