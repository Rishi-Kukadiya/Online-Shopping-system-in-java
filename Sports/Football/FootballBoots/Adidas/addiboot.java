package Sports.Football.FootballBoots.Adidas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class addiboot {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "AddidasFootBallBoot:7000:" + quantity;
                case 2 -> productInfo = "AddidasFootBallBoot:5000:" + quantity;
                case 3 -> productInfo = "AddidasFootBallBoot:6000:" + quantity;
                case 4 -> productInfo = "AddidasFootBallBoot:4000:" + quantity;
                case 5 -> productInfo = "AddidasFootBallBoot:6500:" + quantity;
                case 6 -> productInfo = "AddidasFootBallBoot:7500:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
