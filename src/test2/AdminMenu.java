/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test2;

/**
 *
 * @author ACER
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
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

        AdminMenuLabel = new javax.swing.JLabel();
        CreateUserButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        ListofItemsButton = new javax.swing.JButton();
        ListofSuppliers = new javax.swing.JButton();
        ListOfSalesEntryButton = new javax.swing.JButton();
        ListofPOButton = new javax.swing.JButton();
        DisplayPRButton = new javax.swing.JButton();
        ItemEntryButton = new javax.swing.JButton();
        SupplierEntryButton = new javax.swing.JButton();
        DailyItemWiseSalesEntryButton = new javax.swing.JButton();
        CreatePRButton = new javax.swing.JButton();
        GeneratePOButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminMenuLabel.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        AdminMenuLabel.setText("Admin Menu");

        CreateUserButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        CreateUserButton.setText("Create User");
        CreateUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserButtonActionPerformed(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        ListofItemsButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        ListofItemsButton.setText("List of Items");
        ListofItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListofItemsButtonActionPerformed(evt);
            }
        });

        ListofSuppliers.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        ListofSuppliers.setText("List of Suppliers");
        ListofSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListofSuppliersActionPerformed(evt);
            }
        });

        ListOfSalesEntryButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        ListOfSalesEntryButton.setText("List of Sales Entry");
        ListOfSalesEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfSalesEntryButtonActionPerformed(evt);
            }
        });

        ListofPOButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        ListofPOButton.setText("List of Purchase Orders");
        ListofPOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListofPOButtonActionPerformed(evt);
            }
        });

        DisplayPRButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        DisplayPRButton.setText("Display Purchase Requisition");
        DisplayPRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayPRButtonActionPerformed(evt);
            }
        });

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

        DailyItemWiseSalesEntryButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        DailyItemWiseSalesEntryButton.setText("Daily Item-Wise Sales Entry");
        DailyItemWiseSalesEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DailyItemWiseSalesEntryButtonActionPerformed(evt);
            }
        });

        CreatePRButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        CreatePRButton.setText("Create Purchase Requisition");
        CreatePRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePRButtonActionPerformed(evt);
            }
        });

        GeneratePOButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        GeneratePOButton.setText("Generate Purchase Order");
        GeneratePOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneratePOButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LogoutButton)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AdminMenuLabel)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListOfSalesEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ListofItemsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ListofSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                .addComponent(ItemEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SupplierEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                .addComponent(DailyItemWiseSalesEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                            .addComponent(CreatePRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DisplayPRButton)
                            .addComponent(ListofPOButton, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GeneratePOButton, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CreateUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoutButton)
                .addGap(40, 40, 40)
                .addComponent(AdminMenuLabel)
                .addGap(47, 47, 47)
                .addComponent(ListofItemsButton)
                .addGap(18, 18, 18)
                .addComponent(ItemEntryButton)
                .addGap(18, 18, 18)
                .addComponent(ListofSuppliers)
                .addGap(18, 18, 18)
                .addComponent(SupplierEntryButton)
                .addGap(18, 18, 18)
                .addComponent(DailyItemWiseSalesEntryButton)
                .addGap(18, 18, 18)
                .addComponent(ListOfSalesEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreatePRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DisplayPRButton)
                .addGap(18, 18, 18)
                .addComponent(ListofPOButton)
                .addGap(18, 18, 18)
                .addComponent(GeneratePOButton)
                .addGap(18, 18, 18)
                .addComponent(CreateUserButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CreateUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserButtonActionPerformed
        RegistrationGUI registrationGUI = new RegistrationGUI();
        registrationGUI.setVisible(true);
    }//GEN-LAST:event_CreateUserButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        this.dispose();
        LoginGUI loginGUI = new LoginGUI();
        loginGUI.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ListofItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListofItemsButtonActionPerformed
        ViewItems viewitems = new ViewItems();
        viewitems.setVisible(true);
    }//GEN-LAST:event_ListofItemsButtonActionPerformed

    private void ListofSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListofSuppliersActionPerformed
        ViewSuppliers viewsuppliers = new ViewSuppliers();
        viewsuppliers.setVisible(true);
    }//GEN-LAST:event_ListofSuppliersActionPerformed

    private void ListOfSalesEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOfSalesEntryButtonActionPerformed
        ListOfSalesEntry listofsalesentry = new ListOfSalesEntry();
        listofsalesentry.setVisible(true);
    }//GEN-LAST:event_ListOfSalesEntryButtonActionPerformed

    private void ListofPOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListofPOButtonActionPerformed
        ViewPurchaseOrder viewpo = new ViewPurchaseOrder();
        viewpo.setVisible(true);
    }//GEN-LAST:event_ListofPOButtonActionPerformed

    private void DisplayPRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayPRButtonActionPerformed
        ViewPurchaseRequisition viewpr = new ViewPurchaseRequisition();
        viewpr.setVisible(true);
    }//GEN-LAST:event_DisplayPRButtonActionPerformed

    private void ItemEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEntryButtonActionPerformed
        Item_Entry itementry = new Item_Entry();
        itementry.setVisible(true);
    }//GEN-LAST:event_ItemEntryButtonActionPerformed

    private void SupplierEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierEntryButtonActionPerformed
        Supplier_Entry supplierentry = new Supplier_Entry();
        supplierentry.setVisible(true);
    }//GEN-LAST:event_SupplierEntryButtonActionPerformed

    private void DailyItemWiseSalesEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DailyItemWiseSalesEntryButtonActionPerformed
        DailyItemWiseSalesEntry dailyitem = new DailyItemWiseSalesEntry();
        dailyitem.setVisible(true);
    }//GEN-LAST:event_DailyItemWiseSalesEntryButtonActionPerformed

    private void CreatePRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePRButtonActionPerformed
        PurchaseRequisitionPage prpage = new PurchaseRequisitionPage();
        prpage.setVisible(true);
    }//GEN-LAST:event_CreatePRButtonActionPerformed

    private void GeneratePOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneratePOButtonActionPerformed
        PurchaseOrderPage popage = new PurchaseOrderPage();
        popage.setVisible(true);
    }//GEN-LAST:event_GeneratePOButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminMenuLabel;
    private javax.swing.JButton CreatePRButton;
    private javax.swing.JButton CreateUserButton;
    private javax.swing.JButton DailyItemWiseSalesEntryButton;
    private javax.swing.JButton DisplayPRButton;
    private javax.swing.JButton GeneratePOButton;
    private javax.swing.JButton ItemEntryButton;
    private javax.swing.JButton ListOfSalesEntryButton;
    private javax.swing.JButton ListofItemsButton;
    private javax.swing.JButton ListofPOButton;
    private javax.swing.JButton ListofSuppliers;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton SupplierEntryButton;
    // End of variables declaration//GEN-END:variables
}
