package FreshVegetable.Potato;

import FreshVegetable.Potato.AmazonFresh.amzep;
import FreshVegetable.Potato.BigBasket.bigbp;
import FreshVegetable.Potato.FreshToHome.frestohp;
import FreshVegetable.Potato.RelianceFresh.relincep;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class Potato {

    public static void potato(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {

            list.sp(UserName, "Data\\FreshVegetable\\Potato\\Potato.txt",
                    "================= Potatoes perfect for every meal! =================");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Bigbasket
                    String path = "Data\\FreshVegetable\\Potato\\BigBasket\\BigBasket.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bigbp.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the FreshToHome
                    String path = "Data\\FreshVegetable\\Potato\\FreshToHome\\FreshToHome.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    frestohp.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the RelianceFresh
                    String path = "Data\\FreshVegetable\\Potato\\RelianceFresh\\RelianceFresh.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    relincep.Product(product, quantity);
                }
                case 4 -> {
                    // Data for AmazonFresh
                    String path = "Data\\FreshVegetable\\Potato\\AmazonFresh\\AmazonFresh.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    amzep.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
                default ->
                    throw new AssertionError("Invalid choice, please try again.");
            }

        }
    }
}
