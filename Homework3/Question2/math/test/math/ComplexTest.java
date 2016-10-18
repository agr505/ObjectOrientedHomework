
package math;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class ComplexTest {

    public ComplexTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Complex.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Complex complex = new Complex(3, 1);
        Complex instance = new Complex(3, 1);
        Complex expResult = new Complex(6, 2);
        Complex result = instance.add(complex);
        assertTrue(expResult.equals(result) == true);

    }

    /**
     * Test of sub method, of class Complex.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Complex complex = new Complex(5, 2);
        Complex instance = new Complex(10, 1);
        Complex expResult = new Complex(5, -1);
        Complex result = instance.sub(complex);
        assertTrue(expResult.equals(result) == true);

    }

    /**
     * Test of mult method, of class Complex.
     */
    @Test
    public void testMult() {
        System.out.println("mult");
        Complex complex = new Complex(5, 2);
        Complex instance = new Complex(3, 1);
        Complex expResult = new Complex(13, 11);
        Complex result = instance.mult(complex);
        assertTrue(expResult.equals(result) == true);

    }

    /**
     * Test of div method, of class Complex.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        Complex complex = new Complex(5, 3);
        Complex instance = new Complex(6, 2);
        Complex expResult = new Complex(36, -8);
        Complex result = instance.div(complex);
        assertTrue(expResult.equals(result) == true);

    }

    /**
     * Test of equals method, of class Complex.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Complex complex = new Complex(7, -1);
        Complex instance = new Complex(7, -1);
        boolean expResult = true;
        boolean result = instance.equals(complex);
        assertEquals(expResult, result);

    }

}
