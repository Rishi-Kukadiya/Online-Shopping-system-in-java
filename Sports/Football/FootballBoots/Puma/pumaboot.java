package Sports.Football.FootballBoots.Puma;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class pumaboot {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "PumaFootBallBoot:5000:" + quantity;
                case 2 -> productInfo = "PumaFootBallBoot:4000:" + quantity;
                case 3 -> productInfo = "PumaFootBallBoot:4500:" + quantity;
                case 4 -> productInfo = "PumaFootBallBoot:3000:" + quantity;
                case 5 -> productInfo = "PumaFootBallBoot:4800:" + quantity;
                case 6 -> productInfo = "PumaFootBallBoot:5500:" + quantity;
                default -> productInfo = "PumaFootBallBoot:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
