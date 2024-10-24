package Sports.Cricate.Gloves.MRF;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class mrfg {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketGlovesMRF:2400:" + quantity;
                case 2 -> productInfo = "CricketGlovesMRF:1600:" + quantity;
                case 3 -> productInfo = "CricketGlovesMRF:2200:" + quantity;
                case 4 -> productInfo = "CricketGlovesMRF:1300:" + quantity;
                case 5 -> productInfo = "CricketGlovesMRF:2300:" + quantity;
                case 6 -> productInfo = "CricketGlovesMRF:2500:" + quantity;
                default -> productInfo = "CricketGlovesMRF:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
