
package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class SalesEntry extends Item{
    private LocalDate date;
    private int quantity;
    private double totalSales;

    public SalesEntry(String itemid, String itemName, LocalDate date, int quantity) {
        super(itemid, itemName, 0.0); 
        this.date = date;
        this.quantity = quantity;
        this.totalSales = calculateTotalSales();
        updatePriceFromItemFile();
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
        this.totalSales = calculateTotalSales();
    }

    public double getTotalSales() {
        return calculateTotalSales();
    }

    private double calculateTotalSales() {
        return quantity * getPrice();
    }

    private void updatePriceFromItemFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ACER\\Documents\\NetBeansProjects\\JavaAss\\src\\javaass\\item.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Parse the line to get the item price based on itemid
                String[] parts = line.split(",");
                String itemFromFileId = parts[0].trim();
                if (itemFromFileId.equals(getItemid())) {
                    double priceFromFile = Double.parseDouble(parts[2].trim());
                    setPrice(priceFromFile);
                    break; // Stop searching once the price is found
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
     public static boolean isValidQuantity(String text) {
        try {
            int quantity = Integer.parseInt(text);
            return quantity >= 0; // Adjust this condition based on your business logic
        } catch (NumberFormatException e) {
            return false;
        }
    }
     
     public static ArrayList<SalesEntry> readSalesEntriesFromFile(String filePath) {
        ArrayList<SalesEntry> salesEntries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                LocalDate date = LocalDate.parse(parts[0].trim());
                String itemid = parts[1].trim();
                String itemname = parts[2].trim();
                int quantity = Integer.parseInt(parts[3].trim());
                double totalSales = Double.parseDouble(parts[4].trim());

                // Create a SalesEntry object and add it to the list
                SalesEntry salesEntry = new SalesEntry(itemid, itemname, date, quantity);
                salesEntries.add(salesEntry);
            }
        } catch (IOException | DateTimeParseException | NumberFormatException e) {
            e.printStackTrace();
        }

        return salesEntries;
    }
    
    public static void updateSalesEntryFile(ArrayList<SalesEntry> salesEntries, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (SalesEntry entry : salesEntries) {
                writer.write(entry.getDate() + "," + entry.getItemid() + "," + entry.getItemName() + "," +
                             entry.getQuantity() + "," + entry.getTotalSales());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
