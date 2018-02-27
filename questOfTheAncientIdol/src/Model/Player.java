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
    private  String playersName;
    private double bestScore;
    
    public Player() {
        this.bestScore = 0.0;
    }
    public String getPlayername() {
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
