package DryFruits.Cashews;
import DryFruits.Cashews.Happilo.happiloc;
import DryFruits.Cashews.Nutraj.nutrajc;
import DryFruits.Cashews.UrbanPlatter.urbanc;
import DryFruits.Cashews.Vedaka.Vedakac;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class Cashews {
    public static void Cashews1(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits){
        list.sp(UserName, "Data\\DryFruits\\Cashews\\Cashews.txt", "========= Premium cashews: creamy, crunchy, delicious! =============");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    String path = "Data\\DryFruits\\Cashews\\Nutraj\\Nutraj.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    nutrajc.Product(product, quantity);
                }
                case 2 -> {
                    String path = "Data\\DryFruits\\Cashews\\Happilo\\Happilo.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    happiloc.Product(product, quantity);
                }   
                case 3->{
                    String path = "Data\\DryFruits\\Cashews\\UrbanPlatter\\UrbanPlatter.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    urbanc.Product(product, quantity);
                }
                case 4->{
                    String path = "Data\\DryFruits\\Cashews\\Vedaka\\Vedaka.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Vedakac.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                
            }
        }

    }
}
