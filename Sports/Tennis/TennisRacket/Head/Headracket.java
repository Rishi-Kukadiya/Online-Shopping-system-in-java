package Sports.Tennis.TennisRacket.Head;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Headracket {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisRacketHead:9000:" + quantity;
                case 2 -> productInfo = "TennisRacketHead:6500:" + quantity;
                case 3 -> productInfo = "TennisRacketHead:8000:" + quantity;
                case 4 -> productInfo = "TennisRacketHead:5500:" + quantity;
                case 5 -> productInfo = "TennisRacketHead:8500:" + quantity;
                case 6 -> productInfo = "TennisRacketHead:9500:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
