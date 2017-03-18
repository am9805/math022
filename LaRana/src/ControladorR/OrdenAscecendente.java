/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorR;

import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class OrdenAscecendente implements IOrdenarStrategy {

    @Override
    public void ordenar(JLabel roca1, JLabel roca2, JLabel roca3, JLabel roca4,
            JLabel numRoc1, JLabel numRoc2, JLabel numRoc3, JLabel numRoc4,
            JLabel nube1, JLabel nube2, JLabel nube3, JLabel nube4,
            JLabel Gif, JLabel RanaxRocaL) {

        String roc1 = numRoc1.getText();
        String roc2 = numRoc2.getText();
        String roc3 = numRoc3.getText();
        String roc4 = numRoc4.getText();

        String numeroNube1 = nube1.getText();
        int numNube1 = Integer.parseInt(numeroNube1);
        String numeroNube2 = nube2.getText();
        int numNube2 = Integer.parseInt(numeroNube2);
        String numeroNube3 = nube3.getText();
        int numNube3 = Integer.parseInt(numeroNube3);
        String numeroNube4 = nube4.getText();
        int numNube4 = Integer.parseInt(numeroNube4);

        int arreglo[] = new int[4];

        arreglo[0] = numNube1;
        arreglo[1] = numNube2;
        arreglo[2] = numNube3;
        arreglo[3] = numNube4;

        Arrays.sort(arreglo);

        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);

        if (!"".equals(roc1)) {

            int numroc1 = Integer.parseInt(roc1);
            System.out.println("////////");
            System.out.println(numroc1);
            System.out.println(arreglo[0]);
            System.out.println("///////");
            if (arreglo[0] == numroc1) {
                roca2.setVisible(true);
                System.out.println("estoy aqui");
            } else {
                numRoc1.setText("");
                JOptionPane.showMessageDialog(null, "Erraste");
                
//          sout    
            }
        }
        if (roc2 != "") {

            int numroc2 = Integer.parseInt(roc2);
            if (arreglo[1] == numroc2) {
                roca3.setVisible(true);
            } else {
                numRoc2.setText("");
                JOptionPane.showMessageDialog(null, "Erraste");
                System.out.println("y aquí tambien");//              
            }
        }
        if (roc3 != "") {

            int numroc3 = Integer.parseInt(roc3);
            if (arreglo[2] == numroc3) {
                roca4.setVisible(true);
            } else {
                numRoc3.setText("");
                JOptionPane.showMessageDialog(null, "Erraste");
//             
            }
        }

        if (roc4 != "") {

            int numroc4 = Integer.parseInt(roc4);
            if (arreglo[3] == numroc4) {

                JOptionPane.showMessageDialog(null, "Ganaste");
            } else {
                numRoc4.setText("");
                JOptionPane.showMessageDialog(null, "Erraste");
//          
            }

        }

    }
}
