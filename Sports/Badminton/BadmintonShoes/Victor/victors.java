package Sports.Badminton.BadmintonShoes.Victor;
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
                case 1 -> productInfo = "badmintonShoesVictor:6000:" + quantity;
                case 2 -> productInfo = "badmintonShoesVictor:4000:" + quantity;
                case 3 -> productInfo = "badmintonShoesVictor:5000:" + quantity;
                case 4 -> productInfo = "badmintonShoesVictor:3500:" + quantity;
                case 5 -> productInfo = "badmintonShoesVictor:5300:" + quantity;
                case 6 -> productInfo = "badmintonShoesVictor:6200:" + quantity;
                default -> productInfo = "badmintonShoesVictor:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
