package Sports.Football.Football.Puma;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class pumafoot {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "PumaFootBall:2300:" + quantity;
                case 2 -> productInfo = "PumaFootBall:1600:" + quantity;
                case 3 -> productInfo = "PumaFootBall:2000:" + quantity;
                case 4 -> productInfo = "PumaFootBall:1400:" + quantity;
                case 5 -> productInfo = "PumaFootBall:2100:" + quantity;
                case 6 -> productInfo = "PumaFootBall:2500:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
