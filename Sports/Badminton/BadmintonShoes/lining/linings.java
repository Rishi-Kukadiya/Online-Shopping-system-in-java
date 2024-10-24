package Sports.Badminton.BadmintonShoes.lining;
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
                case 1 -> productInfo = "badmintonShoesLinings:5500:" + quantity;
                case 2 -> productInfo = "badmintonShoesLinings:3700:" + quantity;
                case 3 -> productInfo = "badmintonShoesLinings:4500:" + quantity;
                case 4 -> productInfo = "badmintonShoesLinings:3200:" + quantity;
                case 5 -> productInfo = "badmintonShoesLinings:4800:" + quantity;
                case 6 -> productInfo = "badmintonShoesLinings:5700:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
