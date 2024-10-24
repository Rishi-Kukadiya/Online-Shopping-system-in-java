package DryFruits.Almonds;
import DryFruits.Almonds.Happilo.happilo;
import DryFruits.Almonds.Nutraj.nutraj;
import DryFruits.Almonds.UrbanPlatter.urbanpatlat;
import DryFruits.Almonds.Vedaka.vedaka;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class Almonds {
    public static void Almonds1(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits){
        list.sp(UserName, "Data\\DryFruits\\Almonds\\Almonds.txt", "========= Premium almonds: nutritious, crunchy, healthy! ===========");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Nutraj
                    String path = "Data\\DryFruits\\Almonds\\Nutraj\\Nutraj.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    nutraj.Product(product, quantity);
                }
                case 2 -> {
                    String path = "Data\\DryFruits\\Almonds\\Happilo\\Happilo.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    happilo.Product(product, quantity);
                }
                case 3->{
                    String path = "Data\\DryFruits\\Almonds\\UrbanPlatter\\UrbanPlatter.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    urbanpatlat.Product(product, quantity);
                }
                case 4->{
                    
                    String path = "Data\\DryFruits\\Almonds\\Vedaka\\Vedaka.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    vedaka.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
