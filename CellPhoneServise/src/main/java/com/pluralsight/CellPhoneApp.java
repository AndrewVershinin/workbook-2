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

        System.out.println("\nPhone Info:");
        System.out.println("Serial number: " + newPhone.getSerialNumber());
        System.out.println("Model: " + newPhone.getModel());
        System.out.println("Carrier: " + newPhone.getCarrier());
        System.out.println("Phone Number: " + newPhone.getPhoneNumber());
        System.out.println("Owner: " + newPhone.getOwner());
    }
}
