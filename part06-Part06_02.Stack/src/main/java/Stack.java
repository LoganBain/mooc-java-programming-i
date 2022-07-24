
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
public class Stack {
    private ArrayList<String> strings;
    
    public Stack() {
        this.strings = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.strings.isEmpty();
    }
    
    public void add(String string) {
        this.strings.add(string);
    }
    
    public ArrayList<String> values() {
        return this.strings;
    }
    
    public String take() {
        String latestEntry = this.strings.get(this.strings.size() - 1);
        this.strings.remove(this.strings.size() - 1);
        return latestEntry;        
    }
}
