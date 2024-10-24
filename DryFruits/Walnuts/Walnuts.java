package DryFruits.Walnuts;

import DryFruits.Walnuts.Happilo.happilow;
import DryFruits.Walnuts.Nutraj.nutrajw;
import DryFruits.Walnuts.UrbanPlatter.urbanpaltw;
import DryFruits.Walnuts.Vedaka.Vedakaw;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class Walnuts {
    public static void Walnuts1(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {

            list.sp(UserName, "Data\\DryFruits\\Walnuts\\Walnuts.txt",
                    "============= Boost brainpower with nutritious goodness! ============");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    String path = "Data\\DryFruits\\Walnuts\\Nutraj\\Nutraj.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    nutrajw.Product(product, quantity);
                }
                case 2 -> {

                    String path = "Data\\DryFruits\\Walnuts\\Happilo\\Happilo.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    happilow.Product(product, quantity);

                }
                case 3 -> {

                    String path = "Data\\DryFruits\\Walnuts\\UrbanPlatter\\UrbanPlatter.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    urbanpaltw.Product(product, quantity);
                }
                case 4 -> {
                    String path = "Data\\DryFruits\\Walnuts\\Vedaka\\Vedaka.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Vedakaw.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
