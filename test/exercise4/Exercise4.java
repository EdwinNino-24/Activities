/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author Edwin Niño
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SoupController soupController = new SoupController();
        soupController.printMatrix();
        soupController.countHorizontalL();
        soupController.countHorizontalR();
        soupController.countVerticalT();
        soupController.countVerticalB();
        soupController.countDiagonalLT();
        soupController.countDiagonalRB();
        soupController.countDiagonalRT();
        soupController.countDiagonalBR();
        soupController.printResult();
    }
    
}
