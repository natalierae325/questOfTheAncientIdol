/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;

/**
 *
 * @author abbeymj
 */
public class MoveView extends View{

    public MoveView(){
    }
    
    switch (choice) {
        case 'F': //move forward one space
            this.moveForward();
            break;
        case 'L': //move left one space
            this.moveLeft();
            break;
        case 'R': //move right one space
            this.moveRight();
            break;
        case "E": //quit
            this.exitMenu();
            break;
        default: 
            System.out.println("\n*** Invalid selection ** Try again!");
            break;
    }
    
    private void moveForward() {
        
    }
    
    private void moveLeft() {
        
    }
    
    private void moveRight() {
        
    }
    
    private void exitMenu(){
        
    }

    @Override
    public String[] getInputs() {
        
    }

    @Override
    public boolean doAction(String[] inputs) {
        
    }
    
}
