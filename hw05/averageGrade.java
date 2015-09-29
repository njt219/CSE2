//Nicholas Tulp
//CSE002 - homework 05 
//while loops and if-else statements to find averagegrades inputed
//october 1st, 2015 

import java.util.Scanner; //import the scanner utility
public class averageGrade{ //importing the public class
    public static void main(String[] args){ //import the main method
		Scanner myScanner = new Scanner(System.in); // importing myScanner
		System.out.println("Please enter a grade between 0 and 100 or 999 to end: "); //input print statement asking for grades
		int input = myScanner.nextInt(); //variable for input
		double sum_of_grades = 0.0; // variable for sum of all the grades together 
		double grades = 0.0; // variable for the amount of grades entered
		
		while (input >= 0 || input <= 100){ // while statement keeping the grades between 0-100
		sum_of_grades += input; // each input value is being added together
		grades++; // count the amount of iterations in the loop 
		
		if ( input == 999 ){ // if statement ending the code
			break; // ending the code
		}
		else if ( input < 0 || input > 100){ // the default else if statement incase number isn't between 1-100
			System.out.print ("This is not a valid number. Please keep it between 1-100.");
		}
		System.out.println("Please enter a grade between 0 and 100 or 999 to end: "); // the statement that gets repeated until 999 is entered
		input = myScanner.nextInt();
		}
		double sum = sum_of_grades - 999; // subtracting 999 from the sum 
		double grades_entered = grades - 1; // subtracting 1 value ( 999 ) from the total grades entered
		double x = (sum / grades_entered); // finding average
		System.out.print("The average of the grades entered is : "+x+"%."); // final print statement
		
}
}