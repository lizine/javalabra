/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import yatzy.Noppa;
import yatzy.Pelaaja;
import yatzy.Yatzy;
import yatzy.Pisteidenlasku;



/**
 * Käyttöliittymäluokassa luodaan yatzyn "pelipöytä". Jframe,
 * johon sijoitetaan viisi nopan kuvalla varustettua JButtonia vierekkäin, sekä
 * niiden alle JButton, josta noppia voi pyöräyttää.
 *
 * Näiden alle luodaan pisteidenkirjaustaulukko.Jbuttoneineen ja
 * Jtextfieldeineen, sekä yhteispisteosio johon lasketaan käyttäjän
 * yhteispisteet.
 *
 */
public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Yatzy yatzy;
    private JButton noppa1;
    private JButton noppa2;
    private JButton noppa3;
    private JButton noppa4;
    private JButton noppa5;
    private List<Noppa> nopat;
    private JTextField ykkoset;
    private JTextField kakkoset;
    private JTextField kolmoset;
    private JTextField neloset;
    private JTextField vitoset;
    private JTextField kutoset;
    private JTextField yatzyt;
    private JTextField TXTpisteet;
    private String pelaajaNimi;
    private Pelaaja pelaaja;
    //noppien kuvien esittely
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

    
    public Kayttoliittyma() {
        yatzy = new Yatzy();
        pelaaja = new Pelaaja();
        nopat = yatzy.getNoppaLista();
    }

    @Override
    public void run() {
        pelaajaNimi = JOptionPane.showInputDialog(null, "Nimesi");
        System.out.println(pelaajaNimi);
        pelaaja.setNimi(pelaajaNimi);
        frame = new JFrame("Yatzy");
        frame.setPreferredSize(new Dimension(500, 800));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);



    }

    /**
     * luoKomponentit metodissa luodaan neljä riviä ja yhden sarakkeen sisältävä
     * gridi komponentteja varten.
     *
     * Sitten ensimmäiselle riville lisätään luonopat() metodilla nopat.
     * Toiselle riville luodaan suoraan "heita noppaa" Jbutton sekä lisätään
     * sille oma kuuntelija Kolmannelle riville kutsutaan tulosTaulukko()
     * metodia joka luo tulostaulukon ja neljännelle riville kutsutaan
     * yhteispisteet -metodia joka luo yhteispisteosion.
     */
    private void luoKomponentit(Container container) {

        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        container.add(luoNopat());

        JButton heitaNoppaa = new JButton("Heitä noppaa!");
        heitaNoppaa.addActionListener(new NoppaKuuntelija(noppa1, noppa2, noppa3, noppa4, noppa5, nopat, yatzy));
        container.add(heitaNoppaa);

        container.add(tulosTaulukko());




    }

    /**
     * luoNopat metodi luo yksirivisen ja viisisarakkeisen gridilayoutin johon
     * joka sarakkeeseen sijoitetaan yksi noppaa vastaava JButton. Lisäksi
     * jokaiselle JButtonille lisätään tässä yhteydessä lukituskuuntelija, joka
     * tarkkailee onko ko. jbutton valittu -> noppa lukittu vai ei.
     */
    private JPanel luoNopat() {
        JPanel noppaPaneli = new JPanel(new GridLayout(1, 5));



        noppa1 = new JButton(noppa1aimg);
        noppaPaneli.add(noppa1);

        noppa2 = new JButton(noppa1aimg);
        noppaPaneli.add(noppa2);


        noppa3 = new JButton(noppa1aimg);
        noppaPaneli.add(noppa3);

        noppa4 = new JButton(noppa1aimg);
        noppaPaneli.add(noppa4);

        noppa5 = new JButton(noppa1aimg);
        noppaPaneli.add(noppa5);

        Lukituskuuntelija lukituskuuntelija = new Lukituskuuntelija(noppa1, noppa2, noppa3, noppa4, noppa5, nopat, yatzy);
        noppa1.addActionListener(lukituskuuntelija);
        noppa2.addActionListener(lukituskuuntelija);
        noppa3.addActionListener(lukituskuuntelija);
        noppa4.addActionListener(lukituskuuntelija);
        noppa5.addActionListener(lukituskuuntelija);

        return noppaPaneli;
    }

    /**
     * tulosTaulukko -metodissa luodaan kuusirivinen ja kaksisarakkeinen
     * gridlayoutti pisteidenlaskua varten. Jokaiselle eri pistevaihtoehdolle on
     * oma jButton jota painamalla käyttäjä viestittää haluavansa lisätä noppien
     * pisteet ko. kohtaan, sekä Textfield johon pisteet lasketaan
     *
     * Pisteidenlasku JButtoneille lisätään oma pistekuuntelija actionlistener
     * joka tutkii onko käyttäjä painanut ko. nappia ja laskee pisteet.
     */
    private JPanel tulosTaulukko() {
        JPanel tulospaneli = new JPanel(new GridLayout(8, 2));

        JButton BTNykkoset = new JButton("ykköset:");
        JButton BTNkakkoset = new JButton("kakkoset:");
        JButton BTNkolmoset = new JButton("kolmoset:");
        JButton BTNneloset = new JButton("neloset:");
        JButton BTNvitoset = new JButton("vitoset:");
        JButton BTNkutoset = new JButton("kutoset:");
        JButton BTNyatzyt = new JButton("yatzy:");
        ykkoset = new JTextField();
        kakkoset = new JTextField();
        kolmoset = new JTextField();
        neloset = new JTextField();
        vitoset = new JTextField();
        kutoset = new JTextField();
        yatzyt = new JTextField();


        JLabel pisteet = new JLabel("    yhteispisteet:");
        TXTpisteet = new JTextField();



        tulospaneli.add(BTNykkoset);
        tulospaneli.add(ykkoset);
        tulospaneli.add(BTNkakkoset);
        tulospaneli.add(kakkoset);
        tulospaneli.add(BTNkolmoset);
        tulospaneli.add(kolmoset);
        tulospaneli.add(BTNneloset);
        tulospaneli.add(neloset);
        tulospaneli.add(BTNvitoset);
        tulospaneli.add(vitoset);
        tulospaneli.add(BTNkutoset);
        tulospaneli.add(kutoset);


        tulospaneli.add(pisteet);
        tulospaneli.add(TXTpisteet);

        Pistekuuntelija pistekuuntelija = new Pistekuuntelija(yatzy, nopat, ykkoset, kakkoset, kolmoset, neloset, vitoset, kutoset, BTNykkoset, BTNkakkoset, BTNkolmoset, BTNneloset, BTNvitoset, BTNkutoset, TXTpisteet, pelaaja);
        BTNykkoset.addActionListener(pistekuuntelija);
        BTNkakkoset.addActionListener(pistekuuntelija);
        BTNkolmoset.addActionListener(pistekuuntelija);
        BTNneloset.addActionListener(pistekuuntelija);
        BTNvitoset.addActionListener(pistekuuntelija);
        BTNkutoset.addActionListener(pistekuuntelija);

        return tulospaneli;
    }

    public JFrame getFrame() {
        return frame;
    }
}
