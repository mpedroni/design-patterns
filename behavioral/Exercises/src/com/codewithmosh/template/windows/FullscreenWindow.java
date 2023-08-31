package com.codewithmosh.template.windows;

import com.codewithmosh.template.windows.Window;

public class FullscreenWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Doing something before closing a fullscreen window...");
    }

    @Override
    protected void afterClose() {
        System.out.println("Doing something before after a fullscreen window...");
    }
}
