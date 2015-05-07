
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Family
 */
public class Question {
    String question = "";
    double answer; 
    boolean correct;
    
    void syncQuestion(String questionIn, double answerIn){
        question = questionIn; 
        answer = answerIn;
    }
    
    public boolean checkAnswer(JTextField textField){
        correct = false; 
        int userNum = Integer.valueOf(textField.getText());
        if (userNum == answer){
             correct = true; 
        }
        System.out.println(correct);
        return correct; 
    }
    
    void askQuestion(){
        
    }
}
