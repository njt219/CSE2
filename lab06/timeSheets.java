// Nicholas Tulp 
// CSE002 - lab06 
// Program to keep track of wage and hours worked 
// October 1st, 2015 

import java.util.Scanner;
public class timeSheets{ 
    public static void main(String[] args){
     Scanner myScanner = new Scanner ( System.in );
     System.out.println (" Please enter a non-negative number to represent the number of workers"); // welcome message
     double number_of_workers = myScanner.nextDouble(); 
     double salaryOne= 0.0;
     double salary = 0.0;
 for (int i=1; number_of_workers>=i; i++){
     while ( number_of_workers>0){
     System.out.println ("Please enter the pay per hour for the employee in cents");
     double pay = myScanner.nextDouble(); 
     System.out.println ("How many hours did this employee work on monday"); 
     double monday = myScanner.nextDouble(); 
     System.out.println ("How many hours did the employee work on tuesday");
     double tuesday = myScanner.nextDouble(); 
     System.out.println ("How many hours did the employee work on wednesday");
     double wednesday = myScanner.nextDouble(); 
     System.out.println ("How many hours did the employee work on thursday");
     double thursday = myScanner.nextDouble();
     System.out.println ("How many hours did the employee work on friday");
     double friday = myScanner.nextDouble();
     salaryOne = pay * ( monday + tuesday + wednesday + thursday + friday); 
     break;
     }
     salary += salaryOne;
     
     }
     System.out.print ("The total salary for all employees is "+salary+"cents. ");
     
     
    }
}
        