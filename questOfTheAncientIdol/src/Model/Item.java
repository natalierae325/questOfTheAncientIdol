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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.Knife);
        hash = 23 * hash + Objects.hashCode(this.Gun);
        hash = 23 * hash + Objects.hashCode(this.Rope);
        hash = 23 * hash + Objects.hashCode(this.Idol);
        hash = 23 * hash + Objects.hashCode(this.Rubies);
        hash = 23 * hash + Objects.hashCode(this.Gold);
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
        if (!Objects.equals(this.Knife, other.Knife)) {
            return false;
        }
        if (!Objects.equals(this.Gun, other.Gun)) {
            return false;
        }
        if (!Objects.equals(this.Rope, other.Rope)) {
            return false;
        }
        if (!Objects.equals(this.Idol, other.Idol)) {
            return false;
        }
        if (!Objects.equals(this.Rubies, other.Rubies)) {
            return false;
        }
        if (!Objects.equals(this.Gold, other.Gold)) {
            return false;
        }
        return true;
    }
    
    private String Knife;
    private String Gun;
    private String Rope;
    private String Idol;
    private String Rubies;
    private String Gold;

    public String getKnife() {
        return Knife;
    }

    public void setKnife(String Knife) {
        this.Knife = Knife;
    }

    public String getGun() {
        return Gun;
    }

    public void setGun(String Gun) {
        this.Gun = Gun;
    }

    public String getRope() {
        return Rope;
    }

    public void setRope(String Rope) {
        this.Rope = Rope;
    }

    public String getIdol() {
        return Idol;
    }

    public void setIdol(String Idol) {
        this.Idol = Idol;
    }

    public String getRubies() {
        return Rubies;
    }

    public void setRubies(String Rubies) {
        this.Rubies = Rubies;
    }

    public String getGold() {
        return Gold;
    }

    public void setGold(String Gold) {
        this.Gold = Gold;
    }
    
}
