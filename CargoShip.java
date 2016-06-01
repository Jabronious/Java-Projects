/*
By Jarrod Merryman
The class creates a Cargo Ship object and extends the Ship class.
*/
package ships;

public class CargoShip extends Ship
{
    private int tons; // Creates and int value of tons
    private String str; // Creates a string for the toString
    
    /*
    This constructor accepts an int and 2 string values. Then calls the super
    constructor
    */
    public CargoShip(int tonnage, String names, String years)
    {
        super(names, years);
        tons = tonnage;
    }
    
    /*
    This toString method overrides the super class method and passes a string
    */
    @Override
    public String toString()
    {
        str = "The name is " + getName() + " and the maximum tonnage "
                + "is " + tons + ".";
        return str;
    }
}
