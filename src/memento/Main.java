package memento;

/**
 *
 * @author aleksandrpasharin
 */
public class Main {
    
    public static void main(String[] args) {
        
        NumberProposer arvuuttaja = new NumberProposer();
        NumberGuesser[] asiakkaat = new NumberGuesser[10];
        
        // luodaan 10 asiakasta
        for(int i = 0; i < 10; i++){
            asiakkaat[i] = new NumberGuesser(arvuuttaja);
        }
        
        // käynnistetään arvaukset
        for(int i = 0; i < 10; i++){
            asiakkaat[i].start();
        }
    }
    
}
