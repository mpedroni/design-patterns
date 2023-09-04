package com.codewithmosh.visitor;

public class FactSegment extends Segment {
    @Override
    public void apply(Filter filter) {
        filter.apply(this);
    }
}
