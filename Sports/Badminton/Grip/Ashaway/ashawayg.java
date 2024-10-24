package Sports.Badminton.Grip.Ashaway;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ashawayg {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "badmintonGripAshaway:130:" + quantity;
                case 2 -> productInfo = "badmintonGripAshaway:90:" + quantity;
                case 3 -> productInfo = "badmintonGripAshaway:110:" + quantity;
                case 4 -> productInfo = "badmintonGripAshaway:80:" + quantity;
                case 5 -> productInfo = "badmintonGripAshaway:120:" + quantity;
                case 6 -> productInfo = "badmintonGripAshaway:140:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}    
}
