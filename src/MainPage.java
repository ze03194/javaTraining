import java.util.Scanner;

public class MainPage {
    public double balance;

    static void registerUser(Users newUser){
        Scanner reader = new Scanner(System.in);
        String firstName, lastName, userName, password, dateOfBirth;
        int age, securityPin;


        System.out.print("First name: ");
        newUser.firstName = reader.nextLine();
        System.out.print("Last Name: ");
        newUser.lastName = reader.nextLine();

        System.out.print("Age: ");
        newUser.age = Integer.parseInt(reader.nextLine());
        System.out.print("Date of Birth MM/DD/YYYY: ");
        newUser.dateOfBirth = reader.nextLine();

        System.out.print("User Name: ");
        newUser.userName = reader.nextLine();
        System.out.print("Password: ");
        newUser.password = reader.nextLine();
        System.out.print("Four digit security pin: ");
        newUser.securityPin = reader.nextInt();
        reader.nextLine();
    }

    static void deposit(Users newUser, MainPage test){
        Scanner reader = new Scanner(System.in);
        double amount;

        System.out.println("Amount to be deposited: ");
        amount = reader.nextDouble();
        reader.nextLine();

        newUser.balance += amount;
    }

    static void withdrawal(Users newUser){
        Scanner reader = new Scanner(System.in);
        double amount;

        System.out.print("Amount to withdraw: ");
        amount = reader.nextDouble();
        reader.nextLine();

        newUser.balance -= amount;
    }

    static void displayBalance(Users newUser){
        
        System.out.println("Your total balance is: " + newUser.balance);
    }

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Users newUser = new Users();
        int input;
        char answer;
        MainPage test = new MainPage();

        do {
            System.out.println("Welcome to Frost Bank!");
            System.out.println("Please choose from one of the following options:");

            System.out.println(" 1. Register\n 2. Deposit\n 3. Withdrawal\n 4. Balance\n 5. Exit");
            input = reader.nextInt();
            reader.nextLine();

            switch (input){
                case 1:
                    registerUser(newUser);
                    break;
                case 2:
                    deposit(newUser, test);
                    break;
                case 3:
                    withdrawal(newUser);
                    break;
                case 4:
                    displayBalance(newUser);
                    break;
                case 5:
                    System.exit(0);
            }

            System.out.print("Would you like to continue?: Y/N");
            answer = reader.next().charAt(0);
            reader.nextLine();

        }while (answer == 'y' || answer == 'Y');

    }
}
