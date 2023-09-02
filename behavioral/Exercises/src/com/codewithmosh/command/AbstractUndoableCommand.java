package com.codewithmosh.command;

public abstract class AbstractUndoableCommand implements UndoableCommand {
    protected VideoEditor editor;
    protected History history;

    AbstractUndoableCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
