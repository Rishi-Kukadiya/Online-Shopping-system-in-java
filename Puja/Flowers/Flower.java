package Puja.Flowers;
import Listing.list;
import MRP.Price;
import Puja.Flowers.FernsNPetals.Fersnpetals;
import Puja.Flowers.FlowerAura.FlowerAura;
import Puja.Flowers.Interflora.interflora;
import Puja.Flowers.TheFlowerCompany.theflowercomppany;
import java.util.Scanner;
public class Flower {
    public static void fl(String UserName,Scanner sc) {
        boolean exits = false;
        while (!exits) {
        list.sp(UserName, "Data\\Puja\\Flowers\\Flowers.txt", "=========== Celebrate devotion with fragrant flowers! ==============");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the FlowerAura
                    String path = "Data\\Puja\\Flowers\\FlowerAura\\FlowerAura.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    FlowerAura.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the FernsNPetals
                    String path = "Data\\Puja\\Flowers\\FernsNPetals\\FernsNPetals.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Fersnpetals.Product(product, quantity);
                }
                case 3->{
                    // data for the TheFlowerCompany
                    String path = "Data\\Puja\\Flowers\\TheFlowerCompany\\TheFlowerCompany.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    theflowercomppany.Product(product, quantity);
                }
                case 4->{
                    // data for the Interflora
                    String path = "Data\\Puja\\Flowers\\Interflora\\Interflora.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    interflora.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
