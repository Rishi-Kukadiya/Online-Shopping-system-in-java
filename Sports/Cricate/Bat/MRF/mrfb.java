package Sports.Cricate.Bat.MRF;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class mrfb {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketBatMRF:9000:" + quantity;
                case 2 -> productInfo = "CricketBatMRF:7500:" + quantity;
                case 3 -> productInfo = "CricketBatMRF:8000:" + quantity;
                case 4 -> productInfo = "CricketBatMRF:6000:" + quantity;
                case 5 -> productInfo = "CricketBatMRF:5000:" + quantity;
                // case 6 -> productInfo = "CricketBatGM:1000:" + quantity;
                default -> productInfo = "CricketBatMRF:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
