/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.MenusCategorias;

/**
 *
 * @author aspxe
 */
public class MenuDocentes extends javax.swing.JFrame {

    /**
     * Creates new form MenuDocentes
     */
    public MenuDocentes() {
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

        btnVerDocentes = new javax.swing.JButton();
        btnIngresarDocente = new javax.swing.JButton();
        btnActualizarDocente = new javax.swing.JButton();
        btnEliminarDocente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Docentes");
        setLocation(new java.awt.Point(600, 300));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(10, 10));
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        btnVerDocentes.setText("Ver docentes");
        getContentPane().add(btnVerDocentes);
        btnVerDocentes.setBounds(230, 50, 120, 24);

        btnIngresarDocente.setText("Ingresar nuevo docente");
        getContentPane().add(btnIngresarDocente);
        btnIngresarDocente.setBounds(200, 170, 182, 24);

        btnActualizarDocente.setText("Actualizar informacion de docente");
        getContentPane().add(btnActualizarDocente);
        btnActualizarDocente.setBounds(170, 300, 250, 24);

        btnEliminarDocente.setText("Eliminar docente");
        getContentPane().add(btnEliminarDocente);
        btnEliminarDocente.setBounds(220, 430, 139, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDocentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDocente;
    private javax.swing.JButton btnEliminarDocente;
    private javax.swing.JButton btnIngresarDocente;
    private javax.swing.JButton btnVerDocentes;
    // End of variables declaration//GEN-END:variables
}
