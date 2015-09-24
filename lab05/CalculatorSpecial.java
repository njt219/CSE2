//Nicholas Tulp
//CSE002 - lab05
//Calculator that asks user for input until they reply "n" or "N" to the question "Type n or N to stop"
//09-24-2015

import java.util.Scanner;
public class CalculatorSpecial{ 
    public static void main(String[] args){
     Scanner myScanner = new Scanner ( System.in );
     System.out.println ("Welcome to the Special Calculator Program"); 
     
     boolean stop = true; 
  
     while(stop==true){ 
     
     System.out.print ("Please enter your first number :"); 
     int first_integer = myScanner.nextInt(); 
     System.out.print ("Please enter your second number :");
     int second_integer = myScanner.nextInt(); 
     
     double add = first_integer+second_integer;
     double multiply =  first_integer*second_integer;
     double divide = first_integer/second_integer; 
     double subtract = first_integer-second_integer; 
    
     System.out.print("What operation would you like to be performed? (+, *, /, -) ");
     String operation = myScanner.next();
     switch (operation) {
        case "+": 
        System.out.println("The result of the two integers added is "+add);
                        break; 
        case "*": 
        System.out.println("The result of the two integers multiplied is "+multiply); 
                        break; 
        case "/": 
        System.out.println("The result of the first integer divided by the second is "+divide); 
                        break; 
        case "-":  
        System.out.println("The result of the first integer subtracted from the second integer is "+subtract); 
                        break; 
        default:
        System.out.println("Illegal Operation"); 
        break; 
     }

        
        System.out.print ("Type 'n' or 'N' to stop."); 
        String stoper = myScanner.next();
        String n = "n";
        String N = "N"; 
        if ((stoper.equals(n)) || (stoper.equals(N))){
        stop = false;
        }
     }
}
}