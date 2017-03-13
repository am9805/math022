/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorR;

import ControladorR.OrdenarNumero;
import javax.swing.JLabel;

/**
 *
 * @author JuanPablo
 */
public class OrdenDescendente extends OrdenarNumero {

    private String ordenNumerico;
    
    public OrdenDescendente(String ordenNumerico) {
        super(ordenNumerico);
        this.ordenNumerico = ordenNumerico;
    }
    
    
      @Override
    public boolean ordenar(JLabel roca1, JLabel roca2, JLabel roca3, JLabel roca4,
            JLabel numRoc1, JLabel numRoc2, JLabel numRoc3, JLabel numRoc4,
            JLabel nube1, JLabel nube2, JLabel nube3, JLabel nube4,
            JLabel Gif, JLabel RanaxRocaL) {
           boolean validarRespuesta = false;

        while (validarRespuesta == false) {

            String roc1 = numRoc1.getText();
            int numroc1 = Integer.parseInt(roc1);
            String roc2 = numRoc2.getText();
            int numroc2 = Integer.parseInt(roc2);
            String roc3 = numRoc3.getText();
            int numroc3 = Integer.parseInt(roc3);
            String roc4 = numRoc4.getText();
            int numroc4 = Integer.parseInt(roc4);

            if (numroc1 > numroc2) {
                roca2.setVisible(false);
                numRoc2.setText(" ");
                validarRespuesta = false;

            }

            if (numroc2 > numroc3) {
                roca3.setVisible(false);
                numRoc3.setText(" ");
                validarRespuesta = false;
            }

            if (numroc3 > numroc4) {
                roca4.setVisible(false);
                numRoc4.setText(" ");
                validarRespuesta = false;
                
            } else if (numroc1 > numroc2 && numroc2 > numroc3 && numroc3 > numroc4) {
                Gif.setVisible(true);
                numRoc1.setText(" ");
                numRoc1.setText(" ");
                numRoc1.setText(" ");
                numRoc1.setText(" ");
                nube1.setText(" ");
                nube2.setText(" ");
                nube3.setText(" ");
                nube4.setText(" ");
                roca1.setVisible(false);
                roca2.setVisible(false);
                roca3.setVisible(false);
                roca4.setVisible(false);
                RanaxRocaL.setVisible(false);
                validarRespuesta = true;
            }

        }
        return (validarRespuesta);

    }
    
    
    
}
