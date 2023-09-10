package com.codewithmosh.builder;

public class TextDocumentBuilder implements DocumentBuilder {
    private StringBuilder builder = new StringBuilder();

    @Override
    public void addText(Text text) {
        builder.append(text.getContent());
    }

    @Override
    public void addImage(Image image) {
        // cannot add images to a plain text document
    }

    @Override
    public String build() {
        return builder.toString();
    }
}
