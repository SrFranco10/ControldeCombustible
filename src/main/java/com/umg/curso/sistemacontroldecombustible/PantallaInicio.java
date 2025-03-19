
package com.umg.curso.sistemacontroldecombustible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class PantallaInicio extends javax.swing.JFrame implements ActionListener{

    private ArrayList<Vehiculo> listaVehiculos;
   
    public PantallaInicio() {
        initComponents();
        this.listaVehiculos=new ArrayList<>();
        btnRegistrarV.addActionListener(this);
        btnRegistrarC.addActionListener(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarV = new javax.swing.JButton();
        btnRegistrarC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnRegistrarV.setText("Registrar Vehiculo");
        getContentPane().add(btnRegistrarV);
        btnRegistrarV.setBounds(250, 280, 150, 23);

        btnRegistrarC.setText("Registrar carga");
        getContentPane().add(btnRegistrarC);
        btnRegistrarC.setBounds(500, 280, 130, 23);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Bienvenidos a Gasolinera Donde Arturo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 10, 750, 80);

        jLabel2.setText("¿Que desea hacer?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 90, 140, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\Downloads\\coche(2).png")); // NOI18N
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 160, 130, 120);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\Downloads\\unnamed.png")); // NOI18N
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 80, 90);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\Downloads\\gas(3).png")); // NOI18N
        jLabel8.setToolTipText("");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(500, 160, 130, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarC;
    private javax.swing.JButton btnRegistrarV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRegistrarV){
            FmrPrincipal Ventana = new FmrPrincipal(listaVehiculos);
            Ventana.setBounds(150, 150, 930, 400);
            Ventana.setVisible(true);
            
        }else if(e.getSource()==btnRegistrarC){
            RegistrarCarga Ventana = new RegistrarCarga(listaVehiculos);
            Ventana.setBounds(150, 150, 930, 400);
            Ventana.setVisible(true);
            
        }
    }
}
