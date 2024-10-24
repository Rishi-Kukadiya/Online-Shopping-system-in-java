package Snacks.Biscuits;
import Listing.list;
import MRP.Price;
import Snacks.Biscuits.Britannia.britania;
import Snacks.Biscuits.ParleG.parlg;
import Snacks.Biscuits.Sunfeast.sunfest;
import Snacks.Biscuits.Unibic.unibiscuit;
import java.util.Scanner;
public class Biscuits {
    public static void bis(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits) {
        list.sp(UserName, "Data\\Snacks\\Biscuits\\Biscuits.txt", "================ Enjoy our biscuits with every sip! ================");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    String path="Data\\Snacks\\Biscuits\\ParleG\\ParleG.txt";
                    Price.mrp(path,UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    parlg.Product(product, quantity);
                }
                case 2 -> {
                    String path="Data\\Snacks\\Biscuits\\Britannia\\Britannia.txt";
                    Price.mrp(path,UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    britania.Product(product, quantity);
                }
                case 3->{
                    String path="Data\\Snacks\\Biscuits\\Sunfeast\\Sunfeast.txt";
                    Price.mrp(path,UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    sunfest.Product(product, quantity);
                }
                case 4->{
                    String path="Data\\Snacks\\Biscuits\\Unibic\\Unibic.txt";
                    Price.mrp(path,UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    unibiscuit.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
