package com.gla.arrays.level1;
import java.util.*;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        int index = 0;

        while (true) {
            System.out.print("Enter number: ");
            int value = sc.nextInt();
            if (value <= 0) {
                break;
            }
            if (index == 10) {
                break;
            }
            numbers[index] = value;
            index++;
        }
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }
        System.out.println("Sum = " + sum);
    }
}
