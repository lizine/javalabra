/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

/**
 *
 * @author lini
 */
public class Noppa {

    private int silmaluku;

    public Noppa() {
        // asetetaan oletuksena nopan silmäluvuksi 1. Pelin alkutilanteessa siis jokaisen nopan silmäluku on 1.
        silmaluku = 1;
    }
    // arvotaan silmaluvulle uusi arvo  Math-luokan random() metodilla

    public void heitaNoppaa() {
        this.silmaluku = (int) (Math.random() * 6) + 1;

    }

    public int getSilmaluku() {
        return this.silmaluku;
    }
    
    
}
