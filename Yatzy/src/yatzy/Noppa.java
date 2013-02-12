/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

/**
 *
 * @author lini
 * Noppa luokan ominaisuuksina nopan silmäluku, tila (onko lukittu vai ei) sekä nopan heittäminen metodilla
 * heitaNoppaa(), lisäksi luokassa on getterit ja setterit silmäluvuille ja lukitustilalle.
 */
public class Noppa {

    private int silmaluku;
    private boolean lukittu;

    public Noppa() { 
        /**
         * Asetetaan oletuksena nopan silmäluvuksi 1. Pelin alkutilanteessa siis
         * jokaisen nopan silmäluku on 1.
         *
         */
        silmaluku = 1;
        lukittu = false;

    }

    public Noppa(boolean lukittu) {
        this.lukittu = lukittu;
    }

    /**
     * Metodissa arvotaan silmäluvulle uusi arvo väliltä 1-6 Math-luokan
     * random() metodilla
     */
    public void heitaNoppaa() {
        if (lukittu == false) {
            this.silmaluku = (int) (Math.random() * 6) + 1;
        }



    }

    public int getSilmaluku() {
        return this.silmaluku;
    }

    /**
     * 
     * onkoLukittu kertoo onko noppa lukittuna vai ei
     */
    public boolean onkoLukittu() {
        return lukittu;
    }

    /**
     * Metodin tarkoitus on lukita noppa jos käyttäjä niin valitsee. Tällöin noppaa ei voi enää heittää.
     */
    
    public void lukitseNoppa() {
      //  if (lukittu = true) {
            this.lukittu = true;
       // } else {
         //   this.lukittu = false;
        //}

       
    }
    
     public void vapautaNoppa(){
        this.lukittu=false;
    }
}
