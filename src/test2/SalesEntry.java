
package test2;

import java.time.LocalDate;

public class SalesEntry extends Item{
    private LocalDate date;
    private int quantity;
    private double totalSales;

    public SalesEntry(String itemName, double price, LocalDate date, int quantity, double totalSales) {
        super(itemName, price);
        this.date = date;
        this.quantity = quantity;
        this.totalSales = totalSales;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales, double price) {
        totalSales = quantity * price;
    }
    
    
}
