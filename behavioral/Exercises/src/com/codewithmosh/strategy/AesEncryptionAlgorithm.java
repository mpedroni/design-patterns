package com.codewithmosh.strategy;

public class AesEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public void encrypt(String text) {
        System.out.println("Encrypting message using AES");
    }
}
