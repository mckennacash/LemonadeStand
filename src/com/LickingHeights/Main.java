package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int supply_1,supplies,supply_2,price,quantity,days,supply_3;
        double priceSupply1,priceSupply2,priceSupply3;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
System.out.println("Welcome to the profit calculator. How many supplies do you need for business?");
        supplies = keyboard.nextInt();
        System.out.println("How many days of sale do you want to run?");
        days = keyboard.nextInt();
        System.out.println("How much does supply 1 cost per item?");
        priceSupply1 = keyboard.nextDouble();
        System.out.println("Okay, now how much does supply 2 cost per item?");
        priceSupply2 = keyboard.nextDouble();


    }
}
