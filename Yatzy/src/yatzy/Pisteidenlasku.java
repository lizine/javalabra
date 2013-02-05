/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author lini
 * Pisteidenlaskuluokka vastaa tulosten kirjaamisesta ja tarkastamisesta.
 * Kun pelaaja valitsee käyttöliittymästä mihin kohtaan pisteet halutaan kirjata, tässä luokassa tarkastetaan että 
 * pisteet VOI kirjata ko.sarakkeeseen, sekä tallennetaan tulokset Hashmappiin.
 */
public class Pisteidenlasku {

    private Map<String, Integer> tulostaulu = new HashMap<>();
    private List<Noppa> nopat;

    public Pisteidenlasku(List<Noppa> nopat) {
        this.nopat = nopat;

    }

    public void ykkoset() {
        //suoritetaan jos käyttäjä on valinnut käyttöliittymästä pistelistasta kohdan "ykköset"
        //tarkistetaan noppa kerrallaan onko silmäluku 1, jos on, lisätään summaan +1.
        int summa1 = 0;

        for (int i = 0; i < nopat.size(); i++) {

            if (nopat.get(i).getSilmaluku() == 1) {
                summa1 = summa1 + 1;
            }
        }

        //lisätään summa tuostaulu-hashmappiin avaimella "ykköset" ja pisteinä silmälukujen summa
        tulostaulu.put("ykköset", summa1);

    }

    public void kakkoset() {
        int summa2 = 0;

        for (int i = 0; i < nopat.size(); i++) {

            if (nopat.get(i).getSilmaluku() == 2) {
                summa2 = summa2 + 2;
            }
        }
        tulostaulu.put("kakkoset", summa2);

    }
}
