package Puja.Agarbatti.ZedBlack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class zedbalck {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "ZedBalckAggarbatti:1100:" + quantity;
                case 2 -> productInfo = "ZedBalckAggarbatti:400:" + quantity;
                case 3 -> productInfo = "ZedBalckAggarbatti:800:" + quantity;
                case 4 -> productInfo = "ZedBalckAggarbatti:500:" + quantity;
                case 5 -> productInfo = "ZedBalckAggarbatti:1350:" + quantity;
                case 6 -> productInfo = "ZedBalckAggarbatti:700:" + quantity;
                default -> productInfo = "ZedBalckAggarbatti:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
