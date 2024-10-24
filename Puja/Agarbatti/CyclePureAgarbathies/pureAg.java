package Puja.Agarbatti.CyclePureAgarbathies;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class pureAg {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CyclePureAgarbatti:1800:" + quantity;
                case 2 -> productInfo = "CyclePureAgarbatti:620:" + quantity;
                case 3 -> productInfo = "CyclePureAgarbatti:880:" + quantity;
                case 4 -> productInfo = "CyclePureAgarbatti:500:" + quantity;
                case 5 -> productInfo = "CyclePureAgarbatti:1600:" + quantity;
                case 6 -> productInfo = "CyclePureAgarbatti:1000:" + quantity;
                default -> productInfo="CyclePureAgarbatti:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
