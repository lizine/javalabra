/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import java.util.Random;

/**
 *
 * Noppa luokan ominaisuuksina nopan silmäluku, tila (onko lukittu
 * vai ei) sekä nopan heittäminen metodilla heitaNoppaa(), lisäksi luokassa on
 * getterit ja setterit silmäluvuille ja lukitustilalle.
 */
public class Noppa {

    private int silmaluku;
    private boolean lukittu;

    public Noppa() {
        /**
         * Asetetaan oletuksena nopan silmäluvuksi 1. Pelin alkutilanteessa siis
         * jokaisen nopan silmäluku on 1.
         * @param lukittu
         * @param silmaluku
         */
        silmaluku = 1;
        lukittu = false;

    }
/**
 * 
 * @param lukittu 
 */
    public Noppa(boolean lukittu) {
        this.lukittu = lukittu;
    }

    /**
     * Metodissa arvotaan nopan silmäluku muuttujalle uusi arvo väliltä 1-6.
     */
    public void heitaNoppaa() {
        Random nopanheittaja = new Random();
        if (lukittu == false) {


            this.silmaluku = nopanheittaja.nextInt(6) + 1;
            // this.silmaluku = (int) (Math.random() * 6) + 1;
        }



    }

    public int getSilmaluku() {
        return this.silmaluku;
    }

    public void setSilmaluku(int numero) {
        this.silmaluku = numero;
    }

    /**
     *
     * onkoLukittu kertoo onko noppa lukittuna vai ei. Palauttaa muuttujan
     * lukittu.
     * @param lukittu
     */
    public boolean onkoLukittu() {
        return lukittu;
    }

    /**
     * Metodin tarkoitus on lukita noppa jos käyttäjä niin valitsee. Tällöin
     * noppaa ei voi enää heittää.
     * @param lukittu
     */
    public void lukitseNoppa() {

        this.lukittu = true;


    }

    public void vapautaNoppa() {
        this.lukittu = false;
    }
}
