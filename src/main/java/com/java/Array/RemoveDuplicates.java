package com.java.Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        int[] copy = new int[numbers.length]; // new array for unique numbers
        int j = 0; // index for copy[]

        for (int i = 0; i < numbers.length; i++) {
            boolean exists = false;

            // check if numbers[i] already exists in copy[]
            for (int k = 0; k < j; k++) {
                if (numbers[i] == copy[k]) {
                    exists = true;
                    break;
                }
            }

            // if not a duplicate, add to copy[]
            if (!exists) {
                copy[j] = numbers[i];
                j++;
            }
        }

        // print result
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
