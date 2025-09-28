package com.java.Array;

public class CountEvenAndOdd {
    public static void main(String[] args) {
//        Count even and odd numbers
//        Given an array of integers, count how many are even and how many are odd.
        int[] numbers = { 1, 4, 5, 6, 3, 2};
        int odd = 0;
        int even = 0;

        for (int i : numbers){
            if(i % 2 == 0){
                odd++;
            }
            else {
                even++;
            }
        }
        System.out.println("The total Odd numbers in this array is: " + even);
        System.out.println("The total Even numbers in this array is: " + odd);
    }
}
