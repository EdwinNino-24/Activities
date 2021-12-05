/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise10;

import java.util.Scanner;

/**
 *
 * @author Edwin Niño
 */
public class Exercise10 {
    
    public String numberPerfect(int n){
        int sum = 0;
        for (int i=1; i<n; i++) {                    
            if (n%i==0) {
                sum=sum+i;   
            }
        }
        if(sum==n){              
            return "SI";
        } 
        else{
            return "NO";
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Exercise10 exercise10 = new Exercise10();
        System.out.println("Cantidad de numeros?");
        int counter = sc.nextInt();
        for (int i = 0; i <= counter; i++) {
            System.out.println(exercise10.numberPerfect(sc.nextInt()));
        }
        
    }
    
}
