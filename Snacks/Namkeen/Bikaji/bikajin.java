package Snacks.Namkeen.Bikaji;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bikajin {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BikajiNamkeen:50:" + quantity;
                case 2 -> productInfo = "BikajiNamkeen:40:" + quantity;
                case 3 -> productInfo = "BikajiNamkeen:90:" + quantity;
                case 4 -> productInfo = "BikajiNamkeen:70:" + quantity;
                case 5 -> productInfo = "BikajiNamkeen:100:" + quantity;
                case 6 -> productInfo = "BikajiNamkeen:80:" + quantity;
                default -> productInfo = "BikajiNamkeen:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
