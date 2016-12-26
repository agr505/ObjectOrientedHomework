/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bargraphs;

import javax.swing.*;
import java.awt.*;



/**
 * Class used to draw Rectangles
 * @author Aaron
 */
public class Graph extends JPanel{
public StateChangedActionListener statechangedlistener;
private int x;
private Color color;
/**
 * Method for painting the component
 * @param g Graphics to be painted
 */

	public void paintComponent(Graphics g){
		
		setBorder(BorderFactory.createLineBorder(Color.gray));
	  
	    setPreferredSize(new Dimension(200, 200));	
	    
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(color);
		g.fillRect(25, 25, x, 30);
		
	

		}
        /**
         * Constructor used to initialize x with the inputted length
         * @param len int representing length used to initialize x
         */
	Graph(int len,Color c){
		x = len;
                color=c;
		
	}
        /**
         * Method for filling the paint of the Rectangle
         * @param l int used for data of paint filling
         */
	public void fillPaint(int l){
		x = l;
	}
	/**
         * Method for adding a StateChangedActionListener
         * @param s StateChangedActionListener reference to assign to the statechangedlistener field
         */
       public void addStateChangedListener(StateChangedActionListener s)
        {
            statechangedlistener =s;
        }
}
