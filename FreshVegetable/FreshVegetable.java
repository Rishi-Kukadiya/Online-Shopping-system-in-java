package FreshVegetable;

import FreshVegetable.Cabbage.Cabbage;
import FreshVegetable.Carrot.Carrot;
import FreshVegetable.Onion.Onion;
import FreshVegetable.Potato.Potato;
import FreshVegetable.Tomato.Tomato;
import Listing.list;
import java.util.Scanner;
public class FreshVegetable {
    public static void fv(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits) {
        list.sp(UserName, "Data\\FreshVegetable\\FreshVegetable.txt", "============ Farm-fresh premium vegetables delivered! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Tomato
                    Tomato.tomato(UserName,sc);
                }
                case 2 -> {
                    //Data for the Potato
                    Potato.potato(UserName,sc);
                }
                case 3->{
                    //Data for the ONION
                    Onion.onion(UserName,sc);
                }
                case 4->{
                    //Data for cabbage
                    Cabbage.cabbage(UserName,sc);
                }
                case 5->{
                    //Data for the Carrot
                    Carrot.carrrot(UserName,sc);
                }
                case 6->{
                   exits = true;
                }
                
            }
        }
    }
}
