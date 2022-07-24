/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class Container {
    private int liquidAmt;
    
    public Container() {
        this.liquidAmt = 0;
    }
    
    public int contains() {
        return this.liquidAmt;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.liquidAmt += amount;
            if (this.liquidAmt > 100) {
                this.liquidAmt = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if (amount > liquidAmt) {
                amount = liquidAmt;
            }
            this.liquidAmt -= amount;
        }
    }
    
    public String toString() {
        return liquidAmt + "/100";
    }
}
