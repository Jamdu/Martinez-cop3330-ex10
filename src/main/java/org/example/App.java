package org.example;


import java.util.Scanner;

public class App
{
    static final double TAX = 5.5;
    public static void main( String[] args )
    {
       Scanner scnr = new Scanner(System.in);

       System.out.println("Enter the price of item 1: ");
       int p1 = scnr.nextInt();
       System.out.println("Enter the quantity of item 1: ");
       int q1 = scnr.nextInt();

       System.out.println("Enter the price of item 2: ");
       int p2 = scnr.nextInt();
       System.out.println("Enter the quantity of item 2: ");
       int q2 = scnr.nextInt();

       System.out.println("Enter the price of item 3: ");
       int p3 = scnr.nextInt();
       System.out.println("Enter the quantity of item 3: ");
       int q3 = scnr.nextInt();

       double subTotal = (p1 * q1) + (p2 * q2) + (p3 * q3);
       System.out.format("Subtotal: $%.2f\n", subTotal);


       double taxes = (subTotal/100) * TAX;
       System.out.format("Tax: %.2f\n", taxes);

       double total = subTotal + taxes;

       System.out.println("Total: " + total);

    }
}
