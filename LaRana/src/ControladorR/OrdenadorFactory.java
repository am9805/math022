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

public class OrdenadorFactory {

 
 public static OrdenarNumero getOrdenNumerico(JLabel ordenador) {
    String orden ;
    orden = ordenador.getText();
     switch(orden){
         case "Menor a Mayor":
             return  new OrdenAscecendente(ordenador);
             
         case "Mayor a Menor":
             return new OrdenDescendente(ordenador);
                      
     }
     return null;     
 } 
    

    
}
