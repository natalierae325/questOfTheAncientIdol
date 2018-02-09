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
    public String rowCount;
    public String columnCount;
    public String currentRown;
    public String currentColumn;
    public String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRowCount() {
        return rowCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }

    public String getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(String columnCount) {
        this.columnCount = columnCount;
    }

    public String getCurrentRown() {
        return currentRown;
    }

    public void setCurrentRown(String currentRown) {
        this.currentRown = currentRown;
    }

    public String getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(String currentColumn) {
        this.currentColumn = currentColumn;
    }
    
    
    
}
