package com.codewithmosh.command;

public class UndoCommand implements Command {
    private History history;

    UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(history.size() > 0)
            history.pop().undo();
    }
}
