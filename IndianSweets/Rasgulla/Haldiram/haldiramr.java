package IndianSweets.Rasgulla.Haldiram;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class haldiramr {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "HaldiramRasgulla:320:" + quantity;
                case 2 -> productInfo = "HaldiramRasgulla:230:" + quantity;
                case 3 -> productInfo = "HaldiramRasgulla:280:" + quantity;
                case 4 -> productInfo = "HaldiramRasgulla:180:" + quantity;
                case 5 -> productInfo = "HaldiramRasgulla:260:" + quantity;
                case 6 -> productInfo = "HaldiramRasgulla:300:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
