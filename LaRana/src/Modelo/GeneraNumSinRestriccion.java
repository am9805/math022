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
public class GeneraNumSinRestriccion  extends GenerarNumero {
    
    private String GenerarNum;

    public GeneraNumSinRestriccion(String Generador) {
        super(Generador);
    }

    
     public void GenerarNumero(JLabel a, JLabel b, JLabel c, JLabel d){
        int n = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        int numero0;
        int numero1;
        int numero2;
        int numero3;
        if (n == 2) {
            numero0 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
            a.setText(Integer.toString(numero0));
            numero1 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
            b.setText(Integer.toString(numero1));
            numero2 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
            c.setText(Integer.toString(numero2));
            numero3 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
            d.setText(Integer.toString(numero3));
        } else {
            numero0 = ThreadLocalRandom.current().nextInt(10, 99 + 1);
            a.setText(Integer.toString(numero0));
            numero1 = ThreadLocalRandom.current().nextInt(10, 99 + 1);
            b.setText(Integer.toString(numero1));
            numero2 = ThreadLocalRandom.current().nextInt(10, 99 + 1);
            c.setText(Integer.toString(numero2));
            numero3 = ThreadLocalRandom.current().nextInt(10, 99 + 1);
            d.setText(Integer.toString(numero3));
        }
     }
    
    
    
}
