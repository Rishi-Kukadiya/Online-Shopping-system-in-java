package Sports.Tennis.TennisShoes.Babolat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Balbot {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisShoesBablot:8500:" + quantity;
                case 2 -> productInfo = "TennisShoesBablot:6200:" + quantity;
                case 3 -> productInfo = "TennisShoesBablot:7500:" + quantity;
                case 4 -> productInfo = "TennisShoesBablot:5200:" + quantity;
                case 5 -> productInfo = "TennisShoesBablot:8000:" + quantity;
                case 6 -> productInfo = "TennisShoesBablot:9000:" + quantity;
                default -> productInfo = "TennisShoesBablot:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
