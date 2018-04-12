/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *create javabean for item
 * @author abbeymj
 */
public class Item implements Serializable{
    
    private String name;
    private String description;
    private boolean haveIt;

    public Item() {
    }

    public Item(String name, String description, boolean haveIt) {
        this.name = name;
        this.description = description;
        this.haveIt = haveIt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHaveIt() {
        return haveIt;
    }

    public void setHaveIt(boolean haveIt) {
        this.haveIt = haveIt;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", description=" + description + ", haveIt=" + haveIt + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + (this.haveIt ? 1 : 0);
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
        final Item other = (Item) obj;
        if (this.haveIt != other.haveIt) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
}