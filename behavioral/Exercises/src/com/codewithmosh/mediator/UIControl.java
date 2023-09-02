package com.codewithmosh.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    List<EventHandler> handlers = new ArrayList<>();

    public void addHandler(EventHandler handler) {
        handlers.add(handler);
    }

    protected void notifyHandlers() {
        for(var handler : handlers)
            handler.handle();
    }
}
