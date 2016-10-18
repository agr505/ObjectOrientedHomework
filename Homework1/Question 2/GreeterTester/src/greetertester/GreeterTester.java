/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetertester;

/**
 *
 * @author Aaron
 */
/**
 * A class for testing the Greeter class
 */
public class GreeterTester {

    public static void main(String[] args) {
        Greeter g1 = new Greeter("adam");
        Greeter g2 = new Greeter("joe");

        System.out.println(g1.sayHello() + g2.sayHello());
        g1.swapNames(g2);
        System.out.println(g1.sayHello() + g2.sayHello());

        Greeter g3 = new Greeter("bob");
        Greeter g4 = g3.createQualifiedGreeter("richard");
        g3.swapNames(g4);
        Greeter g5 = new Greeter("andrew");
        Greeter g6 = new Greeter("james");
        g5.swapNames(g6);
        Greeter g8 = g3.createQualifiedGreeter("wiliam");
        System.out.println(g4.sayHello());
    }

}
