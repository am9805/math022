/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorR;

import Modelo.IGenerarNumeroStrategy;
import javax.swing.JLabel;

/**
 *
 * @author JuanPablo
 */
public class GenerarNumero {
    
    private IGenerarNumeroStrategy  Generar;
   

    public GenerarNumero() {
    }

    public GenerarNumero(IGenerarNumeroStrategy Generar) {
        this.Generar = Generar;
    }
   
    public void GenerarNum(JLabel a, JLabel b, JLabel c, JLabel d, JLabel e){
        Generar.GenerarNumero(a, b, c, d, e);
    }
                

 
    
}
    
