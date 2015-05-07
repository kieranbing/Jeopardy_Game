import java.util.Random;

/**
 *
 * @author Cameron Sokalski
 */
public class Division {
    //define variables 
    int level;
    String question = "";
    int number1;
    int number2;
    int number3;
    int answer;
    boolean correct;
    int number1Selector;
    int number2Selector;
    int[] firstNumberSelectorArray = {10, 20, 40, 60, 80, 100};
    int[] secondNumberSelectorArray = {2, 4, 10};
    
    void setLevel(int input) {
        level = input;
    }
    
    //chooses randomly what difficulty of question to ask based on the function selected
    void question() {
        Random random = new Random();
        int chosen = Math.abs(random.nextInt(2)) + 1;
        switch (chosen) {
            case 1:
                DivisionLevel1();
                break;
            case 2:
                DivisionLevel1();
                break;
            default:
                System.out.println("Addition question selection error");
        }
    }
    
    //function for level 1 of division
    public void DivisionLevel1(){
        question = "";
        correct = false;
        
        Random random = new Random();
        
        number1Selector = Math.abs(random.nextInt(5));
        number1 = firstNumberSelectorArray[number1Selector]; 
        number2Selector = Math.abs(random.nextInt(2));
        number2 = secondNumberSelectorArray[number2Selector];
        
        question = number1+" ÷ "+number2+" = ?";
        answer = number1 / number2;  
    }
}

