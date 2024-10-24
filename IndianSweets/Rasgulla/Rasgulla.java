package IndianSweets.Rasgulla;

import IndianSweets.Rasgulla.Bikaji.bikajir;
import IndianSweets.Rasgulla.Bikanervala.bikanerr;
import IndianSweets.Rasgulla.Haldiram.haldiramr;
import IndianSweets.Rasgulla.kcdas.kcdas;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class Rasgulla {
    public static void ras(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\IndianSweets\\Rasgulla\\Rasgulla.txt",
                    "============== Savor our homemade rasgulla magic! ==================");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Haldiram
                    String path = "Data\\IndianSweets\\Rasgulla\\Haldiram\\Haldiram.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    haldiramr.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Bikhaji
                    String path = "Data\\IndianSweets\\Rasgulla\\Bikaji\\Bikaji.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bikajir.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the K.C.DAS
                    String path = "Data\\IndianSweets\\Rasgulla\\K.C.Das\\K.C.Das.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    kcdas.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the Bikanervalla
                    String path = "Data\\IndianSweets\\Rasgulla\\Bikanervala\\Bikanervala.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bikanerr.Product(product, quantity);
                }
                case 5 -> {
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
