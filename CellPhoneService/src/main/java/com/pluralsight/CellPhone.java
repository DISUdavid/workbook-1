package com.pluralsight;

import java.util.Scanner;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String owner;
    private String phoneNumber;

    public CellPhone() {

    }
    public CellPhone(String model, String owner, String phoneNumber){
        this.model = model;


    }


    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void dial(String phoneNumber) {
       System.out.println(this.owner + "'s phone is calling " + phoneNumber);



    }




    }




