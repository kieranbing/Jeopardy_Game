import javax.swing.JTextField;

/**
 *
 * @author Kieran Bingham
 */
public class Question {
    //define variables 
    String question = "";
    double answer; 
    boolean correct;
    
    //syncronizing questions and answers
    void syncQuestion(String questionIn, double answerIn){
        question = questionIn; 
        answer = answerIn;
    }
    
    //checking answers 
    public boolean checkAnswer(JTextField textField){
        correct = false; 
        double userNum = Double.valueOf(textField.getText());
        if (userNum == answer){
             correct = true; 
        }
        System.out.println(correct);
        return correct; 
    }
    
    void askQuestion(){
        
    }
}
