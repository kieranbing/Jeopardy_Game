import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Kieran Bingham
 */
public class Multiplication {
    //define variables 
    int level; 
    String question = "";
    int numOne; 
    int numTwo;
    double answer; 
    boolean correct;
    int qAsked = 0; 
    
    void setLevel(int input){
        level = input; 
    }
    
    //chooses randomly what difficulty of question to ask based on the function selected
    void question(){
        Random random = new Random();
        int chosen = Math.abs(random.nextInt(2)) + 1;
        switch (chosen){ 
                case 1:
                    generateMulti1();
                    break;
                case 2: 
                    generateMulti2();
                    break;
                default:
                    System.out.println("MathQ select error");
        }
        
        System.out.println(question);
    }   
    
    //function for level 1 of multiplication
    public void generateMulti1(){
        qAsked = 1; 
        question = "";
        correct = false;
        
        Random random = new Random();
        
        numOne = Math.abs(random.nextInt(10000)); 
        numTwo = Math.abs(random.nextInt(100));
        
        question = numOne+" × "+numTwo+" = ?";
        answer = numOne * numTwo;  
    } 
    
    //function for level 2 of multiplication
    public void generateMulti2(){
        qAsked = 2;
        question = ""; 
        Random random = new Random();
        int rightSide;
        
        int[] numArray = new int[Math.abs(random.nextInt(5-2))+ 2]; 
        for (int i=0;i<numArray.length;i++){
            numArray[i] = Math.abs(random.nextInt(50)); 
        }
        int blank = Math.abs(random.nextInt(numArray.length));
        rightSide = numArray[0];
        for (int num:numArray){
            rightSide = rightSide*num; 
        }
        
        for(int i=0;i<numArray.length;i++){
            if (i == 0){
                if (i == blank){
                    question = question + "?";
                } else {
                    question = question + Integer.toString(numArray[i]);
                }
            } else if (i == blank){
                question = question + " × ?";
            } else {
                question = question+" × "+Integer.toString(numArray[i]);
            }
        }
        question = question +" = "+Integer.toString(rightSide);
        answer = numArray[blank]; 
    } 
    
    public boolean getAnswer(){
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        if (userNum == answer){
             correct = true; 
        }
        System.out.println(correct);
        return correct; 
    }
    
    public boolean checkAnswer(JTextField textField){
        int userNum = Integer.valueOf(textField.getText());
        if (userNum == answer){
             correct = true; 
        }
        System.out.println(correct);
        return correct; 
    }

}
