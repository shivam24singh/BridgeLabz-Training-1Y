package com.gla.arrays.level1;
import java.util.*;
public class TableFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int product = 0;
        int[] table = new int[10];
        for (int i = 6; i <= 9; i++) {
            product = product+ i*number;
            System.out.println(number + " * " + i + " = " + product);
            product = 0;
        }
    }
}