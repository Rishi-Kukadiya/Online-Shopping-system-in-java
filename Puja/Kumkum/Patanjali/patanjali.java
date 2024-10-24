package Puja.Kumkum.Patanjali;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class patanjali {
                 public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "PatanjaliKumKum:400:" + quantity;
                case 2 -> productInfo = "PatanjaliKumKum:130:" + quantity;
                case 3 -> productInfo = "PatanjaliKumKum:250:" + quantity;
                case 4 -> productInfo = "PatanjaliKumKum:90:" + quantity;
                case 5 -> productInfo = "PatanjaliKumKum:380:" + quantity;
                case 6 -> productInfo = "PatanjaliKumKum:300:" + quantity;
                default -> productInfo = "PatanjaliKumKum:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
