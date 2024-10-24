package FreshVegetable.Carrot;

import FreshVegetable.Carrot.AmazonFresh.amazoncarrot;
import FreshVegetable.Carrot.BigBasket.bbc;
import FreshVegetable.Carrot.FreshToHome.fth;
import FreshVegetable.Carrot.RelianceFresh.rft;
import Listing.list;
import MRP.Price;
import java.util.Scanner;
public class Carrot {
    public static void carrrot(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits){
        list.sp(UserName, "Data\\FreshVegetable\\Carrot\\Carrot.txt", "================= Carrots add flavor and health! ===================");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Bigbasket
                    String path = "Data\\FreshVegetable\\Carrot\\BigBasket\\BigBasket.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bbc.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the FreshToHome
                    String path = "Data\\FreshVegetable\\Carrot\\FreshToHome\\FreshToHome.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    fth.Product(product, quantity);
                }
                case 3->{
                    //Data for the RelianceFresh
                    String path = "Data\\FreshVegetable\\Carrot\\RelianceFresh\\RelianceFresh.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    rft.Product(product, quantity);
                }
                case 4->{
                    //Data for AmazonFresh
                    String path = "Data\\FreshVegetable\\Carrot\\AmazonFresh\\AmazonFresh.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    amazoncarrot.Product(product, quantity);
                }
                case 5->{
                    exits = true; 
                }
                
            }
        }
    }
}
