/* 
By Jarrod Merryman
This program creates three different ship objects and pass the information
to the different classes and accesses the toString methods of each.
*/

package ships;


public class Ships {


    public static void main(String[] args) 
    {
        // Creates an array of 3 ship objects
        Ship[] ships =
        {
            new Ship("Blah","1991"),
            new CruiseShip(100,"BlahBlah","1992"),
            new CargoShip(1000,"BlahBlahBlah","1993")
        };
        
        // Accesses the toStrings methods of each object in the array
        for(int i = 0; i < ships.length; i++)
        {
            System.out.println(ships[i].toString());
        }
    }
    
}
