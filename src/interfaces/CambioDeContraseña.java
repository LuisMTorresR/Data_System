/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author luism
 */
public class CambioDeContraseña extends javax.swing.JFrame {

    Gestion_Usuario seleccion = new Gestion_Usuario();
    String cliente_seleccionado = seleccion.usuario;

    /**
     * Creates new form CambioDeContraseña
     */
    public CambioDeContraseña() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(),
                label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icono);

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
        jLabel3 = new javax.swing.JLabel();
        txt_new_password = new javax.swing.JPasswordField();
        txt_confirm_password = new javax.swing.JPasswordField();
        jButton_Cambiar = new javax.swing.JButton();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cambiar Contraseña");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nueva Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirmar Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txt_new_password.setBackground(new java.awt.Color(204, 204, 255));
        txt_new_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_new_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 97, 135, -1));

        txt_confirm_password.setBackground(new java.awt.Color(204, 204, 255));
        txt_confirm_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_confirm_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 145, 135, -1));

        jButton_Cambiar.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Cambiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_Cambiar.setText("Cambiar");
        jButton_Cambiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CambiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 208, 70, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CambiarActionPerformed

        if (txt_new_password.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        } else if (txt_confirm_password.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        } else {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("update usuarios set password = ? where id_usuario = " + cliente_seleccionado);

                if (txt_confirm_password.getText().equals(txt_new_password.getText())) {

                    pst.setString(1, txt_confirm_password.getText().trim());
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Contraseña Actualizada");
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña no coicide!");
                }
                txt_new_password.setText("");
                txt_confirm_password.setText("");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error al actualizar la contrseña ");
            }
        }


    }//GEN-LAST:event_jButton_CambiarActionPerformed

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
            java.util.logging.Logger.getLogger(CambioDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioDeContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cambiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JPasswordField txt_confirm_password;
    private javax.swing.JPasswordField txt_new_password;
    // End of variables declaration//GEN-END:variables
}
