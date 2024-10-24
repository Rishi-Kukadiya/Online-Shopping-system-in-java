package Sports.Badminton.Grip.lining;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class liningg {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "badmintonGripLinig:120:" + quantity;
                case 2 -> productInfo = "badmintonGripLinig:90:" + quantity;
                case 3 -> productInfo = "badmintonGripLinig:100:" + quantity;
                case 4 -> productInfo = "badmintonGripLinig:80:" + quantity;
                case 5 -> productInfo = "badmintonGripLinig:110:" + quantity;
                case 6 -> productInfo = "badmintonGripLinig:130:" + quantity;
                default -> productInfo = "badmintonGripLinig:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
