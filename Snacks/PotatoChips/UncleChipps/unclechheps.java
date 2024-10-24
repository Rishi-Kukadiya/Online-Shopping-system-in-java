package Snacks.PotatoChips.UncleChipps;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class unclechheps {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "UncleChipsPotatoChips:40:" + quantity;
                case 2 -> productInfo = "UncleChipsPotatoChips:30:" + quantity;
                case 3 -> productInfo = "UncleChipsPotatoChips:60:" + quantity;
                case 4 -> productInfo = "UncleChipsPotatoChips:50:" + quantity;
                case 5 -> productInfo = "UncleChipsPotatoChips:70:" + quantity;
                case 6 -> productInfo = "UncleChipsPotatoChips:80:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
