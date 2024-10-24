package FreshVegetable.Cabbage;
import FreshVegetable.Cabbage.AmazonFresh.Amazonproice;
import FreshVegetable.Cabbage.BigBasket.BigBasket;
import FreshVegetable.Cabbage.FreshToHome.FreshToHome;
import FreshVegetable.Cabbage.RelianceFresh.RelianceFresh;
import Listing.list;
import MRP.Price;
import java.util.Scanner;
public class Cabbage {
    public static void cabbage(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits){
        list.sp(UserName, "Data\\FreshVegetable\\Cabbage\\Cabbage.txt", "================ Elevate meals with fresh cabbage! =================");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Bigbasket
                    String path = "Data\\FreshVegetable\\Cabbage\\BigBasket\\BigBasket.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    BigBasket.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the FreshToHome
                    String path = "Data\\FreshVegetable\\Cabbage\\FreshToHome\\FreshToHome.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    FreshToHome.Product(product, quantity);
                }
                case 3->{
                    //Data for the RelianceFresh
                    String path = "Data\\FreshVegetable\\Cabbage\\RelianceFresh\\RelianceFresh.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    RelianceFresh.Product(product, quantity);
                }
                case 4->{
                    //Data for AmazonFresh
                    String path = "Data\\FreshVegetable\\Cabbage\\AmazonFresh\\AmazonFresh.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Amazonproice.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                
            }
        }
    }
}
