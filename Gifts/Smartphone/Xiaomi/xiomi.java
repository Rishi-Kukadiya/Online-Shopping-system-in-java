package Gifts.Smartphone.Xiaomi;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class xiomi {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "XIomismartPhone:30000:" + quantity;
                case 2 -> productInfo = "XIomismartPhone:20000:" + quantity;
                case 3 -> productInfo = "XIomismartPhone:25000:" + quantity;
                case 4 -> productInfo = "XIomismartPhone:15000:" + quantity;
                case 5 -> productInfo = "XIomismartPhone:27000:" + quantity;
                case 6 -> productInfo = "XIomismartPhone:32000:" + quantity;
                default -> productInfo = "XIomismartPhone:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
