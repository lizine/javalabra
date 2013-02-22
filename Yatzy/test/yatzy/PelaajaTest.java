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
    private Pelaaja pelaaja;
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
          pelaaja = new Pelaaja();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNimi method, of class Pelaaja.
     */
    @Test
    public void testGetNimi() {
        
        pelaaja.setNimi("taneli");
       
        String nimi = "taneli";
        String tulos = pelaaja.getNimi();
        assertEquals(nimi, tulos);
    }
    
     public void testSetNimi() {
       pelaaja.setNimi("teppo");
       
        String nimi = "teppo";
        String tulos = pelaaja.getNimi();
        assertEquals(nimi, tulos);
    }

    /**
     * Test of lisaaTulos method, of class Pelaaja.
     */
    @Test
    public void testLisaaTulos() {
     
    }

    /**
     * Test of getPisteet method, of class Pelaaja.
     */
    @Test
    public void testGetPisteet() {
     
    }
}
