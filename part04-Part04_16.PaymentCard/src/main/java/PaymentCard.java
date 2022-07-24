/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class PaymentCard {
    private double cardBalance;
    
    public PaymentCard(double openingBalance) {
        this.cardBalance = openingBalance;
    }
    public String toString() {
        return "The card has a balance of " + this.cardBalance + " euros";
    }
    public void eatAffordably() {
        if (this.cardBalance >= 2.60) {
            this.cardBalance -= 2.60;
        }
    }
    public void eatHeartily() {
        if (this.cardBalance >= 4.60) {
            this.cardBalance -= 4.60;
        }
    }
    public void addMoney(double amount) {
        if (amount > 0 && cardBalance + amount <= 150) {
            this.cardBalance += amount;
        } else if (this.cardBalance + amount > 150) {
            this.cardBalance = 150;
        }
    }
}
