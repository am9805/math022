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
 *JUAN PABLO ROMERO
 * ANGELICA ARROYAVE
 * SANTIAGO BEDOYA
 */
public class GenerarNumero {//CLASE CONTEXTO
    
    private IGenerarNumeroStrategy  Generar;
   

    public GenerarNumero() {
    }
    // CONTRUCTOR QUE HEREDA DE LA INTERFAZ GENERAR NUMERO
    public GenerarNumero(IGenerarNumeroStrategy Generar) {
        this.Generar = Generar;
    }
   //METODO QUE INVOCA LOS METODOS DE LA INTERFACE
    public void GenerarNum(JLabel a, JLabel b, JLabel c, JLabel d, JLabel e){
        Generar.GenerarNumero(a, b, c, d, e);
    }
                

 
    
}
    
