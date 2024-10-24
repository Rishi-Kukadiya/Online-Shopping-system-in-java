package Snacks.Namkeen;
import Listing.list;
import MRP.Price;
import Snacks.Namkeen.Bikaji.bikajin;
import Snacks.Namkeen.Bikanervala.bikarnervala;
import Snacks.Namkeen.Garden.gardarn;
import Snacks.Namkeen.Haldiram.haldiramn;
import java.util.Scanner;
public class Namkeen {
    public static void nam(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits) {
        list.sp(UserName, "Data\\Snacks\\Namkeen\\Namkeen.txt", "=============== Savor the taste of authentic namkeen! ==============");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    String path="Data\\Snacks\\Namkeen\\Haldiram\\Haldiram.txt";
                    Price.mrp(path,UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    haldiramn.Product(product, quantity);
                }
                case 2 -> {
                    String path="Data\\Snacks\\Namkeen\\Bikaji\\Bikaji.txt";
                    Price.mrp(path,UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bikajin.Product(product, quantity);
                }
                case 3->{
                    String path="Data\\Snacks\\Namkeen\\Bikanervala\\Bikanervala.txt";
                    Price.mrp(path,UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bikarnervala.Product(product, quantity);
                }
                case 4->{
                    String path="Data\\Snacks\\Namkeen\\Garden\\Garden.txt";
                    Price.mrp(path,UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    gardarn.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
            }
        }

    }
}
