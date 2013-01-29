/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import java.util.HashMap;
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
    }
    
    @After
    public void tearDown() {
    }
    
    
     @Test
    public void testTulostauluunAvaimenLisays() {
        System.out.println("tulostauluun lisäys");
         Map<String, Integer> tulostaulu = new HashMap<>();
         tulostaulu.put("ykköset", 1);
         assertTrue(tulostaulu.containsKey("ykköset"));
        
    }
      @Test
    public void testTulostauluunArvonLisays() {
        System.out.println("tulostauluun lisäys");
         Map<String, Integer> tulostaulu = new HashMap<>();
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
        System.out.println("ykkoset");
        Pisteidenlasku instance = null;
        instance.ykkoset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kakkoset method, of class Pisteidenlasku.
     */
    @Test
    public void testKakkoset() {
        System.out.println("kakkoset");
        Pisteidenlasku instance = null;
        instance.kakkoset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
