/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11;

import java.util.Scanner;

/**
 *
 * @author Edwin Niño
 */
public class Exercise11 {
        public void changeMoney(float n){
            int ticketOneHundred=0, ticketFifty=0, ticketTwenty=0, ticketTen=0, ticketFive=0, ticketTwo=0;
            float coinOne=0, coinTwo=0, coinThree=0,coinFour=0, coinFive=0, coinSix=0;

            System.out.println("NOTAS");
            ticketOneHundred=(int) (n/100);
            n=n-(ticketOneHundred*100);

            if(ticketOneHundred>=0){
                System.out.println(ticketOneHundred + " nota(s) de R$ 100.00");
            }

            ticketFifty=(int) (n/50);
            n=n-(ticketFifty*50);

            if(ticketFifty>=0){
                System.out.println(ticketFifty + " nota(s) de R$ 50.00");
            }

            ticketTwenty=(int) (n/20);
            n=n-(ticketTwenty*20);

            if(ticketTwenty>=0){
                System.out.println(ticketTwenty + " nota(s) de R$ 20.00");
            }

            ticketTen=(int) (n/10);
            n=n-(ticketTen*10);

            if(ticketTen>=0){
                System.out.println(ticketTen + " nota(s) de R$ 10.00");
            }

            ticketFive=(int) (n/5);
            n=n-(ticketFive*5);

            if(ticketFive>=0){
                System.out.println(ticketFive + " nota(s) de R$ 5.00");
            }

            ticketTwo=(int) (n/2);
            n=n-(ticketTwo*2);

            if(ticketOneHundred>=0){
                System.out.println(ticketTwo + " nota(s) de R$ 2.00");
            }


            System.out.println();
            System.out.println("MONEDAS");

            coinOne=(int)(n/1);
            n=n-(coinOne*1);

            if(coinOne>=0){
                System.out.println(coinOne + " moeda(s) de R$ 1.00");
            }

            coinTwo=(int)(n/0.5);
            n=(float) (n-(coinTwo*0.5));

            if(coinTwo>=0){
                System.out.println(coinTwo + " moeda(s) de R$ 0.50");
            }

            coinThree=(int)(n/0.25);
            n=(float) (n-(coinThree*0.25));

            if(coinThree>=0){
                System.out.println(coinThree + " moeda(s) de R$ 0.25");
            }

            coinFour=(int)(n/0.10);
            n=(float) (n-(coinFour*0.10));

            if(coinFour>=0){
                System.out.println(coinFour + " moeda(s) de R$ 0.10");
            }

            coinFive=(int)(n/0.05);
            n=(float) (n-(coinFive*0.05));

            if(coinFive>=0){
                System.out.println(coinFive + " moeda(s) de R$ 0.05");
            }

            coinSix=(int)(n/0.01);
            n=(float) (n-(coinSix*0.01));

            if(coinSix>=0){
                System.out.println(coinSix + " moeda(s) de R$ 0.01");
            }
        }
    
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Exercise11 exercise11 = new Exercise11();
        exercise11.changeMoney(sc.nextFloat());
     
    }
    
}
