
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for file name
        System.out.println("File: ");
        String fileName = scan.nextLine();
        // Read data from file
        ArrayList<Game> games = readFromFile(fileName);
        
        // Ask user for team
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        // Print number of games, wins, and losses
        int matches = 0;
        int wins = 0;
        int losses = 0;
        for (Game game : games) {
            if (game.getHome().equals(team) || game.getOpponent().equals(team)) {
                matches++;
                if (game.winnerIs(team)) {
                    wins++;
                    continue;
                }
                losses++;
            }
        }
        System.out.println("Games: " + matches);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    public static ArrayList<Game> readFromFile(String file) {
        ArrayList<Game> data = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                int home = Integer.valueOf(parts[2]);
                int opponent = Integer.valueOf(parts[3]);
                data.add(new Game(parts[0], parts[1], home, opponent));
            }
        } catch (Exception e) {
            System.out.println("File could not be read.");
        }
        return data;
    }
}
