/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import ControladorR.OrdenarNumero;
import javax.swing.JLabel;

/**
 *
 * @author JuanPablo
 */
public class OrdenSecuenciaUnidades extends OrdenarNumero {
 
    private String OrdenNumerico;

    public OrdenSecuenciaUnidades(String OrdenNumerico, String ordenNumerico) {
        super(ordenNumerico);
        this.OrdenNumerico = OrdenNumerico;
    }
    
        @Override
    public boolean ordenar(JLabel roca1, JLabel roca2, JLabel roca3, JLabel roca4,
            JLabel numRoc1, JLabel numRoc2, JLabel numRoc3, JLabel numRoc4,
            JLabel nube1, JLabel nube2, JLabel nube3, JLabel nube4,
            JLabel Gif, JLabel RanaxRocaL) {
       return(true);
    }
    
}
