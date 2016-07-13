/**
 * @author Carlo David Sanchinelli, Juan Pablo Zea, Luis Najera
 * @version 14.07.16
 */

import org.junit.Test;
import static org.junit.Assert.*;


public class RadioTest {
    
    public RadioTest() {
        
    }

    /**
     * Test of isOn method, of class Radio.
     */
    @Test
    public void testIsOn() {
        System.out.println("isOn");
        Radio instance = new Radio(true);
        boolean expResult = true;
        boolean result = instance.isOn();
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getFrequency method, of class Radio.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        Radio instance = new Radio(true);
        String expResult = "fm";
        String result = instance.getFrequency();
        if (!result.equals(expResult)){
            fail("The test case is a prototype.");
        }

    }

    /**
     * Test of setFrequency method, of class Radio.
     */
    @Test
    public void testSetFrequency() {
        System.out.println("setFrequency");
        String frequency = "fm";
        Radio instance = new Radio(true);
        instance.setFrequency(frequency);
        if (!frequency.equals("fm")){
            fail("The test case is a prototype.");
        }
        
    }

    
}
