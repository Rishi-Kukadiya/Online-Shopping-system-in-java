package DryFruits.Raisins;

import DryFruits.Raisins.Happilo.happilor;
import DryFruits.Raisins.Nutraj.nutr;
import DryFruits.Raisins.UrbanPlatter.upr;
import DryFruits.Raisins.Vedaka.vedakar;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class Raisins {
    public static void Raisins1(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {

            list.sp(UserName, "Data\\DryFruits\\Raisins\\Raisins.txt",
                    "========= Premium raisins: sweet, chewy, nutritious! ===============");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    String path = "Data\\DryFruits\\Raisins\\Nutraj\\Nutraj.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    nutr.Product(product, quantity);
                }
                case 2 -> {
                    String path = "Data\\DryFruits\\Raisins\\Happilo\\Happilo.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    happilor.Product(product, quantity);
                }
                case 3 -> {
                    String path = "Data\\DryFruits\\Raisins\\UrbanPlatter\\UrbanPlatter.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    upr.Product(product, quantity);
                }
                case 4 -> {
                    String path = "Data\\DryFruits\\Raisins\\Vedaka\\Vedaka.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    vedakar.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
               
            }
        }

    }
}
