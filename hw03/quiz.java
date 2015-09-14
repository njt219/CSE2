import java.util.Scanner;
public class quiz {
    public static void main (String[] args){
        Scanner myScanner = new Scanner (System.in); 
        System.out.print ("Enter the first number : "); 
        double first_number = myScanner.nextDouble();
        System.out.print ("Enter the second number : "); 
        double second_number = myScanner.nextDouble();
        System.out.print ("Enter the third number : ");
        double third_number = myScanner.nextDouble(); 
        double average_of_numbers = ((first_number + second_number + third_number ) / 3); 
        System.out.println ("The average of the three numbers is : "+average_of_numbers); 
    }
}
