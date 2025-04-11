package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    //In these exercise you will create basic console applications which prompt the
    //user for information and then perform calculations based on the user input.
    //Remember to do your work in the workbook-1 directory.
    //Remember to be conscious of the format and readability of your code.
    //* Use meaningful variable names
    //* Use whitespace and lines to organize your code and thoughts so that
    //others can easily understand your code
    //* Don't try to do multiple things on a single line of code - when in doubt
    //opt for code readability
    //EXERCISE 3
    //Create a Java application named BasicCalculator that reads in two floating point
    //numbers and then asks the user whether they want to add, subtract, multiply or
    //divide the two numbers.
    //For this exercise, only code the questions. We won’t actually calculate add,
    //subtract, multiply or divide. For this exercise, always multiply.
    //Step 1
    //Perform the requested operation and display the results.
    //Enter the first number: 5
    //Enter the second number: 12
    //Possible calculations:
    //(A)dd
    //(S)ubtract
    //(M)ultiply
    //(D)ivide
    //Please select an option: M
    //5 * 12 = 60

    public static void main(String[] args) {

        //Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Get the user ready for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        //Get the user ready for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        //Create a new variable for the combined sum of both numbers
        int total = num1 * num2;

        //Print final output

        System.out.println("Total is " + total);





    }












}

