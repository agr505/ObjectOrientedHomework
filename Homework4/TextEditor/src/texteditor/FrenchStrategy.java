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
 * Class containing algorithm for spell checking in French
 *
 * @author Aaron
 */
public class FrenchStrategy implements SpellCheckingStrategy {

    private FrenchDictionary dictionary;

    /**
     * Method to be implemented for spell checking in Spanish
     *
     * @param inputtext String that holds the text to be spell checked
     * @return String holding the value of the correctly spelled text
     */
    @Override
    public String spellchecker(String inputtext) {

        return frenchchecking(inputtext);
    }

    /**
     * Method to for spell checking in French, comparing input text with the
     * French dictionary
     *
     * @param inputtext String that holds the text to be compared with the
     * French dictionary
     * @return String holding the value of the spell corrections
     */
    public String frenchchecking(String inputtext) {
        String corrections = dictionary.compare(inputtext);
        return corrections;
    }
}
