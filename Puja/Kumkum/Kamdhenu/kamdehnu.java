package Puja.Kumkum.Kamdhenu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class kamdehnu {
                 public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "KamDehnu:600:" + quantity;
                case 2 -> productInfo = "KamDehnu:200:" + quantity;
                case 3 -> productInfo = "KamDehnu:350:" + quantity;
                case 4 -> productInfo = "KamDehnu:120:" + quantity;
                case 5 -> productInfo = "KamDehnu:500:" + quantity;
                case 6 -> productInfo = "KamDehnu:400:" + quantity;
                default -> productInfo = "KamDehnu:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
