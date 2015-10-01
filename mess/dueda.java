import java.util.Scanner;
public class dueda{
    
    public static void main (String[] args){
    Scanner myScanner = new Scanner  (System.in); 
    System.out.println("Please enter a number : "); 
    double number = myScanner.nextDouble(); 
    while ( number == number)
    {
        
        if ( number%5 == 0 ){
        break; 
        }
    System.out.println("Please enter a number : "); 
    number = myScanner.nextInt(); 
    }
    }
}
