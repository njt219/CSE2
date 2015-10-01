///////////////////////////////////////////////////////////////////////////////
//Nicholas Tulp
//09 - 03 - 2015
//cse002 - lab02

//In this program we will be printing the number of minutes, counts, and distance for two cyclometer trips.
//We will also print the distance of the two trips combined.

//introducing the public class
public class Cyclometer {
    //main method 
    public static void main(String[] args) {
        int secsTrip1=480; //The amount of seconds it took to complete the first trip. 
        int secsTrip2=3220; //The amount of seconds it took to complete the second trip.
        int countsTrip1=1561; //The number of rotations of the front wheel during the first trip. 
        int countsTrip2=9037; //The number of rotations of the front wheel during the second trip.
        
        double wheelDiameter=27.0; //The diamter of the wheel.
        double PI=3.14159;
        double feetPerMile=5280; 
        double inchesPerFoot=12; 
        double secondsPerMinute=60; 
        double distanceTrip1, distanceTrip2, totalDistance; // Using a double, we establish that the values for these variables will have decimals.
        
        //printing the information for trip 1 
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+"minutes and had "+(countsTrip1+" counts."));
        //printing the information for trip 2 
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+"minutes and had "+(countsTrip2+" counts.")); 
        
        //below gives distance in inches
        distanceTrip1=countsTrip1*wheelDiameter*PI; 
        //for each count, a rotation of the wheel travels the diameter in inches times PI
        distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //printing the data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }//end of main method
}//end of public class

        
        
        
