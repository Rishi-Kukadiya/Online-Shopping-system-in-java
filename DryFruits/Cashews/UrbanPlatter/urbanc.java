package DryFruits.Cashews.UrbanPlatter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class urbanc {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "UrbanPlatterCashews:1100:" + quantity;
                case 2 -> productInfo = "UrbanPlatterCashews:800:" + quantity;
                case 3 -> productInfo = "UrbanPlatterCashews:950:" + quantity;
                case 4 -> productInfo = "UrbanPlatterCashews:650:" + quantity;
                case 5 -> productInfo = "UrbanPlatterCashews:1000:" + quantity;
                case 6 -> productInfo = "UrbanPlatterCashews:1200:" + quantity;
                default -> productInfo = "UrbanPlatterCashews:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
