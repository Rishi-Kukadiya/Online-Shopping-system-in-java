package Sports.Badminton.Shuttlecock.Victor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class victors {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "badmintonShutterCockVictor:700:" + quantity;
                case 2 -> productInfo = "badmintonShutterCockVictor:500:" + quantity;
                case 3 -> productInfo = "badmintonShutterCockVictor:600:" + quantity;
                case 4 -> productInfo = "badmintonShutterCockVictor:400:" + quantity;
                case 5 -> productInfo = "badmintonShutterCockVictor:650:" + quantity;
                case 6 -> productInfo = "badmintonShutterCockVictor:750:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
