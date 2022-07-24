
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0;
        int containerTwo = 0;

        // way too many if statements lol... - TIRED.
        
        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int num = Integer.valueOf(parts[1]);

            if (parts[0].equals("add")) {
                if (num + containerOne > 100) {
                    containerOne = 100;
                } else if (num > 0) {
                    containerOne += num;
                }
            }
            
            if (parts[0].equals("move")) {
                if (num > 0 && num <= containerOne) {
                    containerTwo += num;
                    containerOne -= num;
                } else if (num > containerOne) {
                    containerTwo += containerOne;
                    containerOne = 0;
                }
                if (containerTwo > 100) {
                    containerTwo = 100;
                }
            }
            
            if (parts[0].equals("remove")) {
                if (num >= containerTwo) {
                    containerTwo = 0;
                } else if (num > 0) {
                    containerTwo -= num;
                }
            }
        }
    }
}
