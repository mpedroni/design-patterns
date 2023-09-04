package com.codewithmosh.visitor;

public class Demo {
    public static void show() {
        var file = WavFile.read("video-clip.wav");

        file.apply(new ReduceNoiseFilter());
        file.apply(new ReverbFilter());
        file.apply(new NormalizeFilter());
    }
}
