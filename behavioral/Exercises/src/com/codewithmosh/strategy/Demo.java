package com.codewithmosh.strategy;

public class Demo {
    public static void show() {
        ChatClient des = new ChatClient(new DesEncryptionAlgorithm());
        ChatClient aes = new ChatClient(new AesEncryptionAlgorithm());

        des.send("Hello!");
        aes.send("Hi there!");
    }
}
