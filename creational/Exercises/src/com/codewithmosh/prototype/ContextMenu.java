package com.codewithmosh.prototype;

public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        System.out.println("adding a cloned component in timeline");
        timeline.add(component.clone());
    }
}
