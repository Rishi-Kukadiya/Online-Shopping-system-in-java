package Sports.Tennis.TennisRacket.Wilson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Wiilonracket {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisRacketWilson:8000:" + quantity;
                case 2 -> productInfo = "TennisRacketWilson:6000:" + quantity;
                case 3 -> productInfo = "TennisRacketWilson:7000:" + quantity;
                case 4 -> productInfo = "TennisRacketWilson:5000:" + quantity;
                case 5 -> productInfo = "TennisRacketWilson:7500:" + quantity;
                case 6 -> productInfo = "TennisRacketWilson:8500:" + quantity;
                default -> productInfo = "TennisRacketWilson:0:"  + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
