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
public class Exercise13_1 {

    public void leftArea(float[][] M, char character){
        /**
         * Primer modo primitivo de recorrer los espacios requeridos de las matriz...
         */
        /*
        float sum = 0;
        sum+=M[1][0];
        sum+=M[2][0];sum+=M[2][1];
        sum+=M[3][0];sum+=M[3][1];sum+=M[3][2];
        sum+=M[4][0];sum+=M[4][1];sum+=M[4][2];sum+=M[4][3];
        sum+=M[5][0];sum+=M[5][1];sum+=M[5][2];sum+=M[5][3];sum+=M[5][4];
        sum+=M[6][0];sum+=M[6][1];sum+=M[6][2];sum+=M[6][3];sum+=M[6][4];
        sum+=M[7][0];sum+=M[7][1];sum+=M[7][2];sum+=M[7][3];
        sum+=M[8][0];sum+=M[8][1];sum+=M[8][2];
        sum+=M[9][0];sum+=M[9][1];
        sum+=M[10][0];
        */
        
        /**
         * Segundo modo de recorrer los espacios requeridos de las matriz..
         */
        float sum1 = 0;
        for (int i = 1; i <= 10; i++) {
            if(i==1){
                for (int j = 0; j <= 0; j++) {
                    sum1+=M[i][j];
                }
            }
            if(i==2){
                for (int j = 0; j <= 1; j++) {
                    sum1+=M[i][j];
                }
            }
            if(i==3){
                for (int j = 0; j <= 2; j++) {
                    sum1+=M[i][j];
                }
            }
            if(i==4){
                for (int j = 0; j <= 3; j++) {
                    sum1+=M[i][j];
                }
            }
            if(i==5){
                for (int j = 0; j <= 4; j++) {
                    sum1+=M[i][j];
                }
            }
            if(i==6){
                for (int j = 0; j <= 4; j++) {
                    sum1+=M[i][j];
                }
            }
            if(i==7){
                for (int j = 0; j <= 3; j++) {
                    sum1+=M[i][j];
                }
            }
            if(i==8){
                for (int j = 0; j <= 2; j++) {
                    sum1+=M[i][j];
                }
            }
            if(i==9){
                for (int j = 0; j <= 1; j++) {
                    sum1+=M[i][j];
                }
            }
            if(i==10){
                for (int j = 0; j <= 0; j++) {
                    sum1+=M[i][j];
                }
            }
        }
        System.out.println();
        
        /**
         * Impresión ordenada de la matriz 12x12...
         */
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        if(character=='S'||character=='s'){
            System.out.println(sum1);
        }
        if(character=='M'||character=='m'){
            System.out.println(new BigDecimal(sum1/30).setScale(1, RoundingMode.DOWN));
        }
        
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Exercise13_1 exercise13_1 = new Exercise13_1();
        char character=sc.next().charAt(0);
        float[][] M = new float[12][12];
        for (int i=0; i < M.length; i++) {
            for (int j=0; j < M[i].length; j++) {
                M[i][j]= sc.nextFloat();
            }
        }
        exercise13_1.leftArea(M,character);
    }
    
}
