// Nicholas Tulp 
// hw03 
// A program that prompts the user for the current time and dinner time and prints the time in between. 
// September 15, 2015
import java.util.Scanner; // introducing the scanner tool

public class Timer{ // introducing the public class 
    public static void main(String[] args) { // introducing the main method 
        Scanner myScanner = new Scanner ( System.in ) ; // introducing the scanner constructor 
        System.out.print ("Enter the current time: "); // print statement asking for current time
        double current_time = myScanner.nextDouble(); // lets the scanner know the current time
        System.out.print ("Enter the time you plan on having dinner: "); // print statement asking for dinner time
        double dinner_time = myScanner.nextDouble(); // lets the scanner know the dinner time
        double difference_in_time = dinner_time - current_time ; // in order to find time until dinner we must subtract the final from the current
        double difference_in_time_temp = (int)(difference_in_time*1); // in order to make the answer a single digit
        double difference_in_time_final = difference_in_time_temp/100; // in order to make the answer a single digit
        int difference_in_time_int = (int) (difference_in_time_final); // trunkating the difference in time to just the hour
        int minutes = (int) ((difference_in_time_final - difference_in_time_int) * 100); // producing the minutes from the hour into a single number
        System.out.println ("You have "+difference_in_time_int+" hours and "+minutes+" minutes until dinner."); // the final print statement 
        
    } // closing main method
} // closing public class
