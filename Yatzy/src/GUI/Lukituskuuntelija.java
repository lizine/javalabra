/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import yatzy.Yatzy;
import javax.swing.JButton;
import yatzy.Noppa;

/**
 *
 * @author lini
 */
public class Lukituskuuntelija implements ActionListener {

    private JButton noppa1;
    private JButton noppa2;
    private JButton noppa3;
    private JButton noppa4;
    private JButton noppa5;
    private Yatzy yatzy;
    private List<Noppa> nopat;

    public Lukituskuuntelija(JButton noppa1, JButton noppa2, JButton noppa3, JButton noppa4, JButton noppa5, List nopat, Yatzy yatzy) {
        this.noppa1 = noppa1;
        this.noppa2 = noppa2;
        this.noppa3 = noppa3;
        this.noppa4 = noppa4;
        this.noppa5 = noppa5;
        this.yatzy = yatzy;
        this.nopat = nopat;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // System.out.println("noppa valittu");
       
       Object source = e.getSource();
        
       if (source.equals(noppa1)){
           System.out.println("noppa1");
           nopat.get(0).lukitseNoppa();
           
        
       }
       else if (source.equals(noppa2)) {
           System.out.println("noppa2");
           nopat.get(1).lukitseNoppa();
       }
       else if (source.equals(noppa3)){
           nopat.get(2).lukitseNoppa();
           System.out.println("3");
       }
        else if (source.equals(noppa4)){
           nopat.get(3).lukitseNoppa();
           System.out.println("4a");
       }
       
        else if (source.equals(noppa5)){
           nopat.get(4).lukitseNoppa();
           System.out.println("5");
       }
         
       
       
//      if (source.equals(nopat.get(0))){
//          nopat.get(0).lukitseNoppa(true);
//       }
      
       
        
    }
}
