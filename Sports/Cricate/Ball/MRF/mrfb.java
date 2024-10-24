package Sports.Cricate.Ball.MRF;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class mrfb {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketBallMRF:750:" + quantity;
                case 2 -> productInfo = "CricketBallMRF:450:" + quantity;
                case 3 -> productInfo = "CricketBallMRF:600:" + quantity;
                case 4 -> productInfo = "CricketBallMRF:350:" + quantity;
                case 5 -> productInfo = "CricketBallMRF:700:" + quantity;
                case 6 -> productInfo = "CricketBallMRF:800:" + quantity;
                default -> productInfo = "CricketBallMRF:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
