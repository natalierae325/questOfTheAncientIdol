/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questOfTheAncientIdol.view;

/**
 *
 * @author natal
 */
public class ViewInterface extends View{
    @Override
    public String[] getInputs(){
        String[] inputs = new String[2];
        
        System.out.println("\n The room is starting to flood.");
        
        String value = this.getInput("\n Enter the distance you will have to throw the rope in order to (hypotenuse).");
        if (value.trim().toUpperCase().Equals("Q")){
            return inputs;
        }
        String value = this.getInputs("Enter the ");
    }

 
    }

@Override 
public boolean doAction(String[] inputs {

double base = Double.parseDouble(inputs[0]));
double height = Double.parseDouble
}
