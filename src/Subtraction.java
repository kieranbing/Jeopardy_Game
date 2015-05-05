/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author Cameron Sokalski
 */
public class Subtraction {
     int level;
    String question = "";
    int number1;
    int number2;
    int answer;
    boolean correct;

    void setLevel(int input) {
        level = input;
    }
    
    public void SubtractionLevel1(){
        question = "";
        correct = false;
        
        Random random = new Random();
        
        number1 = Math.abs(random.nextInt(100))+50;
        number2 = Math.abs(random.nextInt(50));
        
        question = number1 + "-" + number2 + "= ?";
        answer = number1 - number2;
    }
}
