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
import yatzy.Yatzy;
import javax.swing.JButton;
import yatzy.Noppa;

/**
 *
 * Tämä luokka kuuntelee mitä noppia käyttöliittymästä on valittu lukittaviksi,
 * sekä asettaa niiden lukitusarvon TRUEksi ja vaihtaa nopan kuvan oikeaan.
 * 
 */
public class Lukituskuuntelija implements ActionListener {

    private JButton noppa1;
    private JButton noppa2;
    private JButton noppa3;
    private JButton noppa4;
    private JButton noppa5;
    private Yatzy yatzy;
    private List<Noppa> nopat;
    private NoppaKuuntelija noppakuuntelija;
    Icon noppa1aimg = new ImageIcon("noppa1a.jpg");
    Icon noppa2aimg = new ImageIcon("noppa2a.jpg");
    Icon noppa3aimg = new ImageIcon("noppa3a.jpg");
    Icon noppa4aimg = new ImageIcon("noppa4a.jpg");
    Icon noppa5aimg = new ImageIcon("noppa5a.jpg");
    Icon noppa6aimg = new ImageIcon("noppa6a.jpg");
    //lukittujen noppien kuvat
    Icon noppa1img = new ImageIcon("noppa1.jpg");
    Icon noppa2img = new ImageIcon("noppa2.jpg");
    Icon noppa3img = new ImageIcon("noppa3.jpg");
    Icon noppa4img = new ImageIcon("noppa4.jpg");
    Icon noppa5img = new ImageIcon("noppa5.jpg");
    Icon noppa6img = new ImageIcon("noppa6.jpg");

    public Lukituskuuntelija(JButton noppa1, JButton noppa2, JButton noppa3, JButton noppa4, JButton noppa5, List nopat, Yatzy yatzy) {
        this.noppa1 = noppa1;
        this.noppa2 = noppa2;
        this.noppa3 = noppa3;
        this.noppa4 = noppa4;
        this.noppa5 = noppa5;
        this.yatzy = yatzy;
        this.nopat = nopat;

    }

