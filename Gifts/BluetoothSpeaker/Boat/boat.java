package Gifts.BluetoothSpeaker.Boat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class boat {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BoatSpeaker:3500:" + quantity;
                case 2 -> productInfo = "BoatSpeaker:2500:" + quantity;
                case 3 -> productInfo = "BoatSpeaker:3000:" + quantity;
                case 4 -> productInfo = "BoatSpeaker:2000:" + quantity;
                case 5 -> productInfo = "BoatSpeaker:3200:" + quantity;
                case 6 -> productInfo = "BoatSpeaker:3700:" + quantity;
                default -> productInfo = "BoatSpeaker:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}


