package com.codewithmosh.iterator;

public class Demo {
    public static void show() {
        var collection = new ProductCollection();
        collection.add(new Product(1, "📚 Harry Potter and the Philosopher's Stone"));
        collection.add(new Product(2, "📚 Harry Potter and the Chamber of Secrets"));
        collection.add(new Product(3, "📚 Harry Potter and the Prisoner of Azkaban"));

        Iterator it = collection.createIterator();

        while(it.hasNext()) {
            System.out.println(it.current());
            it.next();
        }
    }
}
