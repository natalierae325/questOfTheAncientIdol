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
public class BoulderControl {

    public BoulderControl() {
    }

    public static double calcBoulderVolume(double boulderRadius) {
        if (boulderRadius < 0 || boulderRadius > 15) {
            return -1;
        }

        double boulderVolume = (4.0 / 3.0) * 3.14 * Math.pow(boulderRadius, 2);
        return boulderVolume;

    }
    
    public static double calcBoulderSlopeDistance(double boulderSlopeDistance, double slopeDistance){
        if (boulderSlopeDistance < 0 || boulderSlopeDistance > 35) {
            return -1;
        }
        
        slopeDistance = Math.pow(9, 2) + Math.pow(16, 2) + Math.pow(slopeDistance, 2);
            return slopeDistance;
    }
    
    public static double calcUserSpeed (double userTimeInput, double userSpeed) {
        if (userTimeInput < 1 || userTimeInput > 19 ) {
            return -1;
        }
        
        userSpeed = 19/userTimeInput;
        return userSpeed;
    }
}
