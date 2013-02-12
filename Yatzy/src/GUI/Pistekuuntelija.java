/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import yatzy.Yatzy;
import yatzy.Pisteidenlasku;

/**
 *
 * @author lini
 */
public class Pistekuuntelija implements ActionListener {

    private Yatzy yatzy;
    private Pisteidenlasku pisteidenlasku;

    public Pistekuuntelija(Yatzy yatzy) {
       this.yatzy = yatzy;
       this.pisteidenlasku = yatzy.getPisteidenlasku();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("pisteet");

        //Object source = e.getSource();
        
        pisteidenlasku.ykkoset();
        pisteidenlasku.kakkoset();
        pisteidenlasku.kolmoset();
         pisteidenlasku.neloset();
          pisteidenlasku.vitoset();
           pisteidenlasku.kutoset();
        System.out.println(pisteidenlasku.getTuloslista());
        


    }
}
