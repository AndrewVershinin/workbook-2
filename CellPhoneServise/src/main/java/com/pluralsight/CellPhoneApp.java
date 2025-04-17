package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CellPhone newPhone = new CellPhone();


        System.out.print("What is the serial number?: ");
        int serialNumber = input.nextInt();
        input.nextLine();
        newPhone.setSerialNumber(serialNumber);


        System.out.print("What model is the phone?: ");
        String phoneModel = input.nextLine();
        newPhone.setModel(phoneModel);


        System.out.print("Who is the carrier?: ");
        String carrier = input.nextLine();
        newPhone.setCarrier(carrier);


        System.out.print("What is the phone number?: ");
        String phoneNumber = input.nextLine();
        newPhone.setPhoneNumber(phoneNumber);


        System.out.print("Who is the owner of the phone?: ");
        String phoneOwner = input.nextLine();
        newPhone.setOwner(phoneOwner);

        display(newPhone);

        newPhone.dial(newPhone.getPhoneNumber());
    }

    public static void display(CellPhone phone) {
        System.out.println("\nPhone Info:");
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
