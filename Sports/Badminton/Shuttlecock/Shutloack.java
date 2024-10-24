package Sports.Badminton.Shuttlecock;

import Listing.list;
import MRP.Price;
import Sports.Badminton.Shuttlecock.Ashaway.ahways;
import Sports.Badminton.Shuttlecock.Victor.victors;
import Sports.Badminton.Shuttlecock.Yonex.yonexs;
import Sports.Badminton.Shuttlecock.lining.linings;
import java.util.Scanner;

public class Shutloack {
    public static void shutlock(String UserName, Scanner sc) {
        boolean exists = false;
        while (!exists) {

            list.sp(UserName, "Data\\Sports\\Badminton\\Shuttlecock\\Shuttlecock.txt",
                    "========== Shop now! Elevate Badminton ShutLoack with new gear! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Yonex
                    String path = "Data\\Sports\\Badminton\\Shuttlecock\\Yonex\\Yonex.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    yonexs.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Li-Ning
                    String path = "Data\\Sports\\Badminton\\Shuttlecock\\Li-Ning\\Li-Ning.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    linings.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the Victor
                    String path = "Data\\Sports\\Badminton\\Shuttlecock\\Victor\\Victor.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    victors.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the Ashaway
                    String path = "Data\\Sports\\Badminton\\Shuttlecock\\Ashaway\\Ashaway.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    ahways.Product(product, quantity);
                }
                case 5 -> {
                    exists = true;
                }
            }
        }

    }
}
