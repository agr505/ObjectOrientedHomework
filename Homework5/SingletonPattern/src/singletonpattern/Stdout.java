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
/**
 * A class with only one instance and is able to print text lines to the
 * terminal
 */
public class Stdout {

    private static Stdout instance = new Stdout();

    /**
     * Constructor for the Stdout class which is private to ensure there is only
     * be one instance created
     */
    private Stdout() {

    }

    /**
     * Gets the only instance of the class
     *
     * @return instance containing the only reference to the Stdout instance
     */
    public static Stdout getinstance() {
        return instance;
    }

    /**
     * Method performing the print text lines to the terminal functionality
     *
     * @param s String to be printed
     */
    public void printline(String s) {
        System.out.println(s);
    }

}
