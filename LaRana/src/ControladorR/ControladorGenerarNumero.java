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
public class ControladorGenerarNumero {
    
    //SINGLETON PARA CONTRADOR 
    private static  ControladorGenerarNumero GenNumero ;
    
    public static ControladorGenerarNumero getInstance(){
        GenNumero= new ControladorGenerarNumero();
        return(GenNumero);
    }
    
    //METODO PARA GENERAR
    public void generadorNumeros (JLabel a, JLabel b, JLabel c, JLabel d, JLabel e) {

          GeneradorFactory Gf = GeneradorFactory.getInstance();
          Gf.GenerarNumero(a,b,c,d,e);
                  
    }
   
}
