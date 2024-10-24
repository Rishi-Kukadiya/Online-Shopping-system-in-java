package Snacks.Namkeen.Garden;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class gardarn {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "GardarnNamkeen:40:" + quantity;
                case 2 -> productInfo = "GardarnNamkeen:30:" + quantity;
                case 3 -> productInfo = "GardarnNamkeen:50:" + quantity;
                case 4 -> productInfo = "GardarnNamkeen:45:" + quantity;
                case 5 -> productInfo = "GardarnNamkeen:60:" + quantity;
                case 6 -> productInfo = "GardarnNamkeen:70:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
