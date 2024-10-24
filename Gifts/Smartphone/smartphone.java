package Gifts.Smartphone;

import Gifts.Smartphone.Apple.apple;
import Gifts.Smartphone.OnePlus.oneplus;
import Gifts.Smartphone.Samsung.samsugn;
import Gifts.Smartphone.Xiaomi.xiomi;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class smartphone {
    public static void smph(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\Gifts\\Smartphone\\Smartphone.txt",
                    "============ Stay connected with stylish smartphones! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Apple
                    String path = "Data\\Gifts\\Smartphone\\Apple\\Apple.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    apple.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Samsung
                    String path = "Data\\Gifts\\Smartphone\\Samsung\\Samsung.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    samsugn.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the Oneplus
                    String path = "Data\\Gifts\\Smartphone\\OnePlus\\OnePlus.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    oneplus.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the Xiomi
                    String path = "Data\\Gifts\\Smartphone\\Xiaomi\\Xiaomi.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    xiomi.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
