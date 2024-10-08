package com.example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AvailableHashAlgorithms {

    private static final String[] COMMON_HASH_ALGORITHMS = {
        "MD5", "SHA-1", "SHA-256", "SHA-384", "SHA-512"
    };

    public static void main(String[] args) {
        for (String algorithm : COMMON_HASH_ALGORITHMS) {
            try {
                MessageDigest md = MessageDigest.getInstance(algorithm);
                System.out.println(algorithm + " è disponibile.");
            } catch (NoSuchAlgorithmException e) {
                System.out.println(algorithm + " non è disponibile.");
            }
        }
    }
}
