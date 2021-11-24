/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8;

import java.util.Scanner;

/**
 *
 * @author Edwin Niño
 */
public class Exercise8 {

    public int fibonacci(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public static void main(String[] args) {
        
        Exercise8 exercise8 = new Exercise8();
        Scanner sc = new Scanner(System.in);
        int counterMax=sc.nextInt();
        for (int i = 0; i <= counterMax-1; i++) {
            System.out.print(" " + exercise8.fibonacci(i));
        }
    }
    
}
