/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class PurchaseRequisitionDAO {
    private String filePath;

    public PurchaseRequisitionDAO(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<PurchaseRequisition> getAllRequisitions() throws IOException {
        ArrayList<PurchaseRequisition> requisitions = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("/");
            if (parts.length == 7) {
                String itemCode = parts[0];
                String itemName = parts[1];
                int PricePerItem = Integer.parseInt(parts[2]);
                int quantity = Integer.parseInt(parts[3]);

                PurchaseRequisition pr = new PurchaseRequisition(itemCode, itemName, PricePerItem, quantity);
                requisitions.add(pr);
            }
        }
        br.close();
        return requisitions;
    }
    
    public ArrayList<PurchaseRequisition> getAllRequisitionsfromitem() throws IOException {
        ArrayList<PurchaseRequisition> requisitions = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("/");
            if (parts.length == 5) {
                String itemCode = parts[0];
                String itemName = parts[1];
                int PricePerItem = Integer.parseInt(parts[2]);
                String supplierID = parts[3];
                String supplierName = parts[4];

                PurchaseRequisition pr = new PurchaseRequisition(itemCode, itemName, PricePerItem, supplierID,supplierName);
                requisitions.add(pr);
            }
        }
        br.close();
        return requisitions;
    }
    
    
    
    public ArrayList<PurchaseRequisition> getAllRequisitionsfromitemtopr() throws IOException {
        ArrayList<PurchaseRequisition> requisitions = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("/");
            if (parts.length == 6) {
                String itemCode = parts[0];
                String itemName = parts[1];
                int PricePerItem = Integer.parseInt(parts[2]);
                int Quantity = Integer.parseInt(parts[3]);
                String supplierID = parts[4];
                String supplierName = parts[5];

                PurchaseRequisition pr = new PurchaseRequisition(itemCode, itemName, PricePerItem,Quantity, supplierID, supplierName);
                requisitions.add(pr);
            }
        }
        br.close();
        return requisitions;
    }
    
    public ArrayList<PurchaseRequisition> getAllPRtoCompany() throws IOException {
        ArrayList<PurchaseRequisition> requisitions = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("/");
            if (parts.length == 7) {
                String itemCode = parts[0];
                String itemName = parts[1];
                int PricePerItem = Integer.parseInt(parts[2]);
                int Quantity = Integer.parseInt(parts[3]);
                double TotalPrice = Double.parseDouble(parts[4]);
                String supplierID = parts[5];
                String supplierName = parts[6];

                PurchaseRequisition pr = new PurchaseRequisition(itemCode, itemName, PricePerItem,Quantity,TotalPrice, supplierID, supplierName);
                requisitions.add(pr);
            }
        }
        br.close();
        return requisitions;
    }


    public void addRequisition(PurchaseRequisition pr) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true)); // true for append mode
        String line = pr.getItemCode() + "/" + pr.getItemName() + "/" + pr.getPricePerItem() + "/" + pr.getQuantity() + "/" + (pr.getPricePerItem() * pr.getQuantity())+"/"+pr.getSupplierID()+"/"+pr.getSupplierName();
        bw.write(line);
        bw.newLine();
        bw.close();
    }

    public void deleteRequisition(String itemID, String quantity) throws IOException {
        ArrayList<PurchaseRequisition> requisitions = getAllPRtoCompany();
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        
        for (PurchaseRequisition pr : requisitions) {
            if (!(pr.getItemCode().equals(itemID) && Integer.toString(pr.getQuantity()).equals(quantity))) {
                String line = pr.getItemCode() + "/" + pr.getItemName() + "/" + pr.getPricePerItem() + "/" + pr.getQuantity() + "/" + (pr.getPricePerItem() * pr.getQuantity()+"/"+pr.getSupplierID()+"/"+pr.getSupplierName());
                bw.write(line);
                bw.newLine();
            }
        }
        bw.close();
    }
}
