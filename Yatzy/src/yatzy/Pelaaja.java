/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lini
 * Pelaajaluokkaa käytetään tässä vaiheessa lähinnä Lopussa esitettävän pelituloksen
 * vuoksi. Eli pelaaja-oliosta saadaan pelaajan nimi ja kokonaispisteet jotka näytetään
 * pelin päätyttyä pop-up ikkunassa. Jatkokehityksessä tätä luokkaa käytettäisiin
 * myös high scoren tallettamiseen, tai muokkaisin tämän luoka "pisteet" luokaksi.
 */
public class Pelaaja {

    private String nimi;
    private List<String> kokonaisPisteet;
    
    public Pelaaja(){
    
    }

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.kokonaisPisteet = new ArrayList<String>();
    }
    
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
     public String getNimi() {
        return nimi;
    }

    public void lisaaTulos(String pisteet) {
        kokonaisPisteet.add(pisteet);
    }

    public List<String> getPisteet() {
        return kokonaisPisteet;
    }
}
