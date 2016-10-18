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
 * Used by Cashier to match inputted upc with the Product with the same upc, it
 * interacts with Inventory and Product objects
 */
public class UPCScanner {

    Inventory inv;

    /**
     * Matches the inputted upc with the Product with the same upc
     *
     * @param upc the int which holds the value of the inputted upc
     * @return the Product that was matched with the inputted upc
     */
    public Product matchupc(int upc) {

        inv = new Inventory();

        for (int i = 0; i < inv.getsize(); i++) {
            if (upc == inv.provideproducts(i).upc) {

                return inv.provideproducts(i);
            }
        }

        return null;
    }
}
