package com.java.trash;

public class Test {
    public static void main(String[] args) {
        // a = rabbit, b = cat, c = dog
        // a + b = 10, a + c = 20, b + c = 24, a + b + c = ?
        int ab = 10;
        int ac = 20;
        int bc = 24;

        int sum = ab + ac + bc;
        int total = sum / 2;

        int a = total - bc;
        int b = total - ac;
        int c = total - ab;

        System.out.println("Rabbit weight + cat weight + dog weight = " + total);
        System.out.println("The rabbit weights: " + a);
        System.out.println("The cat weights: " + b);
        System.out.println("The dog weights: " + c);

    }
}
