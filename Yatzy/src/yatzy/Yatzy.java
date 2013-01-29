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

    private List<Noppa> nopat =new ArrayList<Noppa>();
    private Noppa noppa1 =new Noppa();
    private Noppa noppa2 =new Noppa();
    private Noppa noppa3 =new Noppa();
    private Noppa noppa4 =new Noppa();
    private Noppa noppa5 =new Noppa();
    private Pisteidenlasku pisteidenlasku;

    public Yatzy() {
        nopat.add(noppa1);
        nopat.add(noppa2);
        nopat.add(noppa3);
        nopat.add(noppa4);
        nopat.add(noppa5);
        pisteidenlasku = new Pisteidenlasku(nopat);
       
       
    }

    public void valitseLisattavatTulokset() {
        //tapahtumankuuntelija käyttöliittymässä katsoo mihin kohtaan
        //käyttäjä haluaa lisätä tulokset.
        
       // if (ykkoset==true){
    //pisteidenlasku.ykkoset();
      //  }
        //else if (kakkoset==true){
            //pisteidenlasku.kakkoset();
        
    //}
    
    }
    
    

    public void pelaaKierros(){
        for (int i = 0; i<=3; i++){
        heitaNopat();
        nopanLukitus();
        valitseLisattavatTulokset();
        }
        //kierroksen lopuksi poistetaan lukitus kaikista nopista
        for (int i=0; i < nopat.size();i++){
            nopat.get(i).lukitseNoppa(false);
        }
    }
    
    public void heitaNopat() { 

            //kun pelaaja pelaa kierroksen, heitetään ensin kaikkia viittä noppaa.    
            noppa1.heitaNoppaa();
            noppa2.heitaNoppaa();
            noppa3.heitaNoppaa();
            noppa4.heitaNoppaa();
            noppa5.heitaNoppaa();
            

            //tässä pitäisi näyttää tulokset käyttöliittymälle

           // System.out.println(noppa1 + "" + noppa2 + " " + noppa3 + " " + noppa4 + " " + noppa5);
            

        

    }

    public void nopanLukitus(){
        //actionlistener jokaiselle 5:lle nopalle käyttöliittymästä.
        //jos noppa valittu -> sitä ei voi heittää.
        //kutsut nopille 
        // noppa1.lukitseNoppa();
    }

    
}
