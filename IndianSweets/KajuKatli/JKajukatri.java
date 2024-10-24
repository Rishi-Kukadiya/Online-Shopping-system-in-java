package IndianSweets.KajuKatli;

import IndianSweets.KajuKatli.Bikaji.bikajik;
import IndianSweets.KajuKatli.Bikanervala.bikanerk;
import IndianSweets.KajuKatli.ChhappanBhog.chappaan;
import IndianSweets.KajuKatli.Haldiram.haldiramk;
import Listing.list;
import MRP.Price;
import java.util.Scanner;
public class JKajukatri {
    public static void kaju(String UserName,Scanner sc) {
        boolean exits = false;
        while (!exits) {
        list.sp(UserName, "Data\\IndianSweets\\KajuKatli\\KajuKatli.txt", "================== Savor our premium kaju katli! ===================");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Haldiram
                    String path =  "Data\\IndianSweets\\KajuKatli\\Haldiram\\Haldiram.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    haldiramk.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the Bikhaji
                    String path =  "Data\\IndianSweets\\KajuKatli\\Bikaji\\Bikaji.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bikajik.Product(product, quantity);
                }
                case 3->{
                    //Data for the K.C.DAS
                    String path =  "Data\\IndianSweets\\KajuKatli\\ChhappanBhog\\ChhappanBhog.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    chappaan.Product(product, quantity);
                }
                case 4->{
                    //Data for the Bikanervalla
                    String path =  "Data\\IndianSweets\\KajuKatli\\Bikanervala\\Bikanervala.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bikanerk.Product(product, quantity);
                    
                }
                case 5->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
