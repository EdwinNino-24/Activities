/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Edwin Niño
 */
public class Exercise13_3_2 {

    public void parenthesisEquilibrium(String chain) {
        Stack<Character> stackLetters = new Stack<>();
        char arrayLetters[] = chain.toCharArray();
        for (int i = 0; i < arrayLetters.length; i++) {
            if (arrayLetters[i] == '(') {
                stackLetters.push(arrayLetters[i]);
            }
            else if (arrayLetters[i] == ')') {
                if (!stackLetters.empty() && stackLetters.peek() != ')') {
                    stackLetters.pop();
                }
                else{
                    stackLetters.push(arrayLetters[i]);
                }
            }
        }
        if(stackLetters.empty()){
            System.out.println("correct");
        }
        else{
            System.out.println("incorrect");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise13_3_2 exercise13_3_2 = new Exercise13_3_2();
        int counter = Integer.parseInt(sc.nextLine());
        System.out.println();
        for (int i = 0; i < counter; i++) {
            exercise13_3_2.parenthesisEquilibrium(sc.nextLine());
        }     
    }
}
