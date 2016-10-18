/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalyzertester;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
/**
 * A class for writing the values of the list to a file along with computing the
 * max, min, and average of the values as well as writing them to a file
 */
public class DataAnalyzer {

    String filename;

    /**
     * Constructs a DataAnalyzer object that creates a ListIterator<Integer>
     * iterator and iterates through the numList while printing to the specified
     * file
     *
     * @param numList the list of inputted integer numbers be addressed in the
     * greetings.
     */
    public DataAnalyzer(LinkedList<Integer> numList) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter File Name");
        filename = in.next();

        PrintWriter writer = new PrintWriter(filename, "UTF-8");
        ListIterator<Integer> iterator = numList.listIterator();

        while (iterator.hasNext()) {

            writer.println(iterator.next());

        }

        writer.close();

    }

    /**
     * Computes the integer with the highest value by iterating through numList
     * and comparing the values with each other
     *
     * @param numList the list of inputted integer numbers
     * @return max the integer with the highest value of the list to return
     */
    public int ComputeMax(LinkedList<Integer> numList) {

        int max = numList.get(0);
        int iter = 0;
        System.out.println("1st remove: " + max);

        System.out.println("next: " + iter);

        for (int i = 1; i < numList.size(); i++) {
            iter = numList.get(i);
            if (max < iter) {
                max = iter;
            }

        }

        return max;

    }

    /**
     * Computes the integer with the lowest value by iterating through numList
     * and comparing the values with each other
     *
     * @param numList the list of inputted integer numbers
     * @return min the integer with the lowest value of the list to return
     */
    public int ComputeMin(LinkedList<Integer> numList) {
        int min = numList.get(0);
        int iter = 0;

        for (int i = 1; i < numList.size(); i++) {
            iter = numList.get(i);
            if (min > iter) {
                min = iter;
            }

        }

        return min;

    }

    /**
     * Computes the average integer iterating through numList and adding all of
     * the values and then dividing by the number of integers
     *
     * @param numList the list of inputted integer numbers
     * @return average the integer with the average value of the list of
     * integers to return
     */
    public double ComputeAverage(LinkedList<Integer> numList) {
        int size = numList.size();
        double average = 0;
        for (int x = 0; x < size; x++) {

            average += numList.get(x);
        }

        return average / size;
    }

    /**
     * Computes the average, max and min by calling the appropriate functions
     * and them writes them to the indicated file
     *
     * @param numList the list of inputted integer numbers
     */
    public void Compute(LinkedList<Integer> numList) {
        int max = ComputeMax(numList);
        int min = ComputeMin(numList);

        double average = ComputeAverage(numList);

        System.out.println("max: " + max + "....min: " + min + "......average:" + average);

        try {

            PrintWriter writer = new PrintWriter(new FileWriter(filename, true));
            writer.println("Maximum=" + max + " Minimum= " + min + " Average =" + average);

            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(DataAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
