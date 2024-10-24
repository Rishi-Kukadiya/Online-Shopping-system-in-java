package Gifts.WristWatch.Fossil;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Fossile {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "FossileWatch:8000:" + quantity;
                case 2 -> productInfo = "FossileWatch:5000:" + quantity;
                case 3 -> productInfo = "FossileWatch:6500:" + quantity;
                case 4 -> productInfo = "FossileWatch:4000:" + quantity;
                case 5 -> productInfo = "FossileWatch:7000:" + quantity;
                case 6 -> productInfo = "FossileWatch:7500:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
