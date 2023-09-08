package com.codewithmosh.flyweight;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private CellConfig config;

  public CellConfig getConfig() {
    return config;
  }

  public void setConfig(CellConfig config) {
    this.config = config;
  }

  public Cell(int row, int column, CellConfig config) {
    this.row = row;
    this.column = column;
    this.config = config;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, config.getFontFamily());
  }
}
