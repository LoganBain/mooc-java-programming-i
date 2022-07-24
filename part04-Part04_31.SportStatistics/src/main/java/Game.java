/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class Game {
    private String homeTeam;
    private String opposingTeam;
    private int homePoints;
    private int opposingPoints;
    
    public Game(String home, String visitor, int homePoints, int visitorPoints) {
        this.homeTeam = home;
        this.opposingTeam = visitor;
        this.homePoints = homePoints;
        this.opposingPoints = visitorPoints;
    }
    
    public String getHome() {
        return this.homeTeam;
    }
    
    public String getOpponent() {
        return this.opposingTeam;
    }
    
    public boolean winnerIs(String team) {
        if (this.homeTeam.equals(team) && this.homePoints > this.opposingPoints) {
            return true;
        } else if (this.opposingTeam.equals(team) && this.opposingPoints > this.homePoints) {
            return true;
        }
        return false;
    }
}
