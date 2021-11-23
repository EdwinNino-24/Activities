/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.exercise6;

import java.util.Scanner;

/**
 *
 * @author Edwin Niño
 */
public class Exercise6 {
    
    public String check(String chain){
        int counterOpen=0;
        int counterClose=0;
        
        for (int i = 0; i < chain.length(); i++) {
            if('('==chain.charAt(i)){
                counterOpen++;
            }
            if(')'==chain.charAt(i)){
                counterClose++;
            }
        }
        
        if(counterOpen==counterClose){
            return "SI";
        }
        return "NO";
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Exercise6 exercise6 = new Exercise6();
        
        for (int i = 0; i < 7; i++) {
            System.out.println(exercise6.check(sc.nextLine()));
        }  
    }
    
}
