/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.exercise2;

import java.util.Scanner;

/**
 *
 * @author Edwin Niño
 */
public class Exercise2 {

    private String sumDigits(String number) {
        String sum = "";
        for (int i = 0; i < number.length(); i++) {
            int num = number.charAt(i) - 48;
            if (num >= 0) {
                sum += num;
                if (i < number.length() - 1) {
                    sum += " + ";
                }
            }
        }
        sum += " = " + sumTotal(number);
        return sum;
    }

    private int sumTotal(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int num = number.charAt(i) - 48;
            if (num >= 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        Scanner sc = new Scanner(System.in);
        System.out.println(exercise2.sumDigits(sc.nextLine()));
    }
    
}
