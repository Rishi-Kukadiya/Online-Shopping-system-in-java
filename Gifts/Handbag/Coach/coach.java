package Gifts.Handbag.Coach;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class coach {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CoachHandbag:35000:" + quantity;
                case 2 -> productInfo = "CoachHandbag:25000:" + quantity;
                case 3 -> productInfo = "CoachHandbag:30000:" + quantity;
                case 4 -> productInfo = "CoachHandbag:20000:" + quantity;
                case 5 -> productInfo = "CoachHandbag:32000:" + quantity;
                case 6 -> productInfo = "CoachHandbag:38000:" + quantity;
                default -> productInfo = "CoachHandbag:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
