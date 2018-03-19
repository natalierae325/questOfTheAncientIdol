 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;

/**
 *
 * @author natal
 */
public class ViewInterface {
    public void display(){
    }
    public String[] getInputs(){
        return;
    }
    public String[] getInputs(String displayMessage);
    public boolean doAction(String[] inputs);
       
}
