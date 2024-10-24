package Gifts.BluetoothSpeaker.Sony;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Sony {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "SonySpeaker:7000:" + quantity;
                case 2 -> productInfo = "SonySpeaker:5000:" + quantity;
                case 3 -> productInfo = "SonySpeaker:6000:" + quantity;
                case 4 -> productInfo = "SonySpeaker:4000:" + quantity;
                case 5 -> productInfo = "SonySpeaker:6500:" + quantity;
                case 6 -> productInfo = "SonySpeaker:7500:" + quantity;
                default -> productInfo = "SonySpeaker:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
