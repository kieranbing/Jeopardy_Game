
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron Sokalski
 */
public class Division {
    int level;
    String question = "";
    int number1;
    int number2;
    int number3;
    int answer;
    boolean correct;
    
    void setLevel(int input) {
        level = input;
    }
    
    void question() {
        Random random = new Random();
        int chosen = Math.abs(random.nextInt(2)) + 1;
        switch (chosen) {
            case 1:
                DivisionLevel1();
                break;
            case 2:
                DivisionLevel2();
                break;
            default:
                System.out.println("Addition question selection error");
        }
    }
    
    public void DivisionLevel1(){
        question = "";
        correct = false;
        
        Random random = new Random();
        
        
        number1 = Math.abs(random.nextInt(10000)); 
        number2 = Math.abs(random.nextInt(100));
        
        question = number1+" ÷ "+number2+" = ?";
        answer = number1 / number2;  
    }
    
    public void DivisionLevel2(){
        question = ""; 
        correct = false;
        Random random = new Random();
        int rightSide;
        
        int[] numArray = new int[Math.abs(random.nextInt(5-2))+ 2]; 
        for (int i=0;i<numArray.length;i++){
            numArray[i] = Math.abs(random.nextInt(50)); 
        }
        int blank = Math.abs(random.nextInt(numArray.length));
        rightSide = numArray[0];
        for (int num:numArray){
            rightSide = rightSide/num; 
        }
        
        for(int i=0;i<numArray.length;i++){
            if (i == 0){
                if (i == blank){
                    question = question + "?";
                } else {
                    question = question + Integer.toString(numArray[i]);
                }
            } else if (i == blank){
                question = question + " ÷ ?";
            } else {
                question = question+" ÷ "+Integer.toString(numArray[i]);
            }
        }
        question = question +" = "+Integer.toString(rightSide);
        answer = numArray[blank]; 
    } 
}

