/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
    public boolean equals(Object compared) {
        if (compared == this) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }
        Item eCompared = (Item) compared;
        if (eCompared.identifier.equals(this.identifier)) {
            return true;
        }
        return false;
    }
}
