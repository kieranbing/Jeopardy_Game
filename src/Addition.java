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
    
    void setLevel(int PlaceHolder){
        level = PlaceHolder;
    }
    
    //Function for level one of addition category
    public boolean AdditionLevel1(){
    Random random = new Random();
    Scanner response = new Scanner(System.in);
    boolean correct = false;
    
    int number1 = Math.abs(random.nextInt(100));
    int number2 = Math.abs(random.nextInt(100));
    
    System.out.println(number1+" + "+number2+" = ");
    int userAnswer = response.nextInt();
    
    if(userAnswer == (number1+number2)){
        correct = true;
    }
    
    System.out.println(correct);
    return correct;
    }
}
