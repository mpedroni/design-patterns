package com.codewithmosh.chainOfResponsibility;

public abstract class DataReader {
    private DataReader next;

    DataReader(DataReader next) {
        this.next = next;
    }

    public void read(String fileName) {
        if(fileName.endsWith(getExtension())) {
            doRead(fileName);
            return;
        }

        if(next != null)
            next.read(fileName);
        else
            throw new UnsupportedOperationException("File format not supported.");
    }

    protected abstract String getExtension();

    protected abstract void doRead(String filename);
}
