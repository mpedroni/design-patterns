package com.codewithmosh.prototype;

public class Clip implements Component {
    @Override
    public Component clone() {
        // Clip component cloning logic
        return new Clip();
    }
}
