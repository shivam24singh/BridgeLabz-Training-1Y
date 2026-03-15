package com.gla.arrays.level2;
import java.util.*;
public class LargestAndSecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        int sl=0;
        for(int i=0;i<10;i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    temp = 0;
                }
            }
        }
            System.out.println("Largest element : "+arr[0]);
            System.out.println("Second largest element : "+arr[1]);
    }
}
