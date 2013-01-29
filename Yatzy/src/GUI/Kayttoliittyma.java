/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import yatzy.Yatzy;
import yatzy.Pisteidenlasku;

/**
 *
 * @author lini
 */
public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Yatzy yatzy;

    public Kayttoliittyma() {
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
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
