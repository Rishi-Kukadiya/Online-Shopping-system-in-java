package FreshVegetable.Onion.BigBasket;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Bigo {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BigBasketOnion:90:" + quantity;
                case 2 -> productInfo = "BigBasketOnion:60:" + quantity;
                case 3 -> productInfo = "BigBasketOnion:80:" + quantity;
                case 4 -> productInfo = "BigBasketOnion:50:" + quantity;
                case 5 -> productInfo = "BigBasketOnion:85:" + quantity;
                case 6 -> productInfo = "BigBasketOnion:75:" + quantity;
                default ->productInfo = "BigBasketOnion:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
