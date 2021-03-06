/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class PisteidenlaskuTest {
     Map<String, Integer> tulostaulu;
      Yatzy yatzy;
     
    public PisteidenlaskuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         tulostaulu = new HashMap<>();
         yatzy = new Yatzy();
    }
    
    @After
    public void tearDown() {
    }
    
    
     @Test
    public void testTulostauluunAvaimenLisays() {
        System.out.println("tulostauluun lisäys");
        
         tulostaulu.put("ykköset", 1);
         assertTrue(tulostaulu.containsKey("ykköset"));
        
    }
      @Test
    public void testTulostauluunArvonLisays() {
       
         tulostaulu.put("ykköset", 1);
        int expResult = 1;
        int result = tulostaulu.get("ykköset");
        assertEquals(expResult, result);
        
    }
    
    

    /**
     * Test of ykkoset method, of class Pisteidenlasku.
     */
    @Test
    public void testYkkoset() {
     
        
        List <Noppa>noppalista = yatzy.getNoppaLista();
        
        
        for (int i=0; i<5;i++){
            noppalista.get(i).setSilmaluku(1);
        }
        Pisteidenlasku pisteidenlasku = new Pisteidenlasku(noppalista);
        pisteidenlasku.ykkoset();
        
       
        
        int expResult = 5;
        int result = (int)pisteidenlasku.getTuloslista().get("ykkoset");
        assertEquals(expResult, result);
        
    }

    /**
     * Test of kakkoset method, of class Pisteidenlasku.
     */
    @Test
    public void testKakkoset() {
   
        
        List <Noppa>noppalista = yatzy.getNoppaLista();
        
        
        for (int i=0; i<5;i++){
            noppalista.get(i).setSilmaluku(2);
        }
        Pisteidenlasku pisteidenlasku = new Pisteidenlasku(noppalista);
        pisteidenlasku.kakkoset();
        
       
        
        int expResult = 10;
        int result = (int)pisteidenlasku.getTuloslista().get("kakkoset");
        assertEquals(expResult, result);
    }
     @Test
    public void testKolmoset() {
    
        
        List <Noppa>noppalista = yatzy.getNoppaLista();
        
        
        for (int i=0; i<5;i++){
            noppalista.get(i).setSilmaluku(3);
        }
        Pisteidenlasku pisteidenlasku = new Pisteidenlasku(noppalista);
        pisteidenlasku.kolmoset();
        
       
        
        int expResult = 15;
        int result = (int)pisteidenlasku.getTuloslista().get("kolmoset");
        assertEquals(expResult, result);
    }
       @Test
    public void testNeloset() {
   
        
        List <Noppa>noppalista = yatzy.getNoppaLista();
        
        
        for (int i=0; i<5;i++){
            noppalista.get(i).setSilmaluku(4);
        }
        Pisteidenlasku pisteidenlasku = new Pisteidenlasku(noppalista);
        pisteidenlasku.neloset();
        
       
        
        int expResult = 20;
        int result = (int)pisteidenlasku.getTuloslista().get("neloset");
        assertEquals(expResult, result);
    }
       @Test
    public void testVitoset() {
    
        
        List <Noppa>noppalista = yatzy.getNoppaLista();
        
        
        for (int i=0; i<5;i++){
            noppalista.get(i).setSilmaluku(5);
        }
        Pisteidenlasku pisteidenlasku = new Pisteidenlasku(noppalista);
        pisteidenlasku.vitoset();
        
       
        
        int expResult = 25;
        int result = (int)pisteidenlasku.getTuloslista().get("vitoset");
        assertEquals(expResult, result);
    }
         @Test
    public void testKutoset() {
    
        
        List <Noppa>noppalista = yatzy.getNoppaLista();
        
        
        for (int i=0; i<5;i++){
            noppalista.get(i).setSilmaluku(6);
        }
        Pisteidenlasku pisteidenlasku = new Pisteidenlasku(noppalista);
        pisteidenlasku.kutoset();
        
       
        
        int expResult = 30;
        int result = (int)pisteidenlasku.getTuloslista().get("kutoset");
        assertEquals(expResult, result);
    }
     
     
}
