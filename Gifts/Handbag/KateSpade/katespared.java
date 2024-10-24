package Gifts.Handbag.KateSpade;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class katespared {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "KateSpadeHandbag:50000:" + quantity;
                case 2 -> productInfo = "KateSpadeHandbag:40000:" + quantity;
                case 3 -> productInfo = "KateSpadeHandbag:45000:" + quantity;
                case 4 -> productInfo = "KateSpadeHandbag:35000:" + quantity;
                case 5 -> productInfo = "KateSpadeHandbag:47000:" + quantity;
                case 6 -> productInfo = "KateSpadeHandbag:52000:" + quantity;
                default -> productInfo = "KateSpadeHandbag:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
