package com.codewithmosh.observer;

public class Demo {
    public static void show() {
        var tesla = new Stock("TSLA", 37.71f);
        var statusBar = new StatusBar();
        var listView = new StockListView();

        statusBar.addStock(tesla);
        listView.addStock(tesla);

        statusBar.show();
        listView.show();

        tesla.setPrice(38);
    }
}
