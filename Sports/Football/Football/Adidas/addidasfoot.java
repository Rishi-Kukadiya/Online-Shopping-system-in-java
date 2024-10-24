package Sports.Football.Football.Adidas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class addidasfoot {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "AddidasFootBall:2500:" + quantity;
                case 2 -> productInfo = "AddidasFootBall:1800:" + quantity;
                case 3 -> productInfo = "AddidasFootBall:2200:" + quantity;
                case 4 -> productInfo = "AddidasFootBall:1600:" + quantity;
                case 5 -> productInfo = "AddidasFootBall:2300:" + quantity;
                case 6 -> productInfo = "AddidasFootBall:2700:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
