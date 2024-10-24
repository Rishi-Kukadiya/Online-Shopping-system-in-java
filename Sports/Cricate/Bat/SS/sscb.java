package Sports.Cricate.Bat.SS;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class sscb {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketBatSS:900:" + quantity;
                case 2 -> productInfo = "CricketBatSS:1950:" + quantity;
                case 3 -> productInfo = "CricketBatSS:2300:" + quantity;
                case 4 -> productInfo = "CricketBatSS:1800:" + quantity;
                case 5 -> productInfo = "CricketBatSS:1500:" + quantity;
                // case 6 -> productInfo = "CricketBatGM:1000:" + quantity;
                default -> productInfo = "CricketBatSS:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}    
}
