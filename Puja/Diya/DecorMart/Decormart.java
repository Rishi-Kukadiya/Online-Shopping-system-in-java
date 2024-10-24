package Puja.Diya.DecorMart;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Decormart {
      public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "DecomartDiya:1500:" + quantity;
                case 2 -> productInfo = "DecomartDiya:550:" + quantity;
                case 3 -> productInfo = "DecomartDiya:850:" + quantity;
                case 4 -> productInfo = "DecomartDiya:400:" + quantity;
                case 5 -> productInfo = "DecomartDiya:1300:" + quantity;
                case 6 -> productInfo = "DecomartDiya:900:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
