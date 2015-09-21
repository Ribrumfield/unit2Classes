/**
 * Write a description of class vendingmachine here.
 * 
 * @author Bobby Brumfield 
 * @version 21 september 2015
 */
public class vendingmachine
{
    /** description of instance variable x (add comment for each instance variable) */
    
    /**Number of tokens put into the machine*/
    private int tokens;
    
    /**Number of cans in the machine*/
    private int  cans;    

    /**
     * Default constructor for objects of class vendingmachine
     */
    public vendingmachine()
    {
        // initialise instance variables
        cans = 0;
        tokens = 0;        
    }
    public void inserttoken()
    {
        //When the user puts in a token
        tokens = tokens + 1;        
    }
    public void givecan()
    {
        //When a token has been put in and the can is dispensed 
        cans = cans - 1;
    }
    public void replaceCans()
    {
       //When cans are placed back in the machine
       
    }
    public void refundTokens()
    {
      //When more tokens are put in then cans are taken out
      
    }
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return cans;
    }
}
