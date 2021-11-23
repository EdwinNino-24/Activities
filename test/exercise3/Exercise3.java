/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.exercise3;

/**
 *
 * @author Edwin Niño
 */
import java.util.Scanner;

public class Exercise3 {
    
    public int numberOfSegments(int x){
        int numberOfSegments = 0;
        for (int i = 0; i <= x; i++) {
            int hours = i/3600;
            int residue = i%3600;
            int minutes = residue/60;
            residue = i%60;
            String hourComplete = createHour(hours, minutes, residue);
            for(int j = 0; j < hourComplete.length(); j++){
                int number = Integer.parseInt(hourComplete.charAt(j)+"");
                switch(number){
                    case 0: case 6: case 9: numberOfSegments += 6;
                    break;
                    case 1: numberOfSegments += 2;
                    break;
                    case 2: case 3: case 5: numberOfSegments += 5;
                    break;
                    case 4: numberOfSegments += 4;
                    break;
                    case 7: numberOfSegments += 3;
                    break;
                    case 8: numberOfSegments += 7;
                    break;
                }
            }
        }
        return numberOfSegments;
    }
        
    public static String createHour(int hours, int minutes, int seconds){
        String hourComplete = "";
        if(hours < 10){
            hourComplete += 0;
        }
        hourComplete += hours;
        if(minutes < 10){
            hourComplete += 0;
        }
        hourComplete += minutes;
        if(seconds < 10){
            hourComplete += 0;
        }
        hourComplete += seconds;
        
        return hourComplete;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Exercise3 exercise3 = new Exercise3();
        System.out.println(exercise3.numberOfSegments(sc.nextInt()));
    }
}
