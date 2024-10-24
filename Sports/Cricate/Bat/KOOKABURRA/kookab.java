package Sports.Cricate.Bat.KOOKABURRA;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class kookab {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketBatkookaBurra:890:" + quantity;
                case 2 -> productInfo = "CricketBatkookaBurra:2400:" + quantity;
                case 3 -> productInfo = "CricketBatkookaBurra:1700:" + quantity;
                case 4 -> productInfo = "CricketBatkookaBurra:1900:" + quantity;
                case 5 -> productInfo = "CricketBatkookaBurra:700:" + quantity;
                // case 6 -> productInfo = "CricketBatGM:1000:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
