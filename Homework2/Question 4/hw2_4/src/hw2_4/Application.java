/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2_4;

import java.util.LinkedList;
import java.util.Scanner;
import java.lang.System;

/**
 *
 * @author Aaron
 *
 * /**
 * A class for interacting with the user and initiating the main processes of
 * the Application it only interacts with the Cashier object
 */
public class Application {

    Cashier cashier;

    /**
     * Constructs an Application object and calls the constructors for
     * UPCScanner, ShoppingCart, and CashRegister to construct local instances
     * to provide as parameters to the Cashier constructor to have all of the
     * class instances contain references to each other for applicable
     * relationships
     */
    Application() {
        UPCScanner upcscannerinit = new UPCScanner();
        ShoppingCart cartinit = new ShoppingCart();
        CashRegister registerinit = new CashRegister();
        cashier = new Cashier(upcscannerinit, cartinit, registerinit);

    }

    /**
     * Prompts the user to enter the number of products and then loops while the
     * Cashier object uses the UPCScanner for each product
     */
    public void getsuserproductselection() {

        Scanner in = new Scanner(System.in);
        System.out.println("How many products");
        int size = in.nextInt();
        int input = 0;
        for (int i = 0; i < size; i++) {
            input = in.nextInt();
            cashier.usescanner(input);

        }

    }

    /**
     * Has the Cashier call the pay method in order for it to press the PaY
     * button and have the Cash Register calculate the total
     */
    public void initiatepaymentprocess() {

        cashier.pay();
    }

    /**
     * Ask the user if he or she would like to pay the amount listed in the
     * total and have the Cashier call its takecash() if he or she would like to
     * pay
     */
    public void promptpay() {
        Scanner in = new Scanner(System.in);

        System.out.println("Do you want to pay this amout?");
        String answer = in.next();
        if ("yes".equals(answer)) {
            cashier.takecash();
        } else {
            System.out.println("Have a nice day");
        }
    }
}
