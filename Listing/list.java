package Listing;
import Items.item;
import clear.clear;
public class list {
    // Print welcome message with the user's name
    public static void printName(String name) {
        System.out.println("====================================================================");
        System.out.println("                   " + "Welcome " + name + " to SwiftShop          ");
        System.out.println("====================================================================");
    }

    public static void sp(String UserName , String PathName , String abbrevation) {
        //welcoming the user
        clear.clc();
        printName(UserName);
        System.out.println("");
        String abbre = abbrevation ;
        item.hmenu(abbre, PathName);
        System.out.println("\n---------------------------------------------------");
        System.out.print("Please Choose a Category to Explore : ");
        
    }
}
