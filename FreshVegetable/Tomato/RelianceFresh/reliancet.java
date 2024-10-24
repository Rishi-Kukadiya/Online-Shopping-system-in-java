package FreshVegetable.Tomato.RelianceFresh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class reliancet {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "RealianceFreshTomato:110:" + quantity;
                case 2 -> productInfo = "RealianceFreshTomato:75:" + quantity;
                case 3 -> productInfo = "RealianceFreshTomato:95:" + quantity;
                case 4 -> productInfo = "RealianceFreshTomato:55:" + quantity;
                case 5 -> productInfo = "RealianceFreshTomato:85:" + quantity;
                case 6 -> productInfo = "RealianceFreshTomato:105:" + quantity;
                default -> productInfo = "RealianceFreshTomato:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
