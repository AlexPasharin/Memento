/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author aleksandrpasharin
 */
public class NumberGuesserMomento {
    
    private final int numberToGuess;
    
    public NumberGuesserMomento(int number){
        this.numberToGuess = number;
    }
    
    public boolean guessIsRight(int guess){
        return this.numberToGuess == guess;
    }
    
}
