import java.util.Scanner;

public class MainPage {
    public double balance;

    static int signIn(Users User[]){
        Scanner reader = new Scanner(System.in);
        String username, password;
        int securityPin;

        System.out.println("Username: ");
        username = reader.nextLine();
        System.out.println("Password: ");
        password = reader.nextLine();
        System.out.println("Security Pin: ");
        securityPin = reader.nextInt();
        reader.nextLine();

        for(int i = 0; i < User.length; i++){
            if(User[i].userName.equals(username) && User[i].password.equals(password)
                    && User[i].securityPin == securityPin){
                return i;
            }
            else {
                System.out.println("User not Found!");
                return -1;
            }
        }
        return 0;
    }

    static void signInPage(Users User[], int position){
        Scanner reader = new Scanner(System.in);
        char answer;
        int input;


        do{
            System.out.println("Welcome to Frost Bank!");
            System.out.println("Please choose from one of the following options:");

            System.out.println(" 1. Deposit\n 2. Withdrawal\n 3. Balance\n 4. Exit");
            input = reader.nextInt();
            reader.nextLine();

            switch (input){
                case 1:
                    User[position].deposit(User, position);
                    break;
                case 2:
                    User[position].withdrawal(User, position);
                    break;
                case 3:
                    User[position].displayBalance(User, position);
                    break;
                case 4:
                    System.exit(0);
                    
            }

            System.out.print("Would you like to continue? Y/N: ");
            answer = reader.next().charAt(0);

        }while(answer == 'y' || answer == 'Y');

    }


    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Users[] User = new Users[50];
        int input, position;
        int increment = 0;
        char answer;


        do {
            System.out.println("Welcome to Frost Bank!"); 
            System.out.println("Please choose from one of the following options:");

            System.out.println(" 1. Register\n 2. Sign In\n 3. Exit");
            input = reader.nextInt();
            reader.nextLine();


            switch (input){
                case 1:
                    User[increment] = new Users();
                    User[increment].registerUser(User, increment);
                    increment++;
                    break;
                case 2:
                    position = signIn(User);
                    signInPage(User, position);
                    break;
                case 3:
                    System.exit(0);
            }

            System.out.print("Would you like to continue?: Y/N");
            answer = reader.next().charAt(0);
            reader.nextLine();

        }while (answer == 'y' || answer == 'Y');

    }
}
