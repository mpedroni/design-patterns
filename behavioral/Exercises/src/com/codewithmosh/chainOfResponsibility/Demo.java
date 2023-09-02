package com.codewithmosh.chainOfResponsibility;

public class Demo {
    public static void show() {
        var quickBooks = new QuickBooksReader(null);
        var numbers = new NumbersReader(quickBooks);
        var excel = new ExcelReader(numbers);

        var reader = excel;

        reader.read("spreadsheet.xls");
        reader.read("spreadsheet.numbers");
        reader.read("spreadsheet.qbw");
    }
}
