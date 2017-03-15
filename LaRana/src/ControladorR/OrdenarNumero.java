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
public abstract  class OrdenarNumero implements IOrdenarStrategy {
    
    private JLabel ordenNumerico;

    public OrdenarNumero(JLabel ordenNumerico) {
        this.ordenNumerico = ordenNumerico;
    }

 
    
    /** 
     * Metodo que sera implementado por todas las clases hija
     * 
     * 
     * @return boolean Orden de los nuemros
     */
    @Override
    public abstract void ordenar(JLabel roca1, JLabel roca2, JLabel roca3, JLabel roca4,
            JLabel numRoc1, JLabel numRoc2, JLabel numRoc3, JLabel numRoc4,
            JLabel nube1, JLabel nube2, JLabel nube3, JLabel nube4,
            JLabel Gif, JLabel RanaxRocaL);

    public JLabel getOrdenNumerico() {
        return ordenNumerico;
    }

    public void setOrdenNumerico(JLabel ordenNumerico) {
        this.ordenNumerico = ordenNumerico;
    }


    
    
    
}
