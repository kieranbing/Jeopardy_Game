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

    void setLevel(int input) {
        level = input;
    }

    void question() {
        Random random = new Random();
        int chosen = Math.abs(random.nextInt(2)) + 1;
        switch (chosen) {
            case 1:
                AdditionLevel1();
                break;
            case 2:
                AdditionLevel2();
                break;
            default:
                System.out.println("Addition question selection error");
        }
    }

    //Function for level one of addition category

    public boolean AdditionLevel1() {
        question = "";
        correct = false;

        Random random = new Random();

        number1 = Math.abs(random.nextInt(100));
        number2 = Math.abs(random.nextInt(100));

        question = number1 + "+" + number2 + "= ?";
        answer = number1 + number2;

        return correct;
    }
    
    //function for level 2 of addition category
    public void AdditionLevel2() {
        question = "";
        correct = false;
        
        Random random = new Random();
        
        number1 = Math.abs(random.nextInt(1000));
        number2 = Math.abs(random.nextInt(1000));
        
        question = number1 + "+" + number2 +"= ?";
        answer = number1 + number2;
        
        
    }
}
