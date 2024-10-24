package register;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// User Registration class for adding new Users
public class User {

    private String UserName;
    private String Email;
    private String Password;
    private String Address;
    private String Phone;

    // Regular expressions for validation
    private String regexUsername = "^[a-zA-Z0-9._@#$%^&*-]+$";
    private String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private String regexPhone = "^(?:\\+91|0)?[789]\\d{9}$";
    private String regexPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
    private String regexAddress = "^[\\d\\w\\s,.#-]+$";

    // Constructor for adding user details
    public User(String UserName, String Email, String Password, String Address, String Phone) {
        this.UserName = UserName.trim();   // Remove leading/trailing whitespace
        this.Email = Email.trim();
        this.Password = Password.trim();
        this.Address = Address.trim();
        this.Phone = Phone.trim();
    }

    // Method to add user data to the file
    public void AddUser() {
        try {
            File file = new File("user.txt");
            
            // Ensure the file exists or create it if necessary
            if (!file.exists()) {
                file.createNewFile();
            }

            // Writing user data to the file in append mode
            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write(this.UserName + ":" + this.Email + ":" + this.Password + ":" + this.Address + ":" + this.Phone + "\n");
            }

            System.out.println("\n----------------User successfully registered!----------------");

        } catch (IOException e) {
            System.out.println("\n----------------Error occurred while adding user. PLEASE TRY AGAIN!!----------------");
        }
    }

    //Method overloading for the forggot of the password method
    public static void AddUser(String data){
        try {
            File file = new File("user.txt");
            // Ensure the file exists or create it if necessary
            if (!file.exists()) {
                file.createNewFile();
            }

            // Writing user data to the file in append mode
            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write(data + "\n");
            }
        } catch (IOException e) {
            System.out.println("\n----------------Error occurred while adding user. PLEASE TRY AGAIN!!----------------");
        }
    }

    // Validate username format
    public boolean ValidateUserName() {
        if (this.UserName.matches(regexUsername)) {
            return true;
        } else {
            System.out.println("\n----------------Invalid Username. Please try again!----------------");
            return false;
        }
    }

    // Validate email format
    public boolean ValidateEmail() {
        if (this.Email.matches(regexEmail)) {
            return true;
        } else {
            System.out.println("\n----------------Invalid Email format. Please try again!----------------");
            return false;
        }
    }

    // Validate password format
    public boolean ValidatePassword() {
        if (this.Password.matches(regexPassword)) {
            return true;
        } else {
            System.out.println("\n----------------Invalid Password. Must contain at least one lowercase letter, one uppercase letter, one digit, and one special character. Minimum length: 8.----------------");
            return false;
        }
    }

    // Validate address format
    public boolean ValidateAddress() {
        if (this.Address.matches(regexAddress)) {
            return true;
        } else {
            System.out.println("\n----------------Invalid Address format. Please try again!----------------");
            return false;
        }
    }

    // Validate phone number format
    public boolean ValidatePhone() {
        if (this.Phone.matches(regexPhone)) {
            return true;
        } else {
            System.out.println("\n----------------Invalid Phone number. Please enter a valid 10-digit phone number starting with 7, 8, or 9.----------------");
            return false;
        }
    }

    // Setters and Getters (if needed)
    public void setUserName(String UserName) {
        this.UserName = UserName.trim();
    }

    public String getUserName() {
        return this.UserName;
    }

    // Other setters and getters if needed...
}
