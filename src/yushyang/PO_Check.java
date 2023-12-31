/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yushyang;

import yushyang.po;
import yushyang.display;
import yushyang.purchase_order;
import yushyang.poclass;
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
public class PO_Check extends javax.swing.JFrame {

    /**
     * Creates new form PO_Check
     */
    public PO_Check() {
        initComponents();
        showTable();
        pricecalculate();
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
        TFID = new javax.swing.JTextField();
        TFName = new javax.swing.JTextField();
        TFQuantity = new javax.swing.JTextField();
        btnmodify = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TFPPI = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Final Check of Purchase Order");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Price Per Item(RM)", "Quantity", "Prize(RM)"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Item ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Item Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Quantity:");

        TFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFIDActionPerformed(evt);
            }
        });

        btnmodify.setText("Modify");
        btnmodify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifyActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Price Per Item:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Price(RM)"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFQuantity)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFID)
                            .addComponent(TFName)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFPPI, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btnmodify, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(TFID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFPPI, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnmodify, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showTable(){
                poclass po = new poclass("C:\\Users\\Asus\\OneDrive\\Desktop\\yushyang\\OODJ\\purchase_order.txt");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        try {
            model.setRowCount(0);
            ArrayList<String> as = po.readData();
            for(int i = 1; i< as.size();i++)
            {
            String line = as.get(i);
            String[] dataRow =line.split("/");
            model.addRow(dataRow);
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(purchase_order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void pricecalculate(){
        poclass po = new poclass("C:\\Users\\Asus\\OneDrive\\Desktop\\yushyang\\OODJ\\purchase_order.txt");
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        try {
            ArrayList<String> as = po.readData();
        double totalPrice = 0.00;
        
        for (int i = 1; i < as.size(); i++) {
            String line = as.get(i);
            String[] dataRow = line.split("/");
            String priceString = dataRow[4];
            double price = Double.parseDouble(priceString);
            totalPrice += price; 
        }
        model.setRowCount(0);
        model.addRow(new Object[]{totalPrice});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void TFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFIDActionPerformed

    private void btnmodifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifyActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRow()>=0){
            String ItemID = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
            String ItemName = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
            String Quantity = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
            try {
                delete(ItemID,Quantity);
            } catch (IOException ex) {
                Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);
            }
            tblModel.removeRow(jTable1.getSelectedRow()); 
            
            String NewItemID = TFID.getText();
            String NewItemName = TFName.getText();
            double NewPriceperitem = Double.parseDouble(TFPPI.getText());
            int NewQuantity = Integer.parseInt(TFQuantity.getText());
            double NewPrice = NewPriceperitem * NewQuantity;
            String entry = NewItemID + "/" + NewItemName + "/" + NewPriceperitem + "/" + NewQuantity + "/" + NewPrice;
            try {
                add(entry);
            } catch (IOException ex) {
                Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);
            }
            tblModel.addRow(new Object[]{NewItemID, NewItemName, NewPriceperitem, NewQuantity, NewPrice});
            pricecalculate();
            JOptionPane.showMessageDialog(this," Success Modify"); 
            
        }
        else{

            JOptionPane.showMessageDialog(this,"Table is Empty");
            JOptionPane.showMessageDialog(this,"Please Select Single Row To Delete");
            
        }
        TFID.setText("");
        TFName.setText("");
        TFPPI.setText("");
        TFQuantity.setText("");
    }//GEN-LAST:event_btnmodifyActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        po po = new po();
        po.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        String ID = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
        String Name = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String Quantity = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        String PricePerItem = tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
        
        TFID.setText(ID);
        TFName.setText(Name);
        TFQuantity.setText(Quantity);
        TFPPI.setText(PricePerItem);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        if(jTable1.getSelectedRow()>=1){
            String ItemID = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
            String ItemName = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
            String Quantity = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
            try {
                delete(ItemID,Quantity);
            } catch (IOException ex) {
                Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);
            }
            tblModel.removeRow(jTable1.getSelectedRow()); 
            pricecalculate();
            JOptionPane.showMessageDialog(this," You have deleted"+ItemName); 
            
        }
        else{
            if(jTable1.getSelectedRow()==0){
                JOptionPane.showMessageDialog(null,"Table is Empty","Error", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Please Select Single Row To Delete","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        TFID.setText("");
        TFName.setText("");
        TFPPI.setText("");
        TFQuantity.setText("");
    }//GEN-LAST:event_btndeleteActionPerformed

    private void add(String b) throws IOException{
        poclass po = new poclass("C:\\Users\\Asus\\OneDrive\\Desktop\\yushyang\\OODJ\\purchase_order.txt");
        ArrayList<String> a = po.readData();
        a.add(b);
        po.writeData(a);
    }
    
    private void delete(String itemID, String Quantity) throws IOException {
    poclass po = new poclass("C:\\Users\\Asus\\OneDrive\\Desktop\\yushyang\\OODJ\\purchase_order.txt");
    ArrayList<String> a = po.readData();
    
    for (int i = 0; i < a.size(); i++) {
        String line = a.get(i);
        String[] parts = line.split("/");
        if (parts.length >= 2 && parts[0].equals(itemID) && parts[3].equals(Quantity)) {
            a.remove(i);
            break;
        }
    }
    
        po.writeData(a);
    }
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
            java.util.logging.Logger.getLogger(PO_Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PO_Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PO_Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PO_Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PO_Check().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFID;
    private javax.swing.JTextField TFName;
    private javax.swing.JTextField TFPPI;
    private javax.swing.JTextField TFQuantity;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnmodify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
