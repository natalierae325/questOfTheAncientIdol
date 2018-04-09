/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import Model.Item;
import Model.Location;
import Model.Map;
import Model.QuestionScene;

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
        
        
        return;
 }
 
 public static Map createMap(int numberRows, int numberColumns, Item[] items){
     Map map = new Map(numberRows, numberColumns);
     Location[][] locations= new Location[numberRows][numberColumns];
     map.setLocations(locations);
     
     for (int i=0; i < locations.length; i++){
         for ( int k=0; k < locations[0].length; k++){
             QuestionScene scene = new QuestionScene();
             locations[i][k].setScene(scene);
         }
     }
     
     
     return map;
 }
}