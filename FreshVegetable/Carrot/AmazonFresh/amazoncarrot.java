package FreshVegetable.Carrot.AmazonFresh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class amazoncarrot {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "amazonFreshCarrot:65:" + quantity;
                case 2 -> productInfo = "amazonFreshCarrot:40:" + quantity;
                case 3 -> productInfo = "amazonFreshCarrot:55:" + quantity;
                case 4 -> productInfo = "amazonFreshCarrot:35:" + quantity;
                case 5 -> productInfo = "amazonFreshCarrot:60:" + quantity;
                case 6 -> productInfo = "amazonFreshCarrot:50:" + quantity;
                default -> productInfo = "amazonFreshCarrot:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
