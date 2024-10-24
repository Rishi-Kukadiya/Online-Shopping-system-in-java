package IndianSweets.Rasgulla.Bikanervala;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bikanerr {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "bikanerRasgulla:330:" + quantity;
                case 2 -> productInfo = "bikanerRasgulla:240:" + quantity;
                case 3 -> productInfo = "bikanerRasgulla:290:" + quantity;
                case 4 -> productInfo = "bikanerRasgulla:190:" + quantity;
                case 5 -> productInfo = "bikanerRasgulla:270:" + quantity;
                case 6 -> productInfo = "bikanerRasgulla:310:" + quantity;
                default -> productInfo = "bikanerRasgulla:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
