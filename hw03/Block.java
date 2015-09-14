// Nicholas Tulp
// hw03
// A program that calculates the volume of the block and surface area. 
// September 15, 2015
import java.util.Scanner; // introducing the scanner tool 

public class Block { // introduce public class
    public static void main(String[] args) { // introduce main method 
        Scanner myScanner = new Scanner ( System.in ) ; // introducing the scanner constructor 
        System.out.print ("Enter the length of the block: "); // print statement asking for the length
        double inputLength = myScanner.nextDouble(); // lets the scanner know the length
        System.out.print ("Enter the width of the block: "); // print statement asking for the width
        double inputWidth = myScanner.nextDouble(); // lets the scanner know the width
        System.out.print ("Enter the height of the block: "); // print statement asking for the height
        double inputHeight = myScanner.nextDouble(); // lets the scanner know the height
        double volume = inputLength*inputWidth*inputHeight ; // volume formula is length * width * height
        System.out.println("The volume of the block of dimensions "+inputLength+" x "+inputWidth+" x "+inputHeight+" is "+volume+"."); // the final print statement for volume
        
        // finding the surface area of a rectangular prism 
        double area_of_sides = inputLength * inputHeight * 2 ; // find the area of two sides 
        double area_of_adjacent_sides = inputWidth * inputHeight * 2 ; // find the area of adjacent sides
        double area_of_ends = inputLength * inputWidth * 2 ; // find the area of ends
        double surface_area = area_of_sides + area_of_adjacent_sides + area_of_ends; // add the three areas for the surface area
        System.out.println("The surface area of the block is "+surface_area+"."); // print statement for the surface area
        
    } // closing main method 
} // closing public class