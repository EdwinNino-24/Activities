/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.exercise1;

import java.util.Scanner;

/**
 *
 * @author Edwin Niño
 */
public class Exercise1 {
    
    public long determineMCM(int firstNumber, int secondNumber, int thirdNumber){
        int numMax = firstNumber;
        if( secondNumber > numMax ){
            numMax = secondNumber;
        }
        if( thirdNumber > numMax ){
            numMax = thirdNumber;
        }   
        int i = numMax;
        while((i % firstNumber != 0) || (i % secondNumber != 0) || (i % thirdNumber != 0)){
            i++;
        }   
        return i;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Exercise1 exercise1 = new Exercise1();
        
        System.out.println(exercise1.determineMCM(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    }
    
}
