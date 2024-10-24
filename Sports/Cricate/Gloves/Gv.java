package Sports.Cricate.Gloves;

import Listing.list;
import MRP.Price;
import Sports.Cricate.Ball.MRF.mrfb;
import Sports.Cricate.Gloves.Kookaburra.kkg;
import Sports.Cricate.Gloves.SG.sgc;
import Sports.Cricate.Gloves.SS.ssg;
import java.util.Scanner;

public class Gv {
    public static void golf(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\Sports\\cricket\\Gloves\\Gloves.txt",
                    "========== Shop now! Elevate Cricket Gloves with new gear! ==============");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the SS
                    String path = "Data\\Sports\\cricket\\Gloves\\SS\\SS.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    ssg.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the SG
                    String path = "Data\\Sports\\cricket\\Gloves\\SG\\SG.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    sgc.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the KOOKABOORA
                    String path = "Data\\Sports\\cricket\\Gloves\\Kookaburra\\Kookaburra.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    kkg.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the MRF
                    String path = "Data\\Sports\\cricket\\Gloves\\MRF\\MRF.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    mrfb.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
            }
        }
    }
}
