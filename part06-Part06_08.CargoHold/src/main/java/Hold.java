
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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maximumWeight) {
        this.maxWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase value : this.suitcases) {
            totalWeight += value.totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    @Override
    public String toString() {
        int numOfSuitcases = 0;
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            numOfSuitcases++;
            totalWeight += suitcase.totalWeight();
        }
        if (numOfSuitcases == 1) {
            return "1 suitcase (" + totalWeight + " kg)";
        } else if (numOfSuitcases == 0) {
            return "no suitcases (" + totalWeight + " kg)";
        }
        return numOfSuitcases + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
