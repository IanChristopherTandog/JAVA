package com.java.Conditional.Review;

public class Order {
    String name;
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order(String itemName, boolean filled, double cost, String shippingMethod) {
        name = itemName;
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        System.out.println("Order: " + name);
        if (billAmount > 24.00) {
            System.out.println("High value item!");
        } else {
            System.out.println("Low value item!");
        }

        if (isFilled) {
            System.out.println("Shipping " + name);
        } else {
            System.out.println("The order " + name +  " not yet ready");
        }

        double shippingCost = calculateShipping();

        System.out.println("Shipping cost: " + shippingCost);
        System.out.println("--------------------------");
    }

    public double calculateShipping() {
        double shippingCost;
        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }
        return shippingCost;
    }

    public static void main(String[] args) {
        // create instances and call methods here!
        Order Fastfood = new Order("Spaghetti",true, 50, "Regular");
        Order Snacks = new Order("Piatos",false, 100, "Express");

        Fastfood.ship();
        Snacks.ship();
    }
}
