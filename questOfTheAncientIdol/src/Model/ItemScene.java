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
public class ItemScene extends SceneType {
    private Question grabQuestion;

  

    public ItemScene(Question grabQuestion, String description, String mapSymbol) {
        super(description, mapSymbol);
        this.grabQuestion = grabQuestion;
    }

    public Question getGrabQuestion() {
        return grabQuestion;
    }

    public void setGrabQuestion(Question grabQuestion) {
        this.grabQuestion = grabQuestion;
    }
  
}
