package FreshVegetable.Tomato;

import FreshVegetable.Tomato.AmazonFresh.amzt;
import FreshVegetable.Tomato.BigBasket.bigt;
import FreshVegetable.Tomato.FreshToHome.freshtohomet;
import FreshVegetable.Tomato.RelianceFresh.reliancet;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class Tomato {
    public static void tomato(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {

            list.sp(UserName, "Data\\FreshVegetable\\Tomato\\Tomato.txt",
                    "============ Discover juicy, flavorful fresh tomatoes! =============");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Bigbasket
                    String path = "Data\\FreshVegetable\\Tomato\\BigBasket\\BigBasket.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bigt.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the FreshToHome
                    String path = "Data\\FreshVegetable\\Tomato\\FreshToHome\\FreshToHome.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    freshtohomet.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the RelianceFresh
                    String path = "Data\\FreshVegetable\\Tomato\\RelianceFresh\\RelianceFresh.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    reliancet.Product(product, quantity);
                }
                case 4 -> {
                    // Data for AmazonFresh
                    String path = "Data\\FreshVegetable\\Tomato\\AmazonFresh\\AmazonFresh.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    amzt.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
                
            }
        }
    }
}
