
package test2;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class poclass {
    /*public void call_potable(){
        String filePath = "C:\\Users\\Asus\\OneDrive\\Desktop\\yushyang\\OODJ\\purchase_order.txt";
        File file = new File(filePath);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();
            
            for(int i = 0; i< tableLines.length;i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow =line.split("/");
                model.addRow(dataRow);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(purchase_order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    private String filePath;

    public poclass(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<String> readData() throws IOException {
        File file = new File(filePath);
        ArrayList<String> as = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            
            while ((line = br.readLine())!= null){
                as.add(line);   
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(purchase_order.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return as;
    }
    public static void switchToPRFrame(JFrame currentFrame) {
        pr pr = new pr();
        pr.setVisible(true);
        currentFrame.dispose();  
    }
    
    public void writeData(ArrayList<String> data){
        File file = new File(filePath);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine(); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }
    
    
}
