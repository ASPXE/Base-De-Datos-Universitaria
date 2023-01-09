/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.SubMenus.Inscritos;

import com.mycompany.Clases.Inscritos;
import com.mycompany.DataAccessObjects.InscritosDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aspxe
 */
public class EliminarInscritos extends javax.swing.JFrame {

    /**
     * Creates new form EliminarInscritos
     */
    public EliminarInscritos() {
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

        lblIdInscripcion = new javax.swing.JLabel();
        txtIdInscripcion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar Inscritos");
        setLocation(new java.awt.Point(600, 300));
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(10, 10));
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        lblIdInscripcion.setText("ID de inscripcion a eliminar");
        getContentPane().add(lblIdInscripcion);
        lblIdInscripcion.setBounds(80, 30, 200, 18);
        getContentPane().add(txtIdInscripcion);
        txtIdInscripcion.setBounds(80, 60, 190, 24);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(140, 110, 83, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        InscritosDAO id = new InscritosDAO();
        Inscritos i = new Inscritos();
        int idInscritos = 0;
        if(txtIdInscripcion.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ID de inscripcion no ingresado", "Informacion faltante", JOptionPane.ERROR_MESSAGE);
        }else{
            idInscritos = Integer.parseInt(txtIdInscripcion.getText());
            i.setIns(idInscritos);
        }
        
        try {
            id.eliminar(i);
            JOptionPane.showMessageDialog(rootPane, "Inscritos eliminados exitosamente", "Registro eliminado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(EliminarInscritos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarInscritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarInscritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarInscritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarInscritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarInscritos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblIdInscripcion;
    private javax.swing.JTextField txtIdInscripcion;
    // End of variables declaration//GEN-END:variables
}
