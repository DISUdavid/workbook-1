package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    //In these exercise you will create basic console applications which prompt the
    //user for information and then perform calculations based on the user input.
    //Remember to do your work in the workbook-1 directory.
    //Remember to be conscious of the format and readability of your code.
    //* Use meaningful variable names
    //* Use whitespace and lines to organize your code and thoughts so that
    //others can easily understand your code
    //* Don't try to do multiple things on a single line of code - when in doubt
    //opt for code readability

     public static void main(String[] args) {

         //Create scanner
         Scanner scanner =  new Scanner(System.in);

         //Identify data type and create according statement
         System.out.print("Enter your name: ");
         String name = scanner.next();

         //Scanner for hours
         System.out.print("Enter hours worked: ");
         double hoursWorked = scanner.nextDouble();

         //Scanner for pay rate
         System.out.print("Enter the pay rate: ");
         double payRate = scanner.nextDouble();

         //Find gross pay
         double grossPay = hoursWorked * payRate;

         //Show employee's name and gross pay
         System.out.println("Employee's name is " + name);
         System.out.println("Employee's gross pay is " + grossPay);



    }





}
