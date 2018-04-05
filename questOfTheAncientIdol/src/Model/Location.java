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
 * @author abbeymj
 */
public class Location implements Serializable{

    public Location(Integer row, String column, String visited, SceneType scene) {
        this.row = row;
        this.column = column;
        this.visited = visited;
        this.scene = scene;
    }
    
    public Integer row;
    public String column;
    public String visited;
    public SceneType scene;

    public SceneType getScene() {
        return scene;
    }

    public void setScene(SceneType scene) {
        this.scene = scene;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.row);
        hash = 23 * hash + Objects.hashCode(this.column);
        hash = 23 * hash + Objects.hashCode(this.visited);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        return true;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }
 
    public void setColumn(String column) {
        this.column = column;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }
 
}
