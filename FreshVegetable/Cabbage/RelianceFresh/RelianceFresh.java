package FreshVegetable.Cabbage.RelianceFresh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class RelianceFresh {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "RelianceFreshCabbge:55:" + quantity;
                case 2 -> productInfo = "RelianceFreshCabbge:33:" + quantity;
                case 3 -> productInfo = "RelianceFreshCabbge:48:" + quantity;
                case 4 -> productInfo = "RelianceFreshCabbge:28:" + quantity;
                case 5 -> productInfo = "RelianceFreshCabbge:53:" + quantity;
                case 6 -> productInfo = "RelianceFreshCabbge:45:" + quantity;
                default -> productInfo = "RelianceFreshCabbge:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
