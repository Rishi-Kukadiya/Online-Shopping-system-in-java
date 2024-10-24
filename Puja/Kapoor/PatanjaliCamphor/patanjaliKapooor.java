package  Puja.Kapoor.PatanjaliCamphor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class patanjaliKapooor {
              public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "PatanjaliKapor:900:" + quantity;
                case 2 -> productInfo = "PatanjaliKapor:300:" + quantity;
                case 3 -> productInfo = "PatanjaliKapor:550:" + quantity;
                case 4 -> productInfo = "PatanjaliKapor:220:" + quantity;
                case 5 -> productInfo = "PatanjaliKapor:800:" + quantity;
                case 6 -> productInfo = "PatanjaliKapor:600:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
