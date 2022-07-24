
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            names.add(parts[0]);
            birthYears.add(Integer.valueOf(parts[1]));
        }
        
        String longest = "";
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        
        int sum = 0;
        for (int number : birthYears) {
            sum += number;
        }
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + 1.0 * sum / birthYears.size());
    }
}
