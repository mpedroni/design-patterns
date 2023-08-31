package com.codewithmosh.template.windows;

import com.codewithmosh.template.windows.Window;

public class HiddenWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Doing something before closing a hidden window...");
    }

    @Override
    protected void afterClose() {
        System.out.println("Doing something after closing a hidden window...");
    }
}
