
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author logan
 */
public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public void add(Bird birdToAdd) {
        this.birds.add(birdToAdd);
    }

    public void printAll() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }
    
    public void printOne(String nameOfBird) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(nameOfBird)) {
                System.out.println(bird);
            }
        }
    }
    
    public void increaseObservations(String birdName) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(birdName)) {
                bird.increaseObservations();
                return;
            }
            System.out.println("Not a bird!");
        }
    }
}
