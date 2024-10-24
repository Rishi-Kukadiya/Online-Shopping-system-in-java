package IndianSweets.SoanPapdi.Haldiram;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class haldirams {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "HaldiramSoanPapdi:240:" + quantity;
                case 2 -> productInfo = "HaldiramSoanPapdi:150:" + quantity;
                case 3 -> productInfo = "HaldiramSoanPapdi:200:" + quantity;
                case 4 -> productInfo = "HaldiramSoanPapdi:100:" + quantity;
                case 5 -> productInfo = "HaldiramSoanPapdi:180:" + quantity;
                case 6 -> productInfo = "HaldiramSoanPapdi:220:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
