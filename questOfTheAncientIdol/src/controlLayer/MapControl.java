/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import Model.Actor;
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
 
 
 
 
  public void displayMap(Map map, Actor a) {
      Location[][] loc = map.getLocations();
       System.out.println("Quest Of The Ancient Idol"); 
       System.out.println("1 2 3 4 5 6 7 8 9 10");
       for (int i = 0; i < 3; i++){
           System.out.println("-------------------------------------");
           System.out.println(i);
           for (int c = 0; c < 10; c++) {
               System.out.println("|");
               Location l = loc[i][c];
               if ( l.isVisited()){
                   System.out.println(l.getScene().getMapSymbol());
               }
               else {
                   System.out.println("??");
               }
           }
           System.out.println("|");
          
       }
       System.out.println("----------------------------------------");
          
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
    
      public static void moveActor(Actor a, Map map, String direction) {
         int x = a.getCoordinates().charAt(2);
         int y = a.getCoordinates().charAt(4);
         String newC = "";
     if (direction == "L"){
         y -= 1;
     }
      if (direction == "R") {
         y += 1;
      } 
      if (direction == "F"){
         x += 1;
      }
      else {
          System.out.println("Invalid input entered, please try again.");
          return;
      }
      newC = "(" + x + "," + y + ")";
      a.setCoordinates(newC);
        
     locations[0][4].getScene().setMapSymbol("<E>"); 
     
     locations[0][5].setScene(new EmptyScene());
     locations[0][5].getScene().setMoveQuestion(eq);
     locations[0][5].getScene().setMapSymbol("<E>");
             
     locations[0][6].setScene(new EmptyScene());
     locations[0][6].getScene().setMapSymbol("<E>");
     locations[0][6].getScene().setMoveQuestion(eq);
             
     locations[0][7].setScene(new TrapScene());
     locations[0][7].getScene().setMoveQuestion(eq);
     locations[0][7].getScene().
     
     locations[0][8].setScene(new EmptyScene());
     locations[0][8].getScene().setMapSymbol("<E>");
     locations[0][8].getScene().setMoveQuestion(eq);
     
     locations[0][9].setScene(new TrapScene());
     locations[0][9].getScene().Question(new Question());
     
     
        //middle rows  
 
 
 
 
  public void displayMap(Map map, Actor a) {
      Location[][] loc = map.getLocations();
       System.out.println("Quest Of The Ancient Idol"); 
       System.out.println("1 2 3 4 5 6 7 8 9 10");
       for (int i = 0; i < 3; i++){
           System.out.println("-------------------------------------");
           System.out.println(i);
           for (int c = 0; c < 10; c++) {
               System.out.println("|");
               Location l = loc[i][c];
               if ( l.isVisited()){
                   System.out.println(l.getScene().getMapSymbol());
               }
               else {
                   System.out.println("??");
               }
           }
           System.out.println("|");
          
       }
       System.out.println("----------------------------------------");
          
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
    
      public static void moveActor(Actor a, Map map, String direction) {
         int x = a.getCoordinates().charAt(2);
         int y = a.getCoordinates().charAt(4);
         String newC = "";
     if (direction == "L"){
         y -= 1;
     }
      if (direction == "R") {
         y += 1;
      } 
      if (direction == "F"){
         x += 1;
      }
      else {
          System.out.println("Invalid input entered, please try again.");
          return;
      }
      newC = "(" + x + "," + y + ")";
      a.setCoordinates(newC);
        


































 }
 
     //Top row locations
     
     locations[0][0].setScene(new EmptyScene());
     locations[0][0].getScene().setMapSymbol("<E>");
     Question eq = new Question("Do you want to move: "
             + "/n F - Forward"
             + "/n R - Right ","F" || "R" );
     locations[0][0].eq.setQuestion("Do you want to move: "
             + "/n F - Forward"
             + "/n R - Right ");

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
     
     locations[0][5].setScene(new EmptyScene());
     locations[0][5].getScene().setMoveQuestion(eq);
     locations[0][5].getScene().setMapSymbol("<E>");
             
     locations[0][6].setScene(new EmptyScene());
     locations[0][6].getScene().setMapSymbol("<E>");
     locations[0][6].getScene().setMoveQuestion(eq);
             
     locations[0][7].setScene(new TrapScene());
     locations[0][7].getScene().setMoveQuestion(eq);
     locations[0][7].getScene().
     
     locations[0][8].setScene(new EmptyScene());
     locations[0][8].getScene().setMapSymbol("<E>");
     locations[0][8].getScene().setMoveQuestion(eq);
     
     locations[0][9].setScene(new TrapScene());
     locations[0][9].getScene().Question(new Question());
     
     
        //middle rows  
       
       
             
     
     
     
     
     // Middle row locations
     
     locations[1][0].setScene(new EmptyScene());
     locations[1][0].getScene().setMapSymbol("<E>");
     locations[1][0].getScene().setMoveQuestion(eq);
             
     locations[1][1].setScene(new EmptyScene());
     locations[1][1].getScene().setMapSymbol("<E>");
     locations[1][1].getScene().setMoveQuestion(eq);
             
      
     //sand puzzle
     locations[1][2].setScene(new TrapScene());
     locations[1][2].getScene().setMapSymbol("<!>");
     locations[1][2].getScene().setMoveQuestion(eq);
              
     locations[1][3].setScene(new EmptyScene());
     locations[1][3].getScene().setMapSymbol("<E>");
     locations[1][3].getScene().setMoveQuestion(eq);     
     
      // 1,4 1,5 1,6 are for the boulder     
     
=======
     locations[1][3].getScene().setMoveQuestion(eq);
        
// 1,4 1,5 1,6 are for the boulder  

    locations[1][4].setScene(new TrapScene());
    locations[1][4]
    locations[1][4]
            
    
    locations[1][5].setScene(new TrapScene());
    locations[1][5]
    locations[1][5]

    locations[1][6]
    locations[1][6]
    locations[1][6]
            
