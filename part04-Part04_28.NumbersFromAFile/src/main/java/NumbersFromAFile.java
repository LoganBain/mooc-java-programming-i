
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int lines = 0;
        try (Scanner lineReader = new Scanner(Paths.get(file))) {
            while (lineReader.hasNextLine()) {
                int line = Integer.valueOf(lineReader.nextLine());
                if (line <= upperBound && line >= lowerBound) {
                    lines++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Numbers: " + lines);
    }

}
