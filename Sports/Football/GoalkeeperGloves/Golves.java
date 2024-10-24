package Sports.Football.GoalkeeperGloves;

import Listing.list;
import MRP.Price;
import Sports.Football.GoalkeeperGloves.Adidas.glovekeepreglove;
import Sports.Football.GoalkeeperGloves.Nike.nikeg;
import Sports.Football.GoalkeeperGloves.Nivia.Nivia;
import Sports.Football.GoalkeeperGloves.Puma.pumaG;
import java.util.Scanner;

public class Golves {
    public static void golve(String UserName, Scanner sc) {
        boolean exists = false;
        while (!exists) {
            list.sp(UserName, "Data\\Sports\\Football\\GoalKeeperGloves\\GoalKeeperGloves.txt",
                    "========== Defend like a pro—discover goalkeeper gloves with unbeatable grip! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Nike
                    String path = "Data\\Sports\\Football\\GoalKeeperGloves\\Nike\\Nike.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    nikeg.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Addidas
                    String path = "Data\\Sports\\Football\\GoalKeeperGloves\\Adidas\\Adidas.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    glovekeepreglove.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the Puma
                    String path = "Data\\Sports\\Football\\GoalKeeperGloves\\Puma\\Puma.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    pumaG.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the Nivia
                    String path = "Data\\Sports\\Football\\GoalKeeperGloves\\Nivia\\Nivia.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Nivia.Product(product, quantity);
                }
                case 5 -> {
                    exists = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
