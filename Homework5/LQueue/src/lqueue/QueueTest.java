/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lqueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Aaron
 */
/**
 * Class for testing the LQueue adapter class
 *
 */
public class QueueTest {

    public static void main(String[] args) {
        String a = new String("hello");
        String b = new String("how are you");
        String c = new String("I am good");
        LQueue<String> q = new LQueue<>();

        q.enqueue(a);
        q.enqueue(b);
        q.enqueue(c);
        q.dequeue();

        System.out.println(q.isEmpty());
        System.out.println(q.head());
        ArrayList<String> q2 = new ArrayList<String>();
        String d = new String("what's up");
        String e = new String("not much");
        q2.add(d);
        q2.add(e);
        q.addAll(q2);
        q.dequeue();
        System.out.println(q.head());
        q.dequeue();
        System.out.println(q.head());
        q.dequeue();
        System.out.println(q.head());

    }

}
