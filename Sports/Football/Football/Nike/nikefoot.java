package Sports.Football.Football.Nike;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class nikefoot {
       public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "NikeFootBall:2000:" + quantity;
                case 2 -> productInfo = "NikeFootBall:1500:" + quantity;
                case 3 -> productInfo = "NikeFootBall:1800:" + quantity;
                case 4 -> productInfo = "NikeFootBall:1200:" + quantity;
                case 5 -> productInfo = "NikeFootBall:1900:" + quantity;
                case 6 -> productInfo = "NikeFootBall:2200:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
