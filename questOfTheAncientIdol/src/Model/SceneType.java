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
public class SceneType implements Serializable{
      private String description;
      private String mapSymbol;
      private Question moveQuestion;

    public SceneType() {
    }

    public SceneType(Question moveQuestion) {
        this.moveQuestion = moveQuestion;
    }

    public Question getMoveQuestion() {
        return moveQuestion;
    }

    public void setMoveQuestion(Question moveQuestion) {
        this.moveQuestion = moveQuestion;
    }
    @Override
    public String toString() {
        return "SceneType{" + "description=" + description + ", mapSymbol=" + mapSymbol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.mapSymbol);
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
        final SceneType other = (SceneType) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        return true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public SceneType(String description, String mapSymbol) {
        this.description = description;
        this.mapSymbol = mapSymbol;
    }
  
    
}


