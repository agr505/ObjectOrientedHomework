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
 * A class for printing products information, calculating and displaying the
 * total, and generating and displaying receipts it deals interacts with the
 * Cashier, Product, Shopping Cart, and Receipt objects
 */
public class CashRegister {

    Application app;
    ShoppingCart cart;
    double currenttotal;

    /**
     * Constructs CashRegister object and initializes the current total that was
     * just calculated to 0
     *
     */
    CashRegister() {
        currenttotal = 0;
    }

    /**
     * Displays a product's UPC, name, and unit price
     *
     * @param product the Product object that will be displayed
     */
    public void displayproduct(Product product) {
        System.out.println("UPC= " + product.upc + "\nProduct name= " + product.name + "\nUnit price= " + product.unitprice + "\n");
    }

    /**
     * Computes the total of all of the products to be purchased, the Shopping
     * Cart provides the Product objects
     *
     * @return total the double that is returned which is the calculated total
     * price of the products
     */
    public double calculatetotal() {
        double total = 0;
        for (int i = 0; i < cart.getsize(); i++) {
            total = cart.provideproducts(i).unitprice + total;
        }
        currenttotal = total;
        return total;
    }

    /**
     * Prints the total representing the total of all of the products
     *
     * @param total the double representing the total of all of the products to
     * be purchased
     */
    public void displaytotal(double total) {
        System.out.println("\nYou're total is " + total);
    }

    /**
     * Calls the method to calculate the total and then calls the method to
     * display the total after it is calculated
     */
    public void presspay() {
        System.out.println("Pay pressed, starting calculations...");
        double total = 0;
        total = calculatetotal();
        displaytotal(total);

    }

    /**
     * Prints the Receipt object's data
     *
     * @param r the Receipt object that's purchased products and their total
     * will be printed
     */
    public void printrecipt(Receipt r) {
        for (int k = 0; k < r.getsize(); k++) {
            System.out.println("Product name= " + r.provideproducts(k).name + "\nUPC= " + r.provideproducts(k).upc + "\n Unit price= " + r.provideproducts(k).unitprice + "\n");
        }
        System.out.println("Total= " + r.total);
    }

    /**
     * Calls the constructor for the Receipt object passing in the current total
     * and a Shopping Cart object holding all of the purchased products and
     * prints the created Receipt
     */
    public void generatereceipt() {
        Receipt receipt = new Receipt(currenttotal, cart);
        printrecipt(receipt);
    }

}
