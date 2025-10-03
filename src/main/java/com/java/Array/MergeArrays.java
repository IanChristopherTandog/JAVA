package com.java.Array;

public class MergeArrays {
    public static void main(String[] args) {
//        Merge two arrays
//        Example: {1, 2, 3} + {4, 5} → {1, 2, 3, 4, 5}.
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};

        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++){
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++){
            merged[arr1.length + i] = arr2[i];
        }

        for (int num : merged){
            System.out.println(num);
        }

    }
}
