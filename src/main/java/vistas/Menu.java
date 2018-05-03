/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame
{
    public Menu()
    {
        initComponents();
        this.setTitle("MUNDULERY ~ Menu");
        this.setMinimumSize(new Dimension(748, 540));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setIconImage(new ImageIcon(getClass().getResource("/icono.png")).getImage());
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresarButton = new javax.swing.JButton();
        entradaButton = new javax.swing.JButton();
        vistaButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        regresarButton.setText("Regresar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(regresarButton);
        regresarButton.setBounds(12, 19, 100, 25);

        entradaButton.setText("Nuevos Ingresos");
        entradaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(entradaButton);
        entradaButton.setBounds(300, 220, 130, 25);

        vistaButton.setText("Historiales");
        vistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(vistaButton);
        vistaButton.setBounds(300, 280, 130, 25);

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MENU");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 110, 730, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Copyright © 2018 by MUNDULERY");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 460, 730, 15);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("All rights reserved");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-1, 470, 730, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        Inicio ventana = new Inicio();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void entradaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaButtonActionPerformed
        MenuEntrada ventana = new MenuEntrada();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_entradaButtonActionPerformed

    private void vistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaButtonActionPerformed
        MenuVista ventana = new MenuVista();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_vistaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entradaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton regresarButton;
    private javax.swing.JButton vistaButton;
    // End of variables declaration//GEN-END:variables
}