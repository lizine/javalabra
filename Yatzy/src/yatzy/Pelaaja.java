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
 */
public class Pelaaja {

    private String nimi;
    private List<String> kokonaisPisteet;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.kokonaisPisteet = new ArrayList<String>();
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
