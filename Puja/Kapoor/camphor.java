package Puja.Kapoor;

import Listing.list;
import MRP.Price;
import Puja.Kapoor.MangalamCamphor.mangalkappor;
import Puja.Kapoor.PatanjaliCamphor.patanjaliKapooor;
import Puja.Kapoor.PurePrayer.pp;
import Puja.Kapoor.SriSatymev.sristymev;
import java.util.Scanner;

public class camphor {
    public static void kap(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {

            list.sp(UserName, "Data\\Puja\\Kapoor\\Kapoor.txt",
                    "============== Purify your space with premium kapoor! ==============");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the MangalamCamphor
                    String path = "Data\\Puja\\Kapoor\\MangalamCamphor\\MangalamCamphor.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    mangalkappor.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the SriSatymev
                    String path = "Data\\Puja\\Kapoor\\SriSatymev\\SriSatymev.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    sristymev.Product(product, quantity);
                }
                case 3 -> {
                    // data for the PatanjaliCamphor
                    String path = "Data\\Puja\\Kapoor\\PatanjaliCamphor\\PatanjaliCamphor.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    patanjaliKapooor.Product(product, quantity);
                }
                case 4 -> {
                    // data for the PurePrayer
                    String path = "Data\\Puja\\Kapoor\\PurePrayer\\PurePrayer.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    pp.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
