package Sports.Badminton.Shuttlecock.Ashaway;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ahways {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "badmintonShutterCockAshaway:550:" + quantity;
                case 2 -> productInfo = "badmintonShutterCockAshaway:430:" + quantity;
                case 3 -> productInfo = "badmintonShutterCockAshaway:500:" + quantity;
                case 4 -> productInfo = "badmintonShutterCockAshaway:350:" + quantity;
                case 5 -> productInfo = "badmintonShutterCockAshaway:520:" + quantity;
                case 6 -> productInfo = "badmintonShutterCockAshaway:580:" + quantity;
                default -> productInfo = "badmintonShutterCockAshaway:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
