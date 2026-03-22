package com.gla.exception;

public class ThrowThrowsExample {

    static double calculateInterest(double amt, double rate, int years) throws IllegalArgumentException {
        if (amt < 0 || rate < 0) {
            throw new IllegalArgumentException();
        }
        return (amt * rate * years) / 100;
    }

    public static void main(String[] args) {
        try {
            System.out.println(calculateInterest(1000, 5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}