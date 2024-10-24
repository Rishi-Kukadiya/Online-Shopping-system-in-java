package Sports.Football.FootballBoots.Nivia;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class niviboot {
      public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "NiviaFootBallBoot:2000:" + quantity;
                case 2 -> productInfo = "NiviaFootBallBoot:1500:" + quantity;
                case 3 -> productInfo = "NiviaFootBallBoot:1800:" + quantity;
                case 4 -> productInfo = "NiviaFootBallBoot:1200:" + quantity;
                case 5 -> productInfo = "NiviaFootBallBoot:1900:" + quantity;
                case 6 -> productInfo = "NiviaFootBallBoot:2200:" + quantity;
                default -> productInfo = "NiviaFootBallBoot:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
