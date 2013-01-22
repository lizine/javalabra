/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

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
public class PelaajaTest {
    
    public PelaajaTest() {
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
     * Test of getNimi method, of class Pelaaja.
     */
    @Test
    public void testGetNimi() {
        System.out.println("getNimi");
        Pelaaja instance = null;
        String expResult = "";
        String result = instance.getNimi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaaTulos method, of class Pelaaja.
     */
    @Test
    public void testLisaaTulos() {
        System.out.println("lisaaTulos");
        String pisteet = "";
        Pelaaja instance = null;
        instance.lisaaTulos(pisteet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPisteet method, of class Pelaaja.
     */
    @Test
    public void testGetPisteet() {
        System.out.println("getPisteet");
        Pelaaja instance = null;
        List expResult = null;
        List result = instance.getPisteet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
