package Puja.Agarbatti;
import Listing.list;
import MRP.Price;
import Puja.Agarbatti.CyclePureAgarbathies.pureAg;
import Puja.Agarbatti.Mangaldeep.mangaldeep1;
import Puja.Agarbatti.MokshAgarbatti.mokshagar;
import Puja.Agarbatti.ZedBlack.zedbalck;
import java.util.Scanner;
public class Agar {
    public static void ag(String UserName,Scanner sc) {
        boolean exits = false;
        while (!exits) {
        list.sp(UserName, "Data\\Puja\\Agarbatti\\Agarbatti.txt", "========== Experience tranquility with fragrant agarbatti! =========");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the CyclePureAgarbathies
                    String path = "Data\\Puja\\Agarbatti\\CyclePureAgarbathies\\CyclePureAgarbathies.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    pureAg.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Mangaldeep
                    String path = "Data\\Puja\\Agarbatti\\Mangaldeep\\Mangaldeep.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    mangaldeep1.Product(product, quantity);
                }
                case 3->{
                    // data for the ZedBlack
                    String path = "Data\\Puja\\Agarbatti\\ZedBlack\\ZedBlack.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    zedbalck.Product(product, quantity);
                }
                case 4->{
                    // data for the MokshAgarbatti
                    String path = "Data\\Puja\\Agarbatti\\MokshAgarbatti\\MokshAgarbatti.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    mokshagar.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
            }
        }
    }
}
