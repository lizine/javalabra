/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lini
 */
public class YatzyTest {
    
    public YatzyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pelaaKierros method, of class Yatzy.
     */
    @Test
    public void testPelaaKierros() {
        System.out.println("pelaaKierros");
        Yatzy yatzy = new Yatzy();
        
        
        yatzy.pelaaKierros();
        yatzy.pelaaKierros();
        
         int expResult = 2;
        int result = yatzy.getKierros();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of heitaNopat method, of class Yatzy.
     */
    @Test
    public void testHeitaNopat() {
        System.out.println("heitaNopat");
       
        Yatzy yatzy = new Yatzy();
        yatzy.heitaNopat();
        
        
        List <Noppa>noppalista = yatzy.getNoppaLista();
        boolean toimii;
        for (int i=0; i<5; i++){
           
          if (  noppalista.get(i).getSilmaluku() !=0 ){
              toimii = true;
          }
          else {
          toimii=false;
          }
          
        boolean expResult = true;
        boolean result = toimii;
        assertEquals(expResult, result);
        }
        
    }
     @Test
    public void testNollaaNopat() {
       
        Yatzy yatzy = new Yatzy();
        yatzy.heitaNopat(); 
        boolean lukitut;
        List <Noppa>noppalista = yatzy.getNoppaLista();
        
        yatzy.nollaaNopat();
        
        for (int j=0; j<5;j++){
            if (  noppalista.get(j).onkoLukittu()==false){
                lukitut=false;
        }
            else {
            lukitut = true;
            }
            
        boolean expResult = false;
        boolean result =lukitut;
        assertEquals(expResult, result);
            
        }
        
      
        
    }

    /**
     * Test of getNoppaLista method, of class Yatzy.
     */
   

   

    /**
     * Test of getKierros method, of class Yatzy.
     */
    @Test
    public void testGetKierros() {
        System.out.println("getKierros");
        Yatzy yatzy = new Yatzy();
        yatzy.pelaaKierros();
        int expResult = 1;
        int result = yatzy.getKierros();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of nollaaKierros method, of class Yatzy.
     */
    @Test
    public void testNollaaKierros() {
       
        Yatzy yatzy = new Yatzy();
        yatzy.nollaaKierros();
        
        int expResult = 0;
        int result = yatzy.getKierros();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of nollaaNopat method, of class Yatzy.
     */
   
}
