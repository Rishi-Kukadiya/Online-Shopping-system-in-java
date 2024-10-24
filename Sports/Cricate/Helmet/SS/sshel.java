package Sports.Cricate.Helmet.SS;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class sshel {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketHelmetSS:3000:" + quantity;
                case 2 -> productInfo = "CricketHelmetSS:2000:" + quantity;
                case 3 -> productInfo = "CricketHelmetSS:2500:" + quantity;
                case 4 -> productInfo = "CricketHelmetSS:1500:" + quantity;
                case 5 -> productInfo = "CricketHelmetSS:2700:" + quantity;
                case 6 -> productInfo = "CricketHelmetSS:3200:" + quantity;
                default -> productInfo = "CricketHelmetSS:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
