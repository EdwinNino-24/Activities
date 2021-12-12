/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Edwin Niño
 */
public class Exercise13_2 {

    public void arraySelection(float[] A){
        for (int i = 0; i < A.length; i++) {
            if(A[i]<=10){
                System.out.println("A[" + i + "] = " + new BigDecimal(A[i]).setScale(1, RoundingMode.DOWN));
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Exercise13_2 exercise13_2 = new Exercise13_2();
        float[] A = new float[100];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextFloat();
        }
        System.out.println();
        exercise13_2.arraySelection(A);
    }
    
}
