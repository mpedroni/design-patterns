package com.codewithmosh.visitor;

public class FormatSegment extends Segment {
    @Override
    public void apply(Filter filter) {
        filter.apply(this);
    }
}
