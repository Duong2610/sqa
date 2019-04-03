/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author duong
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton_list = new javax.swing.JButton();
        jButton_export = new javax.swing.JButton();
        jButton_setting = new javax.swing.JButton();
        jButton_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Hệ thống quản lý BHYT");

        jButton_list.setText("Xem danh sách");
        jButton_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listActionPerformed(evt);
            }
        });

        jButton_export.setText("Xuất báo cáo");
        jButton_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exportActionPerformed(evt);
            }
        });

        jButton_setting.setText("Cấu hình");
        jButton_setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_settingActionPerformed(evt);
            }
        });

        jButton_logout.setText("Đăng xuất");
        jButton_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton_setting))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_export)
                            .addComponent(jButton_list))))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_logout)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton_list)
                .addGap(18, 18, 18)
                .addComponent(jButton_export)
                .addGap(18, 18, 18)
                .addComponent(jButton_setting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButton_logout)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listActionPerformed
        // TODO add your handling code here:
        ListForm lf = new ListForm();
        MainForm mf = new MainForm();
        lf.setVisible(true);
        mf.setVisible(false);
        lf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton_listActionPerformed

    private void jButton_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exportActionPerformed
        // TODO add your handling code here:
        ExportForm ef= new ExportForm();
        MainForm mf= new MainForm();
        ef.setVisible(true);
        mf.setVisible(false);
        ef.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton_exportActionPerformed

    private void jButton_settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_settingActionPerformed
        // TODO add your handling code here:
        SettingForm sf= new SettingForm();
        MainForm mf= new MainForm();
        sf.setVisible(true);
        mf.setVisible(false);
        sf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton_settingActionPerformed

    private void jButton_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logoutActionPerformed
        // TODO add your handling code here:
        LoginForm lf = new LoginForm();
        MainForm mf= new MainForm();
        lf.setVisible(true);
        mf.setVisible(false);
        lf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_export;
    private javax.swing.JButton jButton_list;
    private javax.swing.JButton jButton_logout;
    private javax.swing.JButton jButton_setting;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
