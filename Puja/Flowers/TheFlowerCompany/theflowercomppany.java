package Puja.Flowers.TheFlowerCompany;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class theflowercomppany {
          public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TheFlowerCompanyFlower:1400:" + quantity;
                case 2 -> productInfo = "TheFlowerCompanyFlower:480:" + quantity;
                case 3 -> productInfo = "TheFlowerCompanyFlower:950:" + quantity;
                case 4 -> productInfo = "TheFlowerCompanyFlower:420:" + quantity;
                case 5 -> productInfo = "TheFlowerCompanyFlower:1250:" + quantity;
                case 6 -> productInfo = "TheFlowerCompanyFlower:1000:" + quantity;
                default -> productInfo = "TheFlowerCompanyFlower:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
