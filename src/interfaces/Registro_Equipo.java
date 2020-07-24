/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author luism
 */
public class Registro_Equipo extends javax.swing.JFrame {


    /**
     * Creates new form Registro_Equipo
     */
    public Registro_Equipo() {
        initComponents();
        this.setLocationRelativeTo(null);
         setTitle("Usuario " + Login.user + ".");
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(),
                label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icono);
        txt_id_cliente.setText(Gestion_Cliente.cliente);

    }
    
    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id_cliente = new javax.swing.JTextField();
        combo_tipo_equipo = new javax.swing.JComboBox<>();
        combo_marca_equipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_num_serie_equipo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_observaviones = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        boton_registrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_modelo_equipo = new javax.swing.JTextField();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Equipo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txt_id_cliente.setEditable(false);
        txt_id_cliente.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(txt_id_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 143, -1));

        combo_tipo_equipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Desktop", "Laptop", "Impresora", "Multifuncional", "Consola" }));
        getContentPane().add(combo_tipo_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        combo_marca_equipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Sony", "Dell", "Apple", "Acer", "Samsung", "HP", "Lenovo", "Otra" }));
        getContentPane().add(combo_marca_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero de Serie:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txt_num_serie_equipo.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(txt_num_serie_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 143, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(160, 100));

        jTextArea_observaviones.setColumns(20);
        jTextArea_observaviones.setRows(5);
        jTextArea_observaviones.setPreferredSize(new java.awt.Dimension(160, 100));
        jScrollPane1.setViewportView(jTextArea_observaviones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 330, 160));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Daño Reportado y Observaciones");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        boton_registrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_registrar.setText("Registrar");
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 100, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Marca:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Modelo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabel8.setText("Data System");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        txt_modelo_equipo.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(txt_modelo_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 143, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 1, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarActionPerformed

        
        
        
        if (txt_modelo_equipo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos!");
        } else if (txt_num_serie_equipo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos!");
        } else if (combo_tipo_equipo.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos!");
        } else if (combo_marca_equipo.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos!");
        } else {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into equipos values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                
                Calendar calendario = Calendar.getInstance();
                String dia = Integer.toString(calendario.get(Calendar.DATE));
                String mes = Integer.toString(calendario.get(Calendar.MONTH));
                String anno = Integer.toString(calendario.get(Calendar.YEAR));

                pst.setString(1, "0");
                pst.setString(2, Gestion_Cliente.cliente);
                pst.setString(3, (String) combo_tipo_equipo.getSelectedItem());
                pst.setString(4, (String) combo_marca_equipo.getSelectedItem());
                pst.setString(5, txt_modelo_equipo.getText().trim());
                pst.setString(6, txt_num_serie_equipo.getText().trim());
                pst.setString(7, dia);
                pst.setString(8, mes);
                pst.setString(9, anno);
                pst.setString(10, jTextArea_observaviones.getText());
                pst.setString(11, "Nuevo Ingreso");
                pst.setString(12, Login.user);
                pst.setString(13, "");
                pst.setString(14, "");
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Equipo registrado con exito");

                combo_tipo_equipo.setSelectedItem(" ");
                combo_marca_equipo.setSelectedItem(" ");
                txt_modelo_equipo.setText("");
                txt_num_serie_equipo.setText("");
                jTextArea_observaviones.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al registrar equipo " + e);
            }
        }

    }//GEN-LAST:event_boton_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Equipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_registrar;
    private javax.swing.JComboBox<String> combo_marca_equipo;
    private javax.swing.JComboBox<String> combo_tipo_equipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_observaviones;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JTextField txt_id_cliente;
    private javax.swing.JTextField txt_modelo_equipo;
    private javax.swing.JTextField txt_num_serie_equipo;
    // End of variables declaration//GEN-END:variables
}
