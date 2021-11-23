/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import java.util.Scanner;

/**
 *
 * @author Edwin Niño
 */
public class Exercise5 {

    private static boolean isPangram(String phrase) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
 
        for (int i = 0; i < abc.length(); i++) {
            if(!phrase.contains(""+abc.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int phrasesNum = scanner.nextInt();
        scanner.nextLine();
        String phrase;
        
        for (int i = 0; i < phrasesNum; i++) {
            phrase = scanner.nextLine();
            if(isPangram(phrase.toLowerCase())) {
                 System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    
}
