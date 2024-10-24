package Sports.Tennis.TennisShoes.Head;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class headshoes {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisShoesHead:8000:" + quantity;
                case 2 -> productInfo = "TennisShoesHead:5500:" + quantity;
                case 3 -> productInfo = "TennisShoesHead:7000:" + quantity;
                case 4 -> productInfo = "TennisShoesHead:4500:" + quantity;
                case 5 -> productInfo = "TennisShoesHead:7500:" + quantity;
                case 6 -> productInfo = "TennisShoesHead:8500:" + quantity;
                default -> productInfo = "TennisShoesHead:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
