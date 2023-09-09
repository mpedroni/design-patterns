package com.codewithmosh.prototype;

public class Audio implements Component {
    @Override
    public Component clone() {
        // Audio component cloning logic
        return new Audio();
    }
}
