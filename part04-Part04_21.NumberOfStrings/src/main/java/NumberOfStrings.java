
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfMessages = 0;
        while (true) {
            String message = scanner.nextLine();
            if (message.equals("end")) {
                break;
            }
            numOfMessages++;
        }
        
        System.out.println(numOfMessages);
    }
}
