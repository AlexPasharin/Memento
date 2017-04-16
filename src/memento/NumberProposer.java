/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.Random;

/** Arvuuttaja, joka antaa luvun asiakkaalle arvattavaksi
 *
 * @author aleksandrpasharin
 */
public class NumberProposer {
    
    private static final Random RAND = new Random();
    
    public NumberGuesserMomento joinGame(NumberGuesser guesser){
        return new NumberGuesserMomento(RAND.nextInt());
    }
    
    public boolean checkAGuess(NumberGuesserMomento momento, int guess){
        return momento.guessIsRight(guess);
    }
    
}
