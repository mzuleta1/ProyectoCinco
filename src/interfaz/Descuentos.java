/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author LUCYLEONOR
 */
public class Descuentos extends javax.swing.JFrame {

    /**
     * Creates new form Descuentos
     */
    public Descuentos() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblPP = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSS = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSF = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCA = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdRestaurar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Descuentos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Descuentos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Sueldo Base");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        txtS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSKeyTyped(evt);
            }
        });
        jPanel1.add(txtS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 120, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Ley Politica Publica");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblPP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Seguro Social");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        lblSS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 130, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Sefuro Forzoso");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        lblSF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 130, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Caja de Ahorro");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, -1));

        lblCA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 140, 40));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 180, -1));

        cmdRestaurar.setText("Restaurar");
        cmdRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 180, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Total a Pagar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        lblT.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblT, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        if (txtS.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Ingresó El Sueldo Base", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtS.requestFocusInWindow();
        } else if (txtS.getText().equalsIgnoreCase("0")) {
            JOptionPane.showMessageDialog(this, "Ingrese Un Valor Superior a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtS.selectAll();
            txtS.requestFocusInWindow();
        } else {
            String r, r1, r2, r3, r4;
            double pp, ss, sf, ca, t, s, d;

            s = Double.parseDouble(txtS.getText());

            pp = s * 0.01;
            ss = s * 0.04;
            sf = s * 0.005;
            ca = s * 0.05;

            d = pp + ss + sf + ca;

            t = s - d;

            r = String.valueOf(pp);
            r1 = String.valueOf(ss);
            r2 = String.valueOf(sf);
            r3 = String.valueOf(ca);
            r4 = String.valueOf(t);

            lblPP.setText("$ " + r);
            lblSS.setText("$ " + r1);
            lblSF.setText("$ " + r2);
            lblCA.setText("$ " + r3);
            lblT.setText("$ " + r4);

        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRestaurarActionPerformed

        txtS.setText("");
        lblPP.setText("");
        lblSS.setText("");
        lblSF.setText("");
        lblCA.setText("");
        lblT.setText("");
        txtS.requestFocusInWindow();
    }//GEN-LAST:event_cmdRestaurarActionPerformed

    private void txtSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (txtS.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ingresó El Sueldo Base", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtS.requestFocusInWindow();
            } else if (txtS.getText().equalsIgnoreCase("0")) {
                JOptionPane.showMessageDialog(this, "Ingrese Un Valor Superior a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtS.selectAll();
                txtS.requestFocusInWindow();
            } else {
                String r, r1, r2, r3, r4;
                double pp, ss, sf, ca, t, s, d;

                s = Double.parseDouble(txtS.getText());

                pp = s * 0.01;
                ss = s * 0.04;
                sf = s * 0.005;
                ca = s * 0.05;

                d = pp + ss + sf + ca;

                t = s - d;

                r = String.valueOf(pp);
                r1 = String.valueOf(ss);
                r2 = String.valueOf(sf);
                r3 = String.valueOf(ca);
                r4 = String.valueOf(t);

                lblPP.setText("$ " + r);
                lblSS.setText("$ " + r1);
                lblSF.setText("$ " + r2);
                lblCA.setText("$ " + r3);
                lblT.setText("$ " + r4);

            }
        }

    }//GEN-LAST:event_txtSKeyPressed

    private void txtSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSKeyTyped

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
            java.util.logging.Logger.getLogger(Descuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Descuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Descuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Descuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Descuentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdRestaurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCA;
    private javax.swing.JLabel lblPP;
    private javax.swing.JLabel lblSF;
    private javax.swing.JLabel lblSS;
    private javax.swing.JLabel lblT;
    private javax.swing.JTextField txtS;
    // End of variables declaration//GEN-END:variables
}
