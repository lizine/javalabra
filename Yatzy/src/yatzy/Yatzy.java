/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import java.util.*;

/**
 *
 * @author lini
 */
public class Yatzy {

    private Map<String, Integer> tulostaulu = new HashMap<String, Integer>();
    private Noppa noppa1;
    private Noppa noppa2;
    private Noppa noppa3;
    private Noppa noppa4;
    private Noppa noppa5;

    public Yatzy() {
        //luodaan tulosmappiin pisteiden laskua varten nimet ja asetetaan summaksi 0
        //kun pelaaja saa tuloksia, esim 2 kakkosta, laitetaan "kakkoset" kohtaan luku 4 (eli silmälukujen summa)
        // tulostaulu.put("ykköset", 0);
        //tulostaulu.put("kakkoset", 0);
        //tulostaulu.put("kolmoset", 0);
        //tulostaulu.put("neloset", 0);
        //tulostaulu.put("vitoset", 0);
    }

    public void lisaaTulokset() {
    }

    public void pelaaKierros() {


        for (int i = 0; i < 3; i++) {
            //kun pelaaja pelaa kierroksen, heitetään ensin kaikkia viittä noppaa.    
            noppa1.heitaNoppaa();
            noppa2.heitaNoppaa();
            noppa3.heitaNoppaa();
            noppa4.heitaNoppaa();
            noppa5.heitaNoppaa();

            //tässä pitäisi näyttää tulokset käyttöliittymälle

            System.out.println(noppa1 + "" + noppa2 + " " + noppa3 + " " + noppa4 + " " + noppa5);

        }

    }

    public void nopanLukitus(boolean lukittu) {
        //actionlistener jokaiselle 5:lle nopalle käyttöliittymästä.
        //jos noppa valittu -> sitä ei voi heittää.
        //kutsut nopille 
        // noppa1.lukitseNoppa();
    }

    public void ykkoset() {
        int summa1 = 0;
        
    

        if (noppa1.getSilmaluku() == 1) {
            summa1 = summa1 + noppa1.getSilmaluku();
        }
        if (noppa2.getSilmaluku() == 1) {
            summa1 = summa1 + noppa2.getSilmaluku();
        }
        if (noppa3.getSilmaluku() == 1) {
            summa1 = summa1 + noppa3.getSilmaluku();
        }
        if (noppa4.getSilmaluku() == 1) {
            summa1 = summa1 + noppa4.getSilmaluku();
        }
        if (noppa5.getSilmaluku() == 1) {
            summa1 = summa1 + noppa5.getSilmaluku();
        }


        tulostaulu.put("ykköset", summa1);

    }
}
