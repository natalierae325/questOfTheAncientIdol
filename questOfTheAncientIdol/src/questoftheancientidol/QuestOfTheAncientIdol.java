/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoftheancientidol;

import Model.Game;
import Model.Player;


/**
 *
 * @author natal
 */
public class QuestOfTheAncientIdol {

    public QuestOfTheAncientIdol() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
    }
    public static Game currentGame;
    public static Player player;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        QuestOfTheAncientIdol.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(Game currentGame) {
        QuestOfTheAncientIdol.currentGame = currentGame;
    }
{
        
    }
    
    public static Player player();
}
//Game curentGame
//Player player
//getCurrentGame()
//setCurrentGame(Game game)
//