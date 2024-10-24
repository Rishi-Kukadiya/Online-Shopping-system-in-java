package Puja.Flowers.FlowerAura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FlowerAura {
          public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "FlowerAuraFlowers:1500:" + quantity;
                case 2 -> productInfo = "FlowerAuraFlowers:500:" + quantity;
                case 3 -> productInfo = "FlowerAuraFlowers:900:" + quantity;
                case 4 -> productInfo = "FlowerAuraFlowers:400:" + quantity;
                case 5 -> productInfo = "FlowerAuraFlowers:1350:" + quantity;
                case 6 -> productInfo = "FlowerAuraFlowers:1100:" + quantity;
                default -> productInfo = "FlowerAuraFlowers:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
