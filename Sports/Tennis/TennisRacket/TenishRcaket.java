package Sports.Tennis.TennisRacket;

import Listing.list;
import MRP.Price;
import Sports.Tennis.TennisRacket.Babolat.balbotracket;
import Sports.Tennis.TennisRacket.Head.Headracket;
import Sports.Tennis.TennisRacket.Wilson.Wiilonracket;
import Sports.Tennis.TennisRacket.Yonex.yonexracket;
import java.util.Scanner;

public class TenishRcaket {
    public static void racket(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\Sports\\Tennis\\TennisRacket\\TennisRacket.txt",
                    "========== Swing for the stars—find your perfect tennis racket today! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Wilson
                    String path = "Data\\Sports\\Tennis\\TennisRacket\\Wilson\\Wilson.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Wiilonracket.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Head
                    String path = "Data\\Sports\\Tennis\\TennisRacket\\Head\\Head.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Headracket.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the Babplot
                    String path = "Data\\Sports\\Tennis\\TennisRacket\\Babolat\\Babolat.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    balbotracket.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the Yonex
                    String path = "Data\\Sports\\Tennis\\TennisRacket\\Yonex\\Yonex.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    yonexracket.Product(product, quantity);
                }
                case 6 -> {
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
