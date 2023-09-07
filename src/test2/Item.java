/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author Cody
 */
class Item {
    private String id;
    private String name;
    private String supplierID;
    private String supplierName;
    private double price;

    public Item( String id, String name,String supplierID, String supplierName, double price) {
        this.id = id;
        this.name = name;
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.price = price;
    }

    public String getID(){
        return id;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public String getSupplierID(){
        return supplierID;
    }
    
    public void setSupplierID(String supplierID){
        this.supplierID = supplierID;
    }
    
    public String getSupplierName(){
        return supplierName;
    }
    
    public void setSupplierName(String supplierName){
        this.supplierName = supplierName;
    }
}
