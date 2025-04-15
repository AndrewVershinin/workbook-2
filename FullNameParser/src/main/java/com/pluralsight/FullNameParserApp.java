package com.pluralsight;
import java.util.Scanner;

public class FullNameParserApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your full name \n(include the middle name if you have one, if it is not enter none): ");

        String userFullName = input.nextLine().trim();
        String firstName = userFullName.split(" ")[0];
        String middleName = userFullName.split(" ")[1];
        String lastName = userFullName.split(" ")[2];



        System.out.printf("First name: %s\n", firstName);
        System.out.printf("Middle name: %s\n", middleName);
        System.out.printf("Last name: %s\n", lastName);

        input.close();
    }
}
