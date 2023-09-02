package com.codewithmosh.command;

public class SetContrastCommand extends AbstractUndoableCommand {
    private float contrast;
    private float previousContrast;

    public SetContrastCommand(float contrast, VideoEditor editor, History history) {
        super(editor, history);
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        previousContrast = editor.getContrast();
        editor.setContrast(contrast);
    }

    @Override
    public void undo() {
        editor.setContrast(previousContrast);
    }
}
