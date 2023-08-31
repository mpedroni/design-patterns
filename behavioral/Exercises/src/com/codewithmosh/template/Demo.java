package com.codewithmosh.template;

import com.codewithmosh.template.windows.FullscreenWindow;
import com.codewithmosh.template.windows.HiddenWindow;
import com.codewithmosh.template.windows.Window;

public class Demo {
    public static void show() {
        Window hidden = new HiddenWindow();
        Window fullscreen = new FullscreenWindow();

        hidden.close();
        fullscreen.close();
    }
}
