package com.java.Array;

public class MaximumNumber {
    public static void main(String[] args) {
//        Find the maximum number
//        Given an int[], find the largest element.
        int[] number = {5, 10, 30, 40, 15};
        int High = number[0];

        for (int i : number){
            if (i > High){
                High = i;
            }
            System.out.println(i);
        }
        System.out.println("The largest number in this array is:" + High);
    }
}
