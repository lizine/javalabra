/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import GUI.*;
import java.util.*;

/**
 *
 * @author lini Yatzy-luokka sisältää pelin logiikan. Täällä käsitellään noppien
 * heittäminen ja lukitus sekä välitetään nopat ArrayListinä
 * Pisteidenlaskuluokalle. Pisteidenlaskua varten.
 */
public class Yatzy {
    
    private List<Noppa> nopat = new ArrayList<Noppa>();
    private Noppa noppa1 = new Noppa();
    private Noppa noppa2 = new Noppa();
    private Noppa noppa3 = new Noppa();
    private Noppa noppa4 = new Noppa();
    private Noppa noppa5 = new Noppa();
    private Pisteidenlasku pisteidenlasku;
    private int kierros = 0;
    
    public Yatzy() {
        nopat.add(noppa1);
        nopat.add(noppa2);
        nopat.add(noppa3);
        nopat.add(noppa4);
        nopat.add(noppa5);
        pisteidenlasku = new Pisteidenlasku(nopat);
        
        
    }
    
    
    
    public void pelaaKierros() {
      
        heitaNopat();
        kierros++;

    }
    
    public void heitaNopat() {

        /**
         * kun pelaaja pelaa kierroksen, heitetään ensin kaikkia viittä noppaa.
         * Ja lisätään silmäluvut arraylistille joka välitetään sekä
         * käyttöliittymäluokalle, että pisteidenlaskuluokalle.
         *
         */
        noppa1.heitaNoppaa();
        noppa2.heitaNoppaa();
        noppa3.heitaNoppaa();
        noppa4.heitaNoppaa();
        noppa5.heitaNoppaa();

        //lisätään noppien silmäluvut ArrayListiin

        nopat.add(noppa1);
        nopat.add(noppa2);
        nopat.add(noppa3);
        nopat.add(noppa4);
        nopat.add(noppa4);
        
    }
    
    public List getNoppaLista() {
        return nopat;
    }
    
    public Pisteidenlasku getPisteidenlasku() {
        return pisteidenlasku;
    }
    
    public int getKierros() {
        return this.kierros;
    }
    
    public void nollaaKierros() {
        this.kierros = 0;
    }
    
    public void nollaaNopat() {
        for (int i = 0; i <= 5; i++) {
            nopat.get(i).vapautaNoppa();
        }
        
    }
    //    public void nopanLukitus() {
//        //actionlistener jokaiselle 5:lle nopalle käyttöliittymästä.
//        //jos noppa valittu -> sitä ei voi heittää.
//        //kutsut nopille 
//        // noppa1.lukitseNoppa();
//    }
}
