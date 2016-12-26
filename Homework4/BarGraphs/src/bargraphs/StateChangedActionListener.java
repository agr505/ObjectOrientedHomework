/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bargraphs;

/**
 *
 * @author Aaron
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.event.ChangeEvent;

/**
 * Listener for changes to the Model of the BarGraphs Application, which means
 * new values inputted in the text fields
 *
 * @author Aaron
 */
public class StateChangedActionListener implements ChangeListener {

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Method to be called to handle StateChanged event, for the changing of the
     * Model
     *
     * @param event StateEvent, a class inheriting from ChangeEvent to be thrown
     * when changes are applied to the Model
     */
    void stateChanged(StateEvent event) {
        NumbersData numbersd = event.getSource();
        Graph graph = numbersd.g();
        graph.fillPaint(numbersd.n());
        graph.repaint();

    }
}
