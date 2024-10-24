package FreshVegetable.Potato.AmazonFresh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class amzep {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "AmazonFreshPotato:80:" + quantity;
                case 2 -> productInfo = "AmazonFreshPotato:50:" + quantity;
                case 3 -> productInfo = "AmazonFreshPotato:65:" + quantity;
                case 4 -> productInfo = "AmazonFreshPotato:40:" + quantity;
                case 5 -> productInfo = "AmazonFreshPotato:75:" + quantity;
                case 6 -> productInfo = "AmazonFreshPotato:60:" + quantity;
                default -> productInfo = "AmazonFreshPotato:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
