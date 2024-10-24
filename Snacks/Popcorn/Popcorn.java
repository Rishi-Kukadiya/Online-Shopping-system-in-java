package Snacks.Popcorn;

import Listing.list;
import MRP.Price;
import Snacks.Popcorn.A4700BC.anum;
import Snacks.Popcorn.ActII.Actll;
import Snacks.Popcorn.Pipo.pipopop;
import Snacks.Popcorn.PopcornTime.popcorn;
import java.util.Scanner;

public class Popcorn {
    public static void pop(String UserName, Scanner sc) {
        boolean exists = false;
        while (!exists) {

            list.sp(UserName, "Data\\Snacks\\Popcorn\\Popcorn.txt",
                    "================== Popcorn is a must-have snack! ===================");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    String path = "Data\\Snacks\\Popcorn\\ActII\\ActII.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Actll.Product(product, quantity);
                }
                case 2 -> {
                    String path = "Data\\Snacks\\Popcorn\\A4700BC\\A4700BC.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    anum.Product(product, quantity);
                }
                case 3 -> {
                    String path = "Data\\Snacks\\Popcorn\\Pipo\\Pipo.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    pipopop.Product(product, quantity);
                }
                case 4 -> {
                    String path = "Data\\Snacks\\Popcorn\\PopcornTime\\PopcornTime.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    popcorn.Product(product, quantity);
                }
                case 5 -> {
                    exists = true;
                }
            }
        }

    }

}
