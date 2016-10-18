/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalyzertester;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
/**
 * A class for creating a list of integers given from the command line to pass
 * into the DataAnalyzer object
 */
public class DataAnalyzerTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter sequence size, type character to end loop");
        String sizestring = in.next();
        int size = Integer.parseInt(sizestring);
        LinkedList<Integer> numList = new LinkedList();

        String seq = new String();
        int temp = 0;
        try {

            int nums;
            int k = 0;

            while (in.hasNextInt() || k < size) {

                if (!in.hasNextInt() && k < size) {
                    throw new NumberFormatException();
                } else if (in.hasNextInt()) {
                    nums = in.nextInt();
                    numList.add(nums);
                }

                k++;
            }
        } catch (Exception NumberFormatException) {
            NumberFormatException.printStackTrace();

        }
        int o = 1;
        for (int i = 0; i < size; i++) {

            System.out.println(numList.get(i));
        }

        try {

            DataAnalyzer dataanalyzer = new DataAnalyzer(numList);
            dataanalyzer.Compute(numList);

        } catch (IOException ex) {
            Logger.getLogger(DataAnalyzerTester.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(numList);

    }

}
