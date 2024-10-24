package Puja.Kapoor.PurePrayer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class pp {
              public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "PurePrayerKapor:850:" + quantity;
                case 2 -> productInfo = "PurePrayerKapor:270:" + quantity;
                case 3 -> productInfo = "PurePrayerKapor:530:" + quantity;
                case 4 -> productInfo = "PurePrayerKapor:180:" + quantity;
                case 5 -> productInfo = "PurePrayerKapor:750:" + quantity;
                case 6 -> productInfo = "PurePrayerKapor:570:" + quantity;
                default -> productInfo = "PurePrayerKapor:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
