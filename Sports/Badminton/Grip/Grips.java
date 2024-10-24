package Sports.Badminton.Grip;

import Listing.list;
import MRP.Price;
import Sports.Badminton.Grip.Ashaway.ashawayg;
import Sports.Badminton.Grip.Victor.victorg;
import Sports.Badminton.Grip.Yonex.yonexg;
import Sports.Badminton.Grip.lining.liningg;
import java.util.Scanner;

public class Grips {
    public static void grip(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\Sports\\Badminton\\Grip\\Grip.txt",
                    "========== Shop now! Elevate Badminton Grips with new gear! ==============");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Yonex
                    String path = "Data\\Sports\\Badminton\\Grip\\Yonex\\Yonex.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    yonexg.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Li-Ning
                    String path = "Data\\Sports\\Badminton\\Grip\\Li-Ning\\Li-Ning.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    liningg.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the Victor
                    String path = "Data\\Sports\\Badminton\\Grip\\Victor\\Victor.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    victorg.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the Ashaway
                    String path = "Data\\Sports\\Badminton\\Grip\\Ashaway\\Ashaway.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    ashawayg.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
            }
        }

    }
}
