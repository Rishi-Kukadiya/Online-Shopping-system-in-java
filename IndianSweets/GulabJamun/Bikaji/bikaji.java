package IndianSweets.GulabJamun.Bikaji;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bikaji {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BikajiGulabJamun:340:" + quantity;
                case 2 -> productInfo = "BikajiGulabJamun:240:" + quantity;
                case 3 -> productInfo = "BikajiGulabJamun:290:" + quantity;
                case 4 -> productInfo = "BikajiGulabJamun:190:" + quantity;
                case 5 -> productInfo = "BikajiGulabJamun:270:" + quantity;
                case 6 -> productInfo = "BikajiGulabJamun:310:" + quantity;
                default -> productInfo = "BikajiGulabJamun:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
