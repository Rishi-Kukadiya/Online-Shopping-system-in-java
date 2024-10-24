package FreshVegetable.Carrot.BigBasket;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bbc {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BigBasketCarrot:100:" + quantity;
                case 2 -> productInfo = "BigBasketCarrot:65:" + quantity;
                case 3 -> productInfo = "BigBasketCarrot:85:" + quantity;
                case 4 -> productInfo = "BigBasketCarrot:55:" + quantity;
                case 5 -> productInfo = "BigBasketCarrot:95:" + quantity;
                case 6 -> productInfo = "BigBasketCarrot:75:" + quantity;
                default -> productInfo = "BigBasketCarrot:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
