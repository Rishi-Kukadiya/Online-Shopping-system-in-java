package Puja.Agarbatti.MokshAgarbatti;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class mokshagar {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "MokshAgarbatti:1000:" + quantity;
                case 2 -> productInfo = "MokshAgarbatti:600:" + quantity;
                case 3 -> productInfo = "MokshAgarbatti:900:" + quantity;
                case 4 -> productInfo = "MokshAgarbatti:450:" + quantity;
                case 5 -> productInfo = "MokshAgarbatti:1400:" + quantity;
                case 6 -> productInfo = "MokshAgarbatti:750:" + quantity;
                default -> productInfo= "MokshAgarbatti:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
