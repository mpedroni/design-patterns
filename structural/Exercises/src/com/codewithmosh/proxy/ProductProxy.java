package com.codewithmosh.proxy;

public class ProductProxy extends Product {
    private DbContext db;

    public ProductProxy(int id, DbContext db) {
        super(id);
        this.db = db;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        db.markAsChanged(this);
    }
}
