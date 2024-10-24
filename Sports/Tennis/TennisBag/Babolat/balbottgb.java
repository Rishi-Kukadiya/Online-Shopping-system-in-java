package Sports.Tennis.TennisBag.Babolat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class balbottgb {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisBagBablot:4300:" + quantity;
                case 2 -> productInfo = "TennisBagBablot:3100:" + quantity;
                case 3 -> productInfo = "TennisBagBablot:3900:" + quantity;
                case 4 -> productInfo = "TennisBagBablot:2100:" + quantity;
                case 5 -> productInfo = "TennisBagBablot:4200:" + quantity;
                case 6 -> productInfo = "TennisBagBablot:4700:" + quantity;
                default -> productInfo = "TennisBagBablot:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
