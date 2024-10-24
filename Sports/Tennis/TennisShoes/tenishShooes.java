package Sports.Tennis.TennisShoes;

import Listing.list;
import MRP.Price;
import Sports.Tennis.TennisShoes.Babolat.Balbot;
import Sports.Tennis.TennisShoes.Head.headshoes;
import Sports.Tennis.TennisShoes.Wilson.willsonshoes;
import Sports.Tennis.TennisShoes.Yonex.yonexshoes;
import java.util.Scanner;

public class tenishShooes {
    public static void shoo(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\Sports\\Tennis\\TennisShoes\\TennisShoes.txt",
                    "========== Play with speed and agility—find the perfect tennis shoes for every court! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Wilson
                    String path = "Data\\Sports\\Tennis\\TennisShoes\\Wilson\\Wilson.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    willsonshoes.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Head
                    String path = "Data\\Sports\\Tennis\\TennisShoes\\Head\\Head.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    headshoes.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the Babplot
                    String path = "Data\\Sports\\Tennis\\TennisShoes\\Babolat\\Babolat.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Balbot.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the Yonex
                    String path = "Data\\Sports\\Tennis\\TennisShoes\\Yonex\\Yonex.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    yonexshoes.Product(product, quantity);
                }
                case  5 ->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
