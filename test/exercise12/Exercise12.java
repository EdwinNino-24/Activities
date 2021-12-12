/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise12;

import java.util.Scanner;

/**
 *
 * @author Edwin Niño
 */
public class Exercise12 {

    public int extractDiamond(String n){
        int counterOpen=0;
        int counterClose=0;
        
        for (int i = 0; i < n.length(); i++) {
            if('<'==n.charAt(i)){
                counterOpen++;
            }
            if('>'==n.charAt(i)){
                counterOpen--;
                counterClose++;
            }
        }
        
        return counterClose;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Exercise12 exercise12 = new Exercise12();
        int counter = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= counter; i++) {
            System.out.println(exercise12.extractDiamond(sc.nextLine()));
        }
        
    }
    
}
