package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String userName = input.nextLine().trim();

        String[] nameParts = userName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String userDate = input.nextLine();
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(userDate, formatter);

        System.out.print("How many tickets would you like?: ");
        int ticket = input.nextInt();

        if (ticket == 1) {
            System.out.printf("%d ticket reserved for %s under %s, %s", ticket, date, lastName, firstName);
        } else {
            System.out.printf("%d tickets reserved for %s under %s, %s", ticket, date, lastName, firstName);
        }

        input.close();
    }
}
