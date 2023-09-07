package com.codewithmosh.decorator;

public class MainDecorator implements Renderable {
    Renderable artefact;

    public MainDecorator(Renderable artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Main]";
    }
}
