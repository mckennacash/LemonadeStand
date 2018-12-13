package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int supply_1,supplies,supply_2,price,quantity,days,supply_3;
        double priceSupply1,priceSupply2,priceSupply3;
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



}while (!userAnswer.equalsIgnoreCase("no"));
    }
    public int Supplies(){

    }
public int Profit(){

}
}
