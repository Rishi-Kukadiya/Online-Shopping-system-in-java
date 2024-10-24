package Sports.Football.Football.Nivia;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Niviafoot {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "NiviaFootBall:1000:" + quantity;
                case 2 -> productInfo = "NiviaFootBall:800:" + quantity;
                case 3 -> productInfo = "NiviaFootBall:900:" + quantity;
                case 4 -> productInfo = "NiviaFootBall:600:" + quantity;
                case 5 -> productInfo = "NiviaFootBall:950:" + quantity;
                case 6 -> productInfo = "NiviaFootBall:1100:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
