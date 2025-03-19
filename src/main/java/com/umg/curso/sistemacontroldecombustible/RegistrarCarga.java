
package com.umg.curso.sistemacontroldecombustible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class RegistrarCarga extends javax.swing.JFrame implements ActionListener {
    private ArrayList<Vehiculo> listaVehiculos;
    
    public RegistrarCarga(ArrayList<Vehiculo> vehiculos) {
        
        initComponents();
        this.listaVehiculos = vehiculos;
        btnRegistrarCarga.addActionListener(this);
        btnCalcular.addActionListener(this);
        BoxVehiculo.addItem("<Selecciona>");
        btnReturn.addActionListener(this);
        
        for (Vehiculo v : listaVehiculos) {
            BoxVehiculo.addItem(v.getPlaca());  
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BoxVehiculo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrarCarga = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtKilometro = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPanel = new javax.swing.JTextArea();
        btnReturn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Carga", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setLayout(null);

        jLabel1.setText("Vehiculo:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 120, 60, 20);

        jLabel2.setText("Precio por Litro:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 240, 100, 20);

        jPanel1.add(BoxVehiculo);
        BoxVehiculo.setBounds(110, 120, 110, 22);

        jLabel3.setText("Fecha:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 150, 50, 20);

        jLabel4.setText("Cantidad De Litros:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 180, 110, 20);

        jLabel5.setText("Kilometraje Actual:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 210, 110, 20);

        btnRegistrarCarga.setText("Registrar Carga");
        jPanel1.add(btnRegistrarCarga);
        btnRegistrarCarga.setBounds(100, 310, 150, 23);
        jPanel1.add(txtCantidad);
        txtCantidad.setBounds(160, 180, 100, 22);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(110, 150, 100, 22);
        jPanel1.add(txtKilometro);
        txtKilometro.setBounds(160, 210, 100, 22);
        jPanel1.add(txtPrecio);
        txtPrecio.setBounds(160, 240, 60, 22);

        txtPanel.setColumns(20);
        txtPanel.setRows(5);
        jScrollPane1.setViewportView(txtPanel);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(380, 110, 520, 200);

        btnReturn.setText("<--");
        jPanel1.add(btnReturn);
        btnReturn.setBounds(20, 80, 60, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\Downloads\\unnamed.png")); // NOI18N
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(830, 0, 80, 90);

        btnCalcular.setText("Calcular");
        jPanel1.add(btnCalcular);
        btnCalcular.setBounds(610, 330, 110, 23);

        getContentPane().add(jPanel1);

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
            java.util.logging.Logger.getLogger(RegistrarCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRegistrarCarga){
        String placaSeleccionada = (String) BoxVehiculo.getSelectedItem();
            Vehiculo vehiculoSeleccionado = buscarVehiculo(placaSeleccionada);

            if (vehiculoSeleccionado != null) {
                String fecha = txtFecha.getText();
                int litros = Integer.parseInt(txtCantidad.getText());
                int kilometros = Integer.parseInt(txtKilometro.getText());
                int precioLitro = Integer.parseInt(txtPrecio.getText());

                vehiculoSeleccionado.agregarCarga(fecha, litros, kilometros, precioLitro);
                JOptionPane.showMessageDialog(null, "Carga registrada correctamente.");
                
                
                txtFecha.setText("");
                txtCantidad.setText("");
                txtKilometro.setText("");
                txtPrecio.setText("");
            }    
        }else if(e.getSource()==btnCalcular){
            String placaSeleccionada = (String) BoxVehiculo.getSelectedItem();
            Vehiculo vehiculoSeleccionado = buscarVehiculo(placaSeleccionada);

            if (vehiculoSeleccionado != null) {
                txtPanel.setText(vehiculoSeleccionado.TostringC());
            }
        }else if(e.getSource()==btnReturn){
            
             this.setVisible(false);
            
        }
        
    }
    
    private Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getPlaca().equals(placa)) {
                return v;
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxVehiculo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRegistrarCarga;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtKilometro;
    private javax.swing.JTextArea txtPanel;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
