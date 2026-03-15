package com.gla.arrays.level1;
import java.util.*;
public class StudentsVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (age[i] >= 18) {
                System.out.println("The student with age " + age[i] + " can vote.");
            }
            else if (age[i]<18) {
                System.out.println("The student with age " + age[i] + " cannot vote.");
            }
            else {
                System.out.println("Invalid age.");
            }
        }
    }
}
