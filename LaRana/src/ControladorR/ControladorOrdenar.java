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
public class ControladorOrdenar {

    //SINGLETON PARA CONTROLADOR
    private static  ControladorOrdenar ConOrdenar ;
    
    public static ControladorOrdenar getInstance(){
        ConOrdenar= new ControladorOrdenar();
        return(ConOrdenar);
    }
    
    // METODO PARA ORDENAR
    public void OrdenarNumeros(JLabel ordena, JLabel roca1, JLabel roca2, JLabel roca3, JLabel roca4,
            JLabel numRoc1, JLabel numRoc2, JLabel numRoc3, JLabel numRoc4,
            JLabel nube1, JLabel nube2, JLabel nube3, JLabel nube4,
            JLabel Gif, JLabel RanaxRocaL) {

        OrdenadorFactory orden = OrdenadorFactory.getInstance();
        orden.OrdenarNumero(ordena, roca1, roca2, roca3, roca4,
                numRoc1, numRoc2, numRoc3, numRoc4,
                nube1, nube2, nube3, nube4,
                Gif, RanaxRocaL);

    }

}
