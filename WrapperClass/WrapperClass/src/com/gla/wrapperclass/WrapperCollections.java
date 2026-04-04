package com.gla.wrapperclass;
import java.util.*;

public class WrapperCollections {
    public static void main(String[] args) {
        double[] arr = {10.5,20.0,35.75,5.5};

        ArrayList<Double> list = new ArrayList<>();

        for(double x: arr){
            list.add(x);
        }

        double max = Collections.max(list);

        double sum = 0;
        for(double x: list){
            sum += x;
        }

        System.out.println("Max: " + max);
        System.out.println("Avg: " + sum/list.size());
    }
}