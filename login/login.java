package login;
import clear.clear;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class loginUser {
    protected String UserName;
    protected String Password;
    protected boolean isPresent = false;

    // Constructor for username and password
    loginUser(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
        this.isPresent = Login();  // Validate login credentials
    }

    // Getting the data from the user.txt file and validate login credentials
    private boolean Login() {
        boolean isFound = false;
        try {
            File file = new File("user.txt");
            
            // Ensure file exists before attempting to read
            if (!file.exists()) {
                System.out.println("Error: File not found.");
                return false;
            }
            
            try (Scanner sc = new Scanner(file)) {
                while (sc.hasNextLine()) {
                    String[] data = sc.nextLine().split(":");
                    if (data.length >= 3 && data[0].equals(this.UserName) && data[2].equals(this.Password)) {
                        isFound = true;  // Login successful
                        break;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return isFound;  // Return whether the user was found
    }
}

public class login {
    public static String lg() {
        // Welcoming the user to the platform
        clear.clc();  // Clear the screen (assuming clear.clc() is implemented properly)
        System.out.println("===================================================");
        System.out.println("               Welcome to SwiftShop                ");
        System.out.println("===================================================");

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String UserName, Password;

        // Ensure there is input available
        System.out.print("Enter the UserName : ");
        if (sc.hasNextLine()) {
            UserName = sc.nextLine();
        } else {
            System.out.println("No input detected.");
            return null;
        }

        System.out.print("Enter the Password : ");
        if (sc.hasNextLine()) {
            Password = sc.nextLine();
        } else {
            System.out.println("No input detected.");
            return null;
        }

        // Validate user login
        loginUser ls = new loginUser(UserName, Password);
        if (ls.isPresent) {
            return UserName;  // Return UserName if login is successful
        } else {
            System.out.println("\n----------------" + UserName + " is Not found !!!----------------");
            return null;
        }
    }
}
