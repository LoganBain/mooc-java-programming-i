
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author logan
 */
public class UserInterface {

    private Scanner scan;
    private BirdDatabase database;

    public UserInterface(Scanner scanner) {
        this.scan = scanner;
        this.database = new BirdDatabase();
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String cmd = this.scan.nextLine();

            if (cmd.equals("Quit")) {
                return;
            } else if (cmd.equals("Add")) {
                System.out.println("Name:");
                String bird = this.scan.nextLine();
                System.out.println("Name in Latin:");
                String latinBird = this.scan.nextLine();
                this.database.add(new Bird(bird, latinBird));
            } else if (cmd.equals("Observation")) {
                System.out.println("Bird?");
                String bird = this.scan.nextLine();
                this.database.increaseObservations(bird);
            } else if (cmd.equals("All")) {
                this.database.printAll();
            } else if (cmd.equals("One")) {
                System.out.println("Bird?");
                String bird = this.scan.nextLine();
                this.database.printOne(bird);
            }
        }
    }
}
