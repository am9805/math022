package ControladorR;

import VistaR.PrincipalRana;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;

public class ControladorR {


    public void generadorNumerosCentenas(JLabel a, JLabel b, JLabel c, JLabel d) {
        int n = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        int numero0;
        int numero1;
        int numero2;
        int numero3;
        if (n == 2) {
            numero0 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
            a.setText(Integer.toString(numero0));
            numero1 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
            b.setText(Integer.toString(numero1));
            numero2 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
            c.setText(Integer.toString(numero2));
            numero3 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
            d.setText(Integer.toString(numero3));
        } else {
            numero0 = ThreadLocalRandom.current().nextInt(10, 99 + 1);
            a.setText(Integer.toString(numero0));
            numero1 = ThreadLocalRandom.current().nextInt(10, 99 + 1);
            b.setText(Integer.toString(numero1));
            numero2 = ThreadLocalRandom.current().nextInt(10, 99 + 1);
            c.setText(Integer.toString(numero2));
            numero3 = ThreadLocalRandom.current().nextInt(10, 99 + 1);
            d.setText(Integer.toString(numero3));
        }

    }

    public static void main(String args[]) {

//        Scanner sc = new Scanner(System.in);
//        int h = 0;
//        while (h == 0) {
//            System.out.println("a");
//            h = Integer.parseInt(sc.nextLine());
//            System.out.println("a");
//            h = Integer.parseInt(sc.nextLine());
//        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalRana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalRana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalRana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalRana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalRana().setVisible(true);
            }
        });

    }
}
