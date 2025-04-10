package com.pluralsight;

import com.sun.tools.javac.Main;

public class MathApp {

    public static void main(String[] args) {

        double bobSalary = 42000;
        double garySalary = 450000.77;


        double highest = Math.max(garySalary, bobSalary);

        // System.out.println("highest is " + highest);

        double carPrice = 1400;
        double truckPrice = 1700;

        double lowestPrice = Math.min(carPrice,truckPrice);

        //System.out.println("lowest is "+ lowestPrice);

        double circleRadius = 7.5;

        double area = Math.PI * (circleRadius * circleRadius);

       // System.out.println("area is "+ area);


        double x = 5.0;
        double origin = Math.sqrt(x);

       // System.out.println(origin);

        int honda = 5;
        int nissan = 85;
        int suburu = 10;
        int toyota = 50;

        int distanceBetween = honda - nissan;
        int distanceBetween2 = suburu - toyota;

        //System.out.println(distanceBetween2);
        //System.out.println(distanceBetween);

        double junior = -3.8;

       double absolute = Math.abs(junior);

       // System.out.println(absolute);

         double vlad = 0;
        double conroy = 1;

        double middle = Math.random();

        System.out.println(middle);




    }


}