/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13;

import java.util.Scanner;

/**
 *
 * @author Edwin Niño
 */
public class Exercise13_3_1 {

    public void parenthesisEquilibrium(String chain){
        int counterOpen=0;
        int counterClose=0;
        
        for (int i = 0; i < chain.length(); i++) {
            if('('==chain.charAt(i)){
                counterOpen++;
            }
            if(')'==chain.charAt(i)){
                counterClose++;
            }
            if(')'==chain.charAt(0)){
                counterClose--;
            }
        }
        
        if(counterOpen==counterClose){
            System.out.println("correct");
        }
        else{
            System.out.println("incorrect");
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Exercise13_3_1 exercise13_3 = new Exercise13_3_1();
        int counter = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < counter; i++) {
            exercise13_3.parenthesisEquilibrium(sc.nextLine());
        }     
    }
    
}
