/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import GUI.*;
import java.util.*;

/**
 *Yatzy-luokka sisältää pelin logiikan. Täällä käsitellään noppien
 * heittäminen ja lukitus, sekä välitetään nopat ArrayListinä
 * Pisteidenlaskuluokalle pisteidenlaskua varten. 
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

    /**
     * pelaaKierros kutsuu heitaNopat metodia ja lisää yatzyn kierrosmuuttujaa
     * yhdellä. Kierroksen arvoa tarvitaan mm. Lukituskuuntelija ja
     * Pistekuuntelija luokissa varmistamaan että defaultnoppia ei voi
     * lukita/merkitä pisteisiin, eikä samasta heitosta voi merkitä useampaa
     * kuin yhtä pistettä.
     */
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

    /**
     * nollaa kierrosmuuttujan. Kutsutaan esim lukituskuunteiljaluokasta.
     */
    public void nollaaKierros() {
        this.kierros = 0;
    }

    /**
     * nollaa noppien lukitukset kutsumalla noppaolion vapautaNoppa metodia.
     * käytetään uuden kierroksen alussa.
     */
    public void nollaaNopat() {
        for (int i = 0; i <= 5; i++) {
            nopat.get(i).vapautaNoppa();
        }

    }
}
