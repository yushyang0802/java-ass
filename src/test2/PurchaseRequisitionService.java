/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;
import java.io.IOException;
import java.util.ArrayList;

public class PurchaseRequisitionService {
     private PurchaseRequisitionDAO dao;

    public PurchaseRequisitionService(String filePath) {
        this.dao = new PurchaseRequisitionDAO(filePath);
    }

    public ArrayList<PurchaseRequisition> getAllRequisitions() {
        try {
            return dao.getAllRequisitions();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>(); // Return an empty list on exception
        }
    }
    
    public ArrayList<PurchaseRequisition> getAllRequisitionsfromitem() {
        try {
            return dao.getAllRequisitionsfromitem();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>(); // Return an empty list on exception
        }
    }
    
    public ArrayList<PurchaseRequisition> getAllRequisitionsfromitemtopr() {
        try {
            return dao.getAllRequisitionsfromitem();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>(); // Return an empty list on exception
        }
    }
    
    public ArrayList<PurchaseRequisition> getAllPRtoCompany() {
        try {
            return dao.getAllPRtoCompany();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>(); // Return an empty list on exception
        }
    }

    public void addRequisition(PurchaseRequisition pr) {
        try {
            dao.addRequisition(pr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    

    public void deleteRequisition(String itemID, String quantity) {
        try {
            dao.deleteRequisition(itemID, quantity);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double calculateTotalPrice() {
        int TotalPrice = 0;
        ArrayList<PurchaseRequisition> requisitions = getAllRequisitions();
        for (PurchaseRequisition pr : requisitions) {
            TotalPrice += pr.getTotalPrice();
        }
        return TotalPrice;
    }
    
}
