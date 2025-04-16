package com.pluralsight;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone newPhone = new CellPhone(234222,"IPhone", "Verizon", "888-777-1212", "Ivan");

        System.out.println(newPhone.getCarrier());
    }
}
