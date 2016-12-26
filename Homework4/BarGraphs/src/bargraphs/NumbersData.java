/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bargraphs;

import javax.swing.event.ChangeEvent;

/**
 *
 * @author Aaron
 */
/**
 * The Model of the BarGraphs Application, holding the new values inputted in
 * the text fields and throws StateEvents when it updates itself
 *
 * @author Aaron
 */
public class NumbersData {

    private int num;
    private Graph graph;
    private StateChangedActionListener statechangedlistener;

    /**
     *
     * @param s StateChangedActionListener which is used to listen to State
     * changed events
     * @param gra Graph to be update when changes are applied to the Model
     */
    NumbersData(StateChangedActionListener s, Graph gra) {
        statechangedlistener = s;
        graph = gra;
    }

    /**
     * Accessor for statechangedlistener field
     *
     * @return StateChangedActionListener holding the reference to the
     * appropriate StateChangedActionListener
     */
    public StateChangedActionListener schangelistener() {
        return statechangedlistener;
    }

    /**
     * Accessor for the graph field
     *
     * @return Graph holding the reference to the appropriate Graph
     */
    public Graph g() {
        return graph;
    }

    /**
     * Accessor for the num field
     *
     * @return int num holding the value of the last value inputted into the
     * text field
     */
    public int n() {
        return num;
    }

    /**
     * Method for updating the num field holding the value of the most recent
     * value inputted into the text field and creates a StateEvent to be handled
     * by a StateChangedActionListener
     *
     * @param value String holding the value of the input into the text field
     */
    public void update(String value) {

        num = Integer.parseInt(value);

        StateEvent event = new StateEvent(this);
        StateChangedActionListener listener = schangelistener();
        listener.stateChanged(event);

    }
}
