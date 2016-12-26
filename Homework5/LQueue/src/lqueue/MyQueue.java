/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lqueue;

import java.util.Collection;

/**
 *
 * @author Aaron
 */
/**
 * The target interface that the LQueue interface was created for
 *
 * @param <E> the generic element of the queue
 */
public interface MyQueue<E> {

    /**
     * Returns the first element in the LinkedList
     */
    public E head();

    /**
     * Removes and returns the top of the queue element
     */
    E dequeue();

    /**
     * Removes and returns the top of the queue element
     */
    void enqueue(E e);

    /**
     * Returns true if the queue is empty
     */
    boolean isEmpty();

    /**
     * Adds elements to this queue from a collection c of E references
     */
    void addAll(Collection<? extends E> c);

}
