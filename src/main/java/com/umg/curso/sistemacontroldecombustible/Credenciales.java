/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.umg.curso.sistemacontroldecombustible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Credenciales extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Credenciales
     */
    public Credenciales() {
        initComponents();
        btnIngresar.addActionListener(this);
        btnSalir.addActionListener(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\Downloads\\unnamed.png")); // NOI18N
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 80, 90);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 50, 71, 25);

        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 56, 16);

        jLabel3.setText("Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 140, 70, 16);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(140, 100, 80, 22);

        btnIngresar.setText("Ingresar");
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(50, 200, 90, 23);

        btnSalir.setText("Salir");
        getContentPane().add(btnSalir);
        btnSalir.setBounds(150, 200, 90, 23);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(140, 140, 80, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Credenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Credenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Credenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Credenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Credenciales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnIngresar){
           
           if(txtUsuario.getText().equals("admin") || txtPassword.getText().equals("admin")){
               PantallaInicio Ventana = new PantallaInicio();
               Ventana.setBounds(150, 150, 930, 400);
               Ventana.setVisible(true);
               this.dispose();
           }else{
               JOptionPane.showMessageDialog(null, "Usuario o Password son incorrectos.");
           }
       }else if(e.getSource()==btnSalir){
           exit(0);
       }
    }
}
