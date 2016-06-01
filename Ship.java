/*
By Jarrod Merryman
Creates an object of a ship
*/
package ships;

public class Ship 
{
    private String name; // Holds a string value for ship name
    private String year; // Holds a string value for ship year
    private String str; // Holds a string value for the toString method
    
    /*
    The constructor accepts two strings and sets them to the name and year
    */
    public Ship(String names, String years)
    {
        name = names;
        year = years;
    }
    
    /*
    This method returns the name of the ship
    */
    public String getName()
    {
        return name;
    }
    
    /*
    This method returns the year of the ship
    */
    public String getYear()
    {
        return year;
    }
    
    /*
    This method returns a string
    */
    public String toString()
    {
        str = "The name is " + name + " and the year is " + year + ".";
        return str;
    }

}
