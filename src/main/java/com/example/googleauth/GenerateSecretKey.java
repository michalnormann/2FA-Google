package com.example.googleauth;

public class GenerateSecretKey {
    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println(utils.generateSecretKey());
    }
}
