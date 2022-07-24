
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String response = scanner.nextLine();
            if (response.equals("")) {
                break;
            }
            String[] pieces = response.split(" ");
            for (String parts : pieces) {
                System.out.println(parts);;
            }
        }
    }
}
