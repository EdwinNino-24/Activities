package exercise9;

import java.util.Scanner;

public class Exercise9 {

    public String phraseInverse(String chain){
        chain = chain + " ";
        String inverse = "";
	String word = "";
	for (int i = 0; i < chain.length(); i++) {
            word += chain.charAt(i);
            if(chain.charAt(i) == ' ') {
		inverse = word + " " + inverse;
		word = "";
            }
        }
        return inverse;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Exercise9 exercise9 = new Exercise9();
        System.out.println("Cantidad de palabras?");
        int counter = sc.nextInt();
        for (int i = 0; i <= counter; i++) {
            System.out.println(exercise9.phraseInverse(sc.nextLine()));
        }
    }
}
