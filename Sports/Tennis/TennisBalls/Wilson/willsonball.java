package Sports.Tennis.TennisBalls.Wilson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class willsonball {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisBallWilson:800:" + quantity;
                case 2 -> productInfo = "TennisBallWilson:600:" + quantity;
                case 3 -> productInfo = "TennisBallWilson:700:" + quantity;
                case 4 -> productInfo = "TennisBallWilson:500:" + quantity;
                case 5 -> productInfo = "TennisBallWilson:750:" + quantity;
                case 6 -> productInfo = "TennisBallWilson:850:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}