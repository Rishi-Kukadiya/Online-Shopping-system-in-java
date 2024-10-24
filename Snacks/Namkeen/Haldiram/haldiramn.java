package Snacks.Namkeen.Haldiram;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class haldiramn {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "HaldiramNamkeen:60:" + quantity;
                case 2 -> productInfo = "HaldiramNamkeen:50:" + quantity;
                case 3 -> productInfo = "HaldiramNamkeen:100:" + quantity;
                case 4 -> productInfo = "HaldiramNamkeen:80:" + quantity;
                case 5 -> productInfo = "HaldiramNamkeen:120:" + quantity;
                case 6 -> productInfo = "HaldiramNamkeen:90:" + quantity;
                default -> productInfo = "HaldiramNamkeen:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
