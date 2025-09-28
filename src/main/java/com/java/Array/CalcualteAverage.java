package com.java.Array;

public class CalcualteAverage {
    public static void main(String[] args) {
//        Calculate average
//        Find the average of all elements in an array.
        int[] numbers = {2, 3, 4, 6, 10, 15};
        int total = 0;

        for(int i : numbers){
            total += i;
        }
        int ave = total / numbers.length;
        System.out.println("The total of this array is: " + ave);
    }
}
