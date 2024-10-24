package Snacks.PotatoChips.Lay;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class layies {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "LaysPotatoChips:50:" + quantity;
                case 2 -> productInfo = "LaysPotatoChips:30:" + quantity;
                case 3 -> productInfo = "LaysPotatoChips:100:" + quantity;
                case 4 -> productInfo = "LaysPotatoChips:70:" + quantity;
                case 5 -> productInfo = "LaysPotatoChips:120:" + quantity;
                case 6 -> productInfo = "LaysPotatoChips:90:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}