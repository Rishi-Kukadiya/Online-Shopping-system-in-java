package Gifts.Perfume.Gucci;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Guuccci {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "XIAOMISmartPhone:10000:" + quantity;
                case 2 -> productInfo = "XIAOMISmartPhone:8000:" + quantity;
                case 3 -> productInfo = "XIAOMISmartPhone:9000:" + quantity;
                case 4 -> productInfo = "XIAOMISmartPhone:7000:" + quantity;
                case 5 -> productInfo = "XIAOMISmartPhone:9500:" + quantity;
                case 6 -> productInfo = "XIAOMISmartPhone:11000:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
