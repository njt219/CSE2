import java.util.Scanner;
public class dueda{
    public static void main (String[] args){
    Scanner myScanner = new Scanner  (System.in); 
    System.out.println("Welcome to the guessing game"); 
    double x = 75; 
    System.out.print("Please enter a number between 1-100: "); 
    double guess_1 = myScanner.nextDouble();
    boolean win = false; 
    while (win==false) {
        if (guess_1 == x){
        System.out.println("You guessed it!");
        break; 
        }
            else if(guess_1 < x) {
            System.out.println("Your guess is less than the number.");
            break;
        }
                else if(guess_1 > x) {
                System.out.println("Your guess is greater than the number.");
                break;
        }
    }
    }
}