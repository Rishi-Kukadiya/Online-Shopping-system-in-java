package FreshVegetable.Tomato.AmazonFresh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class amzt {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "AmazonFreshTomato:130:" + quantity;
                case 2 -> productInfo = "AmazonFreshTomato:85:" + quantity;
                case 3 -> productInfo = "AmazonFreshTomato:105:" + quantity;
                case 4 -> productInfo = "AmazonFreshTomato:65:" + quantity;
                case 5 -> productInfo = "AmazonFreshTomato:95:" + quantity;
                case 6 -> productInfo = "AmazonFreshTomato:115:" + quantity;
                default -> productInfo = "AmazonFreshTomato:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
