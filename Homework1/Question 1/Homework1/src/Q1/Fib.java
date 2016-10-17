/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author Aaron
 */
class Lessthanzero extends Exception {

    Lessthanzero() {

    }
}

/**
 * A class for calculating and displaying the Fibonacci sequence
 */
public class Fib {

    private int fzero;
    private int fone;
    // constructor

    public Fib(int f0, int f1) {
        fzero = f0;
        fone = f1;
    }

    // computes F(n) using an ***iterative*** algorithm, where F(n) = F(n-1) + F(n-2) is the recursive definition.
    // use instance variables that store F(0) and F(1).
    // check parameter and throw exception if n < 0. Don't worry about arithmetic overflow.
    public int f(int n) {
        int x1 = fzero;
        int x2 = fone;
        int x3 = 0;

        if (n == 1) {
            return fone;

        }
        if (n == 0) {
            return fzero;
        }
        for (int f = 2; f <= n; f++) {
            x3 = x2 + x1;
            x1 = x2;
            x2 = x3;

        }

        return x3;
    }

    // computes F(n) using the ***recursive*** algorithm, where F(n) = F(n-1) + F(n-2) is the recursive definition.
    // use instance variables that store F(0) and F(1).
    // check parameter and throw exception if n < 0. Don't worry about arithmetic overflow.
    public int fRec(int n) {
        if (n == 1) {
            return fone;
        }
        if (n == 0) {
            return fzero;
        }
        return fRec(n - 1) + fRec(n - 2);

    }

    public static void main(String[] args) {

        ///throw myownexception for n<0
        int f0 = 0, f1 = 0, f2 = 0, n = 0;
        try {
            String temp = args[0];

            f0 = Integer.parseInt(temp);
            temp = args[1];
            f1 = Integer.parseInt(temp);
            temp = args[2];
            n = Integer.parseInt(temp);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        Fib fib = new Fib(f0, f1);
        Lessthanzero e = new Lessthanzero();
        try {
            if (n < 0) {

                throw new Lessthanzero();
            }
        } catch (Lessthanzero E) {
            System.out.println("Exception thrown, n is less than zero");
        }
        System.out.println(fib.f(n) + "    " + fib.fRec(n));

        // get numbers F(0) and F(1) from args[0] and args[1].
        // use either the Scanner class or Integer.parseInt(args[...])
        // you must handle possible exceptions !
        // get n from args[2]:
        // create a Fib object with params F(0) and F(1)
        // calculate F(0), ..., F(n) and display them with System.out.println(...) using
        // the iterative methode f(i)
        for (int i = 0; i < n; i++) {
            System.out.println(fib.f(i));
        }

        // calculate F(0), ..., F(n) and display them with System.out.println(...) using
        // the recursive methode fRec(i)
        for (int k = 0; k < n; k++) {
            System.out.println(fib.fRec(k));
        }

    }

    // instance variables store F(0) and F(1):
};
