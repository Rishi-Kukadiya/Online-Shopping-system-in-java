package Puja.Diya;
import Listing.list;
import MRP.Price;
import Puja.Diya.Aaradhi.arradhi;
import Puja.Diya.Borrosill.borrosill;
import Puja.Diya.BrassKingdom.brasskingdom;
import Puja.Diya.DecorMart.Decormart;
import java.util.Scanner;
public class Diya {
    public static void di(String UserName,Scanner sc) {
        boolean exits = false;
        while (!exits) {
        list.sp(UserName, "Data\\Puja\\Diya\\Diya.txt", "============ Celebrate tradition with stunning diyas! ==============");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Borosil
                    String path = "Data\\Puja\\Diya\\Borosil\\Borosil.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    borrosill.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the DecorMart
                    String path = "Data\\Puja\\Diya\\DecorMart\\DecorMart.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Decormart.Product(product, quantity);
                }
                case 3->{
                    // data for the Aaradhi
                    String path = "Data\\Puja\\Diya\\Aaradhi\\Aaradhi.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    arradhi.Product(product, quantity);
                }
                case 4->{
                    // data for the BrassKingdom
                    String path = "Data\\Puja\\Diya\\BrassKingdom\\BrassKingdom.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    brasskingdom.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
