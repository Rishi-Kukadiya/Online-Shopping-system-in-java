package Puja.Kapoor.MangalamCamphor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class mangalkappor {
              public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "MangalKappor:800:" + quantity;
                case 2 -> productInfo = "MangalKappor:250:" + quantity;
                case 3 -> productInfo = "MangalKappor:500:" + quantity;
                case 4 -> productInfo = "MangalKappor:150:" + quantity;
                case 5 -> productInfo = "MangalKappor:700:" + quantity;
                case 6 -> productInfo = "MangalKappor:550:" + quantity;
                default -> productInfo = "MangalKappor:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
