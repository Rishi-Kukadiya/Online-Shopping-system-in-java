package Snacks.Namkeen.Bikanervala;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bikarnervala {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BikanerNamkeen:60:" + quantity;
                case 2 -> productInfo = "BikanerNamkeen:50:" + quantity;
                case 3 -> productInfo = "BikanerNamkeen:100:" + quantity;
                case 4 -> productInfo = "BikanerNamkeen:80:" + quantity;
                case 5 -> productInfo = "BikanerNamkeen:110:" + quantity;
                case 6 -> productInfo = "BikanerNamkeen:90:" + quantity;
                default -> productInfo = "BikanerNamkeen:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
