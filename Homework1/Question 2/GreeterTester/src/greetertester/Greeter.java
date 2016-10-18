/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetertester;

/**
 *
 * @author Aaron
 */
/**
 * A class for greeting people, swapping names, and creating qualifier strings
 */
public class Greeter {

    /**
     * Constructs a Greeter object that can greet a person or entity.
     *
     * @param aName the name of the person or entity who should be addressed in
     * the greetings.
     */
    public Greeter(String aName) {
        name = aName;
    }

    /**
     * Greet with a "Hello" message.
     *
     * @return a message containing "Hello" and the name of the greeted person
     * or entity.
     */
    public String sayHello() {
        return "Hello" + name;
    }

    /**
     * Swaps the name values of the current Greeter object and the Greeter
     * object parameter
     *
     * @param other the Greeter object that the current object will switch name
     * values with
     */
    public void swapNames(Greeter other) //how come I have access to other.name when it is a private field and its not its method call? is it because they are of the same object?
    {
        String change = new String();
        change = other.name;
        other.name = this.name;
        this.name = change;

    }

    /**
     * Concatenates the string qualifier and the Greeter object's name Creates a
     * new Greeter object with the new qualifier string as its name and then
     * returns it
     *
     * @param qualifier a qualifier string inputted from the user
     * @return a new Greeter object with the new qualifier string as its name
     */
    public Greeter createQualifiedGreeter(String qualifier) {
        String fullstring = qualifier + " " + this.name;
        Greeter qualgreet = new Greeter(fullstring);

        return qualgreet;
    }
    private String name;
}
