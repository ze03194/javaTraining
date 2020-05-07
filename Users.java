import java.util.Scanner;

public class Users {
    static void registerUser(Users newUser[], int position){
        Scanner reader = new Scanner(System.in);
        String firstName, lastName, userName, password, dateOfBirth;
        int age, securityPin;


        System.out.print("First name: ");
        newUser[position].firstName = reader.nextLine();
        System.out.print("Last Name: ");
        newUser[position].lastName = reader.nextLine();

        System.out.print("Age: ");
        newUser[position].age = Integer.parseInt(reader.nextLine());
        System.out.print("Date of Birth MM/DD/YYYY: ");
        newUser[position].dateOfBirth = reader.nextLine();

        System.out.print("User Name: ");
        newUser[position].userName = reader.nextLine();
        System.out.print("Password: ");
        newUser[position].password = reader.nextLine();
        System.out.print("Four digit security pin: ");
        newUser[position].securityPin = reader.nextInt();
        reader.nextLine();
    }

    static void deposit(Users User[], int position){
        Scanner reader = new Scanner(System.in);
        double amount;

        System.out.println("Amount to be deposited: ");
        amount = reader.nextDouble();
        reader.nextLine();

        User[position].balance += amount;

    }

    static void withdrawal(Users User[], int position){
        Scanner reader = new Scanner(System.in);
        double amount;

        System.out.print("Amount to withdraw: ");
        amount = reader.nextDouble();
        reader.nextLine();

        User[position].balance -= amount;
    }

    static void displayBalance(Users User[], int position){

        System.out.println("Your total balance is: " + User[position].balance);
    }


    String firstName, lastName, userName, password, dateOfBirth;
    int age, securityPin;
    double balance;



    public static void main(String[] args){

    }
}
