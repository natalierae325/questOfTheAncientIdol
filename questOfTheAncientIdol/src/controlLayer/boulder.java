/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

/**
 *
 * @author natal
 */
public class boulder {
    public static double calcBoulderVolume(double boulderRadius) {
        if (boulderRadius < 0){
            return -1;
        }
        if (boulderRadius < 0 || boulderRadius > 15){
        return 0;
    }
        double boulderVolume;
        
        System.out.println("Enter the diamater of the boulder:");
        boulderRadius = (user input / 2.0);
        boulderVolume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( boulderRadius, 3 );
        System.out.println("Volume = " + boulderVolume);
        return;
    }
    
    
    
    public static double calcBoulderSlopeDistance(double )
}
