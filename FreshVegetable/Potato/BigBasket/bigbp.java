package FreshVegetable.Potato.BigBasket;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bigbp {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BigBasketPotato:70:" + quantity;
                case 2 -> productInfo = "BigBasketPotato:40:" + quantity;
                case 3 -> productInfo = "BigBasketPotato:55:" + quantity;
                case 4 -> productInfo = "BigBasketPotato:30:" + quantity;
                case 5 -> productInfo = "BigBasketPotato:65:" + quantity;
                case 6 -> productInfo = "BigBasketPotato:50:" + quantity;
                default -> productInfo = "BigBasketPotato:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
