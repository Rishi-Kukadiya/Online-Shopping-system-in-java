package Snacks.Biscuits.Unibic;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class unibiscuit {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "UniBicBiscuits:50:" + quantity;
                case 2 -> productInfo = "UniBicBiscuits:40:" + quantity;
                case 3 -> productInfo = "UniBicBiscuits:60:" + quantity;
                case 4 -> productInfo = "UniBicBiscuits:55:" + quantity;
                case 5 -> productInfo = "UniBicBiscuits:70:" + quantity;
                case 6 -> productInfo = "UniBicBiscuits:80:" + quantity;
                default -> productInfo = "UniBicBiscuits:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
