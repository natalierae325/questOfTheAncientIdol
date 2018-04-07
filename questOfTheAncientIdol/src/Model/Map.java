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
        this.numberRows = numberRows;
        this.numberColumns = numberColumns;
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
    
    
    
}
   
