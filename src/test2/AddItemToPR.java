/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test2;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class AddItemToPR extends javax.swing.JFrame {
    private PurchaseRequisitionService service1;
    private PurchaseRequisitionService service2;

    /**
     * Creates new form AddItemToPR
     */
    public AddItemToPR() {
        initComponents();
        service1 = new PurchaseRequisitionService("Items.txt");
        service2 = new PurchaseRequisitionService("purchase_requisition.txt");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        showTable();
    }
    
    public void showTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        ArrayList<PurchaseRequisition> requisitions = service1.getAllRequisitionsfromitem();
        for (PurchaseRequisition pr : requisitions) {
            model.addRow(new Object[]{pr.getItemCode(), pr.getItemName(), pr.getPricePerItem(), pr.getSupplierID(), pr.getSupplierName()});
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblItemID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblItemName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblPrice = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblComID = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblComName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFQuantity = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Please select the items that you want to purchase");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Price Per Item", "Company ID", "Company Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Item ID:");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblItemID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblItemID.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblItemID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Item Name:");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblItemName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblItemName.setText("Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Price Per Item:");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPrice.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPrice.setText("Price");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Company ID:");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblComID.setBackground(new java.awt.Color(255, 255, 255));
        lblComID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblComID.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComID, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Company Name:");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblComName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblComName.setText("Name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComName, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Quantity:");

        TFQuantity.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TFQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFQuantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFQuantityFocusLost(evt);
            }
        });
        TFQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFQuantityActionPerformed(evt);
            }
        });

        btnadd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(109, 109, 109)))
                .addGap(1023, 1023, 1023))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFQuantity))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        String ItemID = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
        String ItemName = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String Price = tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
        String ComID = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        String ComName = tblModel.getValueAt(jTable1.getSelectedRow(),4).toString();

        lblItemID.setText(ItemID);
        lblItemName.setText(ItemName);
        lblPrice.setText(Price);
        lblComID.setText(ComID);
        lblComName.setText(ComName);
    }//GEN-LAST:event_jTable1MouseClicked

    private void TFQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFQuantityFocusGained
        // TODO add your handling code here:
        if(TFQuantity.getText().equals("Enter Quantity"))
        {
            TFQuantity.setText("");
            TFQuantity.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TFQuantityFocusGained

    private void TFQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFQuantityFocusLost
        // TODO add your handling code here:
        if(TFQuantity.getText().equals(""))
        {
            TFQuantity.setText("Enter Quantity");
            TFQuantity.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_TFQuantityFocusLost

    private void TFQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFQuantityActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       try {
            // TODO add your handling code here:


      if ((!(lblItemID.getText().equals("ID"))) && isInteger(TFQuantity.getText()) ){
                String itemid = lblItemID.getText();
                String itemname = lblItemName.getText();
                double price = Double.parseDouble(lblPrice.getText());
                int quantity = Integer.parseInt(TFQuantity.getText());
                String comid = lblComID.getText();
                String comname = lblComName.getText();
                double totalPrice = price * quantity;
                String entry = itemid + "/" + itemname + "/" + price + "/" + quantity + "/" + totalPrice + "/" + comid + "/" + comname ;
                boolean itemExists = false;
                //String c = lblItemID.getText()+"/"+lblItemName.getText()+"/"+lblPrice.getText()+"/"+jTextField1.getText()+"/"+lblPrice.getText();
               fileclass po = new fileclass("purchase_requisition.txt");
               ArrayList<String> a = po.readData();
               for(int i = 0; i<a.size(); i++){
                   String[] parts = a.get(i).split("/");
                   if(parts.length>=5 && parts[0].equals(itemid)){
                       int oldQuantity = Integer.parseInt(parts[3]);
                       int newQuantity = oldQuantity + quantity;
                       double newTotalPrice = price * newQuantity;
                       a.set(i, itemid + "/" + itemname + "/" + price + "/" + newQuantity + "/" + newTotalPrice+ "/" + comid + "/" + comname);
                       itemExists = true;
                       break;
                   }
               }
               
               if(!itemExists){
                   add(entry);
               }else{
                   po.writeData(a);
               }
                
                JOptionPane.showMessageDialog(null, "Success, "+itemname+" with "+quantity+" quantity have added to purchase requisition successfully" ,"Success", JOptionPane.INFORMATION_MESSAGE);
                TFQuantity.setText("");
                lblItemID.setText("");
                lblItemName.setText("");
                lblPrice.setText("");
                lblComID.setText("");
                lblComName.setText("");
                jTable1.clearSelection();
            }
            else{
                lblItemID.setText("");
                lblItemName.setText("");
                lblPrice.setText("");
                lblComID.setText("");
                lblComName.setText("");
                jTable1.clearSelection();
                JOptionPane.showMessageDialog(null, "Please Select a Row or Insert The Quantity With Numbers!","Error", JOptionPane.ERROR_MESSAGE);
            }
            
        
        } catch (IOException ex) {
            Logger.getLogger(AddItemToPR.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
        
        
        /* 
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRow()>=0){
            String itemid = lblItemID.getText();
            String itemname = lblItemName.getText();
            double price = Double.parseDouble(lblPrice.getText());
            int quantity = Integer.parseInt(TFQuantity.getText());
            String companyid = lblComID.getText();
            String companyname = lblComName.getText();
            
            
            boolean itemExists = false;
            for (int i = 0;i<model.getRowCount(); i++){
                if ((!(lblItemID.getText().equals("ID"))) && isInteger(TFQuantity.getText()) ){
                    double totalPrice = price * quantity;
                    int oldQuantity = Integer.parseInt(model.getValueAt(i, 3).toString());
                    int totalQuantity = oldQuantity +quantity;
                    double newPrice = totalQuantity * price;
                    model.setValueAt(totalQuantity, i, 3);
                    String PRItemID = model.getValueAt(i,0).toString();
                    PurchaseRequisition entry = new PurchaseRequisition(itemid,itemname,(int)price,totalQuantity,companyid,companyname);
                    ArrayList<PurchaseRequisition> requisitions = service2.getAllRequisitions();
                    for (int a = 0 ; i < requisitions.size();a++){
                        String newPRItemID = requisitions.get(i).toString();
                        if (itemid.equals(newPRItemID) ){
                            service2.addRequisition(entry);
                            service2.deleteRequisition(itemid,String.valueOf(quantity));   
                        }
                        itemExists = true;
                        JOptionPane.showMessageDialog(this,"Success");
                        break;
                    }  
                }
            }
            
            if(!itemExists){
                PurchaseRequisition entry1 = new PurchaseRequisition(itemid,itemname, (int)price, quantity,companyid,companyname);
                service2.addRequisition(entry1);
                JOptionPane.showMessageDialog(this,"Success");
            }else{
                if(jTable1.getSelectedRow()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty");
            }else{
                JOptionPane.showMessageDialog(this,"Please Select Single Row To Delete");
            }
            }
        }
        try {
            

        if ((!(lblItemID.getText().equals("ID"))) && isInteger(TFQuantity.getText()) ){
            String itemid = lblItemID.getText();
            String itemname = lblItemName.getText();
            double price = Double.parseDouble(lblPrice.getText());
            int quantity = Integer.parseInt(TFQuantity.getText());
            double totalPrice = price * quantity;
            PurchaseRequisition entry = new PurchaseRequisition(itemid ,itemname , (int)price, quantity);
            boolean itemExists = false;
            PurchaseRequisitionService service = new PurchaseRequisitionService("purchase_requisition.txt");
            ArrayList<PurchaseRequisition> a = service.getAllRequisitions();
            for(int i = 0; i<a.size(); i++){
                String[] parts = a.get(i).split("/");
                if(parts.length>=5 && parts[0].equals(itemid)){
                    int oldQuantity = Integer.parseInt(parts[3]);
                    int newQuantity = oldQuantity + quantity;
                    double newTotalPrice = price * newQuantity;
                    a.set(i, itemid + "/" + itemname + "/" + price + "/" + newQuantity + "/" + newTotalPrice);
                    itemExists = true;
                    break;
                }
            }

            
            if(!itemExists){
                service.addRequisition(entry);
            }else{
                po.writeData(a);
            }

            JOptionPane.showMessageDialog(null, "Success, "+itemname+" with "+quantity+" quantity have added to purchase requisition successfully" ,"Success", JOptionPane.INFORMATION_MESSAGE);
            TFQuantity.setText("");
            lblItemID.setText("");
            lblItemName.setText("");
            lblPrice.setText("");
            lblComID.setText("");
            lblComName.setText("");
            jTable1.clearSelection();
        }
        else{
            lblItemID.setText("");
            lblItemName.setText("");
            lblPrice.setText("");
            lblComID.setText("");
            lblComName.setText("");
            jTable1.clearSelection();
            JOptionPane.showMessageDialog(null, "Please Select a Row or Insert The Quantity With Numbers!","Error", JOptionPane.ERROR_MESSAGE);
        }

        } catch (IOException ex) {
            Logger.getLogger(add_pr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaddActionPerformed
*/
    private boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
        
    }
    
    private void add(String b) throws IOException{
        fileclass po = new fileclass("purchase_requisition.txt");
        ArrayList<String> a = po.readData();
        a.add(b);
        po.writeData(a);
    }
    
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        PurchaseRequisitionPage pr = new PurchaseRequisitionPage();
        pr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(AddItemToPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItemToPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItemToPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItemToPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItemToPR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFQuantity;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblComID;
    private javax.swing.JLabel lblComName;
    private javax.swing.JLabel lblItemID;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblPrice;
    // End of variables declaration//GEN-END:variables
}
