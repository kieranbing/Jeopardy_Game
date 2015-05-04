/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CAMERON 
 */
public class Addition {
    int level;
    String question = "";
    int number1;
    int number2;
    int answer;
    boolean correct;
    
    
    void setLevel(int PlaceHolder){
        level = PlaceHolder;
    }
    
    //Function for level one of addition category
    public boolean AdditionLevel1(){
    Random random = new Random();
    Scanner response = new Scanner(System.in);
    correct = false;
    
    number1 = Math.abs(random.nextInt(100));
    number2 = Math.abs(random.nextInt(100));
    
    question = number1+"+"+number2+"= ?";
    answer = number1+number2;
    
    //System.out.println(number1+" + "+number2+" = ");
    //int userAnswer = response.nextInt();
    //System.out.println(correct);
    return correct;
    }

    void question() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
