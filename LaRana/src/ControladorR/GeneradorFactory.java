/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorR;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author JuanPablo
 */
public class GeneradorFactory {

    public static GenerarNumero getGenerador() {
        int x = (ThreadLocalRandom.current().nextInt(1, 3 + 1));

        if (x == 1) {
            return new GeneraNumDecenas("");
        }

        if (x == 2) {
            return new GeneraNumSinRestriccion("");
        }
        if (x == 3) {
            return new GeneraNumSecuencial("");

        }

        return null;
    }

}
