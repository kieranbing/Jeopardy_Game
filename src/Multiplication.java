/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kieran Bingham
 */
public class Multiplication {
    int level; 
    
    void setLevel(int input){
        level = input; 
    }
    
    boolean question(){
        Random random = new Random();
        int chosen = Math.abs(random.nextInt(3));
        boolean correct = false; 
        switch (chosen){ 
                case 1:
                    correct = multiplyLevel1();
                    break;
                case 2: 
                    correct = multiplyLevel2();
                    break;
                default:
                    System.out.println("MathQ select error");
        }
        return correct; 
    }
    
    public boolean multiplyLevel1(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean correct = false; 
        
        int numOne = Math.abs(random.nextInt(10000)); 
        int numTwo = Math.abs(random.nextInt(100));
        
        System.out.println(numOne+" * "+numTwo+" =");
        int userNum = scanner.nextInt();
        
        if (userNum == (numOne * numTwo)){
             correct = true; 
        }
        System.out.println(correct);
        return correct; 
    } 
    
    public boolean multiplyLevel2(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean correct = false; 
        int answer = 0;
        
        int[] numArray = new int[Math.abs(random.nextInt(5-2))+ 2]; 
        for (int i=0;i<numArray.length;i++){
            numArray[i] = Math.abs(random.nextInt(50)); 
        }
        int blank = Math.abs(random.nextInt(numArray.length));
        for(int i=0;i<numArray.length;i++){
            if (i == 0){
                answer = numArray[i]; 
            } else {
                answer = answer*numArray[i]; 
            }
        }
        
        for(int i=0;i<numArray.length;i++){
            if (i == 0){
                if (i == blank){
                    System.out.print("__");
                } else {
                    System.out.print(numArray[i]);
                }
            } else if (i == blank){
                System.out.print(" * __");
            } else {
                System.out.print(" * "+numArray[i]);
            }
        }
        System.out.println(" = "+answer);
        
        System.out.print("Blank = ");
        int userNum = scanner.nextInt();

        if (userNum == numArray[blank]){
             correct = true; 
        }
        System.out.println(correct);
        return correct; 
    } 

}
