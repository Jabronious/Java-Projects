/*
 By Jarrod Merryman
This program creates a NumberAnalysis Object and access several
methods from the NumberAnalysis class
 */
package arrayoperations;

import java.io.*;

public class ArrayOperations 
{
    public static void main(String[] args) throws IOException
    {
        
        // Creates an object of NumberAnalysis
        NumberAnalysis arrayFile;
        arrayFile = new NumberAnalysis("Numbers.txt");
        
        // Accesses methods and shows the values they return
        System.out.println(arrayFile.getLowest());  
        System.out.println(arrayFile.getHighest());  
        System.out.println(arrayFile.getTotal());  
        System.out.println(arrayFile.getAverage());  
    }
    
}
