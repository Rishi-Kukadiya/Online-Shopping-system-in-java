package IndianSweets.GulabJamun.MTR;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class mtr {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "mtrGulabJamun:360:" + quantity;
                case 2 -> productInfo = "mtrGulabJamun:260:" + quantity;
                case 3 -> productInfo = "mtrGulabJamun:310:" + quantity;
                case 4 -> productInfo = "mtrGulabJamun:210:" + quantity;
                case 5 -> productInfo = "mtrGulabJamun:290:" + quantity;
                case 6 -> productInfo = "mtrGulabJamun:330:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
