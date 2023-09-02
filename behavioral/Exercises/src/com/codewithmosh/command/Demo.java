package com.codewithmosh.command;

public class Demo {
    public static void show() {
        var history = new History();
        var undo = new UndoCommand(history);
        var editor = new VideoEditor();

        System.out.println("before: " + editor);

        var setTextCommand = new SetTextCommand("new editor text", editor, history);
        setTextCommand.execute();

        System.out.println("after set text: " + editor);

        var setContrastCommand = new SetContrastCommand(0.1f, editor, history);
        setContrastCommand.execute();

        System.out.println("after set contrast: " + editor);

        undo.execute();
        undo.execute();

        System.out.println("after two undo: " + editor);
    }
}
