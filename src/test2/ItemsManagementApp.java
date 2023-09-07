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

/**
 *
 * @author Cody
 */





public class ItemsManagementApp extends javax.swing.JFrame {
    String name,price,selectedSupplier,supplierID,supplier,itemID,itemName;
    private ArrayList<Supplier> suppliers = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();
    private DefaultTableModel model;
    private File suppliersFile = new File("Suppliers.txt");
    private File itemsFile = new File("Items.txt");
    

    public ItemsManagementApp() {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        loadSuppliersFromFile();
        loadItemsFromFile();
        refreshTable();
        for (Supplier supplier: suppliers){
            supplierDropbox.addItem(supplier.getName());
        }
    }

    
    private void loadSuppliersFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(suppliersFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 4) {
                    suppliers.add(new Supplier(details[0], details[1], details[2], details[3]));
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SupplierManagementApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SupplierManagementApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadItemsFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(itemsFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 5) {
                    items.add(new Item(details[0], details[1], details[3], details[4],Double.parseDouble(details[2])));
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SupplierManagementApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SupplierManagementApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void saveItemsToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(itemsFile))) {
            for (Item item : items) {
                bw.write(item.getID() + "," + item.getName()  + "," + item.getPrice() + "," + item.getSupplierID() + "," + item.getSupplierName());
                bw.newLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(SupplierManagementApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void refreshTable() {
        model.setRowCount(0);
        for (Item item : items) {
            model.addRow(new Object[]{item.getID(), item.getName(), item.getPrice(), item.getSupplierID(),item.getSupplierName()});
        }
    }
    
    private void clearFields() {
        itemNameText.setText("");
        priceText.setText("");
        supplierDropbox.setSelectedItem(null);
    }
     
    private void deleteItem(String id) {
        Item itemToDelete = null;
        for (Item item : items) {
            if (item.getID().equals(id)) {
                itemToDelete = item;
                break; // Exit the loop once a match is found
            }
        }
        if (itemToDelete != null) {
            items.remove(itemToDelete); // Remove the found supplier
            saveItemsToFile(); // Save the updated list to the file
        }
    }
    
    private void performSearch(String searchText) {
        model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear the table before adding search results

        int selectedIndex = selection.getSelectedIndex(); // Get the selected index from the dropdown

        for (Item item : items) {
            if (selectedIndex == 0) { // Search by Supplier ID
                itemID = item.getID();
                if (itemID.contains(searchText)) {
                    model.addRow(new Object[]{item.getID(), item.getName(), item.getPrice(), item.getSupplierID(),item.getSupplierName()});
                }
            } else if (selectedIndex == 1) { // Search by Supplier Name
                itemName = item.getName().toLowerCase(); // Convert to lowercase for case-insensitive search
                if (itemName.contains(searchText.toLowerCase())) {
                    model.addRow(new Object[]{item.getID(), item.getName(), item.getPrice(), item.getSupplierID(),item.getSupplierName()});
                }
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        supplierDropbox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        itemNameText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        selection = new javax.swing.JComboBox<>();
        searchText = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Price Per Item", "Supplier ID", "Supplier Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Item Name");

        jLabel2.setText("Supplier");

        supplierDropbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDropboxActionPerformed(evt);
            }
        });

        jLabel3.setText("Price Per Item");

        priceText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceTextKeyTyped(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");

        selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item ID", "Item Name" }));

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchText)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(backButton)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(itemNameText)
                            .addComponent(supplierDropbox, 0, 116, Short.MAX_VALUE)
                            .addComponent(priceText))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 260, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(editButton)
                        .addGap(18, 18, 18)
                        .addComponent(addButton)
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(supplierDropbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(backButton)
                    .addComponent(deleteButton))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        name = itemNameText.getText();
        price = priceText.getText();

        try {
            double test = Double.parseDouble(price);
        } catch (NumberFormatException e) {
            // Parsing failed, show a JOptionPane message
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            return;
        }
        
        if (name.trim().isEmpty() || price.trim().isEmpty() || selectedSupplier == null) {
            JOptionPane.showMessageDialog(null, "All fields cannot be empty, please fill in the details");
        }else if(table.getRowCount()== 0){
            for (Supplier supplier:suppliers){
                if (supplier.getName().equals(selectedSupplier)){
                    supplierID = supplier.getID();
                }
            }
            items.add(new Item("1", name, supplierID, selectedSupplier,Double.parseDouble(price)));
            saveItemsToFile();
            refreshTable();
            clearFields();
            
        } else{
            
            for (Supplier supplier:suppliers){
                if (supplier.getName().equals(selectedSupplier)){
                    supplierID = supplier.getID();
                }
            }
            
            for (Item item: items){
                itemID = item.getID();
            }
            int value = Integer.parseInt(itemID) + 1;
            String id = String.valueOf(value);
            
            items.add(new Item(id, name ,supplierID, selectedSupplier,  Double.parseDouble(price)));
            saveItemsToFile();
            refreshTable();
            clearFields();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
    model = (DefaultTableModel) table.getModel();
    int selectedRow = table.getSelectedRow();
    int selectedRowCount = table.getSelectedRowCount();

    if (selectedRowCount != 1){
        JOptionPane.showMessageDialog(null, "Please select 1 row at a time.");
        return;
    }
    
    String id = table.getValueAt(selectedRow, 0).toString();
    name = itemNameText.getText();
    supplier = selectedSupplier = (String) supplierDropbox.getSelectedItem();
    price = priceText.getText();
    
    try {
        double test = Double.parseDouble(price);
    } catch (NumberFormatException e) {
        // Parsing failed, show a JOptionPane message
        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        return;
    }
    
    if ("".equals(name.trim()) || "".equals(supplier.trim()) || "".equals(price.trim())) {
        JOptionPane.showMessageDialog(null, "Data cannot be empty, please fill in the empty data.");
        return;
    }
    
    for (Supplier supplier:suppliers){
        if (supplier.getName().equals(selectedSupplier)){
            supplierID = supplier.getID();
        }
    }
    Item selectedItem = null;
    for (Item item : items) {
        if (item.getID().equals(id)) {
            selectedItem = item;
            break; // Exit the loop once a match is found
        }
    }
    selectedItem.setName(name);
    selectedItem.setSupplierID(supplierID);
    selectedItem.setSupplierName(supplier);
    selectedItem.setPrice(Double.parseDouble(price));
    
    model.setValueAt(name, selectedRow, 1);
    model.setValueAt(supplierID, selectedRow, 3);
    model.setValueAt(supplier, selectedRow, 4);
    model.setValueAt(price, selectedRow, 2);
    
    saveItemsToFile();
    JOptionPane.showMessageDialog(null, "Successfully updated.");
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    model = (DefaultTableModel) table.getModel();
    int row = table.getSelectedRow();
    
    if (row == -1) {
        JOptionPane.showMessageDialog(null, "No rows selected for deletion.");
        return;
    }
    
    // Get the ID of the selected supplier
    String id = table.getValueAt(row, 0).toString();
    
    // Remove the Item from the list
    deleteItem(id);
    
    // Remove the row from the table
    model.removeRow(row);

    clearFields();
    
    JOptionPane.showMessageDialog(null, "Successfully deleted.");
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void supplierDropboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDropboxActionPerformed
        selectedSupplier = (String) supplierDropbox.getSelectedItem();
    }//GEN-LAST:event_supplierDropboxActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        model = (DefaultTableModel)table.getModel();
        
        name = model.getValueAt(table.getSelectedRow(),1).toString();
        supplier = model.getValueAt(table.getSelectedRow(),4).toString();
        price = model.getValueAt(table.getSelectedRow(),2).toString();
        
        itemNameText.setText(name);
        supplierDropbox.setSelectedItem(supplier);
        priceText.setText(price);
    }//GEN-LAST:event_tableMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String search = searchText.getText(); // Get the search text from the "searchText" field
        performSearch(search);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void priceTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceTextKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            evt.consume();
        }
    }//GEN-LAST:event_priceTextKeyTyped

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
            java.util.logging.Logger.getLogger(ItemsManagementApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemsManagementApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemsManagementApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemsManagementApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemsManagementApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField itemNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceText;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JComboBox<String> selection;
    private javax.swing.JComboBox<String> supplierDropbox;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
