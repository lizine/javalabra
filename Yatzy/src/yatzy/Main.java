/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import GUI.Kayttoliittyma;


/**
 *
 * @author lini
 * Main -luokka, tehtävänä on vain eriyttää ohjelman käynnistäminen omaan luokkaansa.
 * Mainmetodi kutsuu käyttöliittymäluokan run()- metodia.
 */
public class Main {
    
    public static void main(String[] args) {
        new Kayttoliittyma().run();
       
    }
}
