/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorR;

import javax.swing.JLabel;

/**
 *
 * @author JuanPablo
 */
public abstract class GenerarNumero implements IGenerarNumeroStrategy{

    private String Generador;

    public GenerarNumero(String Generador) {
        this.Generador = Generador;
    }
       /** 
     * Metodo que sera implementado por todas las clases hija
     * 
     * 
     * @return Numeros generados aleatoriamente 
     */
    
    @Override
    public abstract void GenerarNumero(JLabel a, JLabel b, JLabel c, JLabel d);

    public String getGenerador() {
        return Generador;
    }

    public void setGenerador(String Generador) {
        this.Generador = Generador;
    }
    
    
    
          
    
}
