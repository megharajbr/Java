package com.example;

public class App {

    public static int biggest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        System.out.println("Biggest = " + biggest(10, 25, 15));
        System.out.println("Factorial = " + factorial(5));
        System.out.println("Reverse = " + reverse(12345));
    }
}
