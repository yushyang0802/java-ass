
package test2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Login {
    
    public static boolean handleLogin(String username, String role, String password) {
        String file_name = "account.txt";

        try {
            FileReader fr = new FileReader(file_name);
            BufferedReader br = new BufferedReader(fr);

            boolean check_exist = false;
            String record;

            while ((record = br.readLine()) != null) {
                String[] line = record.split(",");

                if (username.equals(line[0]) && role.equals(line[1]) && password.equals(line[2])) {
                    check_exist = true;
                    break;
                }
            }

            fr.close();
            br.close();

            return check_exist;
        } catch (FileNotFoundException error) {
            System.out.println("File not found.");
        } catch (IOException error) {
            System.out.println("An error occurred.");
        }

        return false;
    }

    public static void navigateToMenu(String username, String role) {
        String roleLowerCase = role.toLowerCase(); // Convert role to lowercase

        JOptionPane.showMessageDialog(null, "Welcome " + username);

        if (roleLowerCase.equals("sales manager")) {
            SalesMenu salesmenuGUI = new SalesMenu();
            salesmenuGUI.setVisible(true);
        } else if (roleLowerCase.equals("purchase manager")) {
            PurchaseMenu purchasemenuGUI = new PurchaseMenu();
            purchasemenuGUI.setVisible(true);
        } else if (roleLowerCase.equals("admin")) {
            AdminMenu adminmenuGUI = new AdminMenu();
            adminmenuGUI.setVisible(true);
        }
    }
}
