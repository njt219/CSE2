//Nicholas Tulp
//CSE002 - hw08
//10-27-2015
//make diffferent areas to compute areas 

import java.util.Scanner; //introduce scanner 
public class areas{ 
    public static double area(double radius){ //area method for circle
        double areaC = Math.PI*(radius*radius); //formula to find area
        return areaC;
        }
    public static int area(int length, int width){ //area method for rectangle 
        int areaR = length*width; //formula to find area 
        return areaR;
        }
    public static int area(int firstBase, int secondBase, int height){ //area method for trapezoid
        int areaT = ((firstBase + secondBase)/2)*height; //formula to find area 
        return areaT;
    }
    public static void main (String[] args){ // main method for inputs from user 
        Scanner scan = new Scanner(System.in); //declaring scanner 
        int run = 1;
        int runner = 1;
        while(run == runner){
        System.out.println("Would you like to make a shape? 1 for yes, 2 for no.");
        int answer = scan.nextInt(); //value for answer to print statement 
        if(answer == 2){ //ending it if they say no
            break;
        }
        System.out.println("Enter 1, for area of a circle.");
        System.out.println("Enter 2, for area of a rectangle.");
        System.out.println("Enter 3, for area of a trapezoid.");
        int decider = scan.nextInt();
        if(decider == 1){
            System.out.println("Enter the radius of the circle."); //asking for dimensions of shape they want area for 
            int radi = scan.nextInt();
            double ans1 = area(radi);
            System.out.println("The answer is " + ans1);
        }else if(decider == 2){
            System.out.println("Enter the length."); //asking for dimensions of shape they want area for 
            int length = scan.nextInt();
            System.out.println("Enter the width.");//asking for dimensions of shape they want area for 
            int width = scan.nextInt();
            int ans2 = area(length, width);
            System.out.println("The answer is " + ans2);
        }else if(decider == 3){
            System.out.println("Enter the first base.");//asking for dimensions of shape they want area for 
            int b1 = scan.nextInt();
            System.out.println("Enter the second base.");//asking for dimensions of shape they want area for 
            int b2 = scan.nextInt();
            System.out.println("Enter the height.");//asking for dimensions of shape they want area for 
            int ht = scan.nextInt();
            int ans3 = area(b1, b2, ht);
            System.out.println("The answer is " + ans3);//answer print statement 
        }
        }
    }
}
    
        