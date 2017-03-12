/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import ControladorR.GenerarNumero;
import javax.swing.JLabel;

/**
 *
 * @author JuanPablo
 */
public class GeneraNumSecuencial extends GenerarNumero {
    
    private String GenerarNum;

    public GeneraNumSecuencial(String GenerarNum, String Generador) {
        super(Generador);
        this.GenerarNum = GenerarNum;
    }
    
     public void GenerarNumero(JLabel a, JLabel b, JLabel c, JLabel d){
         
     }
    
}
