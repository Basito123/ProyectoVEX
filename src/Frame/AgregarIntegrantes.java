/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Admin
 */
public class AgregarIntegrantes extends javax.swing.JFrame {

    /**
     * Creates new form AgregarIntegrantes
     */
    public AgregarIntegrantes() {
        initComponents();
        this.setLocationRelativeTo(null);
        jSpinner1.addChangeListener(listener);
        jSpinner2.addChangeListener(listener);
        jSpinner3.addChangeListener(listener);
    }

    ChangeListener listener = new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
            if((Integer)jSpinner1.getValue() < 0){
                jSpinner1.setValue(0);
            }
            
            if((Integer)jSpinner2.getValue() < 0){
                jSpinner2.setValue(0);
            }
            
            if((Integer)jSpinner3.getValue() < 0){
                jSpinner3.setValue(0);
            }
        }
    };


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jlSalir = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlMinimizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTFCurp1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFNombreIntegrante1 = new javax.swing.JTextField();
        jTFCurp2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFNombreIntegrante2 = new javax.swing.JTextField();
        jTFFechaEvento = new javax.swing.JTextField();
        jTFCurp3 = new javax.swing.JTextField();
        jTFNombreIntegrante3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Fecha del Evento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

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
        jPanel1.add(jlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("CURP:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("CURP:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

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
        jPanel1.add(jlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Agregar Integrantes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("CURP:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wallpaper11.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 210));

        jTFCurp1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jPanel1.add(jTFCurp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 260, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Nombre del Integrante:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Edad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jTFNombreIntegrante1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jPanel1.add(jTFNombreIntegrante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 260, -1));

        jTFCurp2.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jPanel1.add(jTFCurp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 260, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Nombre del Integrante:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jTFNombreIntegrante2.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jPanel1.add(jTFNombreIntegrante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 260, -1));

        jTFFechaEvento.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jTFFechaEvento.setEnabled(false);
        jPanel1.add(jTFFechaEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 260, -1));

        jTFCurp3.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jPanel1.add(jTFCurp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 260, -1));

        jTFNombreIntegrante3.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jPanel1.add(jTFNombreIntegrante3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 260, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Nombre del Integrante:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 432, 720, 10));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Nombre del Equipo:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Nombre del Evento:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/checkSimbolo2.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, -1, -1));

        jSpinner3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jPanel1.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 70, -1));

        jSpinner1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 70, -1));

        jSpinner2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 70, -1));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 260, -1));

        jComboBox2.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 490, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        MenuAdmin menuAdmin = new MenuAdmin();
        menuAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Conexion conecta = new Conexion();
        /*conecta.InsertarIntegrantes(jTFCurp1, jTFNombreIntegrante1, jSpinner1, jTFNombreEquipo, jTFNombreEvento, jTFFechaEvento);
        conecta.InsertarIntegrantes(jTFCurp2, jTFNombreIntegrante2, jSpinner2, jTFNombreEquipo, jTFNombreEvento, jTFFechaEvento);
        conecta.InsertarIntegrantes(jTFCurp3, jTFNombreIntegrante3, jSpinner3, jTFNombreEquipo, jTFNombreEvento, jTFFechaEvento);*/
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(AgregarIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarIntegrantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTFCurp1;
    private javax.swing.JTextField jTFCurp2;
    private javax.swing.JTextField jTFCurp3;
    private javax.swing.JTextField jTFFechaEvento;
    private javax.swing.JTextField jTFNombreIntegrante1;
    private javax.swing.JTextField jTFNombreIntegrante2;
    private javax.swing.JTextField jTFNombreIntegrante3;
    private javax.swing.JLabel jlMinimizar;
    private javax.swing.JLabel jlSalir;
    // End of variables declaration//GEN-END:variables
}
