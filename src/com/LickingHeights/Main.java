package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int supply_1,supplies,supply_2,days,supply_3;
        double priceSupply1;
        double priceSupply2;
        double priceSupply3;
        double profit;
        double sales;
        double price;
        double[] supplyTotal;
        String userAnswer = new String();
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        do {

            System.out.println("Welcome to the profit calculator. How many supplies do you need for business?");

            supplies = keyboard.nextInt();
            System.out.println("How many days of sale do you want to run?");
            days = keyboard.nextInt();
            System.out.println("How much does supply 1 cost per item?");
            priceSupply1 = keyboard.nextDouble();
            System.out.println("How many of supply 1 did you buy?");
            supply_1 = keyboard.nextInt();
            System.out.println("Okay, now how much does supply 2 cost per item?");
            priceSupply2 = keyboard.nextDouble();
            System.out.println("How many of supply 2 did you buy?");
            supply_2 = keyboard.nextInt();
            System.out.println("How much does supply 3 cost per item?");
            priceSupply3 = keyboard.nextDouble();
            System.out.println("How many of supply 3 did you buy?");
            supply_3 = keyboard.nextInt();
            System.out.println("What is the price of the item you sold?");
            price = keyboard.nextDouble();
            System.out.println("How many did you sell?");
            sales = keyboard.nextInt();

           // supplyTotal = new double[]{priceSupply1*supply_1+priceSupply2*supply_2+priceSupply3*supply_3};
           // System.out.println(supplyTotal);
            System.out.println("Would you like to run another calculation?");

            userAnswer = keyboard.nextLine();

        }while (!userAnswer.equalsIgnoreCase("no"));


    }
}
