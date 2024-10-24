package Sports.Football.FootballBoots;
import Listing.list;
import MRP.Price;
import Sports.Football.FootballBoots.Adidas.addiboot;
import Sports.Football.FootballBoots.Nike.nikeboot;
import Sports.Football.FootballBoots.Nivia.niviboot;
import Sports.Football.FootballBoots.Puma.pumaboot;
import java.util.Scanner;
public class FootballBoots {
    public static void ftbs(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits) {
        list.sp(UserName, "Data\\Sports\\Football\\FootballBoots\\FootballBoots.txt", "========== Own the pitch with boots that keep you a step ahead—shop now! ==============");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Nike
                    String path = "Data\\Sports\\Football\\FootballBoots\\Nike\\Nike.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    nikeboot.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the Addidas
                    String path = "Data\\Sports\\Football\\FootballBoots\\Adidas\\Adidas.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    addiboot.Product(product, quantity);
                }
                case 3->{
                    //Data for the Puma
                    String path = "Data\\Sports\\Football\\FootballBoots\\Puma\\Puma.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    pumaboot.Product(product, quantity);
                }
                case 4->{
                    //Data for the Nivia
                    String path = "Data\\Sports\\Football\\FootballBoots\\Nivia\\Nivia.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    niviboot.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
