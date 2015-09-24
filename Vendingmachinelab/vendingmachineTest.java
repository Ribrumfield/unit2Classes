

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class vendingmachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vendingmachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class vendingmachineTest
     */
    public vendingmachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testReplaceCans()
    {
      vendingmachine machine=new vendingmachine();
      machine.replaceCans(5);   
      assertEquals(5,machine.getcans());
    }
    @Test
    public void testgivecan()
    {
          
    }

}
