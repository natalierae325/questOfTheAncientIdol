package controlLayer;

import Model.Actor;
import Model.Game;
import Model.Item;
import Model.Items;
import Model.Map;
import Model.Player;
import questoftheancientidol.QuestOfTheAncientIdol;


public class GameControl {

    public static Player savePlayer(String playersName) {
        //save player 
    
       return null;
    }

public GameControl() {
    
}

    

public static int createNewGame(Player player) {
        if (player == null){
            return -1;
        }
        Game game = new Game(); 
        game.setPlayer(player);
        
       QuestOfTheAncientIdol quest = new QuestOfTheAncientIdol();
       quest.setCurrentGame(game);
       
       Actor[] actors = createActors();
       game.setActors(actors);
       game.getPlayer().setActor(actors[0]);
       
       Item[] items = createItems();
       game.setItem(items);
       
       Map map = MapControl.createMap(3, 10, items);
       if (map == null) {
           return -1;
       }
       game.setMap(map);
        return 0;
    }
       
  
      
    
    public static Item[] createItems(){
        Item[] items = new Item[30];
        return items;
    }
    
    
    public static Actor[] createActors(){
        Actor[] actors = new Actor[3];
        return actors;
    }
    
    private static void newGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
// public static int createNewGame(Player player) {
//if (player == null)
//return -1
//game = create a new Game object
//Save a reference to the Player object in the game
//Save a reference to the game in the main class
//actors = createActors()
//Save the list of actors in the Game object
//Assign an actor to the player
//items = createItems()
//Save the list of items in the game
//map = createMap(noOfRows, noOfColumns, items)
//IF map == null THEN
// RETURN -1
//ENDIF
//Assign the map to the game
//RETURN 1 // indicates success
//}
