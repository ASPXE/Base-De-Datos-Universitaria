/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.MenusCategorias;

import com.mycompany.Clases.Licenciatura;
import com.mycompany.DataAccessObjects.LicenciaturaDAO;
import com.mycompany.SubMenus.Licenciaturas.ActualizarLicenciaturas;
import com.mycompany.SubMenus.Licenciaturas.EliminarLicenciaturas;
import com.mycompany.SubMenus.Licenciaturas.InsertarLicenciaturas;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aspxe
 */
public class MenuLicenciaturas extends javax.swing.JFrame {

    /**
     * Creates new form MenuLicenciaturas
     */
    public MenuLicenciaturas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerLicenciaturas = new javax.swing.JButton();
        btnRegistrarLicenciatura = new javax.swing.JButton();
        btnActualizarLicenciatura = new javax.swing.JButton();
        btnEliminarLicenciatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Licenciaturas");
        setLocation(new java.awt.Point(600, 300));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(10, 10));
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        btnVerLicenciaturas.setText("Ver licenciaturas registradas");
        btnVerLicenciaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerLicenciaturasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerLicenciaturas);
        btnVerLicenciaturas.setBounds(170, 30, 230, 24);

        btnRegistrarLicenciatura.setText("Registrar licenciatura");
        btnRegistrarLicenciatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLicenciaturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarLicenciatura);
        btnRegistrarLicenciatura.setBounds(200, 150, 168, 24);

        btnActualizarLicenciatura.setText("Actualizar licenciatura");
        btnActualizarLicenciatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarLicenciaturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarLicenciatura);
        btnActualizarLicenciatura.setBounds(200, 300, 172, 24);

        btnEliminarLicenciatura.setText("Eliminar licenciatura");
        btnEliminarLicenciatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLicenciaturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarLicenciatura);
        btnEliminarLicenciatura.setBounds(200, 440, 161, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarLicenciaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLicenciaturaActionPerformed
        InsertarLicenciaturas il = new InsertarLicenciaturas();
        il.setVisible(true);
    }//GEN-LAST:event_btnRegistrarLicenciaturaActionPerformed

    private void btnVerLicenciaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerLicenciaturasActionPerformed
        LicenciaturaDAO ld = new LicenciaturaDAO();
        try {
            List<Licenciatura> licenciaturas = ld.seleccionar();
            for(Licenciatura licenciatura: licenciaturas){
                System.out.println("licenciatura = "+licenciatura.toString());
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex, "Ha ocurrido un error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerLicenciaturasActionPerformed

    private void btnActualizarLicenciaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLicenciaturaActionPerformed
        ActualizarLicenciaturas al = new ActualizarLicenciaturas();
        al.setVisible(true);
    }//GEN-LAST:event_btnActualizarLicenciaturaActionPerformed

    private void btnEliminarLicenciaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLicenciaturaActionPerformed
        EliminarLicenciaturas el = new EliminarLicenciaturas();
        el.setVisible(true);
    }//GEN-LAST:event_btnEliminarLicenciaturaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuLicenciaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuLicenciaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuLicenciaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuLicenciaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLicenciaturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarLicenciatura;
    private javax.swing.JButton btnEliminarLicenciatura;
    private javax.swing.JButton btnRegistrarLicenciatura;
    private javax.swing.JButton btnVerLicenciaturas;
    // End of variables declaration//GEN-END:variables
}
