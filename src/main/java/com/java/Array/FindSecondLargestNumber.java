package com.java.Array;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
//        Find second largest number
//        Example: {3, 8, 12, 5} → second largest = 8.
//        Solved in: 22:59.21 minutes
        int[] numbers = {3, 8, 12, 5, -3};
        //Use Integer.MIN_VALUE to represent the smallest value an int can hold
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int i : numbers){
            //Find the largest number and update both the largest and second largest number
            if (i > largestNumber){
                secondLargestNumber = largestNumber ;
                largestNumber = i;
            }
            // Update second largest if it's not equal to largest
            else if(i > secondLargestNumber && i != largestNumber){
                secondLargestNumber = i;
            }
        }
        System.out.println("The largest number in this array is: " + largestNumber);
        System.out.println("The second largest number in this array is: " + secondLargestNumber);
    }
}
