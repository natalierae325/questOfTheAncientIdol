/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author natal
 */
public class Game implements Serializable{
    private String gameCompletionStatus;

    public Game() {
          
    }

    public String getGameCompletionStatus() {
        return gameCompletionStatus;
    }

    public void setGameCompletionStatus(String gameCompletionStatus) {
        this.gameCompletionStatus = gameCompletionStatus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.gameCompletionStatus);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.gameCompletionStatus, other.gameCompletionStatus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "gameCompletionStatus=" + gameCompletionStatus + '}';
    }

    
    
    
}


