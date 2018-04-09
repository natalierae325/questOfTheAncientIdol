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

/**
 *
 * @author abbeymj
 */
public class MapControl {

    public MapControl() {
    }
    
 public static String placesVisited(String currentRow, String currentColumn, String visitedRow, String visitedColumn) {
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
     
     locations[0][0].setScene(new EmptyScene());
     locations[0][0].getScene().setMapSymbol("<E>");
     
     locations[0][1].setScene(new EmptyScene());
     locations[0][1].getScene().setQuestion(new Question());
     locations[0][1].getScene().getQuestion.setAnswer("wwww");
             
     locations[0][2].setScene(new TreasureScene());
     locations[0][2].getScene().setQuestion(new Question());
     locations[0][2].getScene().getQuestion.setAnswer("wwww");
     
     locations[0][3].setScene(new EmptyScene());
     locations[0][3].getScene().setMapSymbol("<E>");
     
     locations[0][4].setScene(scene);
     
     
     
     return map;
 }
}