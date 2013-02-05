/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
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
public class KayttoliittymaTest {
    
    public KayttoliittymaTest() {
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
     * Test of run method, of class Kayttoliittyma.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Kayttoliittyma instance = new Kayttoliittyma();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrame method, of class Kayttoliittyma.
     */
    @Test
    public void testGetFrame() {
        System.out.println("getFrame");
        Kayttoliittyma instance = new Kayttoliittyma();
        JFrame expResult = null;
        JFrame result = instance.getFrame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
