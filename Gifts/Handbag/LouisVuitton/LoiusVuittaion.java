package Gifts.Handbag.LouisVuitton;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class LoiusVuittaion {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "LoiusVuittationHandbag:100000:" + quantity;
                case 2 -> productInfo = "LoiusVuittationHandbag:90000:" + quantity;
                case 3 -> productInfo = "LoiusVuittationHandbag:95000:" + quantity;
                case 4 -> productInfo = "LoiusVuittationHandbag:80000:" + quantity;
                case 5 -> productInfo = "LoiusVuittationHandbag:105000:" + quantity;
                case 6 -> productInfo = "LoiusVuittationHandbag:110000:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
