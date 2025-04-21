package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String fullName = scanner.nextLine().trim();

        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            System.out.println("First name is " + " " + firstName);
            System.out.println("Last Name is " + " " + lastName);

        } else if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];
            System.out.println("First name is " + " " + firstName);
            System.out.println("Middle name is " + " " + middleName);
            System.out.println("Last name is " + " " + lastName);

        } else {
            System.out.print("Invalid Name Input, Try Again :).");
        }


    }

}
