package Puja.Diya.Borrosill;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class borrosill {
      public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BorosillDiya:2000:" + quantity;
                case 2 -> productInfo = "BorosillDiya:650:" + quantity;
                case 3 -> productInfo = "BorosillDiya:1100:" + quantity;
                case 4 -> productInfo = "BorosillDiya:500:" + quantity;
                case 5 -> productInfo = "BorosillDiya:1800:" + quantity;
                case 6 -> productInfo = "BorosillDiya:1250:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
