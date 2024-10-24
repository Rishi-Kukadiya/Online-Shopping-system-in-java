package Gifts.WristWatch.DanielWellington;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class DanielWellington {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "DanielWellingtonWristWatch:10000:" + quantity;
                case 2 -> productInfo = "DanielWellingtonWristWatch:7000:" + quantity;
                case 3 -> productInfo = "DanielWellingtonWristWatch:8500:" + quantity;
                case 4 -> productInfo = "DanielWellingtonWristWatch:6000:" + quantity;
                case 5 -> productInfo = "DanielWellingtonWristWatch:9000:" + quantity;
                case 6 -> productInfo = "DanielWellingtonWristWatch:9500:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
