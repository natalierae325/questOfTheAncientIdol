/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author natal
 */
public class BoulderControlTest {

    public BoulderControlTest() {
    }

    /**
     * Test of calcBoulderVolume method, of class BoulderControl.
     */
    @Test
    public void testCalcBoulderVolume() {
        System.out.println("calcBoulderVolume");

        System.out.println("\tTest Case 1");
        double boulderRadius = 5.0;
        double expResult = 104.6667;
        double result = BoulderControl.calcBoulderVolume(boulderRadius);
        assertEquals(expResult, result, 0.0001);

        System.out.println("\tTest Case 2");
        boulderRadius = -5;
        expResult = -1;
        result = BoulderControl.calcBoulderVolume(boulderRadius);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("\tTest Case 3");
        boulderRadius =20;
        expResult = -1;
        result = BoulderControl.calcBoulderVolume(boulderRadius);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("\tTest Case 4");
        boulderRadius = 0;
        expResult =0;
        result = BoulderControl.calcBoulderVolume(boulderRadius);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("\tTest Case 5");
        boulderRadius = 15;
        expResult = 942;
        result = BoulderControl.calcBoulderVolume(boulderRadius);
        assertEquals(expResult, result, 0.0001);
        
    }
    
    
    
    
    @Test
    public void testCalcBoulderSlopeDistance(){
        System.out.println("calcBoulderSlopeDistance");
        
        System.out.println("\tTest Case 1");
        double boulderSlopeDistance = 25;
        double expResult = 25;
        double slopeDistance = 25;
        double result = BoulderControl.calcBoulderSlopeDistance(boulderSlopeDistance, slopeDistance);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest Case 2");
        boulderSlopeDistance = -5;
        expResult = -5;
        slopeDistance = -1;
        result = BoulderControl.calcBoulderSlopeDistance(boulderSlopeDistance, slopeDistance);
        assertEquals(expResult, result, 0.0); 
        
        System.out.println("\tTest Case 3");
        boulderSlopeDistance = 40;
        expResult = 40;
        slopeDistance = -1;
        result = BoulderControl.calcBoulderSlopeDistance(boulderSlopeDistance, slopeDistance);
        assertEquals(expResult, result, 0.0); 
        
        System.out.println("\tTest Case 4");
        boulderSlopeDistance = 0;
        expResult = 0;
        slopeDistance = -1;
        result = BoulderControl.calcBoulderSlopeDistance(boulderSlopeDistance, slopeDistance);
        assertEquals(expResult, result, 0.0); 
        
        System.out.println("\tTest Case 5");
        boulderSlopeDistance = 35;
        expResult = 35;
        slopeDistance = -1;
        result = BoulderControl.calcBoulderSlopeDistance(boulderSlopeDistance, slopeDistance);
        assertEquals(expResult, result, 0.0); 
        
     }
    
    
    @Test
    public void testCalcUserSpeed() {
            System.out.println("calcUserSpeed");
            
            System.out.println("\tTest Case 1");
            double userTimeInput = 5;
            double expResult = 5;
            double userSpeed = 3.8;
            double result = BoulderControl.calcUserSpeed(userTimeInput, userSpeed);
            assertEquals(expResult, result, 0.0);
            
            System.out.println("\tTest Case 2");
            userTimeInput = 0;
            expResult = 0;
            userSpeed = -1;
            result = BoulderControl.calcUserSpeed(userTimeInput, userSpeed);
            assertEquals(expResult, result, 0.0);
            
            System.out.println("\tTest Case 3");
            userTimeInput = 20;
            expResult = 20;
            userSpeed = -1;
            result = BoulderControl.calcUserSpeed(userTimeInput, userSpeed);
            assertEquals(expResult, result, 0.0);
            
            System.out.println("\tTest Case 4");
            userTimeInput = 1;
            expResult = 1;
            userSpeed = 19;
            result = BoulderControl.calcUserSpeed(userTimeInput, userSpeed);
            assertEquals(expResult, result, 0.0);
            
            System.out.println("\tTest Case 5");
            userTimeInput = 19;
            expResult = 19;
            userSpeed = 1;
            result = BoulderControl.calcUserSpeed(userTimeInput, userSpeed);
            assertEquals(expResult, result, 0.0);
        }
    }
