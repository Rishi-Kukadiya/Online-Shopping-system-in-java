package Sports.Tennis.TennisBalls.Babolat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class balbotball {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisBallBabolat:850:" + quantity;
                case 2 -> productInfo = "TennisBallBabolat:620:" + quantity;
                case 3 -> productInfo = "TennisBallBabolat:750:" + quantity;
                case 4 -> productInfo = "TennisBallBabolat:520:" + quantity;
                case 5 -> productInfo = "TennisBallBabolat:800:" + quantity;
                case 6 -> productInfo = "TennisBallBabolat:880:" + quantity;
                default -> productInfo = "TennisBallBabolat:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
