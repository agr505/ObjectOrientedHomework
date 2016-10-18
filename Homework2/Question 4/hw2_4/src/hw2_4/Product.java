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
 * Represents a product and contains its upc, name, and unit price, it interacts
 * with Inventory, Shopping Cart, and Receipt objects
 */
public class Product {

    public int upc;
    public String name;
    public double unitprice;

    /**
     * Constructs a Product object and initIalizes its upc, name, and unit price
     * properties
     *
     * @param upcparam the int holding product's upc
     * @param nameparam the String holding the Product's name
     * @param unitpriceparam the double holding the Product's unit price
     */
    Product(int upcparam, String nameparam, double unitpriceparam) {
        upc = upcparam;
        name = nameparam;
        unitprice = unitpriceparam;
    }

}
