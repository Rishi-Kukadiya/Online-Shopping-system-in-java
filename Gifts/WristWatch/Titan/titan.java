package Gifts.WristWatch.Titan;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class titan {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TitanWatch:5000:" + quantity;
                case 2 -> productInfo = "TitanWatch:3000:" + quantity;
                case 3 -> productInfo = "TitanWatch:4000:" + quantity;
                case 4 -> productInfo = "TitanWatch:2000:" + quantity;
                case 5 -> productInfo = "TitanWatch:3500:" + quantity;
                case 6 -> productInfo = "TitanWatch:4500:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
