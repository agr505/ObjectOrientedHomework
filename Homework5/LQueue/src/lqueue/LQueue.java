package lqueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author Aaron
 */
/**
 * The adapter generic class for the target MyQueue interface utilizing the
 * adaptee LinkedList
 *
 * @param <E> the generic element of the queue
 */
public class LQueue<E> implements MyQueue<E> {

    private LinkedList<E> linkedlist;

    /**
     * Constructor for this adapter generic class initializing the adaptee
     * LinkedList reference
     */
    public LQueue() {
        linkedlist = new LinkedList();
    }

    /**
     * Returns the first element in the LinkedList
     *
     * @precondition size()>0
     * @throws NoSuchElementException if queue is empty
     * @return first element in the LinkedList
     */
    public E head() throws NoSuchElementException {
        return linkedlist.getFirst();
    }

    /**
     * Removes and returns the top of the queue element
     *
     * @precondition size()>0
     * @throws NoSuchElementException if queue is empty
     * @return
     */
    public E dequeue() throws NoSuchElementException {
        return linkedlist.remove();
    }

    /**
     * Adds an element to the queue
     *
     * @param e Element of queue
     * @postcondition size() > 0
     */
    public void enqueue(E e) {
        linkedlist.add(e);
    }

    ;
   /**
    *  Returns true if the queue is empty
    * @return boolean containing the value  if the queue is empty
    */
   public boolean isEmpty() {
        return linkedlist.isEmpty();
    }

    ;
   
   /**
    * Adds elements to this queue from a collection c of E references
    * @precondion the generic parameter must be a subclass of E
    * @param c object implementing Collection that contains a collection of a subclass of E
    */
   public void addAll(Collection<? extends E> c) {

        Iterator iter = c.iterator();
        E e = null;
        while (iter.hasNext()) {
            e = (E) iter.next();
            this.enqueue(e);
        }

    }
;

}
