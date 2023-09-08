
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






public class Item_Entry extends javax.swing.JFrame {
    String name,price,selectedSupplier,supplierID,supplier,itemID,itemName,supplierName;
    private ArrayList<Supplier> suppliers = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();
    private DefaultTableModel model;
    private File suppliersFile = new File("Suppliers.txt");
    private File itemsFile = new File("Items.txt");
    

    public Item_Entry() {
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
            Logger.getLogger(Supplier_Entry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Supplier_Entry.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Supplier_Entry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Supplier_Entry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void saveItemsToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(itemsFile))) {
            for (Item item : items) {
                bw.write(item.getID() + "," + item.getName()  + "," + item.getPrice() + "," + item.getSupplierID() + "," + item.getSupplierName());
                bw.newLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Supplier_Entry.class.getName()).log(Level.SEVERE, null, ex);
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
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
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
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SUPPLIER  ENTRY");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
        jLabel1.setText("Item Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Supplier");

        supplierDropbox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        supplierDropbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDropboxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Price Per Item");

        itemNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        priceText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        priceText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceTextKeyTyped(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        selection.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item ID", "Item Name" }));

        searchText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ITEM  ENTRY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(searchButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(supplierDropbox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17)
                                .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supplierDropbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            
        }else{
            
            for (Supplier supplier:suppliers){
                if (supplier.getName().equals(selectedSupplier)){
                    supplierID = supplier.getID();
                }
            }
            
            for (Item item: items){
                itemID = item.getID();
                itemName = item.getName();
                supplierName = item.getSupplierName();
                if(name.equals(itemName) && supplierName.equals((String) supplierDropbox.getSelectedItem())){
                    JOptionPane.showMessageDialog(null, "Supplier with this item name already exist.");
                    return;
                }
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
    
    for (Item item: items){
        itemID = item.getID();
        itemName = item.getName();
        supplierName = item.getSupplierName();
        if(name.equals(itemName) && supplierName.equals((String) supplierDropbox.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Supplier with this item name already exist.");
            return;
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
            java.util.logging.Logger.getLogger(Item_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item_Entry().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
