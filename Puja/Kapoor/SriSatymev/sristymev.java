package Puja.Kapoor.SriSatymev;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class sristymev {
              public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "SriSatymevKapor:750:" + quantity;
                case 2 -> productInfo = "SriSatymevKapor:230:" + quantity;
                case 3 -> productInfo = "SriSatymevKapor:480:" + quantity;
                case 4 -> productInfo = "SriSatymevKapor:140:" + quantity;
                case 5 -> productInfo = "SriSatymevKapor:650:" + quantity;
                case 6 -> productInfo = "SriSatymevKapor:520:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
