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
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import yatzy.Noppa;
import yatzy.Yatzy;
import yatzy.Pisteidenlasku;

/**
 *
 * @author lini * Käyttöliittymäluokassa luodaan yatzyn "pelipöytä". Jframe,
 * johon sijoitetaan viisi nopan kuvaa vierekkäin, sekä niiden alle
 * radiobuttonit joista käyttäjä voi lukita nopan ja JButton, josta noppia voi
 * pyöräyttää.
 *
 * Näiden alle luodaan pisteidenkirjaustaulukko.
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

    public Kayttoliittyma() {
        yatzy = new Yatzy();
        nopat = yatzy.getNoppaLista();
    }

    @Override
    public void run() {
        frame = new JFrame("Yatzy");
        frame.setPreferredSize(new Dimension(500, 800));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void luoKomponentit(Container container) {
      
        GridLayout layout = new GridLayout(4, 1);
        container.setLayout(layout);
        container.add(luoNopat());
        JButton heitaNoppaa = new JButton("Heitä noppaa!");
        heitaNoppaa.addActionListener(new NoppaKuuntelija(noppa1, noppa2, noppa3, noppa4, noppa5, nopat, yatzy));
        container.add(heitaNoppaa);
        container.add(tulosTaulukko());
        container.add(yhteispisteet());

    }

    private JPanel luoNopat() {
        JPanel noppaPaneli = new JPanel(new GridLayout(1, 5));



        Icon noppa1img = new ImageIcon("noppa1.jpg");
        noppa1 = new JButton(noppa1img);
        //noppa1.addActionListener(lukituskuuntelija);
        noppaPaneli.add(noppa1);



        Icon noppa2img = new ImageIcon("noppa1.jpg");
        noppa2 = new JButton(noppa2img);
        //noppa2.addActionListener(lukituskuuntelija);
        noppaPaneli.add(noppa2);


        Icon noppa3img = new ImageIcon("noppa1.jpg");
        noppa3 = new JButton(noppa3img);
        //noppa3.addActionListener(lukituskuuntelija);
        noppaPaneli.add(noppa3);

        Icon noppa4img = new ImageIcon("noppa1.jpg");
        noppa4 = new JButton(noppa4img);
        //  noppa4.addActionListener(lukituskuuntelija);
        noppaPaneli.add(noppa4);

        Icon noppa5img = new ImageIcon("noppa1.jpg");
        noppa5 = new JButton(noppa5img);
        // noppa5.addActionListener(lukituskuuntelija);
        noppaPaneli.add(noppa5);

        Lukituskuuntelija lukituskuuntelija = new Lukituskuuntelija(noppa1, noppa2, noppa3, noppa4, noppa5, nopat, yatzy);
        noppa1.addActionListener(lukituskuuntelija);
        noppa2.addActionListener(lukituskuuntelija);
        noppa3.addActionListener(lukituskuuntelija);
        noppa4.addActionListener(lukituskuuntelija);
        noppa5.addActionListener(lukituskuuntelija);

        return noppaPaneli;
    }

    private JPanel tulosTaulukko() {
        JPanel tulospaneli = new JPanel(new GridLayout(6, 2));

        JButton BTNykkoset = new JButton("ykköset:");
        JButton BTNkakkoset = new JButton("kakkoset:");
        JButton BTNkolmoset = new JButton("kolmoset:");
        JButton BTNneloset = new JButton("neloset:");
        JButton BTNvitoset = new JButton("vitoset:");
        JButton BTNkutoset =new JButton("kutoset:");
        ykkoset = new JTextField();
        kakkoset = new JTextField();
        kolmoset = new JTextField();
        neloset = new JTextField();
        vitoset = new JTextField();
        kutoset = new JTextField();
        


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
       

        Pistekuuntelija pistekuuntelija = new Pistekuuntelija(yatzy, nopat, ykkoset,kakkoset,kolmoset,neloset,vitoset,kutoset, BTNykkoset, BTNkakkoset, BTNkolmoset, BTNneloset, BTNvitoset, BTNkutoset);
        BTNykkoset.addActionListener(pistekuuntelija);
        BTNkakkoset.addActionListener(pistekuuntelija);
        BTNkolmoset.addActionListener(pistekuuntelija);
        BTNneloset.addActionListener(pistekuuntelija);
        BTNvitoset.addActionListener(pistekuuntelija);
        BTNkutoset.addActionListener(pistekuuntelija);

        return tulospaneli;
    }

    private JPanel yhteispisteet() { 
        JPanel yhteispisteetPanel = new JPanel(new GridLayout(1, 2));

        JLabel pisteet = new JLabel("yhteispisteet:");
        JTextField yhteispisteet = new JTextField();
        yhteispisteetPanel.add(pisteet);
        yhteispisteetPanel.add(yhteispisteet);


        return yhteispisteetPanel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
