package com.pluralsight;

import java.util.Scanner;


public class FullNameGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.println(firstName);


        Scanner middle = new Scanner(System.in);
        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();
        System.out.println(middleName);

        Scanner last = new Scanner(System.in);
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println(lastName);


        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println(fullName);


    }


}