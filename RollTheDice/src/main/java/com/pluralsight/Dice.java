package com.pluralsight;

public class Dice {


    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1;
        int roll2;

        int counter2 = 0;
        int counter4 = 0;
        int counter6 = 0;
        int counter7 = 0;

        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;

            System.out.println("Roll" + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

            if (sum == 2) {
                counter2++;
            }
            if (sum == 4) {
                counter4++;
            }
            if (sum == 6) {
                counter6++;
            }
            if (sum == 7) {
                counter7++;
            }

            System.out.println("Times 2: " + counter2);
            System.out.println("Times 4: " + counter4);
            System.out.println("Times 6: " + counter6);
            System.out.println("Times 7: " + counter7);

        }

    }

    public static int roll() {
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;
    }
}
