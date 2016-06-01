/*
By Jarrod Merryman
The class creates a Cruise Ship object and extends the Ship class.
*/
package ships;

public class CruiseShip extends Ship 
{
    private String str; // Creates a string for the toString
    private int passengers; // Creates an int value for number of passengers
          
    /*
    This constructor accepts an int and 2 string values. Then calls the super
    constructor
    */
    public CruiseShip(int people, String names, String years)
    {
        super(names, years);
        passengers = people;  
    }

    /*
    This toString method overrides the super class method and passes a string
    */
    @Override
    public String toString()
    {
        str = "The name is " + getName() + " and the maximum number "
                + "of passengers is " + passengers + ".";
        return str;
    }
}
