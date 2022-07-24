
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String users[] = {"alex", "emma"};
        String pass[] = {"sunshine", "haskell"};

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        if (username.equals(users[0]) && password.equals(pass[0])) {
            System.out.println("You have successfully logged in!");
        } else if (username.equals(users[1]) && password.equals(pass[1])) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
