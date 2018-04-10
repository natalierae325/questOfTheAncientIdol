/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author natal
 */
public class TrapScene extends SceneType {

    public TrapScene() {
    }

    public TrapScene(Question moveQuestion) {
        super(moveQuestion);
    }

    public TrapScene(String description, String mapSymbol) {
        super(description, mapSymbol);
    }
    
}
