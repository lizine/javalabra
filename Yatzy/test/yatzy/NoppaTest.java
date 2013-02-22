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

    private Noppa noppa;

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
        noppa = new Noppa();
    }

    @After
    public void tearDown() {
    }

    /**
     * Testataan, että nopan silmäluku on väliltä 1-6.
     */
    @Test
    public void testHeitaNoppaa() {
        System.out.println("heitaNoppaa");
        // 
        noppa.heitaNoppaa();
        int silmaluku = noppa.getSilmaluku();
        assertTrue(silmaluku > 0 && silmaluku < 7);

    }

    /**
     * Testataan onko uuden nopan silmäluku alussa 1, kuten määritelty.
     */
    @Test
    public void testGetSilmalukuAlussa() {
        System.out.println("getSilmaluku");
        //  Noppa noppa = new Noppa();

        int expResult = 1;
        int result = noppa.getSilmaluku();
        assertEquals(expResult, result);


    }

    /**
     * Testataan ovatko kaikki nopat aluksi lukitsemattomia, eli käyttäjä
     * pystyy "heittämään" niitä.
     */
    @Test
    public void testGetLukittuOnFalseAlussa() {
        System.out.println("onkoLukittu");
       // Noppa noppa = new Noppa();

        boolean expResult = false;
        boolean result = noppa.onkoLukittu();
        assertEquals(expResult, result);


    }

    /**
     *  onkoLukittu -metodi testaa muuttuuko nopan lukittu arvo trueksi kun kutsutaan
     * lukitseNoppa() -metodia.
     */
    @Test
    public void testLukittuukoNoppa() {
        System.out.println("Lukittuuko noppa lukittaessa.");
       // Noppa noppa = new Noppa();
        noppa.lukitseNoppa();
        boolean lukitettu = true;
        boolean result = noppa.onkoLukittu();
        assertEquals(lukitettu, result);

    }
    
    @Test
    public void testvapautaNoppa(){
        noppa.vapautaNoppa();
        boolean lukittu = false;
        boolean tulos = noppa.onkoLukittu();
        assertEquals(lukittu, tulos);
    
    }
}
