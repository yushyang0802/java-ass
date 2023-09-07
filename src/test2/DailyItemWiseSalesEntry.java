/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class DailyItemWiseSalesEntry extends javax.swing.JFrame {
    private final DefaultTableModel model = new DefaultTableModel();
    private final DefaultTableModel originalModel;
    private final String[] columnsName = {"Date","ItemID","Item","Supplier ID","Supplier Name","Quantity","Total Sales"};
    private int row =- 1;
   

    /**
     * Creates new form DailyItemWiseSalesEntry1
     */
    public DailyItemWiseSalesEntry() {
        initComponents();
        model.setColumnIdentifiers(columnsName);
        originalModel = (DefaultTableModel) jTable1.getModel();
        loadDataFromSalesEntryFile();
    }
    
    private void loadDataFromSalesEntryFile() {
        ArrayList<SalesEntry> salesEntries = SalesEntry.readSalesEntriesFromFile("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\salesentry.txt");

        for (SalesEntry entry : salesEntries) {
            Object[] row = {entry.getDate(), entry.getID(), entry.getName(), entry.getSupplierID(), entry.getSupplierName(), entry.getQuantity(), entry.getTotalSales()};
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DateTextField = new javax.swing.JTextField();
        ItemIDTextField = new javax.swing.JTextField();
        ItemNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        QuantityTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SearchByDateTextField = new javax.swing.JTextField();
        AddSalesEntryButton = new javax.swing.JButton();
        DeleteSalesEntryButton = new javax.swing.JButton();
        EditSalesEntryButton = new javax.swing.JButton();
        SearchByDateButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        BacktoMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setText("Daily Item Wise Sales Entry");

        jTable1.setModel(model);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel2.setText("Date:");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel3.setText("Item ID:");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel4.setText("Item Name:");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel6.setText("Search By Date:");

        AddSalesEntryButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        AddSalesEntryButton.setText("ADD");
        AddSalesEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSalesEntryButtonActionPerformed(evt);
            }
        });

        DeleteSalesEntryButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        DeleteSalesEntryButton.setText("DELETE");
        DeleteSalesEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSalesEntryButtonActionPerformed(evt);
            }
        });

        EditSalesEntryButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        EditSalesEntryButton.setText("EDIT");
        EditSalesEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSalesEntryButtonActionPerformed(evt);
            }
        });

        SearchByDateButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        SearchByDateButton.setText("Search");
        SearchByDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByDateButtonActionPerformed(evt);
            }
        });

        ResetButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        BacktoMenuButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        BacktoMenuButton.setText("Back");
        BacktoMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BacktoMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateTextField)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(ItemIDTextField)
                    .addComponent(ItemNameTextField)
                    .addComponent(jLabel5)
                    .addComponent(QuantityTextField)
                    .addComponent(AddSalesEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteSalesEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditSalesEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchByDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(SearchByDateButton)
                        .addGap(18, 18, 18)
                        .addComponent(ResetButton)))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(BacktoMenuButton)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ItemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(AddSalesEntryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteSalesEntryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditSalesEntryButton)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BacktoMenuButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(SearchByDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchByDateButton)
                    .addComponent(ResetButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddSalesEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSalesEntryButtonActionPerformed
        String datetext = DateTextField.getText();
        String itemid = ItemIDTextField.getText();
        String itemname = ItemNameTextField.getText();
        String quantityText = QuantityTextField.getText();
        
        try {
        LocalDate date = LocalDate.parse(datetext); // Parse the date from the text field

        // Validate the date
        if (date.isAfter(LocalDate.now())) {
            // Show an error message for future dates
            JOptionPane.showMessageDialog(this, "Invalid date. Date cannot be in the future.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Validate the quantity
            if (SalesEntry.isValidQuantity(quantityText)) {
                int quantity = Integer.parseInt(quantityText); // Parse quantity as an integer

                // Read and validate the item information from "item.txt"
                boolean itemValid = false;
                try (BufferedReader br = new BufferedReader(new FileReader("Items.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] parts = line.split(",");
                        String itemFromFileId = parts[0].trim();
                        String itemFromFileName = parts[1].trim();
                        String supplierID = parts[3].trim();
                        String supplierName = parts[4].trim();
                        double price = Double.parseDouble(parts[2].trim());

                        if (itemFromFileId.equals(itemid) && itemFromFileName.equals(itemname)) {
                            itemValid = true;
                            // Create a SalesEntry object
                            SalesEntry salesEntry = new SalesEntry(itemid, itemname, supplierID, supplierName, date, quantity);
                            
                            double totalSales = salesEntry.getTotalSales();

                            // Add the sales entry to the table model
                            Object[] row = { date, itemid, itemname, supplierID, supplierName, quantity, totalSales };
                            model.addRow(row);

                            // Save the sales entry information to "salesentry.txt"
                            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\salesentry.txt", true))) {
                                String entryLine = date + "," + itemid + "," + itemname + "," + supplierID + "," + supplierName + "," + quantity + "," + salesEntry.getTotalSales();
                                writer.write(entryLine);
                                writer.newLine(); // Add a newline character to separate entries
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            // Clear the input fields
                            DateTextField.setText("");
                            ItemIDTextField.setText("");
                            ItemNameTextField.setText("");
                            QuantityTextField.setText("");

                            break; // Stop searching once a valid item is found
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (!itemValid) {
                    // Show an error message if the item information is not valid
                    JOptionPane.showMessageDialog(this, "Invalid item ID or item name.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Show an error message for invalid quantity
                JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (DateTimeParseException e) {
        // Handle parsing errors (invalid date format)
        JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_AddSalesEntryButtonActionPerformed

    private void DeleteSalesEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSalesEntryButtonActionPerformed
        if (row != -1) {
            // Get the data of the selected row
            String date = String.valueOf(model.getValueAt(row, 0));
            String itemid = String.valueOf(model.getValueAt(row, 1));
            String itemName = String.valueOf(model.getValueAt(row, 2));
            String supplierID = String.valueOf(model.getValueAt(row, 3));
            String supplierName = String.valueOf(model.getValueAt(row, 4));
            String quantity = String.valueOf(model.getValueAt(row, 5));

            // Create a SalesEntry object to represent the selected row
            SalesEntry deletedEntry = new SalesEntry(itemid, itemName, supplierID, supplierName, LocalDate.parse(date), Integer.parseInt(quantity));

            // Remove the selected row from the table model
            model.removeRow(row);

            // Update the "salesentry.txt" file by removing the deleted entry
            ArrayList<SalesEntry> salesEntries = SalesEntry.readSalesEntriesFromFile("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\salesentry.txt");
            salesEntries.remove(deletedEntry);
            SalesEntry.updateSalesEntryFile(salesEntries, "C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\salesentry.txt");

            // Clear the input fields
            DateTextField.setText("");
            ItemIDTextField.setText("");
            ItemNameTextField.setText("");
            QuantityTextField.setText("");

            row = -1; // Reset the selected row
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteSalesEntryButtonActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        row = jTable1.getSelectedRow();
        
        String date = String.valueOf(model.getValueAt(row, 0));
        String itemid = String.valueOf(model.getValueAt(row, 1));
        String itemName = String.valueOf(model.getValueAt(row, 2));
        String quantity = String.valueOf(model.getValueAt(row, 5));
        
        
        DateTextField.setText(date);
        ItemIDTextField.setText(itemid);
        ItemNameTextField.setText(itemName);
        QuantityTextField.setText(quantity);
    }//GEN-LAST:event_jTable1MouseReleased

    private void EditSalesEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSalesEntryButtonActionPerformed
        // Check if a row is selected
        if (row != -1) {
            String datetext = DateTextField.getText();
            String itemid = ItemIDTextField.getText();
            String itemname = ItemNameTextField.getText();
            String quantityText = QuantityTextField.getText();

            try {
                LocalDate date = LocalDate.parse(datetext); // Parse the date from the text field

                // Validate the date
                if (date.isAfter(LocalDate.now())) {
                    // Show an error message for future dates
                    JOptionPane.showMessageDialog(this, "Invalid date. Date cannot be in the future.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Validate the quantity
                    if (SalesEntry.isValidQuantity(quantityText)) {
                        int quantity = Integer.parseInt(quantityText); // Parse quantity as an integer

                        // Read and validate the item information from "item.txt"
                        boolean itemValid = false;
                        try (BufferedReader br = new BufferedReader(new FileReader("Items.txt"))) {
                            String line;
                            while ((line = br.readLine()) != null) {
                                String[] parts = line.split(",");
                                String itemFromFileId = parts[0].trim();
                                String itemFromFileName = parts[1].trim();
                                String supplierID = parts[3].trim();
                                String supplierName = parts[4].trim();
                                double price = Double.parseDouble(parts[2].trim());

                                if (itemFromFileId.equals(itemid) && itemFromFileName.equals(itemname)) {
                                    itemValid = true;
                                    // Update the SalesEntry object for the selected row
                                    SalesEntry updatedEntry = new SalesEntry(itemid, itemname, supplierID, supplierName, date, quantity);

                                    double totalSales = updatedEntry.getTotalSales();

                                    // Update the table model with the edited data
                                    model.setValueAt(date, row, 0);
                                    model.setValueAt(itemid, row, 1);
                                    model.setValueAt(itemname, row, 2);
                                    model.setValueAt(supplierID, row, 3);
                                    model.setValueAt(supplierName, row, 4);
                                    model.setValueAt(quantity, row, 5);
                                    model.setValueAt(totalSales, row, 6);

                                    // Update the "salesentry.txt" file
                                    ArrayList<SalesEntry> salesEntries = SalesEntry.readSalesEntriesFromFile("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\salesentry.txt");
                                    salesEntries.set(row, updatedEntry);
                                    SalesEntry.updateSalesEntryFile(salesEntries, "C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\salesentry.txt");

                                    // Clear the input fields
                                    DateTextField.setText("");
                                    ItemIDTextField.setText("");
                                    ItemNameTextField.setText("");
                                    QuantityTextField.setText("");

                                    row = -1; // Reset the selected row
                                    break; // Stop searching once a valid item is found
                                }
                            }
                        } 
                        catch (IOException e) {
                            e.printStackTrace();
                        }

                        if (!itemValid) {
                            // Show an error message if the item information is not valid
                            JOptionPane.showMessageDialog(this, "Invalid item ID or item name.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } 
                    else {
                        // Show an error message for invalid quantity
                        JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } 
            catch (DateTimeParseException e) {
                // Handle parsing errors (invalid date format)
                JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        else {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EditSalesEntryButtonActionPerformed

    private void SearchByDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByDateButtonActionPerformed
        String searchDateText = SearchByDateTextField.getText();

        // Check if the search date is valid
        try {
            LocalDate searchDate = LocalDate.parse(searchDateText);

            // Create a filtered table model
            DefaultTableModel filteredModel = new DefaultTableModel();
            filteredModel.setColumnIdentifiers(columnsName);

            // Iterate through the current table model and filter entries by date
            for (int i = 0; i < model.getRowCount(); i++) {
                LocalDate entryDate = LocalDate.parse(model.getValueAt(i, 0).toString());
                if (entryDate.equals(searchDate)) {
                    Object[] row = {
                        model.getValueAt(i, 0), // Date
                        model.getValueAt(i, 1), // ItemID
                        model.getValueAt(i, 2), // ItemName
                        model.getValueAt(i, 3), // SupplierID
                        model.getValueAt(i, 4), // SupplierName
                        model.getValueAt(i, 5), // Quantity
                        model.getValueAt(i, 6), // Total Sales
                    };
                    filteredModel.addRow(row);
                }
            }

            // Set the filtered model to the table
            jTable1.setModel(filteredModel);
        } 
        catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SearchByDateButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // Replace the current table model with the copy to reset the table
        jTable1.setModel(originalModel);

        // Clear any search or filter fields if needed
        SearchByDateTextField.setText("");
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void BacktoMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BacktoMenuButtonActionPerformed
        this.dispose();
        SalesMenu salesmenu = new SalesMenu();
        salesmenu.setVisible(true);
    }//GEN-LAST:event_BacktoMenuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DailyItemWiseSalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DailyItemWiseSalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DailyItemWiseSalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailyItemWiseSalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DailyItemWiseSalesEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSalesEntryButton;
    private javax.swing.JButton BacktoMenuButton;
    private javax.swing.JTextField DateTextField;
    private javax.swing.JButton DeleteSalesEntryButton;
    private javax.swing.JButton EditSalesEntryButton;
    private javax.swing.JTextField ItemIDTextField;
    private javax.swing.JTextField ItemNameTextField;
    private javax.swing.JTextField QuantityTextField;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SearchByDateButton;
    private javax.swing.JTextField SearchByDateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
