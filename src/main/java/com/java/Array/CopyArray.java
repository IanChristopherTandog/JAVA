package com.java.Array;

public class CopyArray {
    public static void main(String[] args) {
//        Copy an array
//        Create a new array that is an exact copy of the original.
        int[] numbers = {1, 4, 3, 5 ,7};
        int[] copy = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }

        System.out.print("Original: ");
        for (int i : numbers){
            System.out.print(i + " ");
        }

        System.out.println("");

        System.out.print("Copy: ");
        for(int i : copy){
            System.out.print(i + " ");
        }
    }
}
