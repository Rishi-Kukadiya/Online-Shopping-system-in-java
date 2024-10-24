package Gifts.WristWatch.Casio;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Casio {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CasioWristWatch:6000:" + quantity;
                case 2 -> productInfo = "CasioWristWatch:4000:" + quantity;
                case 3 -> productInfo = "CasioWristWatch:5000:" + quantity;
                case 4 -> productInfo = "CasioWristWatch:3000:" + quantity;
                case 5 -> productInfo = "CasioWristWatch:5500:" + quantity;
                case 6 -> productInfo = "CasioWristWatch:6500:" + quantity;
                default -> productInfo = "CasioWristWatch:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
