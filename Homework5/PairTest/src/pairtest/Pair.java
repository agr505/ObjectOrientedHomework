package pairtest;

import java.io.Serializable;

/**
 *
 * @author Aaron
 */
/**
 * Generic Class that stores pairs of (key, value) pairs
 *
 * @param <K> generic type parameter representing the key
 * @param <V> generic type parameter representing the value
 */
public final class Pair<K, V> implements Cloneable, Serializable {

    private K key;
    private V value;

    /**
     * Constructor that initializes the key and value fields
     *
     * @param k of type K that holds the value to initialize the key field with
     * @param v of type V that holds the value to initialize the value field
     * with
     */
    public Pair(K k, V v) {
        key = k;
        value = v;
    }

    /**
     * Accessor to return the key field
     *
     * @return key of type K
     */
    public K k() {
        return key;
    }

    /**
     * Accessor to return the value field
     *
     * @return value of type V
     */
    public V v() {
        return value;
    }

    /**
     * A method for testing the equality of two Pair objects
     *
     * @param obj the Object who will be tested for equality after being cast
     * into the Pair type
     * @return boolean representing if the two Pairs are equal or not
     */
    public boolean equals(Object obj) {
        Pair p = (Pair) obj;
        K ke = (K) p.k();
        V va = (V) p.v();
        return this.k().equals(ke) && this.v().equals(va);

    }

    /**
     * Method for returning the hashcode of the Pair object which the
     * concatenation of the key and value hashcodes
     *
     * @return int holding the value of the Pair's hashcode
     */
    public int hashCode() {
        return k().hashCode() + v().hashCode();
    }

    /**
     * Method for returning the String representation of the pair object
     *
     * @return the String representation of the pair object
     */
    public String toString() {
        return getClass().getName() + "[Key=" + k() + ",Value=" + v() + "]";

    }

    /**
     * Method for creating a clone of a Pair
     *
     * @return the clone of a Pair object
     * @throws CloneNotSupportedException if the object cannot be cloned
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }

}
