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
    private boolean lukittu;

    public Noppa() {
        // asetetaan oletuksena nopan silmäluvuksi 1. Pelin alkutilanteessa siis jokaisen nopan silmäluku on 1.
        silmaluku = 1;
        lukittu = false;

    }
    // arvotaan silmaluvulle uusi arvo  Math-luokan random() metodilla

    public Noppa(boolean lukittu) {
        this.lukittu = lukittu;
    }

    public void heitaNoppaa() {
        if (lukittu==false){
            this.silmaluku = (int) (Math.random() * 6) + 1;
        }
        
        

    }

    public int getSilmaluku() {
        return this.silmaluku;
    }

    public boolean onkoLukittu() {
        return lukittu;
    }

    public void lukitseNoppa(boolean lukittu) {
        if (lukittu = true) {
            this.lukittu = true;
        } else {
            this.lukittu = false;
        }

    }
}
