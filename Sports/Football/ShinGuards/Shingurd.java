package Sports.Football.ShinGuards;

import Listing.list;
import MRP.Price;
import Sports.Football.ShinGuards.Adidas.addishin;
import Sports.Football.ShinGuards.Nike.nikeshiv;
import Sports.Football.ShinGuards.Nivia.niviashin;
import Sports.Football.ShinGuards.Puma.pumashin;
import java.util.Scanner;

public class Shingurd {
    public static void shin(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\Sports\\Football\\ShinGuards\\ShinGuards.txt",
                    "========== Play tough, stay protected—find the shinguards that let you dominate! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Nike
                    String path = "Data\\Sports\\Football\\ShinGuards\\Nike\\Nike.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    nikeshiv.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Addidas
                    String path = "Data\\Sports\\Football\\ShinGuards\\Adidas\\Adidas.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    addishin.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the Puma
                    String path = "Data\\Sports\\Football\\ShinGuards\\Puma\\Puma.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    pumashin.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the Nivia
                    String path = "Data\\Sports\\Football\\ShinGuards\\Puma\\Puma.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    niviashin.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
