/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.exercise7;

import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Edwin Niño
 */
public class Exercise7 {
    
    public double determine(int n){
        return (Math.floor(Math.pow((3+Math.sqrt(5)),n)))%1000;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Exercise7 exercise7 = new Exercise7();
        Formatter fmt = new Formatter();
        System.out.println("Cantidad de numeros?");
        int counter = sc.nextInt();
        System.out.println();
        
        for (int i = 0; i < counter; i++) {
            fmt.format("%03d",(int)exercise7.determine(sc.nextInt()));
        }
        
        String chain = String.valueOf(fmt);
        
        for (int i = 0; i < chain.length(); i++) {
            if(i==0||i==3||i==6||i==9||i==12||i==15){
                System.out.println();
                System.out.println();
            }
            System.out.print(chain.charAt(i));
        }
    }
    
}
