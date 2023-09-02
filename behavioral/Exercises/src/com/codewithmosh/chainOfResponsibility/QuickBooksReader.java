package com.codewithmosh.chainOfResponsibility;

public class QuickBooksReader extends DataReader {
    public QuickBooksReader(DataReader next) {
        super(next);
    }

    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    protected void doRead(String filename) {
        System.out.println("Reading data from a QuickBooks file.");
    }
}
