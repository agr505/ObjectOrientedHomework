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
import java.awt.Event;
import javax.swing.event.ChangeEvent;

/**
 * Event Class for changes to the Model of the BarGraphs Application, which
 * means new values inputted in the text fields
 */
public class StateEvent extends ChangeEvent {

    NumbersData numsd;

    /**
     * Overrided constructor allowing for an object of type NumbersData to be a
     * parameter
     *
     * @param source of type NumbersData, the Model of the Application
     */
    public StateEvent(NumbersData source) {
        super(source);
    }

    @Override

    /**
     * Overrided method for obtaining the source of the event and casting the
     * object into a type NumbersData
     */
    public NumbersData getSource() {
        return (NumbersData) super.source;
    }

}
