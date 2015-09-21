

/**
 * A car has a certain fuel efficancy and a certain amount of fule in the gas tank.
 *  The car may be driven which reduces the amount of gas in the fuel tank.
 * 
 * @author Bobby Brumfield 
 * @version 10 September 2015
 */
public class Car
{
    /** The fuel efficiency for the car measured in units of miles / gallon (mpg) */
    private double fuelEfficiency;
    
    /** the amount of fuel in the tank of the car measured in units of gallons */
    privet double fuelInTank;
    

    /**
     *Constructor of class Car that specifies the fuel efficiency
     */
    public Car(double efficiency )
    {
        fuelEfficiency = efficiency;
        fuelInTank = 0;
    }

    /**
     * This method simulates driving the car for the specified distance and
     * reduces the fuel in the tank
     *
     * @pre        the specified distance will not consume more than the available gas
     *            
     * @param   distance    the specified distance to drive in units of miles
     */
    public void drive( double distance )
    {
       
    }
    @Test
    public void testDrive()
    {
        Car car = new Car ( 50.0 );
        car.addGas( 10.0 );
               
    }

}
