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
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class DailyItemWiseSalesEntry extends javax.swing.JFrame {
    private final DefaultTableModel model = new DefaultTableModel();
    private final String[] columnsName = {"Date","ItemID","Item","Quantity","Total Sales"};
    private int row =- 1;
    /**
     * Creates new form DailyItemWiseSalesEntry
     */
    public DailyItemWiseSalesEntry() {
        initComponents();
        model.setColumnIdentifiers(columnsName);
        loadAllSalesData("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\sales.txt");
    }
    
    private void loadAllSalesData(String file_name) {
         // Clear existing table data
        model.setRowCount(0);

        try (FileReader fr = new FileReader(file_name);
             BufferedReader br = new BufferedReader(fr)) {

            String record;
            while ((record = br.readLine()) != null) {
                String[] data = record.split(",");

                // Check if 'data' has at least 4 elements (0-based indexing)
                if (data.length >= 4) {
                    String date = data[0];
                    String itemid = data[1];
                    String itemName = data[2];
                    int itemQuantity = Integer.parseInt(data[3]);

                    // Calculate total sales using the item price from item.txt
                    double itemPrice = getItemPriceFromItemFile(itemName);
                    double totalSales = itemQuantity * itemPrice;

                    // Add the data to the table
                    String[] rowData = {date, itemid, itemName, String.valueOf(itemQuantity), String.valueOf(totalSales)};
                    model.addRow(rowData);
                } else {
                    // Handle cases where 'data' doesn't have enough elements (invalid data format)
                    System.err.println("Invalid data format: " + Arrays.toString(data));
                    // You may choose to skip or log the invalid data here
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while loading sales data from 'sales.txt'");
        }
    }
     
     private void loadSalesDataByDate(String file_name, String searchDate) {
        // Clear existing table data
        model.setRowCount(0);

        try (FileReader fr = new FileReader(file_name);
             BufferedReader br = new BufferedReader(fr)) {
            
            String record;
            while ((record = br.readLine()) != null) {
                String[] data = record.split(",");
                String date = data[0];
                
                // Check if the date matches the search date
                if (date.equals(searchDate)) {
                    String itemid = data[1];
                    String itemName = data[2];
                    int itemQuantity = Integer.parseInt(data[3]);

                    // Calculate total sales using the item price from item.txt
                    double itemPrice = getItemPriceFromItemFile(itemName);
                    double totalSales = itemQuantity * itemPrice;

                    // Add the data to the table
                    String[] rowData = {date, itemid, itemName, String.valueOf(itemQuantity), String.valueOf(totalSales)};
                    model.addRow(rowData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while loading sales data from 'sales.txt'");
        }
    }
     
    private double getItemPriceFromItemFile(String itemName) {
        try (FileReader fr = new FileReader("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\item.txt");
         BufferedReader br = new BufferedReader(fr)) {

        String record;
        while ((record = br.readLine()) != null) {
            String[] line = record.split(",");
            if (itemName.equals(line[1])) {
                // Found the item, return its price as a double
                return Double.parseDouble(line[2]);
            }
        }

        } 
        catch (IOException e) {
        JOptionPane.showMessageDialog(null, "An error occurred while reading item data.");
        }

        
        return -1; 
    }
    
    private void deleteSalesEntryFromFile(String file_name, String date, String itemid, String itemName, int quantity) {
        ArrayList<String> lines = new ArrayList<>();

        try (FileReader fr = new FileReader(file_name);
             BufferedReader br = new BufferedReader(fr)) {

            String record;
            while ((record = br.readLine()) != null) {
                String[] data = record.split(",");
                String salesDate = data[0];
                String salesItemID = data[1];
                String salesItemName = data[2];
                int salesQuantity = Integer.parseInt(data[3]);

                if (!date.equals(salesDate) || !itemid.equals(salesItemID) || !itemName.equals(salesItemName) || quantity != salesQuantity) {
                    lines.add(record); // Keep lines that should not be deleted
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while reading sales data.");
        }

        try (FileWriter fw = new FileWriter(file_name);
             PrintWriter pw = new PrintWriter(fw)) {

            for (String line : lines) {
                pw.println(line); // Write back the lines that should not be deleted
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while deleting sales data from 'sales.txt'");
        }
    }
    
    private boolean validateItem(String itemid, String itemName) {
        try (FileReader fr = new FileReader("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\item.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String record;
            while ((record = br.readLine()) != null) {
                String[] line = record.split(",");
                if (itemid.equals(line[0]) && itemName.equals(line[1])) {
                    return true; // Item ID and item name match an entry in item.txt
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while reading item data.");
    }

    return false; // Item ID and item name do not match any entry in item.txt
}
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DailyItemWiseLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        ItemNameLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        DateTextField = new javax.swing.JTextField();
        ItemNameTextField = new javax.swing.JTextField();
        QuantityTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        SearchByDateButton = new javax.swing.JButton();
        BackToMenuButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ItemIDTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DailyItemWiseLabel.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        DailyItemWiseLabel.setText("Daily Item-Wise Sales Entry");

        DateLabel.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        DateLabel.setText("Date:");

        ItemNameLabel.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        ItemNameLabel.setText("Item Name: ");

        QuantityLabel.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        QuantityLabel.setText("Quantity:");

        jTable1.setModel(model);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        AddButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        AddButton.setText("ADD");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        EditButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        EditButton.setText("EDIT");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel1.setText("Search by Date:");

        SearchByDateButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        SearchByDateButton.setText("Search");
        SearchByDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByDateButtonActionPerformed(evt);
            }
        });

        BackToMenuButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        BackToMenuButton.setText("Back");
        BackToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Item ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QuantityTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ItemNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemNameLabel)
                            .addComponent(DateLabel)
                            .addComponent(QuantityLabel)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteButton)
                            .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(ItemIDTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchByDateButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DailyItemWiseLabel)
                .addGap(43, 43, 43)
                .addComponent(BackToMenuButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(DateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(ItemIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ItemNameLabel)
                .addGap(18, 18, 18)
                .addComponent(ItemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QuantityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditButton)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DailyItemWiseLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackToMenuButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchByDateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
    String dateText = DateTextField.getText();
    String itemid = ItemIDTextField.getText();
    String itemName = ItemNameTextField.getText();
    String quantity = QuantityTextField.getText();

    // Validate date format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate date;
    try {
        date = LocalDate.parse(dateText, formatter);
    } catch (DateTimeParseException ex) {
        // Handle invalid date format
        JOptionPane.showMessageDialog(null, "Invalid date format. Please use yyyy-MM-dd format.");
        return;
    }

    // Validate item name (non-empty)
    if (itemName.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Item name cannot be empty.");
        return;
    }

    // Validate quantity (must be a positive integer)
    int itemQuantity;
    try {
        itemQuantity = Integer.parseInt(quantity);
        if (itemQuantity <= 0) {
            throw new NumberFormatException();
        }
    } 
    catch (NumberFormatException ex) {
        // Handle invalid quantity
        JOptionPane.showMessageDialog(null, "Quantity must be a positive integer.");
        return;
    }
    
    // Check if the item ID and corresponding item name exist in item.txt
    if (!validateItem(itemid, itemName)) {
        JOptionPane.showMessageDialog(null, "Invalid item ID or item name.");
        return;
    }

    ArrayList<Item> items = readItemsFromFile("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\item.txt");
        boolean itemExists = false; // Flag to check if the item name exists in the file
        double totalSales = 0.0;

        for (Item item : items) {
            if (itemName.equals(item.getItemName())) {
                itemExists = true; // Item name found in the file
                totalSales = itemQuantity * item.getPrice(); // Calculate total sales
                model.addRow(new Object[]{date.toString(), itemid, itemName, itemQuantity, totalSales});
                break; // No need to continue checking once the item is found
            }
        }

        if (!itemExists) {
            JOptionPane.showMessageDialog(null, "Item name does not exist.");
        } else {
            // Save the sales data to "sales.txt"
            saveSalesToFile("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\sales.txt", date, itemid, itemName, itemQuantity, totalSales);
            JOptionPane.showMessageDialog(null, "Sales added succesfully");
        }

        // Clear the input fields
        DateTextField.setText("");
        ItemNameTextField.setText("");
        QuantityTextField.setText("");
    }

    private void saveSalesToFile(String file_name, LocalDate date, String itemid, String itemName, int itemQuantity, double totalSales) {
        try (FileWriter fw = new FileWriter(file_name, true);
             PrintWriter pw = new PrintWriter(fw)) {

            String salesRecord = date.toString() + "," + itemid + "," + itemName + "," + itemQuantity + "," + totalSales;
            pw.println(salesRecord);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the error
            JOptionPane.showMessageDialog(null, "An error occurred while saving sales data to 'sales.txt'");
        }
    }

    private ArrayList<Item> readItemsFromFile(String file_name) {
        ArrayList<Item> items = new ArrayList<>();

        try (FileReader fr = new FileReader(file_name);
             BufferedReader br = new BufferedReader(fr)) {

            String record;
            while ((record = br.readLine()) != null) {
                String[] line = record.split(",");
                String itemid = line[0];
                String itemName = line[1];
                double itemPrice = Double.parseDouble(line[2]);
                Item item = new Item(itemid, itemName, itemPrice);
                items.add(item);
            }

        } 
        catch (IOException e) {
            e.printStackTrace();
            // Handle the error
        }
    
    return items;
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // Check if a row is selected
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
            return;
        }

        // Get data from the selected row
        String date = String.valueOf(model.getValueAt(row, 0));
        String itemid = String.valueOf(model.getValueAt(row, 1));
        String itemName = String.valueOf(model.getValueAt(row, 2));
        String quantity = String.valueOf(model.getValueAt(row, 3));

        // Remove the selected row from the table
        model.removeRow(row);

        // Delete the corresponding sales entry from the file
        deleteSalesEntryFromFile("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\sales.txt", date, itemid, itemName, Integer.parseInt(quantity));

        // Clear the input fields and reset the selected row
        DateTextField.setText("");
        ItemIDTextField.setText("");
        ItemNameTextField.setText("");
        QuantityTextField.setText("");
        row = -1; // Reset the selected row

        JOptionPane.showMessageDialog(null, "Sales entry deleted successfully.");
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        row = jTable1.getSelectedRow();
        
        String date = String.valueOf(model.getValueAt(row, 0));
        String itemid = String.valueOf(model.getValueAt(row, 1));
        String itemName = String.valueOf(model.getValueAt(row, 2));
        String quantity = String.valueOf(model.getValueAt(row, 3));
        
        
        DateTextField.setText(date);
        ItemIDTextField.setText(itemid);
        ItemNameTextField.setText(itemName);
        QuantityTextField.setText(quantity);
        
    }//GEN-LAST:event_jTable1MouseReleased

    private void SearchByDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByDateButtonActionPerformed
        String searchDate = jTextField1.getText();
    
        // Validate the date format (optional)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(searchDate, formatter);
        } 
        catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Invalid date format. Please use yyyy-MM-dd format.");
            return;
        }

        // Load sales data by the entered date
        loadSalesDataByDate("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\sales.txt", searchDate);
    }//GEN-LAST:event_SearchByDateButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // Check if a row is selected
            if (row == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to edit.");
            return;
        }

        // Add bounds checking here to ensure row is valid
        if (row >= 0 && row < model.getRowCount()) {
            String dateText = DateTextField.getText();
            String itemid = ItemIDTextField.getText();
            String itemName = ItemNameTextField.getText();
            String quantity = QuantityTextField.getText();

            // Validate date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date;
            try {
                date = LocalDate.parse(dateText, formatter);
            } catch (DateTimeParseException ex) {
                // Handle invalid date format
                JOptionPane.showMessageDialog(null, "Invalid date format. Please use yyyy-MM-dd format.");
                return;
            }

            // Validate item name (non-empty)
            if (itemName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Item name cannot be empty.");
                return;
            }

            // Validate quantity (must be a positive integer)
            int itemQuantity;
            try {
                itemQuantity = Integer.parseInt(quantity);
                if (itemQuantity <= 0) {
                    throw new NumberFormatException();
                }
            } 
            catch (NumberFormatException ex) {
                // Handle invalid quantity
                JOptionPane.showMessageDialog(null, "Quantity must be a positive integer.");
                return;
            }
            
            if (!validateItem(itemid, itemName)) {
                JOptionPane.showMessageDialog(null, "Invalid item ID or item name.");
                return;
            }

            // Load the item price from the item.txt file
            double itemPrice = getItemPriceFromItemFile(itemName);

            // Calculate total sales
            double totalSales = itemQuantity * itemPrice;

            // Update the data for the selected row in the model
            model.setValueAt(date.toString(), row, 0);
            model.setValueAt(itemid, row, 1);
            model.setValueAt(itemName, row, 2);
            model.setValueAt(itemQuantity, row, 3);
            model.setValueAt(totalSales, row, 4);

            // Load all sales data from the file
            ArrayList<String> lines = new ArrayList<>();

            try (FileReader fr = new FileReader("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\sales.txt");
                 BufferedReader br = new BufferedReader(fr)) {

                String record;
                while ((record = br.readLine()) != null) {
                    lines.add(record);
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred while loading sales data from 'sales.txt'");
                return;
            }

            // Update the data for the selected row in the list
            String editedSalesRecord = date.toString() + ","+ itemid + "," + itemName + "," + itemQuantity + "," + totalSales;
            lines.set(row, editedSalesRecord);

            // Write the updated list back to the file
            try (FileWriter fw = new FileWriter("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\sales.txt");
                 BufferedWriter bw = new BufferedWriter(fw)) {

                for (String line : lines) {
                    bw.write(line);
                    bw.newLine();
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred while saving updated sales data to 'sales.txt'");
                return;
            }

            // Refresh the table with the updated data
            loadAllSalesData("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\sales.txt");

            // Clear the input fields
            DateTextField.setText("");
            ItemIDTextField.setText("");
            ItemNameTextField.setText("");
            QuantityTextField.setText("");

            // Reset the selected row
            row = -1;

            JOptionPane.showMessageDialog(null, "Sales entry updated successfully.");
        } else {
            // Handle the case where the selected row is invalid
            JOptionPane.showMessageDialog(null, "Please select a valid row to edit.");
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void BackToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuButtonActionPerformed
        this.dispose();
        SalesMenu salesMenu = new SalesMenu();
        salesMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuButtonActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DailyItemWiseSalesEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackToMenuButton;
    private javax.swing.JLabel DailyItemWiseLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JTextField DateTextField;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField ItemIDTextField;
    private javax.swing.JLabel ItemNameLabel;
    private javax.swing.JTextField ItemNameTextField;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JTextField QuantityTextField;
    private javax.swing.JButton SearchByDateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
