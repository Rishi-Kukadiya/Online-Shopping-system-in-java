package FreshVegetable.Cabbage.BigBasket;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class BigBasket {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BigBasketCabbage:60:" + quantity;
                case 2 -> productInfo = "BigBasketCabbage:35:" + quantity;
                case 3 -> productInfo = "BigBasketCabbage:50:" + quantity;
                case 4 -> productInfo = "BigBasketCabbage:30:" + quantity;
                case 5 -> productInfo = "BigBasketCabbage:55:" + quantity;
                case 6 -> productInfo = "BigBasketCabbage:45:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
