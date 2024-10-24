package FreshVegetable.Onion.RelianceFresh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class relinceo {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "RelianceFreshOnion:85:" + quantity;
                case 2 -> productInfo = "RelianceFreshOnion:55:" + quantity;
                case 3 -> productInfo = "RelianceFreshOnion:75:" + quantity;
                case 4 -> productInfo = "RelianceFreshOnion:45:" + quantity;
                case 5 -> productInfo = "RelianceFreshOnion:80:" + quantity;
                case 6 -> productInfo = "RelianceFreshOnion:70:" + quantity;
                default -> productInfo = "RelianceFreshOnion:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
