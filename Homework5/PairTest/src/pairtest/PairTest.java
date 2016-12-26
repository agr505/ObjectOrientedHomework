package pairtest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Aaron
 */
/**
 * Class for testing the Pair class
 *
 */
public class PairTest {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Pair p = new Pair(5, "hello");
        Pair a = new Pair(4, "what's up");
        System.out.println(p.equals(a));
        System.out.println(p.hashCode());

        System.out.println(p.toString());
        Pair d = (Pair) p.clone();
        System.out.println(d.toString());
        p.equals(d);
        System.out.println(p.equals(d));
        ObjectOutputStream out
                = new ObjectOutputStream(
                        new FileOutputStream("hello.txt"));
        out.writeObject(p);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("hello.txt"));
        Pair e = (Pair) in.readObject();
        in.close();
        System.out.println(e.equals(p));
        if (e.hashCode() == p.hashCode()) {
            System.out.println("Hashcodes are equal");
        } else {
            System.out.println("Hashcodes are not equal");
        }
        Pair y = new Pair(4, "hello");
        Pair z = new Pair(4, "what's up");
        System.out.println(y.equals(z));
        Pair t = new Pair(6, "interesting");
        Pair x = new Pair(4, "interesting");
        System.out.println(t.equals(x));
    }
}
