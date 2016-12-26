/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bargraphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

/**
 *
 * @author Aaron
 */
public class BarGraphs {

    /**
     * @param args the command line arguments
     */
    private static int num3;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Bar Graphs");
        frame.setLayout(new GridLayout(0, 2));
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(2, 20));
        JPanel panel2 = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.gray));
        panel2.setBorder(BorderFactory.createLineBorder(Color.gray));
        frame.add(panel);
        frame.add(panel2);

        Graph g = new Graph(200, Color.red);

        Graph g2 = new Graph(150, Color.yellow);

        Graph g3 = new Graph(100, Color.blue);

        JLabel label = new JLabel("Numbers must be between 0-100");
        panel.add(label);

        StateChangedActionListener s = new StateChangedActionListener();
        final int FIELD_WIDTH = 20;
        final JTextField textField = new JTextField(FIELD_WIDTH);
        TextField tf1 = new TextField(null, 10);
        TextFieldListener tflistener = new TextFieldListener(tf1, s, g);

        tf1.addKeyListener(tflistener);

        StateChangedActionListener s2 = new StateChangedActionListener();

        final JTextField textField1 = new JTextField(FIELD_WIDTH);
        TextField tf2 = new TextField(null, 10);
        TextFieldListener tflistener2 = new TextFieldListener(tf2, s2, g2);

        tf2.addKeyListener(tflistener2);

        StateChangedActionListener s3 = new StateChangedActionListener();

        final JTextField textField3 = new JTextField(FIELD_WIDTH);
        TextField tf3 = new TextField(null, 10);
        TextFieldListener tflistener3 = new TextFieldListener(tf3, s3, g3);

        tf3.addKeyListener(tflistener3);

        panel.add(tf1);
        panel.add(tf2);
        panel.add(tf3);

        panel2.add(g);
        panel2.add(g2);
        panel2.add(g3);

        frame.setSize(600, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
