package com.java.Array;

public class CheckAnElement {
    public static void main(String[] args) {
//        Check if an element exists
//        Given an array and a number, check if the number exists inside the array.

        int[] numbers = {3, 5, 7 ,2 ,10};
        int check = 12;
        boolean found = false;

        for(int i : numbers){
            if(i == check){
                System.out.println("The given number that exists in the array is: " + i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("The given number does not exist in the Array!");
        }
    }
}
