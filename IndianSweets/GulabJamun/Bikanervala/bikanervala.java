package IndianSweets.GulabJamun.Bikanervala;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bikanervala {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "HaldiramGulabJamun:370:" + quantity;
                case 2 -> productInfo = "HaldiramGulabJamun:270:" + quantity;
                case 3 -> productInfo = "HaldiramGulabJamun:320:" + quantity;
                case 4 -> productInfo = "HaldiramGulabJamun:220:" + quantity;
                case 5 -> productInfo = "HaldiramGulabJamun:300:" + quantity;
                case 6 -> productInfo = "HaldiramGulabJamun:320:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
