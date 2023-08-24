package com.codewithmosh.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    Deque<DocumentState> states = new ArrayDeque<>();

    public void push(DocumentState state) {
        states.push(state);
    }

    public DocumentState pop() {
        return states.pop();
    }
}
