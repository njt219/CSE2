import java.util.Scanner;
public class test{ 
    public static void main(String[] args){
     Scanner myScanner = new Scanner ( System.in );
     System.out.println ("Please enter the first numbers : ");
     int first_integer = myScanner.nextInt(); 
     System.out.println ("Please enter the second numbers : "); 
     int second_integer = myScanner.nextInt(); 
     System.out.println ("Please enter the third numbers : "); 
     int third_integer = myScanner.nextInt(); 
     
     if(first_integer < second_integer && first_integer < third_integer){
         System.out.print("The smallest value of the three numbers is "+first_integer); 
     
        } else if( second_integer < first_integer && second_integer < third_integer){
            System.out.print("The smallest value of the three number is "+second_integer); 
        
            } else if( third_integer < first_integer && third_integer < second_integer){
            System.out.print("The smallest value of the three number is "+third_integer); 
            }
        }
     }
     