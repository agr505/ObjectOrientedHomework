/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author Aaron
 */
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stdout stdo = Stdout.getinstance();
        Stdout instant = Stdout.getinstance();

        instant.printline("Hello, this is demostrating the singleton pattern");

        System.out.println(stdo.equals(instant));
    }

}
