//Nicholas Tulp
//lab04 - CSE002
//Calculator program using the switch statement
//09-17-15
import java.util.Scanner;
public class Calculator{ 
    public static void main(String[] args){
     Scanner myScanner = new Scanner ( System.in );
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
}
}