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
 * Class containing algorithm for spell checking in Spanish
 *
 * @author Aaron
 */
public class SpanishStrategy implements SpellCheckingStrategy {

    private SpanishDictionary dictionary;

    /**
     * Method to be implemented for spell checking in Spanish
     *
     * @param inputtext String that holds the text to be spell checked
     * @return String holding the value of the correctly spelled text
     */
    @Override
    public String spellchecker(String inputtext) {

        return spanishchecking(inputtext);
    }

    /**
     * Method to for spell checking in Spanish, comparing input text with the
     * Spanish dictionary
     *
     * @param inputtext String that holds the text to be compared with the
     * Spanish dictionary
     * @return String holding the value of the spell corrections
     */
    public String spanishchecking(String inputtext) {
        String corrections = dictionary.compare(inputtext);
        return corrections;
    }
}
