package Sports.Badminton.BadmintonShoes.Ashaway;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ashwayshoes {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "badmintonShoesAshway:4800:" + quantity;
                case 2 -> productInfo = "badmintonShoesAshway:3200:" + quantity;
                case 3 -> productInfo = "badmintonShoesAshway:4000:" + quantity;
                case 4 -> productInfo = "badmintonShoesAshway:2700:" + quantity;
                case 5 -> productInfo = "badmintonShoesAshway:4300:" + quantity;
                case 6 -> productInfo = "badmintonShoesAshway:5000:" + quantity;
                default -> productInfo = "badmintonShoesAshway:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
