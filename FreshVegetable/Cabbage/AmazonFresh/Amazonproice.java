package FreshVegetable.Cabbage.AmazonFresh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Amazonproice {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "AmazonFreshCabbage:70:" + quantity;
                case 2 -> productInfo = "AmazonFreshCabbage:45:" + quantity;
                case 3 -> productInfo = "AmazonFreshCabbage:60:" + quantity;
                case 4 -> productInfo = "AmazonFreshCabbage:40:" + quantity;
                case 5 -> productInfo = "AmazonFreshCabbage:65:" + quantity;
                case 6 -> productInfo = "AmazonFreshCabbage:50:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
