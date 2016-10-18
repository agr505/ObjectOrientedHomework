/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2_4;

import java.util.LinkedList;

/**
 *
 * @author Aaron
 */
/**
 * Represents the receipt generated from the transactions and contains the
 * Product objects that were purchased along with the total for the transaction,
 * it interacts with Product and Cash Register objects
 */
public class Receipt {

    private int size;
    private LinkedList<Product> all;
    double total;

    /**
     * Constructs a Receipt object and initializes its purchased products and
     * total with the passed in parameters
     *
     * @param currenttotal the double holding the value of the total of the
     * products
     * @param purchasedcart the Shopping Cart holding the purchased products
     */
    Receipt(double currenttotal, ShoppingCart purchasedcart) {
        all = purchasedcart.converttoreceipt();
        total = currenttotal;

    }

    /**
     * Returns the purchased products
     *
     * @param x the int used as an iterator used to grab the specified Product
     * @return the Product to be returned
     */
    public Product provideproducts(int x) {
        return all.get(x);
    }

    /**
     * Gets the size of the LinkedList<Product> containing the purchased
     * products
     *
     * @return the int holding the value of the size of the LinkedList<Product>
     * containing the purchased products
     */
    public int getsize() {
        int invsize;
        invsize = all.size();
        return invsize;
    }
}
