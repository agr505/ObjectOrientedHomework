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
 * Acts as a container for all of the selected Products and provides the
 * Products when needed it interacts with Product, Cashier, and Casher Register
 * objects
 */
public class ShoppingCart {

    CashRegister register;
    private int size;
    private LinkedList<Product> all;

    /**
     * Constructs a Shopping Cart object and initializes the LinkedList<Product>
     * all to contain selected products
     */
    ShoppingCart() {
        all = new LinkedList();
    }

    /**
     * Returns the selected products
     *
     * @param x the int used as an iterator used to grab the specified Product
     * @return the Product to be returned
     */
    public Product provideproducts(int x) {
        return all.get(x);
    }

    /**
     * Gets the size of the LinkedList<Product> containing the selected products
     *
     * @return the int holding the value of the size of the LinkedList<Product>
     * containing the selected products
     */
    public int getsize() {
        int invsize;
        invsize = all.size();
        return invsize;
    }

    /**
     * Adds a Product to the Shopping Cart's list of Products and prints the
     * product's data
     *
     * @param prod the Product to be stored and printed
     */
    public void fillshoppingcart(Product prod) {
        all.add(prod);
        register.displayproduct(prod);
    }

    /**
     * Called in order to return the entire Product LinkedList so that the
     * Receipt object can possess the Product objects as well
     *
     * @return all the LinkedList<Product> to be returns so that the Receipt
     * object can possess the Product objects
     */
    public LinkedList<Product> converttoreceipt() {
        return all;
    }

}
