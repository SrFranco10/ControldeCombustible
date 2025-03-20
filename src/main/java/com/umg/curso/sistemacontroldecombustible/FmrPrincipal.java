
package com.umg.curso.sistemacontroldecombustible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FmrPrincipal extends javax.swing.JFrame implements ActionListener {
   
     private ArrayList<Vehiculo> vehiculosNuevos;
    public FmrPrincipal(ArrayList<Vehiculo> vehiculos) {
        initComponents();
        this.vehiculosNuevos=vehiculos;
        btnIngresar.addActionListener(this);
        btnMostrar.addActionListener(this);
       
        btnReturn.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPanel = new javax.swing.JTextArea();
        btnMostrar = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.cyan);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Vehiculo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setLayout(null);

        btnIngresar.setText("Ingresar Vehiculo");
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(110, 200, 140, 23);

        jLabel2.setText("Placa:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 50, 40, 16);

        jLabel3.setText("Modelo:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 110, 60, 16);

        jLabel4.setText("Marca:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 80, 50, 16);

        jLabel5.setText("Capacidad de Tanque:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 140, 130, 16);
        jPanel1.add(txtPlaca);
        txtPlaca.setBounds(130, 50, 110, 22);
        jPanel1.add(txtMarca);
        txtMarca.setBounds(130, 80, 110, 22);
        jPanel1.add(txtModelo);
        txtModelo.setBounds(130, 110, 110, 22);
        jPanel1.add(txtCantidad);
        txtCantidad.setBounds(190, 140, 50, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 90, 382, 240);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehiculos registrados ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setLayout(null);

        txtPanel.setColumns(20);
        txtPanel.setRows(5);
        jScrollPane1.setViewportView(txtPanel);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 440, 170);

        btnMostrar.setText("Mostrar Vehiculo");
        jPanel2.add(btnMostrar);
        btnMostrar.setBounds(160, 210, 170, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(450, 90, 470, 240);

        btnReturn.setText("<--");
        getContentPane().add(btnReturn);
        btnReturn.setBounds(30, 50, 72, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\Downloads\\unnamed.png")); // NOI18N
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(840, -10, 80, 90);

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
            java.util.logging.Logger.getLogger(FmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextArea txtPanel;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnIngresar){
                    vehiculosNuevos.add(new Vehiculo.VehiculoBuilder()
                    .Placa(txtPlaca.getText())
                    .Marca(txtMarca.getText())
                    .Modelo(txtModelo.getText())
                    .Tanque(Integer.parseInt(txtCantidad.getText()))           
                    .Contruir());
                    JOptionPane.showMessageDialog(null, "Se ingreso vehiculo correctamente");
                    
                    txtPlaca.setText("");
                    txtMarca.setText("");
                    txtModelo.setText("");
                    txtCantidad.setText("");
            
            
                    
        }else if (e.getSource()==btnMostrar){
           String texto= "";
           for (Vehiculo v : vehiculosNuevos) {
           texto += v.Tostring() + "\n"; 
        }
          txtPanel.setText(texto);
        }else if(e.getSource()==btnReturn){
            
            this.setVisible(false);
            
           
        }
    }
}
