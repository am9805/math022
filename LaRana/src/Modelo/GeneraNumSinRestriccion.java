/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import ControladorR.GenerarNumero;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;

/**
 *
 * @author JuanPablo
 */
public class GeneraNumSinRestriccion extends GenerarNumero {

    private String GenerarNum;

    public GeneraNumSinRestriccion(String Generador) {
        super(Generador);
    }

    public void GenerarNumero(JLabel a, JLabel b, JLabel c, JLabel d) {
        int n = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        int numero0;
        int numero1;
        int numero2;
        int numero3;
        if (n == 2) {
            int i = 0, cantidad = 4;
            int arreglo[] = new int[cantidad];

            arreglo[i] = (ThreadLocalRandom.current().nextInt(100, 999 + 1));
            for (i = 1; i < cantidad; i++) {
                arreglo[i] = (int) (ThreadLocalRandom.current().nextInt(100, 999 + 1));
                for (int j = 0; j < i; j++) {
                    if (arreglo[i] == arreglo[j]) {
                        i--;
                    }
                }
            }

            for (int k = 0; k < cantidad; k++) {
                System.out.print((k + 1) + ".- " + arreglo[k] + "\n");
            }

        } else {
            
            int i = 0, cantidad = 4;
            int arreglo[] = new int[cantidad];

            arreglo[i] = (ThreadLocalRandom.current().nextInt(10, 99 + 1));
            for (i = 1; i < cantidad; i++) {
                arreglo[i] = (int) (ThreadLocalRandom.current().nextInt(10, 99 + 1));
                for (int j = 0; j < i; j++) {
                    if (arreglo[i] == arreglo[j]) {
                        i--;
                    }
                }
            }

            for (int k = 0; k < cantidad; k++) {
                System.out.print((k + 1) + ".- " + arreglo[k] + "\n");
            }
        }
    }

}
