package com.codewithmosh.visitor;

public class NormalizeFilter implements Filter {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalizing a fact segment.");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalizing a format segment.");
    }
}
