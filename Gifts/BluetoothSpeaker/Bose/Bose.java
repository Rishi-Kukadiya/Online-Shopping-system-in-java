package Gifts.BluetoothSpeaker.Bose;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Bose {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BoseSpeaker:15000:" + quantity;
                case 2 -> productInfo = "BoseSpeaker:12000:" + quantity;
                case 3 -> productInfo = "BoseSpeaker:13000:" + quantity;
                case 4 -> productInfo = "BoseSpeaker:11000:" + quantity;
                case 5 -> productInfo = "BoseSpeaker:14000:" + quantity;
                case 6 -> productInfo = "BoseSpeaker:16000:" + quantity;
                default -> productInfo = "BoseSpeaker:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
