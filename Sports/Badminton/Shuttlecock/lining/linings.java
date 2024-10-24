package Sports.Badminton.Shuttlecock.lining;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class linings {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "badmintonShutterCockLining:600:" + quantity;
                case 2 -> productInfo = "badmintonShutterCockLining:450:" + quantity;
                case 3 -> productInfo = "badmintonShutterCockLining:500:" + quantity;
                case 4 -> productInfo = "badmintonShutterCockLining:350:" + quantity;
                case 5 -> productInfo = "badmintonShutterCockLining:550:" + quantity;
                case 6 -> productInfo = "badmintonShutterCockLining:620:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
