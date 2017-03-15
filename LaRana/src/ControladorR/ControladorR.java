package ControladorR;

import VistaR.PrincipalRana;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;

public class ControladorR {

    public void generadorNumeros (JLabel a, JLabel b, JLabel c, JLabel d, JLabel e) {

           GeneradorFactory.getGenerador().GenerarNumero(a, b, c, d,e);
          
                  
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
