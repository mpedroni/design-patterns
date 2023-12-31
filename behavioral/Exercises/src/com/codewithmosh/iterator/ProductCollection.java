package com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator createIterator() {
    return new ListIterator(this);
  }

  private class ListIterator implements Iterator<Product> {
    private ProductCollection collection;
    private int index;

    public ListIterator(ProductCollection collection) {
      this.collection = collection;
      index = 0;
    }

    @Override
    public boolean hasNext() {
      return index < collection.products.size();
    }

    @Override
    public void next() {
      index++;
    }

    @Override
    public Product current() {
      return collection.products.get(index);
    }
  }

}
