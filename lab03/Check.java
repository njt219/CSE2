//////////////////////////////////////////////////////////////////////////////////////////////////////////
// Nicholas Tulp
// lab 03 
// introducing a scanner tool to obtain original cost of check, the percentage of tip and how much each person has to pay
// September 10, 2015 
import java.util.Scanner; 

public class Check{ 
    // main method required for every Java program
    public static void main(String[] args) { 
    Scanner myScanner = new Scanner ( System.in ) ; // introducing the Scanner Constructor
    System.out.print ("Enter the original cost of the check in the form xx.xx: "); // print statement asking for cost of check from user
    double checkCost = myScanner.nextDouble(); // this command calls a method that Scanner objects have
    System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx) :"); // asking the user to insert the amount of tip they wish to pay
    double tipPercent = myScanner.nextDouble() ; // let the scanner know the tip percentage
    tipPercent /= 100; // In order to convert the percentage into a decimal value
    System.out.print("Enter the number of people who went out to dinner: "); // print statement asking user how many people were at dinner
    int numPeople = myScanner.nextInt(); // let the scanner know how many people were at dinner
    double totalCost ; // establish variables for the cost
    double costPerPerson ; // establish variables for cost per person
    int dollars, // establish variables for the amount owed per person
            dimes, pennies ; 
    totalCost = checkCost * (1+tipPercent); // to find total cost 
    costPerPerson = totalCost / numPeople; // dividing total by number of people 
    dollars=(int)costPerPerson; // variable for cost per person
    dimes=(int)(costPerPerson * 10) % 10; // variable for money owed 
    pennies=(int)(costPerPerson * 100 ) % 10; // variable for money owed 
    System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies) ; 

    } // end of main method
} // end of class

        