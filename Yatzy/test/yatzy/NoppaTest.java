/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

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
public class NoppaTest {
    
    public NoppaTest() {
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
     * Test of heitaNoppaa method, of class Noppa.
     */
    @Test
    public void testHeitaNoppaa() {
        System.out.println("heitaNoppaa");
        Noppa noppa = new Noppa();
        noppa.heitaNoppaa();
        int silmaluku = noppa.getSilmaluku();
         assertTrue(silmaluku>0 && silmaluku<7);
                
                      
            
        
       // fail("Silmäluku ei ole 1-6");
    }

    /**
     * Testataan onko uuden nopan silmäluku alussa 1, kuten määritelty.
     */
    @Test
    public void testGetSilmalukuAlussa() {
        System.out.println("getSilmaluku");
        Noppa noppa = new Noppa();
        
        int expResult = 1;
        int result = noppa.getSilmaluku();
        assertEquals(expResult, result);
        
        
    }
    
     @Test
    public void testGetLukittuOnFalseAlussa() {
        System.out.println("onkoLukittu");
        Noppa noppa = new Noppa();
        
        boolean expResult = false;
        boolean result = noppa.onkoLukittu();
        assertEquals(expResult, result);
        
      
    }
    
    

    /**
     * Test of onkoLukittu method, of class Noppa.
     */
    @Test
    public void testLukittuukoNoppa() {
        System.out.println("Lukittuuko noppa lukittaessa.");
        Noppa noppa = new Noppa();
        noppa.lukitseNoppa();
        boolean expResult = true;
        boolean result = noppa.onkoLukittu();
        assertEquals(expResult, result);
        
    }

  
}
