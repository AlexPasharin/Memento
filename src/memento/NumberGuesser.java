/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.Random;

/** Asiakas joka arvaa luvun
 *
 * @author aleksandrpasharin
 */
public final class NumberGuesser extends Thread{
    
    private final NumberProposer proposer;
    private final NumberGuesserMomento momento;
    
    public NumberGuesser(NumberProposer proposer){
        this.proposer = proposer;
        this.momento = this.proposer.joinGame(this);
    }
    
    @Override
    public void run(){
        boolean guessed = false;
        int lastGuess = -1;
        Random rand = new Random();
        
        while(!guessed){
            lastGuess = rand.nextInt();
            guessed = guessNumber(lastGuess);
        }
       
        System.out.println("NumberGuesser " + this.getName() + " guessed its number! It was " + lastGuess);
    }
    
    public boolean guessNumber(int number){
        return this.proposer.checkAGuess(this.momento, number);
    }
    
}
