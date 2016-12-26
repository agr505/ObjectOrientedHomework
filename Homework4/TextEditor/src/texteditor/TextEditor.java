/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

/**
 *
 * @author Aaron
 */
/**
 * Class that supports spell checking in different languages including Spanish
 * and French with multiple variants of the spell checking algorithm
 */
public class TextEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = new String();
        FrenchStrategy frenchstrategy = new FrenchStrategy();
        SpanishStrategy spanishstrategy = new SpanishStrategy();
        frenchstrategy.spellchecker(text);
        spanishstrategy.spellchecker(text);
    }
    /*  public void spellcheck(String inputtext)
    {
        
    }*/
}
