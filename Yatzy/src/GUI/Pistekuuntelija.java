/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import yatzy.Noppa;
import yatzy.Pelaaja;
import yatzy.Yatzy;
import yatzy.Pisteidenlasku;

/**
 *
 * @author lini Tämä luokka kuuntelee käyttöliittymässä tulostaulukossa olevia
 * JButtoneita Kun käyttäjä on valinnut kohdan johon haluaa lisätä pisteentä ja
 * klikannut ko. JButtonia Kutsutaan Pisteidenlaskuluokan oikeaa metodia ja
 * haetaan sen tulokset, eli ko. kohdan kokonaisepisteet jTextfieldiin
 */
public class Pistekuuntelija implements ActionListener {

    private Yatzy yatzy;
    private List<Noppa> nopat;
    private Pisteidenlasku pisteidenlasku;
    private JTextField ykkoset;
    private JTextField kakkoset;
    private JTextField kolmoset;
    private JTextField neloset;
    private JTextField vitoset;
    private JTextField kutoset;
    private JButton BTNykkoset;
    private JButton BTNkakkoset;
    private JButton BTNkolmoset;
    private JButton BTNneloset;
    private JButton BTNvitoset;
    private JButton BTNkutoset;
    private JTextField TXTpisteet;
    private int yhteispisteet = 0;
    private Pelaaja pelaaja;
    private String pelaajanimi;
    public Pistekuuntelija(Yatzy yatzy, List nopat, JTextField ykkoset, JTextField kakkoset, JTextField kolmoset, JTextField neloset, JTextField vitoset, JTextField kutoset, JButton BTNykkoset, JButton BTNkakkoset, JButton BTNkolmoset, JButton BTNneloset, JButton BTNvitoset, JButton BTNkutoset, JTextField TXTpisteet, Pelaaja pelaaja) {
        this.yatzy = yatzy;
        this.pisteidenlasku = yatzy.getPisteidenlasku();
        this.ykkoset = ykkoset;
        this.kakkoset = kakkoset;
        this.kolmoset = kolmoset;
        this.neloset = neloset;
        this.vitoset = vitoset;
        this.kutoset = kutoset;
        this.TXTpisteet = TXTpisteet;
        this.BTNykkoset = BTNykkoset;
        this.BTNkakkoset = BTNkakkoset;
        this.BTNkolmoset = BTNkolmoset;
        this.BTNneloset = BTNneloset;
        this.BTNvitoset = BTNvitoset;
        this.BTNkutoset = BTNkutoset;
        this.nopat = nopat;
        this.pelaaja = pelaaja;
        pelaajanimi = pelaaja.getNimi();



    }

    /**
     * Tässä tarkastetaan mitä JButtonia käyttäjä on painanut ja kutsutaan
     * asianmukaista pisteidenlaskumetodia luokasta Pisteidenlasku.
     *
     * Esim ensimmäisessä kohdassa kutsutaan pisteidenlasku.ykkoset joka
     * suorittaa tarkistuksen täsmäävätkö noppien silmäluvut eli kuinka monta
     * ykköstä nopissa on ja lisää oikeat pisteet tulostauluun.
     *
     * Tämän jälkeen esim tekstikenttaan "ykkoset" asetetaan tekstiksi pisteiden
     * summa ja "yhteispisteet" kentään asetetaan yhteispisteiden siihenastinen summa.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("pisteet:");
        System.out.println( yatzy.getKierros());
        if (yatzy.getKierros()!=0){

        Object source = e.getSource();

        if (source.equals(BTNykkoset)) {
            System.out.println("ykköset");
            pisteidenlasku.ykkoset();
            int tulos = (int) pisteidenlasku.getTuloslista().get("ykkoset");
            String pisteet1 = tulos + " pistettä";

            System.out.println(pisteet1);
            yhteispisteet = yhteispisteet + tulos;
            System.out.println(yhteispisteet + " yhteensä");
            this.TXTpisteet.setText(yhteispisteet + " pistettä");

            this.ykkoset.setText(pisteet1);
            BTNykkoset.setEnabled(false);


        } else if (source.equals(BTNkakkoset)) {
            System.out.println("kakkoset");
            pisteidenlasku.kakkoset();
            int tulos = (int) pisteidenlasku.getTuloslista().get("kakkoset");
            String pisteet2 = tulos + " pistettä";
            System.out.println(pisteet2);
            this.kakkoset.setText(pisteet2);
            yhteispisteet = yhteispisteet + tulos;
            this.TXTpisteet.setText(yhteispisteet + " pistettä");
            BTNkakkoset.setEnabled(false);

        } else if (source.equals(BTNkolmoset)) {
            System.out.println("kolmoset");
            pisteidenlasku.kolmoset();
            int tulos = (int) pisteidenlasku.getTuloslista().get("kolmoset");
            String pisteet3 = tulos + " pistettä";
            yhteispisteet = yhteispisteet + tulos;
            System.out.println(pisteet3);
            this.kolmoset.setText(pisteet3);
            this.TXTpisteet.setText(yhteispisteet + " pistettä");

            BTNkolmoset.setEnabled(false);

        } else if (source.equals(BTNneloset)) {
            System.out.println("neloset");
            pisteidenlasku.neloset();
            int tulos = (int) pisteidenlasku.getTuloslista().get("neloset");
            String pisteet4 = tulos + " pistettä";
            yhteispisteet = yhteispisteet + tulos;
            System.out.println(pisteet4);
            this.neloset.setText(pisteet4);
            this.TXTpisteet.setText(yhteispisteet + " pistettä");
            BTNneloset.setEnabled(false);

        } else if (source.equals(BTNvitoset)) {
            pisteidenlasku.vitoset();
            int tulos = (int) pisteidenlasku.getTuloslista().get("vitoset");
            String pisteet5 = tulos + " pistettä";
            yhteispisteet = yhteispisteet + tulos;
            this.vitoset.setText(pisteet5);
            this.TXTpisteet.setText(yhteispisteet + " pistettä");
            BTNvitoset.setEnabled(false);
        } else if (source.equals(BTNkutoset)) {;
            pisteidenlasku.kutoset();
            int tulos = (int) pisteidenlasku.getTuloslista().get("kutoset");
            String pisteet6 = tulos + " pistettä";
            yhteispisteet = yhteispisteet + tulos;
            this.kutoset.setText(pisteet6);
            this.TXTpisteet.setText(yhteispisteet + " pistettä");
            BTNkutoset.setEnabled(false);

        }


        System.out.println("kierros pelattu");
        System.out.println(pisteidenlasku.getTuloslista());
        yatzy.nollaaKierros();
        yatzy.nollaaNopat(); 


        if (!BTNykkoset.isEnabled() && !BTNkakkoset.isEnabled() && !BTNkolmoset.isEnabled() && !BTNneloset.isEnabled() && !BTNvitoset.isEnabled() && !BTNkutoset.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Peli loppui! \nPelaajan "+ pelaajanimi + " pisteet: "+yhteispisteet);

            //this.TXTpisteet.setText("pistettä");
            
        }


}
        else{
           
             JOptionPane.showMessageDialog(null, "Heitä ensin noppaa!");
             System.out.println(pelaaja.getNimi());
        }
       

    }
}
