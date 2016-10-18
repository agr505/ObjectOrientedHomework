
package math;

/**
 *
 * @author Aaron
 */
/**
 * The class holding all of the data for the imaginary and real parts along with
 * providing the methods for all of the math operations Invariant is that i
 * multiplied by i is always -1 and that all methods obey mathematical laws
 */
public class Complex {

    private final double real;
    private final double imaginary;

    /**
     * Constructs a Complex number with the imaginary and real part
     *
     * @param r double representing the real part
     * @param i double representing the imaginary part
     */
    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    /**
     * Constructs a Complex number with only the real part and initializes the
     * imaginary part to zero
     *
     * @param r double representing the real part
     */
    Complex(double r) {
        real = r;
        imaginary = 0;
    }

    /**
     * Accessor for the real part of the complex number`
     *
     * @return double representing the real part of the complex number
     */
    public double r() {
        return real;
    }

    /**
     * Accessor for the imaginary part of the complex number
     *
     * @return double representing the imaginary part of the complex number
     */
    public double i() {
        return imaginary;
    }

    /**
     * Turns Complex object into String
     *
     * @return String representing the Complex number
     */
    public String toString() {

        if (i() > 0) {
            return r() + " + " + i() + "i";
        } else if (i() < 0) {
            double imag = i() * -1;
            return r() + " - " + imag + "i";
        }

        return "";
    }

    /**
     * Adds two Complex numbers
     *
     * @param complex the Complex object representing the number to be added
     * @return New Complex object equaling the sum of the two Complex numbers
     */
    public Complex add(Complex complex) {
        double realnew = this.r() + complex.r();
        double imaginarynew = this.i() + complex.i();
        Complex complexnew = new Complex(realnew, imaginarynew);
        return complexnew;
    }

    /**
     * Subtracts two Complex numbers
     *
     * @param complex the Complex object representing the number to subtract
     * @return New Complex object equaling the difference of the two Complex
     * numbers
     */
    public Complex sub(Complex complex) {
        double realnew = this.r() - complex.r();
        double imaginarynew = this.i() - complex.i();
        Complex complexnew = new Complex(realnew, imaginarynew);
        return complexnew;
    }

    /**
     * Finds the conjugate of a Complex number
     *
     * @return New Complex object representing the conjugate of the Complex
     * number
     */
    public Complex conj() {
        Complex complex;
        double imaginarynew;

        imaginarynew = this.i() * (-1);
        complex = new Complex(this.r(), imaginarynew);
        return complex;

    }

    /**
     * Multiplies two Complex numbers
     *
     * @param complex Complex object to represent the multiplier
     * @return New Complex object equaling the product of the two Complex
     * numbers
     */
    public Complex mult(Complex complex) {
        Complex complexnew;
        double realnew1 = this.r() * complex.r();
        double realnew2 = (-1) * this.i() * complex.i();
        double realnew = realnew1 + realnew2;

        double imaginarynew1 = this.r() * complex.i();
        double imaginarynew2 = this.i() * complex.r();
        double imaginarynew = imaginarynew1 + imaginarynew2;

        complexnew = new Complex(realnew, imaginarynew);
        return complexnew;
    }

    /**
     * Divides two Complex numbers
     *
     * @param complex Complex object to represent the divisor
     * @return New Complex object equaling the quotient of the two Complex
     * numbers
     * @precondition the Complex object parameter cannot have a numerical value
     * of 0
     */
    public Complex div(Complex complex) {
        Complex complexnew;
        complexnew = complex.conj();
        complexnew = this.mult(complexnew);
        return complexnew;
    }

    /**
     * Compares two Complex numbers to see if they are equal
     *
     * @param complex Complex object to be compared to
     * @return true or false dependant on if they are equal
     */
    public boolean equals(Complex complex) {
        boolean equal;
        if (this.i() == complex.i() && this.r() == complex.r()) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Complex d = new Complex(2, 3);
        Complex a = new Complex(2, -3);
        Complex f;
        f = d.div(a);
        System.out.println(f.toString());

        Complex g = new Complex(7, 3);
        Complex c = new Complex(5, 2);
        g = c.mult(d);
        System.out.println(g.toString());
        System.out.println(d.toString());

        Complex z = new Complex(5, 1);

        Complex r = new Complex(1, 1);

        Complex j = new Complex(1, 1);
        r = g.add(z);
        System.out.println(r.toString());

        a = z.sub(r);
        boolean test = a.equals(c);
        System.out.println(a.toString());
        System.out.println(test);
        g = r.conj();
        System.out.println(g.toString());
        z = r.mult(g);
        System.out.println(z.toString());

    }

}
