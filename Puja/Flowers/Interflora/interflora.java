package Puja.Flowers.Interflora;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class interflora {
          public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "interFloraFlowers:1700:" + quantity;
                case 2 -> productInfo = "interFloraFlowers:600:" + quantity;
                case 3 -> productInfo = "interFloraFlowers:1050:" + quantity;
                case 4 -> productInfo = "interFloraFlowers:500:" + quantity;
                case 5 -> productInfo = "interFloraFlowers:1500:" + quantity;
                case 6 -> productInfo = "interFloraFlowers:1300:" + quantity;
                default -> productInfo = "interFloraFlowers:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
