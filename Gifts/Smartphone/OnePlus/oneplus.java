package Gifts.Smartphone.OnePlus;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class oneplus {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "oneplusSmartPhone:50000:" + quantity;
                case 2 -> productInfo = "oneplusSmartPhone:40000:" + quantity;
                case 3 -> productInfo = "oneplusSmartPhone:45000:" + quantity;
                case 4 -> productInfo = "oneplusSmartPhone:35000:" + quantity;
                case 5 -> productInfo = "oneplusSmartPhone:37000:" + quantity;
                case 6 -> productInfo = "oneplusSmartPhone:52000:" + quantity;
                default -> productInfo = "oneplusSmartPhone:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
