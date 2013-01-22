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
     * Test of lisaaTulokset method, of class Yatzy.
     */
    @Test
    public void testLisaaTulokset() {
        System.out.println("lisaaTulokset");
        Yatzy instance = new Yatzy();
        instance.lisaaTulokset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pelaaKierros method, of class Yatzy.
     */
    @Test
    public void testPelaaKierros() {
        System.out.println("pelaaKierros");
        Yatzy instance = new Yatzy();
        instance.pelaaKierros();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
