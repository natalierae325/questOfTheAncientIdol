package Model;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable {

   

    

    
    
    private String name;
    private String description;
    private String coordinates;
    private String playingCharacter;
    private String nonPlayingCharacter;

    public Actor() {
    
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

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getPlayingCharacter() {
        return playingCharacter;
    }

    public void setPlayingCharacter(String playingCharacter) {
        this.playingCharacter = playingCharacter;
    }

    public String getNonPlayingCharacter() {
        return nonPlayingCharacter;
    }

    public void setNonPlayingCharacter(String nonPlayingCharacter) {
        this.nonPlayingCharacter = nonPlayingCharacter;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.coordinates);
        hash = 97 * hash + Objects.hashCode(this.playingCharacter);
        hash = 97 * hash + Objects.hashCode(this.nonPlayingCharacter);
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        if (!Objects.equals(this.playingCharacter, other.playingCharacter)) {
            return false;
        }
        if (!Objects.equals(this.nonPlayingCharacter, other.nonPlayingCharacter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", playingCharacter=" + playingCharacter + ", nonPlayingCharacter=" + nonPlayingCharacter + '}';
    }
    
}
