package com.codewithmosh.proxy;

public class Product {
    protected int id;
    protected String name;

    public Product(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    };

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
