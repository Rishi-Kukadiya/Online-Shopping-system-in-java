package IndianSweets.MysorePak.AdyarAnandaBhavan;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Adyaanadbhav {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "AdyaanabhavMysorePak:520:" + quantity;
                case 2 -> productInfo = "AdyaanabhavMysorePak:370:" + quantity;
                case 3 -> productInfo = "AdyaanabhavMysorePak:470:" + quantity;
                case 4 -> productInfo = "AdyaanabhavMysorePak:320:" + quantity;
                case 5 -> productInfo = "AdyaanabhavMysorePak:420:" + quantity;
                case 6 -> productInfo = "AdyaanabhavMysorePak:490:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
