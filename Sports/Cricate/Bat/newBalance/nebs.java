package Sports.Cricate.Bat.newBalance;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class nebs {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketBatNewBalance:4000:" + quantity;
                case 2 -> productInfo = "CricketBatNewBalance:1000:" + quantity;
                case 3 -> productInfo = "CricketBatNewBalance:2500:" + quantity;
                case 4 -> productInfo = "CricketBatNewBalance:900:" + quantity;
                case 5 -> productInfo = "CricketBatNewBalance:600:" + quantity;
                // case 6 -> productInfo = "CricketBatGM:1000:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
