package DryFruits.Pistachios;

import DryFruits.Pistachios.Happilo.happilop;
import DryFruits.Pistachios.Nutraj.Nutrajp;
import DryFruits.Pistachios.UrbanPlatter.urabanp;
import DryFruits.Pistachios.Vedaka.vedakap;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class Pistachios {
    public static void Pistachios1(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {

            list.sp(UserName, "Data\\DryFruits\\Pistachios\\Pistachios.txt",
                    "====== Premium pistachios: crunchy, flavorful, nutritious! =========");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    String path = "Data\\DryFruits\\Pistachios\\Nutraj\\Nutraj.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Nutrajp.Product(product, quantity);
                }
                case 2 -> {
                    String path = "Data\\DryFruits\\Pistachios\\Happilo\\Happilo.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    happilop.Product(product, quantity);
                }
                case 3 -> {
                    String path = "Data\\DryFruits\\Pistachios\\UrbanPlatter\\UrbanPlatter.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    urabanp.Product(product, quantity);
                }
                case 4 -> {
                    String path = "Data\\DryFruits\\Pistachios\\Vedaka\\Vedaka.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    vedakap.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
                
            }
        }

    }
}
