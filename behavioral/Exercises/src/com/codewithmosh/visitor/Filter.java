package com.codewithmosh.visitor;

public interface Filter {
    void apply(FactSegment factSegment);
    void apply(FormatSegment formatSegment);
}
