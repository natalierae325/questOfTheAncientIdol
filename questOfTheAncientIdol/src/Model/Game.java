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

    public Game(String gameCompletionStatus, Player player, Actor[] actors, Item[] items, Map map) {
        this.gameCompletionStatus = gameCompletionStatus;
        this.player = player;
        this.actors = actors;
        this.items = items;
        this.map = map;
  
    }
    private String gameCompletionStatus;
    private Player player;
    private Actor[] actors;
    private Item[] items;
    private Map map;
 

    

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Item[] getItem() {
        return items;
    }

    public void setItem(Item[] items) {
        this.items = items;
    }
    

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    

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

    public void setItem(Items[] items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}


