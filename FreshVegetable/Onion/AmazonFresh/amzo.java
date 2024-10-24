package FreshVegetable.Onion.AmazonFresh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class amzo {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "AmazonFreshOnion:100:" + quantity;
                case 2 -> productInfo = "AmazonFreshOnion:70:" + quantity;
                case 3 -> productInfo = "AmazonFreshOnion:90:" + quantity;
                case 4 -> productInfo = "AmazonFreshOnion:60:" + quantity;
                case 5 -> productInfo = "AmazonFreshOnion:95:" + quantity;
                case 6 -> productInfo = "AmazonFreshOnion:85:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
