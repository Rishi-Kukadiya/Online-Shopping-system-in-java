package IndianSweets.Rasgulla.Bikaji;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bikajir {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "bikajiRasgulla:310:" + quantity;
                case 2 -> productInfo = "bikajiRasgulla:220:" + quantity;
                case 3 -> productInfo = "bikajiRasgulla:270:" + quantity;
                case 4 -> productInfo = "bikajiRasgulla:170:" + quantity;
                case 5 -> productInfo = "bikajiRasgulla:250:" + quantity;
                case 6 -> productInfo = "bikajiRasgulla:290:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