    /**
     * actionPerformed-metodi käy läpi jokaisen nopan ja tarkistaa onko käyttäjä
     * klikannut sitä, jos on, niin noppa lukitaan.
     *
     * Noppien lukittaminen aloitetaan vasta, kun käyttäjä on ensimmäisen kerran
     * heittänyt noppia. Defaulttina näkyvää ykkösriviä ei siis voi lukita eikä
     * pisteitä täten kirjata. Tämä hoidetaan ensimmäisenä olevalla
     * if-tarkastuksella.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println("noppa valittu");



        Object source = e.getSource();

        if (yatzy.getKierros() != 0) {

            if (source.equals(noppa1)) {
              //  System.out.println("noppa1");
                nopat.get(0).lukitseNoppa();
                vaihdaNoppienKuvat();


            } else if (source.equals(noppa2)) {
            //    System.out.println("noppa2");
                nopat.get(1).lukitseNoppa();
                vaihdaNoppienKuvat();
            } else if (source.equals(noppa3)) {
                nopat.get(2).lukitseNoppa();
              //  System.out.println("3");
                vaihdaNoppienKuvat();
            } else if (source.equals(noppa4)) {
                nopat.get(3).lukitseNoppa();
          //      System.out.println("4");
                vaihdaNoppienKuvat();
            } else if (source.equals(noppa5)) {
                nopat.get(4).lukitseNoppa();
              //  System.out.println("5");
                vaihdaNoppienKuvat();
            }
        }
    }

    /**
     * Käydään jokainen noppa läpi, katsotaan mikä silmäluku nopalla on ja onko
     * lukitus true tai false. Tulosten perusteella näytetään nopan silmälukua
     * ja lukitustilaa vastaava kuva.
     */
    public void vaihdaNoppienKuvat() {
        if (nopat.get(0).getSilmaluku() == 1 && nopat.get(0).onkoLukittu() == false) {
            noppa1.setIcon(noppa1aimg);

        } else if (nopat.get(0).getSilmaluku() == 1 && nopat.get(0).onkoLukittu() == true) {
            noppa1.setIcon(noppa1img);
        } //toinen noppa
        else if (nopat.get(0).getSilmaluku() == 2 && nopat.get(0).onkoLukittu() == false) {
            noppa1.setIcon(noppa2aimg);

        } else if (nopat.get(0).getSilmaluku() == 2 && nopat.get(0).onkoLukittu() == true) {
            noppa1.setIcon(noppa2img);

            //kolmas noppa
        } else if (nopat.get(0).getSilmaluku() == 3 && nopat.get(0).onkoLukittu() == false) {
            noppa1.setIcon(noppa3aimg);

        } else if (nopat.get(0).getSilmaluku() == 3 && nopat.get(0).onkoLukittu() == true) {
            noppa1.setIcon(noppa3img);
        } else if (nopat.get(0).getSilmaluku() == 4 && nopat.get(0).onkoLukittu() == false) {
            noppa1.setIcon(noppa4aimg);
        } else if (nopat.get(0).getSilmaluku() == 4 && nopat.get(0).onkoLukittu() == true) {
            noppa1.setIcon(noppa4img);
        } else if (nopat.get(0).getSilmaluku() == 5 && nopat.get(0).onkoLukittu() == false) {
            noppa1.setIcon(noppa5aimg);
        } else if (nopat.get(0).getSilmaluku() == 5 && nopat.get(0).onkoLukittu() == true) {
            noppa1.setIcon(noppa5img);
        } else if (nopat.get(0).getSilmaluku() == 6 && nopat.get(0).onkoLukittu() == false) {
            noppa1.setIcon(noppa6aimg);
        } else if (nopat.get(0).getSilmaluku() == 6 && nopat.get(0).onkoLukittu() == true) {
            noppa1.setIcon(noppa6img);
        }


        //noppa2
        if (nopat.get(1).getSilmaluku() == 1 && nopat.get(1).onkoLukittu() == false) {
            noppa2.setIcon(noppa1aimg);
        } else if (nopat.get(1).getSilmaluku() == 1 && nopat.get(1).onkoLukittu() == true) {
            noppa2.setIcon(noppa1img);
        } else if (nopat.get(1).getSilmaluku() == 2 && nopat.get(1).onkoLukittu() == false) {
            noppa2.setIcon(noppa2aimg);
        } else if (nopat.get(1).getSilmaluku() == 2 && nopat.get(1).onkoLukittu() == true) {
            noppa2.setIcon(noppa2img);
        } else if (nopat.get(1).getSilmaluku() == 3 && nopat.get(1).onkoLukittu() == false) {
            noppa2.setIcon(noppa3aimg);
        } else if (nopat.get(1).getSilmaluku() == 3 && nopat.get(1).onkoLukittu() == true) {
            noppa2.setIcon(noppa3img);
        } else if (nopat.get(1).getSilmaluku() == 4 && nopat.get(1).onkoLukittu() == false) {
            noppa2.setIcon(noppa4aimg);
        } else if (nopat.get(1).getSilmaluku() == 4 && nopat.get(1).onkoLukittu() == true) {
            noppa2.setIcon(noppa4img);
        } else if (nopat.get(1).getSilmaluku() == 5 && nopat.get(1).onkoLukittu() == false) {
            noppa2.setIcon(noppa5aimg);
        } else if (nopat.get(1).getSilmaluku() == 5 && nopat.get(1).onkoLukittu() == true) {
            noppa2.setIcon(noppa5img);
        } else if (nopat.get(1).getSilmaluku() == 6 && nopat.get(1).onkoLukittu() == false) {
            noppa2.setIcon(noppa6aimg);
        } else if (nopat.get(1).getSilmaluku() == 6 && nopat.get(1).onkoLukittu() == true) {
            noppa2.setIcon(noppa6img);
        }

        //noppa3
        if (nopat.get(2).getSilmaluku() == 1 && nopat.get(2).onkoLukittu() == false) {
            noppa3.setIcon(noppa1aimg);
        } else if (nopat.get(2).getSilmaluku() == 1 && nopat.get(2).onkoLukittu() == true) {
            noppa3.setIcon(noppa1img);
        } else if (nopat.get(2).getSilmaluku() == 2 && nopat.get(2).onkoLukittu() == false) {
            noppa3.setIcon(noppa2aimg);
        } else if (nopat.get(2).getSilmaluku() == 2 && nopat.get(2).onkoLukittu() == true) {
            noppa3.setIcon(noppa2img);
        } else if (nopat.get(2).getSilmaluku() == 3 && nopat.get(2).onkoLukittu() == false) {
            noppa3.setIcon(noppa3aimg);
        } else if (nopat.get(2).getSilmaluku() == 3 && nopat.get(2).onkoLukittu() == true) {
            noppa3.setIcon(noppa3img);
        } else if (nopat.get(2).getSilmaluku() == 4 && nopat.get(2).onkoLukittu() == false) {
            noppa3.setIcon(noppa4aimg);
        } else if (nopat.get(2).getSilmaluku() == 4 && nopat.get(2).onkoLukittu() == true) {
            noppa3.setIcon(noppa4img);
        } else if (nopat.get(2).getSilmaluku() == 5 && nopat.get(2).onkoLukittu() == false) {
            noppa3.setIcon(noppa5aimg);
        } else if (nopat.get(2).getSilmaluku() == 5 && nopat.get(2).onkoLukittu() == true) {
            noppa3.setIcon(noppa5img);
        } else if (nopat.get(2).getSilmaluku() == 6 && nopat.get(2).onkoLukittu() == false) {
            noppa3.setIcon(noppa6aimg);
        } else if (nopat.get(2).getSilmaluku() == 6 && nopat.get(2).onkoLukittu() == true) {
            noppa3.setIcon(noppa6img);
        }
        //noppa4
        if (nopat.get(3).getSilmaluku() == 1 && nopat.get(3).onkoLukittu() == false) {
            noppa4.setIcon(noppa1aimg);
        } else if (nopat.get(3).getSilmaluku() == 1 && nopat.get(3).onkoLukittu() == true) {
            noppa4.setIcon(noppa1img);
        } else if (nopat.get(3).getSilmaluku() == 2 && nopat.get(3).onkoLukittu() == false) {
            noppa4.setIcon(noppa2aimg);
        } else if (nopat.get(3).getSilmaluku() == 2 && nopat.get(3).onkoLukittu() == true) {
            noppa4.setIcon(noppa2img);
        } else if (nopat.get(3).getSilmaluku() == 3 && nopat.get(3).onkoLukittu() == false) {
            noppa4.setIcon(noppa3aimg);
        } else if (nopat.get(3).getSilmaluku() == 3 && nopat.get(3).onkoLukittu() == true) {
            noppa4.setIcon(noppa3img);
        } else if (nopat.get(3).getSilmaluku() == 4 && nopat.get(3).onkoLukittu() == false) {
            noppa4.setIcon(noppa4aimg);
        } else if (nopat.get(3).getSilmaluku() == 4 && nopat.get(3).onkoLukittu() == true) {
            noppa4.setIcon(noppa4img);
        } else if (nopat.get(3).getSilmaluku() == 5 && nopat.get(3).onkoLukittu() == false) {
            noppa4.setIcon(noppa5aimg);
        } else if (nopat.get(3).getSilmaluku() == 5 && nopat.get(3).onkoLukittu() == true) {
            noppa4.setIcon(noppa5img);
        } else if (nopat.get(3).getSilmaluku() == 6 && nopat.get(3).onkoLukittu() == false) {
            noppa4.setIcon(noppa6aimg);
        } else if (nopat.get(3).getSilmaluku() == 6 && nopat.get(3).onkoLukittu() == true) {
            noppa4.setIcon(noppa6img);
        }

        //noppa5
        if (nopat.get(4).getSilmaluku() == 1 && nopat.get(4).onkoLukittu() == false) {
            noppa5.setIcon(noppa1aimg);
        } else if (nopat.get(4).getSilmaluku() == 1 && nopat.get(4).onkoLukittu() == true) {
            noppa5.setIcon(noppa1img);
        } else if (nopat.get(4).getSilmaluku() == 2 && nopat.get(4).onkoLukittu() == false) {
            noppa5.setIcon(noppa2aimg);
        } else if (nopat.get(4).getSilmaluku() == 2 && nopat.get(4).onkoLukittu() == true) {
            noppa5.setIcon(noppa2img);
        } else if (nopat.get(4).getSilmaluku() == 3 && nopat.get(4).onkoLukittu() == false) {
            noppa5.setIcon(noppa3aimg);
        } else if (nopat.get(4).getSilmaluku() == 3 && nopat.get(4).onkoLukittu() == true) {
            noppa5.setIcon(noppa3img);
        } else if (nopat.get(4).getSilmaluku() == 4 && nopat.get(4).onkoLukittu() == false) {
            noppa5.setIcon(noppa4aimg);
        } else if (nopat.get(4).getSilmaluku() == 4 && nopat.get(4).onkoLukittu() == true) {
            noppa5.setIcon(noppa4img);

        } else if (nopat.get(4).getSilmaluku() == 5 && nopat.get(4).onkoLukittu() == false) {
            noppa5.setIcon(noppa5aimg);
        } else if (nopat.get(4).getSilmaluku() == 5 && nopat.get(4).onkoLukittu() == true) {
            noppa5.setIcon(noppa5img);
        } else if (nopat.get(4).getSilmaluku() == 6 && nopat.get(4).onkoLukittu() == false) {
            noppa5.setIcon(noppa6aimg);
        } else if (nopat.get(4).getSilmaluku() == 6 && nopat.get(4).onkoLukittu() == true) {
            noppa5.setIcon(noppa6img);
        }
    }
}
