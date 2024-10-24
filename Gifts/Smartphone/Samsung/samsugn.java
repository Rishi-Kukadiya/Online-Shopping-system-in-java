package Gifts.Smartphone.Samsung;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class samsugn {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "SamsugnSmartPhone:80000:" + quantity;
                case 2 -> productInfo = "SamsugnSmartPhone:60000:" + quantity;
                case 3 -> productInfo = "SamsugnSmartPhone:70000:" + quantity;
                case 4 -> productInfo = "SamsugnSmartPhone:50000:" + quantity;
                case 5 -> productInfo = "SamsugnSmartPhone:75000:" + quantity;
                case 6 -> productInfo = "SamsugnSmartPhone:85000:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
