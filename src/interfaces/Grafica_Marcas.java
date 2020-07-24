/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author luism
 */
public class Grafica_Marcas extends javax.swing.JFrame {

    /**
     * Creates new form Grafica_Marcas
     */
    public Grafica_Marcas() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Usuario " + Login.user + ".");
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(),
                label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icono);

        int total = 0;
        boolean ultimo;
        String cantidad;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select marca from equipos where marca = 'Sony'");
            ResultSet rs = pst.executeQuery();
            ultimo = rs.last();
            if (ultimo) {
                total = rs.getRow();
                cantidad = String.valueOf(total);
                t_Sony.setText(cantidad);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la informacion");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select marca from equipos where marca = 'Dell'");
            ResultSet rs = pst.executeQuery();
            ultimo = rs.last();
            if (ultimo) {
                total = rs.getRow();
                cantidad = String.valueOf(total);
                t_Dell.setText(cantidad);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la informacion");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select marca from equipos where marca = 'Apple'");
            ResultSet rs = pst.executeQuery();
            ultimo = rs.last();
            if (ultimo) {
                total = rs.getRow();
                cantidad = String.valueOf(total);
                t_Apple.setText(cantidad);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la informacion");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select marca from equipos where marca = 'Acer'");
            ResultSet rs = pst.executeQuery();
            ultimo = rs.last();
            if (ultimo) {
                total = rs.getRow();
                cantidad = String.valueOf(total);
                t_Acer.setText(cantidad);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la informacion");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select marca from equipos where marca = 'Samsung'");
            ResultSet rs = pst.executeQuery();
            ultimo = rs.last();
            if (ultimo) {
                total = rs.getRow();
                cantidad = String.valueOf(total);
                t_Samsung.setText(cantidad);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la informacion");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select marca from equipos where marca = 'HP'");
            ResultSet rs = pst.executeQuery();
            ultimo = rs.last();
            if (ultimo) {
                total = rs.getRow();
                cantidad = String.valueOf(total);
                t_HP.setText(cantidad);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la informacion");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select marca from equipos where marca = 'Lenovo'");
            ResultSet rs = pst.executeQuery();
            ultimo = rs.last();
            if (ultimo) {
                total = rs.getRow();
                cantidad = String.valueOf(total);
                t_Lenovo.setText(cantidad);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la informacion");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select marca from equipos where marca = 'Otra'");
            ResultSet rs = pst.executeQuery();
            ultimo = rs.last();
            if (ultimo) {
                total = rs.getRow();
                cantidad = String.valueOf(total);
                t_Otro.setText(cantidad);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la informacion");
        }

    }

    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    boolean bandera = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t_Sony = new javax.swing.JTextField();
        t_Dell = new javax.swing.JTextField();
        t_Apple = new javax.swing.JTextField();
        t_Acer = new javax.swing.JTextField();
        t_Samsung = new javax.swing.JTextField();
        t_HP = new javax.swing.JTextField();
        t_Lenovo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t_Otro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grafica.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 120, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sony");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dell");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apple");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Acer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Samsung");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HP");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lenovo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        t_Sony.setEditable(false);
        t_Sony.setBackground(new java.awt.Color(204, 204, 255));
        t_Sony.setText("0");
        getContentPane().add(t_Sony, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 50, -1));

        t_Dell.setEditable(false);
        t_Dell.setBackground(new java.awt.Color(204, 204, 255));
        t_Dell.setText("0");
        getContentPane().add(t_Dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 50, -1));

        t_Apple.setEditable(false);
        t_Apple.setBackground(new java.awt.Color(204, 204, 255));
        t_Apple.setText("0");
        getContentPane().add(t_Apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 50, -1));

        t_Acer.setEditable(false);
        t_Acer.setBackground(new java.awt.Color(204, 204, 255));
        t_Acer.setText("0");
        getContentPane().add(t_Acer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 50, -1));

        t_Samsung.setEditable(false);
        t_Samsung.setBackground(new java.awt.Color(204, 204, 255));
        t_Samsung.setText("0");
        getContentPane().add(t_Samsung, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 50, -1));

        t_HP.setEditable(false);
        t_HP.setBackground(new java.awt.Color(204, 204, 255));
        t_HP.setText("0");
        getContentPane().add(t_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 50, -1));

        t_Lenovo.setEditable(false);
        t_Lenovo.setBackground(new java.awt.Color(204, 204, 255));
        t_Lenovo.setText("0");
        getContentPane().add(t_Lenovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Otra");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        t_Otro.setEditable(false);
        t_Otro.setBackground(new java.awt.Color(204, 204, 255));
        t_Otro.setText("0");
        getContentPane().add(t_Otro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 50, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Grafica por Marca");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Graficar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabel11.setText("Data System");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bandera = true;
        repaint();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Grafica_Marcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica_Marcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica_Marcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica_Marcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica_Marcas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JTextField t_Acer;
    private javax.swing.JTextField t_Apple;
    private javax.swing.JTextField t_Dell;
    private javax.swing.JTextField t_HP;
    private javax.swing.JTextField t_Lenovo;
    private javax.swing.JTextField t_Otro;
    private javax.swing.JTextField t_Samsung;
    private javax.swing.JTextField t_Sony;
    // End of variables declaration//GEN-END:variables

    public int MayorValor(int sony, int dell, int apple, int acer, int samsung, int hp, int lenovo, int otro) {
        if (sony > dell && sony > apple && sony > acer && sony > samsung && sony > hp && sony > lenovo && sony > otro) {
            return sony;
        } else if (dell > apple && dell > acer && dell > samsung && dell > hp && dell > lenovo && dell > otro) {
            return dell;
        } else if (apple > acer && apple > samsung && apple > hp && apple > lenovo && apple > otro) {
            return apple;
        } else if (acer > samsung && acer > hp && acer > lenovo && acer > otro) {
            return acer;
        } else if (samsung > hp && samsung > lenovo && samsung > otro) {
            return samsung;
        } else if (hp > lenovo && hp > otro) {
            return hp;
        } else if (lenovo > otro) {
            return lenovo;
        } else {
            return otro;
        }

    }

    public void paint(Graphics g) {
        super.paint(g);
        if (bandera == true) {

            String string_sony = t_Sony.getText();
            String string_dell = t_Dell.getText();
            String string_apple = t_Apple.getText();
            String string_acer = t_Acer.getText();
            String string_samsumg = t_Samsung.getText();
            String string_hp = t_HP.getText();
            String string_lenovo = t_Lenovo.getText();
            String string_otro = t_Otro.getText();

            int int_sony = Integer.parseInt(string_sony);
            int int_dell = Integer.parseInt(string_dell);
            int int_apple = Integer.parseInt(string_apple);
            int int_acer = Integer.parseInt(string_acer);
            int int_samsung = Integer.parseInt(string_samsumg);
            int int_hp = Integer.parseInt(string_hp);
            int int_lenovo = Integer.parseInt(string_lenovo);
            int int_otro = Integer.parseInt(string_otro);

            int valor_Mayor = MayorValor(int_sony, int_dell, int_apple, int_acer, int_samsung, int_hp, int_lenovo, int_otro);

            int largo_sony = int_sony * 500 / valor_Mayor;
            int largo_dell = int_dell * 500 / valor_Mayor;
            int largo_apple = int_apple * 500 / valor_Mayor;
            int largo_acer = int_acer * 500 / valor_Mayor;
            int largo_samsung = int_samsung * 500 / valor_Mayor;
            int largo_hp = int_hp * 500 / valor_Mayor;
            int largo_lenovo = int_lenovo * 500 / valor_Mayor;
            int largo_otro = int_otro * 500 / valor_Mayor;

            g.setColor(Color.WHITE);
            g.fillRect(80, 100, largo_sony, 10);
            Font oldFont = getFont();
            Font fuente = new Font("Arial", Font.BOLD, 12);
            g.setFont(fuente);
            g.drawString("Sony", 10, 110);

            g.setColor(Color.white);
            g.fillRect(80, 120, largo_dell, 10);
            g.drawString("Dell", 10, 130);

            g.setColor(Color.white);
            g.fillRect(80, 140, largo_apple, 10);
            g.drawString("Apple", 10, 150);

            g.setColor(Color.white);
            g.fillRect(80, 160, largo_acer, 10);
            g.drawString("Acer", 10, 170);

            g.setColor(Color.white);
            g.fillRect(80, 180, largo_samsung, 10);
            g.drawString("Samsung", 10, 190);

            g.setColor(Color.white);
            g.fillRect(80, 200, largo_hp, 10);
            g.drawString("HP", 10, 210);

            g.setColor(Color.white);
            g.fillRect(80, 220, largo_lenovo, 10);
            g.drawString("Lenovo", 10, 230);

            g.setColor(Color.white);
            g.fillRect(80, 240, largo_otro, 10);
            g.drawString("Otra", 10, 250);
        }
    }

}
