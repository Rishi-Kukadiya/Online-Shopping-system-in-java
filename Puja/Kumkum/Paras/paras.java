package Puja.Kumkum.Paras;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class paras {
                 public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "ParasKumkum:550:" + quantity;
                case 2 -> productInfo = "ParasKumkum:180:" + quantity;
                case 3 -> productInfo = "ParasKumkum:320:" + quantity;
                case 4 -> productInfo = "ParasKumkum:110:" + quantity;
                case 5 -> productInfo = "ParasKumkum:470:" + quantity;
                case 6 -> productInfo = "ParasKumkum:360:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
