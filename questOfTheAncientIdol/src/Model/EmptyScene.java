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
public class EmptyScene extends SceneType {

    private Question moveQuestion;

    public EmptyScene(Question moveQuestion) {
        super(moveQuestion);
    }

    public Question getMoveQuestion() {
        return moveQuestion;
    }

    public void setMoveQuestion(Question moveQuestion) {
        this.moveQuestion = moveQuestion;
    }
}
