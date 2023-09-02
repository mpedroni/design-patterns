package com.codewithmosh.chainOfResponsibility;

public class ExcelReader extends DataReader {
    public ExcelReader(DataReader next) {
        super(next);
    }

    @Override
    protected String getExtension() {
        return ".xls";
    }

    @Override
    protected void doRead(String filename) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }
}
