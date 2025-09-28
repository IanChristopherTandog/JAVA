package com.java.Array;

public class SumOfArray {
    public static void main(String[] args) {
        //Task: Sum of array elements
        //Write a program that takes an int[] and calculates the total

        int numbers[] = {10,20,30,40,50};
        int total = 0;

        for (int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }
        System.out.println("The Sum of the array elements is: " + total);
    }
}
