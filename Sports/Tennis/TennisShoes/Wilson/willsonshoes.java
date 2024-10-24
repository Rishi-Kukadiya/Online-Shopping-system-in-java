package Sports.Tennis.TennisShoes.Wilson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class willsonshoes {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisShoesWilson:7500:" + quantity;
                case 2 -> productInfo = "TennisShoesWilson:5200:" + quantity;
                case 3 -> productInfo = "TennisShoesWilson:6500:" + quantity;
                case 4 -> productInfo = "TennisShoesWilson:4200:" + quantity;
                case 5 -> productInfo = "TennisShoesWilson:7000:" + quantity;
                case 6 -> productInfo = "TennisShoesWilson:7800:" + quantity;
                default -> productInfo = "TennisShoesWilson:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
