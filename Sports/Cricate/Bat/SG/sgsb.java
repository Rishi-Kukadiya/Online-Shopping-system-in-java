package Sports.Cricate.Bat.SG;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class sgsb {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketBatSG:800:" + quantity;
                case 2 -> productInfo = "CricketBatSG:2100:" + quantity;
                case 3 -> productInfo = "CricketBatSG:1850:" + quantity;
                case 4 -> productInfo = "CricketBatSG:1900:" + quantity;
                case 5 -> productInfo = "CricketBatSG:1500:" + quantity;
                // case 6 -> productInfo = "CricketBatGM:1000:" + quantity;
                default -> productInfo = "CricketBatSG:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
