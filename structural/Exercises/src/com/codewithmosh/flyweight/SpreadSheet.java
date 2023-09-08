package com.codewithmosh.flyweight;

public class SpreadSheet {
  private final int MAX_ROWS = 3;
  private final int MAX_COLS = 3;

  // In a real app, these values should not be hardcoded here.
  // They should be read from a configuration file.
  private final String fontFamily = "Times New Roman";
  private final int fontSize = 12;
  private final boolean isBold = false;
  private final CellConfigFactory cellConfigFactory;

  private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

  public SpreadSheet(CellConfigFactory cellConfigFactory) {
    this.cellConfigFactory = cellConfigFactory;
    generateCells();
  }

  public void setContent(int row, int col, String content) {
    ensureCellExists(row, col);

    cells[row][col].setContent(content);
  }

  public void setFontFamily(int row, int col, String fontFamily) {
    ensureCellExists(row, col);

    var cell = cells[row][col];
    var currentConfig = cell.getConfig();
    cells[row][col].setConfig(cellConfigFactory.get(fontFamily, currentConfig.getFontSize(), currentConfig.isBold()));
  }

  private void ensureCellExists(int row, int col) {
    if (row < 0 || row >= MAX_ROWS)
      throw new IllegalArgumentException();

    if (col < 0 || col >= MAX_COLS)
      throw new IllegalArgumentException();
  }

  private void generateCells() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++) {
        var cell = new Cell(row, col, cellConfigFactory.get(fontFamily, fontSize, isBold));
        cells[row][col] = cell;
      }
  }

  public void render() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++)
        cells[row][col].render();
  }
}
