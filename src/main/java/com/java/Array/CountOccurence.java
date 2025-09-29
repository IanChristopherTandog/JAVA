package com.java.Array;

public class CountOccurence {
    public static void main(String[] args) {
//        Count occurrences of a number
//        Given an array and a number, count how many times it appears.
        //Solved in: 15 mins
        int[] numbers = {1,2,5,6,8,1,3,2,4,10};
        int searchNum = 1;
        int count = 0;

        for (int i : numbers){
            if(i == searchNum){
                count++;
            }
        }
        if(count > 0){
            System.out.println("The given number appeared in the array by: " + count + " times!");
        }
        else {
            System.out.println("The number does not occur in the array!");
        }
    }
}
