/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distanceoftwopoints;

/**
 *
 * @author Charlie Burris
 */
import java.util.Scanner;

public class DistanceOfTwoPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Find the distance between two points
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
       
        System.out.println("Enter x2 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
       
        
        double distance = Math.pow((x2 - x1) * (x2 - x1) + 
                (y2 - y1) * (y2 - y1), 0.5);
        System.out.println("Distance is " + distance);
        
    }
    
}
