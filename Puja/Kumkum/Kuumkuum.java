package Puja.Kumkum;

import Listing.list;
import MRP.Price;
import Puja.Kumkum.Haldirams.hdram;
import Puja.Kumkum.Kamdhenu.kamdehnu;
import Puja.Kumkum.Paras.paras;
import Puja.Kumkum.Patanjali.patanjali;
import java.util.Scanner;

public class Kuumkuum {
    public static void ku(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\Puja\\Kumkum\\Kumkum.txt",
                    "============= Purify your space with premium kapoor! ===============");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Haldirams
                    String path = "Data\\Puja\\Kumkum\\Haldirams\\Haldirams.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    hdram.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Patanjali
                    String path = "Data\\Puja\\Kumkum\\Patanjali\\Patanjali.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    patanjali.Product(product, quantity);

                }
                case 3 -> {
                    // data for the Kamdhenu
                    String path = "Data\\Puja\\Kumkum\\Kamdhenu\\Kamdhenu.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    kamdehnu.Product(product, quantity);
                }
                case 4 -> {
                    // data for the Paras
                    String path = "Data\\Puja\\Kumkum\\Paras\\Paras.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    paras.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
            }
        }
    }
}
