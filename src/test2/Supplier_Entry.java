/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Supplier_Entry extends javax.swing.JFrame {
    String name,address,phonenumber,supplierID;
    private ArrayList<Supplier> suppliers = new ArrayList<>();
    private DefaultTableModel model;
    private File file = new File("Suppliers.txt");

    public Supplier_Entry() {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        loadSuppliersFromFile();
        refreshTable();
    }
    
    private void clearFields() {
        nameText.setText("");
        addressText.setText("");
        phonenumberText.setText("");
    }
    
    private boolean isSupplierNameExists(String name) {
        for (Supplier supplier : suppliers) {
            if (supplier.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    private void deleteSupplier(String id) {
    Supplier supplierToDelete = null;
        for (Supplier supplier : suppliers) {
            if (supplier.getID().equals(id)) {
                supplierToDelete = supplier;
                break; // Exit the loop once a match is found
            }
        }
        if (supplierToDelete != null) {
            suppliers.remove(supplierToDelete); // Remove the found supplier
            saveSuppliersToFile(); // Save the updated list to the file
        }
    }
    
    private void saveSuppliersToFile() {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
        for (Supplier supplier : suppliers) {
            bw.write(supplier.getID() + "," + supplier.getName() + "," + supplier.getAddress() + "," + supplier.getPhoneNumber());
            bw.newLine();
        }
    } catch (IOException ex) {
        Logger.getLogger(Supplier_Entry.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    private void refreshTable() {
        model.setRowCount(0);
        for (Supplier supplier : suppliers) {
            model.addRow(new Object[]{supplier.getID(),supplier.getName(), supplier.getAddress(), supplier.getPhoneNumber()});
        }
    }
    
    private void loadSuppliersFromFile() {
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] details = line.split(",");
            if (details.length == 4) {
                suppliers.add(new Supplier(details[0], details[1], details[2], details[3]));
            }
        }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Supplier_Entry.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Supplier_Entry.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    private void performSearch(String searchText) {
        model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear the table before adding search results

        int selectedIndex = selection.getSelectedIndex(); // Get the selected index from the dropdown

        for (Supplier supplier : suppliers) {
            if (selectedIndex == 0) { // Search by Supplier ID
                String supplierID = supplier.getID();
                if (supplierID.contains(searchText)) {
                    model.addRow(new Object[]{supplier.getID(), supplier.getName(), supplier.getAddress(), supplier.getPhoneNumber()});
                }
            } else if (selectedIndex == 1) { // Search by Supplier Name
                String supplierName = supplier.getName().toLowerCase(); // Convert to lowercase for case-insensitive search
                if (supplierName.contains(searchText.toLowerCase())) {
                    model.addRow(new Object[]{supplier.getID(), supplier.getName(), supplier.getAddress(), supplier.getPhoneNumber()});
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        phonenumberText = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        selection = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Supplier ID", "Name", "Address", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Address");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Phone Number");

        nameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addressText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        phonenumberText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phonenumberText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonenumberTextKeyTyped(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        selection.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier ID", "Supplier Name" }));

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SUPPLIER  ENTRY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(searchButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(91, 91, 91)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(74, 74, 74)
                                .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17)
                                .addComponent(phonenumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(332, 332, 332)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(phonenumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        name = nameText.getText();
        address = addressText.getText();
        phonenumber = phonenumberText.getText();

        if (name.trim().isEmpty() || address.trim().isEmpty() || phonenumber.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields cannot be empty, please fill in the details");
        } else if (isSupplierNameExists(name)){
                JOptionPane.showMessageDialog(null, "Supplier with this name already exists in the system");
        } else if(table.getRowCount()== 0){
            suppliers.add(new Supplier("1",name, address, phonenumber));
            saveSuppliersToFile();
            refreshTable();
            clearFields();
        } else{
            for (Supplier supplier:suppliers){
                supplierID = supplier.getID();
            }
            int value = Integer.parseInt(supplierID) + 1;
            String id = String.valueOf(value);
            suppliers.add(new Supplier(id,name, address, phonenumber));
            saveSuppliersToFile();
            refreshTable();
            clearFields();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        model = (DefaultTableModel) table.getModel();
        int selectedRow = table.getSelectedRow();
        int selectedRowCount = table.getSelectedRowCount();

        if (selectedRowCount != 1){
        JOptionPane.showMessageDialog(null, "Please select 1 row to edit at a time.");
        return;
        }
        
        String id = table.getValueAt(selectedRow, 0).toString();
        name = nameText.getText();
        address = addressText.getText();
        phonenumber = phonenumberText.getText();
        
        if ("".equals(name.trim()) || "".equals(address.trim()) || "".equals(phonenumber.trim())) {
            JOptionPane.showMessageDialog(null, "Data cannot be empty, please fill in the empty data.");
            return;
        }
        // Update the Supplier object in memory
        Supplier selectedSupplier = null;
        for (Supplier supplier: suppliers) {
            if (supplier.getID().equals(id)) {
                selectedSupplier = supplier;
                break; // Exit the loop once a match is found
            }
        }
        selectedSupplier.setName(name);
        selectedSupplier.setAddress(address);
        selectedSupplier.setPhoneNumber(phonenumber);
        // Update the table view
        model.setValueAt(name, selectedRow, 1);
        model.setValueAt(address, selectedRow, 2);
        model.setValueAt(phonenumber, selectedRow, 3);
        // Save the updated data to the file

        saveSuppliersToFile();
        JOptionPane.showMessageDialog(null, "Successfully updated.");
    }//GEN-LAST:event_editButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        model = (DefaultTableModel)table.getModel();
        name = model.getValueAt(table.getSelectedRow(),1).toString();
        address = model.getValueAt(table.getSelectedRow(),2).toString();
        phonenumber = model.getValueAt(table.getSelectedRow(),3).toString();

        nameText.setText(name);
        addressText.setText(address);
        phonenumberText.setText(phonenumber);
    }//GEN-LAST:event_tableMouseClicked

    private void phonenumberTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenumberTextKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_phonenumberTextKeyTyped

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    model = (DefaultTableModel) table.getModel();
    int row = table.getSelectedRow();
    
    if (row == -1) {
        JOptionPane.showMessageDialog(null, "No rows selected for deletion.");
        return;
    }
    
    // Get the ID of the selected supplier
    String id = table.getValueAt(row, 0).toString();
    
    // Remove the supplier from the list
    deleteSupplier(id);
    
    // Remove the row from the table
    model.removeRow(row);
    
    // Save the updated supplier list to the file
    saveSuppliersToFile();
    
    clearFields();
    
    JOptionPane.showMessageDialog(null, "Successfully deleted.");
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String search = searchText.getText(); // Get the search text from the "searchText" field
        performSearch(search);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier_Entry().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phonenumberText;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JComboBox<String> selection;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
