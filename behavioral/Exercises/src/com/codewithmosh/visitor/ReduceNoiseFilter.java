package com.codewithmosh.visitor;

public class ReduceNoiseFilter implements Filter {
    @Override
    public void apply(FactSegment segment) {
        System.out.println("Reducing noise of a fact segment.");
    }

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Reducing noise of a format segment.");
    }
}
