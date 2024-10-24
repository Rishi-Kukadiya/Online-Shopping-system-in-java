package FreshVegetable.Onion;

import FreshVegetable.Onion.AmazonFresh.amzo;
import FreshVegetable.Onion.BigBasket.Bigo;
import FreshVegetable.Onion.FreshToHome.ftohomeo;
import FreshVegetable.Onion.RelianceFresh.relinceo;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class Onion {
    public static void onion(String UserName,Scanner sc) {
        boolean exits = false;
        while(!exits){
        list.sp(UserName, "Data\\FreshVegetable\\Onion\\Onion.txt",
                "=============== Unlock delicious meals with onions! ================");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Bigbasket
                    String path = "Data\\FreshVegetable\\Onion\\BigBasket\\BigBasket.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Bigo.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the FreshToHome
                    String path = "Data\\FreshVegetable\\Onion\\FreshToHome\\FreshToHome.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    ftohomeo.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the RelianceFresh
                    String path = "Data\\FreshVegetable\\Onion\\RelianceFresh\\RelianceFresh.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    relinceo.Product(product, quantity);
                }
                case 4 -> {
                    // Data for AmazonFresh
                    String path = "Data\\FreshVegetable\\Onion\\AmazonFresh\\AmazonFresh.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    amzo.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
