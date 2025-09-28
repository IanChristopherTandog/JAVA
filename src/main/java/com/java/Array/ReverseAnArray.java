package com.java.Array;

public class ReverseAnArray {
    public static void main(String[] args) {
//        Reverse an array
//        Example: {1, 2, 3, 4, 5} → {5, 4, 3, 2, 1}
        int[] numbers = {1,2,3,4,6};

        System.out.print("The reverse of this array is: ");
        for(int i = numbers.length -1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
