package Items ;
import java.io.File;
import java.util.Scanner;

public class item {
    public static void hmenu(String abbrevtion , String PathName){
        System.out.println(abbrevtion);
        //opening the file for the menubar
        try {
            File file = new File(PathName);
            try(Scanner sc = new Scanner(file)){
                String data[] = sc.nextLine().split(":");
                int count = 1 ;
                for (String s : data) {
                    System.out.println(count + " : " + s);
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
