/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test2;

/**
 *
 * @author ACER
 */
public class SalesMenu extends javax.swing.JFrame {

    /**
     * Creates new form SalesMenu
     */
    public SalesMenu() {
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

        MenuNameLabel = new javax.swing.JLabel();
        ItemEntryButton = new javax.swing.JButton();
        SupplierEntryButton = new javax.swing.JButton();
        DailyItemWiseButton = new javax.swing.JButton();
        CreatePRButton = new javax.swing.JButton();
        DisplayPRButton = new javax.swing.JButton();
        ListofPOButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuNameLabel.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        MenuNameLabel.setText("Sales Manager Menu");

        ItemEntryButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        ItemEntryButton.setText("Item Entry");
        ItemEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEntryButtonActionPerformed(evt);
            }
        });

        SupplierEntryButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        SupplierEntryButton.setText("Supplier Entry");
        SupplierEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierEntryButtonActionPerformed(evt);
            }
        });

        DailyItemWiseButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        DailyItemWiseButton.setText("Daily Item-Wise Sales Entry");
        DailyItemWiseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DailyItemWiseButtonActionPerformed(evt);
            }
        });

        CreatePRButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        CreatePRButton.setText("Create Purchase Requisition");
        CreatePRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePRButtonActionPerformed(evt);
            }
        });

        DisplayPRButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        DisplayPRButton.setText("Display Purchase Requisition");
        DisplayPRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayPRButtonActionPerformed(evt);
            }
        });

        ListofPOButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        ListofPOButton.setText("List of Purchaser Orders");
        ListofPOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListofPOButtonActionPerformed(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SupplierEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DisplayPRButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListofPOButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CreatePRButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DailyItemWiseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItemEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LogoutButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MenuNameLabel)
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoutButton)
                .addGap(24, 24, 24)
                .addComponent(MenuNameLabel)
                .addGap(18, 18, 18)
                .addComponent(ItemEntryButton)
                .addGap(18, 18, 18)
                .addComponent(SupplierEntryButton)
                .addGap(18, 18, 18)
                .addComponent(DailyItemWiseButton)
                .addGap(18, 18, 18)
                .addComponent(CreatePRButton)
                .addGap(18, 18, 18)
                .addComponent(DisplayPRButton)
                .addGap(18, 18, 18)
                .addComponent(ListofPOButton)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEntryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemEntryButtonActionPerformed

    private void SupplierEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierEntryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierEntryButtonActionPerformed

    private void DailyItemWiseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DailyItemWiseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DailyItemWiseButtonActionPerformed

    private void CreatePRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePRButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreatePRButtonActionPerformed

    private void DisplayPRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayPRButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayPRButtonActionPerformed

    private void ListofPOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListofPOButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListofPOButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        this.dispose();
        LoginGUI loginGUI = new LoginGUI();
        loginGUI.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SalesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreatePRButton;
    private javax.swing.JButton DailyItemWiseButton;
    private javax.swing.JButton DisplayPRButton;
    private javax.swing.JButton ItemEntryButton;
    private javax.swing.JButton ListofPOButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel MenuNameLabel;
    private javax.swing.JButton SupplierEntryButton;
    // End of variables declaration//GEN-END:variables
}
