/*
 By Jarrod Merryman
This class will create and array from a file and perform different methods to
show lowest, highest, total, and average.
 */
package arrayoperations;

import java.io.*;
import java.util.Scanner;

public class NumberAnalysis
{
    private double [ ] privArr; // The array that will hold the values
    private int i = 0; // Counter
    
    /*
    This constructor will take a string as its argument
    and use it to open a file then populate an array
    */
    public NumberAnalysis(String fileName) throws IOException
    {
        privArr = new double [12]; // Initialize the array with 12 spots
        
        // Open the file
        File file = new File(fileName);
        
        // check file exist and populate the array
        // or the file does not exist
        if (file.exists())
        {
            // Reads the file
            Scanner inputFile = new Scanner(file);
            while(inputFile.hasNext())
            { 
                privArr [i] =  inputFile.nextDouble();
                i++;
            }
            
            // Closes the file
            inputFile.close();
            System.out.println("File was closed");
        }
        else
        {
            System.out.println("The file doesnt exist");
        }
    }

   /*
    This method returns the lowest value
    in the array as a double
    */
    public double getLowest()
    {
        double min = privArr[0];
        
        for (double num : privArr)
        {
            if (min > num)
            {
                min = num;
            }
        }
        return min;
    }
    
     /*
    This method returns the highest value
    in the array as a double
    */
    public double getHighest()
    {
        double max = privArr[0];
        
        for (double num : privArr)
        {
            if (max < num)
            {
                max = num;
            }
        }
        return max;
    }
    
     /*
    This method returns the total value
    of the array values as a double
    */
    public double getTotal()
    {
        double total = 0;
        for (int i = 0; i < 12; i++)
        {
            double tempNum;
            tempNum = privArr [i];
            total += tempNum;
        }
        return total;
    }
    
     /*
    This method returns the average value
    of the array values as a double
    */
    public double getAverage()
    {
        double total = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++)
        {
            total += privArr [i];
            counter++;
        }
        total = total / counter;
        return total;
    }
}
