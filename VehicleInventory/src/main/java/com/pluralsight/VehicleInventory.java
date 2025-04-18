package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Vehicle[] inventory = new Vehicle[20];

        int vehicleCount = 6;

        inventory[0] = new Vehicle(100001, "VW Jetta GLI", "White", 12000, 30000f );
        inventory[1] = new Vehicle(100002, "Alfa Romeo Gulia Ti", "Green", 22000, 34000f );
        inventory[2] = new Vehicle(100003, "KIA Soul", "Gray", 45000, 15000f );
        inventory[3] = new Vehicle(100004, "Honda Civic Hybrid", "Blue", 2000, 32000f );
        inventory[4] = new Vehicle(100005, "Lexus IS 350", "White", 42000, 28000f );
        inventory[5] = new Vehicle(100006, "VW Jetta", "Gray", 18000, 19000f );



        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price rang");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.print("Enter your command:");

            int userInput = input.nextInt();
            input.nextLine();

            switch (userInput) {
                case 1:
                    System.out.println("All vehicles:");
                    for (int i = 0; i < vehicleCount; i++) {
                        System.out.println(inventory[i].getVehicleId() + " - " +
                                inventory[i].getMakeModel() + " - " +
                                inventory[i].getColor() + " - " +
                                inventory[i].getOdometerReading() + " miles - $" +
                                inventory[i].getPrice());
                    }
                    break;
                case 2:
                    System.out.print("Enter make/model to search: ");
                    String search = input.nextLine().toLowerCase();
                    for (int i = 0; i < vehicleCount; i++) {
                        if (inventory[i].getMakeModel().toLowerCase().contains(search)) {
                            System.out.println(inventory[i].getVehicleId() + " - " +
                                    inventory[i].getMakeModel() + " - " +
                                    inventory[i].getColor() + " - " +
                                    inventory[i].getOdometerReading() + " miles - $" +
                                    inventory[i].getPrice());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Not ready yet");
                    break;
                case 4:
                    System.out.println("not ready yet");
                    break;
                case 5:
                    if (vehicleCount >= inventory.length) {
                        System.out.println("Inventory is full. Cannot add more vehicles.");
                        break;
                    }

                    System.out.print("Enter vehicle ID: ");
                    long id = input.nextLong();
                    input.nextLine();

                    System.out.print("Enter make/model: ");
                    String model = input.nextLine();

                    System.out.print("Enter color: ");
                    String color = input.nextLine();

                    System.out.print("Enter odometer reading: ");
                    int odometer = input.nextInt();

                    System.out.print("Enter price: ");
                    float price = input.nextFloat();
                    input.nextLine();

                    inventory[vehicleCount] = new Vehicle(id, model, color, odometer, price);
                    vehicleCount++;
                    System.out.println("Vehicle added!");
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Try again.");
            }
            }
        }



    }

