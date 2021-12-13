package DayTen;

import java.util.Arrays;
import java.util.Stack;

public class Scoring1 {
    public static void main(String[] args) {
        Scoring1 scoring = new Scoring1();
        scoring.stackPush(scoring.characterStack);
        System.out.println(scoring.characterStack);
        scoring.stackPop(scoring.characterStack, scoring.charArray);


    }

    Stack<Character> characterStack = new Stack<>();
    String input = "[({()})]";
    char[] charArray= input.toCharArray();
    String[] split = input.split("");



    public void stackPush(Stack<Character> characterStack) {

        for (int i = 0; i < charArray.length; i++) {
            characterStack.push(charArray[i]);
        }

    }

    public void stackPop(Stack<Character> characterStack, char[] charArray){
        for (int i=0; i<characterStack.size(); i++){


            }

        }
    }



