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
 * Acts as a container for all of the Product objects and provides them to
 * UPCScanner when the Product needs to be matched with the upc code entered by
 * the user, it interacts with
 */
public class Inventory {

    private int size;
    private LinkedList<Product> all = new LinkedList();

    /**
     * Constructs an Inventory object and initializes its LinkedList of Product
     * objects with Product objects containing data pertaining to them, it
     * interacts only with UPCScanner and Product objects
     */
    Inventory() {

        Product cereal = new Product(123, "cereal", 3.00);
        all.add(cereal);
        Product popcorn = new Product(456, "popcorn", 2.00);
        all.add(popcorn);
        Product bread = new Product(789, "bread", 1.50);
        all.add(bread);
        Product eggs = new Product(101112, "eggs", 2.50);
        all.add(eggs);
        Product apple = new Product(131415, "apple", 1.00);
        all.add(apple);

    }

    /**
     *
     * @param x the int used as an iterator used to grab the specified Product
     * @return the Product that was matched with the inputted UPC
     */
    public Product provideproducts(int x) {
        return all.get(x);
    }

    /**
     * Gets the size of the Inventory
     *
     * @return invsize the int representing the size of the inventory
     */
    public int getsize() {
        int invsize;
        invsize = all.size();
        return invsize;
    }
}
