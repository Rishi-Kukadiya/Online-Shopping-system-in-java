package Sports.Badminton.BadmintonRacket.Ashaway;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ashway {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BadmintonRacketAshway:2500:" + quantity;
                case 2 -> productInfo = "BadmintonRacketAshway:1700:" + quantity;
                case 3 -> productInfo = "BadmintonRacketAshway:2000:" + quantity;
                case 4 -> productInfo = "BadmintonRacketAshway:1400:" + quantity;
                case 5 -> productInfo = "BadmintonRacketAshway:2200:" + quantity;
                case 6 -> productInfo = "BadmintonRacketAshway:2800:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}

