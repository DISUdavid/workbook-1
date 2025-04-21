package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("CryPhone", "888-888", "Dave");

        phone.setSerialNumber(22);
        phone.setModel("CryPhone");
        phone.setOwner("Dave");
        phone.setPhoneNumber("888-888");

      //  System.out.println("Serial Number is: " + phone.getSerialNumber());
      //  System.out.println("Model of phone is: " + phone.getModel());

        CellPhone burnerPhone = new CellPhone();
        burnerPhone.setOwner("Ralph");
        burnerPhone.setPhoneNumber("777-8989");

      //  display(phone);
       // display(burnerPhone);

       // phone.dial(burnerPhone.getPhoneNumber());
        //burnerPhone.dial(phone.getPhoneNumber());

        CellPhone x = new CellPhone("Blackberry", " Carl", "444-0000");
        x.setPhoneNumber("414-0000");
        x.setOwner("Carl");
        x.setModel("BlackBerry");
        x.setSerialNumber(7890);

        display(x);



    }

    public static void display(CellPhone y) {
        System.out.println("owner: " + y.getOwner() );
        System.out.println("Phone Number:" + y.getPhoneNumber());
        System.out.println("Model: " + y.getModel());
        System.out.println("Serial Number: " + y.getSerialNumber());



    }







}
