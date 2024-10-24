package Gifts.Handbag.MichaelKors;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class MichalKoras {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "MichalKorasHandbag:40000:" + quantity;
                case 2 -> productInfo = "MichalKorasHandbag:30000:" + quantity;
                case 3 -> productInfo = "MichalKorasHandbag:35000:" + quantity;
                case 4 -> productInfo = "MichalKorasHandbag:25000:" + quantity;
                case 5 -> productInfo = "MichalKorasHandbag:37000:" + quantity;
                case 6 -> productInfo = "MichalKorasHandbag:42000:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
