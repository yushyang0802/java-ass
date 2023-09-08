/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class fileclass {
     private String filePath;

    public fileclass(String filePath) {
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
            Logger.getLogger(fileclass.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return as;
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
}
