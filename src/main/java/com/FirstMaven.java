package com;

public class FirstMaven {
    public static void main(String[] args) {
        printResultProduct(product(2, 2));
    }

    static int product(int a, int b) {
        return a * b;
    }

    static void printResultProduct(int result) {
        System.out.println("Произведение чисел равно " + result);
    }
}
