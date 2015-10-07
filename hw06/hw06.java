//Nicholas Tulp 
//CSE002 - hw06
//10-06-2015
//Have a user input a number to create a pyramid of stars 
import java.util.Scanner;
public class hw06{
public static void main (String[]args){
	//Input size 
			Scanner scan = new Scanner(System.in);
			System.out.println("What size pyramid would you like to create?");
			//The size to store 
			int size = scan.nextInt();
			//The spacing of the program 
		     for(int i = 0; i < size; i++) {
		         for(int p = 0; p < size-i; p++) {
		             System.out.print(" ");
		         }
		        //Print stars of the pyramid based off of input value 
		        for(int q = 0 ; q <= i; q++) {
		            System.out.print(" *");
		        }
		        System.out.println();  
		    }
}
}