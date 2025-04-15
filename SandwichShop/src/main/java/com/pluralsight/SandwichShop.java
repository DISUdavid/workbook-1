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


        double discount;

        if (customerAge <= 17) {
            discount = price * .10;
            System.out.print(price - discount);
        }
        if (customerAge >= 65) {
            discount = price * .20;
            System.out.print(price - discount);

        } else {
            System.out.println(price);
        }

    }
}
















