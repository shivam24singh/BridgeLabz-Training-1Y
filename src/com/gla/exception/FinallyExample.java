package com.gla.exception;

import java.util.*;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Operation completed");
        }
    }
}