package Gifts.Perfume.CalvinKlein;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Calvinkain {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CalvinKainPerfume:3000:" + quantity;
                case 2 -> productInfo = "CalvinKainPerfume:2000:" + quantity;
                case 3 -> productInfo = "CalvinKainPerfume:2500:" + quantity;
                case 4 -> productInfo = "CalvinKainPerfume:1500:" + quantity;
                case 5 -> productInfo = "CalvinKainPerfume:2700:" + quantity;
                case 6 -> productInfo = "CalvinKainPerfume:2900:" + quantity;
                default -> productInfo = "CalvinKainPerfume:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
    
}
