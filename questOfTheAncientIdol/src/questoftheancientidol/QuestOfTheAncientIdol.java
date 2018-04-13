/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoftheancientidol;

import Model.Game;
import Model.Player;
import viewLayer.StartProgramView;


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
        StartProgramView start = new StartProgramView();
        start.displayView();
        
        private static PrintWriter outFile = null;
        private static BufferedReader inFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        QuestOfTheAncientIdol.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        QuestOfTheAncientIdol.inFile = inFile;
    }
    
    
    try{
    
        QuestOfTheAncientIdol.inFile=
                new BufferedReader(new InputStreamReader(System.in));

        QuestOfTheAncientIdol.outFile = new PrintWriter(System.out, true);
        
        StartProgramView startProgramView = new StartProgramView();
        StartProgramView.display();
    }
    
    
    
    
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
}