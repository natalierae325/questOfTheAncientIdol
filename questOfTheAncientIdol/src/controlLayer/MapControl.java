/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import Model.EmptyScene;
import Model.Item;
import Model.Location;
import Model.Map;
import Model.Question;
import Model.QuestionScene;
import Model.SceneType;
import Model.TrapScene;

/**
 *
 * @author abbeymj
 */
public class MapControl {

    public MapControl() {
    }
    
 public static String placesVisited(String currentRow, S tring currentColumn, String visitedRow, String visitedColumn) {
         if ( currentRow == visitedRow && visitedColumn == currentColumn) {
        }
        
        
        return ;
 }
 
 public static Map createMap(int numberRows, int numberColumns, Item[] items){
     if (numberRows < 0 || numberColumns < 0) {
         return null;
     }
     if ( items == null || items.length < 1 ){
     return null;
    }
     Map map = new Map(numberRows, numberColumns);
     Location[][] locations= new Location[numberRows][numberColumns];
     map.setLocation(locations);
     
     for (int i=0; i < locations.length; i++){
         for ( int k=0; k < locations[0].length; k++){
             SceneType scene = new SceneType();
             locations[i][k].setScene(scene);
         }
            
     }
     
     //Top row locations
     
     locations[0][0].setScene(new EmptyScene());
     locations[0][0].getScene().setMapSymbol("<E>");
     Question eq = new Question();
     locations[0][0].eq.setQuestion("Do you want to move: "
             + "/n F - Forward"
             + "/n R - Right ");
     locations[0][0].eq.
     locations[0][0].getScene().setTopMoveQuestion(new topMoveQuestion());
     
     locations[0][1].setScene(new EmptyScene());
     locations[0][1].getScene().setTopMoveQuestion(new topMoveQuestion());
     locations[0][1].getScene().getTopMoveQuestion.setTopMoveAnswer("wwww");
             
     locations[0][2].setScene(new TreasureScene());
     locations[0][2].getScene().setQuestion(new Question());
     locations[0][2].getScene().getQuestion.setAnswer("wwww");
     
     locations[0][3].setScene(new ItemScene());
     locations[0][3].getScene().Question(new Question());
     locations[0][3].getScene().setmoveQuestion(new moveQuestion)
     locations[0][3].getScene().setMapSymbol("<E>");
     
     locations[0][4].setScene(new EmptyScene());
     locations[0][4].getScene().setMapSymbol("<E>");
     
     
     
     // Middle row locations
     
     locations[1][0].setScene(new EmptyScene());
     locations[1][0].getScene().setMapSymbol("<E>");
     locations[1][0].getScene().setMoveQuestion(eq);
             
     locations[1][1].setScene(new EmptyScene());
     locations[1][1].getScene().setMapSymbol("<E>");
     locations[1][1].getScene().setMoveQuestion(eq);
             
      
     //sand puzzle
     locations[1][2].setScene(new TrapScene());
     locations[1][2].getScene().setMapSymbol("Oh no! You walked right into a trap!");
     locations[1][2].getScene().setMoveQuestion(eq);
              
     locations[1][3].setScene(new EmptyScene());
     locations[1][3].getScene().setMapSymbol("<E>");
     locations[1][3].getScene().setMoveQuestion(eq);
             
             
     // Bottom row locations
     
    locations[2][0].setScene(new EmptyScene());
    locations[2][0].getScene().setMapSymbol("<E>");
    locations[2][0].getScene().setMoveQuestion(eq);
             
             
    locations[2][1].setScene(new EmptyScene());
    locations[2][1].getScene().setMapSymbol("<E>");
    locations[2][1].getScene().setMoveQuestion(eq);
             
    
    //Walls cave in
    locations[2][2].setScene(new TrapScene());
    locations[2][2].
             
    locations[2][3].setScene(new EmptyScene());
    locations[2][3].getScene().setMapSymbol("<E>");
    locations[2][3].getScene().setMoveQuestion(eq);
             
             
    locations[2][4].setScene(new EmptyScene());
    locations[2][4].getScene().setMapSymbol("<E>");
    locations[2][4].getScene().setMoveQuestion(eq);
             
             
    locations[2][5].setScene(new EmptyScene());
    locations[2][5].getScene().setMapSymbol("<E>");
    locations[2][5].getScene().setMoveQuestion(eq);
             
             
                  
    locations[2][6].setScene(new EmptyScene());
    locations[2][6].getScene().setMapSymbol("<E>");
    locations[2][6].getScene().setMoveQuestion(eq);
             
    
    //water trap
    locations[2][7]
    locations[2][7]
            
    locations[2][8].setScene(new EmptyScene());
    locations[2][8].getScene().setMapSymbol("<E>");
    locations[2][8].getScene().setMoveQuestion(eq);
             
            
    locations[2][9].setScene(new EmptyScene());
    locations[2][9].getScene().setMapSymbol("<E>");
    locations[2][9].getScene().setMoveQuestion(eq);
             
     return map;
 }
}
