/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;

import controlLayer.MapControl;
import questoftheancientidol.QuestOfTheAncientIdol;

/**
 *
 * @author abbeymj
 */
public class MoveView extends View{

    public MoveView(){
    }
    
    
    private void exitMenu(){
        
    }

    @Override
    public String[] getInputs() {
        
    }

    @Override
    public boolean doAction(String[] inputs) {
        MapControl mc = new MapControl();
        QuestOfTheAncientIdol quest = new QuestOfTheAncientIdol();
        mc.moveActor(quest.getCurrentGame().getPlayer().getActor(), quest.getCurrentGame().getMap(), inputs[0]);
        return true;
    }
    
}
