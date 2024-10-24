package IndianSweets.SoanPapdi.Bikaji;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bikajis {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "bikajiSoanPapdi:230:" + quantity;
                case 2 -> productInfo = "bikajiSoanPapdi:140:" + quantity;
                case 3 -> productInfo = "bikajiSoanPapdi:190:" + quantity;
                case 4 -> productInfo = "bikajiSoanPapdi:90:" + quantity;
                case 5 -> productInfo = "bikajiSoanPapdi:170:" + quantity;
                case 6 -> productInfo = "bikajiSoanPapdi:210:" + quantity;
                default -> productInfo = "bikajiSoanPapdi:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
