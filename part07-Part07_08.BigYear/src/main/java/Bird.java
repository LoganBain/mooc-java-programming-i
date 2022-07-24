/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latin) {
        this.name = name;
        this.latinName = latin;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }
    
    public void increaseObservations(int amount) {
        this.observations += amount;
    }
    
    public void increaseObservations() {
        this.increaseObservations(1);
    }
    
    public void decreaseObservations(int amount) {
        this.observations -= amount;
    }
    
    public void decreaseObservations() {
        this.decreaseObservations(1);
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
}
