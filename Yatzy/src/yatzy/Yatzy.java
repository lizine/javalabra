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
  // luodaan yksi ilmentymä Nopasta, samalla nopalla voidaan generoida silmäluku kaikille viidelle 
  //käyttäjälle näkyvälle "nopalle". Nimitetään niitä selkeyden vuoksi nimillä silmäluku(1-5);
  
  private Noppa noppa; 
  
  private int silmaluku1;
  private int silmaluku2;
  private int silmaluku3;
  private int silmaluku4;
  private int silmaluku5;
  
  public Yatzy(){
 
  
  }
  
  public void pelaaKierros(){
      
  
      for (int i=0; i<3; i++){
      noppa1.heitaNoppaa();
      noppa2.heitaNoppaa();
      noppa3.heitaNoppaa();
      noppa4.heitaNoppaa();
      noppa5.heitaNoppaa();
      
      
      }
  
  }
}
