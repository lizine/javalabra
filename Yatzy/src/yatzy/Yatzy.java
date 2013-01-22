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
  

  
  public Yatzy(){
 
  
  }
  
  public void lisaaTulokset(){
  
  
  }
  
  public void pelaaKierros(){
      
  
      for (int i=0; i<3; i++){
      //kun pelaaja pelaa kierroksen, heitetään ensin kaikkia viittä noppaa.    
      noppa1.heitaNoppaa();
      noppa2.heitaNoppaa();
      noppa3.heitaNoppaa();
      noppa4.heitaNoppaa();
      noppa5.heitaNoppaa();
      
      //tässä pitäisi näyttää tulokset käyttöliittymälle
      
          System.out.println(noppa1+""+noppa2+" "+noppa3);
      
      }
  
  }
}
