package com.codewithmosh.state;

public class Demo {
    public static void show() {
        DirectionService directionService = new DirectionService(new Walking());
        directionService.getDirection();
        directionService.getEta();
    }
}
