/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Admin
 */
public class Registrar extends javax.swing.JFrame {

    /**
     * Creates new form Registrar
     */
    public Registrar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlCheck = new javax.swing.JLabel();
        jlUsuarios = new javax.swing.JLabel();
        jTFUsario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPFPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jlMinimizar = new javax.swing.JLabel();
        jlSalir = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCBOpciones = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/checkSimbolo2.png"))); // NOI18N
        jlCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCheckMouseClicked(evt);
            }
        });
        jPanel1.add(jlCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, -1, -1));

        jlUsuarios.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jlUsuarios.setForeground(new java.awt.Color(60, 63, 65));
        jlUsuarios.setText("Nombre de Usuario:");
        jPanel1.add(jlUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jTFUsario.setBackground(new java.awt.Color(255, 255, 255));
        jTFUsario.setFont(new java.awt.Font("Dubai", 3, 24)); // NOI18N
        jTFUsario.setForeground(new java.awt.Color(69, 73, 74));
        jTFUsario.setText(" ");
        jTFUsario.setBorder(null);
        jTFUsario.setCaretColor(new java.awt.Color(69, 73, 74));
        jTFUsario.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        jTFUsario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTFUsario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 280, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 280, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Registro de Usuarios");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 63, 65));
        jLabel3.setText("Contrase??a:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jPFPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPFPassword.setFont(new java.awt.Font("Dubai", 3, 24)); // NOI18N
        jPFPassword.setForeground(new java.awt.Color(69, 73, 74));
        jPFPassword.setBorder(null);
        jPFPassword.setCaretColor(new java.awt.Color(69, 73, 74));
        jPFPassword.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        jPFPassword.setEchoChar('\u00b7');
        jPFPassword.setSelectedTextColor(new java.awt.Color(69, 73, 74));
        jPFPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 280, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 280, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/menuSimbolo.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jlMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimizarSimbolo.png"))); // NOI18N
        jlMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(jlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jlSalir.setForeground(new java.awt.Color(255, 255, 255));
        jlSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/salirSimbolo.png"))); // NOI18N
        jlSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlSalir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlSalirMouseDragged(evt);
            }
        });
        jlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSalirMouseClicked(evt);
            }
        });
        jPanel1.add(jlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jlUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/userSimbolo.png"))); // NOI18N
        jPanel1.add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wallpaper11.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 410));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Tipo de Usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        jCBOpciones.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jCBOpciones.setMaximumRowCount(3);
        jCBOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Jurado", "Equipo" }));
        jCBOpciones.setBorder(null);
        jPanel1.add(jCBOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 210, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Image/VEXicon.png"));
        return retValue;
    }
    
    private void jlSalirMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jlSalirMouseDragged

    private void jlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jlSalirMouseClicked

    private void jlMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(WIDTH);
    }//GEN-LAST:event_jlMinimizarMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTFUsarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsarioActionPerformed

    private void jPFPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFPasswordActionPerformed

    private void jlCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCheckMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jlCheckMouseClicked

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCBOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFUsario;
    private javax.swing.JLabel jlCheck;
    private javax.swing.JLabel jlMinimizar;
    private javax.swing.JLabel jlSalir;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JLabel jlUsuarios;
    // End of variables declaration//GEN-END:variables
}
