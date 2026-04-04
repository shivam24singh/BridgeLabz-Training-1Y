package com.gla.wrapperclass;
import java.util.Scanner;
public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Integer obj = num; // auto-boxing

        System.out.println("Primitive: " + num);
        System.out.println("Wrapper: " + obj);
    }
}
