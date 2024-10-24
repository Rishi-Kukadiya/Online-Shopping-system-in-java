package FreshVegetable.Potato.RelianceFresh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class relincep {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "ReliancePotato:65:" + quantity;
                case 2 -> productInfo = "ReliancePotato:38:" + quantity;
                case 3 -> productInfo = "ReliancePotato:50:" + quantity;
                case 4 -> productInfo = "ReliancePotato:28:" + quantity;
                case 5 -> productInfo = "ReliancePotato:60:" + quantity;
                case 6 -> productInfo = "ReliancePotato:48:" + quantity;
                default -> productInfo = "ReliancePotato:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
