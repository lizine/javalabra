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
import yatzy.Yatzy;
import yatzy.Pisteidenlasku;

/**
 *
 * @author lini
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
    private int yhteispisteet=0;
    
    public Pistekuuntelija(Yatzy yatzy, List nopat, JTextField ykkoset, JTextField kakkoset, JTextField kolmoset, JTextField neloset, JTextField vitoset, JTextField kutoset, JButton BTNykkoset, JButton BTNkakkoset, JButton BTNkolmoset, JButton BTNneloset, JButton BTNvitoset, JButton BTNkutoset, JTextField TXTpisteet) {
        this.yatzy = yatzy;
        this.pisteidenlasku = yatzy.getPisteidenlasku();
        this.ykkoset = ykkoset;
        this.kakkoset = kakkoset;
        this.kolmoset = kolmoset;
        this.neloset = neloset;
        this.vitoset = vitoset;
        this.kutoset = kutoset;
        this.BTNykkoset = BTNykkoset;
        this.BTNkakkoset = BTNkakkoset;
        this.BTNkolmoset = BTNkolmoset;
        this.BTNneloset = BTNneloset;
        this.BTNvitoset = BTNvitoset;
        this.BTNkutoset = BTNkutoset;
        this.nopat = nopat;
        this.TXTpisteet = TXTpisteet;
        
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("pisteet:");
        
      
        

        Object source = e.getSource();

        if (source.equals(BTNykkoset)) {
            System.out.println("ykköset");
            pisteidenlasku.ykkoset();
            int tulos = (int)pisteidenlasku.getTuloslista().get("ykkoset");
            String pisteet1 = tulos + " pistettä";
            
           // System.out.println(pisteet1);  - testikäyttöön
          //  yhteispisteet=yhteispisteet+tulos;
           // System.out.println(yhteispisteet + " yhteensä");
            //this.TXTpisteet.setText("pistettä");
            
            this.ykkoset.setText(pisteet1);
            
          
            BTNykkoset.setEnabled(false);
            
            
         
            
          
            
            
        } else if (source.equals(BTNkakkoset)) {
            System.out.println("kakkoset");
            pisteidenlasku.kakkoset();
            String pisteet2 = pisteidenlasku.getTuloslista().get("kakkoset") + " pistettä";
            System.out.println(pisteet2);
            this.kakkoset.setText(pisteet2);
            BTNkakkoset.setEnabled(false);
            
        } else if (source.equals(BTNkolmoset)) {
            System.out.println("kolmoset");
             pisteidenlasku.kolmoset();
            String pisteet3 = pisteidenlasku.getTuloslista().get("kolmoset") + " pistettä";
            System.out.println(pisteet3);
            this.kolmoset.setText(pisteet3);
            BTNkolmoset.setEnabled(false);
       
        } else if (source.equals(BTNneloset)) {
            System.out.println("neloset");
            pisteidenlasku.neloset();
            String pisteet4 = pisteidenlasku.getTuloslista().get("neloset") + " pistettä";
            System.out.println(pisteet4);
            this.neloset.setText(pisteet4);
            BTNneloset.setEnabled(false);
      
        } else if (source.equals(BTNvitoset)) {
            System.out.println("vitoset");
             pisteidenlasku.vitoset();
            String pisteet5 = pisteidenlasku.getTuloslista().get("vitoset") + " pistettä";
            System.out.println(pisteet5);
            this.vitoset.setText(pisteet5);
             BTNvitoset.setEnabled(false);
        }
        else if (source.equals(BTNkutoset)) {
            System.out.println("kutoset");
            pisteidenlasku.kutoset();
            String pisteet6 = pisteidenlasku.getTuloslista().get("kutoset") + " pistettä";
            System.out.println(pisteet6);
            this.kutoset.setText(pisteet6);
             BTNkutoset.setEnabled(false);
        }


//       pisteidenlasku.kakkoset();
//       pisteidenlasku.kolmoset();
//        pisteidenlasku.neloset();
//        pisteidenlasku.vitoset();
//           pisteidenlasku.kutoset();
        System.out.println("kierros pelattu");
        System.out.println(pisteidenlasku.getTuloslista());
        yatzy.nollaaKierros();
        yatzy.nollaaNopat();
        
        
        

        if ( !BTNykkoset.isEnabled() && !BTNkakkoset.isEnabled() && !BTNkolmoset.isEnabled() && !BTNneloset.isEnabled() && !BTNvitoset.isEnabled() && !BTNkutoset.isEnabled()){
            JOptionPane.showMessageDialog(null, "Peli loppui!");
            
            this.TXTpisteet.setText("pistettä");
        }
        



    }
}
