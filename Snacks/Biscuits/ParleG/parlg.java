package Snacks.Biscuits.ParleG;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class parlg {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "ParleGBiscuits:10:" + quantity;
                case 2 -> productInfo = "ParleGBiscuits:5:" + quantity;
                case 3 -> productInfo = "ParleGBiscuits:20:" + quantity;
                case 4 -> productInfo = "ParleGBiscuits:15:" + quantity;
                case 5 -> productInfo = "ParleGBiscuits:25:" + quantity;
                case 6 -> productInfo = "ParleGBiscuits:30:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
