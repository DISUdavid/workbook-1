package com.pluralsight;

public class LoopingExerciseApp {
    public static void main(String[] args) throws InterruptedException {

        int lies = 0;
        int helpMe = 5;
        String iHateThis = "I love Java!";


        /* while (lies < helpMe) {
             lies++;
             //  System.out.println("I love Java!");
         }*/

       /* do {

            System.out.println(iHateThis);
            lies++;


        } while (lies < helpMe);*/

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000);
            if (i == 0) {
                continue;

            }

        }
        System.out.println("Launch!");
    }

}