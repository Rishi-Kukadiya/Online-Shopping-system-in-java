package Sports.Badminton.BadmintonRacket.Victor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class victor {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BadmintonRacketVictor:3200:" + quantity;
                case 2 -> productInfo = "BadmintonRacketVictor:2100:" + quantity;
                case 3 -> productInfo = "BadmintonRacketVictor:2700:" + quantity;
                case 4 -> productInfo = "BadmintonRacketVictor:1600:" + quantity;
                case 5 -> productInfo = "BadmintonRacketVictor:3000:" + quantity;
                case 6 -> productInfo = "BadmintonRacketVictor:3500:" + quantity;
                default -> productInfo = "BadmintonRacketVictor:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
