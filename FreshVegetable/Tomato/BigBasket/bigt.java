package FreshVegetable.Tomato.BigBasket;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bigt {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BigBasketTomato:120:" + quantity;
                case 2 -> productInfo = "BigBasketTomato:80:" + quantity;
                case 3 -> productInfo = "BigBasketTomato:100:" + quantity;
                case 4 -> productInfo = "BigBasketTomato:60:" + quantity;
                case 5 -> productInfo = "BigBasketTomato:90:" + quantity;
                case 6 -> productInfo = "BigBasketTomato:110:" + quantity;
                default -> productInfo = "BigBasketTomato:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
