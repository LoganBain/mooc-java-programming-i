/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand secondHundredths;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.secondHundredths = new ClockHand(100);
    }
    
    public void advance() {
        secondHundredths.advance();
        if (secondHundredths.value() == 0) {
            seconds.advance();
        }
    }
    
    public String toString() {
        return seconds + ":" + secondHundredths;
    }
}
