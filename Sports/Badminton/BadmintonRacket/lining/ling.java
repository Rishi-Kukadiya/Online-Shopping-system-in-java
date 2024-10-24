package Sports.Badminton.BadmintonRacket.lining;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ling {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BadmintonRacketLining:3500:" + quantity;
                case 2 -> productInfo = "BadmintonRacketLining:2300:" + quantity;
                case 3 -> productInfo = "BadmintonRacketLining:3000:" + quantity;
                case 4 -> productInfo = "BadmintonRacketLining:1800:" + quantity;
                case 5 -> productInfo = "BadmintonRacketLining:3300:" + quantity;
                case 6 -> productInfo = "BadmintonRacketLining:3800:" + quantity;
                default -> productInfo = "BadmintonRacketLining:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
