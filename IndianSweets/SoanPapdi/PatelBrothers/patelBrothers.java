package IndianSweets.SoanPapdi.PatelBrothers;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class patelBrothers {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "PatelBrotherSoanPapdi:250:" + quantity;
                case 2 -> productInfo = "PatelBrotherSoanPapdi:160:" + quantity;
                case 3 -> productInfo = "PatelBrotherSoanPapdi:210:" + quantity;
                case 4 -> productInfo = "PatelBrotherSoanPapdi:120:" + quantity;
                case 5 -> productInfo = "PatelBrotherSoanPapdi:190:" + quantity;
                case 6 -> productInfo = "PatelBrotherSoanPapdi:230:" + quantity;
                default -> productInfo = "PatelBrotherSoanPapdi:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
