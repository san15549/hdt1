/**
 * @author Carlo David Sanchinelli, Juan Pablo Zea, Luis Najera
 * @version 13.07.16
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RadioTest2 {
    
    public RadioTest2() {
        
    }
    
    /**
     * Test of getStation method, of class Radio.
     */
    @Test
    public void testGetStation() {
        System.out.println("getStation");
        Radio instance = new Radio(true);
        String expResult = "87.9";
        String result = instance.getStation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setStation method, of class Radio.
     */
    @Test
    public void testSetStation() {
        System.out.println("setStation");
        int position = 1;
        Radio instance = new Radio(true);
        instance.setStation(position);
        // TODO review the generated test code and remove the default call to fail.
        if (position != 1){
            fail("The test case is a prototype.");
        }
        
    }

 
    /**
     * Test of setMemory method, of class Radio.
     */
    @Test
    public void testSetMemory() {
        System.out.println("setMemory");
        int position = 2;
        Radio instance = new Radio(true);
        instance.setMemory(position);
        // TODO review the generated test code and remove the default call to fail.
        if (position >12){
            fail("The test case is a prototype.");
        }
    }

    
    
}
