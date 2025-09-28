package com.java.Array;

public class SmallestNumber {
    public static void main(String[] args) {
//        Find the smallest element
//        Similar to finding max, but this time find the minimum value.

        int[] numbers = {2, 3, 4, 5, 10, 1};
        int min = numbers[0];

        for (int i : numbers){
            if (i < min){
                min = i;
            }
        }
        System.out.println("The lowest number in this array is: " + min);
    }
}
