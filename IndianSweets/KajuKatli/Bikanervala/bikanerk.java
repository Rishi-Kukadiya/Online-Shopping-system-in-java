package IndianSweets.KajuKatli.Bikanervala;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bikanerk {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "bikanerkKajuKatli:1100:" + quantity;
                case 2 -> productInfo = "bikanerkKajuKatli:800:" + quantity;
                case 3 -> productInfo = "bikanerkKajuKatli:950:" + quantity;
                case 4 -> productInfo = "bikanerkKajuKatli:650:" + quantity;
                case 5 -> productInfo = "bikanerkKajuKatli:900:" + quantity;
                case 6 -> productInfo = "bikanerkKajuKatli:1050:" + quantity;
                default -> productInfo = "bikanerkKajuKatli:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
