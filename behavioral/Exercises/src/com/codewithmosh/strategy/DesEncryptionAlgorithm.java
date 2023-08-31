package com.codewithmosh.strategy;

public class DesEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public void encrypt(String text) {
        System.out.println("Encrypting message using DES");
    }
}
