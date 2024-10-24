package Snacks.PotatoChips.Pringles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class pigal {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "PigalPotatoChips:150:" + quantity;
                case 2 -> productInfo = "PigalPotatoChips:100:" + quantity;
                case 3 -> productInfo = "PigalPotatoChips:200:" + quantity;
                case 4 -> productInfo = "PigalPotatoChips:180:" + quantity;
                case 5 -> productInfo = "PigalPotatoChips:220:" + quantity;
                case 6 -> productInfo = "PigalPotatoChips:250:" + quantity;
                default -> productInfo = "PigalPotatoChips:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
