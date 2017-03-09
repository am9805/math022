package VistaR;

import ControladorR.ControladorR;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class PrincipalRana extends javax.swing.JFrame {

    public PrincipalRana() {
        initComponents();
        Gif.setVisible(false);

    }

    public void transferirTexto(JLabel nub) {
        nub.setTransferHandler(new TransferHandler("text"));
        MouseListener ml = new MouseAdapter() {
            //creamos el método para transferir
            //datos al presionar con el ratón
            public void mousePressed(MouseEvent e) {
                JComponent jc = (JComponent) e.getSource();
                TransferHandler th = jc.getTransferHandler();
                th.exportAsDrag(jc, e, TransferHandler.COPY);
            }
        };
        nub.addMouseListener(ml);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RanaxRocaL = new javax.swing.JLabel();
        ro1 = new javax.swing.JLabel();
        ro2 = new javax.swing.JLabel();
        ro3 = new javax.swing.JLabel();
        ro4 = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        num3 = new javax.swing.JLabel();
        num4 = new javax.swing.JLabel();
        Roca1 = new javax.swing.JLabel();
        Roca2 = new javax.swing.JLabel();
        Roca4 = new javax.swing.JLabel();
        Gif = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Nube3 = new javax.swing.JLabel();
        Roca5 = new javax.swing.JLabel();
        Nube4 = new javax.swing.JLabel();
        Pergamino = new javax.swing.JLabel();
        Nube1 = new javax.swing.JLabel();
        Nube2 = new javax.swing.JLabel();
        TITULO = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RanaxRocaL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/RanaxRoca.png"))); // NOI18N
        getContentPane().add(RanaxRocaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 190, 160));

        ro1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        ro1.setForeground(new java.awt.Color(1, 1, 1));
        ro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 150, 80));

        ro2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        ro2.setForeground(new java.awt.Color(1, 1, 1));
        getContentPane().add(ro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 150, 80));

        ro3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        ro3.setForeground(new java.awt.Color(1, 1, 1));
        ro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 150, 80));

        ro4.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        ro4.setForeground(new java.awt.Color(1, 1, 1));
        ro4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 150, 80));

        num1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        num1.setForeground(new java.awt.Color(1, 1, 1));
        num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num1.setText("Hola");
        getContentPane().add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 170, 110));

        num2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        num2.setForeground(new java.awt.Color(1, 1, 1));
        num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num2.setText("Hola");
        getContentPane().add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 170, 110));

        num3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        num3.setForeground(new java.awt.Color(1, 1, 1));
        num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num3.setText("Hola");
        getContentPane().add(num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 170, 110));

        num4.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        num4.setForeground(new java.awt.Color(1, 1, 1));
        num4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num4.setText("Hola");
        getContentPane().add(num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 170, 110));

        Roca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/Rocka2.png"))); // NOI18N
        getContentPane().add(Roca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 150, 80));

        Roca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/Rocka2.png"))); // NOI18N
        Roca2.setText("jLabel1");
        getContentPane().add(Roca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 150, 80));

        Roca4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/Rocka2.png"))); // NOI18N
        Roca4.setText("jLabel1");
        getContentPane().add(Roca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 150, 80));

        Gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/output_BnuDB1.gif"))); // NOI18N
        getContentPane().add(Gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 1000, 310));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 530, -1, -1));

        Nube3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/Nube .png"))); // NOI18N
        Nube3.setText("jLabel1");
        getContentPane().add(Nube3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 170, 110));

        Roca5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/Rocka2.png"))); // NOI18N
        Roca5.setText("jLabel1");
        getContentPane().add(Roca5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 150, 80));

        Nube4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/Nube .png"))); // NOI18N
        Nube4.setText("jLabel1");
        getContentPane().add(Nube4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 170, 110));

        Pergamino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Pergamino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/Letrero.png"))); // NOI18N
        Pergamino.setToolTipText("");
        getContentPane().add(Pergamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 320, 350));

        Nube1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/Nube .png"))); // NOI18N
        Nube1.setText("jLabel1");
        getContentPane().add(Nube1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 170, 110));

        Nube2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/Nube .png"))); // NOI18N
        Nube2.setText("jLabel1");
        getContentPane().add(Nube2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 170, 110));

        TITULO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/Titulo2.png"))); // NOI18N
        getContentPane().add(TITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 330, 150));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaR/Recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        Gif.setVisible(true);
//        RanaxRocaL.setVisible(false);
//        Nube3.setVisible(false);
//        Roca1.setVisible(false);
//        Roca2.setVisible(false);
//        Roca4.setVisible(false);
        ControladorR r = new ControladorR();
        r.generadorNumerosCentenas(num1, num2, num3, num4);
        transferirTexto(num1);
        transferirTexto(num2);
        transferirTexto(num3);
        transferirTexto(num4);


    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Gif;
    private javax.swing.JLabel Nube1;
    private javax.swing.JLabel Nube2;
    private javax.swing.JLabel Nube3;
    private javax.swing.JLabel Nube4;
    private javax.swing.JLabel Pergamino;
    private javax.swing.JLabel RanaxRocaL;
    private javax.swing.JLabel Roca1;
    private javax.swing.JLabel Roca2;
    private javax.swing.JLabel Roca4;
    private javax.swing.JLabel Roca5;
    private javax.swing.JLabel TITULO;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel num3;
    private javax.swing.JLabel num4;
    private javax.swing.JLabel ro1;
    private javax.swing.JLabel ro2;
    private javax.swing.JLabel ro3;
    private javax.swing.JLabel ro4;
    // End of variables declaration//GEN-END:variables

}
