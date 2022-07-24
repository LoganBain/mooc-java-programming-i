
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maximumWeight;
    }
    
    public void addItem(Item itemToAdd) {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        if (totalWeight + itemToAdd.getWeight() <= this.maxWeight) {
            this.items.add(itemToAdd);
        }
    }
    
    @Override
    public String toString() {
        int totalWeight = 0;
        int numOfItems = 0;
        for (Item item : this.items) {
            numOfItems++;
            totalWeight += item.getWeight();
        }
        
        if (numOfItems == 0) {
            return "no items (" + totalWeight + " kg)";
        } else if (numOfItems == 1) {
            return "1 item (" + totalWeight + " kg)";
        }
        return numOfItems + " items (" + totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for (Item item : this.items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
