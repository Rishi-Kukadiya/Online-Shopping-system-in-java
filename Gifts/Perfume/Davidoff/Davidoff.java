package Gifts.Perfume.Davidoff;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Davidoff {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "DavidoffPerfume:3500:" + quantity;
                case 2 -> productInfo = "DavidoffPerfume:2200:" + quantity;
                case 3 -> productInfo = "DavidoffPerfume:2800:" + quantity;
                case 4 -> productInfo = "DavidoffPerfume:1700:" + quantity;
                case 5 -> productInfo = "DavidoffPerfume:3000:" + quantity;
                case 6 -> productInfo = "DavidoffPerfume:3300:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
