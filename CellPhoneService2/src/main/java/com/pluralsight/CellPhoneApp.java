package com.pluralsight;

public class CellPhoneApp {

    public static void main(String[] args) {

        CellPhone x;
        x = new CellPhone();
        x.model = "Android";
        x.displayInfo();

        CellPhone iphone;
        iphone = new CellPhone();
        iphone.model = "IPhone";

        iphone.displayInfo();

    }

}
