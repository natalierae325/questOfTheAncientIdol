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

public class Map implements Serializable{

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRown=" + currentRown + ", currentColumn=" + currentColumn + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.rowCount);
        hash = 31 * hash + Objects.hashCode(this.columnCount);
        hash = 31 * hash + Objects.hashCode(this.currentRown);
        hash = 31 * hash + Objects.hashCode(this.currentColumn);
        hash = 31 * hash + Objects.hashCode(this.description);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        if (!Objects.equals(this.currentRown, other.currentRown)) {
            return false;
        }
        if (!Objects.equals(this.currentColumn, other.currentColumn)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    public string rowCount;
    public string columnCount;
    public string currentRown;
    public string currentColumn;
    public string description;

    public string getDescription() {
        return description;
    }

    public void setDescription(string description) {
        this.description = description;
    }

    public string getRowCount() {
        return rowCount;
    }

    public void setRowCount(string rowCount) {
        this.rowCount = rowCount;
    }

    public string getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(string columnCount) {
        this.columnCount = columnCount;
    }

    public string getCurrentRown() {
        return currentRown;
    }

    public void setCurrentRown(string currentRown) {
        this.currentRown = currentRown;
    }

    public string getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(string currentColumn) {
        this.currentColumn = currentColumn;
    }
    
    
    
}
