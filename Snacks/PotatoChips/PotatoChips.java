package Snacks.PotatoChips;

import Listing.list;
import MRP.Price;
import Snacks.PotatoChips.Bingo.bingopota;
import Snacks.PotatoChips.Lay.layies;
import Snacks.PotatoChips.Pringles.pigal;
import Snacks.PotatoChips.UncleChipps.unclechheps;
import java.util.Scanner;

public class PotatoChips {
    public static void pot(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\Snacks\\PotatoChips\\PotatoChips.txt",
                    "=========== Enjoy our flavorful potato chips anytime! ==============");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data For Lays
                    String path = "Data\\Snacks\\PotatoChips\\Lay\\Lay.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    layies.Product(product, quantity);
                }
                case 2 -> {
                    String path = "Data\\Snacks\\PotatoChips\\Pringles\\Pringles.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    pigal.Product(product, quantity);
                }
                case 3 -> {
                    String path = "Data\\Snacks\\PotatoChips\\Bingo\\Bingo.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bingopota.Product(product, quantity);
                }
                case 4 -> {
                    String path = "Data\\Snacks\\PotatoChips\\UncleChipps\\UncleChipps.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    unclechheps.Product(product, quantity);
                }

                case 5 -> {
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
