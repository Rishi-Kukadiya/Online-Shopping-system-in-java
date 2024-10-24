package Sports.Cricate.Ball.Kookaburra;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class kookb {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketBallKookaburra:800:" + quantity;
                case 2 -> productInfo = "CricketBallKookaburra:500:" + quantity;
                case 3 -> productInfo = "CricketBallKookaburra:700:" + quantity;
                case 4 -> productInfo = "CricketBallKookaburra:400:" + quantity;
                case 5 -> productInfo = "CricketBallKookaburra:750:" + quantity;
                case 6 -> productInfo = "CricketBallKookaburra:850:" + quantity;
                default -> productInfo = "CricketBallKookaburra:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
