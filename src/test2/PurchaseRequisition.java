
package test2;


public class PurchaseRequisition {
    
    private String itemCode;
    private String itemName;
    private double PricePerItem;
    private int quantity;
    private double TotalPrice;
    private String supplierID;
    private String supplierName;
     
    public PurchaseRequisition(String itemCode, String itemName, double PricePerItem, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.PricePerItem = PricePerItem;
        this.quantity = quantity;
    }
    
    public PurchaseRequisition(String itemCode, String itemName, double PricePerItem, String supId,String supname) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.PricePerItem = PricePerItem;
        this.supplierID = supId;
        this.supplierName = supname;
    }
    
    public PurchaseRequisition(String itemCode, String itemName, double PricePerItem, int quantity, String supId,String supname) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.PricePerItem = PricePerItem;
        this.quantity = quantity;
        this.supplierID = supId;
        this.supplierName = supname;
    }
    
    public PurchaseRequisition(String itemCode, String itemName, double PricePerItem, int quantity, double TotalPrice, String supId,String supname) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.PricePerItem = PricePerItem;
        this.quantity = quantity;
        this.TotalPrice = TotalPrice;
        this.supplierID = supId;
        this.supplierName = supname;
    }
    
    
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public double getPricePerItem() {
        return PricePerItem;
    }
    
    public void setPricePerItem(int PricePerItem) {
        this.PricePerItem = PricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    public double getTotalPrice() {
        return this.quantity * this.PricePerItem;
    }

    public String getSupplierID() {
        return supplierID;
    }
    
    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }
   
    public String getSupplierName() {
        return supplierName;
    }
    
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
        

    

    
    

    @Override
    public String toString() {
        return "PurchaseRequisition{" +
                "itemID='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", pricePerItem=" + PricePerItem +
                ", quantity=" + quantity +
                '}';
    }
    
}

