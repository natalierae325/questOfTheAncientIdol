 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author abbeymj
 */

public class Map implements Serializable{

    public Map(int numberRows, int numberColumns) {
    public Map(Map map, String numberRows, String numberColumns, String rowCount, String columnCount, String currentRown, String currentColumn, String description) {
        this.map = map;
        this.numberRows = numberRows;
        this.numberColumns = numberColumns;
    }

  
        hash = 71 * hash + this.numberRows;
        hash = 71 * hash + this.numberColumns;
        hash = 71 * hash + Arrays.deepHashCode(this.locations);
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
        if (this.numberRows != other.numberRows) {
            return false;
        }
        if (this.numberColumns != other.numberColumns) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getNumberRows() {
        return numberRows;
    }

    public void setNumberRows(int numberRows) {
        this.numberRows = numberRows;
    }

    public int getNumberColumns() {
        return numberColumns;
    }

    public void setNumberColumns(int numberColumns) {
        this.numberColumns = numberColumns;
    }
       

    public Location[][] getLocation() {
        return location;
    }

    public void setLocation(Location[][] location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private int numberRows;
    private int numberColumns;
    private Location[][] location;
    private String description;
    

    private Map map;
    private String numberRows;
    private String numberColumns;
 >>>>>>> origin/master

    public Map(int numberRows, int numberColumns) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
}
   
