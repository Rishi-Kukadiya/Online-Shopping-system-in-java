package Sports.Badminton.Grip.Victor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class victorg {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "badmintonGripVictor:150:" + quantity;
                case 2 -> productInfo = "badmintonGripVictor:100:" + quantity;
                case 3 -> productInfo = "badmintonGripVictor:120:" + quantity;
                case 4 -> productInfo = "badmintonGripVictor:90:" + quantity;
                case 5 -> productInfo = "badmintonGripVictor:130:" + quantity;
                case 6 -> productInfo = "badmintonGripVictor:160:" + quantity;
                default -> productInfo = "badmintonGripVictor:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
