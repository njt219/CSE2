//Nicholas Tulp 
//CSE002 - lab08
//Practicing the use of different methods 
//October 15,2015 

import java.util.Scanner;
public class Methods{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        double numbers = scan.nextDouble();
        double x=0;
        double y=0;
        for (int i=1;i<=numbers ; i++){
        while ( numbers>0){
        System.out.println ("Please enter a number.");
        x=scan.nextDouble();
        break;
        }
        y+=x;
        }
    }
}

