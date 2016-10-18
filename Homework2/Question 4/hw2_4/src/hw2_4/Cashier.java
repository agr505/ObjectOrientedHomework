/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2_4;

/**
 *
 * @author Aaron
 */
/**
 * A class for relaying processes started by the Application object to various
 * other objects, it interacts with the UPCScanner, Inventory, Shopping Cart,
 * Cash Register, and Application objects
 */
public class Cashier {

    UPCScanner upcscanner;
    ShoppingCart cart;
    CashRegister register;

    /**
     * Constructs a Cashier object and assigns its UPCScanner, ShoppingCart, and
     * CashRegister objects to each other depending on their respective
     * relationships
     *
     * @param upcscannerinit the instance of UPSScanner to be used for
     * initialization
     * @param cartinit the instance of ShoppingCart to be used for
     * initialization
     * @param registerinit the instance of CashRegister to be used for
     * initialization
     */
    Cashier(UPCScanner upcscannerinit, ShoppingCart cartinit, CashRegister registerinit) {
        upcscanner = upcscannerinit;
        cart = cartinit;
        register = registerinit;
        cart.register = registerinit;
        register.cart = cartinit;
    }

    /**
     * Uses the UPCScanner to match up Product objects with UPC's and then fill
     * the Shopping Cart with products that are found
     *
     * @param input the int that is the UPC code to be matched
     */
    public void usescanner(int input) {

        Product foundp = upcscanner.matchupc(input);
        if (foundp == null) {
            System.out.println("Item not found");
        }

        cart.fillshoppingcart(foundp);

    }

    /**
     *
     * The Cashier calls this method in order to have the Cash Register call its
     * presspay() method and start the total calculation process
     */
    public void pay() {
        register.presspay();
    }

    /**
     * This is called if the buyer has agreed to pay for the products and this
     * will call generatereceipt() to build the Receipt for the transaction
     */
    public void takecash() {
        register.generatereceipt();
    }
}
