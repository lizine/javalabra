/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import yatzy.Noppa;
import yatzy.Yatzy;

/**
 * Tässä Kuuntelija-luokassa luodaan tapahtumankuuntelija, joka seuraa
 * käyttöliittymässä "heitä noppaa" napin klikkaamista. Kun nappia painetaan,
 * generoidaan nopille yatzyluokassa silmäluku. Tässä luokassa etsitään
 * silmälukua vastaava nopan kuva käyttöliittymässä näytettäväksi.
 *
 */
public class NoppaKuuntelija implements ActionListener {

    private List<Noppa> nopat;
    private JButton noppa1;
    private JButton noppa2;
    private JButton noppa3;
    private JButton noppa4;
    private JButton noppa5;
    private Yatzy yatzy;
    Icon noppa1img = new ImageIcon("noppa1.jpg");
    Icon noppa2img = new ImageIcon("noppa2.jpg");
    Icon noppa3img = new ImageIcon("noppa3.jpg");
    Icon noppa4img = new ImageIcon("noppa4.jpg");
    Icon noppa5img = new ImageIcon("noppa5.jpg");
    Icon noppa6img = new ImageIcon("noppa6.jpg");
    int kierros = 0;

    /**
     * Noppakuuntelija saa konstruktorissa Käyttöliittymältä noppia vastaavat
     * napit, sekä yatzy olion ja noppien silmäluvut sisältävän listan.
     *
     * @param noppa1
     * @param noppa2
     * @param noppa3
     * @param noppa4
     * @param noppa5
     * @param nopat
     * @param yatzy
     */
    public NoppaKuuntelija(JButton noppa1, JButton noppa2, JButton noppa3, JButton noppa4, JButton noppa5, List nopat, Yatzy yatzy) {
        this.noppa1 = noppa1;
        this.noppa2 = noppa2;
        this.noppa3 = noppa3;
        this.noppa4 = noppa4;
        this.noppa5 = noppa5;
        this.nopat = nopat;
        this.yatzy = yatzy;

    }

    /**
     *
     * @param e Kun "heitä noppaa" -JButtonia painetaan, kutsutaan esnin yatzyn
     * pelaa kierros metodia,joka saa noppien silmäluvut muuttumaan. Tämän
     * jälkeen katsotaan noppien silmäluvut sisältävästä taulukosta kunkin nopan
     * silmäluku ja näytetään sitä vastaava kuva käyttöliittymässä olevassa
     * noppaa vastaavassa JButtonissa.
     *
     * TÄSSÄ ON VIELÄ RUMAA COPYPASTEA MUTTA KATSOTAAN PAREMMAKSI!!!
     */
    @Override
    public void actionPerformed(ActionEvent e) {



        if (yatzy.getKierros() < 3) {
         
            yatzy.pelaaKierros();
            System.out.println("Kuuntelija kuunteli!");
            System.out.println(yatzy.getKierros()+" kierros");


            if (nopat.get(0).getSilmaluku() == 1) {
                noppa1.setIcon(noppa1img);
                
            } else if (nopat.get(0).getSilmaluku() == 2) {
                noppa1.setIcon(noppa2img);
            } else if (nopat.get(0).getSilmaluku() == 3) {
                noppa1.setIcon(noppa3img);
            } else if (nopat.get(0).getSilmaluku() == 4) {
                noppa1.setIcon(noppa4img);
            } else if (nopat.get(0).getSilmaluku() == 5) {
                noppa1.setIcon(noppa5img);
            } else if (nopat.get(0).getSilmaluku() == 6) {
                noppa1.setIcon(noppa6img);
            }


            //noppa2
            if (nopat.get(1).getSilmaluku() == 1) {
                noppa2.setIcon(noppa1img);
            } else if (nopat.get(1).getSilmaluku() == 2) {
                noppa2.setIcon(noppa2img);
            } else if (nopat.get(1).getSilmaluku() == 3) {
                noppa2.setIcon(noppa3img);
            } else if (nopat.get(1).getSilmaluku() == 4) {
                noppa2.setIcon(noppa4img);
            } else if (nopat.get(1).getSilmaluku() == 5) {
                noppa2.setIcon(noppa5img);
            } else if (nopat.get(1).getSilmaluku() == 6) {
                noppa2.setIcon(noppa6img);
            }

            //noppa3
            if (nopat.get(2).getSilmaluku() == 1) {
                noppa3.setIcon(noppa1img);
            } else if (nopat.get(2).getSilmaluku() == 2) {
                noppa3.setIcon(noppa2img);
            } else if (nopat.get(2).getSilmaluku() == 3) {
                noppa3.setIcon(noppa3img);
            } else if (nopat.get(2).getSilmaluku() == 4) {
                noppa3.setIcon(noppa4img);
            } else if (nopat.get(2).getSilmaluku() == 5) {
                noppa3.setIcon(noppa5img);
            } else if (nopat.get(2).getSilmaluku() == 6) {
                noppa3.setIcon(noppa6img);
            }
            //noppa4
            if (nopat.get(3).getSilmaluku() == 1) {
                noppa4.setIcon(noppa1img);
            } else if (nopat.get(3).getSilmaluku() == 2) {
                noppa4.setIcon(noppa2img);
            } else if (nopat.get(3).getSilmaluku() == 3) {
                noppa4.setIcon(noppa3img);
            } else if (nopat.get(3).getSilmaluku() == 4) {
                noppa4.setIcon(noppa4img);
            } else if (nopat.get(3).getSilmaluku() == 5) {
                noppa4.setIcon(noppa5img);
            } else if (nopat.get(3).getSilmaluku() == 6) {
                noppa4.setIcon(noppa6img);
            }

            //noppa5
            if (nopat.get(4).getSilmaluku() == 1) {
                noppa5.setIcon(noppa1img);
            } else if (nopat.get(4).getSilmaluku() == 2) {
                noppa5.setIcon(noppa2img);
            } else if (nopat.get(4).getSilmaluku() == 3) {
                noppa5.setIcon(noppa3img);
            } else if (nopat.get(4).getSilmaluku() == 4) {
                noppa5.setIcon(noppa4img);
            } else if (nopat.get(4).getSilmaluku() == 5) {
                noppa5.setIcon(noppa5img);
            } else if (nopat.get(4).getSilmaluku() == 6) {
                noppa5.setIcon(noppa6img);
            }

        } else {
            //System.out.println("kirjaa pisteet");
             JOptionPane.showMessageDialog(null, "Kirjaa pisteet");
             
        }

        //  noppa2.setIcon(noppa2img);
        // noppa4.setIcon(noppa2img);
    }
}
