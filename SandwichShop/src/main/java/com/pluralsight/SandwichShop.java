package com.pluralsight;

import java.util.Scanner;


public class SandwichShop {


    public static void main(String[] args) {

        //Create a scanner

        Scanner scanner = new Scanner(System.in);
        // Assign values to sandwiches

        double regularSandwich = 5.45;
        double largeSandwich = 8.95;



        System.out.print("Enter sandwich size: ");
        int sandwichSize = scanner.nextInt();
        System.out.println(sandwichSize);



        double price;
        if (sandwichSize == 1) {
            price = regularSandwich;
        } else
            price = largeSandwich;
        System.out.println("Cost of sandwich is: " + price);

//         create conditionals for the customers age

        System.out.println("Customer age is: ");
        int customerAge = scanner.nextInt();
        System.out.println(customerAge);

        System.out.println("Does Customer want loaded: ");
        boolean feedback = scanner.hasNextBoolean();
        System.out.println(feedback);
        feedback = true;

        double loadedPrice = 0;
        if (sandwichSize == 1 &  feedback)
            loadedPrice = regularSandwich + 1;
        else if (sandwichSize == 2 & feedback);
            loadedPrice = largeSandwich + 1.75;


        double discount;

        if (customerAge <= 17) {
            discount = loadedPrice * .10;
            System.out.print(loadedPrice - discount);
        }
        if (customerAge >= 65) {
            discount = loadedPrice * .20;
            System.out.print(loadedPrice - discount);

//
        }


    }
}
















