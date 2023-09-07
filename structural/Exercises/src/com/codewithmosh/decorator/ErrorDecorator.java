package com.codewithmosh.decorator;

public class ErrorDecorator implements Renderable {
    private final Renderable artefact;

    public ErrorDecorator(Renderable artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Error]";
    }
}
