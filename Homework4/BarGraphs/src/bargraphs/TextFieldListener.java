/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bargraphs;

import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Aaron
 */
/**
 * Class for listening to events caused by key presses in textfields
 *
 */
public class TextFieldListener implements KeyListener {

    private NumbersData numdata;

    TextField textfield;

    /**
     * Constructor assigning the correct textfield and initalizing the Model for
     * holding in the inputted numbers
     *
     * @param tfchoice int holding the
     * @param tf
     * @param s
     * @param g
     */
    TextFieldListener(TextField tf, StateChangedActionListener s, Graph g) {

        textfield = tf;
        numdata = new NumbersData(s, g);
    }

    /**
     * Accessor for the number data field
     *
     * @return
     */
    public NumbersData ndata() {
        return numdata;
    }

    /**
     *
     * Handle the key typed event from the text field.
     *
     * @param e KeyEvent holding information about event
     */
    public void keyTyped(KeyEvent e) {

    }

    ;

    /** Handle the key-pressed event from the text field. 
   * @param e KeyEvent holding information about event
     */
    public void keyPressed(KeyEvent e) {

    }

    /**
     * Handle the key-released event from the text field.
     *
     * @param e KeyEvent holding information about event
     */
    public void keyReleased(KeyEvent e) {

        try {

            if (textfield.getText().length() != 0) {
                numdata.update(textfield.getText());
            }
        } catch (NumberFormatException ex) {
            textfield.setText(null);
        }
    }
}
