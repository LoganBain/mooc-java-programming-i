
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String numberAsString = scanner.nextLine();
            if (numberAsString.equals("end")) {
                break;
            }
            int number = Integer.valueOf(numberAsString);
            System.out.println(number * number * number);
        }
    }
}
