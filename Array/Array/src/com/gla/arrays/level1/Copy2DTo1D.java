package com.gla.arrays.level1;
import java.util.*;
public class Copy2DTo1D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // rows
        int b = sc.nextInt(); // columns
        int[][] arr2d = new int[a][b];
        int[] arr1d = new int[a * b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr2d[i][j] = sc.nextInt();
            }
        }
        int d = 0;
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr1d[d] = arr2d[i][j];
                d++;
            }
        }
        System.out.println("1D Array Elements:");
        for(int k = 0; k < a * b; k++){
            System.out.println(arr1d[k]);
        }
    }
}