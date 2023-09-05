
package test2;

public class Item {
    private String itemid;
    private String itemName;
    private double price;
    
    public Item(String itemid, String itemName, double price){
        this.itemid = itemid;
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }
    

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
         
}

