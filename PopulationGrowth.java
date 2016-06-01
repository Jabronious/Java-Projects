/*
By Jarrod Merryman
This program will ask for population, % growth, and how
long will the population grow then uses a recursion method to
calculate the population at the end.
 */
 
 
import java.util.Scanner;
import java.text.*;
 
public class PopulationGrowth
{
    public static void main(String[] args)
    {
        int days; // holds the amount of days the pop. will grow
        double population; // holds the starting size of the pop
        double percentGrowth; // the percent growth of the population
       
        // Initializes a formatter for the output values
        DecimalFormat formatter = new DecimalFormat("#0.000");
       
        // initializes a keyboard scanner
        Scanner keyboard = new Scanner(System.in);
       
        // Asks for the population size
        do
        {
            System.out.println("What is the population?");
            population = keyboard.nextDouble();
        } while (population < 2);
       
        // Asks for the percent growth of the pop.
        do
        {
            System.out.println("What is the growth of the"
                    + " population(Percent)?");
            percentGrowth = keyboard.nextDouble();
        } while (percentGrowth < 0);
        // turns the percent to a decimal
        percentGrowth = percentGrowth * .01;
       
        // Asks for the time frame for the pop growth
        do
        {
            System.out.println("How many days will the population grow?");
            days = keyboard.nextInt();
        } while (days < 0);
       
        // Outputs the population growth
        System.out.println("The population"
                + " after " + days + " days is "
           + formatter.format(newPopulation(days,population,percentGrowth)));
       
 
    }
   
    /*
    This is a recursion method to continue growing the population until
    days runs out.
    */
    public static double newPopulation(int days, double population,
            double percentGrowth)
    {
        DecimalFormat formatter = new DecimalFormat("#0.000");
        if (days <= 0)
            return population;
        else
        {
            population = population * percentGrowth + population;
            System.out.println("The current : " + formatter.format(population));
            return newPopulation(days-1,population,percentGrowth);
        }
    }
   
}