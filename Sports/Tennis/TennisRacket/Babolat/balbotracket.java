package Sports.Tennis.TennisRacket.Babolat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class balbotracket {    
public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisRacketBablot:8500:" + quantity;
                case 2 -> productInfo = "TennisRacketBablot:6200:" + quantity;
                case 3 -> productInfo = "TennisRacketBablot:7500:" + quantity;
                case 4 -> productInfo = "TennisRacketBablot:5200:" + quantity;
                case 5 -> productInfo = "TennisRacketBablot:8000:" + quantity;
                case 6 -> productInfo = "TennisRacketBablot:9000:" + quantity;
                default -> productInfo = "TennisRacketBablot:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
