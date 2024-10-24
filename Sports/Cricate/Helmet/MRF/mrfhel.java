package Sports.Cricate.Helmet.MRF;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class mrfhel {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketHelmetMRF:3800:" + quantity;
                case 2 -> productInfo = "CricketHelmetMRF:2400:" + quantity;
                case 3 -> productInfo = "CricketHelmetMRF:3300:" + quantity;
                case 4 -> productInfo = "CricketHelmetMRF:1700:" + quantity;
                case 5 -> productInfo = "CricketHelmetMRF:3500:" + quantity;
                case 6 -> productInfo = "CricketHelmetMRF:4000:" + quantity;
                default -> productInfo = "CricketHelmetMRF:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
