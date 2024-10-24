package Sports.Cricate.Ball.SG;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class sgb {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketBallSG:600:" + quantity;
                case 2 -> productInfo = "CricketBallSG:350:" + quantity;
                case 3 -> productInfo = "CricketBallSG:500:" + quantity;
                case 4 -> productInfo = "CricketBallSG:250:" + quantity;
                case 5 -> productInfo = "CricketBallSG:550:" + quantity;
                case 6 -> productInfo = "CricketBallSG:650:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
