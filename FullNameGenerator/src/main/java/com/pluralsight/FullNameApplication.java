package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = input.nextLine().trim();
        userName = userName.substring(0,1).toUpperCase() + userName.substring(1).toLowerCase();

        System.out.print("Please enter your middle name (if you have one): ");
        String userMiddleName = input.nextLine().trim();

        System.out.print("Please enter your last name : ");
        String userLastName = input.nextLine().trim();
        userLastName = userLastName.substring(0,1).toUpperCase() + userLastName.substring(1).toLowerCase();

        System.out.print("Please enter your suffix (if you have one): ");
        String userSuffix = input.nextLine();

        if (!userSuffix.isEmpty()) {
            userLastName += ",";
        }

        System.out.printf("Full name: %s %s %s %s", userName, userMiddleName, userLastName, userSuffix);

        input.close();
    }
}
