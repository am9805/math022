/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorR;

import ControladorR.GenerarNumero;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;

/**
 *
 * @author JuanPablo
 */
public class GeneraNumSecuencial extends GenerarNumero {

    public GeneraNumSecuencial(String Generador) {
        super(Generador);
    }
    
        
    
     public void GenerarNumero(JLabel a, JLabel b, JLabel c, JLabel d, JLabel e){
          int i = 0, cantidad = 4;
        int arreglo[] = new int[cantidad];

        int numero = (ThreadLocalRandom.current().nextInt(10, 97 + 1));
        arreglo[i] = numero;

        for (i = 1; i < cantidad; i++) {
            int numero1 = (ThreadLocalRandom.current().nextInt(numero, numero + 4));
            arreglo[i] = numero1;
            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    i--;
                }
            }
        }

        for (int k = 0; k < cantidad; k++) {
            System.out.print((k + 1) + ".- " + arreglo[k] + "\n");
        }

        a.setText(Integer.toString(arreglo[0]));
        b.setText(Integer.toString(arreglo[1]));
        c.setText(Integer.toString(arreglo[2]));
        d.setText(Integer.toString(arreglo[3]));
        e.setText("Menor a Mayor");
     }
    
}
