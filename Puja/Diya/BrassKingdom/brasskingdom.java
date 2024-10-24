package Puja.Diya.BrassKingdom;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class brasskingdom {
      public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BrassKingdomDiya:1900:" + quantity;
                case 2 -> productInfo = "BrassKingdomDiya:700:" + quantity;
                case 3 -> productInfo = "BrassKingdomDiya:1200:" + quantity;
                case 4 -> productInfo = "BrassKingdomDiya:600:" + quantity;
                case 5 -> productInfo = "BrassKingdomDiya:1700:" + quantity;
                case 6 -> productInfo = "BrassKingdomDiya:1150:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
