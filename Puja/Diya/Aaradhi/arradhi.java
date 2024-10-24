package Puja.Diya.Aaradhi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class arradhi {
      public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "AarathiDiya:1700:" + quantity;
                case 2 -> productInfo = "AarathiDiya:600:" + quantity;
                case 3 -> productInfo = "AarathiDiya:950:" + quantity;
                case 4 -> productInfo = "AarathiDiya:450:" + quantity;
                case 5 -> productInfo = "AarathiDiya:1600:" + quantity;
                case 6 -> productInfo = "AarathiDiya:1000:" + quantity;
                default -> productInfo = "AarathiDiya:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
