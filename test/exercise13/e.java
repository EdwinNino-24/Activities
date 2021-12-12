/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Edwin Niño
 */
public class e {
  
    public boolean procesarCadena(String cadena) {
        Stack<Character> stackLetras = new Stack<>();
        char arrayDeLetras[] = cadena.toCharArray();
        int i;
        for (i = 0; i < arrayDeLetras.length; i++) {
          if (arrayDeLetras[i] == '(') {
            stackLetras.push(arrayDeLetras[i]);
          }else if (arrayDeLetras[i] == ')') {
            if (!stackLetras.empty() && stackLetras.peek() != ')') {
              stackLetras.pop();
            }else{
              stackLetras.push(arrayDeLetras[i]);
            }
          }
        }
        return stackLetras.empty();
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        e e = new e();
        
        System.out.println(e.procesarCadena(")3+b*(2-c)( "));
    }
    
}
