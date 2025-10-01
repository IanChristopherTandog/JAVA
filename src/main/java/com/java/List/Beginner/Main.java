package com.java.List.Beginner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Create a list
        List <String> list = new ArrayList<>();

        //Add elements in the list
        list.add("Grapes");
        list.add("Orange");
        list.add("Banana");

        //Print the list
        System.out.println("Lists: " + list);

        //Print the first and last element in the list
        System.out.println("First element: " + list.get(0));
        System.out.println("Last element: " + list.get(list.size()-1));

        //Replace the first element to Mango
        list.set(0, "Mango");
        //Chec if the element wa updated
        System.out.println("Updated element" + list.get(0));
        //Print the updated list
        System.out.println("Updated list:" + list);

        //Remove an element
        list.remove("Banana");

        //Check the updated list
        System.out.println(list);

    }
}
