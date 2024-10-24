package Gifts.WristWatch;

import Gifts.WristWatch.Casio.Casio;
import Gifts.WristWatch.DanielWellington.DanielWellington;
import Gifts.WristWatch.Fossil.Fossile;
import Gifts.WristWatch.Titan.titan;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class WrritsWatch {
    public static void watch(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {

            list.sp(UserName, "Data\\Gifts\\WristWatch\\WristWatch.txt",
                    "========== Discover our stunning wristwatch collection! ============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Titan
                    String path = "Data\\Gifts\\WristWatch\\Titan\\Titan.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    titan.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Fossil
                    String path = "Data\\Gifts\\WristWatch\\Fossil\\Fossil.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Fossile.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the Casio
                    String path = "Data\\Gifts\\WristWatch\\Casio\\Casio.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Casio.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the DanielWellington
                    String path = "Data\\Gifts\\WristWatch\\DanielWellington\\DanielWellington.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    DanielWellington.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
                
            }
        }
    }
}
