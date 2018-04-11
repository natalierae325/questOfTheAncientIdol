/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.





 */
package Model;

import java.io.Serializable;

/**io.Serializable;
 *
 * @author natal
 */
public class Player implements Serializable{

    private String playersName;

    public Player(double bestScore, Actor actor) {
        this.bestScore = bestScore;
        this.actor = actor;
    }
    
    private double bestScore;
    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    public Player() {
        this.bestScore = 0.0;
    }
    public String getPlayerName() {
        return this.playersName;
    }
    public void setPlayerName(String newName) {
        this.playersName = newName;
    }
    public double getBestScore() {
        return this.bestScore;
    }
    public void setBestScore(double newScore){
        this.bestScore = newScore;
    }
    
}
