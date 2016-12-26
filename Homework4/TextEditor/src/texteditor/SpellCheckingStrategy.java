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
 * Spell checking algorithm that allows for custom versions to implement this
 * interface for supporting spelling in different languages
 *
 */
public interface SpellCheckingStrategy {

    /**
     * Method to be implemented in various ways dependant on the language
     *
     * @param inputtext String that holds the text to be spell checked
     * @return
     */
    public String spellchecker(String inputtext);
}
